package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
final class e implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.z f7671a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7672b;

    /* renamed from: c, reason: collision with root package name */
    private y f7673c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.k.n f7674d;

    public interface a {
        void a(v vVar);
    }

    public e(a aVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f7672b = aVar;
        this.f7671a = new com.anythink.basead.exoplayer.k.z(cVar);
    }

    private void f() {
        this.f7671a.a(this.f7674d.d());
        v e9 = this.f7674d.e();
        if (e9.equals(this.f7671a.e())) {
            return;
        }
        this.f7671a.a(e9);
        this.f7672b.a(e9);
    }

    private boolean g() {
        y yVar = this.f7673c;
        if (yVar == null || yVar.v()) {
            return false;
        }
        return this.f7673c.u() || !this.f7673c.g();
    }

    public final void a() {
        this.f7671a.a();
    }

    public final void b() {
        this.f7671a.b();
    }

    public final long c() {
        if (!g()) {
            return this.f7671a.d();
        }
        f();
        return this.f7674d.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        return g() ? this.f7674d.d() : this.f7671a.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        com.anythink.basead.exoplayer.k.n nVar = this.f7674d;
        return nVar != null ? nVar.e() : this.f7671a.e();
    }

    public final void a(long j6) {
        this.f7671a.a(j6);
    }

    public final void b(y yVar) {
        if (yVar == this.f7673c) {
            this.f7674d = null;
            this.f7673c = null;
        }
    }

    public final void a(y yVar) {
        com.anythink.basead.exoplayer.k.n nVar;
        com.anythink.basead.exoplayer.k.n c9 = yVar.c();
        if (c9 == null || c9 == (nVar = this.f7674d)) {
            return;
        }
        if (nVar == null) {
            this.f7674d = c9;
            this.f7673c = yVar;
            c9.a(this.f7671a.e());
            f();
            return;
        }
        throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        com.anythink.basead.exoplayer.k.n nVar = this.f7674d;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.f7671a.a(vVar);
        this.f7672b.a(vVar);
        return vVar;
    }
}
