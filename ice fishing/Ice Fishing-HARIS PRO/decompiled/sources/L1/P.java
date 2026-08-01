package L1;

/* loaded from: classes.dex */
public final class P extends O {
    public final T e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f537f;

    /* renamed from: g, reason: collision with root package name */
    public final C0007h f538g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f539h;

    public P(T t2, Q q2, C0007h c0007h, Object obj) {
        this.e = t2;
        this.f537f = q2;
        this.f538g = c0007h;
        this.f539h = obj;
    }

    @Override // C1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return t1.i.f4388c;
    }

    @Override // L1.O
    public final void o(Throwable th) {
        C0007h c0007h = this.f538g;
        T t2 = this.e;
        t2.getClass();
        C0007h u2 = T.u(c0007h);
        Q q2 = this.f537f;
        Object obj = this.f539h;
        if (u2 != null) {
            while (AbstractC0018t.c(u2.e, false, new P(t2, q2, u2, obj), 1) == V.f549a) {
                u2 = T.u(u2);
                if (u2 == null) {
                }
            }
            return;
        }
        t2.m(q2, obj);
    }
}
