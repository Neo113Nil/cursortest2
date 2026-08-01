package S7;

/* renamed from: S7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0393k extends a0 implements InterfaceC0392j {

    /* renamed from: x, reason: collision with root package name */
    public final h0 f2975x;

    public C0393k(h0 h0Var) {
        this.f2975x = h0Var;
    }

    @Override // S7.InterfaceC0392j
    public final boolean a(Throwable th) {
        return h().s(th);
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        this.f2975x.o(h());
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41353a;
    }
}
