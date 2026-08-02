package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
public final class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final Object alphas;
    public final View fadeInView;
    public final View fadeOutView;

    public FadeThroughUpdateListener(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.$r8$classId = 0;
        this.fadeOutView = actionMenuView;
        this.fadeInView = actionMenuView2;
        this.alphas = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        View view = this.fadeInView;
        View view2 = this.fadeOutView;
        Object obj = this.alphas;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj;
                ViewUtils.calculateFadeOutAndInAlphas(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr);
                if (view2 != null) {
                    view2.setAlpha(fArr[0]);
                }
                if (view != null) {
                    view.setAlpha(fArr[1]);
                    break;
                }
                break;
            default:
                ((TabLayout.SlidingTabIndicator) obj).tweenIndicatorPosition(view2, view, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public FadeThroughUpdateListener(TabLayout.SlidingTabIndicator slidingTabIndicator, View view, View view2) {
        this.$r8$classId = 1;
        this.alphas = slidingTabIndicator;
        this.fadeOutView = view;
        this.fadeInView = view2;
    }
}
