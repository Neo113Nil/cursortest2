package K0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class a0 implements Q, e0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f498f = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f499g = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public a0(boolean z2) {
        this._state = z2 ? AbstractC0046w.f543i : AbstractC0046w.f542h;
    }

    public static C0034j M(P0.l lVar) {
        while (lVar.m()) {
            P0.l h2 = lVar.h();
            if (h2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P0.l.f887g;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (P0.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = h2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0034j) {
                    return (C0034j) lVar;
                }
                if (lVar instanceof b0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof Y)) {
            return obj instanceof M ? ((M) obj).b() ? "Active" : "New" : obj instanceof C0038n ? "Cancelled" : "Completed";
        }
        Y y2 = (Y) obj;
        return y2.e() ? "Cancelling" : y2.f() ? "Completing" : "Active";
    }

    public final CancellationException A() {
        CancellationException cancellationException;
        Object E2 = E();
        if (!(E2 instanceof Y)) {
            if (E2 instanceof M) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(E2 instanceof C0038n)) {
                return new S(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0038n) E2).f523a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new S(v(), th, this) : cancellationException;
        }
        Throwable d2 = ((Y) E2).d();
        if (d2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d2 instanceof CancellationException ? (CancellationException) d2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = v();
        }
        return new S(concat, d2, this);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0036l;
    }

    public final b0 D(M m2) {
        b0 c2 = m2.c();
        if (c2 != null) {
            return c2;
        }
        if (m2 instanceof F) {
            return new b0();
        }
        if (m2 instanceof V) {
            Q((V) m2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + m2).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f498f.get(this);
            if (!(obj instanceof P0.r)) {
                return obj;
            }
            ((P0.r) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(Q q2) {
        int R2;
        c0 c0Var = c0.f503f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f499g;
        if (q2 == null) {
            atomicReferenceFieldUpdater.set(this, c0Var);
            return;
        }
        a0 a0Var = (a0) q2;
        do {
            R2 = a0Var.R(a0Var.E());
            if (R2 == 0) {
                break;
            }
        } while (R2 != 1);
        InterfaceC0033i interfaceC0033i = (InterfaceC0033i) AbstractC0046w.e(a0Var, true, new C0034j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0033i);
        if (E() instanceof M) {
            return;
        }
        interfaceC0033i.d();
        atomicReferenceFieldUpdater.set(this, c0Var);
    }

    public final D I(boolean z2, boolean z3, D0.l lVar) {
        V v2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z2) {
            v2 = lVar instanceof T ? (T) lVar : null;
            if (v2 == null) {
                v2 = new O(lVar);
            }
        } else {
            v2 = lVar instanceof V ? (V) lVar : null;
            if (v2 == null) {
                v2 = new P(0, lVar);
            }
        }
        v2.f483i = this;
        while (true) {
            Object E2 = E();
            if (E2 instanceof F) {
                F f2 = (F) E2;
                if (f2.f466f) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f498f;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E2, v2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E2) {
                            break;
                        }
                    }
                    return v2;
                }
                b0 b0Var = new b0();
                M l2 = f2.f466f ? b0Var : new L(b0Var);
                do {
                    atomicReferenceFieldUpdater = f498f;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f2, l2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f2);
            } else {
                if (!(E2 instanceof M)) {
                    if (z3) {
                        C0038n c0038n = E2 instanceof C0038n ? (C0038n) E2 : null;
                        lVar.i(c0038n != null ? c0038n.f523a : null);
                    }
                    return c0.f503f;
                }
                b0 c2 = ((M) E2).c();
                if (c2 == null) {
                    E0.i.c(E2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((V) E2);
                } else {
                    D d2 = c0.f503f;
                    if (z2 && (E2 instanceof Y)) {
                        synchronized (E2) {
                            try {
                                th = ((Y) E2).d();
                                if (th != null) {
                                    if ((lVar instanceof C0034j) && !((Y) E2).f()) {
                                    }
                                }
                                if (p((M) E2, c2, v2)) {
                                    if (th == null) {
                                        return v2;
                                    }
                                    d2 = v2;
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
                            lVar.i(th);
                        }
                        return d2;
                    }
                    if (p((M) E2, c2, v2)) {
                        return v2;
                    }
                }
            }
        }
    }

    public boolean J() {
        return this instanceof C0027c;
    }

    public final boolean K(Object obj) {
        Object T;
        do {
            T = T(E(), obj);
            if (T == AbstractC0046w.f537c) {
                return false;
            }
            if (T == AbstractC0046w.f538d) {
                return true;
            }
        } while (T == AbstractC0046w.f539e);
        q(T);
        return true;
    }

    public final Object L(Object obj) {
        Object T;
        do {
            T = T(E(), obj);
            if (T == AbstractC0046w.f537c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0038n c0038n = obj instanceof C0038n ? (C0038n) obj : null;
                throw new IllegalStateException(str, c0038n != null ? c0038n.f523a : null);
            }
        } while (T == AbstractC0046w.f539e);
        return T;
    }

    public final void N(b0 b0Var, Throwable th) {
        Object k2 = b0Var.k();
        E0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0040p c0040p = null;
        for (P0.l lVar = (P0.l) k2; !lVar.equals(b0Var); lVar = lVar.l()) {
            if (lVar instanceof T) {
                V v2 = (V) lVar;
                try {
                    v2.o(th);
                } catch (Throwable th2) {
                    if (c0040p != null) {
                        o.g.a(c0040p, th2);
                    } else {
                        c0040p = new C0040p("Exception in completion handler " + v2 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0040p != null) {
            G(c0040p);
        }
        u(th);
    }

    public final void Q(V v2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b0 b0Var = new b0();
        v2.getClass();
        P0.l.f887g.lazySet(b0Var, v2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P0.l.f886f;
        atomicReferenceFieldUpdater2.lazySet(b0Var, v2);
        loop0: while (true) {
            if (v2.k() == v2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(v2, v2, b0Var)) {
                    if (atomicReferenceFieldUpdater2.get(v2) != v2) {
                        break;
                    }
                }
                b0Var.j(v2);
                break loop0;
            }
            break;
        }
        P0.l l2 = v2.l();
        do {
            atomicReferenceFieldUpdater = f498f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, v2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == v2);
    }

    public final int R(Object obj) {
        boolean z2 = obj instanceof F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f498f;
        if (z2) {
            if (((F) obj).f466f) {
                return 0;
            }
            F f2 = AbstractC0046w.f543i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof L)) {
            return 0;
        }
        b0 b0Var = ((L) obj).f475f;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object T(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof M)) {
            return AbstractC0046w.f537c;
        }
        if (((obj instanceof F) || (obj instanceof V)) && !(obj instanceof C0034j) && !(obj2 instanceof C0038n)) {
            M m2 = (M) obj;
            Object n2 = obj2 instanceof M ? new N((M) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f498f;
                if (atomicReferenceFieldUpdater.compareAndSet(this, m2, n2)) {
                    O(obj2);
                    x(m2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == m2);
            return AbstractC0046w.f539e;
        }
        M m3 = (M) obj;
        b0 D2 = D(m3);
        if (D2 == null) {
            return AbstractC0046w.f539e;
        }
        C0034j c0034j = null;
        Y y2 = m3 instanceof Y ? (Y) m3 : null;
        if (y2 == null) {
            y2 = new Y(D2, null);
        }
        synchronized (y2) {
            if (y2.f()) {
                return AbstractC0046w.f537c;
            }
            Y.f489g.set(y2, 1);
            if (y2 != m3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f498f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, m3, y2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != m3) {
                        return AbstractC0046w.f539e;
                    }
                }
            }
            boolean e2 = y2.e();
            C0038n c0038n = obj2 instanceof C0038n ? (C0038n) obj2 : null;
            if (c0038n != null) {
                y2.a(c0038n.f523a);
            }
            Throwable d2 = y2.d();
            if (e2) {
                d2 = null;
            }
            if (d2 != null) {
                N(D2, d2);
            }
            C0034j c0034j2 = m3 instanceof C0034j ? (C0034j) m3 : null;
            if (c0034j2 == null) {
                b0 c2 = m3.c();
                if (c2 != null) {
                    c0034j = M(c2);
                }
            } else {
                c0034j = c0034j2;
            }
            if (c0034j != null) {
                while (AbstractC0046w.e(c0034j.f513j, false, new X(this, y2, c0034j, obj2), 1) == c0.f503f) {
                    c0034j = M(c0034j);
                    if (c0034j == null) {
                    }
                }
                return AbstractC0046w.f538d;
            }
            return z(y2, obj2);
        }
    }

    @Override // K0.Q
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new S(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // K0.Q
    public boolean b() {
        Object E2 = E();
        return (E2 instanceof M) && ((M) E2).b();
    }

    @Override // v0.i
    public final v0.i f(v0.i iVar) {
        E0.i.e(iVar, "context");
        return iVar == v0.j.f3009f ? this : (v0.i) iVar.m(this, new v0.b(1));
    }

    @Override // v0.i
    public final v0.i g(v0.h hVar) {
        return o.g.x(this, hVar);
    }

    @Override // v0.g
    public final v0.h getKey() {
        return C0044u.f534g;
    }

    @Override // v0.i
    public final v0.g i(v0.h hVar) {
        return o.g.p(this, hVar);
    }

    @Override // v0.i
    public final Object m(Object obj, D0.p pVar) {
        return pVar.f(obj, this);
    }

    public final boolean p(M m2, b0 b0Var, V v2) {
        char c2;
        Z z2 = new Z(v2, this, m2);
        do {
            P0.l h2 = b0Var.h();
            if (h2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P0.l.f887g;
                Object obj = atomicReferenceFieldUpdater.get(b0Var);
                while (true) {
                    h2 = (P0.l) obj;
                    if (!h2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(h2);
                }
            }
            P0.l.f887g.lazySet(v2, h2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P0.l.f886f;
            atomicReferenceFieldUpdater2.lazySet(v2, b0Var);
            z2.f494c = b0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(h2, b0Var, z2)) {
                    c2 = z2.a(h2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(h2) != b0Var) {
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

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        A.j jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0046w.f537c;
        if (C()) {
            do {
                Object E2 = E();
                if (!(E2 instanceof M) || ((E2 instanceof Y) && ((Y) E2).f())) {
                    obj2 = AbstractC0046w.f537c;
                    break;
                }
                obj2 = T(E2, new C0038n(y(obj), false));
            } while (obj2 == AbstractC0046w.f539e);
            if (obj2 == AbstractC0046w.f538d) {
                return true;
            }
        }
        if (obj2 == AbstractC0046w.f537c) {
            Throwable th = null;
            loop1: while (true) {
                Object E3 = E();
                if (!(E3 instanceof Y)) {
                    if (!(E3 instanceof M)) {
                        jVar = AbstractC0046w.f540f;
                        break;
                    }
                    if (th == null) {
                        th = y(obj);
                    }
                    M m2 = (M) E3;
                    if (m2.b()) {
                        b0 D2 = D(m2);
                        if (D2 == null) {
                            continue;
                        } else {
                            Y y2 = new Y(D2, th);
                            do {
                                atomicReferenceFieldUpdater = f498f;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, m2, y2)) {
                                    N(D2, th);
                                    jVar = AbstractC0046w.f537c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == m2);
                        }
                    } else {
                        Object T = T(E3, new C0038n(th, false));
                        if (T == AbstractC0046w.f537c) {
                            throw new IllegalStateException(("Cannot happen in " + E3).toString());
                        }
                        if (T != AbstractC0046w.f539e) {
                            obj2 = T;
                            break;
                        }
                    }
                } else {
                    synchronized (E3) {
                        try {
                            Y y3 = (Y) E3;
                            y3.getClass();
                            if (Y.f491i.get(y3) == AbstractC0046w.f541g) {
                                jVar = AbstractC0046w.f540f;
                            } else {
                                boolean e2 = ((Y) E3).e();
                                if (th == null) {
                                    th = y(obj);
                                }
                                ((Y) E3).a(th);
                                Throwable d2 = e2 ? null : ((Y) E3).d();
                                if (d2 != null) {
                                    N(((Y) E3).f492f, d2);
                                }
                                jVar = AbstractC0046w.f537c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = jVar;
        }
        if (obj2 != AbstractC0046w.f537c && obj2 != AbstractC0046w.f538d) {
            if (obj2 == AbstractC0046w.f540f) {
                return false;
            }
            q(obj2);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0046w.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0033i interfaceC0033i = (InterfaceC0033i) f499g.get(this);
        return (interfaceC0033i == null || interfaceC0033i == c0.f503f) ? z2 : interfaceC0033i.e(th) || z2;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    public final void x(M m2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f499g;
        InterfaceC0033i interfaceC0033i = (InterfaceC0033i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0033i != null) {
            interfaceC0033i.d();
            atomicReferenceFieldUpdater.set(this, c0.f503f);
        }
        C0040p c0040p = null;
        C0038n c0038n = obj instanceof C0038n ? (C0038n) obj : null;
        Throwable th = c0038n != null ? c0038n.f523a : null;
        if (m2 instanceof V) {
            try {
                ((V) m2).o(th);
                return;
            } catch (Throwable th2) {
                G(new C0040p("Exception in completion handler " + m2 + " for " + this, th2));
                return;
            }
        }
        b0 c2 = m2.c();
        if (c2 != null) {
            Object k2 = c2.k();
            E0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (P0.l lVar = (P0.l) k2; !lVar.equals(c2); lVar = lVar.l()) {
                if (lVar instanceof V) {
                    V v2 = (V) lVar;
                    try {
                        v2.o(th);
                    } catch (Throwable th3) {
                        if (c0040p != null) {
                            o.g.a(c0040p, th3);
                        } else {
                            c0040p = new C0040p("Exception in completion handler " + v2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0040p != null) {
                G(c0040p);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a0 a0Var = (a0) ((e0) obj);
        Object E2 = a0Var.E();
        if (E2 instanceof Y) {
            cancellationException = ((Y) E2).d();
        } else if (E2 instanceof C0038n) {
            cancellationException = ((C0038n) E2).f523a;
        } else {
            if (E2 instanceof M) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + E2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new S("Parent job is ".concat(S(E2)), cancellationException, a0Var);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(Y y2, Object obj) {
        Throwable th = null;
        C0038n c0038n = obj instanceof C0038n ? (C0038n) obj : null;
        Throwable th2 = c0038n != null ? c0038n.f523a : null;
        synchronized (y2) {
            y2.e();
            ArrayList<Throwable> g2 = y2.g(th2);
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
            } else if (y2.e()) {
                th = new S(v(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        o.g.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0038n(th, false);
        }
        if (th != null && (u(th) || F(th))) {
            E0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0038n.f522b.compareAndSet((C0038n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f498f;
        Object n2 = obj instanceof M ? new N((M) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, y2, n2) && atomicReferenceFieldUpdater.get(this) == y2) {
        }
        x(y2, obj);
        return obj;
    }

    public void G(C0040p c0040p) {
        throw c0040p;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }

    public void P() {
    }
}
