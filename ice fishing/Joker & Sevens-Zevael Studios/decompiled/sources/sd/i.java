package sd;

import ac.o;
import f1.q;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import k2.l;
import m0.r;
import m0.r1;
import m0.x2;
import m0.z;
import y0.n;
import z.g0;
import z.i0;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f6500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6501i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f6502j;

    public /* synthetic */ i(int i10, long j3, String str, String str2) {
        this.f6499g = i10;
        this.f6500h = str;
        this.f6501i = j3;
        this.f6502j = str2;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f6499g) {
            case 0:
                r rVar = (r) obj2;
                int intValue = ((Number) obj3).intValue();
                pc.j.e((s) obj, "$this$Card");
                if ((intValue & 17) == 16 && rVar.B()) {
                    rVar.S();
                } else {
                    n f10 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 20);
                    y0.e eVar = y0.c.f8429q;
                    i0 a6 = g0.a(z.i.f8962d, eVar, rVar, 54);
                    int o7 = z.o(rVar);
                    r1 l10 = rVar.l();
                    n o10 = uc.e.o(rVar, f10);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    x1.h hVar = x1.i.f8079e;
                    z.w(a6, rVar, hVar);
                    x1.h hVar2 = x1.i.f8078d;
                    z.w(l10, rVar, hVar2);
                    x1.h hVar3 = x1.i.f8080f;
                    if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar, o7, hVar3);
                    }
                    x1.h hVar4 = x1.i.f8077c;
                    z.w(o10, rVar, hVar4);
                    i0 a8 = g0.a(z.i.f8959a, eVar, rVar, 48);
                    int o11 = z.o(rVar);
                    r1 l11 = rVar.l();
                    n o12 = uc.e.o(rVar, y0.k.f8442a);
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    z.w(a8, rVar, hVar);
                    z.w(l11, rVar, hVar2);
                    if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o11))) {
                        a4.d.p(o11, rVar, o11, hVar3);
                    }
                    z.w(o12, rVar, hVar4);
                    x2 x2Var = t0.f3483a;
                    r0.b(this.f6502j, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3472j, q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar, 0, 65534);
                    rVar.q(true);
                    r0.b(this.f6500h, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3467e, this.f6501i, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
                    rVar.q(true);
                }
                break;
            default:
                r rVar2 = (r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                pc.j.e((s) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && rVar2.B()) {
                    rVar2.S();
                } else {
                    n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    z.r a10 = z.q.a(z.i.f8960b, y0.c.f8431s, rVar2, 48);
                    int o13 = z.o(rVar2);
                    r1 l12 = rVar2.l();
                    n o14 = uc.e.o(rVar2, f11);
                    x1.j.f8084f.getClass();
                    x1.z zVar2 = x1.i.f8076b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar2);
                    } else {
                        rVar2.l0();
                    }
                    z.w(a10, rVar2, x1.i.f8079e);
                    z.w(l12, rVar2, x1.i.f8078d);
                    x1.h hVar5 = x1.i.f8080f;
                    if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(o13))) {
                        a4.d.p(o13, rVar2, o13, hVar5);
                    }
                    z.w(o14, rVar2, x1.i.f8077c);
                    x2 x2Var2 = t0.f3483a;
                    r0.b(this.f6500h, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3468f, this.f6501i, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 0, 65534);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(y0.k.f8442a, 4));
                    r0.b(this.f6502j, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3474l, q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 0, 65534);
                    rVar2.q(true);
                }
                break;
        }
        return o.f277a;
    }
}
