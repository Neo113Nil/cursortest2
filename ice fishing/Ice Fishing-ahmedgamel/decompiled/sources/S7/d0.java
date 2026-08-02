package S7;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d0 extends C0393g {

    /* renamed from: B, reason: collision with root package name */
    public final C0399m f3032B;

    public d0(InterfaceC5240d interfaceC5240d, C0399m c0399m) {
        super(1, interfaceC5240d);
        this.f3032B = c0399m;
    }

    @Override // S7.C0393g
    public final Throwable p(h0 h0Var) {
        Throwable b9;
        Object C8 = this.f3032B.C();
        return (!(C8 instanceof f0) || (b9 = ((f0) C8).b()) == null) ? C8 instanceof C0402p ? ((C0402p) C8).f3066a : h0Var.w() : b9;
    }

    @Override // S7.C0393g
    public final String x() {
        return "AwaitContinuation";
    }
}
