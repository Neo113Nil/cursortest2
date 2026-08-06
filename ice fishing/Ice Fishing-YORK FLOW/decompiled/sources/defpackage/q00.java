package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class q00 {
    public static final java.lang.Object[] fWTAfUmVKrZq;
    public static final float[] ZpBGe2uQfcn8 = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile defpackage.rf1 giKS3J6vZuNy = new defpackage.rf1();

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        fWTAfUmVKrZq = objArr;
        synchronized (objArr) {
            giKS3J6vZuNy.JhCgjQRTAOCT(115, new defpackage.r00(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            giKS3J6vZuNy.JhCgjQRTAOCT(130, new defpackage.r00(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            giKS3J6vZuNy.JhCgjQRTAOCT(150, new defpackage.r00(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            giKS3J6vZuNy.JhCgjQRTAOCT(180, new defpackage.r00(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            giKS3J6vZuNy.JhCgjQRTAOCT(200, new defpackage.r00(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((giKS3J6vZuNy.fWTAfUmVKrZq(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        defpackage.g80.giKS3J6vZuNy("You should only apply non-linear scaling to font scales > 1");
    }

    public static defpackage.p00 ZpBGe2uQfcn8(float f) {
        float fWTAfUmVKrZq2;
        defpackage.p00 p00Var;
        float[] fArr = ZpBGe2uQfcn8;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        defpackage.p00 p00Var2 = (defpackage.p00) giKS3J6vZuNy.giKS3J6vZuNy(i);
        if (p00Var2 != null) {
            return p00Var2;
        }
        defpackage.rf1 rf1Var = giKS3J6vZuNy;
        if (rf1Var.WDYagTQQm9ns) {
            defpackage.i61.WDYagTQQm9ns(rf1Var);
        }
        int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(rf1Var.oh71FJcDz6S2, rf1Var.P05cfTpS5W5L, i);
        if (GE9mJIPrb8gP >= 0) {
            return (defpackage.p00) giKS3J6vZuNy.oh71FJcDz6S2(GE9mJIPrb8gP);
        }
        int i2 = -(GE9mJIPrb8gP + 1);
        int i3 = i2 - 1;
        if (i2 >= giKS3J6vZuNy.WDYagTQQm9ns()) {
            defpackage.r00 r00Var = new defpackage.r00(new float[]{1.0f}, new float[]{f});
            giKS3J6vZuNy(f, r00Var);
            return r00Var;
        }
        if (i3 < 0) {
            p00Var = new defpackage.r00(fArr, fArr);
            fWTAfUmVKrZq2 = 1.0f;
        } else {
            fWTAfUmVKrZq2 = giKS3J6vZuNy.fWTAfUmVKrZq(i3) / 100.0f;
            p00Var = (defpackage.p00) giKS3J6vZuNy.oh71FJcDz6S2(i3);
        }
        float fWTAfUmVKrZq3 = giKS3J6vZuNy.fWTAfUmVKrZq(i2) / 100.0f;
        float max = (java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, fWTAfUmVKrZq2 == fWTAfUmVKrZq3 ? 0.0f : (f - fWTAfUmVKrZq2) / (fWTAfUmVKrZq3 - fWTAfUmVKrZq2))) * 1.0f) + 0.0f;
        defpackage.p00 p00Var3 = (defpackage.p00) giKS3J6vZuNy.oh71FJcDz6S2(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float giKS3J6vZuNy2 = p00Var.giKS3J6vZuNy(f2);
            fArr2[i4] = ((p00Var3.giKS3J6vZuNy(f2) - giKS3J6vZuNy2) * max) + giKS3J6vZuNy2;
        }
        defpackage.r00 r00Var2 = new defpackage.r00(fArr, fArr2);
        giKS3J6vZuNy(f, r00Var2);
        return r00Var2;
    }

    public static void giKS3J6vZuNy(float f, defpackage.r00 r00Var) {
        synchronized (fWTAfUmVKrZq) {
            defpackage.rf1 clone = giKS3J6vZuNy.clone();
            clone.JhCgjQRTAOCT((int) (f * 100.0f), r00Var);
            giKS3J6vZuNy = clone;
        }
    }
}
