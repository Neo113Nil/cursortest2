package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import androidx.recyclerview.widget.RecyclerView;
import sqip.internal.CardImage;

/* loaded from: classes4.dex */
public abstract class ViewUtilsLollipop {
    public static final int[] STATE_LIST_ANIM_ATTRS = {R.attr.stateListAnimator};

    public static void setDefaultAppBarLayoutStateListAnimator(AppBarLayout appBarLayout, float f) {
        int integer = appBarLayout.getResources().getInteger(com.squareup.cash.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.squareup.cash.R.attr.state_liftable, -com.squareup.cash.R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, CardImage.ELEVATION, RecyclerView.DECELERATION_RATE).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, CardImage.ELEVATION, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, CardImage.ELEVATION, RecyclerView.DECELERATION_RATE).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
