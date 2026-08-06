package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bt0 extends defpackage.xf {
    public static final float[] JhCgjQRTAOCT;
    public static final float[] QiMR8OkAhezm;
    public static final float[] WDYagTQQm9ns;
    public static final float[] oh71FJcDz6S2;

    static {
        float[] dG7RjM6DqYVL = defpackage.i61.dG7RjM6DqYVL(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, defpackage.i61.fNwYGHIYeJcR(defpackage.ARgw6UjYb9W7.fWTAfUmVKrZq.giKS3J6vZuNy, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        JhCgjQRTAOCT = dG7RjM6DqYVL;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        WDYagTQQm9ns = fArr;
        oh71FJcDz6S2 = defpackage.i61.IJ0hOnjhPOri(dG7RjM6DqYVL);
        QiMR8OkAhezm = defpackage.i61.IJ0hOnjhPOri(fArr);
    }

    @Override // defpackage.xf
    public final long JhCgjQRTAOCT(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = QiMR8OkAhezm;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = oh71FJcDz6S2;
        return (java.lang.Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8))) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8)));
    }

    @Override // defpackage.xf
    public final float WDYagTQQm9ns(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = QiMR8OkAhezm;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = oh71FJcDz6S2;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // defpackage.xf
    public final float ZpBGe2uQfcn8(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.xf
    public final float giKS3J6vZuNy(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.xf
    public final long oh71FJcDz6S2(float f, float f2, float f3, float f4, defpackage.xf xfVar) {
        float[] fArr = JhCgjQRTAOCT;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float T1fB7bDYiVJQ = defpackage.t80.T1fB7bDYiVJQ(f5);
        float T1fB7bDYiVJQ2 = defpackage.t80.T1fB7bDYiVJQ(f6);
        float T1fB7bDYiVJQ3 = defpackage.t80.T1fB7bDYiVJQ(f7);
        float[] fArr2 = WDYagTQQm9ns;
        return defpackage.ok0.fWTAfUmVKrZq((fArr2[6] * T1fB7bDYiVJQ3) + (fArr2[3] * T1fB7bDYiVJQ2) + (fArr2[0] * T1fB7bDYiVJQ), (fArr2[7] * T1fB7bDYiVJQ3) + (fArr2[4] * T1fB7bDYiVJQ2) + (fArr2[1] * T1fB7bDYiVJQ), (fArr2[8] * T1fB7bDYiVJQ3) + (fArr2[5] * T1fB7bDYiVJQ2) + (fArr2[2] * T1fB7bDYiVJQ), f4, xfVar);
    }
}
