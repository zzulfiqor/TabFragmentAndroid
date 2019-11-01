package com.zzulfiqor.myviewpager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES = new int[] {R.string.tab_1, R.string.tab_2};

    private final Context context;


    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getString(TAB_TITLES[position]);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            default:
                return new tab1();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
