package com.gamericefishpro.space.r5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ j b;

    public i(j jVar) {
        this.b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        j jVar = this.b;
        if (((Float) jVar.u.getAnimatedValue()).floatValue() == 0.0f) {
            jVar.v = 0;
            jVar.f(0);
        } else {
            jVar.v = 2;
            jVar.n.invalidate();
        }
    }
}
