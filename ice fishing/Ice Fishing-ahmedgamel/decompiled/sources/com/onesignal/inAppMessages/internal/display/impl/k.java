package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class k implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public k(double d9, double d10) {
        this.mAmplitude = d9;
        this.mFrequency = d10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return (float) ((Math.cos(this.mFrequency * f2) * Math.pow(2.718281828459045d, (-f2) / this.mAmplitude) * (-1)) + 1);
    }
}
