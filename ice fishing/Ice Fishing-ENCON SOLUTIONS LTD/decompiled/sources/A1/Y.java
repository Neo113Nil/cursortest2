package A1;

import h1.C0239i;

/* loaded from: classes.dex */
public final class Y extends W {

    /* renamed from: e, reason: collision with root package name */
    public final b0 f24e;

    /* renamed from: f, reason: collision with root package name */
    public final Z f25f;

    /* renamed from: g, reason: collision with root package name */
    public final C0009j f26g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f27h;

    public Y(b0 b0Var, Z z2, C0009j c0009j, Object obj) {
        this.f24e = b0Var;
        this.f25f = z2;
        this.f26g = c0009j;
        this.f27h = obj;
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return C0239i.f3393a;
    }

    @Override // A1.W
    public final void k(Throwable th) {
        C0009j c0009j = this.f26g;
        b0 b0Var = this.f24e;
        b0Var.getClass();
        C0009j L2 = b0.L(c0009j);
        Z z2 = this.f25f;
        Object obj = this.f27h;
        if (L2 != null) {
            while (AbstractC0022x.e(L2.f51e, false, new Y(b0Var, z2, L2, obj), 1) == d0.f43a) {
                L2 = b0.L(L2);
                if (L2 == null) {
                }
            }
            return;
        }
        b0Var.p(b0Var.y(z2, obj));
    }
}
