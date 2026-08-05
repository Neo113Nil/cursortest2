package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mh0 {
    public static final mh0 k3x7lurq;
    public final float MdtA4re8;
    public final float NCTxEWno;
    public final float P7K7Inc8;
    public final float Qr9iLBAD;
    public final float VgvYg0wo;
    public final float[] b2ZJblxo;
    public final float eVhOlqcC;
    public final float jb9XjC4I;
    public final float qoPGr6Ce;
    public final float wxUZMvaN;

    static {
        float[] fArr = ej0.MdtA4re8;
        float TrssYQ34 = (float) ((ej0.TrssYQ34() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = ej0.qoPGr6Ce;
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
        float exp = (1.0f - (((float) Math.exp(((-TrssYQ34) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * TrssYQ34) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(TrssYQ34 * 5.0d))) + (f10 * TrssYQ34);
        float TrssYQ342 = ej0.TrssYQ34() / fArr[1];
        double d2 = TrssYQ342;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        k3x7lurq = new mh0(TrssYQ342, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, 0.69f, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public mh0(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.P7K7Inc8 = f;
        this.qoPGr6Ce = f2;
        this.NCTxEWno = f3;
        this.MdtA4re8 = f4;
        this.wxUZMvaN = f5;
        this.VgvYg0wo = f6;
        this.b2ZJblxo = fArr;
        this.Qr9iLBAD = f7;
        this.jb9XjC4I = f8;
        this.eVhOlqcC = f9;
    }
}
