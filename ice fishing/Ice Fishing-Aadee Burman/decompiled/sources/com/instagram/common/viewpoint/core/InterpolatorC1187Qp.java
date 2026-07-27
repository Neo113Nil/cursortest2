package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class InterpolatorC1187Qp implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f9 = f3 - 1.0f;
        return (f9 * f9 * f9 * f9 * f9) + 1.0f;
    }
}
