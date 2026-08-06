package A1;

import a.AbstractC0083a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l1.C0982b;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public class b0 implements S, f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f38a = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f39b = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public b0(boolean z2) {
        this._state = z2 ? AbstractC0022x.f82i : AbstractC0022x.f81h;
    }

    public static C0009j L(F1.k kVar) {
        while (kVar.i()) {
            F1.k e2 = kVar.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.k.f613b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (F1.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e2;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof C0009j) {
                    return (C0009j) kVar;
                }
                if (kVar instanceof c0) {
                    return null;
                }
            }
        }
    }

    public static String R(Object obj) {
        if (!(obj instanceof Z)) {
            return obj instanceof N ? ((N) obj).b() ? "Active" : "New" : obj instanceof C0013n ? "Cancelled" : "Completed";
        }
        Z z2 = (Z) obj;
        return z2.e() ? "Cancelling" : z2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof C0011l;
    }

    public final c0 C(N n2) {
        c0 d2 = n2.d();
        if (d2 != null) {
            return d2;
        }
        if (n2 instanceof G) {
            return new c0();
        }
        if (n2 instanceof W) {
            P((W) n2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + n2).toString());
    }

    public final Object D() {
        while (true) {
            Object obj = f38a.get(this);
            if (!(obj instanceof F1.q)) {
                return obj;
            }
            ((F1.q) obj).a(this);
        }
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(S s2) {
        int Q2;
        d0 d0Var = d0.f43a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39b;
        if (s2 == null) {
            atomicReferenceFieldUpdater.set(this, d0Var);
            return;
        }
        b0 b0Var = (b0) s2;
        do {
            Q2 = b0Var.Q(b0Var.D());
            if (Q2 == 0) {
                break;
            }
        } while (Q2 != 1);
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) AbstractC0022x.e(b0Var, true, new C0009j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0008i);
        if (D() instanceof N) {
            return;
        }
        interfaceC0008i.a();
        atomicReferenceFieldUpdater.set(this, d0Var);
    }

    public final E H(boolean z2, boolean z3, t1.l lVar) {
        W w2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z2) {
            w2 = lVar instanceof U ? (U) lVar : null;
            if (w2 == null) {
                w2 = new P(lVar);
            }
        } else {
            w2 = lVar instanceof W ? (W) lVar : null;
            if (w2 == null) {
                w2 = new Q(0, lVar);
            }
        }
        w2.f22d = this;
        while (true) {
            Object D2 = D();
            if (D2 instanceof G) {
                G g2 = (G) D2;
                if (g2.f5a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f38a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, D2, w2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != D2) {
                            break;
                        }
                    }
                    return w2;
                }
                c0 c0Var = new c0();
                Object m2 = g2.f5a ? c0Var : new M(c0Var);
                do {
                    atomicReferenceFieldUpdater = f38a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g2, m2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g2);
            } else {
                if (!(D2 instanceof N)) {
                    if (z3) {
                        C0013n c0013n = D2 instanceof C0013n ? (C0013n) D2 : null;
                        lVar.invoke(c0013n != null ? c0013n.f62a : null);
                    }
                    return d0.f43a;
                }
                c0 d2 = ((N) D2).d();
                if (d2 == null) {
                    kotlin.jvm.internal.i.c(D2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    P((W) D2);
                } else {
                    E e2 = d0.f43a;
                    if (z2 && (D2 instanceof Z)) {
                        synchronized (D2) {
                            try {
                                th = ((Z) D2).c();
                                if (th != null) {
                                    if ((lVar instanceof C0009j) && !((Z) D2).f()) {
                                    }
                                }
                                if (o((N) D2, d2, w2)) {
                                    if (th == null) {
                                        return w2;
                                    }
                                    e2 = w2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            lVar.invoke(th);
                        }
                        return e2;
                    }
                    if (o((N) D2, d2, w2)) {
                        return w2;
                    }
                }
            }
        }
    }

    public boolean I() {
        return this instanceof C0002c;
    }

    public final boolean J(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC0022x.f76c) {
                return false;
            }
            if (S2 == AbstractC0022x.f77d) {
                return true;
            }
        } while (S2 == AbstractC0022x.f78e);
        p(S2);
        return true;
    }

    public final Object K(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC0022x.f76c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0013n c0013n = obj instanceof C0013n ? (C0013n) obj : null;
                throw new IllegalStateException(str, c0013n != null ? c0013n.f62a : null);
            }
        } while (S2 == AbstractC0022x.f78e);
        return S2;
    }

    public final void M(c0 c0Var, Throwable th) {
        Object g2 = c0Var.g();
        kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0015p c0015p = null;
        for (F1.k kVar = (F1.k) g2; !kVar.equals(c0Var); kVar = kVar.h()) {
            if (kVar instanceof U) {
                W w2 = (W) kVar;
                try {
                    w2.k(th);
                } catch (Throwable th2) {
                    if (c0015p != null) {
                        AbstractC1050a.a(c0015p, th2);
                    } else {
                        c0015p = new C0015p("Exception in completion handler " + w2 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0015p != null) {
            F(c0015p);
        }
        t(th);
    }

    public final void P(W w2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c0 c0Var = new c0();
        w2.getClass();
        F1.k.f613b.lazySet(c0Var, w2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F1.k.f612a;
        atomicReferenceFieldUpdater2.lazySet(c0Var, w2);
        loop0: while (true) {
            if (w2.g() == w2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w2, w2, c0Var)) {
                    if (atomicReferenceFieldUpdater2.get(w2) != w2) {
                        break;
                    }
                }
                c0Var.f(w2);
                break loop0;
            }
            break;
        }
        F1.k h2 = w2.h();
        do {
            atomicReferenceFieldUpdater = f38a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w2, h2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w2);
    }

    public final int Q(Object obj) {
        boolean z2 = obj instanceof G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38a;
        if (z2) {
            if (((G) obj).f5a) {
                return 0;
            }
            G g2 = AbstractC0022x.f82i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof M)) {
            return 0;
        }
        c0 c0Var = ((M) obj).f14a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object S(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof N)) {
            return AbstractC0022x.f76c;
        }
        if (((obj instanceof G) || (obj instanceof W)) && !(obj instanceof C0009j) && !(obj2 instanceof C0013n)) {
            N n2 = (N) obj;
            Object o2 = obj2 instanceof N ? new O((N) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f38a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, n2, o2)) {
                    N(obj2);
                    w(n2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == n2);
            return AbstractC0022x.f78e;
        }
        N n3 = (N) obj;
        c0 C2 = C(n3);
        if (C2 == null) {
            return AbstractC0022x.f78e;
        }
        C0009j c0009j = null;
        Z z2 = n3 instanceof Z ? (Z) n3 : null;
        if (z2 == null) {
            z2 = new Z(C2, null);
        }
        synchronized (z2) {
            if (z2.f()) {
                return AbstractC0022x.f76c;
            }
            Z.f28b.set(z2, 1);
            if (z2 != n3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f38a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n3, z2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n3) {
                        return AbstractC0022x.f78e;
                    }
                }
            }
            boolean e2 = z2.e();
            C0013n c0013n = obj2 instanceof C0013n ? (C0013n) obj2 : null;
            if (c0013n != null) {
                z2.a(c0013n.f62a);
            }
            Throwable c2 = z2.c();
            if (e2) {
                c2 = null;
            }
            if (c2 != null) {
                M(C2, c2);
            }
            C0009j c0009j2 = n3 instanceof C0009j ? (C0009j) n3 : null;
            if (c0009j2 == null) {
                c0 d2 = n3.d();
                if (d2 != null) {
                    c0009j = L(d2);
                }
            } else {
                c0009j = c0009j2;
            }
            if (c0009j != null) {
                while (AbstractC0022x.e(c0009j.f51e, false, new Y(this, z2, c0009j, obj2), 1) == d0.f43a) {
                    c0009j = L(c0009j);
                    if (c0009j == null) {
                    }
                }
                return AbstractC0022x.f77d;
            }
            return y(z2, obj2);
        }
    }

    @Override // A1.S
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new T(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // A1.S
    public boolean b() {
        Object D2 = D();
        return (D2 instanceof N) && ((N) D2).b();
    }

    @Override // l1.i
    public final l1.i c(l1.h hVar) {
        return AbstractC0083a.n(this, hVar);
    }

    @Override // l1.g
    public final l1.h getKey() {
        return C0019u.f73b;
    }

    @Override // l1.i
    public final Object k(Object obj, t1.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // l1.i
    public final l1.i l(l1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == l1.j.f8138a ? this : (l1.i) context.k(this, new C0982b(1));
    }

    @Override // l1.i
    public final l1.g m(l1.h hVar) {
        return AbstractC0083a.j(this, hVar);
    }

    public final boolean o(N n2, c0 c0Var, W w2) {
        char c2;
        a0 a0Var = new a0(w2, this, n2);
        do {
            F1.k e2 = c0Var.e();
            if (e2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.k.f613b;
                Object obj = atomicReferenceFieldUpdater.get(c0Var);
                while (true) {
                    e2 = (F1.k) obj;
                    if (!e2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e2);
                }
            }
            F1.k.f613b.lazySet(w2, e2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = F1.k.f612a;
            atomicReferenceFieldUpdater2.lazySet(w2, c0Var);
            a0Var.f34c = c0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e2, c0Var, a0Var)) {
                    c2 = a0Var.a(e2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e2) != c0Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void q(Object obj) {
        p(obj);
    }

    public final boolean r(Object obj) {
        C.j jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0022x.f76c;
        if (B()) {
            do {
                Object D2 = D();
                if (!(D2 instanceof N) || ((D2 instanceof Z) && ((Z) D2).f())) {
                    obj2 = AbstractC0022x.f76c;
                    break;
                }
                obj2 = S(D2, new C0013n(x(obj), false));
            } while (obj2 == AbstractC0022x.f78e);
            if (obj2 == AbstractC0022x.f77d) {
                return true;
            }
        }
        if (obj2 == AbstractC0022x.f76c) {
            Throwable th = null;
            loop1: while (true) {
                Object D3 = D();
                if (!(D3 instanceof Z)) {
                    if (!(D3 instanceof N)) {
                        jVar = AbstractC0022x.f79f;
                        break;
                    }
                    if (th == null) {
                        th = x(obj);
                    }
                    N n2 = (N) D3;
                    if (n2.b()) {
                        c0 C2 = C(n2);
                        if (C2 == null) {
                            continue;
                        } else {
                            Z z2 = new Z(C2, th);
                            do {
                                atomicReferenceFieldUpdater = f38a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, n2, z2)) {
                                    M(C2, th);
                                    jVar = AbstractC0022x.f76c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == n2);
                        }
                    } else {
                        Object S2 = S(D3, new C0013n(th, false));
                        if (S2 == AbstractC0022x.f76c) {
                            throw new IllegalStateException(("Cannot happen in " + D3).toString());
                        }
                        if (S2 != AbstractC0022x.f78e) {
                            obj2 = S2;
                            break;
                        }
                    }
                } else {
                    synchronized (D3) {
                        try {
                            Z z3 = (Z) D3;
                            z3.getClass();
                            if (Z.f30d.get(z3) == AbstractC0022x.f80g) {
                                jVar = AbstractC0022x.f79f;
                            } else {
                                boolean e2 = ((Z) D3).e();
                                if (th == null) {
                                    th = x(obj);
                                }
                                ((Z) D3).a(th);
                                Throwable c2 = e2 ? null : ((Z) D3).c();
                                if (c2 != null) {
                                    M(((Z) D3).f31a, c2);
                                }
                                jVar = AbstractC0022x.f76c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = jVar;
        }
        if (obj2 != AbstractC0022x.f76c && obj2 != AbstractC0022x.f77d) {
            if (obj2 == AbstractC0022x.f79f) {
                return false;
            }
            p(obj2);
        }
        return true;
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final boolean t(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) f39b.get(this);
        return (interfaceC0008i == null || interfaceC0008i == d0.f43a) ? z2 : interfaceC0008i.c(th) || z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + R(D()) + '}');
        sb.append('@');
        sb.append(AbstractC0022x.b(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && A();
    }

    public final void w(N n2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39b;
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0008i != null) {
            interfaceC0008i.a();
            atomicReferenceFieldUpdater.set(this, d0.f43a);
        }
        C0015p c0015p = null;
        C0013n c0013n = obj instanceof C0013n ? (C0013n) obj : null;
        Throwable th = c0013n != null ? c0013n.f62a : null;
        if (n2 instanceof W) {
            try {
                ((W) n2).k(th);
                return;
            } catch (Throwable th2) {
                F(new C0015p("Exception in completion handler " + n2 + " for " + this, th2));
                return;
            }
        }
        c0 d2 = n2.d();
        if (d2 != null) {
            Object g2 = d2.g();
            kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (F1.k kVar = (F1.k) g2; !kVar.equals(d2); kVar = kVar.h()) {
                if (kVar instanceof W) {
                    W w2 = (W) kVar;
                    try {
                        w2.k(th);
                    } catch (Throwable th3) {
                        if (c0015p != null) {
                            AbstractC1050a.a(c0015p, th3);
                        } else {
                            c0015p = new C0015p("Exception in completion handler " + w2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0015p != null) {
                F(c0015p);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((f0) obj);
        Object D2 = b0Var.D();
        if (D2 instanceof Z) {
            cancellationException = ((Z) D2).c();
        } else if (D2 instanceof C0013n) {
            cancellationException = ((C0013n) D2).f62a;
        } else {
            if (D2 instanceof N) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + D2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new T("Parent job is ".concat(R(D2)), cancellationException, b0Var);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(Z z2, Object obj) {
        Throwable th = null;
        C0013n c0013n = obj instanceof C0013n ? (C0013n) obj : null;
        Throwable th2 = c0013n != null ? c0013n.f62a : null;
        synchronized (z2) {
            z2.e();
            ArrayList<Throwable> g2 = z2.g(th2);
            if (!g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (z2.e()) {
                th = new T(u(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC1050a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0013n(th, false);
        }
        if (th != null && (t(th) || E(th))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0013n.f61b.compareAndSet((C0013n) obj, 0, 1);
        }
        N(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38a;
        Object o2 = obj instanceof N ? new O((N) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z2, o2) && atomicReferenceFieldUpdater.get(this) == z2) {
        }
        w(z2, obj);
        return obj;
    }

    public final CancellationException z() {
        CancellationException cancellationException;
        Object D2 = D();
        if (!(D2 instanceof Z)) {
            if (D2 instanceof N) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(D2 instanceof C0013n)) {
                return new T(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0013n) D2).f62a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new T(u(), th, this) : cancellationException;
        }
        Throwable c2 = ((Z) D2).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = u();
        }
        return new T(concat, c2, this);
    }

    public void O() {
    }

    public void F(C0015p c0015p) {
        throw c0015p;
    }

    public void N(Object obj) {
    }

    public void p(Object obj) {
    }
}
