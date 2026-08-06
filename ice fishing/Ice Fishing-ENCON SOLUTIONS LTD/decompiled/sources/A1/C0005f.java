package A1;

import h1.AbstractC0236f;
import i1.C0250g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.EnumC0985a;
import n1.InterfaceC0992c;

/* renamed from: A1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0005f extends C implements InterfaceC0004e, InterfaceC0992c, n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f44f = AtomicIntegerFieldUpdater.newUpdater(C0005f.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f45g = AtomicReferenceFieldUpdater.newUpdater(C0005f.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f46h = AtomicReferenceFieldUpdater.newUpdater(C0005f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final l1.d f47d;

    /* renamed from: e, reason: collision with root package name */
    public final l1.i f48e;

    public C0005f(int i2, l1.d dVar) {
        super(i2);
        this.f47d = dVar;
        this.f48e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0001b.f37a;
    }

    public static Object C(e0 e0Var, Object obj, int i2, t1.l lVar) {
        if ((obj instanceof C0013n) || !AbstractC0022x.f(i2)) {
            return obj;
        }
        if (lVar != null || (e0Var instanceof F)) {
            return new C0012m(obj, e0Var instanceof F ? (F) e0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(e0 e0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + e0Var + ", already has " + obj).toString());
    }

    public final void A() {
        l1.d dVar = this.f47d;
        Throwable th = null;
        F1.h hVar = dVar instanceof F1.h ? (F1.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.h.f602h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C.j jVar = F1.a.f592d;
                if (obj == jVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            q();
            p(th);
        }
    }

    public final void B(Object obj, int i2, t1.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof e0) {
                Object C2 = C((e0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    q();
                }
                r(i2);
                return;
            }
            if (obj2 instanceof C0006g) {
                C0006g c0006g = (C0006g) obj2;
                c0006g.getClass();
                if (C0006g.f49c.compareAndSet(c0006g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0006g.f62a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // A1.n0
    public final void a(F1.u uVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f44f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        w(uVar);
    }

    @Override // A1.C
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof e0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0013n) {
                return;
            }
            if (!(obj2 instanceof C0012m)) {
                C0012m c0012m = new C0012m(obj2, (F) null, (t1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0012m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0012m c0012m2 = (C0012m) obj2;
            if (c0012m2.f59e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0012m a2 = C0012m.a(c0012m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            F f2 = c0012m2.f56b;
            if (f2 != null) {
                l(f2, cancellationException);
            }
            t1.l lVar = c0012m2.f57c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // A1.C
    public final l1.d c() {
        return this.f47d;
    }

    @Override // A1.InterfaceC0004e
    public final C.j d(Object obj, t1.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof e0;
            C.j jVar = AbstractC0022x.f74a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0012m;
                return null;
            }
            Object C2 = C((e0) obj2, obj, this.f1c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (x()) {
                return jVar;
            }
            q();
            return jVar;
        }
    }

    @Override // A1.InterfaceC0004e
    public final void e(Object obj, t1.l lVar) {
        B(obj, this.f1c, lVar);
    }

    @Override // n1.InterfaceC0992c
    public final InterfaceC0992c f() {
        l1.d dVar = this.f47d;
        if (dVar instanceof InterfaceC0992c) {
            return (InterfaceC0992c) dVar;
        }
        return null;
    }

    @Override // A1.C
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // l1.d
    public final l1.i getContext() {
        return this.f48e;
    }

    @Override // A1.C
    public final Object h(Object obj) {
        return obj instanceof C0012m ? ((C0012m) obj).f55a : obj;
    }

    @Override // l1.d
    public final void i(Object obj) {
        Throwable a2 = AbstractC0236f.a(obj);
        if (a2 != null) {
            obj = new C0013n(a2, false);
        }
        B(obj, this.f1c, null);
    }

    @Override // A1.C
    public final Object k() {
        return f45g.get(this);
    }

    public final void l(F f2, Throwable th) {
        try {
            f2.a(th);
        } catch (Throwable th2) {
            AbstractC0022x.d(new C0015p("Exception in invokeOnCancellation handler for " + this, th2), this.f48e);
        }
    }

    public final void m(t1.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0022x.d(new C0015p("Exception in resume onCancellation handler for " + this, th2), this.f48e);
        }
    }

    @Override // A1.InterfaceC0004e
    public final void n(Object obj) {
        r(this.f1c);
    }

    public final void o(F1.u uVar, Throwable th) {
        l1.i iVar = this.f48e;
        int i2 = f44f.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0022x.d(new C0015p("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void p(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof e0) {
                C0006g c0006g = new C0006g(this, th, (obj instanceof F) || (obj instanceof F1.u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0006g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                e0 e0Var = (e0) obj;
                if (e0Var instanceof F) {
                    l((F) obj, th);
                } else if (e0Var instanceof F1.u) {
                    o((F1.u) obj, th);
                }
                if (!x()) {
                    q();
                }
                r(this.f1c);
                return;
            }
            return;
        }
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46h;
        E e2 = (E) atomicReferenceFieldUpdater.get(this);
        if (e2 == null) {
            return;
        }
        e2.a();
        atomicReferenceFieldUpdater.set(this, d0.f43a);
    }

    public final void r(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f44f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                l1.d dVar = this.f47d;
                if (z2 || !(dVar instanceof F1.h) || AbstractC0022x.f(i2) != AbstractC0022x.f(this.f1c)) {
                    AbstractC0022x.i(this, dVar, z2);
                    return;
                }
                AbstractC0018t abstractC0018t = ((F1.h) dVar).f603d;
                l1.i context = ((F1.h) dVar).f604e.getContext();
                if (abstractC0018t.n()) {
                    abstractC0018t.j(context, this);
                    return;
                }
                J a2 = j0.a();
                if (a2.f10c >= 4294967296L) {
                    C0250g c0250g = a2.f12e;
                    if (c0250g == null) {
                        c0250g = new C0250g();
                        a2.f12e = c0250g;
                    }
                    c0250g.addLast(this);
                    return;
                }
                a2.q(true);
                try {
                    AbstractC0022x.i(this, dVar, true);
                    do {
                    } while (a2.s());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable s(b0 b0Var) {
        return b0Var.z();
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean x2 = x();
        do {
            atomicIntegerFieldUpdater = f44f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x2) {
                    A();
                }
                Object obj = f45g.get(this);
                if (obj instanceof C0013n) {
                    throw ((C0013n) obj).f62a;
                }
                if (AbstractC0022x.f(this.f1c)) {
                    S s2 = (S) this.f48e.m(C0019u.f73b);
                    if (s2 != null && !s2.b()) {
                        CancellationException z2 = ((b0) s2).z();
                        b(obj, z2);
                        throw z2;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((E) f46h.get(this)) == null) {
            v();
        }
        if (x2) {
            A();
        }
        return EnumC0985a.f8194a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0022x.k(this.f47d));
        sb.append("){");
        Object obj = f45g.get(this);
        sb.append(obj instanceof e0 ? "Active" : obj instanceof C0006g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0022x.b(this));
        return sb.toString();
    }

    public final void u() {
        E v2 = v();
        if (v2 == null || (f45g.get(this) instanceof e0)) {
            return;
        }
        v2.a();
        f46h.set(this, d0.f43a);
    }

    public final E v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S s2 = (S) this.f48e.m(C0019u.f73b);
        if (s2 == null) {
            return null;
        }
        E e2 = AbstractC0022x.e(s2, true, new C0007h(this), 2);
        do {
            atomicReferenceFieldUpdater = f46h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void w(e0 e0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0001b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof F ? true : obj instanceof F1.u) {
                y(e0Var, obj);
                throw null;
            }
            if (obj instanceof C0013n) {
                C0013n c0013n = (C0013n) obj;
                c0013n.getClass();
                if (!C0013n.f61b.compareAndSet(c0013n, 0, 1)) {
                    y(e0Var, obj);
                    throw null;
                }
                if (obj instanceof C0006g) {
                    if (!(obj instanceof C0013n)) {
                        c0013n = null;
                    }
                    Throwable th = c0013n != null ? c0013n.f62a : null;
                    if (e0Var instanceof F) {
                        l((F) e0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.i.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        o((F1.u) e0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0012m)) {
                if (e0Var instanceof F1.u) {
                    return;
                }
                kotlin.jvm.internal.i.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0012m c0012m = new C0012m(obj, (F) e0Var, (t1.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0012m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0012m c0012m2 = (C0012m) obj;
            if (c0012m2.f56b != null) {
                y(e0Var, obj);
                throw null;
            }
            if (e0Var instanceof F1.u) {
                return;
            }
            kotlin.jvm.internal.i.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            F f2 = (F) e0Var;
            Throwable th2 = c0012m2.f59e;
            if (th2 != null) {
                l(f2, th2);
                return;
            }
            C0012m a2 = C0012m.a(c0012m2, f2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f1c == 2) {
            l1.d dVar = this.f47d;
            kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (F1.h.f602h.get((F1.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
