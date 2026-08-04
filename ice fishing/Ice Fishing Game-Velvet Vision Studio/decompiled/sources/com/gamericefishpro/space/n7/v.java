package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.t0.b1;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.w.j0;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Pair i;
    public final /* synthetic */ com.gamericefishpro.space.i7.d v;
    public final /* synthetic */ a0 w;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ s2 z;

    public v(int i, List list, Pair pair, com.gamericefishpro.space.i7.d dVar, a0 a0Var, Function2 function2, s2 s2Var) {
        this.d = i;
        this.e = list;
        this.i = pair;
        this.v = dVar;
        this.w = a0Var;
        this.y = function2;
        this.z = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:103:0x0275 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0277  */
    /* JADX WARN: Code duplicated, block: B:105:0x027e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:114:0x02be  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02df  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307  */
    /* JADX WARN: Code duplicated, block: B:134:0x0313  */
    /* JADX WARN: Code duplicated, block: B:135:0x0315  */
    /* JADX WARN: Code duplicated, block: B:139:0x033b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0371  */
    /* JADX WARN: Code duplicated, block: B:143:0x0375  */
    /* JADX WARN: Code duplicated, block: B:147:0x039f  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f  */
    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        long jC;
        a0 a0Var;
        boolean z;
        int i;
        long j;
        s2 s2VarE;
        com.gamericefishpro.space.t0.r rVar;
        long j2;
        float f;
        long j3;
        long jC2;
        long jC3;
        com.gamericefishpro.space.h1.m mVarG;
        long jC4;
        float f2;
        float f3;
        com.gamericefishpro.space.t0.r rVar2;
        Object objP;
        boolean z2;
        final Function2 function2;
        final int i2;
        boolean zF;
        Object objP2;
        com.gamericefishpro.space.h2.y yVar;
        com.gamericefishpro.space.i7.d dVar;
        Set set;
        com.gamericefishpro.space.g0.i items = (com.gamericefishpro.space.g0.i) obj;
        int iIntValue = ((Number) obj2).intValue();
        com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= rVar3.d(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && rVar3.E()) {
            rVar3.V();
        } else {
            int i3 = this.d;
            int i4 = iIntValue / i3;
            final int i5 = iIntValue % i3;
            List list = (List) CollectionsKt.x(i4, this.e);
            final com.gamericefishpro.space.i7.a aVar = list != null ? (com.gamericefishpro.space.i7.a) CollectionsKt.x(i5, list) : null;
            Pair pair = this.i;
            boolean z3 = pair != null && ((Number) pair.d).intValue() == i4 && ((Number) pair.e).intValue() == i5;
            if (aVar != null) {
                int iOrdinal = aVar.c.ordinal();
                if (iOrdinal == 0) {
                    jC = com.gamericefishpro.space.o1.o.c(4291559424L);
                } else if (iOrdinal == 1) {
                    jC = com.gamericefishpro.space.o1.o.c(4294937600L);
                } else if (iOrdinal == 2) {
                    jC = com.gamericefishpro.space.o1.o.c(4281236786L);
                } else {
                    if (iOrdinal != 3) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    jC = com.gamericefishpro.space.o1.o.c(4279592384L);
                }
            } else {
                jC = com.gamericefishpro.space.o1.s.f;
            }
            com.gamericefishpro.space.i7.d dVar2 = this.v;
            boolean z4 = dVar2 != null;
            long jC5 = dVar2 != null ? f.c(dVar2) : com.gamericefishpro.space.o1.s.f;
            a0 a0Var2 = this.w;
            boolean z5 = (a0Var2 == null || (set = a0Var2.b) == null || !set.contains(new Pair(Integer.valueOf(i4), Integer.valueOf(i5)))) ? false : true;
            long jC6 = (a0Var2 == null || (dVar = a0Var2.a) == null) ? com.gamericefishpro.space.o1.s.f : f.c(dVar);
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (z5) {
                rVar3.a0(-613722603);
                a0Var = a0Var2;
                z = z5;
                i = i4;
                j = jC;
                s2VarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("prev_scale", rVar3), 0.95f, 1.05f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(200, 2, com.gamericefishpro.space.w.t.a), j0.e), "prev_s", rVar3, 29112);
                rVar3.p(false);
            } else {
                a0Var = a0Var2;
                z = z5;
                i = i4;
                j = jC;
                if (!z3 || z4) {
                    rVar3.a0(-1844881034);
                    rVar3.a0(-613701620);
                    Object objP3 = rVar3.P();
                    if (objP3 == fVar) {
                        objP3 = new b1(1.0f);
                        rVar3.k0(objP3);
                    }
                    s2VarE = (b1) objP3;
                    rVar3.p(false);
                    rVar3.p(false);
                } else {
                    rVar3.a0(-613710888);
                    s2VarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("sel_pulse", rVar3), 0.95f, 1.1f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(400, 2, com.gamericefishpro.space.w.t.a), j0.e), "sel_scale", rVar3, 29112);
                    rVar3.p(false);
                }
            }
            float f4 = 16;
            com.gamericefishpro.space.k0.d dVarA = com.gamericefishpro.space.k0.e.a(f4);
            float f5 = 3;
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.l1.h.f(com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.d0.j.d(), f5), ((Number) s2VarE.getValue()).floatValue());
            s2 s2Var = this.z;
            com.gamericefishpro.space.h1.m mVarG2 = com.gamericefishpro.space.h1.j.a;
            if (z) {
                rVar = rVar3;
                j2 = jC6;
                f = 0.6f;
                mVarG2 = com.gamericefishpro.space.l1.h.g(mVarG2, 20, dVarA, com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue() * 0.6f), com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue()), 4);
            } else {
                rVar = rVar3;
                j2 = jC6;
                f = 0.6f;
                if (z3 || (z4 && aVar != null)) {
                    if (!z3) {
                        f4 = 8;
                    }
                    float f6 = f4;
                    long j4 = j;
                    j3 = jC5;
                    if (z4) {
                        jC3 = com.gamericefishpro.space.o1.s.c(j3, 0.8f);
                        jC2 = j4;
                    } else {
                        jC2 = j4;
                        jC3 = com.gamericefishpro.space.o1.s.c(jC2, 0.9f);
                    }
                    mVarG = com.gamericefishpro.space.l1.h.g(mVarG2, f6, dVarA, z4 ? com.gamericefishpro.space.o1.s.c(j3, 0.5f) : com.gamericefishpro.space.o1.s.c(jC2, 0.5f), jC3, 4);
                }
                com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(mVarF.c(mVarG), dVarA);
                if (z) {
                    jC4 = com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue() * 0.85f);
                } else if (!z4 && aVar != null) {
                    jC4 = com.gamericefishpro.space.o1.s.c(j3, 0.45f);
                } else if (z3) {
                    jC4 = com.gamericefishpro.space.o1.s.c(jC2, f);
                } else {
                    jC4 = com.gamericefishpro.space.o1.s.c(jC2, 0.35f);
                }
                com.gamericefishpro.space.o1.s sVar = new com.gamericefishpro.space.o1.s(jC4);
                long j5 = com.gamericefishpro.space.o1.s.b;
                if (!z3 || z) {
                    f2 = 0.7f;
                } else {
                    f2 = 0.5f;
                }
                com.gamericefishpro.space.h1.m mVarD = com.gamericefishpro.space.y.q.d(mVarB, com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(sVar, new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j5, f2))), 0.0f, 14), null, 6);
                if (!z || z3 != 0) {
                    f3 = f5;
                } else if (z4 || aVar == null) {
                    f3 = (float) 1.5d;
                } else {
                    f3 = 2;
                }
                if (z) {
                    jC2 = com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue());
                } else if (!z3) {
                    if (z4 || aVar == null) {
                        jC2 = com.gamericefishpro.space.o1.s.c(jC2, 0.45f);
                    } else {
                        jC2 = com.gamericefishpro.space.o1.s.c(j3, 0.8f);
                    }
                }
                com.gamericefishpro.space.h1.m mVarG3 = com.gamericefishpro.space.y.q.g(mVarD, f3, jC2, dVarA);
                rVar2 = rVar;
                rVar2.a0(-613613521);
                objP = rVar2.P();
                if (objP == fVar) {
                    objP = y0.d(rVar2);
                }
                com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
                rVar2.p(false);
                if (a0Var == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rVar2.a0(-613608305);
                boolean zF2 = rVar2.f(aVar);
                function2 = this.y;
                i2 = i;
                zF = zF2 | rVar2.f(function2) | rVar2.d(i2) | rVar2.d(i5);
                objP2 = rVar2.P();
                if (zF || objP2 == fVar) {
                    objP2 = new Function0() { // from class: com.gamericefishpro.space.n7.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (aVar != null) {
                                function2.invoke(Integer.valueOf(i2), Integer.valueOf(i5));
                            }
                            return Unit.a;
                        }
                    };
                    rVar2.k0(objP2);
                }
                rVar2.p(false);
                com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(mVarG3, iVar, z2, (Function0) objP2, 24);
                l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
                int iHashCode = Long.hashCode(rVar2.T);
                l1 l1VarL = rVar2.l();
                com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarI, rVar2);
                com.gamericefishpro.space.h2.g.a.getClass();
                yVar = com.gamericefishpro.space.h2.f.b;
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar);
                } else {
                    rVar2.n0();
                }
                com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, com.gamericefishpro.space.h2.f.e);
                com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, com.gamericefishpro.space.h2.f.d);
                com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
                com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.g);
                com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, com.gamericefishpro.space.h2.f.c);
                rVar2.a0(-2004329363);
                if (aVar != null) {
                    com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(aVar.c.d, rVar2, 0), null, com.gamericefishpro.space.hj.c.Y(com.gamericefishpro.space.d0.j.l(g1.c, 6), 1.0f), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar2, 25016, 104);
                    rVar2 = rVar2;
                    Unit unit = Unit.a;
                }
                rVar2.p(false);
                rVar2.p(true);
            }
            jC2 = j;
            j3 = jC5;
            mVarG = mVarG2;
            com.gamericefishpro.space.h1.m mVarB2 = com.gamericefishpro.space.l1.h.b(mVarF.c(mVarG), dVarA);
            if (z) {
                jC4 = com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue() * 0.85f);
            } else if (!z4) {
                if (z3) {
                    jC4 = com.gamericefishpro.space.o1.s.c(jC2, f);
                } else {
                    jC4 = com.gamericefishpro.space.o1.s.c(jC2, 0.35f);
                }
            } else if (z3) {
                jC4 = com.gamericefishpro.space.o1.s.c(jC2, f);
            } else {
                jC4 = com.gamericefishpro.space.o1.s.c(jC2, 0.35f);
            }
            com.gamericefishpro.space.o1.s sVar2 = new com.gamericefishpro.space.o1.s(jC4);
            long j6 = com.gamericefishpro.space.o1.s.b;
            if (z3) {
                f2 = 0.7f;
            } else {
                f2 = 0.7f;
            }
            com.gamericefishpro.space.h1.m mVarD2 = com.gamericefishpro.space.y.q.d(mVarB2, com.gamericefishpro.space.n9.a0.e(com.gamericefishpro.space.ph.x.f(sVar2, new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j6, f2))), 0.0f, 14), null, 6);
            if (!z) {
                f3 = f5;
            } else if (z4) {
                f3 = (float) 1.5d;
            } else {
                f3 = (float) 1.5d;
            }
            if (z) {
                jC2 = com.gamericefishpro.space.o1.s.c(j2, ((Number) s2Var.getValue()).floatValue());
            } else if (!z3) {
                if (z4) {
                    jC2 = com.gamericefishpro.space.o1.s.c(jC2, 0.45f);
                } else {
                    jC2 = com.gamericefishpro.space.o1.s.c(jC2, 0.45f);
                }
            }
            com.gamericefishpro.space.h1.m mVarG4 = com.gamericefishpro.space.y.q.g(mVarD2, f3, jC2, dVarA);
            rVar2 = rVar;
            rVar2.a0(-613613521);
            objP = rVar2.P();
            if (objP == fVar) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar2 = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            if (a0Var == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            rVar2.a0(-613608305);
            boolean zF3 = rVar2.f(aVar);
            function2 = this.y;
            i2 = i;
            zF = zF3 | rVar2.f(function2) | rVar2.d(i2) | rVar2.d(i5);
            objP2 = rVar2.P();
            if (zF) {
                objP2 = new Function0() { // from class: com.gamericefishpro.space.n7.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (aVar != null) {
                            function2.invoke(Integer.valueOf(i2), Integer.valueOf(i5));
                        }
                        return Unit.a;
                    }
                };
                rVar2.k0(objP2);
            } else {
                objP2 = new Function0() { // from class: com.gamericefishpro.space.n7.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (aVar != null) {
                            function2.invoke(Integer.valueOf(i2), Integer.valueOf(i5));
                        }
                        return Unit.a;
                    }
                };
                rVar2.k0(objP2);
            }
            rVar2.p(false);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.y.q.i(mVarG4, iVar2, z2, (Function0) objP2, 24);
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = com.gamericefishpro.space.d9.h.F(mVarI2, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD2, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar2, Integer.valueOf(iHashCode2), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar2, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, com.gamericefishpro.space.h2.f.c);
            rVar2.a0(-2004329363);
            if (aVar != null) {
                com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(aVar.c.d, rVar2, 0), null, com.gamericefishpro.space.hj.c.Y(com.gamericefishpro.space.d0.j.l(g1.c, 6), 1.0f), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar2, 25016, 104);
                rVar2 = rVar2;
                Unit unit2 = Unit.a;
            }
            rVar2.p(false);
            rVar2.p(true);
        }
        return Unit.a;
    }
}
