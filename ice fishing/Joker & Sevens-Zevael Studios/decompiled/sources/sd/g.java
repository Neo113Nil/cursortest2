package sd;

import ac.o;
import bc.a0;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import k2.l;
import m0.r;
import m0.r1;
import m0.x2;
import org.fortheloss.st.R;
import u.l0;
import v1.e0;
import x1.z;
import y0.n;
import z.g0;
import z.i0;
import z.j0;
import z.m;
import z.q;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd.h f6490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6491h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.a f6492i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ oc.a f6493j;

    public g(qd.h hVar, int i10, oc.a aVar, oc.a aVar2) {
        this.f6490g = hVar;
        this.f6491h = i10;
        this.f6492i = aVar;
        this.f6493j = aVar2;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        z zVar;
        x1.h hVar;
        r rVar = (r) obj2;
        int intValue = ((Number) obj3).intValue();
        pc.j.e((s) obj, "$this$Card");
        if ((intValue & 17) == 16 && rVar.B()) {
            rVar.S();
        } else {
            float f10 = 32;
            n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), f10);
            y0.d dVar = y0.c.f8431s;
            qd.h hVar2 = this.f6490g;
            int i10 = hVar2.f5851g;
            z.r a6 = q.a(z.i.f8960b, dVar, rVar, 48);
            int o7 = m0.z.o(rVar);
            r1 l10 = rVar.l();
            n o10 = uc.e.o(rVar, f11);
            x1.j.f8084f.getClass();
            z zVar2 = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar2);
            } else {
                rVar.l0();
            }
            x1.h hVar3 = x1.i.f8079e;
            m0.z.w(a6, rVar, hVar3);
            x1.h hVar4 = x1.i.f8078d;
            m0.z.w(l10, rVar, hVar4);
            x1.h hVar5 = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
                a4.d.p(o7, rVar, o7, hVar5);
            }
            x1.h hVar6 = x1.i.f8077c;
            m0.z.w(o10, rVar, hVar6);
            x2 x2Var = t0.f3483a;
            h0 h0Var = ((s0) rVar.j(x2Var)).f3466d;
            long j3 = ee.a.f2154a;
            l lVar = l.f3614k;
            r0.b("GAME OVER", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var, j3, a0.t(36), lVar, null, 0L, 0L, null, 16777208), rVar, 6, 65534);
            y0.k kVar = y0.k.f8442a;
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f10));
            x4.f.s("Final Score", String.valueOf(i10), ee.a.f2156c, rVar, 6);
            float f12 = 16;
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f12));
            rVar.X(1169749383);
            int i11 = this.f6491h;
            if (i10 >= i11) {
                x4.f.n(0, rVar);
                u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f12));
            }
            rVar.q(false);
            String valueOf = String.valueOf(i11);
            long j6 = ee.a.f2155b;
            x4.f.s("Best Score", valueOf, j6, rVar, 6);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f12));
            n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            i0 a8 = g0.a(new z.e(f12), y0.c.f8428p, rVar, 6);
            int o11 = m0.z.o(rVar);
            r1 l11 = rVar.l();
            n o12 = uc.e.o(rVar, b2);
            rVar.b0();
            if (rVar.S) {
                zVar = zVar2;
                rVar.k(zVar);
            } else {
                zVar = zVar2;
                rVar.l0();
            }
            m0.z.w(a8, rVar, hVar3);
            m0.z.w(l11, rVar, hVar4);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o11))) {
                hVar = hVar5;
                a4.d.p(o11, rVar, o11, hVar);
            } else {
                hVar = hVar5;
            }
            m0.z.w(o12, rVar, hVar6);
            x1.h hVar7 = hVar;
            x4.f.x("Chips Earned", String.valueOf(hVar2.f5853i), ee.a.f2157d, j0.a(), rVar, 6);
            x4.f.x("Jokers Found", String.valueOf(hVar2.f5854j), j6, j0.a(), rVar, 6);
            rVar.q(true);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f10));
            float f13 = 56;
            float f14 = 28;
            n d10 = androidx.compose.foundation.a.d(x4.f.B(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.b(1.0f), f13), d0.e.a(f14)), false, this.f6492i, 7);
            y0.f fVar = y0.c.f8419g;
            e0 e10 = m.e(fVar, false);
            int o13 = m0.z.o(rVar);
            r1 l12 = rVar.l();
            n o14 = uc.e.o(rVar, d10);
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(e10, rVar, hVar3);
            m0.z.w(l12, rVar, hVar4);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o13))) {
                a4.d.p(o13, rVar, o13, hVar7);
            }
            m0.z.w(o14, rVar, hVar6);
            k1.b B = i7.b.B(R.drawable.custom_button, rVar);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f540a;
            n b10 = aVar.b();
            v1.i iVar = v1.j.f7083b;
            l0.a(B, "custom button", b10, null, iVar, 0.0f, rVar, 24624, 104);
            h0 h0Var2 = ((s0) rVar.j(x2Var)).f3470h;
            long j10 = f1.q.f2279d;
            z zVar3 = zVar;
            r0.b("PLAY AGAIN", aVar.a(), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var2, j10, 0L, lVar, null, 0L, 0L, null, 16777210), rVar, 6, 65532);
            rVar.q(true);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 12));
            n d11 = androidx.compose.foundation.a.d(x4.f.B(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.b(1.0f), f13), d0.e.a(f14)), false, this.f6493j, 7);
            e0 e11 = m.e(fVar, false);
            int o15 = m0.z.o(rVar);
            r1 l13 = rVar.l();
            n o16 = uc.e.o(rVar, d11);
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar3);
            } else {
                rVar.l0();
            }
            m0.z.w(e11, rVar, hVar3);
            m0.z.w(l13, rVar, hVar4);
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o15))) {
                a4.d.p(o15, rVar, o15, hVar7);
            }
            m0.z.w(o16, rVar, hVar6);
            l0.a(i7.b.B(R.drawable.custom_button, rVar), "custom button", aVar.b(), null, iVar, 0.0f, rVar, 24624, 104);
            r0.b("MAIN MENU", aVar.a(), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3470h, j10, 0L, lVar, null, 0L, 0L, null, 16777210), rVar, 6, 65532);
            rVar.q(true);
            rVar.q(true);
        }
        return o.f277a;
    }
}
