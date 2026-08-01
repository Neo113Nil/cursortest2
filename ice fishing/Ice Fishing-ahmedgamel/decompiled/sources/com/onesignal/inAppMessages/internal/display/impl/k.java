package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class k implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public k(double d2, double d9) {
        this.mAmplitude = d2;
        this.mFrequency = d9;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        return (float) ((Math.cos(this.mFrequency * f3) * Math.pow(2.718281828459045d, (-f3) / this.mAmplitude) * (-1)) + 1);
    }
}
