package com.gamericefishpro.space.i2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface z1 {
    default float a() {
        return Float.MAX_VALUE;
    }

    float b();

    default long c() {
        float f = 48;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }
}
