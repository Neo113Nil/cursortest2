package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public l(double d10, double d11) {
        this.mAmplitude = d10;
        this.mFrequency = d11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) ((Math.cos(this.mFrequency * f10) * Math.pow(2.718281828459045d, (-f10) / this.mAmplitude) * (-1)) + 1);
    }
}
