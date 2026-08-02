package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1612cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C1023Ji A00;
    public final /* synthetic */ boolean A01;

    public C1612cg(C1023Ji c1023Ji, boolean z6) {
        this.A00 = c1023Ji;
        this.A01 = z6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z6;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        C1023Ji c1023Ji = this.A00;
        z6 = this.A00.A0D;
        c1023Ji.A0t(z6, true);
        if (!this.A01) {
            m32 = this.A00.A08;
            if (m32 != null) {
                m33 = this.A00.A08;
                m33.destroy();
            }
        }
    }
}
