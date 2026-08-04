package com.gamericefishpro.space.m7;

import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.b;
import com.gamericefishpro.space.h1.j;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.d;
import com.gamericefishpro.space.h2.e;
import com.gamericefishpro.space.h2.f;
import com.gamericefishpro.space.h2.g;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y.q;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a = o.c(4289734400L);
    public static final long b = o.c(4286192384L);
    public static final long c = o.c(4278202455L);

    public static final void a(int i, String str, Function0 function0, Function0 function1, r rVar, int i2) {
        Function0 onRetry = function0;
        Function0 onHome = function1;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        Intrinsics.checkNotNullParameter(onHome, "onHome");
        rVar2.b0(1978327967);
        int i3 = i2 | (rVar2.d(i) ? 4 : 2) | (rVar2.f(str) ? 32 : 16) | (rVar2.h(onRetry) ? 256 : 128) | (rVar2.h(onHome) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && rVar2.E()) {
            rVar2.V();
        } else {
            boolean zEquals = str.equals("TIME_UP");
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(h0Var, rVar2);
            g.a.getClass();
            y yVar = f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            e eVar = f.e;
            i.B(rVar2, l0VarD, eVar);
            e eVar2 = f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            e eVar3 = f.f;
            i.t(rVar2, numValueOf, eVar3);
            d dVar = f.g;
            i.x(rVar2, dVar);
            e eVar4 = f.c;
            i.B(rVar2, mVarF, eVar4);
            float f = 16;
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, com.gamericefishpro.space.l1.h.a(h0Var, f), null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Pair pair = new Pair(Float.valueOf(0.0f), new s(s.c(c, 0.7f)));
            Float fValueOf = Float.valueOf(0.5f);
            long j = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{pair, new Pair(fValueOf, new s(s.c(j, 0.4f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.9f)))}), null, 6), rVar2, 6);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(h0Var, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            j jVar = j.a;
            float f2 = 24;
            m mVarN = com.gamericefishpro.space.d0.j.n(g1.b(jVar, 1.0f), f2, 0.0f, 2);
            l0 l0VarD3 = com.gamericefishpro.space.d0.r.d(b.e, false);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            m mVarF3 = h.F(mVarN, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD3, eVar);
            i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF3, eVar4);
            float f3 = 32;
            long j2 = s.c;
            m mVarO = com.gamericefishpro.space.d0.j.o(com.gamericefishpro.space.d0.j.m(q.g(q.e(com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.d0.j.o(g1.b(jVar, 1.0f), 0.0f, 60, 0.0f, 0.0f, 13), com.gamericefishpro.space.k0.e.a(f3)), s.c(o.c(4278197305L), 0.85f), o.b), 1, s.c(j2, 0.3f), com.gamericefishpro.space.k0.e.a(f3)), f2, f3), 0.0f, 20, 0.0f, 0.0f, 13);
            b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, b.G, rVar2, 48);
            int iHashCode4 = Long.hashCode(rVar2.T);
            l1 l1VarL4 = rVar2.l();
            m mVarF4 = h.F(mVarO, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, b0VarA, eVar);
            i.B(rVar2, l1VarL4, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF4, eVar4);
            r0.a("LEVEL " + i, null, s.c(j2, 0.6f), c.C(14), k.w, c.C(2), null, 0L, 0, false, 0, 0, null, rVar, 102261120, 0, 261802);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, (float) 4), rVar);
            r0.a(zEquals ? "TIME'S UP!" : "OUT OF MOVES", null, o.c(4294922834L), c.C(32), k.y, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(b, 12.0f, 2), 16769023), rVar, 1597824, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f), rVar);
            r0.a(zEquals ? "The ice froze over before you could catch them all." : "The fish swam away this time. Plan your next moves carefully!", null, s.c(j2, 0.8f), c.C(15), null, 0L, new com.gamericefishpro.space.b3.k(3), c.C(22), 0, false, 0, 0, null, rVar, 24960, 48, 259050);
            rVar2 = rVar;
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f3), rVar2);
            onRetry = function0;
            c.f(onRetry, rVar2, (i3 >> 6) & 14);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, f), rVar2);
            onHome = function1;
            h.c(onHome, rVar2, ((i3 >> 3) & 896) | 54);
            rVar2.p(true);
            com.gamericefishpro.space.b9.a.a(c.Y(com.gamericefishpro.space.d0.j.i(g1.f(jVar, 120), 0, -20), 1.0f), rVar2, 6);
            rVar2.p(true);
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(i, str, onRetry, onHome, i2);
        }
    }
}
