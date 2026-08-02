package com.google.android.material.motion;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper {
    public float[] expandedCornerRadii;
    public Rect initialHideFromClipBounds;
    public Rect initialHideToClipBounds;
    public float initialTouchY;
    public final float maxTranslationY;
    public final float minEdgeGap;

    public MaterialMainContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.minEdgeGap = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.maxTranslationY = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet createResetScaleAndTranslationAnimator(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.view;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, RecyclerView.DECELERATION_RATE), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, RecyclerView.DECELERATION_RATE));
        animatorSet.addListener(new Transition.AnonymousClass3(view, 8));
        return animatorSet;
    }

    public final float[] getExpandedCornerRadii() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.expandedCornerRadii == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.view).getRootWindowInsets()) == null) {
                fArr = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int radius = (i3 == 0 && i4 == 0 && (roundedCorner4 = rootWindowInsets.getRoundedCorner(0)) != null) ? roundedCorner4.getRadius() : 0;
                int i5 = width + i3;
                int radius2 = (i5 < i || i4 != 0 || (roundedCorner3 = rootWindowInsets.getRoundedCorner(1)) == null) ? 0 : roundedCorner3.getRadius();
                int radius3 = (i5 < i || i4 + height < i2 || (roundedCorner2 = rootWindowInsets.getRoundedCorner(2)) == null) ? 0 : roundedCorner2.getRadius();
                int radius4 = (i3 != 0 || i4 + height < i2 || (roundedCorner = rootWindowInsets.getRoundedCorner(3)) == null) ? 0 : roundedCorner.getRadius();
                float f = radius;
                float f2 = radius2;
                float f3 = radius3;
                float f4 = radius4;
                fArr = new float[]{f, f, f2, f2, f3, f3, f4, f4};
            }
            this.expandedCornerRadii = fArr;
        }
        return this.expandedCornerRadii;
    }
}
