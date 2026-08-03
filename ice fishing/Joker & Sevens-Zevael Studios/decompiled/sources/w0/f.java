package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final oc.c f7557e;

    /* renamed from: f, reason: collision with root package name */
    public int f7558f;

    public f(long j3, k kVar, oc.c cVar) {
        super(j3, kVar);
        this.f7557e = cVar;
        this.f7558f = 1;
    }

    @Override // w0.g
    public final void c() {
        if (this.f7561c) {
            return;
        }
        l();
        this.f7561c = true;
        synchronized (m.f7580c) {
            o();
        }
    }

    @Override // w0.g
    public final oc.c e() {
        return this.f7557e;
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
        this.f7558f++;
    }

    @Override // w0.g
    public final void l() {
        int i10 = this.f7558f - 1;
        this.f7558f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // w0.g
    public final void n(v vVar) {
        nd.d dVar = m.f7578a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // w0.g
    public final g u(oc.c cVar) {
        m.d(this);
        return new e(this.f7560b, this.f7559a, m.l(cVar, this.f7557e, true), this);
    }

    @Override // w0.g
    public final void m() {
    }
}
