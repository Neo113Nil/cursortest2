package O7;

/* renamed from: O7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0386k extends a0 implements InterfaceC0385j {

    /* renamed from: x, reason: collision with root package name */
    public final h0 f2611x;

    public C0386k(h0 h0Var) {
        this.f2611x = h0Var;
    }

    @Override // O7.InterfaceC0385j
    public final boolean a(Throwable th) {
        return h().s(th);
    }

    @Override // O7.c0
    public final void i(Throwable th) {
        this.f2611x.o(h());
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return q7.v.f40183a;
    }
}
