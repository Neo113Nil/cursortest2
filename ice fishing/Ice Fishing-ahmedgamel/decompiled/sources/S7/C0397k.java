package S7;

/* renamed from: S7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397k extends a0 implements InterfaceC0396j {

    /* renamed from: x, reason: collision with root package name */
    public final h0 f3058x;

    public C0397k(h0 h0Var) {
        this.f3058x = h0Var;
    }

    @Override // S7.InterfaceC0396j
    public final boolean a(Throwable th) {
        return h().s(th);
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        this.f3058x.o(h());
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41073a;
    }
}
