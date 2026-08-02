package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1533bP implements Animator.AnimatorListener {
    public final /* synthetic */ C1535bR A00;

    public C1533bP(C1535bR c1535bR) {
        this.A00 = c1535bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1860gi c1860gi;
        this.A00.A06();
        this.A00.A02 = true;
        c1860gi = this.A00.A07;
        c1860gi.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
