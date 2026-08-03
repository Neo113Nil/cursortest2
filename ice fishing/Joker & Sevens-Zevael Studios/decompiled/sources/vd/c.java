package vd;

import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final c f7317g = new c();

    @Override // k5.a
    public final void c(r rVar) {
        rVar.X(2124404535);
        m5.c cVar = (m5.c) m5.h.c(m5.h.f4895a, rVar);
        rVar.Y(1890788296);
        y0 a6 = y3.a.a(rVar);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ub.f r5 = i7.b.r(a6, rVar);
        rVar.Y(1729797275);
        t0 j3 = ud.g.j(q.class, a6, r5, a6 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a6).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        q qVar = (q) j3;
        n nVar = (n) z.k(qVar.f7359d, rVar).getValue();
        rVar.X(1030807146);
        boolean h10 = rVar.h(qVar);
        Object M = rVar.M();
        Object obj = m0.l.f4646a;
        if (h10 || M == obj) {
            M = new k2.e(11, qVar);
            rVar.i0(M);
        }
        oc.c cVar2 = (oc.c) M;
        rVar.q(false);
        rVar.X(1030809420);
        boolean h11 = rVar.h(cVar);
        Object M2 = rVar.M();
        if (h11 || M2 == obj) {
            M2 = new sd.c(cVar, 3);
            rVar.i0(M2);
        }
        rVar.q(false);
        u2.b.f(nVar, cVar2, (oc.a) M2, rVar, 0);
        rVar.q(false);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }
}
