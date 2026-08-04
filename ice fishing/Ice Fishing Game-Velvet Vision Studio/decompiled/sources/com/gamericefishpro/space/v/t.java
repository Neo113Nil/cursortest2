package com.gamericefishpro.space.v;

import com.gamericefishpro.space.t0.o2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.w.f1;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.n1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Code duplicated, block: B:139:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:150:0x0304  */
    /* JADX WARN: Code duplicated, block: B:152:0x0316  */
    /* JADX WARN: Code duplicated, block: B:155:0x031c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0323  */
    /* JADX WARN: Code duplicated, block: B:167:0x037e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0381  */
    /* JADX WARN: Code duplicated, block: B:171:0x038d  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x041c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0457  */
    /* JADX WARN: Code duplicated, block: B:189:0x047d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0481  */
    public static final void a(l1 l1Var, Function1 function1, com.gamericefishpro.space.h1.m mVar, j0 j0Var, k0 k0Var, Function2 function2, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        com.gamericefishpro.space.b1.h hVar2;
        j0 j0Var2;
        boolean zF;
        Object objP;
        v0 v0Var;
        r0 r0Var;
        r0 r0Var2;
        l0 l0Var;
        boolean z;
        k0 k0Var2;
        r0 r0Var3;
        com.gamericefishpro.space.u6.l lVar;
        boolean z2;
        boolean z3;
        f1 f1VarA;
        f1 f1Var;
        boolean zH;
        Object objP2;
        j0 j0Var3;
        k0 k0Var3;
        boolean zG;
        Object objP3;
        Object objP4;
        Function0 function0;
        boolean z4;
        Object objP5;
        rVar.b0(1912839215);
        int i2 = i | (rVar.f(l1Var) ? 4 : 2) | (rVar.h(function1) ? 32 : 16) | (rVar.f(mVar) ? 256 : 128) | (rVar.f(j0Var) ? 2048 : 1024) | (rVar.f(k0Var) ? 16384 : 8192) | (rVar.h(function2) ? 131072 : 65536) | 1572864;
        if (rVar.S(i2 & 1, (4793491 & i2) != 4793490)) {
            com.gamericefishpro.space.t0.f1 f1Var2 = l1Var.d;
            com.gamericefishpro.space.g1.b bVar = l1Var.a;
            if (((Boolean) function1.invoke(f1Var2.getValue())).booleanValue() || ((Boolean) function1.invoke(bVar.k())).booleanValue() || l1Var.g() || l1Var.d()) {
                rVar.a0(-232413539);
                int i3 = i2 & 14;
                int i4 = i3 | 48;
                int i5 = i4 & 14;
                boolean z5 = ((i5 ^ 6) > 4 && rVar.f(l1Var)) || (i4 & 6) == 4;
                Object objP6 = rVar.P();
                com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                if (z5 || objP6 == fVar) {
                    objP6 = bVar.k();
                    rVar.k0(objP6);
                }
                if (l1Var.g()) {
                    objP6 = bVar.k();
                }
                rVar.a0(1844425648);
                y yVarB = b(l1Var, function1, objP6, rVar);
                rVar.p(false);
                Object value = l1Var.d.getValue();
                rVar.a0(1844425648);
                y yVarB2 = b(l1Var, function1, value, rVar);
                rVar.p(false);
                int i6 = i5 | 3072;
                com.gamericefishpro.space.r2.z zVar = n1.a;
                int i7 = (i6 & 14) ^ 6;
                boolean z6 = (i7 > 4 && rVar.f(l1Var)) || (i6 & 6) == 4;
                Object objP7 = rVar.P();
                if (z6 || objP7 == fVar) {
                    objP7 = new l1(new com.gamericefishpro.space.w.d0(yVarB), l1Var, y0.j(new StringBuilder(), l1Var.c, " > EnterExitTransition"));
                    rVar.k0(objP7);
                }
                l1 l1Var2 = (l1) objP7;
                boolean zF2 = ((i7 > 4 && rVar.f(l1Var)) || (i6 & 6) == 4) | rVar.f(l1Var2);
                Object objP8 = rVar.P();
                if (zF2 || objP8 == fVar) {
                    objP8 = new com.gamericefishpro.space.d0.q0(27, l1Var, l1Var2);
                    rVar.k0(objP8);
                }
                com.gamericefishpro.space.t0.i.d(l1Var2, (Function1) objP8, rVar);
                if (l1Var.g()) {
                    l1Var2.k(yVarB, yVarB2);
                } else {
                    l1Var2.p(yVarB2);
                    l1Var2.k.setValue(Boolean.FALSE);
                }
                Object objZ = com.gamericefishpro.space.t0.i.z(function2, rVar);
                com.gamericefishpro.space.g1.b bVar2 = l1Var2.a;
                com.gamericefishpro.space.g1.b bVar3 = l1Var2.a;
                com.gamericefishpro.space.t0.f1 f1Var3 = l1Var2.d;
                Object objInvoke = function2.invoke(bVar2.k(), f1Var3.getValue());
                boolean zF3 = rVar.f(l1Var2) | rVar.f(objZ);
                Object objP9 = rVar.P();
                com.gamericefishpro.space.th.a aVar = null;
                if (zF3 || objP9 == fVar) {
                    objP9 = new com.gamericefishpro.space.db.d(l1Var2, objZ, aVar, 15);
                    rVar.k0(objP9);
                }
                Function2 function3 = (Function2) objP9;
                Object objP10 = rVar.P();
                if (objP10 == fVar) {
                    objP10 = com.gamericefishpro.space.t0.i.v(objInvoke);
                    rVar.k0(objP10);
                }
                v0 v0Var2 = (v0) objP10;
                Unit unit = Unit.a;
                boolean zH2 = rVar.h(function3);
                Object objP11 = rVar.P();
                if (zH2 || objP11 == fVar) {
                    objP11 = new o2(function3, v0Var2, null, 0);
                    rVar.k0(objP11);
                }
                com.gamericefishpro.space.t0.i.e(rVar, unit, (Function2) objP11);
                Object objK = bVar3.k();
                y yVar = y.i;
                if (objK == yVar && f1Var3.getValue() == yVar && ((Boolean) v0Var2.getValue()).booleanValue()) {
                    rVar.a0(-272333293);
                    rVar.p(false);
                    hVar2 = hVar;
                    z4 = false;
                } else {
                    rVar.a0(-231383533);
                    boolean z7 = i3 == 4;
                    Object objP12 = rVar.P();
                    if (z7 || objP12 == fVar) {
                        objP12 = new v();
                        rVar.k0(objP12);
                    }
                    v vVar = (v) objP12;
                    com.gamericefishpro.space.u6.l lVar2 = f0.a;
                    Object objP13 = rVar.P();
                    if (objP13 == fVar) {
                        objP13 = d0.d;
                        rVar.k0(objP13);
                    }
                    Function0 function4 = (Function0) objP13;
                    boolean zF4 = rVar.f(l1Var2);
                    Object objP14 = rVar.P();
                    if (zF4 || objP14 == fVar) {
                        objP14 = com.gamericefishpro.space.t0.i.v(j0Var);
                        rVar.k0(objP14);
                    }
                    v0 v0Var3 = (v0) objP14;
                    if (bVar3.k() != f1Var3.getValue() || bVar3.k() != y.e) {
                        if (f1Var3.getValue() == y.e) {
                            r0 r0Var4 = ((j0) v0Var3.getValue()).a;
                            r0 r0Var5 = j0Var.a;
                            l0 l0Var2 = r0Var5.a;
                            if (l0Var2 == null) {
                                l0Var2 = r0Var4.a;
                            }
                            Map map = r0Var4.c;
                            Map map2 = r0Var5.c;
                            Intrinsics.checkNotNullParameter(map, "<this>");
                            Intrinsics.checkNotNullParameter(map2, "map");
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                            linkedHashMap.putAll(map2);
                            v0Var3.setValue(new j0(new r0(l0Var2, (t) null, linkedHashMap, 32)));
                        }
                        j0Var2 = (j0) v0Var3.getValue();
                        zF = rVar.f(l1Var2);
                        objP = rVar.P();
                        if (zF || objP == fVar) {
                            objP = com.gamericefishpro.space.t0.i.v(k0Var);
                            rVar.k0(objP);
                        }
                        v0Var = (v0) objP;
                        if (bVar3.k() == f1Var3.getValue() || bVar3.k() != y.e) {
                            if (f1Var3.getValue() != y.e) {
                                r0Var = ((k0) v0Var.getValue()).a;
                                r0Var2 = k0Var.a;
                                l0Var = r0Var2.a;
                                if (l0Var == null) {
                                    l0Var = r0Var.a;
                                }
                                if (!r0Var2.b || r0Var.b) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                Map map3 = r0Var.c;
                                Map map4 = r0Var2.c;
                                Intrinsics.checkNotNullParameter(map3, "<this>");
                                Intrinsics.checkNotNullParameter(map4, "map");
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                                linkedHashMap2.putAll(map4);
                                v0Var.setValue(new k0(new r0(l0Var, (t) null, z, linkedHashMap2)));
                            }
                        } else if (l1Var2.g()) {
                            v0Var.setValue(k0Var);
                        } else {
                            v0Var.setValue(k0.b);
                        }
                        k0Var2 = (k0) v0Var.getValue();
                        r0Var3 = j0Var2.a;
                        r0 r0Var6 = k0Var2.a;
                        rVar.a0(133898448);
                        rVar.p(false);
                        rVar.a0(134101063);
                        rVar.p(false);
                        rVar.a0(134345095);
                        rVar.p(false);
                        float[] fArr = com.gamericefishpro.space.p1.d.a;
                        rVar.a0(135150476);
                        rVar.p(false);
                        lVar = com.gamericefishpro.space.w.c.j;
                        if (r0Var3.a == null || r0Var6.a != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            rVar.a0(-703879421);
                            objP5 = rVar.P();
                            if (objP5 == fVar) {
                                objP5 = "Built-in alpha";
                                rVar.k0("Built-in alpha");
                            }
                            f1VarA = n1.a(l1Var2, lVar, (String) objP5, rVar, 384, 0);
                            z3 = false;
                            rVar.p(false);
                        } else {
                            z3 = false;
                            rVar.a0(-703709976);
                            rVar.p(false);
                            f1VarA = null;
                        }
                        rVar.a0(-703472888);
                        rVar.p(z3);
                        rVar.a0(-703222904);
                        rVar.p(z3);
                        f1Var = null;
                        zH = rVar.h(f1VarA) | rVar.f(j0Var2) | rVar.f(k0Var2) | rVar.h(null) | rVar.f(l1Var2) | rVar.h(null);
                        objP2 = rVar.P();
                        if (!zH || objP2 == fVar) {
                            objP2 = new a0(f1VarA, f1Var, l1Var2, j0Var2, k0Var2, f1Var);
                            j0Var3 = j0Var2;
                            k0Var3 = k0Var2;
                            rVar.k0(objP2);
                        } else {
                            j0Var3 = j0Var2;
                            k0Var3 = k0Var2;
                        }
                        a0 a0Var = (a0) objP2;
                        zG = rVar.g(true) | rVar.f(function4);
                        objP3 = rVar.P();
                        if (zG || objP3 == fVar) {
                            objP3 = new e0(true, function4);
                            rVar.k0(objP3);
                        }
                        com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
                        com.gamericefishpro.space.h1.m mVarC = com.gamericefishpro.space.o1.o.m(jVar, (Function1) objP3).c(new z(l1Var2, j0Var3, k0Var3, function4, a0Var)).c(jVar);
                        rVar.a0(-7432681);
                        rVar.p(false);
                        com.gamericefishpro.space.h1.m mVarC2 = mVar.c(mVarC.c(jVar));
                        objP4 = rVar.P();
                        if (objP4 == fVar) {
                            objP4 = new r(vVar);
                            rVar.k0(objP4);
                        }
                        r rVar2 = (r) objP4;
                        int iHashCode = Long.hashCode(rVar.T);
                        com.gamericefishpro.space.t0.l1 l1VarL = rVar.l();
                        com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarC2, rVar);
                        com.gamericefishpro.space.h2.g.a.getClass();
                        function0 = com.gamericefishpro.space.h2.f.b;
                        rVar.d0();
                        if (rVar.S) {
                            rVar.k(function0);
                        } else {
                            rVar.n0();
                        }
                        com.gamericefishpro.space.t0.i.B(rVar, rVar2, com.gamericefishpro.space.h2.f.e);
                        com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
                        com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
                        com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                        com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
                        hVar2 = hVar;
                        hVar2.a(vVar, rVar, 48);
                        rVar.p(true);
                        z4 = false;
                        rVar.p(false);
                    } else if (l1Var2.g()) {
                        v0Var3.setValue(j0Var);
                    } else {
                        v0Var3.setValue(j0.b);
                    }
                    j0Var2 = (j0) v0Var3.getValue();
                    zF = rVar.f(l1Var2);
                    objP = rVar.P();
                    if (zF) {
                        objP = com.gamericefishpro.space.t0.i.v(k0Var);
                        rVar.k0(objP);
                    } else {
                        objP = com.gamericefishpro.space.t0.i.v(k0Var);
                        rVar.k0(objP);
                    }
                    v0Var = (v0) objP;
                    if (bVar3.k() == f1Var3.getValue()) {
                        if (f1Var3.getValue() != y.e) {
                            r0Var = ((k0) v0Var.getValue()).a;
                            r0Var2 = k0Var.a;
                            l0Var = r0Var2.a;
                            if (l0Var == null) {
                                l0Var = r0Var.a;
                            }
                            if (r0Var2.b) {
                                z = true;
                            } else {
                                z = true;
                            }
                            Map map5 = r0Var.c;
                            Map map6 = r0Var2.c;
                            Intrinsics.checkNotNullParameter(map5, "<this>");
                            Intrinsics.checkNotNullParameter(map6, "map");
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map5);
                            linkedHashMap3.putAll(map6);
                            v0Var.setValue(new k0(new r0(l0Var, (t) null, z, linkedHashMap3)));
                        }
                    } else if (f1Var3.getValue() != y.e) {
                        r0Var = ((k0) v0Var.getValue()).a;
                        r0Var2 = k0Var.a;
                        l0Var = r0Var2.a;
                        if (l0Var == null) {
                            l0Var = r0Var.a;
                        }
                        if (r0Var2.b) {
                            z = true;
                        } else {
                            z = true;
                        }
                        Map map7 = r0Var.c;
                        Map map8 = r0Var2.c;
                        Intrinsics.checkNotNullParameter(map7, "<this>");
                        Intrinsics.checkNotNullParameter(map8, "map");
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(map7);
                        linkedHashMap4.putAll(map8);
                        v0Var.setValue(new k0(new r0(l0Var, (t) null, z, linkedHashMap4)));
                    }
                    k0Var2 = (k0) v0Var.getValue();
                    r0Var3 = j0Var2.a;
                    r0 r0Var7 = k0Var2.a;
                    rVar.a0(133898448);
                    rVar.p(false);
                    rVar.a0(134101063);
                    rVar.p(false);
                    rVar.a0(134345095);
                    rVar.p(false);
                    float[] fArr2 = com.gamericefishpro.space.p1.d.a;
                    rVar.a0(135150476);
                    rVar.p(false);
                    lVar = com.gamericefishpro.space.w.c.j;
                    if (r0Var3.a == null) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        rVar.a0(-703879421);
                        objP5 = rVar.P();
                        if (objP5 == fVar) {
                            objP5 = "Built-in alpha";
                            rVar.k0("Built-in alpha");
                        }
                        f1VarA = n1.a(l1Var2, lVar, (String) objP5, rVar, 384, 0);
                        z3 = false;
                        rVar.p(false);
                    } else {
                        z3 = false;
                        rVar.a0(-703709976);
                        rVar.p(false);
                        f1VarA = null;
                    }
                    rVar.a0(-703472888);
                    rVar.p(z3);
                    rVar.a0(-703222904);
                    rVar.p(z3);
                    f1Var = null;
                    zH = rVar.h(f1VarA) | rVar.f(j0Var2) | rVar.f(k0Var2) | rVar.h(null) | rVar.f(l1Var2) | rVar.h(null);
                    objP2 = rVar.P();
                    if (zH) {
                        objP2 = new a0(f1VarA, f1Var, l1Var2, j0Var2, k0Var2, f1Var);
                        j0Var3 = j0Var2;
                        k0Var3 = k0Var2;
                        rVar.k0(objP2);
                    } else {
                        objP2 = new a0(f1VarA, f1Var, l1Var2, j0Var2, k0Var2, f1Var);
                        j0Var3 = j0Var2;
                        k0Var3 = k0Var2;
                        rVar.k0(objP2);
                    }
                    a0 a0Var2 = (a0) objP2;
                    zG = rVar.g(true) | rVar.f(function4);
                    objP3 = rVar.P();
                    if (zG) {
                        objP3 = new e0(true, function4);
                        rVar.k0(objP3);
                    } else {
                        objP3 = new e0(true, function4);
                        rVar.k0(objP3);
                    }
                    com.gamericefishpro.space.h1.j jVar2 = com.gamericefishpro.space.h1.j.a;
                    com.gamericefishpro.space.h1.m mVarC3 = com.gamericefishpro.space.o1.o.m(jVar2, (Function1) objP3).c(new z(l1Var2, j0Var3, k0Var3, function4, a0Var2)).c(jVar2);
                    rVar.a0(-7432681);
                    rVar.p(false);
                    com.gamericefishpro.space.h1.m mVarC4 = mVar.c(mVarC3.c(jVar2));
                    objP4 = rVar.P();
                    if (objP4 == fVar) {
                        objP4 = new r(vVar);
                        rVar.k0(objP4);
                    }
                    r rVar3 = (r) objP4;
                    int iHashCode2 = Long.hashCode(rVar.T);
                    com.gamericefishpro.space.t0.l1 l1VarL2 = rVar.l();
                    com.gamericefishpro.space.h1.m mVarF2 = com.gamericefishpro.space.d9.h.F(mVarC4, rVar);
                    com.gamericefishpro.space.h2.g.a.getClass();
                    function0 = com.gamericefishpro.space.h2.f.b;
                    rVar.d0();
                    if (rVar.S) {
                        rVar.k(function0);
                    } else {
                        rVar.n0();
                    }
                    com.gamericefishpro.space.t0.i.B(rVar, rVar3, com.gamericefishpro.space.h2.f.e);
                    com.gamericefishpro.space.t0.i.B(rVar, l1VarL2, com.gamericefishpro.space.h2.f.d);
                    com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode2), com.gamericefishpro.space.h2.f.f);
                    com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
                    com.gamericefishpro.space.t0.i.B(rVar, mVarF2, com.gamericefishpro.space.h2.f.c);
                    hVar2 = hVar;
                    hVar2.a(vVar, rVar, 48);
                    rVar.p(true);
                    z4 = false;
                    rVar.p(false);
                }
                rVar.p(z4);
            } else {
                rVar.a0(-272333293);
                rVar.p(false);
                hVar2 = hVar;
            }
        } else {
            hVar2 = hVar;
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new s(l1Var, function1, mVar, j0Var, k0Var, function2, hVar2, i);
        }
    }

    public static final y b(l1 l1Var, Function1 function1, Object obj, com.gamericefishpro.space.t0.r rVar) {
        y yVar;
        rVar.W(-422486745, 0, l1Var, null);
        boolean zG = l1Var.g();
        com.gamericefishpro.space.g1.b bVar = l1Var.a;
        if (zG) {
            rVar.a0(-212166497);
            rVar.p(false);
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                yVar = y.e;
            } else {
                yVar = ((Boolean) function1.invoke(bVar.k())).booleanValue() ? y.i : y.d;
            }
        } else {
            rVar.a0(-211892364);
            Object objP = rVar.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
                rVar.k0(objP);
            }
            v0 v0Var = (v0) objP;
            if (((Boolean) function1.invoke(bVar.k())).booleanValue()) {
                v0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                yVar = y.e;
            } else {
                yVar = ((Boolean) v0Var.getValue()).booleanValue() ? y.i : y.d;
            }
            rVar.p(false);
        }
        rVar.p(false);
        return yVar;
    }
}
