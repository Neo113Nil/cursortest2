package com.gamericefishpro.space.pi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class l1 implements d1, r1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public l1(boolean z) {
        this._state$volatile = z ? a0.j : a0.i;
    }

    public static l Z(com.gamericefishpro.space.ui.i iVar) {
        while (iVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.i.e;
            com.gamericefishpro.space.ui.i iVarF = iVar.f();
            if (iVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (com.gamericefishpro.space.ui.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarF;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof l) {
                    return (l) iVar;
                }
                if (iVar instanceof n1) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof k1)) {
            if (obj instanceof z0) {
                return ((z0) obj).b() ? "Active" : "New";
            }
            return obj instanceof q ? "Cancelled" : "Completed";
        }
        k1 k1Var = (k1) obj;
        if (k1Var.e()) {
            return "Cancelling";
        }
        return k1.e.get(k1Var) == 1 ? "Completing" : "Active";
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && L();
    }

    public final void C(z0 z0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.a();
            atomicReferenceFieldUpdater.set(this, p1.d);
        }
        com.gamericefishpro.space.bb.n nVar = null;
        q qVar = obj instanceof q ? (q) obj : null;
        Throwable th = qVar != null ? qVar.a : null;
        if (z0Var instanceof h1) {
            try {
                ((h1) z0Var).l(th);
                return;
            } catch (Throwable th2) {
                R(new com.gamericefishpro.space.bb.n("Exception in completion handler " + z0Var + " for " + this, th2));
                return;
            }
        }
        n1 n1VarD = z0Var.d();
        if (n1VarD != null) {
            n1VarD.e(new com.gamericefishpro.space.ui.h(1), 1);
            Object obj2 = com.gamericefishpro.space.ui.i.d.get(n1VarD);
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (com.gamericefishpro.space.ui.i iVarH = (com.gamericefishpro.space.ui.i) obj2; !iVarH.equals(n1VarD); iVarH = iVarH.h()) {
                if (iVarH instanceof h1) {
                    try {
                        ((h1) iVarH).l(th);
                    } catch (Throwable th3) {
                        if (nVar != null) {
                            com.gamericefishpro.space.oh.c.a(nVar, th3);
                        } else {
                            nVar = new com.gamericefishpro.space.bb.n("Exception in completion handler " + iVarH + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (nVar != null) {
                R(nVar);
            }
        }
    }

    public final Throwable D(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        l1 l1Var = (l1) ((r1) obj);
        Object obj2 = d.get(l1Var);
        if (obj2 instanceof k1) {
            thC = ((k1) obj2).c();
        } else if (obj2 instanceof q) {
            thC = ((q) obj2).a;
        } else {
            if (obj2 instanceof z0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new e1("Parent job is ".concat(g0(obj2)), thC, l1Var) : cancellationException;
    }

    public final Object G(k1 k1Var, Object obj) {
        Throwable thI;
        q qVar = obj instanceof q ? (q) obj : null;
        Throwable th = qVar != null ? qVar.a : null;
        synchronized (k1Var) {
            k1Var.e();
            ArrayList arrayListF = k1Var.f(th);
            thI = I(k1Var, arrayListF);
            if (thI != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListF.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thI && th2 != thI && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        com.gamericefishpro.space.oh.c.a(thI, th2);
                    }
                }
            }
        }
        if (thI != null && thI != th) {
            obj = new q(thI, false);
        }
        if (thI != null && (v(thI) || Q(thI))) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            q.b.compareAndSet((q) obj, 0, 1);
        }
        b0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object a1Var = obj instanceof z0 ? new a1((z0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, k1Var, a1Var) && atomicReferenceFieldUpdater.get(this) == k1Var) {
        }
        C(k1Var, obj);
        return obj;
    }

    public final Object H() throws Throwable {
        Object obj = d.get(this);
        if (obj instanceof z0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof q) {
            throw ((q) obj).a;
        }
        return a0.C(obj);
    }

    public final Throwable I(k1 k1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (k1Var.e()) {
                return new e1(A(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof y1) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof y1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final m0 J(boolean z, boolean z2, g1 g1Var) {
        return T(z2, z ? new b1(g1Var) : new n0(1, g1Var));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext K(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public boolean L() {
        return true;
    }

    public boolean O() {
        return this instanceof n;
    }

    public final n1 P(z0 z0Var) {
        n1 n1VarD = z0Var.d();
        if (n1VarD != null) {
            return n1VarD;
        }
        if (z0Var instanceof o0) {
            return new n1();
        }
        if (z0Var instanceof h1) {
            e0((h1) z0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + z0Var).toString());
    }

    public boolean Q(Throwable th) {
        return false;
    }

    public final void S(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        p1 p1Var = p1.d;
        if (d1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        d1Var.start();
        k kVarZ = d1Var.z(this);
        atomicReferenceFieldUpdater.set(this, kVarZ);
        if (U()) {
            kVarZ.a();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    public final m0 T(boolean z, h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zE;
        h1Var.v = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof o0;
            p1 p1Var = p1.d;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof z0)) {
                    z2 = false;
                    break;
                }
                z0 z0Var = (z0) obj;
                n1 n1VarD = z0Var.d();
                if (n1VarD == null) {
                    e0((h1) obj);
                } else {
                    if (h1Var.k()) {
                        k1 k1Var = z0Var instanceof k1 ? (k1) z0Var : null;
                        Throwable thC = k1Var != null ? k1Var.c() : null;
                        if (thC == null) {
                            zE = n1VarD.e(h1Var, 5);
                        } else if (z) {
                            h1Var.l(thC);
                            return p1Var;
                        }
                    } else {
                        zE = n1VarD.e(h1Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                o0 o0Var = (o0) obj;
                if (o0Var.d) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    d0(o0Var);
                }
            }
            return p1Var;
        }
        if (z2) {
            return h1Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            q qVar = obj2 instanceof q ? (q) obj2 : null;
            h1Var.l(qVar != null ? qVar.a : null);
        }
        return p1Var;
    }

    public final boolean U() {
        return !(d.get(this) instanceof z0);
    }

    public boolean V() {
        return this instanceof c;
    }

    public final boolean W(Object obj) {
        Object objH0;
        do {
            objH0 = h0(d.get(this), obj);
            if (objH0 == a0.d) {
                return false;
            }
            if (objH0 == a0.e) {
                return true;
            }
        } while (objH0 == a0.f);
        m(objH0);
        return true;
    }

    public final Object X(Object obj) {
        Object objH0;
        do {
            objH0 = h0(d.get(this), obj);
            if (objH0 == a0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                q qVar = obj instanceof q ? (q) obj : null;
                throw new IllegalStateException(str, qVar != null ? qVar.a : null);
            }
        } while (objH0 == a0.f);
        return objH0;
    }

    public String Y() {
        return getClass().getSimpleName();
    }

    public final void a0(n1 n1Var, Throwable th) {
        n1Var.e(new com.gamericefishpro.space.ui.h(4), 4);
        Object obj = com.gamericefishpro.space.ui.i.d.get(n1Var);
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        com.gamericefishpro.space.bb.n nVar = null;
        for (com.gamericefishpro.space.ui.i iVarH = (com.gamericefishpro.space.ui.i) obj; !iVarH.equals(n1Var); iVarH = iVarH.h()) {
            if ((iVarH instanceof h1) && ((h1) iVarH).k()) {
                try {
                    ((h1) iVarH).l(th);
                } catch (Throwable th2) {
                    if (nVar != null) {
                        com.gamericefishpro.space.oh.c.a(nVar, th2);
                    } else {
                        nVar = new com.gamericefishpro.space.bb.n("Exception in completion handler " + iVarH + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (nVar != null) {
            R(nVar);
        }
        v(th);
    }

    @Override // com.gamericefishpro.space.pi.d1
    public boolean b() {
        Object obj = d.get(this);
        return (obj instanceof z0) && ((z0) obj).b();
    }

    @Override // com.gamericefishpro.space.pi.d1
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new e1(A(), null, this);
        }
        u(cancellationException);
    }

    public final void d0(o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        Object y0Var = n1Var;
        if (!o0Var.d) {
            y0Var = new y0(n1Var);
        }
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0Var, y0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0Var);
    }

    public final void e0(h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        h1Var.getClass();
        com.gamericefishpro.space.ui.i.e.set(n1Var, h1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = com.gamericefishpro.space.ui.i.d;
        atomicReferenceFieldUpdater2.set(n1Var, h1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(h1Var) == h1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(h1Var, h1Var, n1Var)) {
                    n1Var.g(h1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(h1Var) == h1Var);
        }
        com.gamericefishpro.space.ui.i iVarH = h1Var.h();
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, h1Var, iVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == h1Var);
    }

    public final int f0(Object obj) {
        boolean z = obj instanceof o0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((o0) obj).d) {
                return 0;
            }
            o0 o0Var = a0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            c0();
            return 1;
        }
        if (!(obj instanceof y0)) {
            return 0;
        }
        n1 n1Var = ((y0) obj).d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        c0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return u.e;
    }

    public final Object h0(Object obj, Object obj2) {
        if (!(obj instanceof z0)) {
            return a0.d;
        }
        if (((obj instanceof o0) || (obj instanceof h1)) && !(obj instanceof l) && !(obj2 instanceof q)) {
            z0 z0Var = (z0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object a1Var = obj2 instanceof z0 ? new a1((z0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z0Var, a1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != z0Var) {
                    return a0.f;
                }
            }
            b0(obj2);
            C(z0Var, obj2);
            return obj2;
        }
        z0 z0Var2 = (z0) obj;
        n1 n1VarP = P(z0Var2);
        if (n1VarP == null) {
            return a0.f;
        }
        k1 k1Var = z0Var2 instanceof k1 ? (k1) z0Var2 : null;
        if (k1Var == null) {
            k1Var = new k1(n1VarP, null);
        }
        synchronized (k1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k1.e;
            if (atomicIntegerFieldUpdater.get(k1Var) == 1) {
                return a0.d;
            }
            atomicIntegerFieldUpdater.set(k1Var, 1);
            if (k1Var != z0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, z0Var2, k1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != z0Var2) {
                        return a0.f;
                    }
                }
            }
            boolean zE = k1Var.e();
            q qVar = obj2 instanceof q ? (q) obj2 : null;
            if (qVar != null) {
                k1Var.a(qVar.a);
            }
            Throwable thC = zE ? null : k1Var.c();
            Unit unit = Unit.a;
            if (thC != null) {
                a0(n1VarP, thC);
            }
            l lVarZ = Z(n1VarP);
            if (lVarZ != null && i0(k1Var, lVarZ, obj2)) {
                return a0.e;
            }
            n1VarP.e(new com.gamericefishpro.space.ui.h(2), 2);
            l lVarZ2 = Z(n1VarP);
            return (lVarZ2 == null || !i0(k1Var, lVarZ2, obj2)) ? G(k1Var, obj2) : a0.e;
        }
    }

    public final boolean i0(k1 k1Var, l lVar, Object obj) {
        while (a0.q(lVar.w, false, new j1(this, k1Var, lVar, obj)) == p1.d) {
            lVar = Z(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element j(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final m0 n(Function1 function1) {
        return T(true, new n0(1, function1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext o(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public void q(Object obj) {
        m(obj);
    }

    public final Object r(com.gamericefishpro.space.th.a frame) {
        Object obj;
        do {
            obj = d.get(this);
            if (!(obj instanceof z0)) {
                if (obj instanceof q) {
                    throw ((q) obj).a;
                }
                return a0.C(obj);
            }
        } while (f0(obj) < 0);
        i1 i1Var = new i1(com.gamericefishpro.space.uh.f.b(frame), this);
        i1Var.s();
        i1Var.v(new e(2, a0.q(this, true, new n0(2, i1Var))));
        Object objR = i1Var.r();
        if (objR == com.gamericefishpro.space.uh.a.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean s(Object obj) {
        Throwable thD;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z;
        Throwable thC;
        com.gamericefishpro.space.d6.a aVar;
        z0 z0Var;
        n1 n1VarP;
        k1 k1Var;
        Object objH0;
        Object objH1 = a0.d;
        if (O()) {
            do {
                Object obj3 = d.get(this);
                if (obj3 instanceof z0) {
                    if (obj3 instanceof k1) {
                        if (k1.e.get((k1) obj3) == 1) {
                        }
                    }
                    objH1 = h0(obj3, new q(D(obj), false));
                }
                objH1 = a0.d;
                break;
            } while (objH1 == a0.f);
            if (objH1 != a0.e) {
                if (objH1 == a0.d) {
                    thD = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = d;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof k1) {
                            synchronized (obj2) {
                                if (k1.v.get((k1) obj2) == a0.h) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    aVar = a0.g;
                                } else {
                                    boolean zE = ((k1) obj2).e();
                                    if (thD == null) {
                                        thD = D(obj);
                                    }
                                    ((k1) obj2).a(thD);
                                    thC = zE ? null : ((k1) obj2).c();
                                    if (thC != null) {
                                        a0(((k1) obj2).d, thC);
                                    }
                                    aVar = a0.d;
                                }
                            }
                        } else if (obj2 instanceof z0) {
                            if (thD == null) {
                                thD = D(obj);
                            }
                            z0Var = (z0) obj2;
                            if (z0Var.b()) {
                                n1VarP = P(z0Var);
                                if (n1VarP == null) {
                                    continue;
                                } else {
                                    k1Var = new k1(n1VarP, thD);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, z0Var, k1Var)) {
                                            a0(n1VarP, thD);
                                            aVar = a0.d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != z0Var) {
                                        }
                                    }
                                }
                            } else {
                                objH0 = h0(obj2, new q(thD, false));
                                if (objH0 != a0.d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objH0 != a0.f) {
                                    objH1 = objH0;
                                    break;
                                }
                            }
                        } else {
                            aVar = a0.g;
                        }
                        objH1 = aVar;
                        break;
                    }
                }
                if (objH1 != a0.d && objH1 != a0.e) {
                    if (objH1 == a0.g) {
                        return false;
                    }
                    m(objH1);
                    return true;
                }
            }
        } else {
            if (objH1 == a0.d) {
                thD = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = d;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof k1) {
                        synchronized (obj2) {
                            if (k1.v.get((k1) obj2) == a0.h) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                aVar = a0.g;
                            } else {
                                boolean zE2 = ((k1) obj2).e();
                                if (thD == null) {
                                    thD = D(obj);
                                }
                                ((k1) obj2).a(thD);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    a0(((k1) obj2).d, thC);
                                }
                                aVar = a0.d;
                            }
                        }
                    } else if (obj2 instanceof z0) {
                        if (thD == null) {
                            thD = D(obj);
                        }
                        z0Var = (z0) obj2;
                        if (z0Var.b()) {
                            n1VarP = P(z0Var);
                            if (n1VarP == null) {
                                continue;
                            } else {
                                k1Var = new k1(n1VarP, thD);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, z0Var, k1Var)) {
                                        a0(n1VarP, thD);
                                        aVar = a0.d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != z0Var) {
                                    }
                                }
                            }
                        } else {
                            objH0 = h0(obj2, new q(thD, false));
                            if (objH0 != a0.d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objH0 != a0.f) {
                                objH1 = objH0;
                                break;
                            }
                        }
                    } else {
                        aVar = a0.g;
                    }
                    objH1 = aVar;
                    break;
                }
            }
            if (objH1 != a0.d) {
                if (objH1 == a0.g) {
                    return false;
                }
                m(objH1);
                return true;
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final boolean start() {
        int iF0;
        do {
            iF0 = f0(d.get(this));
            if (iF0 == 0) {
                return false;
            }
        } while (iF0 != 1);
        return true;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final CancellationException t() {
        CancellationException cancellationException;
        Object obj = d.get(this);
        if (!(obj instanceof k1)) {
            if (obj instanceof z0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof q)) {
                return new e1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((q) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new e1(A(), th, this) : cancellationException;
        }
        Throwable thC = ((k1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = A();
        }
        return new e1(strConcat, thC, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Y() + '{' + g0(d.get(this)) + '}');
        sb.append('@');
        sb.append(a0.m(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final boolean v(Throwable th) {
        if (V()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        k kVar = (k) e.get(this);
        if (kVar == null || kVar == p1.d) {
            return z;
        }
        return kVar.c(th) || z;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object w(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final Object y(com.gamericefishpro.space.th.a frame) {
        Object obj;
        do {
            obj = d.get(this);
            if (!(obj instanceof z0)) {
                a0.j(frame.getContext());
                return Unit.a;
            }
        } while (f0(obj) < 0);
        h hVar = new h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        hVar.v(new e(2, a0.q(this, true, new j(hVar, 1))));
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objR != aVar) {
            objR = Unit.a;
        }
        return objR == aVar ? objR : Unit.a;
    }

    @Override // com.gamericefishpro.space.pi.d1
    public final k z(l1 l1Var) {
        l lVar = new l(l1Var);
        lVar.v = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (o0Var.d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                d0(o0Var);
            } else {
                boolean z = obj instanceof z0;
                p1 p1Var = p1.d;
                Throwable thC = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    q qVar = obj2 instanceof q ? (q) obj2 : null;
                    lVar.l(qVar != null ? qVar.a : null);
                    return p1Var;
                }
                n1 n1VarD = ((z0) obj).d();
                if (n1VarD != null) {
                    if (n1VarD.e(lVar, 7)) {
                        break;
                    }
                    boolean zE = n1VarD.e(lVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof k1) {
                        thC = ((k1) obj3).c();
                    } else {
                        q qVar2 = obj3 instanceof q ? (q) obj3 : null;
                        if (qVar2 != null) {
                            thC = qVar2.a;
                        }
                    }
                    lVar.l(thC);
                    if (zE) {
                        break;
                    }
                    return p1Var;
                }
                e0((h1) obj);
            }
        }
        return lVar;
    }

    public void c0() {
    }

    public void R(com.gamericefishpro.space.bb.n nVar) {
        throw nVar;
    }

    public void b0(Object obj) {
    }

    public void m(Object obj) {
    }
}
