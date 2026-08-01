package com.lumenpath.harispro.hrnavigator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lumenpath.harispro.hrnavigator.R;
import h0.f;

/* loaded from: classes.dex */
public final class ActivityMainBinding {
    public final BottomNavigationView bottomNavigation;
    public final FragmentContainerView navHostFragment;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.bottomNavigation = bottomNavigationView;
        this.navHostFragment = fragmentContainerView;
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.bottomNavigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) f.k(view, R.id.bottomNavigation);
        if (bottomNavigationView != null) {
            i = R.id.nav_host_fragment;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) f.k(view, R.id.nav_host_fragment);
            if (fragmentContainerView != null) {
                return new ActivityMainBinding((ConstraintLayout) view, bottomNavigationView, fragmentContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
