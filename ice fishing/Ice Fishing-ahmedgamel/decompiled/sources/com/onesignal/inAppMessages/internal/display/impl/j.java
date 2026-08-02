package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes2.dex */
public final class j {
    public static final j INSTANCE = new j();

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateViewColor$lambda$0(View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.h.e(view, "$view");
        kotlin.jvm.internal.h.e(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.h.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f2, float f9, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        kotlin.jvm.internal.h.e(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f2, f9);
        translateAnimation.setDuration(i);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(View view, int i, int i4, int i6, Animator.AnimatorListener animatorListener) {
        kotlin.jvm.internal.h.e(view, "view");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(i);
        valueAnimator.setIntValues(i4, i6);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new J3.i(2, view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        kotlin.jvm.internal.h.e(view, "view");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
