package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1534bQ implements Animator.AnimatorListener {
    public final /* synthetic */ C1535bR A00;

    public C1534bQ(C1535bR c1535bR) {
        this.A00 = c1535bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RelativeLayout relativeLayout;
        C1860gi c1860gi;
        this.A00.A06();
        relativeLayout = this.A00.A05;
        YB.A0O(relativeLayout, 8);
        c1860gi = this.A00.A07;
        c1860gi.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = true;
    }
}
