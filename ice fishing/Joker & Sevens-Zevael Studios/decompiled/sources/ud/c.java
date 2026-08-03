package ud;

import m0.l;
import m0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final c f6748g = new c();

    @Override // k5.a
    public final void c(r rVar) {
        rVar.X(-355964064);
        m5.c cVar = (m5.c) m5.h.c(m5.h.f4895a, rVar);
        rVar.X(1432788222);
        boolean h10 = rVar.h(cVar);
        Object M = rVar.M();
        if (h10 || M == l.f4646a) {
            M = new sd.c(cVar, 2);
            rVar.i0(M);
        }
        rVar.q(false);
        g.d((oc.a) M, rVar, 0);
        rVar.q(false);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }
}
