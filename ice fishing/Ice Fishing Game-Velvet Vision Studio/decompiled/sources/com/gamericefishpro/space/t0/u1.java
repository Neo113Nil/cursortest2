package com.gamericefishpro.space.t0;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends u {
    public final e a;
    public final com.gamericefishpro.space.r5.b b;
    public final Object c;
    public com.gamericefishpro.space.pi.d1 d;
    public Throwable e;
    public final ArrayList f;
    public Object g;
    public com.gamericefishpro.space.t.i0 h;
    public final com.gamericefishpro.space.v0.e i;
    public final ArrayList j;
    public final ArrayList k;
    public final com.gamericefishpro.space.t.h0 l;
    public final com.gamericefishpro.space.u6.l m;
    public final com.gamericefishpro.space.t.h0 n;
    public final com.gamericefishpro.space.t.h0 o;
    public ArrayList p;
    public LinkedHashSet q;
    public com.gamericefishpro.space.pi.h r;
    public com.gamericefishpro.space.m.d s;
    public boolean t;
    public final com.gamericefishpro.space.si.n0 u;
    public final com.gamericefishpro.space.a8.c v;
    public final com.gamericefishpro.space.pi.f1 w;
    public final CoroutineContext x;
    public final f y;
    public static final com.gamericefishpro.space.si.n0 z = com.gamericefishpro.space.si.e0.b(com.gamericefishpro.space.z0.b.w);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public u1(CoroutineContext coroutineContext) {
        e eVar = new e(new q1(this, 0));
        this.a = eVar;
        this.b = new com.gamericefishpro.space.r5.b(new q1(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new com.gamericefishpro.space.t.i0();
        this.i = new com.gamericefishpro.space.v0.e(new x[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new com.gamericefishpro.space.t.h0();
        this.m = new com.gamericefishpro.space.u6.l(12);
        this.n = new com.gamericefishpro.space.t.h0();
        this.o = new com.gamericefishpro.space.t.h0();
        this.u = com.gamericefishpro.space.si.e0.b(r1.i);
        this.v = new com.gamericefishpro.space.a8.c(1);
        com.gamericefishpro.space.pi.f1 f1Var = new com.gamericefishpro.space.pi.f1((com.gamericefishpro.space.pi.d1) coroutineContext.j(com.gamericefishpro.space.pi.u.e));
        f1Var.n(new com.gamericefishpro.space.a7.c(26, this));
        this.w = f1Var;
        this.x = coroutineContext.o(eVar).o(f1Var);
        this.y = new f(9);
    }

    public static final void G(ArrayList arrayList, u1 u1Var, x xVar) {
        arrayList.clear();
        synchronized (u1Var.c) {
            Iterator it = u1Var.k.iterator();
            if (it.hasNext()) {
                ((u0) it.next()).getClass();
                throw null;
            }
            Unit unit = Unit.a;
        }
    }

    public static void w(com.gamericefishpro.space.f1.c cVar) {
        try {
            if (cVar.w() instanceof com.gamericefishpro.space.f1.i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            cVar.c();
        } catch (Throwable th) {
            cVar.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.i != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((com.gamericefishpro.space.b1.a) ((com.gamericefishpro.space.b1.d) this.b.i).i).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.i != 0 || z() || B();
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List D() {
        ?? r0 = this.g;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? com.gamericefishpro.space.ph.g0.d : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        com.gamericefishpro.space.pi.f fVarY;
        synchronized (this.c) {
            fVarY = y();
            if (((r1) this.u.getValue()).compareTo(r1.e) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (fVarY != null) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            ((com.gamericefishpro.space.pi.h) fVarY).resumeWith(Unit.a);
        }
    }

    public final void F(x xVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((u0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, com.gamericefishpro.space.t.i0 i0Var) {
        com.gamericefishpro.space.f1.c cVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((u0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            x xVar = (x) entry.getKey();
            List list2 = (List) entry.getValue();
            if (xVar.O.F) {
                s.a("Check failed");
            }
            com.gamericefishpro.space.a7.c cVar = new com.gamericefishpro.space.a7.c(25, xVar);
            com.gamericefishpro.space.d0.q0 q0Var = new com.gamericefishpro.space.d0.q0(23, xVar, i0Var);
            com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
            com.gamericefishpro.space.f1.c cVar2 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
            if (cVar2 == null || (cVarC = cVar2.C(cVar, q0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                com.gamericefishpro.space.f1.g gVarJ2 = cVarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                u0 u0Var = (u0) list2.get(i2);
                                com.gamericefishpro.space.t.h0 h0Var = this.l;
                                u0Var.getClass();
                                Object objA = com.gamericefishpro.space.v0.a.a(h0Var);
                                arrayList.add(new Pair(u0Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.e == null) {
                                    com.gamericefishpro.space.u6.l lVar = this.m;
                                    ((u0) pair.d).getClass();
                                    if (((com.gamericefishpro.space.t.h0) lVar.d).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.e == null) {
                                                com.gamericefishpro.space.u6.l lVar2 = this.m;
                                                ((u0) pair2.d).getClass();
                                                com.gamericefishpro.space.t.h0 h0Var2 = (com.gamericefishpro.space.t.h0) lVar2.d;
                                                if (h0Var2.i()) {
                                                    ((com.gamericefishpro.space.t.h0) lVar2.e).a();
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((Pair) arrayList.get(i5)).e != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((Pair) arrayList.get(i6)).e == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair pair3 = (Pair) arrayList.get(i7);
                                        if (pair3.e == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        com.gamericefishpro.space.ph.c0.l(this.k, arrayList4);
                                        Unit unit = Unit.a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((Pair) obj2).e != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    xVar.r(arrayList);
                    Unit unit2 = Unit.a;
                    com.gamericefishpro.space.f1.g.q(gVarJ2);
                    w(cVarC);
                } catch (Throwable th2) {
                    com.gamericefishpro.space.f1.g.q(gVarJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(cVarC);
                throw th3;
            }
        }
        return CollectionsKt.L(map.keySet());
    }

    public final x I(x xVar, com.gamericefishpro.space.t.i0 i0Var) {
        com.gamericefishpro.space.f1.c cVarC;
        if (xVar.O.F || xVar.P == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.q;
        if (linkedHashSet == null || !linkedHashSet.contains(xVar)) {
            com.gamericefishpro.space.a7.c cVar = new com.gamericefishpro.space.a7.c(25, xVar);
            com.gamericefishpro.space.d0.q0 q0Var = new com.gamericefishpro.space.d0.q0(23, xVar, i0Var);
            com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
            com.gamericefishpro.space.f1.c cVar2 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
            if (cVar2 == null || (cVarC = cVar2.C(cVar, q0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                com.gamericefishpro.space.f1.g gVarJ2 = cVarC.j();
                if (i0Var != null) {
                    try {
                        if (i0Var.h()) {
                            com.gamericefishpro.space.e.e eVar = new com.gamericefishpro.space.e.e(10, i0Var, xVar);
                            r rVar = xVar.O;
                            if (rVar.F) {
                                s.a("Preparing a composition while composing is not supported");
                            }
                            rVar.F = true;
                            try {
                                eVar.invoke();
                                rVar.F = false;
                            } catch (Throwable th) {
                                rVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        com.gamericefishpro.space.f1.g.q(gVarJ2);
                        throw th2;
                    }
                }
                boolean zX = xVar.x();
                com.gamericefishpro.space.f1.g.q(gVarJ2);
                w(cVarC);
                if (zX) {
                    return xVar;
                }
            } catch (Throwable th3) {
                w(cVarC);
                throw th3;
            }
        }
        return null;
    }

    public final void J(Throwable th, x xVar) throws Throwable {
        int i = 27;
        if (!((Boolean) A.get()).booleanValue() || (th instanceof m)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                com.gamericefishpro.space.m.d dVar = this.s;
                if (dVar != null) {
                    throw ((Throwable) dVar.e);
                }
                this.s = new com.gamericefishpro.space.m.d(i, th);
                Unit unit = Unit.a;
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new com.gamericefishpro.space.t.i0();
                this.k.clear();
                this.l.a();
                this.n.a();
                this.s = new com.gamericefishpro.space.m.d(i, th);
                if (xVar != null) {
                    L(xVar);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            com.gamericefishpro.space.v0.g elements = new com.gamericefishpro.space.v0.g(this.h);
            this.h = new com.gamericefishpro.space.t.i0();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((x) listD.get(i)).y(elements);
                    if (((r1) this.u.getValue()).compareTo(r1.e) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    com.gamericefishpro.space.t.i0 i0Var = this.h;
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Iterator<E> it = elements.iterator();
                    while (it.hasNext()) {
                        i0Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(x xVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(xVar)) {
            arrayList.add(xVar);
        }
        if (this.f.remove(xVar)) {
            this.g = null;
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void a(x xVar, Function2 function2) throws Throwable {
        r1 r1Var;
        boolean zContains;
        com.gamericefishpro.space.f1.c cVarC;
        boolean z2 = xVar.O.F;
        synchronized (this.c) {
            r1 r1Var2 = (r1) this.u.getValue();
            r1Var = r1.e;
            zContains = r1Var2.compareTo(r1Var) > 0 ? true ^ D().contains(xVar) : true;
        }
        try {
            com.gamericefishpro.space.a7.c cVar = new com.gamericefishpro.space.a7.c(25, xVar);
            com.gamericefishpro.space.d0.q0 q0Var = new com.gamericefishpro.space.d0.q0(23, xVar, null);
            com.gamericefishpro.space.f1.g gVarJ = com.gamericefishpro.space.f1.p.j();
            com.gamericefishpro.space.f1.c cVar2 = gVarJ instanceof com.gamericefishpro.space.f1.c ? (com.gamericefishpro.space.f1.c) gVarJ : null;
            if (cVar2 == null || (cVarC = cVar2.C(cVar, q0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                com.gamericefishpro.space.f1.g gVarJ2 = cVarC.j();
                try {
                    xVar.j(function2);
                    Unit unit = Unit.a;
                    com.gamericefishpro.space.f1.g.q(gVarJ2);
                    w(cVarC);
                    synchronized (this.c) {
                        if (((r1) this.u.getValue()).compareTo(r1Var) > 0 && !D().contains(xVar)) {
                            this.f.add(xVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        com.gamericefishpro.space.f1.p.j().m();
                    }
                    try {
                        F(xVar);
                        try {
                            xVar.d();
                            xVar.f();
                            if (z2) {
                                return;
                            }
                            com.gamericefishpro.space.f1.p.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, xVar);
                    }
                } catch (Throwable th3) {
                    com.gamericefishpro.space.f1.g.q(gVarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(cVarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                    Unit unit2 = Unit.a;
                }
            }
            J(th5, xVar);
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final com.gamericefishpro.space.t.i0 b(x xVar, c2 c2Var, Function2 function2) {
        com.gamericefishpro.space.a8.c cVar = this.v;
        try {
            c2 c2Var2 = xVar.I;
            xVar.I = c2Var;
            try {
                a(xVar, function2);
                com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) cVar.get();
                if (i0Var == null) {
                    i0Var = com.gamericefishpro.space.t.q0.a;
                    Intrinsics.c(i0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                xVar.I = c2Var2;
                cVar.B(null);
                return i0Var;
            } catch (Throwable th) {
                xVar.I = c2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            cVar.B(null);
            throw th2;
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean e() {
        return false;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean f() {
        return false;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final long g() {
        return 1000;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final t h() {
        return null;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final CoroutineContext j() {
        return this.x;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final boolean k() {
        return false;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void l(x xVar) {
        com.gamericefishpro.space.pi.f fVarY;
        synchronized (this.c) {
            if (this.i.h(xVar)) {
                fVarY = null;
            } else {
                this.i.b(xVar);
                fVarY = y();
            }
        }
        if (fVarY != null) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            ((com.gamericefishpro.space.pi.h) fVarY).resumeWith(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final t0 m(u0 u0Var) {
        t0 t0Var;
        synchronized (this.c) {
            t0Var = (t0) this.n.k(u0Var);
        }
        return t0Var;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final com.gamericefishpro.space.t.i0 n(x xVar, c2 c2Var, com.gamericefishpro.space.t.i0 i0Var) {
        com.gamericefishpro.space.a8.c cVar = this.v;
        try {
            K();
            xVar.y(new com.gamericefishpro.space.v0.g(i0Var));
            c2 c2Var2 = xVar.I;
            xVar.I = c2Var;
            try {
                x xVarI = I(xVar, null);
                if (xVarI != null) {
                    F(xVar);
                    xVarI.d();
                    xVarI.f();
                }
                com.gamericefishpro.space.t.i0 i0Var2 = (com.gamericefishpro.space.t.i0) cVar.get();
                if (i0Var2 == null) {
                    i0Var2 = com.gamericefishpro.space.t.q0.a;
                    Intrinsics.c(i0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                xVar.I = c2Var2;
                cVar.B(null);
                return i0Var2;
            } catch (Throwable th) {
                xVar.I = c2Var2;
                throw th;
            }
        } catch (Throwable th2) {
            cVar.B(null);
            throw th2;
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void q(p1 p1Var) {
        com.gamericefishpro.space.a8.c cVar = this.v;
        com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) cVar.get();
        if (i0Var == null) {
            com.gamericefishpro.space.t.i0 i0Var2 = com.gamericefishpro.space.t.q0.a;
            i0Var = new com.gamericefishpro.space.t.i0();
            cVar.B(i0Var);
        }
        i0Var.a(p1Var);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void r(x xVar) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(xVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.t0.u
    public final g s(com.gamericefishpro.space.a2.b bVar) {
        com.gamericefishpro.space.r5.b bVar2 = this.b;
        com.gamericefishpro.space.b1.d dVar = (com.gamericefishpro.space.b1.d) bVar2.i;
        x0 x0Var = new x0();
        x0Var.a = bVar;
        return dVar.j(x0Var, (com.gamericefishpro.space.e.e) bVar2.v);
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void v(x xVar) {
        synchronized (this.c) {
            if (this.f.remove(xVar)) {
                this.g = null;
            }
            this.i.k(xVar);
            this.j.remove(xVar);
            Unit unit = Unit.a;
        }
    }

    public final void x() {
        synchronized (this.c) {
            try {
                if (((r1) this.u.getValue()).compareTo(r1.w) >= 0) {
                    com.gamericefishpro.space.si.n0 n0Var = this.u;
                    r1 r1Var = r1.e;
                    n0Var.getClass();
                    n0Var.j(null, r1Var);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w.c(null);
    }

    public final com.gamericefishpro.space.pi.f y() {
        r1 r1Var;
        com.gamericefishpro.space.si.n0 n0Var = this.u;
        int iCompareTo = ((r1) n0Var.getValue()).compareTo(r1.e);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        com.gamericefishpro.space.v0.e eVar = this.i;
        if (iCompareTo > 0) {
            if (this.s != null) {
                r1Var = r1.i;
            } else if (this.d == null) {
                this.h = new com.gamericefishpro.space.t.i0();
                eVar.g();
                r1Var = (z() || B()) ? r1.v : r1.i;
            } else {
                r1Var = (eVar.i != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? r1.y : r1.w;
            }
            n0Var.getClass();
            n0Var.j(null, r1Var);
            if (r1Var != r1.y) {
                return null;
            }
            com.gamericefishpro.space.pi.h hVar = this.r;
            this.r = null;
            return hVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = com.gamericefishpro.space.ph.g0.d;
        this.h = new com.gamericefishpro.space.t.i0();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        com.gamericefishpro.space.pi.h hVar2 = this.r;
        if (hVar2 != null) {
            hVar2.i(null);
        }
        this.r = null;
        this.s = null;
        return null;
    }

    public final boolean z() {
        return !this.t && (((com.gamericefishpro.space.b1.a) this.a.e.i).get() & 134217727) > 0;
    }

    @Override // com.gamericefishpro.space.t0.u
    public final void o(Set set) {
    }
}
