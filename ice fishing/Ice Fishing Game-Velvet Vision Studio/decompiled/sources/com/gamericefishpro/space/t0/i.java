package com.gamericefishpro.space.t0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final com.gamericefishpro.space.b1.h a = new com.gamericefishpro.space.b1.h(954879418, new com.gamericefishpro.space.r2.u(15), false);
    public static final com.gamericefishpro.space.b1.h b = new com.gamericefishpro.space.b1.h(1918065384, new com.gamericefishpro.space.r2.u(16), false);
    public static final com.gamericefishpro.space.h0.a c = new com.gamericefishpro.space.h0.a(4);
    public static final Object d = new Object();
    public static final g0 e = new g0();

    public static final void A(h2 h2Var, int i, Object obj) {
        int iH = h2Var.h(i);
        Object[] objArr = h2Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = n.a;
        if (obj == obj2) {
            return;
        }
        s.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void B(r rVar, Object obj, Function2 function2) {
        if (rVar.S || !Intrinsics.a(rVar.P(), obj)) {
            rVar.k0(obj);
            rVar.b(obj, function2);
        }
    }

    public static final int C(com.gamericefishpro.space.t.v vVar) {
        int iB;
        int i = vVar.b;
        int iB2 = vVar.b(0);
        while (vVar.b != 0 && vVar.b(0) == iB2) {
            int i2 = vVar.b;
            if (i2 == 0) {
                com.gamericefishpro.space.u.a.e("IntList is empty.");
                throw null;
            }
            vVar.d(0, vVar.a[i2 - 1]);
            vVar.c(vVar.b - 1);
            int i3 = vVar.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iB3 = vVar.b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iB4 = vVar.b(i7);
                if (i6 < i3 && (iB = vVar.b(i6)) > iB4) {
                    if (iB <= iB3) {
                        break;
                    }
                    vVar.d(i5, iB);
                    vVar.d(i6, iB3);
                    i5 = i6;
                } else {
                    if (iB4 <= iB3) {
                        break;
                    }
                    vVar.d(i5, iB4);
                    vVar.d(i7, iB3);
                    i5 = i7;
                }
            }
        }
        return iB2;
    }

    public static final int D(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final com.gamericefishpro.space.b1.l E(com.gamericefishpro.space.n.p[] pVarArr, l1 l1Var, l1 l1Var2) {
        com.gamericefishpro.space.b1.k kVar = new com.gamericefishpro.space.b1.k(com.gamericefishpro.space.b1.l.z);
        for (com.gamericefishpro.space.n.p pVar : pVarArr) {
            o1 o1Var = (o1) pVar.d;
            if (pVar.c || !((com.gamericefishpro.space.b1.l) l1Var).containsKey(o1Var)) {
                kVar.put(o1Var, o1Var.c(pVar, (v2) ((com.gamericefishpro.space.b1.l) l1Var2).get(o1Var)));
            }
        }
        return kVar.f();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(com.gamericefishpro.space.n.p pVar, Function2 function2, r rVar, int i) {
        v2 v2Var;
        boolean z;
        p1 p1VarT;
        rVar.b0(-149765515);
        com.gamericefishpro.space.h2.r rVar2 = rVar.x;
        l1 l1VarL = rVar.l();
        rVar.Y(201, s.b);
        Object objP = rVar.P();
        if (Intrinsics.a(objP, n.a)) {
            v2Var = null;
        } else {
            Intrinsics.c(objP, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            v2Var = (v2) objP;
        }
        o1 o1Var = (o1) pVar.d;
        v2 v2VarC = o1Var.c(pVar, v2Var);
        boolean zEquals = v2VarC.equals(v2Var);
        if (!zEquals) {
            rVar.k0(v2VarC);
        }
        if (!rVar.S) {
            d2 d2Var = rVar.G;
            Object objB = d2Var.b(d2Var.b, d2Var.g);
            Intrinsics.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            l1 l1Var = (l1) objB;
            if (!(rVar.E() && zEquals) && (pVar.c || !((com.gamericefishpro.space.b1.l) l1VarL).containsKey(o1Var))) {
                l1VarL = ((com.gamericefishpro.space.b1.l) l1VarL).i(o1Var, v2VarC);
            } else if ((zEquals && !rVar.w) || !rVar.w) {
                l1VarL = l1Var;
            }
            if (rVar.y || l1Var != l1VarL) {
                z = true;
            }
            if (z && !rVar.S) {
                rVar.N(l1VarL);
            }
            rVar2.c(rVar.w ? 1 : 0);
            rVar.w = z;
            rVar.K = l1VarL;
            rVar.W(202, 0, s.c, l1VarL);
            function2.invoke(rVar, Integer.valueOf((i >> 3) & 14));
            rVar.p(false);
            rVar.p(false);
            rVar.w = rVar2.b() != 0;
            rVar.K = null;
            p1VarT = rVar.t();
            if (p1VarT != null) {
                p1VarT.d = new com.gamericefishpro.space.b1.f(i, 6, pVar, function2);
            }
        }
        if (pVar.c || !((com.gamericefishpro.space.b1.l) l1VarL).containsKey(o1Var)) {
            l1VarL = ((com.gamericefishpro.space.b1.l) l1VarL).i(o1Var, v2VarC);
        }
        rVar.J = true;
        z = false;
        if (z) {
            rVar.N(l1VarL);
        }
        rVar2.c(rVar.w ? 1 : 0);
        rVar.w = z;
        rVar.K = l1VarL;
        rVar.W(202, 0, s.c, l1VarL);
        function2.invoke(rVar, Integer.valueOf((i >> 3) & 14));
        rVar.p(false);
        rVar.p(false);
        rVar.w = rVar2.b() != 0;
        rVar.K = null;
        p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.b1.f(i, 6, pVar, function2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(com.gamericefishpro.space.n.p[] pVarArr, Function2 function2, r rVar, int i) {
        l1 l1VarJ0;
        boolean z;
        p1 p1VarT;
        rVar.b0(415205898);
        com.gamericefishpro.space.h2.r rVar2 = rVar.x;
        l1 l1VarL = rVar.l();
        rVar.Y(201, s.b);
        if (rVar.S) {
            l1VarJ0 = rVar.j0(l1VarL, E(pVarArr, l1VarL, com.gamericefishpro.space.b1.l.z));
            rVar.J = true;
        } else {
            d2 d2Var = rVar.G;
            Object objH = d2Var.h(d2Var.g, 0);
            Intrinsics.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            l1 l1Var = (l1) objH;
            d2 d2Var2 = rVar.G;
            Object objH2 = d2Var2.h(d2Var2.g, 1);
            Intrinsics.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            l1 l1Var2 = (l1) objH2;
            com.gamericefishpro.space.b1.l lVarE = E(pVarArr, l1VarL, l1Var2);
            if (!rVar.E() || rVar.y || !l1Var2.equals(lVarE)) {
                l1VarJ0 = rVar.j0(l1VarL, lVarE);
                if (rVar.y || !Intrinsics.a(l1VarJ0, l1Var)) {
                    z = true;
                }
                if (z && !rVar.S) {
                    rVar.N(l1VarJ0);
                }
                rVar2.c(rVar.w ? 1 : 0);
                rVar.w = z;
                rVar.K = l1VarJ0;
                rVar.W(202, 0, s.c, l1VarJ0);
                function2.invoke(rVar, Integer.valueOf((i >> 3) & 14));
                rVar.p(false);
                rVar.p(false);
                rVar.w = rVar2.b() != 0;
                rVar.K = null;
                p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.b1.f(i, 7, pVarArr, function2);
                }
            }
            rVar.l = rVar.G.s() + rVar.l;
            l1VarJ0 = l1Var;
        }
        z = false;
        if (z) {
            rVar.N(l1VarJ0);
        }
        rVar2.c(rVar.w ? 1 : 0);
        rVar.w = z;
        rVar.K = l1VarJ0;
        rVar.W(202, 0, s.c, l1VarJ0);
        function2.invoke(rVar, Integer.valueOf((i >> 3) & 14));
        rVar.p(false);
        rVar.p(false);
        rVar.w = rVar2.b() != 0;
        rVar.K = null;
        p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.b1.f(i, 7, pVarArr, function2);
        }
    }

    public static final void c(Object obj, Object obj2, Function1 function1, r rVar) {
        boolean zF = rVar.f(obj) | rVar.f(obj2);
        Object objP = rVar.P();
        if (zF || objP == n.a) {
            objP = new e0(function1);
            rVar.k0(objP);
        }
    }

    public static final void d(Object obj, Function1 function1, r rVar) {
        boolean zF = rVar.f(obj);
        Object objP = rVar.P();
        if (zF || objP == n.a) {
            objP = new e0(function1);
            rVar.k0(objP);
        }
    }

    public static final void e(r rVar, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = rVar.R;
        boolean zF = rVar.f(obj);
        Object objP = rVar.P();
        if (zF || objP == n.a) {
            objP = new q0(coroutineContext, function2);
            rVar.k0(objP);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, r rVar) {
        CoroutineContext coroutineContext = rVar.R;
        boolean zF = rVar.f(obj) | rVar.f(obj2);
        Object objP = rVar.P();
        if (zF || objP == n.a) {
            objP = new q0(coroutineContext, function2);
            rVar.k0(objP);
        }
    }

    public static final void g(Function0 function0, r rVar) {
        com.gamericefishpro.space.u0.l0 l0Var = rVar.M.b.c;
        l0Var.w0(com.gamericefishpro.space.u0.b0.c);
        com.gamericefishpro.space.i.a.M(l0Var, 0, function0);
    }

    public static final void h(List list, int i, int i2) {
        int iQ = q(i, list);
        if (iQ < 0) {
            iQ = -(iQ + 1);
        }
        while (iQ < list.size() && ((m0) list.get(iQ)).b < i2) {
        }
    }

    public static final void i(com.gamericefishpro.space.t.v vVar, int i) {
        if (vVar.b == 0 || !(vVar.b(0) == i || vVar.b(vVar.b - 1) == i)) {
            int i2 = vVar.b;
            vVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iB = vVar.b(i3);
                if (i <= iB) {
                    break;
                }
                vVar.d(i2, iB);
                i2 = i3;
            }
            vVar.d(i2, i);
        }
    }

    public static void j(h2 h2Var, List list, x xVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = h2Var.c((a) list.get(i));
            int iN = h2Var.N(h2Var.b, h2Var.r(iC));
            Object obj = iN < h2Var.g(h2Var.b, h2Var.r(iC + 1)) ? h2Var.c[h2Var.h(iN)] : n.a;
            p1 p1Var = obj instanceof p1 ? (p1) obj : null;
            if (p1Var != null) {
                p1Var.a = xVar;
            }
        }
    }

    public static final v0 k(com.gamericefishpro.space.si.e eVar, Object obj, CoroutineContext coroutineContext, r rVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlin.coroutines.g.d;
        }
        boolean zH = rVar.h(coroutineContext) | rVar.h(eVar);
        Object objP = rVar.P();
        com.gamericefishpro.space.th.a aVar = null;
        Object obj2 = n.a;
        if (zH || objP == obj2) {
            objP = new com.gamericefishpro.space.db.d(coroutineContext, eVar, aVar, 10);
            rVar.k0(objP);
        }
        Function2 function2 = (Function2) objP;
        Object objP2 = rVar.P();
        if (objP2 == obj2) {
            objP2 = v(obj);
            rVar.k0(objP2);
        }
        v0 v0Var = (v0) objP2;
        boolean zH2 = rVar.h(function2);
        Object objP3 = rVar.P();
        if (zH2 || objP3 == obj2) {
            objP3 = new o2(function2, v0Var, aVar, 1);
            rVar.k0(objP3);
        }
        f(eVar, coroutineContext, (Function2) objP3, rVar);
        return v0Var;
    }

    public static final v0 l(com.gamericefishpro.space.si.l0 l0Var, r rVar) {
        return k(l0Var, l0Var.getValue(), kotlin.coroutines.g.d, rVar, 0, 0);
    }

    public static final void m(d2 d2Var, ArrayList arrayList, int i) {
        boolean zL = d2Var.l(i);
        int[] iArr = d2Var.b;
        if (zL) {
            arrayList.add(d2Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m(d2Var, arrayList, i3);
        }
    }

    public static final com.gamericefishpro.space.pi.x n(kotlin.coroutines.g gVar, r rVar) {
        com.gamericefishpro.space.pi.u key = com.gamericefishpro.space.pi.u.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return new a2(rVar.R, gVar);
    }

    public static final com.gamericefishpro.space.v0.e o() {
        com.gamericefishpro.space.a8.c cVar = n2.b;
        com.gamericefishpro.space.v0.e eVar = (com.gamericefishpro.space.v0.e) cVar.get();
        if (eVar != null) {
            return eVar;
        }
        com.gamericefishpro.space.v0.e eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.f1.w[0]);
        cVar.B(eVar2);
        return eVar2;
    }

    public static final d0 p(Function0 function0) {
        com.gamericefishpro.space.a8.c cVar = n2.a;
        return new d0(function0, null);
    }

    public static final int q(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iD = Intrinsics.d(((m0) list.get(i3)).b, i);
            if (iD < 0) {
                i2 = i3 + 1;
            } else {
                if (iD <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final long r(r rVar) {
        return rVar.T;
    }

    public static final s0 s(CoroutineContext coroutineContext) {
        s0 s0Var = (s0) coroutineContext.j(f.i);
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void t(r rVar, Integer num, Function2 function2) {
        if (rVar.S) {
            rVar.b(num, function2);
        }
    }

    public static List u(h2 h2Var, int i, h2 h2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iU = h2Var.u(i);
        int i2 = i + iU;
        int iF = h2Var.f(i);
        int iF2 = h2Var.f(i2);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (h2Var.b[(h2Var.r(i) * 5) + 1] & 201326592) != 0;
        h2Var2.w(iU);
        h2Var2.x(i3, h2Var2.t);
        if (h2Var.g < i2) {
            h2Var.B(i2);
        }
        if (h2Var.k < iF2) {
            h2Var.C(iF2, i2);
        }
        int[] iArr = h2Var2.b;
        int i4 = h2Var2.t;
        int i5 = i4 * 5;
        com.gamericefishpro.space.ph.u.c(i5, i * 5, i2 * 5, h2Var.b, iArr);
        Object[] objArr = h2Var2.c;
        int i6 = h2Var2.i;
        System.arraycopy(h2Var.c, iF, objArr, i6, i3);
        int i7 = h2Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iU;
        int iG = i6 - h2Var2.g(iArr, i4);
        int i10 = h2Var2.m;
        int i11 = h2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = h2.i(h2Var2.g(iArr, i13) + iG, i12 < i13 ? 0 : h2Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        h2Var2.m = i12;
        int iB = g2.b(h2Var.d, i, h2Var.p());
        int iB2 = g2.b(h2Var.d, i2, h2Var.p());
        if (iB < iB2) {
            ArrayList arrayList = h2Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                a aVar = (a) arrayList.get(i15);
                aVar.a += i8;
                arrayList2.add(aVar);
            }
            h2Var2.d.addAll(g2.b(h2Var2.d, h2Var2.t, h2Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = com.gamericefishpro.space.ph.g0.d;
        }
        if (!list.isEmpty()) {
            HashMap map = h2Var.e;
            HashMap map2 = h2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = h2Var2.v;
        h2Var2.O(i7);
        int iE = h2Var.E(h2Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                h2Var.P();
                h2Var.a(iE - h2Var.t);
                h2Var.P();
            }
            h2Var.a(i - h2Var.t);
            boolean zH = h2Var.H();
            if (z7) {
                h2Var.M();
                h2Var.j();
                h2Var.M();
                h2Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = h2Var.I(i, iU);
            h2Var.J(iF, i3, i - 1);
            z4 = zI;
        }
        if (z4) {
            s.a("Unexpectedly removed anchors");
        }
        int i18 = h2Var2.o;
        int i19 = iArr3[i5 + 1];
        h2Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            h2Var2.t = i9;
            h2Var2.i = i6 + i3;
        }
        if (z6) {
            h2Var2.T(i7);
        }
        return list;
    }

    public static f1 v(Object obj) {
        return new f1(obj, f.z);
    }

    public static final Object w(l1 l1Var, o1 o1Var) {
        Intrinsics.c(o1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        com.gamericefishpro.space.b1.l lVar = (com.gamericefishpro.space.b1.l) l1Var;
        Object objB = lVar.get(o1Var);
        if (objB == null) {
            objB = o1Var.b();
        }
        return ((v2) objB).a(lVar);
    }

    public static final void x(r rVar, Function1 function1) {
        rVar.b(Unit.a, new com.gamericefishpro.space.d0.n1(13, function1));
    }

    public static final q y(r rVar) {
        r rVar2;
        rVar.Y(206, s.e);
        if (rVar.S) {
            h2.z(rVar.I);
        }
        Object objH = rVar.H();
        y1 b2Var = objH instanceof y1 ? (y1) objH : null;
        if (b2Var == null) {
            rVar2 = rVar;
            b2Var = new b2(new p(new q(rVar2, rVar.T, rVar.q, rVar.C, rVar.h.M)), -1);
            rVar2.l0(b2Var);
        } else {
            rVar2 = rVar;
        }
        x1 x1Var = b2Var.a;
        Intrinsics.c(x1Var, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        q qVar = ((p) x1Var).d;
        qVar.f.setValue(rVar2.l());
        rVar2.p(false);
        return qVar;
    }

    public static final v0 z(Object obj, r rVar) {
        Object objP = rVar.P();
        if (objP == n.a) {
            objP = v(obj);
            rVar.k0(objP);
        }
        v0 v0Var = (v0) objP;
        v0Var.setValue(obj);
        return v0Var;
    }
}
