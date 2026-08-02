package defpackage;

import android.graphics.Color;

/* loaded from: classes10.dex */
public final class zl7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public zl7(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static zl7 a(int i) {
        vw31 vw31Var = vw31.k;
        float c = gp41.c(Color.red(i));
        float c2 = gp41.c(Color.green(i));
        float c3 = gp41.c(Color.blue(i));
        float[][] fArr = gp41.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * c3) + (fArr2[1] * c2) + (fArr2[0] * c);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * c3) + (fArr3[1] * c2) + (fArr3[0] * c);
        float[] fArr4 = fArr[2];
        float f3 = (c3 * fArr4[2]) + (c2 * fArr4[1]) + (c * fArr4[0]);
        float[][] fArr5 = gp41.a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = vw31Var.g;
        float f7 = vw31Var.i;
        float f8 = vw31Var.d;
        float f9 = vw31Var.a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = vw31Var.h;
        float pow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * vw31Var.b) / f9, f8 * vw31Var.j)) * 100.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, vw31Var.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * vw31Var.e) * vw31Var.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f20 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f7 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new zl7(atan2, pow5, pow4, f20, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static zl7 b(float f, float f2, float f3) {
        float f4 = vw31.k.d;
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((r0.i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new zl7(f3, f2, f, f5, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public static int e(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float cbrt;
        vw31 vw31Var = vw31.k;
        float f8 = f2;
        if (f8 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return gp41.b(f3);
        }
        float f9 = 0.0f;
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f10 = f8;
        float f11 = 0.0f;
        zl7 zl7Var = null;
        boolean z = true;
        while (Math.abs(f11 - f8) >= 0.4f) {
            float f12 = 1000.0f;
            float f13 = f9;
            float f14 = 1000.0f;
            float f15 = 100.0f;
            zl7 zl7Var2 = null;
            while (true) {
                f4 = f9;
                if (Math.abs(f13 - f15) <= 0.01f) {
                    f5 = min;
                    f6 = f10;
                    break;
                }
                float a = n.a(f15, f13, 2.0f, f13);
                int f16 = b(a, f10, min).f(vw31.k);
                float c = gp41.c(Color.red(f16));
                float c2 = gp41.c(Color.green(f16));
                float c3 = gp41.c(Color.blue(f16));
                float[] fArr = gp41.d[1];
                float f17 = ((c3 * fArr[2]) + ((c2 * fArr[1]) + (c * fArr[0]))) / 100.0f;
                if (f17 <= 0.008856452f) {
                    cbrt = f17 * 903.2963f;
                    f7 = a;
                } else {
                    f7 = a;
                    cbrt = (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                }
                float abs = Math.abs(f3 - cbrt);
                if (abs < 0.2f) {
                    zl7 a2 = a(f16);
                    zl7 b = b(a2.c, a2.b, min);
                    f5 = min;
                    float f18 = a2.d - b.d;
                    float f19 = a2.e - b.e;
                    float f20 = a2.f - b.f;
                    double sqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                    f6 = f10;
                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                    if (pow <= 1.0f) {
                        f14 = pow;
                        f12 = abs;
                        zl7Var2 = a2;
                    }
                } else {
                    f5 = min;
                    f6 = f10;
                }
                if (f12 == f4 && f14 == f4) {
                    break;
                }
                if (cbrt < f3) {
                    f13 = f7;
                } else {
                    f15 = f7;
                }
                f10 = f6;
                f9 = f4;
                min = f5;
            }
            if (!z) {
                if (zl7Var2 == null) {
                    f8 = f6;
                } else {
                    f11 = f6;
                    zl7Var = zl7Var2;
                }
                f10 = n.a(f8, f11, 2.0f, f11);
            } else {
                if (zl7Var2 != null) {
                    return zl7Var2.f(vw31Var);
                }
                f10 = n.a(f8, f11, 2.0f, f11);
                z = false;
            }
            f9 = f4;
            min = f5;
        }
        return zl7Var == null ? gp41.b(f3) : zl7Var.f(vw31Var);
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.a;
    }

    public final int f(vw31 vw31Var) {
        float f;
        float f2 = this.b;
        double d = f2;
        float f3 = this.c;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float f4 = vw31Var.f;
                float f5 = vw31Var.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d3 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = vw31Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / vw31Var.d) / vw31Var.j));
                float f6 = cos * 3846.1538f * vw31Var.e * vw31Var.c;
                float f7 = pow2 / vw31Var.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float a = b64.a(f10, 261.0f, f11 - (891.0f * f9), 1403.0f);
                float a2 = b64.a(f10, 6300.0f, f11 - (f9 * 220.0f), 1403.0f);
                float f13 = 100.0f / f5;
                float signum = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum2 = Math.signum(a) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a) * 27.13d) / (400.0d - Math.abs(a))), 2.380952380952381d));
                float signum3 = Math.signum(a2) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a2) * 27.13d) / (400.0d - Math.abs(a2))), 2.380952380952381d));
                float[] fArr = vw31Var.g;
                float f14 = signum / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = gp41.b;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return lhc.a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f = 0.0f;
        float f42 = vw31Var.f;
        float f52 = vw31Var.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d32 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = vw31Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / vw31Var.d) / vw31Var.j));
        float f62 = cos3 * 3846.1538f * vw31Var.e * vw31Var.c;
        float f72 = pow22 / vw31Var.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f82 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float a3 = b64.a(f102, 261.0f, f112 - (891.0f * f92), 1403.0f);
        float a22 = b64.a(f102, 6300.0f, f112 - (f92 * 220.0f), 1403.0f);
        float f132 = 100.0f / f52;
        float signum4 = Math.signum(f122) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum22 = Math.signum(a3) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a3) * 27.13d) / (400.0d - Math.abs(a3))), 2.380952380952381d));
        float signum32 = Math.signum(a22) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(a22) * 27.13d) / (400.0d - Math.abs(a22))), 2.380952380952381d));
        float[] fArr6 = vw31Var.g;
        float f142 = signum4 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = gp41.b;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return lhc.a(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
