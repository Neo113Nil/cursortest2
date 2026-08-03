package yc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class k1 implements b1, q1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8872g = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8873h = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z10) {
        this._state$volatile = z10 ? a0.f8827j : a0.f8826i;
    }

    public static k V(dd.k kVar) {
        while (kVar.j()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.k.f1869h;
            dd.k f10 = kVar.f();
            if (f10 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (dd.k) obj;
                    if (!kVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = f10;
            }
        }
        while (true) {
            kVar = kVar.i();
            if (!kVar.j()) {
                if (kVar instanceof k) {
                    return (k) kVar;
                }
                if (kVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof i1)) {
            return obj instanceof w0 ? ((w0) obj).b() ? "Active" : "New" : obj instanceof p ? "Cancelled" : "Completed";
        }
        i1 i1Var = (i1) obj;
        return i1Var.d() ? "Cancelling" : i1Var.f() ? "Completing" : "Active";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == yc.a0.f8822e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A(Object obj) {
        dd.w wVar;
        Object obj2 = a0.f8821d;
        if (K()) {
            do {
                Object M = M();
                if (!(M instanceof w0) || ((M instanceof i1) && ((i1) M).f())) {
                    obj2 = a0.f8821d;
                    break;
                }
                obj2 = c0(M, new p(G(obj), false));
            } while (obj2 == a0.f8823f);
        }
        if (obj2 == a0.f8821d) {
            Throwable th = null;
            loop1: while (true) {
                Object M2 = M();
                if (!(M2 instanceof i1)) {
                    if (!(M2 instanceof w0)) {
                        wVar = a0.f8824g;
                        break;
                    }
                    if (th == null) {
                        th = G(obj);
                    }
                    w0 w0Var = (w0) M2;
                    if (w0Var.b()) {
                        m1 L = L(w0Var);
                        if (L != null) {
                            i1 i1Var = new i1(L, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8872g;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, w0Var, i1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != w0Var) {
                                    break;
                                }
                            }
                            W(L, th);
                            wVar = a0.f8821d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object c02 = c0(M2, new p(th, false));
                        if (c02 == a0.f8821d) {
                            throw new IllegalStateException(("Cannot happen in " + M2).toString());
                        }
                        if (c02 != a0.f8823f) {
                            obj2 = c02;
                            break;
                        }
                    }
                } else {
                    synchronized (M2) {
                        if (i1.f8864j.get((i1) M2) == a0.f8825h) {
                            wVar = a0.f8824g;
                        } else {
                            boolean d10 = ((i1) M2).d();
                            if (th == null) {
                                th = G(obj);
                            }
                            ((i1) M2).a(th);
                            Throwable c3 = d10 ? null : ((i1) M2).c();
                            if (c3 != null) {
                                W(((i1) M2).f8865g, c3);
                            }
                            wVar = a0.f8821d;
                        }
                    }
                }
            }
            obj2 = wVar;
        }
        if (obj2 != a0.f8821d && obj2 != a0.f8822e) {
            if (obj2 == a0.f8824g) {
                return false;
            }
            x(obj2);
            return true;
        }
        return true;
    }

    public void B(CancellationException cancellationException) {
        A(cancellationException);
    }

    public final boolean C(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        j jVar = (j) f8873h.get(this);
        return (jVar == null || jVar == o1.f8887g) ? z10 : jVar.c(th) || z10;
    }

    public String D() {
        return "Job was cancelled";
    }

    public boolean E(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return A(th) && J();
    }

    public final void F(w0 w0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8873h;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        if (jVar != null) {
            jVar.a();
            atomicReferenceFieldUpdater.set(this, o1.f8887g);
        }
        ac.d dVar = null;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f8889a : null;
        if (w0Var instanceof f1) {
            try {
                ((f1) w0Var).d(th);
                return;
            } catch (Throwable th2) {
                O(new ac.d("Exception in completion handler " + w0Var + " for " + this, th2));
                return;
            }
        }
        m1 e10 = w0Var.e();
        if (e10 != null) {
            Object h10 = e10.h();
            pc.j.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (dd.k kVar = (dd.k) h10; !kVar.equals(e10); kVar = kVar.i()) {
                if (kVar instanceof f1) {
                    f1 f1Var = (f1) kVar;
                    try {
                        f1Var.d(th);
                    } catch (Throwable th3) {
                        if (dVar != null) {
                            i7.b.k(dVar, th3);
                        } else {
                            dVar = new ac.d("Exception in completion handler " + f1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (dVar != null) {
                O(dVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable G(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((q1) obj);
        Object M = k1Var.M();
        if (M instanceof i1) {
            cancellationException = ((i1) M).c();
        } else if (M instanceof p) {
            cancellationException = ((p) M).f8889a;
        } else {
            if (M instanceof w0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + M).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new c1("Parent job is ".concat(b0(M)), cancellationException, k1Var) : cancellationException2;
    }

    public final Object H(i1 i1Var, Object obj) {
        Throwable I;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f8889a : null;
        synchronized (i1Var) {
            i1Var.d();
            ArrayList g8 = i1Var.g(th);
            I = I(i1Var, g8);
            if (I != null && g8.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g8.size()));
                int size = g8.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = g8.get(i10);
                    i10++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != I && th2 != I && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        i7.b.k(I, th2);
                    }
                }
            }
        }
        if (I != null && I != th) {
            obj = new p(I, false);
        }
        if (I != null && (C(I) || N(I))) {
            pc.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            p.f8888b.compareAndSet((p) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8872g;
        Object x0Var = obj instanceof w0 ? new x0((w0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i1Var, x0Var) && atomicReferenceFieldUpdater.get(this) == i1Var) {
        }
        F(i1Var, obj);
        return obj;
    }

    public final Throwable I(i1 i1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (i1Var.d()) {
                return new c1(D(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof v1) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof v1)) {
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

    public boolean J() {
        return true;
    }

    public boolean K() {
        return this instanceof m;
    }

    public final m1 L(w0 w0Var) {
        m1 e10 = w0Var.e();
        if (e10 != null) {
            return e10;
        }
        if (w0Var instanceof m0) {
            return new m1();
        }
        if (w0Var instanceof f1) {
            Z((f1) w0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + w0Var).toString());
    }

    public final Object M() {
        while (true) {
            Object obj = f8872g.get(this);
            if (!(obj instanceof dd.q)) {
                return obj;
            }
            ((dd.q) obj).a(this);
        }
    }

    public boolean N(Throwable th) {
        return false;
    }

    public final void P(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8873h;
        o1 o1Var = o1.f8887g;
        if (b1Var == null) {
            atomicReferenceFieldUpdater.set(this, o1Var);
            return;
        }
        b1Var.start();
        j r5 = b1Var.r(this);
        atomicReferenceFieldUpdater.set(this, r5);
        if (M() instanceof w0) {
            return;
        }
        r5.a();
        atomicReferenceFieldUpdater.set(this, o1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 Q(boolean z10, boolean z11, z0 z0Var) {
        f1 f1Var;
        Throwable th;
        if (z10) {
            f1Var = z0Var instanceof d1 ? (d1) z0Var : null;
            if (f1Var == null) {
                f1Var = new a1(z0Var);
            }
        } else {
            f1Var = z0Var instanceof f1 ? (f1) z0Var : null;
            if (f1Var == null) {
                f1Var = new l0(1, z0Var);
            }
        }
        f1Var.f8844j = this;
        loop0: while (true) {
            Object M = M();
            if (M instanceof m0) {
                m0 m0Var = (m0) M;
                if (m0Var.f8877g) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8872g;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, M, f1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != M) {
                            break;
                        }
                    }
                    break loop0;
                }
                m1 m1Var = new m1();
                Object v0Var = m0Var.f8877g ? m1Var : new v0(m1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8872g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, m0Var, v0Var) && atomicReferenceFieldUpdater2.get(this) == m0Var) {
                }
            } else {
                if (!(M instanceof w0)) {
                    if (z11) {
                        p pVar = M instanceof p ? (p) M : null;
                        z0Var.d(pVar != null ? pVar.f8889a : null);
                    }
                    return o1.f8887g;
                }
                w0 w0Var = (w0) M;
                m1 e10 = w0Var.e();
                if (e10 == null) {
                    Z((f1) M);
                } else {
                    k0 k0Var = o1.f8887g;
                    if (z10 && (M instanceof i1)) {
                        synchronized (M) {
                            try {
                                th = ((i1) M).c();
                                if (th != null) {
                                    if ((z0Var instanceof k) && !((i1) M).f()) {
                                    }
                                }
                                if (w((w0) M, e10, f1Var)) {
                                    if (th == null) {
                                        return f1Var;
                                    }
                                    k0Var = f1Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            z0Var.d(th);
                        }
                        return k0Var;
                    }
                    if (w(w0Var, e10, f1Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean R() {
        return this instanceof c;
    }

    public final boolean S(Object obj) {
        Object c02;
        do {
            c02 = c0(M(), obj);
            if (c02 == a0.f8821d) {
                return false;
            }
            if (c02 == a0.f8822e) {
                return true;
            }
        } while (c02 == a0.f8823f);
        x(c02);
        return true;
    }

    public final Object T(Object obj) {
        Object c02;
        do {
            c02 = c0(M(), obj);
            if (c02 == a0.f8821d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p pVar = obj instanceof p ? (p) obj : null;
                throw new IllegalStateException(str, pVar != null ? pVar.f8889a : null);
            }
        } while (c02 == a0.f8823f);
        return c02;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(m1 m1Var, Throwable th) {
        Object h10 = m1Var.h();
        pc.j.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        ac.d dVar = null;
        for (dd.k kVar = (dd.k) h10; !kVar.equals(m1Var); kVar = kVar.i()) {
            if (kVar instanceof d1) {
                f1 f1Var = (f1) kVar;
                try {
                    f1Var.d(th);
                } catch (Throwable th2) {
                    if (dVar != null) {
                        i7.b.k(dVar, th2);
                    } else {
                        dVar = new ac.d("Exception in completion handler " + f1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (dVar != null) {
            O(dVar);
        }
        C(th);
    }

    public final void Z(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        f1Var.getClass();
        dd.k.f1869h.set(m1Var, f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = dd.k.f1868g;
        atomicReferenceFieldUpdater2.set(m1Var, f1Var);
        loop0: while (true) {
            if (f1Var.h() == f1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(f1Var, f1Var, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(f1Var) != f1Var) {
                        break;
                    }
                }
                m1Var.g(f1Var);
                break loop0;
            }
            break;
        }
        dd.k i10 = f1Var.i();
        do {
            atomicReferenceFieldUpdater = f8872g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, i10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f1Var);
    }

    @Override // yc.b1, ad.t
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new c1(D(), null, this);
        }
        B(cancellationException);
    }

    public final int a0(Object obj) {
        boolean z10 = obj instanceof m0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8872g;
        if (z10) {
            if (((m0) obj).f8877g) {
                return 0;
            }
            m0 m0Var = a0.f8827j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof v0)) {
            return 0;
        }
        m1 m1Var = ((v0) obj).f8911g;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // yc.b1
    public boolean b() {
        Object M = M();
        return (M instanceof w0) && ((w0) M).b();
    }

    public final Object c0(Object obj, Object obj2) {
        if (!(obj instanceof w0)) {
            return a0.f8821d;
        }
        if (((obj instanceof m0) || (obj instanceof f1)) && !(obj instanceof k) && !(obj2 instanceof p)) {
            w0 w0Var = (w0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8872g;
            Object x0Var = obj2 instanceof w0 ? new x0((w0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, w0Var, x0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != w0Var) {
                    return a0.f8823f;
                }
            }
            X(obj2);
            F(w0Var, obj2);
            return obj2;
        }
        w0 w0Var2 = (w0) obj;
        m1 L = L(w0Var2);
        if (L == null) {
            return a0.f8823f;
        }
        k kVar = null;
        i1 i1Var = w0Var2 instanceof i1 ? (i1) w0Var2 : null;
        if (i1Var == null) {
            i1Var = new i1(L, null);
        }
        synchronized (i1Var) {
            if (i1Var.f()) {
                return a0.f8821d;
            }
            i1.f8862h.set(i1Var, 1);
            if (i1Var != w0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8872g;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, w0Var2, i1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != w0Var2) {
                        return a0.f8823f;
                    }
                }
            }
            boolean d10 = i1Var.d();
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            if (pVar != null) {
                i1Var.a(pVar.f8889a);
            }
            Throwable c3 = i1Var.c();
            if (d10) {
                c3 = null;
            }
            if (c3 != null) {
                W(L, c3);
            }
            k kVar2 = w0Var2 instanceof k ? (k) w0Var2 : null;
            if (kVar2 == null) {
                m1 e10 = w0Var2.e();
                if (e10 != null) {
                    kVar = V(e10);
                }
            } else {
                kVar = kVar2;
            }
            if (kVar != null) {
                while (a0.n(kVar.f8871k, false, new h1(this, i1Var, kVar, obj2), 1) == o1.f8887g) {
                    kVar = V(kVar);
                    if (kVar == null) {
                    }
                }
                return a0.f8822e;
            }
            return H(i1Var, obj2);
        }
    }

    @Override // fc.i
    public final fc.i d(fc.i iVar) {
        return v6.a.K(this, iVar);
    }

    @Override // fc.i
    public final fc.i g(fc.h hVar) {
        return v6.a.J(this, hVar);
    }

    @Override // fc.g
    public final fc.h getKey() {
        return v.f8910h;
    }

    @Override // yc.b1
    public final b1 getParent() {
        j jVar = (j) f8873h.get(this);
        if (jVar != null) {
            return jVar.getParent();
        }
        return null;
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // yc.b1
    public final Object j(fc.d dVar) {
        Object M;
        ac.o oVar;
        do {
            M = M();
            boolean z10 = M instanceof w0;
            oVar = ac.o.f277a;
            if (!z10) {
                a0.g(dVar.getContext());
                return oVar;
            }
        } while (a0(M) < 0);
        g gVar = new g(1, bc.a0.w(dVar));
        gVar.q();
        gVar.t(new e(2, a0.n(this, false, new l0(3, gVar), 3)));
        Object p8 = gVar.p();
        gc.a aVar = gc.a.f2559g;
        if (p8 != aVar) {
            p8 = oVar;
        }
        return p8 == aVar ? p8 : oVar;
    }

    @Override // yc.b1
    public final k0 k(oc.c cVar) {
        return Q(false, true, new y0(cVar));
    }

    @Override // yc.b1
    public final CancellationException m() {
        CancellationException cancellationException;
        Object M = M();
        if (!(M instanceof i1)) {
            if (M instanceof w0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(M instanceof p)) {
                return new c1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((p) M).f8889a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new c1(D(), th, this) : cancellationException;
        }
        Throwable c3 = ((i1) M).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = D();
        }
        return new c1(concat, c3, this);
    }

    @Override // yc.b1
    public final k0 o(boolean z10, boolean z11, d1.q qVar) {
        return Q(z10, z11, new y0(qVar));
    }

    @Override // yc.b1
    public final j r(k1 k1Var) {
        return (j) a0.n(this, true, new k(k1Var), 2);
    }

    @Override // yc.b1
    public final boolean start() {
        int a02;
        do {
            a02 = a0(M());
            if (a02 == 0) {
                return false;
            }
        } while (a02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + b0(M()) + '}');
        sb.append('@');
        sb.append(a0.j(this));
        return sb.toString();
    }

    @Override // fc.i
    public final fc.g v(fc.h hVar) {
        return v6.a.D(this, hVar);
    }

    public final boolean w(w0 w0Var, m1 m1Var, f1 f1Var) {
        dd.k f10;
        j1 j1Var = new j1(f1Var, this, w0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.k.f1869h;
            f10 = m1Var.f();
            if (f10 == null) {
                Object obj = atomicReferenceFieldUpdater.get(m1Var);
                while (true) {
                    f10 = (dd.k) obj;
                    if (!f10.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f10);
                }
            }
            dd.k.f1869h.set(f1Var, f10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = dd.k.f1868g;
            atomicReferenceFieldUpdater2.set(f1Var, m1Var);
            j1Var.f8868c = m1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(f10, m1Var, j1Var)) {
                if (atomicReferenceFieldUpdater2.get(f10) != m1Var) {
                    break;
                }
            }
        }
        return j1Var.a(f10) == null;
    }

    public void z(Object obj) {
        x(obj);
    }

    public void Y() {
    }

    public void O(ac.d dVar) {
        throw dVar;
    }

    public void X(Object obj) {
    }

    public void x(Object obj) {
    }
}
