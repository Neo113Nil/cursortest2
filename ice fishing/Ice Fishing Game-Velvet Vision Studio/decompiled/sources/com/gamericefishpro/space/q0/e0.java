package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.d0.i1;
import com.gamericefishpro.space.d0.k1;
import com.gamericefishpro.space.d0.m1;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.f2.h1;
import com.gamericefishpro.space.t0.o1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.t2;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {
    public static final float a = 16;

    /* JADX WARN: Code duplicated, block: B:74:0x013e  */
    public static final void a(com.gamericefishpro.space.h1.m mVar, Function2 function2, Function2 function3, Function2 function4, Function2 function5, int i, long j, long j2, k1 k1Var, final com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, final int i2, final int i3) {
        com.gamericefishpro.space.h1.m mVar2;
        int i4;
        long j3;
        final Function2 function6;
        final Function2 function7;
        final Function2 function8;
        final Function2 function9;
        final int i5;
        final long j4;
        final k1 k1Var2;
        final com.gamericefishpro.space.h1.m mVar3;
        Function2 function10;
        Function2 function11;
        Function2 function12;
        k1 i1Var;
        long j5;
        Function2 function13;
        int i6;
        rVar.b0(-1211482744);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            mVar2 = mVar;
        } else if ((i2 & 6) == 0) {
            mVar2 = mVar;
            i4 = i2 | (rVar.f(mVar2) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i4 = i2;
        }
        int i8 = i4 | 224688;
        if ((i2 & 1572864) == 0) {
            if ((i3 & 64) == 0) {
                j3 = j;
                int i9 = rVar.e(j3) ? 1048576 : 524288;
                i8 |= i9;
            } else {
                j3 = j;
            }
            i8 |= i9;
        } else {
            j3 = j;
        }
        int i10 = i8 | 37748736;
        if (rVar.S(i10 & 1, (306783379 & i10) != 306783378)) {
            rVar.X();
            if ((i2 & 1) == 0 || rVar.B()) {
                com.gamericefishpro.space.h1.m mVar4 = i7 != 0 ? com.gamericefishpro.space.h1.j.a : mVar2;
                com.gamericefishpro.space.b1.h hVar2 = d.a;
                function10 = d.b;
                function11 = d.c;
                function12 = d.d;
                if ((i3 & 64) != 0) {
                    j3 = ((a) rVar.j(b.a)).n;
                }
                t2 t2Var = b.a;
                rVar.a0(89374938);
                a aVar = (a) rVar.j(b.a);
                long j6 = aVar.a;
                long j7 = aVar.U;
                long j8 = aVar.Q;
                com.gamericefishpro.space.h1.m mVar5 = mVar4;
                long j9 = aVar.M;
                long j10 = aVar.q;
                if (com.gamericefishpro.space.o1.s.d(j3, j6)) {
                    j7 = aVar.b;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.f)) {
                    j7 = aVar.g;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.j)) {
                    j7 = aVar.k;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.n)) {
                    j7 = aVar.o;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.w)) {
                    j7 = aVar.x;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.c)) {
                    j7 = aVar.d;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.h)) {
                    j7 = aVar.i;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.l)) {
                    j7 = aVar.m;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.y)) {
                    j7 = aVar.z;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.u)) {
                    j7 = aVar.v;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.p)) {
                    j7 = j10;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.r)) {
                    j7 = aVar.s;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.D) || com.gamericefishpro.space.o1.s.d(j3, aVar.F) || com.gamericefishpro.space.o1.s.d(j3, aVar.G) || com.gamericefishpro.space.o1.s.d(j3, aVar.H) || com.gamericefishpro.space.o1.s.d(j3, aVar.I) || com.gamericefishpro.space.o1.s.d(j3, aVar.J) || com.gamericefishpro.space.o1.s.d(j3, aVar.E)) {
                    j7 = j10;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.K) || com.gamericefishpro.space.o1.s.d(j3, aVar.L)) {
                    j7 = j9;
                } else if (com.gamericefishpro.space.o1.s.d(j3, aVar.O) || com.gamericefishpro.space.o1.s.d(j3, aVar.P)) {
                    j7 = j8;
                } else if (!com.gamericefishpro.space.o1.s.d(j3, aVar.S) && !com.gamericefishpro.space.o1.s.d(j3, aVar.T)) {
                    j7 = com.gamericefishpro.space.o1.s.g;
                }
                long j11 = j7 != 16 ? j7 : ((com.gamericefishpro.space.o1.s) rVar.j(f.a)).a;
                rVar.p(false);
                WeakHashMap weakHashMap = m1.v;
                i1Var = new i1(com.gamericefishpro.space.d0.v.f(rVar).g, com.gamericefishpro.space.d0.v.f(rVar).b);
                j5 = j11;
                function13 = hVar2;
                mVar2 = mVar5;
                i6 = 2;
            } else {
                rVar.V();
                function13 = function2;
                function10 = function3;
                function11 = function4;
                function12 = function5;
                i6 = i;
                j5 = j2;
                i1Var = k1Var;
            }
            rVar.q();
            boolean zF = rVar.f(i1Var);
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (zF || objP == obj) {
                objP = new com.gamericefishpro.space.r0.b(i1Var);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.r0.b bVar = (com.gamericefishpro.space.r0.b) objP;
            boolean zF2 = rVar.f(bVar) | rVar.f(i1Var);
            Object objP2 = rVar.P();
            if (zF2 || objP2 == obj) {
                objP2 = new com.gamericefishpro.space.d0.q0(20, bVar, i1Var);
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.h1.m mVarJ = com.gamericefishpro.space.d0.j.j(mVar2, (Function1) objP2);
            com.gamericefishpro.space.b1.h hVarC = com.gamericefishpro.space.b1.n.c(848889571, new b0(i6, function13, hVar, function11, function12, bVar, function10), rVar);
            com.gamericefishpro.space.t0.a0 a0Var = l0.a;
            com.gamericefishpro.space.o1.g0 g0Var = com.gamericefishpro.space.o1.o.b;
            float f = 0;
            Function2 function14 = function13;
            o1 o1Var = l0.a;
            k1 k1Var3 = i1Var;
            float f2 = ((com.gamericefishpro.space.c3.f) rVar.j(o1Var)).d + f;
            com.gamericefishpro.space.t0.i.b(new com.gamericefishpro.space.n.p[]{f.a.a(new com.gamericefishpro.space.o1.s(j5)), o1Var.a(new com.gamericefishpro.space.c3.f(f2))}, com.gamericefishpro.space.b1.n.c(421772006, new k0(mVarJ, g0Var, j3, f2, f, hVarC), rVar), rVar, 56);
            function6 = function14;
            function7 = function10;
            function8 = function11;
            function9 = function12;
            j4 = j5;
            i5 = i6;
            mVar3 = mVar2;
            k1Var2 = k1Var3;
        } else {
            rVar.V();
            function6 = function2;
            function7 = function3;
            function8 = function4;
            function9 = function5;
            i5 = i;
            j4 = j2;
            k1Var2 = k1Var;
            mVar3 = mVar2;
        }
        final long j12 = j3;
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.q0.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(i2 | 1);
                    e0.a(mVar3, function6, function7, function8, function9, i5, j12, j4, k1Var2, hVar, (com.gamericefishpro.space.t0.r) obj2, iD, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final Function2 function2, final com.gamericefishpro.space.b1.h hVar, final Function2 function3, final Function2 function4, final k1 k1Var, final Function2 function5, com.gamericefishpro.space.t0.r rVar, final int i2) {
        rVar.b0(-280287501);
        int i3 = i2 | (rVar.d(i) ? 4 : 2) | (rVar.h(function2) ? 32 : 16) | (rVar.h(hVar) ? 256 : 128) | (rVar.h(function3) ? 2048 : 1024) | (rVar.h(function4) ? 16384 : 8192) | (rVar.f(k1Var) ? 131072 : 65536) | (rVar.h(function5) ? 1048576 : 524288);
        if (rVar.S(i3 & 1, (599187 & i3) != 599186)) {
            Object objP = rVar.P();
            Object obj = com.gamericefishpro.space.t0.n.a;
            if (objP == obj) {
                objP = new d0();
                rVar.k0(objP);
            }
            final d0 d0Var = (d0) objP;
            boolean z = (i3 & 112) == 32;
            Object objP2 = rVar.P();
            if (z || objP2 == obj) {
                objP2 = new com.gamericefishpro.space.b1.h(605195056, new c0(3, function2), true);
                rVar.k0(objP2);
            }
            final Function2 function6 = (Function2) objP2;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP3 = rVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new com.gamericefishpro.space.b1.h(418899191, new c0(2, function3), true);
                rVar.k0(objP3);
            }
            final Function2 function7 = (Function2) objP3;
            boolean z3 = (57344 & i3) == 16384;
            Object objP4 = rVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new com.gamericefishpro.space.b1.h(338600263, new c0(1, function4), true);
                rVar.k0(objP4);
            }
            final Function2 function8 = (Function2) objP4;
            boolean z4 = (i3 & 896) == 256;
            Object objP5 = rVar.P();
            if (z4 || objP5 == obj) {
                objP5 = new com.gamericefishpro.space.b1.h(-1776388365, new com.gamericefishpro.space.g5.m(4, hVar, d0Var), true);
                rVar.k0(objP5);
            }
            final Function2 function9 = (Function2) objP5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object objP6 = rVar.P();
            if (z5 || objP6 == obj) {
                objP6 = new com.gamericefishpro.space.b1.h(-1731662488, new c0(0, function5), true);
                rVar.k0(objP6);
            }
            final Function2 function10 = (Function2) objP6;
            boolean zF = ((i3 & 458752) == 131072) | rVar.f(function6) | rVar.f(function7) | rVar.f(function8) | ((i3 & 14) == 4) | rVar.f(function10) | rVar.f(function9);
            Object objP7 = rVar.P();
            if (zF || objP7 == obj) {
                Object obj2 = new Function2() { // from class: com.gamericefishpro.space.q0.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int iJ;
                        int iJ2;
                        int i4;
                        com.gamericefishpro.space.d4.o oVar;
                        Integer numValueOf;
                        int i5;
                        int iIntValue;
                        int iJ3;
                        final h1 h1Var = (h1) obj3;
                        com.gamericefishpro.space.c3.a aVar = (com.gamericefishpro.space.c3.a) obj4;
                        float f = e0.a;
                        final int iH = com.gamericefishpro.space.c3.a.h(aVar.a);
                        final int iG = com.gamericefishpro.space.c3.a.g(aVar.a);
                        long jA = com.gamericefishpro.space.c3.a.a(aVar.a, 0, 0, 0, 0, 10);
                        com.gamericefishpro.space.c3.l layoutDirection = h1Var.getLayoutDirection();
                        final k1 k1Var2 = k1Var;
                        int iD = k1Var2.d(h1Var, layoutDirection);
                        int iB = k1Var2.b(h1Var, h1Var.getLayoutDirection());
                        int iC = k1Var2.c(h1Var);
                        final com.gamericefishpro.space.f2.u0 u0VarE = ((com.gamericefishpro.space.f2.k0) CollectionsKt.w(h1Var.j(f0.d, function6))).e(jA);
                        int i6 = (-iD) - iB;
                        int i7 = -iC;
                        final com.gamericefishpro.space.f2.u0 u0VarE2 = ((com.gamericefishpro.space.f2.k0) CollectionsKt.w(h1Var.j(f0.i, function7))).e(com.gamericefishpro.space.c3.b.h(i6, i7, jA));
                        final com.gamericefishpro.space.f2.u0 u0VarE3 = ((com.gamericefishpro.space.f2.k0) CollectionsKt.w(h1Var.j(f0.v, function8))).e(com.gamericefishpro.space.c3.b.h(i6, i7, jA));
                        int i8 = u0VarE3.d;
                        int i9 = i;
                        if (i8 == 0 && u0VarE3.e == 0) {
                            oVar = null;
                        } else {
                            int i10 = u0VarE3.e;
                            if (i9 == 0) {
                                if (h1Var.getLayoutDirection() == com.gamericefishpro.space.c3.l.d) {
                                    iJ = h1Var.J(f);
                                    i4 = iJ + iD;
                                } else {
                                    iJ2 = h1Var.J(f);
                                    i4 = ((iH - iJ2) - i8) - iB;
                                }
                            } else if (i9 != 2 && i9 != 3) {
                                i4 = (((iH - i8) + iD) - iB) / 2;
                            } else if (h1Var.getLayoutDirection() == com.gamericefishpro.space.c3.l.d) {
                                iJ2 = h1Var.J(f);
                                i4 = ((iH - iJ2) - i8) - iB;
                            } else {
                                iJ = h1Var.J(f);
                                i4 = iJ + iD;
                            }
                            oVar = new com.gamericefishpro.space.d4.o();
                            oVar.a = i4;
                            oVar.b = i10;
                        }
                        final com.gamericefishpro.space.f2.u0 u0VarE4 = ((com.gamericefishpro.space.f2.k0) CollectionsKt.w(h1Var.j(f0.w, function10))).e(jA);
                        boolean z6 = u0VarE4.d == 0 && u0VarE4.e == 0;
                        if (oVar != null) {
                            int i11 = oVar.b;
                            if (z6 || i9 == 3) {
                                iJ3 = h1Var.J(f) + i11 + k1Var2.c(h1Var);
                            } else {
                                iJ3 = h1Var.J(f) + u0VarE4.e + i11;
                            }
                            numValueOf = Integer.valueOf(iJ3);
                        } else {
                            numValueOf = null;
                        }
                        int i12 = u0VarE2.e;
                        if (i12 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(u0VarE4.e);
                                if (z6) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : k1Var2.c(h1Var);
                            }
                            i5 = iIntValue + i12;
                        } else {
                            i5 = 0;
                        }
                        float fG0 = (u0VarE.d == 0 && u0VarE.e == 0) ? h1Var.g0(k1Var2.a(h1Var)) : h1Var.g0(u0VarE.e);
                        float fG1 = z6 ? h1Var.g0(k1Var2.c(h1Var)) : h1Var.g0(u0VarE4.e);
                        com.gamericefishpro.space.c3.l layoutDirection2 = h1Var.getLayoutDirection();
                        final com.gamericefishpro.space.d4.o oVar2 = oVar;
                        com.gamericefishpro.space.c3.l lVar = com.gamericefishpro.space.c3.l.d;
                        float fG2 = layoutDirection2 == lVar ? h1Var.g0(k1Var2.d(h1Var, layoutDirection2)) : h1Var.g0(k1Var2.b(h1Var, layoutDirection2));
                        final Integer num = numValueOf;
                        com.gamericefishpro.space.c3.l layoutDirection3 = h1Var.getLayoutDirection();
                        d0Var.a.setValue(new w0(fG2, fG0, layoutDirection3 == lVar ? h1Var.g0(k1Var2.b(h1Var, layoutDirection3)) : h1Var.g0(k1Var2.d(h1Var, layoutDirection3)), fG1));
                        final com.gamericefishpro.space.f2.u0 u0VarE5 = ((com.gamericefishpro.space.f2.k0) CollectionsKt.w(h1Var.j(f0.e, function9))).e(jA);
                        final int i13 = i5;
                        return h1Var.y(iH, iG, com.gamericefishpro.space.ph.m0.c(), new Function1() { // from class: com.gamericefishpro.space.q0.a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj5;
                                t0Var.h(u0VarE5, 0, 0, 0.0f);
                                t0Var.h(u0VarE, 0, 0, 0.0f);
                                com.gamericefishpro.space.f2.u0 u0Var = u0VarE2;
                                int i14 = iH - u0Var.d;
                                h1 h1Var2 = h1Var;
                                com.gamericefishpro.space.c3.l layoutDirection4 = h1Var2.getLayoutDirection();
                                k1 k1Var3 = k1Var2;
                                int iD2 = ((k1Var3.d(h1Var2, layoutDirection4) + i14) - k1Var3.b(h1Var2, h1Var2.getLayoutDirection())) / 2;
                                int i15 = iG;
                                t0Var.h(u0Var, iD2, i15 - i13, 0.0f);
                                com.gamericefishpro.space.f2.u0 u0Var2 = u0VarE4;
                                t0Var.h(u0Var2, 0, i15 - u0Var2.e, 0.0f);
                                com.gamericefishpro.space.d4.o oVar3 = oVar2;
                                if (oVar3 != null) {
                                    int i16 = oVar3.a;
                                    Integer num2 = num;
                                    Intrinsics.b(num2);
                                    t0Var.h(u0VarE3, i16, i15 - num2.intValue(), 0.0f);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                rVar.k0(obj2);
                objP7 = obj2;
            }
            com.gamericefishpro.space.f2.x.b(null, (Function2) objP7, rVar, 0, 1);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(i, function2, hVar, function3, function4, k1Var, function5, i2) { // from class: com.gamericefishpro.space.q0.z
                public final /* synthetic */ int d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ com.gamericefishpro.space.b1.h i;
                public final /* synthetic */ Function2 v;
                public final /* synthetic */ Function2 w;
                public final /* synthetic */ k1 y;
                public final /* synthetic */ Function2 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(1);
                    e0.b(this.d, this.e, this.i, this.v, this.w, this.y, this.z, (com.gamericefishpro.space.t0.r) obj3, iD);
                    return Unit.a;
                }
            };
        }
    }
}
