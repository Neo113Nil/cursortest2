package w0;

import m0.w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends c {
    @Override // w0.c
    public final c C(oc.c cVar, oc.c cVar2) {
        return (c) ((g) m.f(new k2.e(12, new w0(1, cVar, cVar2))));
    }

    @Override // w0.c, w0.g
    public final void c() {
        synchronized (m.f7580c) {
            o();
        }
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
        m.a();
    }

    @Override // w0.c, w0.g
    public final g u(oc.c cVar) {
        return (f) ((g) m.f(new k2.e(12, new a(cVar))));
    }

    @Override // w0.c
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
