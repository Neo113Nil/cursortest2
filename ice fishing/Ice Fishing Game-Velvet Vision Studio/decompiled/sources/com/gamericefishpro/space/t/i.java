package com.gamericefishpro.space.t;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final float[] a;

    static {
        long[] jArr = p0.a;
        int iD = p0.d(0);
        int iMax = iD > 0 ? Math.max(7, p0.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            com.gamericefishpro.space.ph.u.k(jArr, -9187201950435737472L);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}
