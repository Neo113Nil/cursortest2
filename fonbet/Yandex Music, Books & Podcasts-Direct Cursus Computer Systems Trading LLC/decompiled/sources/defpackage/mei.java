package defpackage;

/* loaded from: classes.dex */
public final class mei extends lei {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c;
    public final /* synthetic */ rei d;

    public mei(rei reiVar) {
        this.d = reiVar;
    }

    @Override // defpackage.lei
    public final float a() {
        return this.d.t;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        float f3 = this.c;
        rei reiVar = this.d;
        if (f2 > 0.0f) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            reiVar.t = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        reiVar.t = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
    }
}
