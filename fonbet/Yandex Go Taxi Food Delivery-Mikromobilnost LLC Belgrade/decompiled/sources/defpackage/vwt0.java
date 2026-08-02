package defpackage;

/* loaded from: classes5.dex */
public final class vwt0 {
    public float a;
    public float b = 0.0f;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public vwt0(boolean z, boolean z2, float f, float f2) {
        this.d = f2;
        this.e = f;
        this.f = z2;
        float f3 = (2.0f / (f + 2.0f)) * 1.0f;
        this.c = f3;
        this.a = z ? f3 : 0.0f;
    }

    public final float a(float f, float f2, float f3) {
        return (f * 2.0f) + ((((this.d + 0.2f) * (-f2)) / 1.0f) - (((this.e + 2.0f) * f3) / 1.0f));
    }

    public final float b(float f) {
        float f2 = this.f ? 1.0f : 0.0f;
        float f3 = f / 2.0f;
        float f4 = this.b;
        float a = a(f2, f4, this.a);
        float f5 = (a * f3) + this.b;
        float a2 = a(f2, f5, (f4 * f3) + this.a);
        float f6 = (a2 * f3) + this.b;
        float a3 = a(f2, f6, (f3 * f5) + this.a);
        float f7 = (a3 * f) + this.b;
        float a4 = a(f2, f7, (f6 * f) + this.a);
        float f8 = (((((f6 * 2.0f) + ((f5 * 2.0f) + f4)) + f7) * f) / 6.0f) + this.a;
        this.a = f8;
        this.b = (((((2.0f * a3) + ((a2 * 2.0f) + a)) + a4) * f) / 6.0f) + this.b;
        return f8;
    }
}
