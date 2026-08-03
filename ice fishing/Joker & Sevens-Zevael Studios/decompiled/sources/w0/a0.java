package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends g {

    /* renamed from: e, reason: collision with root package name */
    public final g f7538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7539f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7540g;

    /* renamed from: h, reason: collision with root package name */
    public oc.c f7541h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7542i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g gVar, oc.c cVar, boolean z10, boolean z11) {
        super(0L, k.f7570k);
        oc.c e10;
        nd.d dVar = m.f7578a;
        this.f7538e = gVar;
        this.f7539f = z10;
        this.f7540g = z11;
        this.f7541h = m.l(cVar, (gVar == null || (e10 = gVar.e()) == null) ? m.f7587j.f7544e : e10, z10);
        this.f7542i = u0.e.c();
    }

    @Override // w0.g
    public final void c() {
        g gVar;
        this.f7561c = true;
        if (!this.f7540g || (gVar = this.f7538e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // w0.g
    public final k d() {
        return v().d();
    }

    @Override // w0.g
    public final oc.c e() {
        return this.f7541h;
    }

    @Override // w0.g
    public final boolean f() {
        return v().f();
    }

    @Override // w0.g
    public final long g() {
        return v().g();
    }

    @Override // w0.g
    public final oc.c i() {
        return null;
    }

    @Override // w0.g
    public final void k() {
        r.k();
        throw null;
    }

    @Override // w0.g
    public final void l() {
        r.k();
        throw null;
    }

    @Override // w0.g
    public final void m() {
        v().m();
    }

    @Override // w0.g
    public final void n(v vVar) {
        v().n(vVar);
    }

    @Override // w0.g
    public final g u(oc.c cVar) {
        oc.c l10 = m.l(cVar, this.f7541h, true);
        return !this.f7539f ? m.h(v().u(null), l10, true) : v().u(l10);
    }

    public final g v() {
        g gVar = this.f7538e;
        return gVar == null ? m.f7587j : gVar;
    }
}
