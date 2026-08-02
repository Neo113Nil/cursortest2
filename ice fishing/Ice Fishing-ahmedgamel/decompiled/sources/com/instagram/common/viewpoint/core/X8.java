package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* loaded from: assets/audience_network/classes2.dex */
public final class X8 implements Interpolator {
    public final float A00;

    public X8(float f2) {
        this.A00 = f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        return (float) (1.0d - Math.pow(1.0f - f2, this.A00));
    }
}
