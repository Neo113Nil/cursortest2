package v;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f6922s;

    /* renamed from: a, reason: collision with root package name */
    public final float f6923a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6924b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6925c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6926d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6927e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6928f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6929g;

    /* renamed from: h, reason: collision with root package name */
    public float f6930h;

    /* renamed from: i, reason: collision with root package name */
    public float f6931i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f6932j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6933k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6934l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6935m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6936n;

    /* renamed from: o, reason: collision with root package name */
    public final float f6937o;

    /* renamed from: p, reason: collision with root package name */
    public final float f6938p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6939q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6940r;

    public p(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        float f17;
        float f18 = f12;
        this.f6923a = f10;
        this.f6924b = f11;
        this.f6925c = f18;
        this.f6926d = f13;
        this.f6927e = f14;
        this.f6928f = f15;
        float f19 = f14 - f18;
        float f20 = f15 - f13;
        float f21 = 0.0f;
        boolean z11 = true;
        boolean z12 = i10 == 1 || (i10 == 4 ? f20 > 0.0f : !(i10 != 5 || f20 >= 0.0f));
        this.f6939q = z12;
        float f22 = f11 - f10;
        float f23 = 1 / f22;
        this.f6933k = f23;
        boolean z13 = 3 == i10;
        if (z13 || Math.abs(f19) < 0.001f || Math.abs(f20) < 0.001f) {
            float hypot = (float) Math.hypot(f20, f19);
            this.f6929g = hypot;
            this.f6938p = hypot * f23;
            this.f6936n = f19 / f22;
            this.f6937o = f20 / f22;
            this.f6932j = new float[101];
            this.f6934l = Float.NaN;
            this.f6935m = Float.NaN;
            z10 = true;
        } else {
            float[] fArr = new float[101];
            this.f6932j = fArr;
            this.f6934l = (z12 ? -1 : 1) * f19;
            this.f6935m = f20 * (z12 ? 1 : -1);
            this.f6936n = z12 ? f14 : f18;
            this.f6937o = z12 ? f13 : f15;
            float f24 = f13 - f15;
            int length = u7.d.d().length;
            float f25 = 0.0f;
            float f26 = 0.0f;
            float f27 = 0.0f;
            int i11 = 0;
            while (i11 < length) {
                boolean z14 = z11;
                float f28 = f27;
                double radians = (float) Math.toRadians((i11 * 90.0d) / (u7.d.d().length - 1));
                float sin = ((float) Math.sin(radians)) * f19;
                float cos = ((float) Math.cos(radians)) * f24;
                if (i11 > 0) {
                    float f29 = f21;
                    double d10 = sin - f26;
                    float f30 = cos - f28;
                    f16 = f29;
                    f17 = sin;
                    f25 += (float) Math.hypot(d10, f30);
                    u7.d.d()[i11] = f25;
                } else {
                    f16 = f21;
                    f17 = sin;
                }
                i11++;
                f26 = f17;
                f21 = f16;
                f27 = cos;
                z11 = z14;
            }
            float f31 = f21;
            this.f6929g = f25;
            int length2 = u7.d.d().length;
            for (int i12 = 0; i12 < length2; i12++) {
                float[] d11 = u7.d.d();
                d11[i12] = d11[i12] / f25;
            }
            for (int i13 = 0; i13 < 101; i13++) {
                float f32 = i13 / 100;
                float[] d12 = u7.d.d();
                int binarySearch = Arrays.binarySearch(d12, 0, d12.length, f32);
                if (binarySearch >= 0) {
                    fArr[i13] = binarySearch / (u7.d.d().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i13] = f31;
                } else {
                    int i14 = -binarySearch;
                    int i15 = i14 - 2;
                    fArr[i13] = (((f32 - u7.d.d()[i15]) / (u7.d.d()[i14 - 1] - u7.d.d()[i15])) + i15) / (u7.d.d().length - 1);
                }
            }
            this.f6938p = this.f6929g * this.f6933k;
            z10 = z13;
        }
        this.f6940r = z10;
    }

    public final float a() {
        float f10 = this.f6934l * this.f6931i;
        float hypot = this.f6938p / ((float) Math.hypot(f10, (-this.f6935m) * this.f6930h));
        return this.f6939q ? (-f10) * hypot : f10 * hypot;
    }

    public final float b() {
        float f10 = this.f6934l * this.f6931i;
        float f11 = (-this.f6935m) * this.f6930h;
        float hypot = this.f6938p / ((float) Math.hypot(f10, f11));
        return this.f6939q ? (-f11) * hypot : f11 * hypot;
    }

    public final void c(float f10) {
        float f11 = (this.f6939q ? this.f6924b - f10 : f10 - this.f6923a) * this.f6933k;
        float f12 = 0.0f;
        if (f11 > 0.0f) {
            f12 = 1.0f;
            if (f11 < 1.0f) {
                float[] fArr = this.f6932j;
                float length = f11 * (fArr.length - 1);
                int i10 = (int) length;
                float f13 = fArr[i10];
                f12 = ((fArr[i10 + 1] - f13) * (length - i10)) + f13;
            }
        }
        double d10 = f12 * 1.5707964f;
        this.f6930h = (float) Math.sin(d10);
        this.f6931i = (float) Math.cos(d10);
    }
}
