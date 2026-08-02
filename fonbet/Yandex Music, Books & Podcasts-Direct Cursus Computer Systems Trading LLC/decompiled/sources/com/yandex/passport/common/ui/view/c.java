package com.yandex.passport.common.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bcu;

/* loaded from: classes4.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ LottieAnimationView a;
    public final /* synthetic */ long b;
    public final /* synthetic */ d c;

    public c(long j, LottieAnimationView lottieAnimationView, d dVar) {
        this.a = lottieAnimationView;
        this.b = j;
        this.c = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
        super.onAnimationRepeat(animator);
        LottieAnimationView lottieAnimationView = this.a;
        lottieAnimationView.getClass();
        lottieAnimationView.animate().alpha(0.0f).setDuration(500L);
        long j = this.b;
        bcu bcuVar = new bcu(j, lottieAnimationView, this.c);
        lottieAnimationView.postDelayed(bcuVar, j + 500);
        if (lottieAnimationView.isAttachedToWindow()) {
            lottieAnimationView.addOnAttachStateChangeListener(new b(lottieAnimationView, lottieAnimationView, bcuVar, 0));
        } else {
            lottieAnimationView.removeCallbacks(bcuVar);
        }
    }
}
