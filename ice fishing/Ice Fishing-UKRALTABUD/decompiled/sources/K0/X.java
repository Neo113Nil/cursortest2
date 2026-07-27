package K0;

/* loaded from: classes.dex */
public final class X extends V {

    /* renamed from: j, reason: collision with root package name */
    public final a0 f485j;

    /* renamed from: k, reason: collision with root package name */
    public final Y f486k;

    /* renamed from: l, reason: collision with root package name */
    public final C0034j f487l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f488m;

    public X(a0 a0Var, Y y2, C0034j c0034j, Object obj) {
        this.f485j = a0Var;
        this.f486k = y2;
        this.f487l = c0034j;
        this.f488m = obj;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return t0.g.f2989a;
    }

    @Override // K0.V
    public final void o(Throwable th) {
        C0034j c0034j = this.f487l;
        a0 a0Var = this.f485j;
        a0Var.getClass();
        C0034j M2 = a0.M(c0034j);
        Y y2 = this.f486k;
        Object obj = this.f488m;
        if (M2 != null) {
            while (AbstractC0046w.e(M2.f513j, false, new X(a0Var, y2, M2, obj), 1) == c0.f503f) {
                M2 = a0.M(M2);
                if (M2 == null) {
                }
            }
            return;
        }
        a0Var.q(a0Var.z(y2, obj));
    }
}
