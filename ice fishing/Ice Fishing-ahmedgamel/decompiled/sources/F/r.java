package F;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: k, reason: collision with root package name */
    public static final r f945k;

    /* renamed from: a, reason: collision with root package name */
    public final float f946a;

    /* renamed from: b, reason: collision with root package name */
    public final float f947b;

    /* renamed from: c, reason: collision with root package name */
    public final float f948c;

    /* renamed from: d, reason: collision with root package name */
    public final float f949d;

    /* renamed from: e, reason: collision with root package name */
    public final float f950e;

    /* renamed from: f, reason: collision with root package name */
    public final float f951f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f952g;

    /* renamed from: h, reason: collision with root package name */
    public final float f953h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f954j;

    static {
        float[] fArr = b.f910c;
        float l9 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f908a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f9 = fArr3[0] * f2;
        float f10 = fArr[1];
        float f11 = (fArr3[1] * f10) + f9;
        float f12 = fArr[2];
        float f13 = (fArr3[2] * f12) + f11;
        float[] fArr4 = fArr2[1];
        float f14 = (fArr4[2] * f12) + (fArr4[1] * f10) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f15 = (f12 * fArr5[2]) + (f10 * fArr5[1]) + (f2 * fArr5[0]);
        float f16 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-l9) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float f17 = 1.0f / ((5.0f * l9) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (0.1f * f19 * f19 * ((float) Math.cbrt(l9 * 5.0d))) + (f18 * l9);
        float l10 = b.l() / fArr[1];
        double d10 = l10;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f15) / 100.0d, 0.42d)};
        float f20 = fArr6[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr6[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[2];
        float[] fArr7 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        f945k = new r(l10, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f16, 1.0f, new float[]{(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public r(float f2, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f951f = f2;
        this.f946a = f9;
        this.f947b = f10;
        this.f948c = f11;
        this.f949d = f12;
        this.f950e = f13;
        this.f952g = fArr;
        this.f953h = f14;
        this.i = f15;
        this.f954j = f16;
    }
}
