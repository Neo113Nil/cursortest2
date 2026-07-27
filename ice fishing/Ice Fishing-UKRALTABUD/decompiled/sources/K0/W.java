package K0;

/* loaded from: classes.dex */
public final class W extends C0030f {

    /* renamed from: n, reason: collision with root package name */
    public final C0036l f484n;

    public W(v0.d dVar, C0036l c0036l) {
        super(1, dVar);
        this.f484n = c0036l;
    }

    @Override // K0.C0030f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // K0.C0030f
    public final Throwable t(a0 a0Var) {
        Throwable d2;
        Object E2 = this.f484n.E();
        return (!(E2 instanceof Y) || (d2 = ((Y) E2).d()) == null) ? E2 instanceof C0038n ? ((C0038n) E2).f523a : a0Var.A() : d2;
    }
}
