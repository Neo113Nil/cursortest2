package com.anythink.basead.exoplayer;

/* loaded from: classes.dex */
final class e implements com.anythink.basead.exoplayer.k.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.z f6885a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6886b;

    /* renamed from: c, reason: collision with root package name */
    private y f6887c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.basead.exoplayer.k.n f6888d;

    public interface a {
        void a(v vVar);
    }

    public e(a aVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f6886b = aVar;
        this.f6885a = new com.anythink.basead.exoplayer.k.z(cVar);
    }

    private void f() {
        this.f6885a.a(this.f6888d.d());
        v e9 = this.f6888d.e();
        if (e9.equals(this.f6885a.e())) {
            return;
        }
        this.f6885a.a(e9);
        this.f6886b.a(e9);
    }

    private boolean g() {
        y yVar = this.f6887c;
        if (yVar == null || yVar.v()) {
            return false;
        }
        return this.f6887c.u() || !this.f6887c.g();
    }

    public final void a() {
        this.f6885a.a();
    }

    public final void b() {
        this.f6885a.b();
    }

    public final long c() {
        if (!g()) {
            return this.f6885a.d();
        }
        f();
        return this.f6888d.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final long d() {
        return g() ? this.f6888d.d() : this.f6885a.d();
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v e() {
        com.anythink.basead.exoplayer.k.n nVar = this.f6888d;
        return nVar != null ? nVar.e() : this.f6885a.e();
    }

    public final void a(long j6) {
        this.f6885a.a(j6);
    }

    public final void b(y yVar) {
        if (yVar == this.f6887c) {
            this.f6888d = null;
            this.f6887c = null;
        }
    }

    public final void a(y yVar) {
        com.anythink.basead.exoplayer.k.n nVar;
        com.anythink.basead.exoplayer.k.n c9 = yVar.c();
        if (c9 == null || c9 == (nVar = this.f6888d)) {
            return;
        }
        if (nVar == null) {
            this.f6888d = c9;
            this.f6887c = yVar;
            c9.a(this.f6885a.e());
            f();
            return;
        }
        throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.anythink.basead.exoplayer.k.n
    public final v a(v vVar) {
        com.anythink.basead.exoplayer.k.n nVar = this.f6888d;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.f6885a.a(vVar);
        this.f6886b.a(vVar);
        return vVar;
    }
}
