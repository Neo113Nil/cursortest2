package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class ajc {
    public static final float[] a;

    static {
        long[] jArr = vso.a;
        int e = vso.e(0);
        int max = e > 0 ? Math.max(7, vso.d(e)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
        a = new float[0];
    }
}
