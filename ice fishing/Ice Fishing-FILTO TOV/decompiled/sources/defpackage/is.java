package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class is {
    public static final float[] GWasM1elztuh;

    static {
        long[] jArr = kx0.GWasM1elztuh;
        int xqGvceK5x = kx0.xqGvceK5x(0);
        int max = xqGvceK5x > 0 ? Math.max(7, kx0.X1lG3V04pd(xqGvceK5x)) : 0;
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
        GWasM1elztuh = new float[0];
    }
}
