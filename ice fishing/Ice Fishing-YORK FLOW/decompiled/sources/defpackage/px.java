package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class px {
    public static final float[] ZpBGe2uQfcn8;

    static {
        long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
        int JhCgjQRTAOCT = defpackage.m81.JhCgjQRTAOCT(0);
        int max = JhCgjQRTAOCT > 0 ? java.lang.Math.max(7, defpackage.m81.fWTAfUmVKrZq(JhCgjQRTAOCT)) : 0;
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
        ZpBGe2uQfcn8 = new float[0];
    }
}
