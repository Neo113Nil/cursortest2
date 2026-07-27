package O7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public class h0 implements Y, n0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2606n = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_state$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2607u = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public h0(boolean z8) {
        this._state$volatile = z8 ? AbstractC0399y.f2651j : AbstractC0399y.i;
    }

    public static C0386k M(T7.k kVar) {
        while (kVar.g()) {
            T7.k c4 = kVar.c();
            if (c4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.k.f3151u;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (T7.k) obj;
                    if (!kVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = c4;
            }
        }
        while (true) {
            kVar = kVar.f();
            if (!kVar.g()) {
                if (kVar instanceof C0386k) {
                    return (C0386k) kVar;
                }
                if (kVar instanceof k0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof f0)) {
            return obj instanceof V ? ((V) obj).j() ? "Active" : "New" : obj instanceof C0391p ? "Cancelled" : "Completed";
        }
        f0 f0Var = (f0) obj;
        return f0Var.c() ? "Cancelling" : f0Var.d() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C0388m;
    }

    public final k0 B(V v6) {
        k0 k6 = v6.k();
        if (k6 != null) {
            return k6;
        }
        if (v6 instanceof J) {
            return new k0();
        }
        if (v6 instanceof c0) {
            Q((c0) v6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + v6).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f2606n.get(this);
            if (!(obj instanceof T7.p)) {
                return obj;
            }
            ((T7.p) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public final void F(Y y6) {
        int R8;
        H G7;
        l0 l0Var = l0.f2612n;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2607u;
        if (y6 == null) {
            atomicReferenceFieldUpdater.set(this, l0Var);
            return;
        }
        h0 h0Var = (h0) y6;
        do {
            R8 = h0Var.R(h0Var.C());
            if (R8 == 0) {
                break;
            }
        } while (R8 != 1);
        G7 = h0Var.G((r5 & 1) == 0, (r5 & 2) != 0, new C0386k(this));
        InterfaceC0385j interfaceC0385j = (InterfaceC0385j) G7;
        atomicReferenceFieldUpdater.set(this, interfaceC0385j);
        if (C() instanceof V) {
            return;
        }
        interfaceC0385j.b();
        atomicReferenceFieldUpdater.set(this, l0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H G(boolean z8, boolean z9, E7.l lVar) {
        c0 c0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z8) {
            c0Var = lVar instanceof a0 ? (a0) lVar : null;
            if (c0Var == null) {
                c0Var = new X(lVar);
            }
        } else {
            c0Var = lVar instanceof c0 ? (c0) lVar : null;
            if (c0Var == null) {
                c0Var = new I(1, lVar);
            }
        }
        c0Var.f2583w = this;
        loop0: while (true) {
            Object C7 = C();
            if (C7 instanceof J) {
                J j9 = (J) C7;
                if (j9.f2557n) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2606n;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C7, c0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C7) {
                            break;
                        }
                    }
                    break loop0;
                }
                k0 k0Var = new k0();
                V u7 = j9.f2557n ? k0Var : new U(k0Var);
                do {
                    atomicReferenceFieldUpdater = f2606n;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, j9, u7)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == j9);
            } else {
                if (!(C7 instanceof V)) {
                    if (z9) {
                        C0391p c0391p = C7 instanceof C0391p ? (C0391p) C7 : null;
                        lVar.invoke(c0391p != null ? c0391p.f2619a : null);
                    }
                    return l0.f2612n;
                }
                k0 k6 = ((V) C7).k();
                if (k6 == null) {
                    kotlin.jvm.internal.h.c(C7, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((c0) C7);
                } else {
                    H h9 = l0.f2612n;
                    if (z8 && (C7 instanceof f0)) {
                        synchronized (C7) {
                            try {
                                th = ((f0) C7).b();
                                if (th != null) {
                                    if ((lVar instanceof C0386k) && !((f0) C7).d()) {
                                    }
                                }
                                if (h((V) C7, k6, c0Var)) {
                                    if (th == null) {
                                        return c0Var;
                                    }
                                    h9 = c0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z9) {
                            lVar.invoke(th);
                        }
                        return h9;
                    }
                    if (h((V) C7, k6, c0Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof C0378c;
    }

    public final Object I(AbstractC5219c abstractC5219c) {
        Object C7;
        q7.v vVar;
        do {
            C7 = C();
            boolean z8 = C7 instanceof V;
            vVar = q7.v.f40183a;
            if (!z8) {
                AbstractC0399y.g(abstractC5219c.getContext());
                return vVar;
            }
        } while (R(C7) < 0);
        C0382g c0382g = new C0382g(1, w8.a.f(abstractC5219c));
        c0382g.r();
        c0382g.t(new C0380e(1, G(false, true, new I(3, c0382g))));
        Object q6 = c0382g.q();
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        if (q6 != enumC5179a) {
            q6 = vVar;
        }
        return q6 == enumC5179a ? q6 : vVar;
    }

    public final boolean J(Object obj) {
        Object T8;
        do {
            T8 = T(C(), obj);
            if (T8 == AbstractC0399y.f2646d) {
                return false;
            }
            if (T8 == AbstractC0399y.f2647e) {
                return true;
            }
        } while (T8 == AbstractC0399y.f2648f);
        k(T8);
        return true;
    }

    public final Object K(Object obj) {
        Object T8;
        do {
            T8 = T(C(), obj);
            if (T8 == AbstractC0399y.f2646d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0391p c0391p = obj instanceof C0391p ? (C0391p) obj : null;
                throw new IllegalStateException(str, c0391p != null ? c0391p.f2619a : null);
            }
        } while (T8 == AbstractC0399y.f2648f);
        return T8;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(k0 k0Var, Throwable th) {
        Object e6 = k0Var.e();
        kotlin.jvm.internal.h.c(e6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        B0.c cVar = null;
        for (T7.k kVar = (T7.k) e6; !kVar.equals(k0Var); kVar = kVar.f()) {
            if (kVar instanceof a0) {
                c0 c0Var = (c0) kVar;
                try {
                    c0Var.i(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        com.bumptech.glide.d.b(cVar, th2);
                    } else {
                        cVar = new B0.c("Exception in completion handler " + c0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            E(cVar);
        }
        q(th);
    }

    public final void Q(c0 c0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k0 k0Var = new k0();
        c0Var.getClass();
        T7.k.f3151u.set(k0Var, c0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T7.k.f3150n;
        atomicReferenceFieldUpdater2.set(k0Var, c0Var);
        loop0: while (true) {
            if (c0Var.e() == c0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0Var, c0Var, k0Var)) {
                    if (atomicReferenceFieldUpdater2.get(c0Var) != c0Var) {
                        break;
                    }
                }
                k0Var.d(c0Var);
                break loop0;
            }
            break;
        }
        T7.k f6 = c0Var.f();
        do {
            atomicReferenceFieldUpdater = f2606n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0Var, f6)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0Var);
    }

    public final int R(Object obj) {
        boolean z8 = obj instanceof J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2606n;
        if (z8) {
            if (((J) obj).f2557n) {
                return 0;
            }
            J j9 = AbstractC0399y.f2651j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        }
        if (!(obj instanceof U)) {
            return 0;
        }
        k0 k0Var = ((U) obj).f2573n;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        P();
        return 1;
    }

    public final Object T(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        H G7;
        if (!(obj instanceof V)) {
            return AbstractC0399y.f2646d;
        }
        if (((obj instanceof J) || (obj instanceof c0)) && !(obj instanceof C0386k) && !(obj2 instanceof C0391p)) {
            V v6 = (V) obj;
            Object w9 = obj2 instanceof V ? new W((V) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f2606n;
                if (atomicReferenceFieldUpdater.compareAndSet(this, v6, w9)) {
                    O(obj2);
                    t(v6, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == v6);
            return AbstractC0399y.f2648f;
        }
        V v9 = (V) obj;
        k0 B8 = B(v9);
        if (B8 == null) {
            return AbstractC0399y.f2648f;
        }
        C0386k c0386k = null;
        f0 f0Var = v9 instanceof f0 ? (f0) v9 : null;
        if (f0Var == null) {
            f0Var = new f0(B8, null);
        }
        synchronized (f0Var) {
            try {
                if (f0Var.d()) {
                    return AbstractC0399y.f2646d;
                }
                f0.f2592u.set(f0Var, 1);
                if (f0Var != v9) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2606n;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, v9, f0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != v9) {
                            return AbstractC0399y.f2648f;
                        }
                    }
                }
                boolean c4 = f0Var.c();
                C0391p c0391p = obj2 instanceof C0391p ? (C0391p) obj2 : null;
                if (c0391p != null) {
                    f0Var.a(c0391p.f2619a);
                }
                Throwable b9 = f0Var.b();
                if (c4) {
                    b9 = null;
                }
                if (b9 != null) {
                    N(B8, b9);
                }
                C0386k c0386k2 = v9 instanceof C0386k ? (C0386k) v9 : null;
                if (c0386k2 == null) {
                    k0 k6 = v9.k();
                    if (k6 != null) {
                        c0386k = M(k6);
                    }
                } else {
                    c0386k = c0386k2;
                }
                if (c0386k != null) {
                    do {
                        G7 = c0386k.f2611x.G((r5 & 1) == 0, (r5 & 2) != 0, new e0(this, f0Var, c0386k, obj2));
                        if (G7 != l0.f2612n) {
                            return AbstractC0399y.f2647e;
                        }
                        c0386k = M(c0386k);
                    } while (c0386k != null);
                }
                return v(f0Var, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O7.Y
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Z(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i g(InterfaceC5137h interfaceC5137h) {
        return com.bumptech.glide.e.s(this, interfaceC5137h);
    }

    @Override // v7.InterfaceC5136g
    public final InterfaceC5137h getKey() {
        return C0396v.f2634u;
    }

    public final boolean h(V v6, k0 k0Var, c0 c0Var) {
        char c4;
        g0 g0Var = new g0(c0Var, this, v6);
        do {
            T7.k c9 = k0Var.c();
            if (c9 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.k.f3151u;
                Object obj = atomicReferenceFieldUpdater.get(k0Var);
                while (true) {
                    c9 = (T7.k) obj;
                    if (!c9.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c9);
                }
            }
            T7.k.f3151u.set(c0Var, c9);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T7.k.f3150n;
            atomicReferenceFieldUpdater2.set(c0Var, k0Var);
            g0Var.f2602c = k0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(c9, k0Var, g0Var)) {
                    c4 = g0Var.a(c9) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(c9) != k0Var) {
                    c4 = 0;
                    break;
                }
            }
            if (c4 == 1) {
                return true;
            }
        } while (c4 != 2);
        return false;
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(C0396v.f2634u, key)) {
            return this;
        }
        return null;
    }

    @Override // O7.Y
    public boolean j() {
        Object C7 = C();
        return (C7 instanceof V) && ((V) C7).j();
    }

    public void l(Object obj) {
        k(obj);
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, E7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i n(InterfaceC5138i interfaceC5138i) {
        return com.bumptech.glide.e.w(this, interfaceC5138i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == O7.AbstractC0399y.f2647e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        T7.v vVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0399y.f2646d;
        if (A()) {
            do {
                Object C7 = C();
                if (!(C7 instanceof V) || ((C7 instanceof f0) && ((f0) C7).d())) {
                    obj2 = AbstractC0399y.f2646d;
                    break;
                }
                obj2 = T(C7, new C0391p(u(obj), false));
            } while (obj2 == AbstractC0399y.f2648f);
        }
        if (obj2 == AbstractC0399y.f2646d) {
            Throwable th = null;
            loop1: while (true) {
                Object C8 = C();
                if (!(C8 instanceof f0)) {
                    if (!(C8 instanceof V)) {
                        vVar = AbstractC0399y.f2649g;
                        break;
                    }
                    if (th == null) {
                        th = u(obj);
                    }
                    V v6 = (V) C8;
                    if (v6.j()) {
                        k0 B8 = B(v6);
                        if (B8 == null) {
                            continue;
                        } else {
                            f0 f0Var = new f0(B8, th);
                            do {
                                atomicReferenceFieldUpdater = f2606n;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, v6, f0Var)) {
                                    N(B8, th);
                                    vVar = AbstractC0399y.f2646d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == v6);
                        }
                    } else {
                        Object T8 = T(C8, new C0391p(th, false));
                        if (T8 == AbstractC0399y.f2646d) {
                            throw new IllegalStateException(("Cannot happen in " + C8).toString());
                        }
                        if (T8 != AbstractC0399y.f2648f) {
                            obj2 = T8;
                            break;
                        }
                    }
                } else {
                    synchronized (C8) {
                        try {
                            f0 f0Var2 = (f0) C8;
                            f0Var2.getClass();
                            if (f0.f2594w.get(f0Var2) == AbstractC0399y.f2650h) {
                                vVar = AbstractC0399y.f2649g;
                            } else {
                                boolean c4 = ((f0) C8).c();
                                if (th == null) {
                                    th = u(obj);
                                }
                                ((f0) C8).a(th);
                                Throwable b9 = c4 ? null : ((f0) C8).b();
                                if (b9 != null) {
                                    N(((f0) C8).f2595n, b9);
                                }
                                vVar = AbstractC0399y.f2646d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = vVar;
        }
        if (obj2 != AbstractC0399y.f2646d && obj2 != AbstractC0399y.f2647e) {
            if (obj2 == AbstractC0399y.f2649g) {
                return false;
            }
            k(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (H()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        InterfaceC0385j interfaceC0385j = (InterfaceC0385j) f2607u.get(this);
        return (interfaceC0385j == null || interfaceC0385j == l0.f2612n) ? z8 : interfaceC0385j.a(th) || z8;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && y();
    }

    public final void t(V v6, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2607u;
        InterfaceC0385j interfaceC0385j = (InterfaceC0385j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0385j != null) {
            interfaceC0385j.b();
            atomicReferenceFieldUpdater.set(this, l0.f2612n);
        }
        B0.c cVar = null;
        C0391p c0391p = obj instanceof C0391p ? (C0391p) obj : null;
        Throwable th = c0391p != null ? c0391p.f2619a : null;
        if (v6 instanceof c0) {
            try {
                ((c0) v6).i(th);
                return;
            } catch (Throwable th2) {
                E(new B0.c("Exception in completion handler " + v6 + " for " + this, th2));
                return;
            }
        }
        k0 k6 = v6.k();
        if (k6 != null) {
            Object e6 = k6.e();
            kotlin.jvm.internal.h.c(e6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (T7.k kVar = (T7.k) e6; !kVar.equals(k6); kVar = kVar.f()) {
                if (kVar instanceof c0) {
                    c0 c0Var = (c0) kVar;
                    try {
                        c0Var.i(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            com.bumptech.glide.d.b(cVar, th3);
                        } else {
                            cVar = new B0.c("Exception in completion handler " + c0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                E(cVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + '{' + S(C()) + '}');
        sb.append('@');
        sb.append(AbstractC0399y.j(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable u(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        h0 h0Var = (h0) ((n0) obj);
        Object C7 = h0Var.C();
        if (C7 instanceof f0) {
            cancellationException = ((f0) C7).b();
        } else if (C7 instanceof C0391p) {
            cancellationException = ((C0391p) C7).f2619a;
        } else {
            if (C7 instanceof V) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C7).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Z("Parent job is ".concat(S(C7)), cancellationException, h0Var) : cancellationException2;
    }

    public final Object v(f0 f0Var, Object obj) {
        Throwable x3;
        C0391p c0391p = obj instanceof C0391p ? (C0391p) obj : null;
        Throwable th = c0391p != null ? c0391p.f2619a : null;
        synchronized (f0Var) {
            f0Var.c();
            ArrayList<Throwable> e6 = f0Var.e(th);
            x3 = x(f0Var, e6);
            if (x3 != null && e6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e6.size()));
                for (Throwable th2 : e6) {
                    if (th2 != x3 && th2 != x3 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        com.bumptech.glide.d.b(x3, th2);
                    }
                }
            }
        }
        if (x3 != null && x3 != th) {
            obj = new C0391p(x3, false);
        }
        if (x3 != null && (q(x3) || D(x3))) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0391p.f2618b.compareAndSet((C0391p) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2606n;
        Object w9 = obj instanceof V ? new W((V) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, f0Var, w9) && atomicReferenceFieldUpdater.get(this) == f0Var) {
        }
        t(f0Var, obj);
        return obj;
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object C7 = C();
        if (!(C7 instanceof f0)) {
            if (C7 instanceof V) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C7 instanceof C0391p)) {
                return new Z(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0391p) C7).f2619a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Z(r(), th, this) : cancellationException;
        }
        Throwable b9 = ((f0) C7).b();
        if (b9 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b9 instanceof CancellationException ? (CancellationException) b9 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = r();
            }
            cancellationException = new Z(concat, b9, this);
        }
        return cancellationException;
    }

    public final Throwable x(f0 f0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (f0Var.c()) {
                return new Z(r(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof s0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof s0)) {
                    obj2 = next;
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

    public boolean y() {
        return true;
    }

    public void P() {
    }

    public void E(B0.c cVar) {
        throw cVar;
    }

    public void O(Object obj) {
    }

    public void k(Object obj) {
    }
}
