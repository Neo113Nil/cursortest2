package sd;

import ac.o;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import j0.u;
import k2.l;
import m0.r;
import m0.r1;
import m0.z;
import y0.n;
import z.g0;
import z.i0;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6477g = new a();

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj2;
        int intValue = ((Number) obj3).intValue();
        pc.j.e((s) obj, "$this$Card");
        if ((intValue & 17) == 16 && rVar.B()) {
            rVar.S();
        } else {
            float f10 = 12;
            y0.k kVar = y0.k.f8442a;
            n g8 = androidx.compose.foundation.layout.b.g(kVar, 24, f10);
            i0 a6 = g0.a(z.i.f8959a, y0.c.f8429q, rVar, 48);
            int o7 = z.o(rVar);
            r1 l10 = rVar.l();
            n o10 = uc.e.o(rVar, g8);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(a6, rVar, x1.i.f8079e);
            z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
                a4.d.p(o7, rVar, o7, hVar);
            }
            z.w(o10, rVar, x1.i.f8077c);
            l1.f A = a.a.A();
            long j3 = ee.a.f2156c;
            float f11 = 32;
            u.b(A, "Star", androidx.compose.foundation.layout.b.h(kVar, f11), j3, rVar, 432, 0);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
            r0.b("NEW RECORD!", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(t0.f3483a)).f3469g, j3, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, 6, 65534);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
            u.b(a.a.A(), "Star", androidx.compose.foundation.layout.b.h(kVar, f11), j3, rVar, 432, 0);
            rVar.q(true);
        }
        return o.f277a;
    }
}
