package L0;

/* loaded from: classes.dex */
public final class W extends C0048f {

    /* renamed from: m, reason: collision with root package name */
    public final C0054l f632m;

    public W(v0.d dVar, C0054l c0054l) {
        super(1, dVar);
        this.f632m = c0054l;
    }

    @Override // L0.C0048f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // L0.C0048f
    public final Throwable t(a0 a0Var) {
        Throwable d2;
        Object E2 = this.f632m.E();
        return (!(E2 instanceof Y) || (d2 = ((Y) E2).d()) == null) ? E2 instanceof C0056n ? ((C0056n) E2).f671a : a0Var.A() : d2;
    }
}
