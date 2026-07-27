package K0;

import P0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: K0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0030f extends B implements InterfaceC0029e, x0.c, m0 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f505k = AtomicIntegerFieldUpdater.newUpdater(C0030f.class, "_decisionAndIndex");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f506l = AtomicReferenceFieldUpdater.newUpdater(C0030f.class, Object.class, "_state");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f507m = AtomicReferenceFieldUpdater.newUpdater(C0030f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: i, reason: collision with root package name */
    public final v0.d f508i;

    /* renamed from: j, reason: collision with root package name */
    public final v0.i f509j;

    public C0030f(int i2, v0.d dVar) {
        super(i2);
        this.f508i = dVar;
        this.f509j = dVar.j();
        this._decisionAndIndex = 536870911;
        this._state = C0026b.f500f;
    }

    public static Object D(d0 d0Var, Object obj, int i2, D0.l lVar) {
        if ((obj instanceof C0038n) || !AbstractC0046w.f(i2)) {
            return obj;
        }
        if (lVar != null || (d0Var instanceof E)) {
            return new C0037m(obj, d0Var instanceof E ? (E) d0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(d0 d0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + d0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        v0.d dVar = this.f508i;
        Throwable th = null;
        P0.h hVar = dVar instanceof P0.h ? (P0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P0.h.f873m;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f863d;
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
            r();
            q(th);
        }
    }

    public final void C(Object obj, int i2, D0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f506l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                Object D2 = D((d0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(i2);
                return;
            }
            if (obj2 instanceof C0031g) {
                C0031g c0031g = (C0031g) obj2;
                c0031g.getClass();
                if (C0031g.f510c.compareAndSet(c0031g, 0, 1)) {
                    if (lVar != null) {
                        o(lVar, c0031g.f523a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // K0.m0
    public final void a(P0.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f505k;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(vVar);
    }

    @Override // K0.B
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f506l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0038n) {
                return;
            }
            if (!(obj2 instanceof C0037m)) {
                C0037m c0037m = new C0037m(obj2, (E) null, (D0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0037m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0037m c0037m2 = (C0037m) obj2;
            if (c0037m2.f521e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0037m a2 = C0037m.a(c0037m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            E e2 = c0037m2.f518b;
            if (e2 != null) {
                n(e2, cancellationException);
            }
            D0.l lVar = c0037m2.f519c;
            if (lVar != null) {
                o(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // v0.d
    public final void c(Object obj) {
        Throwable a2 = t0.d.a(obj);
        if (a2 != null) {
            obj = new C0038n(a2, false);
        }
        C(obj, this.f462h, null);
    }

    @Override // K0.InterfaceC0029e
    public final A.j d(Object obj, D0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f506l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof d0;
            A.j jVar = AbstractC0046w.f535a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0037m;
                return null;
            }
            Object D2 = D((d0) obj2, obj, this.f462h, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (y()) {
                return jVar;
            }
            r();
            return jVar;
        }
    }

    @Override // K0.InterfaceC0029e
    public final void e(Object obj, D0.l lVar) {
        C(obj, this.f462h, lVar);
    }

    @Override // K0.B
    public final v0.d f() {
        return this.f508i;
    }

    @Override // K0.B
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f508i;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // K0.B
    public final Object i(Object obj) {
        return obj instanceof C0037m ? ((C0037m) obj).f517a : obj;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f509j;
    }

    @Override // K0.InterfaceC0029e
    public final void k(Object obj) {
        s(this.f462h);
    }

    @Override // K0.B
    public final Object m() {
        return f506l.get(this);
    }

    public final void n(E e2, Throwable th) {
        try {
            e2.b(th);
        } catch (Throwable th2) {
            AbstractC0046w.d(new C0040p("Exception in invokeOnCancellation handler for " + this, th2), this.f509j);
        }
    }

    public final void o(D0.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0046w.d(new C0040p("Exception in resume onCancellation handler for " + this, th2), this.f509j);
        }
    }

    public final void p(P0.v vVar, Throwable th) {
        v0.i iVar = this.f509j;
        int i2 = f505k.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0046w.d(new C0040p("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f506l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d0) {
                C0031g c0031g = new C0031g(this, th, (obj instanceof E) || (obj instanceof P0.v));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0031g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                d0 d0Var = (d0) obj;
                if (d0Var instanceof E) {
                    n((E) obj, th);
                } else if (d0Var instanceof P0.v) {
                    p((P0.v) obj, th);
                }
                if (!y()) {
                    r();
                }
                s(this.f462h);
                return;
            }
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f507m;
        D d2 = (D) atomicReferenceFieldUpdater.get(this);
        if (d2 == null) {
            return;
        }
        d2.d();
        atomicReferenceFieldUpdater.set(this, c0.f503f);
    }

    public final void s(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f505k;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                v0.d dVar = this.f508i;
                if (z2 || !(dVar instanceof P0.h) || AbstractC0046w.f(i2) != AbstractC0046w.f(this.f462h)) {
                    AbstractC0046w.i(this, dVar, z2);
                    return;
                }
                AbstractC0043t abstractC0043t = ((P0.h) dVar).f874i;
                v0.i j2 = ((P0.h) dVar).f875j.j();
                if (abstractC0043t.d()) {
                    abstractC0043t.c(j2, this);
                    return;
                }
                I a2 = i0.a();
                if (a2.f471h >= 4294967296L) {
                    u0.b bVar = a2.f473j;
                    if (bVar == null) {
                        bVar = new u0.b();
                        a2.f473j = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0046w.i(this, dVar, true);
                    do {
                    } while (a2.l());
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

    public Throwable t(a0 a0Var) {
        return a0Var.A();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0046w.k(this.f508i));
        sb.append("){");
        Object obj = f506l.get(this);
        sb.append(obj instanceof d0 ? "Active" : obj instanceof C0031g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0046w.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean y2 = y();
        do {
            atomicIntegerFieldUpdater = f505k;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (y2) {
                    B();
                }
                Object obj = f506l.get(this);
                if (obj instanceof C0038n) {
                    throw ((C0038n) obj).f523a;
                }
                if (AbstractC0046w.f(this.f462h)) {
                    Q q2 = (Q) this.f509j.i(C0044u.f534g);
                    if (q2 != null && !q2.b()) {
                        CancellationException A2 = ((a0) q2).A();
                        b(obj, A2);
                        throw A2;
                    }
                }
                return i(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((D) f507m.get(this)) == null) {
            w();
        }
        if (y2) {
            B();
        }
        return w0.a.f3071f;
    }

    public final void v() {
        D w2 = w();
        if (w2 == null || (f506l.get(this) instanceof d0)) {
            return;
        }
        w2.d();
        f507m.set(this, c0.f503f);
    }

    public final D w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q q2 = (Q) this.f509j.i(C0044u.f534g);
        if (q2 == null) {
            return null;
        }
        D e2 = AbstractC0046w.e(q2, true, new C0032h(this), 2);
        do {
            atomicReferenceFieldUpdater = f507m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void x(d0 d0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f506l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0026b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof E ? true : obj instanceof P0.v) {
                z(d0Var, obj);
                throw null;
            }
            if (obj instanceof C0038n) {
                C0038n c0038n = (C0038n) obj;
                c0038n.getClass();
                if (!C0038n.f522b.compareAndSet(c0038n, 0, 1)) {
                    z(d0Var, obj);
                    throw null;
                }
                if (obj instanceof C0031g) {
                    if (!(obj instanceof C0038n)) {
                        c0038n = null;
                    }
                    Throwable th = c0038n != null ? c0038n.f523a : null;
                    if (d0Var instanceof E) {
                        n((E) d0Var, th);
                        return;
                    } else {
                        E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((P0.v) d0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0037m)) {
                if (d0Var instanceof P0.v) {
                    return;
                }
                E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0037m c0037m = new C0037m(obj, (E) d0Var, (D0.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0037m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0037m c0037m2 = (C0037m) obj;
            if (c0037m2.f518b != null) {
                z(d0Var, obj);
                throw null;
            }
            if (d0Var instanceof P0.v) {
                return;
            }
            E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            E e2 = (E) d0Var;
            Throwable th2 = c0037m2.f521e;
            if (th2 != null) {
                n(e2, th2);
                return;
            }
            C0037m a2 = C0037m.a(c0037m2, e2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f462h == 2) {
            v0.d dVar = this.f508i;
            E0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (P0.h.f873m.get((P0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
