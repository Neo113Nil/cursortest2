package com.google.android.material.motion;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimationUtils;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper {
    public final float maxScaleXDistance;
    public final float maxScaleYDistance;

    public MaterialBottomContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet createResetScaleAnimator() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.view;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new FastOutSlowInInterpolator(0));
        return animatorSet;
    }

    public final void updateBackProgress(float f) {
        float interpolation = this.progressInterpolator.getInterpolation(f);
        View view = this.view;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= RecyclerView.DECELERATION_RATE || height <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        float f2 = this.maxScaleXDistance / width;
        float f3 = this.maxScaleYDistance / height;
        float lerp = 1.0f - AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, f2, interpolation);
        float lerp2 = 1.0f - AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, f3, interpolation);
        if (Float.isNaN(lerp) || Float.isNaN(lerp2)) {
            return;
        }
        view.setScaleX(lerp);
        view.setPivotY(height);
        view.setScaleY(lerp2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(lerp2 != RecyclerView.DECELERATION_RATE ? lerp / lerp2 : 1.0f);
            }
        }
    }
}
