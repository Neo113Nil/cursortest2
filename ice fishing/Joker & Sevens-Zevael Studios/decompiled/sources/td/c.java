package td;

import androidx.lifecycle.k;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import m0.r;
import m0.z;
import m5.h;
import ud.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final c f6550g = new c();

    @Override // k5.a
    public final void c(r rVar) {
        rVar.X(948135028);
        m5.c cVar = (m5.c) h.c(h.f4895a, rVar);
        rVar.Y(1890788296);
        y0 a6 = y3.a.a(rVar);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ub.f r5 = i7.b.r(a6, rVar);
        rVar.Y(1729797275);
        t0 j3 = g.j(f.class, a6, r5, a6 instanceof k ? ((k) a6).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        v6.a.f((d) z.k(((f) j3).f6560d, rVar).getValue(), cVar, rVar, 64);
        rVar.q(false);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }
}
