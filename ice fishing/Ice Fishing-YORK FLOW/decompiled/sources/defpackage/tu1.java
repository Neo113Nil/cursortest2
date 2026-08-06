package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tu1 {
    public static final defpackage.tu1 Ns0WNyEWdPsk;
    public final float GE9mJIPrb8gP;
    public final float JhCgjQRTAOCT;
    public final float P05cfTpS5W5L;
    public final float[] QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final float ZpBGe2uQfcn8;
    public final float e6mdH7fiFuta;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;
    public final float oh71FJcDz6S2;

    static {
        float[] fArr = defpackage.ma0.Ns0WNyEWdPsk;
        float zJPqDeoF0Os1 = (float) ((defpackage.ma0.zJPqDeoF0Os1() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = defpackage.ma0.e6mdH7fiFuta;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float exp = (1.0f - (((float) java.lang.Math.exp(((-zJPqDeoF0Os1) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * zJPqDeoF0Os1) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) java.lang.Math.cbrt(zJPqDeoF0Os1 * 5.0d))) + (f10 * zJPqDeoF0Os1);
        float zJPqDeoF0Os12 = defpackage.ma0.zJPqDeoF0Os1() / fArr[1];
        double d2 = zJPqDeoF0Os12;
        float sqrt = ((float) java.lang.Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) java.lang.Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) java.lang.Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        Ns0WNyEWdPsk = new defpackage.tu1(zJPqDeoF0Os12, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, 0.69f, 1.0f, fArr6, cbrt, (float) java.lang.Math.pow(cbrt, 0.25d), sqrt);
    }

    public tu1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.oh71FJcDz6S2 = f;
        this.ZpBGe2uQfcn8 = f2;
        this.giKS3J6vZuNy = f3;
        this.fWTAfUmVKrZq = f4;
        this.JhCgjQRTAOCT = f5;
        this.WDYagTQQm9ns = f6;
        this.QiMR8OkAhezm = fArr;
        this.P05cfTpS5W5L = f7;
        this.e6mdH7fiFuta = f8;
        this.GE9mJIPrb8gP = f9;
    }
}
