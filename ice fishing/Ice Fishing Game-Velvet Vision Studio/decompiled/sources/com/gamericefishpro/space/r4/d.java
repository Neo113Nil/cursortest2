package com.gamericefishpro.space.r4;

import com.gamericefishpro.space.v.m0;
import com.gamericefishpro.space.v.n0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public float a;
    public float b;

    public m0 a(float f) {
        double dB = b(f);
        double d = n0.a;
        double d2 = d - 1.0d;
        return new m0(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = com.gamericefishpro.space.v.b.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
