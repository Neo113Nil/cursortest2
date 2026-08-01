package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1644dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ boolean A01;

    public C1644dW(C5F c5f, boolean z3) {
        this.A00 = c5f;
        this.A01 = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1589cd c1589cd;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        c1589cd = this.A00.A0H;
        c1589cd.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01) {
            m32 = this.A00.A0G;
            if (m32 != null) {
                m33 = this.A00.A0G;
                m33.destroy();
            }
        }
    }
}
