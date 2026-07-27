package L0;

import t0.C0252g;

/* renamed from: L0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052j extends T implements InterfaceC0051i {

    /* renamed from: i, reason: collision with root package name */
    public final a0 f661i;

    public C0052j(a0 a0Var) {
        this.f661i = a0Var;
    }

    @Override // L0.InterfaceC0051i
    public final boolean e(Throwable th) {
        return n().w(th);
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0252g.f2994a;
    }

    @Override // L0.V
    public final void o(Throwable th) {
        this.f661i.s(n());
    }
}
