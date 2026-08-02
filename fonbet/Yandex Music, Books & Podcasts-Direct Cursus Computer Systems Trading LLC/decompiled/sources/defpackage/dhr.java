package defpackage;

/* loaded from: classes.dex */
public final class dhr extends lei {
    public final ehr a;
    public c9r b;
    public chr c;

    public dhr() {
        ehr ehrVar = new ehr();
        ehrVar.k = false;
        this.a = ehrVar;
        this.c = ehrVar;
    }

    @Override // defpackage.lei
    public final float a() {
        return this.c.a();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        ehr ehrVar = this.a;
        this.c = ehrVar;
        ehrVar.l = f;
        boolean z = f > f2;
        ehrVar.k = z;
        if (z) {
            ehrVar.d(-f3, f - f2, f5, f6, f4);
        } else {
            ehrVar.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
