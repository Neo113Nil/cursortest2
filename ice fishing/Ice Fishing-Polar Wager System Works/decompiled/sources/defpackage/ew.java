package defpackage;

/* loaded from: classes.dex */
public abstract class ew {
    public static final float[] IHQe1A4L2xu;

    static {
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        int F7NU4MC0GW = defpackage.z41.F7NU4MC0GW(0);
        int max = F7NU4MC0GW > 0 ? java.lang.Math.max(7, defpackage.z41.r1MBDhnF(F7NU4MC0GW)) : 0;
        if (max != 0) {
            int i = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i];
            java.util.Arrays.fill(jArr2, 0, i, -9187201950435737472L);
            jArr = jArr2;
        }
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        float[] fArr = new float[max];
        IHQe1A4L2xu = new float[0];
    }
}
