package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fx0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public float h;
    public float i;
    public final float[] j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;

    public fx0(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        float f8;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        float f9 = f5 - f3;
        float f10 = f6 - f4;
        float f11 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f10 > 0.0f : !(i != 5 || f10 >= 0.0f));
        float f12 = z2 ? -1.0f : 1.0f;
        this.m = f12;
        float f13 = 1 / (f2 - f);
        this.k = f13;
        float[] fArr = new float[101];
        this.j = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f9) < 0.001f || Math.abs(f10) < 0.001f) {
            float hypot = (float) Math.hypot(f10, f9);
            this.g = hypot;
            this.l = hypot * f13;
            this.q = f9 * f13;
            this.r = f10 * f13;
            this.n = Float.NaN;
            this.o = Float.NaN;
            z = true;
        } else {
            this.n = f9 * f12;
            this.o = f10 * (-f12);
            this.q = z2 ? f5 : f3;
            this.r = z2 ? f4 : f6;
            float f14 = f5 - f3;
            float f15 = f4 - f6;
            float[] fArr2 = bg3.a;
            int i4 = 90;
            float f16 = 90;
            float f17 = f15;
            float f18 = 0.0f;
            float f19 = 0.0f;
            int i5 = 1;
            while (true) {
                i2 = i3;
                f7 = f11;
                double radians = (float) Math.toRadians((i5 * 90.0d) / i4);
                float sin = ((float) Math.sin(radians)) * f14;
                float cos = ((float) Math.cos(radians)) * f15;
                float f20 = sin - f19;
                f8 = f16;
                f18 += (float) Math.hypot(f20, cos - f17);
                fArr2[i5] = f18;
                i4 = 90;
                if (i5 == 90) {
                    break;
                }
                i5++;
                f17 = cos;
                f16 = f8;
                f11 = f7;
                f19 = sin;
                i3 = i2;
            }
            this.g = f18;
            int i6 = i2;
            while (true) {
                fArr2[i6] = fArr2[i6] / f18;
                if (i6 == 90) {
                    break;
                } else {
                    i6++;
                }
            }
            int length = fArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                float f21 = i7 / 100.0f;
                int binarySearch = Arrays.binarySearch(fArr2, 0, 91, f21);
                if (binarySearch >= 0) {
                    fArr[i7] = binarySearch / f8;
                } else if (binarySearch == -1) {
                    fArr[i7] = f7;
                } else {
                    int i8 = -binarySearch;
                    int i9 = i8 - 2;
                    float f22 = i9;
                    float f23 = fArr2[i9];
                    fArr[i7] = (((f21 - f23) / (fArr2[i8 - 1] - f23)) + f22) / f8;
                }
            }
            this.l = this.g * this.k;
            z = z3;
        }
        this.p = z;
    }

    public final float a() {
        float f = this.n * this.i;
        return f * this.m * (this.l / ((float) Math.hypot(f, (-this.o) * this.h)));
    }

    public final float b() {
        float f = this.n * this.i;
        float f2 = (-this.o) * this.h;
        return f2 * this.m * (this.l / ((float) Math.hypot(f, f2)));
    }

    public final void c(float f) {
        float f2 = (this.m == -1.0f ? this.b - f : f - this.a) * this.k;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100;
                int i = (int) f4;
                float[] fArr = this.j;
                float f5 = fArr[i];
                f3 = su4.e(fArr[i + 1], f5, f4 - i, f5);
            }
        }
        double d = f3 * 1.5707964f;
        this.h = (float) Math.sin(d);
        this.i = (float) Math.cos(d);
    }
}
