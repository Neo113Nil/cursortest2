package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1573cN extends AnimatorListenerAdapter {
    public final /* synthetic */ KE A00;
    public final /* synthetic */ boolean A01;

    public C1573cN(KE ke, boolean z3) {
        this.A00 = ke;
        this.A01 = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1589cd c1589cd;
        DZ dz;
        AbstractC2005jd abstractC2005jd;
        DZ dz2;
        DZ dz3;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        c1589cd = this.A00.A0K;
        c1589cd.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            m32 = this.A00.A0I;
            if (m32 != null) {
                m33 = this.A00.A0I;
                m33.destroy();
            }
        }
        dz = this.A00.A0g;
        if (dz != null) {
            abstractC2005jd = this.A00.A0E;
            if (!abstractC2005jd.A1i()) {
                dz3 = this.A00.A0g;
                dz3.setVisibility(this.A01 ? 8 : 0);
            } else {
                dz2 = this.A00.A0g;
                dz2.setVisibility(8);
            }
        }
    }
}
