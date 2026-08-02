package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1663dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5F A00;

    public C1663dV(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C0897Ek c0897Ek;
        C0897Ek c0897Ek2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c0897Ek = this.A00.A0b;
        c0897Ek.getLayoutParams().height = num.intValue();
        c0897Ek2 = this.A00.A0b;
        c0897Ek2.requestLayout();
    }
}
