package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1671dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C1671dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
