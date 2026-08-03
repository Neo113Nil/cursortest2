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
public final class s implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6188i;

    public /* synthetic */ s(int i10, int i11, Object obj) {
        this.f6186g = i11;
        this.f6188i = obj;
        this.f6187h = i10;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6186g;
        ac.o oVar = ac.o.f277a;
        int i11 = this.f6187h;
        Object obj4 = this.f6188i;
        switch (i10) {
            case 0:
                m0.r rVar = (m0.r) obj2;
                int intValue = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue & 17) != 16 || !rVar.B()) {
                    float f10 = 8;
                    y0.n g8 = androidx.compose.foundation.layout.b.g(y0.k.f8442a, 16, f10);
                    qd.a aVar = (qd.a) obj4;
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
                    int ordinal = aVar.f5820g.ordinal();
                    String str = ordinal != 0 ? ordinal != 2 ? "⚡" : "🧲" : "⏱️";
                    x2 x2Var = t0.f3483a;
                    r0.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar.j(x2Var)).f3472j, rVar, 0, 65534);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
                    r0.b(xc.h.w(aVar.f5820g.name(), "_", " ") + " (" + i11 + " s)", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3474l, ee.a.f2155b, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
                    rVar.q(true);
                    break;
                } else {
                    rVar.S();
                    break;
                }
                break;
            default:
                m0.r rVar2 = (m0.r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue2 & 17) != 16 || !rVar2.B()) {
                    y0.n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    oc.a aVar2 = (oc.a) obj4;
                    i0 a8 = g0.a(z.i.f8962d, y0.c.f8429q, rVar2, 54);
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
                    float f12 = j0.b.f3291a;
                    float f13 = 0;
                    j0.g0.a(aVar2, null, false, d0.e.a(f13), j0.b.a(f1.q.f2282g, rVar2), null, new z.c0(f13, f13, f13, f13), vd.b.f7316a, rVar2, 818085888);
                    r0.b("SHOP", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(t0.f3483a)).f3467e, ee.a.f2155b, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 6, 65534);
                    u2.b.a(i11, rVar2, 0);
                    rVar2.q(true);
                    break;
                } else {
                    rVar2.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
