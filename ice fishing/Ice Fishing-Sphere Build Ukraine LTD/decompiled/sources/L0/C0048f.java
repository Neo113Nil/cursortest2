package L0;

import Q0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.AbstractC0249d;

/* renamed from: L0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0048f extends B implements InterfaceC0047e, x0.c, m0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f653j = AtomicIntegerFieldUpdater.newUpdater(C0048f.class, "_decisionAndIndex");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f654k = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_state");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f655l = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public final v0.d f656h;

    /* renamed from: i, reason: collision with root package name */
    public final v0.i f657i;

    public C0048f(int i2, v0.d dVar) {
        super(i2);
        this.f656h = dVar;
        this.f657i = dVar.j();
        this._decisionAndIndex = 536870911;
        this._state = C0044b.f648e;
    }

    public static Object D(d0 d0Var, Object obj, int i2, D0.l lVar) {
        if ((obj instanceof C0056n) || !AbstractC0064w.f(i2)) {
            return obj;
        }
        if (lVar != null || (d0Var instanceof E)) {
            return new C0055m(obj, d0Var instanceof E ? (E) d0Var : null, lVar, (CancellationException) null, 16);
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
        v0.d dVar = this.f656h;
        Throwable th = null;
        Q0.h hVar = dVar instanceof Q0.h ? (Q0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q0.h.f882l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f872d;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f654k;
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
            if (obj2 instanceof C0049g) {
                C0049g c0049g = (C0049g) obj2;
                c0049g.getClass();
                if (C0049g.f658c.compareAndSet(c0049g, 0, 1)) {
                    if (lVar != null) {
                        o(lVar, c0049g.f671a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // L0.m0
    public final void a(Q0.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f653j;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        x(vVar);
    }

    @Override // L0.B
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f654k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0056n) {
                return;
            }
            if (!(obj2 instanceof C0055m)) {
                C0055m c0055m = new C0055m(obj2, (E) null, (D0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj2;
            if (c0055m2.f669e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0055m a2 = C0055m.a(c0055m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            E e2 = c0055m2.f666b;
            if (e2 != null) {
                n(e2, cancellationException);
            }
            D0.l lVar = c0055m2.f667c;
            if (lVar != null) {
                o(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // v0.d
    public final void c(Object obj) {
        Throwable a2 = AbstractC0249d.a(obj);
        if (a2 != null) {
            obj = new C0056n(a2, false);
        }
        C(obj, this.f610g, null);
    }

    @Override // L0.InterfaceC0047e
    public final A.j d(Object obj, D0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f654k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof d0;
            A.j jVar = AbstractC0064w.f683a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0055m;
                return null;
            }
            Object D2 = D((d0) obj2, obj, this.f610g, lVar);
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

    @Override // L0.InterfaceC0047e
    public final void e(Object obj, D0.l lVar) {
        C(obj, this.f610g, lVar);
    }

    @Override // L0.B
    public final v0.d f() {
        return this.f656h;
    }

    @Override // L0.B
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f656h;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // L0.B
    public final Object i(Object obj) {
        return obj instanceof C0055m ? ((C0055m) obj).f665a : obj;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f657i;
    }

    @Override // L0.InterfaceC0047e
    public final void k(Object obj) {
        s(this.f610g);
    }

    @Override // L0.B
    public final Object m() {
        return f654k.get(this);
    }

    public final void n(E e2, Throwable th) {
        try {
            e2.b(th);
        } catch (Throwable th2) {
            AbstractC0064w.d(new C0058p("Exception in invokeOnCancellation handler for " + this, th2), this.f657i);
        }
    }

    public final void o(D0.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0064w.d(new C0058p("Exception in resume onCancellation handler for " + this, th2), this.f657i);
        }
    }

    public final void p(Q0.v vVar, Throwable th) {
        v0.i iVar = this.f657i;
        int i2 = f653j.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0064w.d(new C0058p("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f654k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d0) {
                C0049g c0049g = new C0049g(this, th, (obj instanceof E) || (obj instanceof Q0.v));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0049g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                d0 d0Var = (d0) obj;
                if (d0Var instanceof E) {
                    n((E) obj, th);
                } else if (d0Var instanceof Q0.v) {
                    p((Q0.v) obj, th);
                }
                if (!y()) {
                    r();
                }
                s(this.f610g);
                return;
            }
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f655l;
        D d2 = (D) atomicReferenceFieldUpdater.get(this);
        if (d2 == null) {
            return;
        }
        d2.d();
        atomicReferenceFieldUpdater.set(this, c0.f651e);
    }

    public final void s(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f653j;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                v0.d dVar = this.f656h;
                if (z2 || !(dVar instanceof Q0.h) || AbstractC0064w.f(i2) != AbstractC0064w.f(this.f610g)) {
                    AbstractC0064w.i(this, dVar, z2);
                    return;
                }
                AbstractC0061t abstractC0061t = ((Q0.h) dVar).f883h;
                v0.i j2 = ((Q0.h) dVar).f884i.j();
                if (abstractC0061t.d()) {
                    abstractC0061t.c(j2, this);
                    return;
                }
                I a2 = i0.a();
                if (a2.f619g >= 4294967296L) {
                    u0.b bVar = a2.f621i;
                    if (bVar == null) {
                        bVar = new u0.b();
                        a2.f621i = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0064w.i(this, dVar, true);
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
        sb.append(AbstractC0064w.k(this.f656h));
        sb.append("){");
        Object obj = f654k.get(this);
        sb.append(obj instanceof d0 ? "Active" : obj instanceof C0049g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0064w.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean y2 = y();
        do {
            atomicIntegerFieldUpdater = f653j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (y2) {
                    B();
                }
                Object obj = f654k.get(this);
                if (obj instanceof C0056n) {
                    throw ((C0056n) obj).f671a;
                }
                if (AbstractC0064w.f(this.f610g)) {
                    Q q2 = (Q) this.f657i.i(C0062u.f682f);
                    if (q2 != null && !q2.b()) {
                        CancellationException A2 = ((a0) q2).A();
                        b(obj, A2);
                        throw A2;
                    }
                }
                return i(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((D) f655l.get(this)) == null) {
            w();
        }
        if (y2) {
            B();
        }
        return w0.a.f3076e;
    }

    public final void v() {
        D w2 = w();
        if (w2 == null || (f654k.get(this) instanceof d0)) {
            return;
        }
        w2.d();
        f655l.set(this, c0.f651e);
    }

    public final D w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q q2 = (Q) this.f657i.i(C0062u.f682f);
        if (q2 == null) {
            return null;
        }
        D e2 = AbstractC0064w.e(q2, true, new C0050h(this), 2);
        do {
            atomicReferenceFieldUpdater = f655l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void x(d0 d0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f654k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0044b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof E ? true : obj instanceof Q0.v) {
                z(d0Var, obj);
                throw null;
            }
            if (obj instanceof C0056n) {
                C0056n c0056n = (C0056n) obj;
                c0056n.getClass();
                if (!C0056n.f670b.compareAndSet(c0056n, 0, 1)) {
                    z(d0Var, obj);
                    throw null;
                }
                if (obj instanceof C0049g) {
                    if (!(obj instanceof C0056n)) {
                        c0056n = null;
                    }
                    Throwable th = c0056n != null ? c0056n.f671a : null;
                    if (d0Var instanceof E) {
                        n((E) d0Var, th);
                        return;
                    } else {
                        E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((Q0.v) d0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0055m)) {
                if (d0Var instanceof Q0.v) {
                    return;
                }
                E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0055m c0055m = new C0055m(obj, (E) d0Var, (D0.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj;
            if (c0055m2.f666b != null) {
                z(d0Var, obj);
                throw null;
            }
            if (d0Var instanceof Q0.v) {
                return;
            }
            E0.i.c(d0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            E e2 = (E) d0Var;
            Throwable th2 = c0055m2.f669e;
            if (th2 != null) {
                n(e2, th2);
                return;
            }
            C0055m a2 = C0055m.a(c0055m2, e2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f610g == 2) {
            v0.d dVar = this.f656h;
            E0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (Q0.h.f882l.get((Q0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
