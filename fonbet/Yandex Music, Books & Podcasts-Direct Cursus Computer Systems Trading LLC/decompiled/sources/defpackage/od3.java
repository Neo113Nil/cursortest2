package defpackage;

/* loaded from: classes3.dex */
public final class od3 extends h1b implements Cloneable {
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;

    @Override // defpackage.h1b
    public final void O(float f, float f2, float f3, xup xupVar) {
        float f4;
        float f5;
        float f6 = this.o;
        if (f6 == 0.0f) {
            xupVar.d(f, 0.0f);
            return;
        }
        float f7 = ((this.n * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.m;
        float f9 = f2 + this.q;
        float e = su4.e(1.0f, f3, f7, this.p * f3);
        if (e / f7 >= 1.0f) {
            xupVar.d(f, 0.0f);
            return;
        }
        float f10 = this.r;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = e;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float sqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - sqrt;
        float f15 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        xupVar.d(f14, 0.0f);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        xupVar.a(f17, 0.0f, f18, f19, 270.0f, degrees);
        if (z) {
            xupVar.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.n;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            xupVar.a(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f9 + f7;
            float f25 = this.n;
            xupVar.d(f24 - ((f25 / 2.0f) + f11), f25 + f11);
            float f26 = this.n;
            xupVar.a(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
        }
        xupVar.a(f15 - f8, 0.0f, f15 + f8, f19, 270.0f - degrees, degrees);
        xupVar.d(f, 0.0f);
    }

    public final void b0(float f) {
        if (f >= 0.0f) {
            this.p = f;
        } else {
            xq0.x("cradleVerticalOffset must be positive.");
        }
    }
}
