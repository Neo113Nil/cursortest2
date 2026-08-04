package com.gamericefishpro.space.v;

import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.f1;
import com.gamericefishpro.space.w.l1;
import com.gamericefishpro.space.w.n1;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(l1 l1Var, com.gamericefishpro.space.h1.m mVar, Function1 function1, com.gamericefishpro.space.h1.e eVar, Function1 function2, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        Function1 function3;
        com.gamericefishpro.space.t0.r rVar2;
        com.gamericefishpro.space.g1.b bVar;
        q qVar;
        f1 f1VarA;
        com.gamericefishpro.space.t0.r rVar3;
        Function1 function4 = function1;
        rVar.b0(511725103);
        if ((i & 6) == 0) {
            i2 = (rVar.f(l1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.f(eVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rVar.h(function2) ? 16384 : 8192;
        }
        com.gamericefishpro.space.b1.h hVar2 = hVar;
        if ((196608 & i) == 0) {
            i2 |= rVar.h(hVar2) ? 131072 : 65536;
        }
        if (rVar.S(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (z || objP == fVar) {
                objP = new q(l1Var, eVar);
                rVar.k0(objP);
            }
            q qVar2 = (q) objP;
            boolean z2 = i3 == 4;
            Object objP2 = rVar.P();
            Object obj = objP2;
            if (z2 || objP2 == fVar) {
                Object[] objArr = {l1Var.a.k()};
                com.gamericefishpro.space.f1.u uVar = new com.gamericefishpro.space.f1.u();
                uVar.addAll(com.gamericefishpro.space.ph.v.w(objArr));
                rVar.k0(uVar);
                obj = uVar;
            }
            com.gamericefishpro.space.f1.u uVar2 = (com.gamericefishpro.space.f1.u) obj;
            boolean z3 = i3 == 4;
            Object objP3 = rVar.P();
            if (z3 || objP3 == fVar) {
                long[] jArr = com.gamericefishpro.space.t.p0.a;
                objP3 = new com.gamericefishpro.space.t.h0();
                rVar.k0(objP3);
            }
            com.gamericefishpro.space.t.h0 h0Var = (com.gamericefishpro.space.t.h0) objP3;
            com.gamericefishpro.space.g1.b bVar2 = l1Var.a;
            com.gamericefishpro.space.t0.f1 f1Var = l1Var.d;
            if (!uVar2.contains(bVar2.k())) {
                uVar2.clear();
                uVar2.add(bVar2.k());
            }
            if (Intrinsics.a(bVar2.k(), f1Var.getValue())) {
                if (uVar2.size() != 1 || !Intrinsics.a(uVar2.get(0), bVar2.k())) {
                    uVar2.clear();
                    uVar2.add(bVar2.k());
                }
                if (h0Var.e != 1 || h0Var.c(bVar2.k())) {
                    h0Var.a();
                }
                qVar2.b = eVar;
            }
            if (Intrinsics.a(bVar2.k(), f1Var.getValue()) || uVar2.contains(f1Var.getValue())) {
                bVar = bVar2;
            } else {
                ListIterator listIterator = uVar2.listIterator();
                int i4 = 0;
                while (true) {
                    com.gamericefishpro.space.f1.a0 a0Var = (com.gamericefishpro.space.f1.a0) listIterator;
                    bVar = bVar2;
                    if (!a0Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (Intrinsics.a(function2.invoke(a0Var.next()), function2.invoke(f1Var.getValue()))) {
                            break;
                        }
                        i4++;
                        bVar2 = bVar;
                    }
                }
                if (i4 == -1) {
                    uVar2.add(f1Var.getValue());
                } else {
                    uVar2.set(i4, f1Var.getValue());
                }
            }
            if (h0Var.c(f1Var.getValue()) && h0Var.c(bVar.k())) {
                rVar.a0(1925931827);
                rVar.p(false);
                function3 = function4;
            } else {
                rVar.a0(1966410449);
                h0Var.a();
                int size = uVar2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = uVar2.get(i5);
                    h0Var.m(obj2, com.gamericefishpro.space.b1.n.c(-23915175, new e(l1Var, obj2, function4, qVar2, uVar2, hVar2), rVar));
                    i5++;
                    function4 = function4;
                    hVar2 = hVar;
                }
                function3 = function4;
                rVar.p(false);
            }
            boolean zF = rVar.f(l1Var.f()) | rVar.f(qVar2);
            Object objP4 = rVar.P();
            if (zF || objP4 == fVar) {
                objP4 = (x) function3.invoke(qVar2);
                rVar.k0(objP4);
            }
            x xVar = (x) objP4;
            l1 l1Var2 = qVar2.a;
            boolean zF2 = rVar.f(qVar2);
            Object objP5 = rVar.P();
            if (zF2 || objP5 == fVar) {
                objP5 = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
                rVar.k0(objP5);
            }
            v0 v0Var = (v0) objP5;
            v0 v0VarZ = com.gamericefishpro.space.t0.i.z(xVar.d, rVar);
            if (Intrinsics.a(l1Var2.a.k(), l1Var2.d.getValue())) {
                v0Var.setValue(Boolean.FALSE);
            } else if (v0VarZ.getValue() != null) {
                v0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) v0Var.getValue()).booleanValue();
            com.gamericefishpro.space.h1.m mVar2 = com.gamericefishpro.space.h1.j.a;
            if (zBooleanValue) {
                rVar.a0(1353077497);
                qVar = qVar2;
                com.gamericefishpro.space.t0.r rVar4 = rVar;
                f1VarA = n1.a(qVar2.a, com.gamericefishpro.space.w.c.q, null, rVar4, 0, 2);
                boolean zF3 = rVar4.f(f1VarA);
                Object objP6 = rVar4.P();
                if (zF3 || objP6 == fVar) {
                    objP6 = com.gamericefishpro.space.l1.h.c(mVar2);
                    rVar4.k0(objP6);
                }
                mVar2 = (com.gamericefishpro.space.h1.m) objP6;
                rVar4.p(false);
                rVar3 = rVar4;
            } else {
                com.gamericefishpro.space.t0.r rVar5 = rVar;
                qVar = qVar2;
                rVar5.a0(1353343539);
                rVar5.p(false);
                f1VarA = null;
                rVar3 = rVar5;
            }
            com.gamericefishpro.space.h1.m mVarC = mVar.c(mVar2.c(new m(f1VarA, v0VarZ, qVar)));
            Object objP7 = rVar3.P();
            if (objP7 == fVar) {
                objP7 = new j(qVar);
                rVar3.k0(objP7);
            }
            j jVar = (j) objP7;
            int iHashCode = Long.hashCode(rVar3.T);
            com.gamericefishpro.space.t0.l1 l1VarL = rVar3.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarC, rVar3);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar3.d0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar3, jVar, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar3, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar3, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar3, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar3, mVarF, com.gamericefishpro.space.h2.f.c);
            rVar3.a0(-860173498);
            int size2 = uVar2.size();
            int i6 = 0;
            while (i6 < size2) {
                com.gamericefishpro.space.f1.u uVar3 = uVar2;
                Object obj3 = uVar3.get(i6);
                rVar3.W(-2026002954, 0, function2.invoke(obj3), null);
                Function2 function5 = (Function2) h0Var.g(obj3);
                if (function5 == null) {
                    rVar3.a0(1618454323);
                } else {
                    rVar3.a0(-2026001778);
                    function5.invoke(rVar3, 0);
                }
                rVar3.p(false);
                rVar3.p(false);
                i6++;
                uVar2 = uVar3;
            }
            rVar3.p(false);
            rVar3.p(true);
            rVar2 = rVar3;
        } else {
            function3 = function4;
            com.gamericefishpro.space.t0.r rVar6 = rVar;
            rVar6.V();
            rVar2 = rVar6;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new f(l1Var, mVar, function3, eVar, function2, hVar, i);
        }
    }
}
