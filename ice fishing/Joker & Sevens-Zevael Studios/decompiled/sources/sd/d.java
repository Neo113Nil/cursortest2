package sd;

import ac.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import java.io.Serializable;
import m0.d1;
import m0.l;
import m0.r;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements k5.a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final qd.h f6481g;

    public d(qd.h hVar) {
        this.f6481g = hVar;
    }

    @Override // k5.a
    public final void c(r rVar) {
        rVar.X(-1373612441);
        m5.c cVar = (m5.c) m5.h.c(m5.h.f4895a, rVar);
        rVar.Y(1890788296);
        y0 a6 = y3.a.a(rVar);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ub.f r5 = i7.b.r(a6, rVar);
        rVar.Y(1729797275);
        t0 j3 = ud.g.j(k.class, a6, r5, a6 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a6).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        k kVar = (k) j3;
        d1 k3 = z.k(kVar.f6506d, rVar);
        rVar.X(1764615146);
        boolean h10 = rVar.h(kVar);
        Object M = rVar.M();
        Object obj = l.f4646a;
        if (h10 || M == obj) {
            M = new ld.a(kVar, null, 2);
            rVar.i0(M);
        }
        rVar.q(false);
        z.f(o.f277a, rVar, (oc.e) M);
        int i10 = ((j) k3.getValue()).f6503a;
        rVar.X(1764621206);
        boolean h11 = rVar.h(cVar);
        Object M2 = rVar.M();
        if (h11 || M2 == obj) {
            M2 = new c(cVar, 0);
            rVar.i0(M2);
        }
        oc.a aVar = (oc.a) M2;
        rVar.q(false);
        rVar.X(1764624022);
        boolean h12 = rVar.h(cVar);
        Object M3 = rVar.M();
        if (h12 || M3 == obj) {
            M3 = new c(cVar, 1);
            rVar.i0(M3);
        }
        rVar.q(false);
        x4.f.h(this.f6481g, i10, aVar, (oc.a) M3, rVar, 0);
        rVar.q(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && pc.j.a(this.f6481g, ((d) obj).f6481g);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }

    public final int hashCode() {
        return this.f6481g.hashCode();
    }

    public final String toString() {
        return "GameOverScreen(gameSession=" + this.f6481g + ")";
    }
}
