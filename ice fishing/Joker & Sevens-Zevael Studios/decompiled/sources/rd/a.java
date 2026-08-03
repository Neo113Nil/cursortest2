package rd;

import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import m0.r1;
import m0.x2;
import z.g0;
import z.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.f {

    /* renamed from: h, reason: collision with root package name */
    public static final a f6111h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public static final a f6112i = new a(1);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6113g;

    public /* synthetic */ a(int i10) {
        this.f6113g = i10;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f6113g) {
            case 0:
                m0.r rVar = (m0.r) obj2;
                int intValue = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue & 17) == 16 && rVar.B()) {
                    rVar.S();
                } else {
                    float f10 = 8;
                    y0.n g8 = androidx.compose.foundation.layout.b.g(y0.k.f8442a, 16, f10);
                    i0 a6 = g0.a(z.i.f8959a, y0.c.f8429q, rVar, 48);
                    int o7 = m0.z.o(rVar);
                    r1 l10 = rVar.l();
                    y0.n o10 = uc.e.o(rVar, g8);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    m0.z.w(a6, rVar, x1.i.f8079e);
                    m0.z.w(l10, rVar, x1.i.f8078d);
                    x1.h hVar = x1.i.f8080f;
                    if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar, o7, hVar);
                    }
                    m0.z.w(o10, rVar, x1.i.f8077c);
                    x2 x2Var = t0.f3483a;
                    r0.b("🛡️", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar.j(x2Var)).f3472j, rVar, 6, 65534);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
                    r0.b("Shield Active", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3473k, ee.a.f2157d, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar, 6, 65534);
                    rVar.q(true);
                }
                break;
            default:
                m0.r rVar2 = (m0.r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && rVar2.B()) {
                    rVar2.S();
                } else {
                    y0.k kVar = y0.k.f8442a;
                    y0.n f11 = androidx.compose.foundation.layout.b.f(kVar, 32);
                    z.r a8 = z.q.a(z.i.f8960b, y0.c.f8431s, rVar2, 48);
                    int o11 = m0.z.o(rVar2);
                    r1 l11 = rVar2.l();
                    y0.n o12 = uc.e.o(rVar2, f11);
                    x1.j.f8084f.getClass();
                    x1.z zVar2 = x1.i.f8076b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar2);
                    } else {
                        rVar2.l0();
                    }
                    m0.z.w(a8, rVar2, x1.i.f8079e);
                    m0.z.w(l11, rVar2, x1.i.f8078d);
                    x1.h hVar2 = x1.i.f8080f;
                    if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(o11))) {
                        a4.d.p(o11, rVar2, o11, hVar2);
                    }
                    m0.z.w(o12, rVar2, x1.i.f8077c);
                    x2 x2Var2 = t0.f3483a;
                    r0.b("PAUSED", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3467e, ee.a.f2155b, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 6, 65534);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 16));
                    r0.b("Tap to resume", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3473k, f1.q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 6, 65534);
                    rVar2.q(true);
                }
                break;
        }
        return ac.o.f277a;
    }
}
