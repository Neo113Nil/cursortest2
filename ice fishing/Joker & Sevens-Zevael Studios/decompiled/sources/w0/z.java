package w0;

import s.h0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f7626o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7627p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7628q;

    /* renamed from: r, reason: collision with root package name */
    public oc.c f7629r;

    /* renamed from: s, reason: collision with root package name */
    public oc.c f7630s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7631t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(c cVar, oc.c cVar2, oc.c cVar3, boolean z10, boolean z11) {
        super(0L, k.f7570k, m.l(cVar2, (cVar == null || (r0 = cVar.e()) == null) ? m.f7587j.f7544e : r0, z10), m.b(cVar3, (cVar == null || (r9 = cVar.i()) == null) ? m.f7587j.f7545f : r9));
        oc.c i10;
        oc.c e10;
        nd.d dVar = m.f7578a;
        this.f7626o = cVar;
        this.f7627p = z10;
        this.f7628q = z11;
        this.f7629r = this.f7544e;
        this.f7630s = this.f7545f;
        this.f7631t = u0.e.c();
    }

    @Override // w0.c
    public final void B(h0 h0Var) {
        r.k();
        throw null;
    }

    @Override // w0.c
    public final c C(oc.c cVar, oc.c cVar2) {
        oc.c l10 = m.l(cVar, this.f7629r, true);
        oc.c b2 = m.b(cVar2, this.f7630s);
        return !this.f7627p ? new z(D().C(null, b2), l10, b2, false, true) : D().C(l10, b2);
    }

    public final c D() {
        c cVar = this.f7626o;
        return cVar == null ? m.f7587j : cVar;
    }

    @Override // w0.c, w0.g
    public final void c() {
        c cVar;
        this.f7561c = true;
        if (!this.f7628q || (cVar = this.f7626o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // w0.g
    public final k d() {
        return D().d();
    }

    @Override // w0.c, w0.g
    public final oc.c e() {
        return this.f7629r;
    }

    @Override // w0.c, w0.g
    public final boolean f() {
        return D().f();
    }

    @Override // w0.g
    public final long g() {
        return D().g();
    }

    @Override // w0.c, w0.g
    public final int h() {
        return D().h();
    }

    @Override // w0.c, w0.g
    public final oc.c i() {
        return this.f7630s;
    }

    @Override // w0.c, w0.g
    public final void k() {
        r.k();
        throw null;
    }

    @Override // w0.c, w0.g
    public final void l() {
        r.k();
        throw null;
    }

    @Override // w0.c, w0.g
    public final void m() {
        D().m();
    }

    @Override // w0.c, w0.g
    public final void n(v vVar) {
        D().n(vVar);
    }

    @Override // w0.g
    public final void r(k kVar) {
        r.k();
        throw null;
    }

    @Override // w0.g
    public final void s(long j3) {
        r.k();
        throw null;
    }

    @Override // w0.c, w0.g
    public final void t(int i10) {
        D().t(i10);
    }

    @Override // w0.c, w0.g
    public final g u(oc.c cVar) {
        oc.c l10 = m.l(cVar, this.f7629r, true);
        return !this.f7627p ? m.h(D().u(null), l10, true) : D().u(l10);
    }

    @Override // w0.c
    public final r w() {
        return D().w();
    }

    @Override // w0.c
    public final h0 x() {
        return D().x();
    }

    @Override // w0.c
    /* renamed from: y */
    public final oc.c e() {
        return this.f7629r;
    }
}
