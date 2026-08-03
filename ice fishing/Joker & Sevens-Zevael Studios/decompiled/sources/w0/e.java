package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public final oc.c f7555e;

    /* renamed from: f, reason: collision with root package name */
    public final g f7556f;

    public e(long j3, k kVar, oc.c cVar, g gVar) {
        super(j3, kVar);
        this.f7555e = cVar;
        this.f7556f = gVar;
        gVar.k();
    }

    @Override // w0.g
    public final void c() {
        g gVar = this.f7556f;
        if (this.f7561c) {
            return;
        }
        if (this.f7560b != gVar.g()) {
            a();
        }
        gVar.l();
        this.f7561c = true;
        synchronized (m.f7580c) {
            o();
        }
    }

    @Override // w0.g
    public final oc.c e() {
        return this.f7555e;
    }

    @Override // w0.g
    public final boolean f() {
        return true;
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
    public final void n(v vVar) {
        nd.d dVar = m.f7578a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // w0.g
    public final g u(oc.c cVar) {
        return new e(this.f7560b, this.f7559a, m.l(cVar, this.f7555e, true), this.f7556f);
    }

    @Override // w0.g
    public final void m() {
    }
}
