package L1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: L1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d extends AbstractC0022x implements InterfaceC0002c, x1.d, d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f555f = AtomicIntegerFieldUpdater.newUpdater(C0003d.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f556g = AtomicReferenceFieldUpdater.newUpdater(C0003d.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f557h = AtomicReferenceFieldUpdater.newUpdater(C0003d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final v1.d f558d;
    public final v1.i e;

    public C0003d(v1.d dVar, int i) {
        super(i);
        this.f558d = dVar;
        this.e = dVar.h();
        this._decisionAndIndex = 536870911;
        this._state = C0000a.f551a;
    }

    public static void v(W w2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + w2 + ", already has " + obj).toString());
    }

    public static Object y(W w2, Object obj, int i, C1.l lVar) {
        if ((obj instanceof C0009j) || !AbstractC0018t.d(i)) {
            return obj;
        }
        if (lVar != null || (w2 instanceof A)) {
            return new C0008i(obj, w2 instanceof A ? (A) w2 : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // L1.d0
    public final void a(N1.h hVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f555f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        t(hVar);
    }

    @Override // v1.d
    public final void b(Object obj) {
        Throwable a2 = t1.f.a(obj);
        if (a2 != null) {
            obj = new C0009j(a2, false);
        }
        x(obj, this.f585c, null);
    }

    @Override // L1.AbstractC0022x
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f556g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0009j) {
                return;
            }
            if (!(obj2 instanceof C0008i)) {
                C0008i c0008i = new C0008i(obj2, (A) null, (C1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0008i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0008i c0008i2 = (C0008i) obj2;
            if (c0008i2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0008i a2 = C0008i.a(c0008i2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            A a3 = c0008i2.f561b;
            if (a3 != null) {
                k(a3, cancellationException);
            }
            C1.l lVar = c0008i2.f562c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // L1.AbstractC0022x
    public final v1.d d() {
        return this.f558d;
    }

    @Override // x1.d
    public final x1.d e() {
        v1.d dVar = this.f558d;
        if (dVar instanceof x1.d) {
            return (x1.d) dVar;
        }
        return null;
    }

    @Override // L1.AbstractC0022x
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override // L1.AbstractC0022x
    public final Object g(Object obj) {
        return obj instanceof C0008i ? ((C0008i) obj).f560a : obj;
    }

    @Override // v1.d
    public final v1.i h() {
        return this.e;
    }

    @Override // L1.AbstractC0022x
    public final Object j() {
        return f556g.get(this);
    }

    public final void k(A a2, Throwable th) {
        try {
            a2.a(th);
        } catch (Throwable th2) {
            AbstractC0018t.b(new C0011l("Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    public final void l(C1.l lVar, Throwable th) {
        try {
            lVar.g(th);
        } catch (Throwable th2) {
            AbstractC0018t.b(new C0011l("Exception in resume onCancellation handler for " + this, th2), this.e);
        }
    }

    public final void m(Q1.s sVar, Throwable th) {
        v1.i iVar = this.e;
        int i = f555f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i, iVar);
        } catch (Throwable th2) {
            AbstractC0018t.b(new C0011l("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f556g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0004e c0004e = new C0004e(this, th, (obj instanceof A) || (obj instanceof Q1.s));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0004e)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                W w2 = (W) obj;
                if (w2 instanceof A) {
                    k((A) obj, th);
                } else if (w2 instanceof Q1.s) {
                    m((Q1.s) obj, th);
                }
                if (!u()) {
                    o();
                }
                p(this.f585c);
                return;
            }
            return;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f557h;
        InterfaceC0024z interfaceC0024z = (InterfaceC0024z) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0024z == null) {
            return;
        }
        interfaceC0024z.e();
        atomicReferenceFieldUpdater.set(this, V.f549a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f555f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                v1.d dVar = this.f558d;
                if (z2 || !(dVar instanceof Q1.g) || AbstractC0018t.d(i) != AbstractC0018t.d(this.f585c)) {
                    AbstractC0018t.e(this, dVar, z2);
                    return;
                }
                AbstractC0015p abstractC0015p = ((Q1.g) dVar).f945d;
                v1.i h2 = ((Q1.g) dVar).e.h();
                if (abstractC0015p.g()) {
                    abstractC0015p.b(h2, this);
                    return;
                }
                E a2 = a0.a();
                if (a2.f529c >= 4294967296L) {
                    u1.e eVar = a2.e;
                    if (eVar == null) {
                        eVar = new u1.e();
                        a2.e = eVar;
                    }
                    eVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0018t.e(this, dVar, true);
                    do {
                    } while (a2.k());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean u2 = u();
        do {
            atomicIntegerFieldUpdater = f555f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (u2) {
                    w();
                }
                Object obj = f556g.get(this);
                if (obj instanceof C0009j) {
                    throw ((C0009j) obj).f565a;
                }
                if (AbstractC0018t.d(this.f585c)) {
                    K k2 = (K) this.e.e(C0016q.f576b);
                    if (k2 != null && !k2.a()) {
                        CancellationException n2 = ((T) k2).n();
                        c(obj, n2);
                        throw n2;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC0024z) f557h.get(this)) == null) {
            s();
        }
        if (u2) {
            w();
        }
        return w1.a.f4662a;
    }

    public final void r() {
        InterfaceC0024z s2 = s();
        if (s2 == null || (f556g.get(this) instanceof W)) {
            return;
        }
        s2.e();
        f557h.set(this, V.f549a);
    }

    public final InterfaceC0024z s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K k2 = (K) this.e.e(C0016q.f576b);
        if (k2 == null) {
            return null;
        }
        InterfaceC0024z c2 = AbstractC0018t.c(k2, true, new C0005f(this), 2);
        do {
            atomicReferenceFieldUpdater = f557h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return c2;
    }

    public final void t(W w2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f556g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0000a) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof A ? true : obj instanceof Q1.s) {
                v(w2, obj);
                throw null;
            }
            if (obj instanceof C0009j) {
                C0009j c0009j = (C0009j) obj;
                c0009j.getClass();
                if (!C0009j.f564b.compareAndSet(c0009j, 0, 1)) {
                    v(w2, obj);
                    throw null;
                }
                if (obj instanceof C0004e) {
                    if (!(obj instanceof C0009j)) {
                        c0009j = null;
                    }
                    Throwable th = c0009j != null ? c0009j.f565a : null;
                    if (w2 instanceof A) {
                        k((A) w2, th);
                        return;
                    } else {
                        D1.i.c(w2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((Q1.s) w2, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0008i)) {
                if (w2 instanceof Q1.s) {
                    return;
                }
                D1.i.c(w2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0008i c0008i = new C0008i(obj, (A) w2, (C1.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0008i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0008i c0008i2 = (C0008i) obj;
            if (c0008i2.f561b != null) {
                v(w2, obj);
                throw null;
            }
            if (w2 instanceof Q1.s) {
                return;
            }
            D1.i.c(w2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            A a2 = (A) w2;
            Throwable th2 = c0008i2.e;
            if (th2 != null) {
                k(a2, th2);
                return;
            }
            C0008i a3 = C0008i.a(c0008i2, a2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0018t.f(this.f558d));
        sb.append("){");
        Object obj = f556g.get(this);
        sb.append(obj instanceof W ? "Active" : obj instanceof C0004e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0018t.a(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.f585c == 2) {
            v1.d dVar = this.f558d;
            D1.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (Q1.g.f944h.get((Q1.g) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void w() {
        v1.d dVar = this.f558d;
        Throwable th = null;
        Q1.g gVar = dVar instanceof Q1.g ? (Q1.g) dVar : null;
        if (gVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q1.g.f944h;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                Q1.u uVar = Q1.a.f936d;
                if (obj == uVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }

    public final void x(Object obj, int i, C1.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f556g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                Object y2 = y((W) obj2, obj, i, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, y2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!u()) {
                    o();
                }
                p(i);
                return;
            }
            if (obj2 instanceof C0004e) {
                C0004e c0004e = (C0004e) obj2;
                c0004e.getClass();
                if (C0004e.f559c.compareAndSet(c0004e, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c0004e.f565a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
