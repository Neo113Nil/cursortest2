package F;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f902a;

    /* renamed from: b, reason: collision with root package name */
    public final float f903b;

    /* renamed from: c, reason: collision with root package name */
    public final float f904c;

    /* renamed from: d, reason: collision with root package name */
    public final float f905d;

    /* renamed from: e, reason: collision with root package name */
    public final float f906e;

    /* renamed from: f, reason: collision with root package name */
    public final float f907f;

    public a(float f2, float f9, float f10, float f11, float f12, float f13) {
        this.f902a = f2;
        this.f903b = f9;
        this.f904c = f10;
        this.f905d = f11;
        this.f906e = f12;
        this.f907f = f13;
    }

    public static a a(int i) {
        r rVar = r.f945k;
        float e9 = b.e(Color.red(i));
        float e10 = b.e(Color.green(i));
        float e11 = b.e(Color.blue(i));
        float[][] fArr = b.f911d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * e11) + (fArr2[1] * e10) + (fArr2[0] * e9);
        float[] fArr3 = fArr[1];
        float f9 = (fArr3[2] * e11) + (fArr3[1] * e10) + (fArr3[0] * e9);
        float[] fArr4 = fArr[2];
        float f10 = (e11 * fArr4[2]) + (e10 * fArr4[1]) + (e9 * fArr4[0]);
        float[][] fArr5 = b.f908a;
        float[] fArr6 = fArr5[0];
        float f11 = (fArr6[2] * f10) + (fArr6[1] * f9) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f12 = (fArr7[2] * f10) + (fArr7[1] * f9) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f13 = (f10 * fArr8[2]) + (f9 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = rVar.f952g;
        float f14 = fArr9[0] * f11;
        float f15 = fArr9[1] * f12;
        float f16 = fArr9[2] * f13;
        float abs = Math.abs(f14);
        float f17 = rVar.f953h;
        float pow = (float) Math.pow((abs * f17) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f15) * f17) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f16) * f17) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d9 = signum3;
        float f18 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d9)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d9 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float f25 = f22 * rVar.f947b;
        float f26 = rVar.f946a;
        float f27 = rVar.f949d;
        float pow4 = ((float) Math.pow(f25 / f26, rVar.f954j * f27)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f28 = f26 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, rVar.f951f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f23) < 20.14d ? f23 + 360.0f : f23) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * rVar.f950e) * rVar.f948c) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f29 = rVar.i * pow5;
        Math.sqrt((r3 * f27) / f28);
        float f30 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f29 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f24;
        return new a(f23, pow5, pow4, f30, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f2, float f9, float f10) {
        r rVar = r.f945k;
        float f11 = rVar.f949d;
        Math.sqrt(f2 / 100.0d);
        float f12 = rVar.f946a + 4.0f;
        float f13 = rVar.i * f9;
        Math.sqrt(((f9 / ((float) Math.sqrt(r1))) * rVar.f949d) / f12);
        float f14 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f13 * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f9, f2, f14, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public final int c(r rVar) {
        float f2;
        float f9 = this.f903b;
        double d9 = f9;
        float f10 = this.f904c;
        if (d9 != 0.0d) {
            double d10 = f10;
            if (d10 != 0.0d) {
                f2 = f9 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, rVar.f951f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f902a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = rVar.f946a * ((float) Math.pow(f10 / 100.0d, (1.0d / rVar.f949d) / rVar.f954j));
                float f11 = cos * 3846.1538f * rVar.f950e * rVar.f948c;
                float f12 = pow2 / rVar.f947b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f11 * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17)));
                float signum = Math.signum(f17);
                float f20 = 100.0f / rVar.f953h;
                float pow3 = signum * f20 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f18) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = Math.signum(f19) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float[] fArr = rVar.f952g;
                float f21 = pow3 / fArr[0];
                float f22 = signum2 / fArr[1];
                float f23 = signum3 / fArr[2];
                float[][] fArr2 = b.f909b;
                float[] fArr3 = fArr2[0];
                float f24 = (fArr3[2] * f23) + (fArr3[1] * f22) + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = (fArr4[2] * f23) + (fArr4[1] * f22) + (fArr4[0] * f21);
                float[] fArr5 = fArr2[2];
                return G.c.a(f24, f25, (f23 * fArr5[2]) + (f22 * fArr5[1]) + (f21 * fArr5[0]));
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(f2 / Math.pow(1.64d - Math.pow(0.29d, rVar.f951f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f902a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = rVar.f946a * ((float) Math.pow(f10 / 100.0d, (1.0d / rVar.f949d) / rVar.f954j));
        float f112 = cos3 * 3846.1538f * rVar.f950e * rVar.f948c;
        float f122 = pow22 / rVar.f947b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f112 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172)));
        float signum4 = Math.signum(f172);
        float f202 = 100.0f / rVar.f953h;
        float pow32 = signum4 * f202 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f182) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = Math.signum(f192) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float[] fArr6 = rVar.f952g;
        float f212 = pow32 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float f232 = signum32 / fArr6[2];
        float[][] fArr22 = b.f909b;
        float[] fArr32 = fArr22[0];
        float f242 = (fArr32[2] * f232) + (fArr32[1] * f222) + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = (fArr42[2] * f232) + (fArr42[1] * f222) + (fArr42[0] * f212);
        float[] fArr52 = fArr22[2];
        return G.c.a(f242, f252, (f232 * fArr52[2]) + (f222 * fArr52[1]) + (f212 * fArr52[0]));
    }
}
