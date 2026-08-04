package com.gamericefishpro.space.s7;

import android.content.Context;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.c0;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.j;
import com.gamericefishpro.space.d0.v;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.o;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.y.c1;
import com.gamericefishpro.space.y.q;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.y0;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a = o.c(4294622464L);
    public static final long b = o.c(4294922834L);
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Code duplicated, block: B:46:0x0300  */
    /* JADX WARN: Code duplicated, block: B:48:0x0308  */
    /* JADX WARN: Code duplicated, block: B:51:0x037e  */
    /* JADX WARN: Code duplicated, block: B:53:0x038a  */
    public static final void a(Function0 onBack, i iVar, r rVar, int i) {
        int i2;
        i iVar2;
        y yVar;
        com.gamericefishpro.space.t0.f fVar;
        i iVar3;
        Object objP;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar.b0(1390746238);
        int i3 = i | (rVar.h(onBack) ? 4 : 2) | 16;
        if ((i3 & 19) == 18 && rVar.E()) {
            rVar.V();
            iVar3 = iVar;
        } else {
            rVar.X();
            if ((i & 1) == 0 || rVar.B()) {
                rVar.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = com.gamericefishpro.space.d9.h.K(b0.a(i.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar), null);
                rVar.p(false);
                i2 = i3 & (-113);
                iVar2 = (i) s0VarK;
            } else {
                rVar.V();
                i2 = i3 & (-113);
                iVar2 = iVar;
            }
            int i4 = i2;
            rVar.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(iVar2.c, rVar);
            rVar.a0(563887068);
            Object objP2 = rVar.P();
            com.gamericefishpro.space.t0.f fVar2 = n.a;
            if (objP2 == fVar2) {
                objP2 = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
                rVar.k0(objP2);
            }
            v0 v0Var = (v0) objP2;
            rVar.p(false);
            Context context = (Context) rVar.j(j0.b);
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            m mVarF = com.gamericefishpro.space.d9.h.F(h0Var, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            i iVar4 = iVar2;
            y yVar2 = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar2);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, eVar4);
            q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            com.gamericefishpro.space.d0.r.a(q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j, 0.5f))), new Pair(Float.valueOf(0.4f), new s(s.c(j, 0.2f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.85f)))}), null, 6), rVar, 6);
            a4.f(rVar, 0);
            float f = 20;
            m mVarM = j.m(h0Var, f, 48);
            v vVar = com.gamericefishpro.space.d0.h.b;
            com.gamericefishpro.space.h1.c cVar = com.gamericefishpro.space.h1.b.F;
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(vVar, cVar, rVar, 0);
            int iHashCode2 = Long.hashCode(rVar.T);
            l1 l1VarL2 = rVar.l();
            m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarM, rVar);
            rVar.d0();
            if (rVar.S) {
                yVar = yVar2;
                rVar.k(yVar);
            } else {
                yVar = yVar2;
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF2, eVar4);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarB = g1.b(jVar, 1.0f);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar, 48);
            int iHashCode3 = Long.hashCode(rVar.T);
            l1 l1VarL3 = rVar.l();
            m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarB, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF3, eVar4);
            d5.f(onBack, rVar, i4 & 14);
            j.c(g1.g(jVar, 16), rVar);
            y yVar3 = yVar;
            r0.a("SETTINGS", null, s.c, com.gamericefishpro.space.hj.c.C(28), k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(s.c(j, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar.p(true);
            float f2 = 24;
            j.c(g1.d(jVar, f2), rVar);
            m mVarA = c0.a(g1.b(jVar, 1.0f));
            Object[] objArr = new Object[0];
            boolean zD = rVar.d(0);
            Object objP3 = rVar.P();
            if (zD) {
                fVar = fVar2;
            } else {
                fVar = fVar2;
                if (objP3 == fVar) {
                }
                m mVarN = q.n(mVarA, (c1) com.gamericefishpro.space.e1.k.b(objArr, c1.j, (Function0) objP3, rVar, 0));
                com.gamericefishpro.space.d0.b0 b0VarA2 = z.a(com.gamericefishpro.space.d0.h.g(f2), cVar, rVar, 6);
                int iHashCode4 = Long.hashCode(rVar.T);
                l1 l1VarL4 = rVar.l();
                m mVarF4 = com.gamericefishpro.space.d9.h.F(mVarN, rVar);
                rVar.d0();
                if (rVar.S) {
                    rVar.k(yVar3);
                } else {
                    rVar.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar, b0VarA2, eVar);
                com.gamericefishpro.space.t0.i.B(rVar, l1VarL4, eVar2);
                com.gamericefishpro.space.m5.a.o(iHashCode4, rVar, eVar3, rVar, dVar);
                com.gamericefishpro.space.t0.i.B(rVar, mVarF4, eVar4);
                iVar3 = iVar4;
                y3.g("AUDIO & HAPTICS", com.gamericefishpro.space.b1.n.c(-415932771, new com.gamericefishpro.space.g5.m(5, iVar3, v0VarL), rVar), rVar, 54);
                y3.g("COMMUNITY", com.gamericefishpro.space.b1.n.c(1818171604, new c(0, context), rVar), rVar, 54);
                y3.g("DATA & SYSTEM", com.gamericefishpro.space.b1.n.c(-1379477803, new c(1, v0Var), rVar), rVar, 54);
                j.c(g1.d(jVar, f), rVar);
                rVar.p(true);
                rVar.p(true);
                rVar.p(true);
                if (((Boolean) v0Var.getValue()).booleanValue()) {
                    rVar.a0(564058967);
                    objP = rVar.P();
                    if (objP == fVar) {
                        objP = new com.gamericefishpro.space.f0.k(v0Var, 3);
                        rVar.k0(objP);
                    }
                    rVar.p(false);
                    com.gamericefishpro.space.d9.h.b((Function0) objP, null, com.gamericefishpro.space.b1.n.c(-313778512, new com.gamericefishpro.space.g5.m(6, iVar3, v0Var), rVar), rVar, 390, 2);
                }
            }
            objP3 = new com.gamericefishpro.space.q0.n(14);
            rVar.k0(objP3);
            m mVarN2 = q.n(mVarA, (c1) com.gamericefishpro.space.e1.k.b(objArr, c1.j, (Function0) objP3, rVar, 0));
            com.gamericefishpro.space.d0.b0 b0VarA3 = z.a(com.gamericefishpro.space.d0.h.g(f2), cVar, rVar, 6);
            int iHashCode5 = Long.hashCode(rVar.T);
            l1 l1VarL5 = rVar.l();
            m mVarF5 = com.gamericefishpro.space.d9.h.F(mVarN2, rVar);
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar3);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, b0VarA3, eVar);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL5, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode5, rVar, eVar3, rVar, dVar);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF5, eVar4);
            iVar3 = iVar4;
            y3.g("AUDIO & HAPTICS", com.gamericefishpro.space.b1.n.c(-415932771, new com.gamericefishpro.space.g5.m(5, iVar3, v0VarL), rVar), rVar, 54);
            y3.g("COMMUNITY", com.gamericefishpro.space.b1.n.c(1818171604, new c(0, context), rVar), rVar, 54);
            y3.g("DATA & SYSTEM", com.gamericefishpro.space.b1.n.c(-1379477803, new c(1, v0Var), rVar), rVar, 54);
            j.c(g1.d(jVar, f), rVar);
            rVar.p(true);
            rVar.p(true);
            rVar.p(true);
            if (((Boolean) v0Var.getValue()).booleanValue()) {
                rVar.a0(564058967);
                objP = rVar.P();
                if (objP == fVar) {
                    objP = new com.gamericefishpro.space.f0.k(v0Var, 3);
                    rVar.k0(objP);
                }
                rVar.p(false);
                com.gamericefishpro.space.d9.h.b((Function0) objP, null, com.gamericefishpro.space.b1.n.c(-313778512, new com.gamericefishpro.space.g5.m(6, iVar3, v0Var), rVar), rVar, 390, 2);
            }
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new w(i, 12, onBack, iVar3);
        }
    }
}
