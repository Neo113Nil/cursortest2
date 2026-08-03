package vd;

import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import m0.r;
import m0.r1;
import m0.x2;
import m0.z;
import v1.e0;
import z.g0;
import z.i0;
import z.j0;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd.k f7342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.a f7344i;

    public k(qd.k kVar, boolean z10, oc.a aVar) {
        this.f7342g = kVar;
        this.f7343h = z10;
        this.f7344i = aVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        String str;
        r rVar = (r) obj2;
        int intValue = ((Number) obj3).intValue();
        pc.j.e((s) obj, "$this$Card");
        if ((intValue & 17) == 16 && rVar.B()) {
            rVar.S();
        } else {
            float f10 = 16;
            y0.n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), f10);
            i0 a6 = g0.a(z.i.f8959a, y0.c.f8429q, rVar, 48);
            int o7 = z.o(rVar);
            r1 l10 = rVar.l();
            y0.n o10 = uc.e.o(rVar, f11);
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
            y0.k kVar = y0.k.f8442a;
            y0.n a8 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.h(kVar, 64), ((j0.j) rVar.j(j0.l.f3404a)).f3357c, d0.e.f1563a);
            e0 e10 = z.m.e(y0.c.f8423k, false);
            int o11 = z.o(rVar);
            r1 l11 = rVar.l();
            y0.n o12 = uc.e.o(rVar, a8);
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(e10, rVar, hVar);
            z.w(l11, rVar, hVar2);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o11))) {
                a4.d.p(o11, rVar, o11, hVar3);
            }
            z.w(o12, rVar, hVar4);
            qd.k kVar2 = this.f7342g;
            int ordinal = kVar2.f5865a.ordinal();
            if (ordinal == 0) {
                str = "⏱️";
            } else if (ordinal == 1) {
                str = "🛡️";
            } else {
                if (ordinal != 2) {
                    throw new ac.d();
                }
                str = "🧲";
            }
            x2 x2Var = t0.f3483a;
            r0.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar.j(x2Var)).f3467e, rVar, 0, 65534);
            rVar.q(true);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
            y0.n a10 = j0.a();
            z.r a11 = z.q.a(z.i.f8960b, y0.c.f8430r, rVar, 0);
            int o13 = z.o(rVar);
            r1 l12 = rVar.l();
            y0.n o14 = uc.e.o(rVar, a10);
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            z.w(a11, rVar, hVar);
            z.w(l12, rVar, hVar2);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o13))) {
                a4.d.p(o13, rVar, o13, hVar3);
            }
            z.w(o14, rVar, hVar4);
            String str2 = kVar2.f5866b;
            h0 h0Var = ((s0) rVar.j(x2Var)).f3470h;
            long j3 = f1.q.f2279d;
            k2.l lVar = k2.l.f3614k;
            r0.b(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var, j3, 0L, lVar, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 4));
            r0.b(kVar2.f5867c, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3474l, f1.q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar, 0, 65534);
            r rVar2 = rVar;
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 8));
            rVar2.X(-574590615);
            int i10 = kVar2.f5869e;
            if (i10 > 0) {
                r0.b(a4.d.g("Owned: ", i10), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var)).f3474l, ee.a.f2157d, 0L, lVar, null, 0L, 0L, null, 16777210), rVar2, 0, 65534);
                rVar2 = rVar2;
            }
            rVar2.q(false);
            rVar2.q(true);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.j(f10));
            u2.b.b(kVar2.f5868d, this.f7343h, this.f7344i, rVar2, 0);
            rVar2.q(true);
        }
        return ac.o.f277a;
    }
}
