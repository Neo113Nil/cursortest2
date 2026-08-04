package com.gamericefishpro.space.vd;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public k(double d, double d2) {
        this.mAmplitude = d;
        this.mFrequency = d2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) ((Math.cos(this.mFrequency * ((double) f)) * Math.pow(2.718281828459045d, ((double) (-f)) / this.mAmplitude) * ((double) (-1))) + ((double) 1));
    }
}
