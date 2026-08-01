package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1592cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C1003Ji A00;
    public final /* synthetic */ boolean A01;

    public C1592cg(C1003Ji c1003Ji, boolean z3) {
        this.A00 = c1003Ji;
        this.A01 = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z3;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        C1003Ji c1003Ji = this.A00;
        z3 = this.A00.A0D;
        c1003Ji.A0t(z3, true);
        if (!this.A01) {
            m32 = this.A00.A08;
            if (m32 != null) {
                m33 = this.A00.A08;
                m33.destroy();
            }
        }
    }
}
