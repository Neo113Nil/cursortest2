package S7;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d0 extends C0389g {

    /* renamed from: B, reason: collision with root package name */
    public final C0395m f2949B;

    public d0(InterfaceC5267d interfaceC5267d, C0395m c0395m) {
        super(1, interfaceC5267d);
        this.f2949B = c0395m;
    }

    @Override // S7.C0389g
    public final Throwable p(h0 h0Var) {
        Throwable b9;
        Object C8 = this.f2949B.C();
        return (!(C8 instanceof f0) || (b9 = ((f0) C8).b()) == null) ? C8 instanceof C0398p ? ((C0398p) C8).f2983a : h0Var.w() : b9;
    }

    @Override // S7.C0389g
    public final String x() {
        return "AwaitContinuation";
    }
}
