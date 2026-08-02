package defpackage;

/* loaded from: classes3.dex */
public final class mct {
    public final fu4 a;
    public final b9r b;
    public final t6k c;
    public final x6k d;
    public final t6k e;

    public mct(fu4 fu4Var) {
        b9r Q = weo.Q(0.0f, 400.0f, null, 5);
        fu4Var.getClass();
        this.a = fu4Var;
        this.b = Q;
        this.c = new t6k(Float.MAX_VALUE);
        this.d = szf.g0(new cma(0));
        this.e = new t6k(0.0f);
    }

    public final float a() {
        return Math.abs(this.e.e() / this.c.e());
    }

    public final void b(float f) {
        this.e.h(yhn.c(f, -this.c.e(), 0.0f));
    }
}
