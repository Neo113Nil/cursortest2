package A1;

/* loaded from: classes.dex */
public final class X extends C0005f {

    /* renamed from: i, reason: collision with root package name */
    public final C0011l f23i;

    public X(l1.d dVar, C0011l c0011l) {
        super(1, dVar);
        this.f23i = c0011l;
    }

    @Override // A1.C0005f
    public final Throwable s(b0 b0Var) {
        Throwable c2;
        Object D2 = this.f23i.D();
        return (!(D2 instanceof Z) || (c2 = ((Z) D2).c()) == null) ? D2 instanceof C0013n ? ((C0013n) D2).f62a : b0Var.z() : c2;
    }

    @Override // A1.C0005f
    public final String z() {
        return "AwaitContinuation";
    }
}
