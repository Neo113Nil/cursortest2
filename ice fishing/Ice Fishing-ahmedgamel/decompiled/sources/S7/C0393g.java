package S7;

import E2.C0316m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5083i;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* renamed from: S7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0393g extends E implements InterfaceC0392f, B7.d, y0 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5240d f3046w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5245i f3047x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3044y = AtomicIntegerFieldUpdater.newUpdater(C0393g.class, "_decisionAndIndex$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3045z = AtomicReferenceFieldUpdater.newUpdater(C0393g.class, Object.class, "_state$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3043A = AtomicReferenceFieldUpdater.newUpdater(C0393g.class, Object.class, "_parentHandle$volatile");

    public C0393g(int i, InterfaceC5240d interfaceC5240d) {
        super(i);
        this.f3046w = interfaceC5240d;
        this.f3047x = interfaceC5240d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0388b.f3026n;
    }

    public static Object C(m0 m0Var, Object obj, int i, I7.l lVar) {
        if (obj instanceof C0402p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (lVar != null || (m0Var instanceof C0391e)) {
            return new C0401o(obj, m0Var instanceof C0391e ? (C0391e) m0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(m0 m0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + m0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, I7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3045z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m0) {
                Object C8 = C((m0) obj2, obj, i, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof C0394h) {
                C0394h c0394h = (C0394h) obj2;
                c0394h.getClass();
                if (C0394h.f3052c.compareAndSet(c0394h, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0394h.f3066a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0406u abstractC0406u) {
        u7.v vVar = u7.v.f41073a;
        InterfaceC5240d interfaceC5240d = this.f3046w;
        X7.h hVar = interfaceC5240d instanceof X7.h ? (X7.h) interfaceC5240d : null;
        A(vVar, (hVar != null ? hVar.f3789w : null) == abstractC0406u ? 4 : this.f2997v, null);
    }

    @Override // S7.y0
    public final void a(X7.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f3044y;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i));
        u(tVar);
    }

    @Override // S7.E
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3045z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0402p) {
                return;
            }
            if (!(obj2 instanceof C0401o)) {
                cancellationException2 = cancellationException;
                C0401o c0401o = new C0401o(obj2, (C0391e) null, (I7.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0401o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0401o c0401o2 = (C0401o) obj2;
            if (c0401o2.f3064e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0401o a9 = C0401o.a(c0401o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C0391e c0391e = c0401o2.f3061b;
            if (c0391e != null) {
                j(c0391e, cancellationException);
            }
            I7.l lVar = c0401o2.f3062c;
            if (lVar != null) {
                k(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // S7.InterfaceC0392f
    public final C0316m c(Object obj, I7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3045z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj2 instanceof m0;
            C0316m c0316m = AbstractC0410y.f3090a;
            if (!z6) {
                boolean z9 = obj2 instanceof C0401o;
                return null;
            }
            Object C8 = C((m0) obj2, obj, this.f2997v, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return c0316m;
        }
    }

    @Override // S7.E
    public final InterfaceC5240d d() {
        return this.f3046w;
    }

    @Override // S7.E
    public final Throwable e(Object obj) {
        Throwable e9 = super.e(obj);
        if (e9 != null) {
            return e9;
        }
        return null;
    }

    @Override // S7.InterfaceC0392f
    public final void f(Object obj) {
        o(this.f2997v);
    }

    @Override // S7.E
    public final Object g(Object obj) {
        return obj instanceof C0401o ? ((C0401o) obj).f3060a : obj;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5240d interfaceC5240d = this.f3046w;
        if (interfaceC5240d instanceof B7.d) {
            return (B7.d) interfaceC5240d;
        }
        return null;
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f3047x;
    }

    @Override // S7.E
    public final Object i() {
        return f3045z.get(this);
    }

    public final void j(C0391e c0391e, Throwable th) {
        try {
            c0391e.a(th);
        } catch (Throwable th2) {
            AbstractC0410y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), this.f3047x);
        }
    }

    public final void k(I7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0410y.l(new B0.c("Exception in resume onCancellation handler for " + this, th2), this.f3047x);
        }
    }

    public final void l(X7.t tVar, Throwable th) {
        InterfaceC5245i interfaceC5245i = this.f3047x;
        int i = f3044y.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, interfaceC5245i);
        } catch (Throwable th2) {
            AbstractC0410y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), interfaceC5245i);
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3045z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m0)) {
                return false;
            }
            C0394h c0394h = new C0394h(this, th, (obj instanceof C0391e) || (obj instanceof X7.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0394h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            m0 m0Var = (m0) obj;
            if (m0Var instanceof C0391e) {
                j((C0391e) obj, th);
            } else if (m0Var instanceof X7.t) {
                l((X7.t) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f2997v);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3043A;
        H h3 = (H) atomicReferenceFieldUpdater.get(this);
        if (h3 == null) {
            return;
        }
        h3.b();
        atomicReferenceFieldUpdater.set(this, l0.f3059n);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f3044y;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i6 = i4 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z6 = i == 4;
                InterfaceC5240d interfaceC5240d = this.f3046w;
                if (!z6 && (interfaceC5240d instanceof X7.h)) {
                    boolean z9 = i == 1 || i == 2;
                    int i9 = this.f2997v;
                    if (z9 == (i9 == 1 || i9 == 2)) {
                        AbstractC0406u abstractC0406u = ((X7.h) interfaceC5240d).f3789w;
                        InterfaceC5245i context = ((X7.h) interfaceC5240d).f3790x.getContext();
                        if (abstractC0406u.z()) {
                            abstractC0406u.p(context, this);
                            return;
                        }
                        P a9 = q0.a();
                        if (a9.f3015v >= 4294967296L) {
                            a9.B(this);
                            return;
                        }
                        a9.D(true);
                        try {
                            AbstractC0410y.r(this, interfaceC5240d, true);
                            do {
                            } while (a9.F());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0410y.r(this, interfaceC5240d, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable p(h0 h0Var) {
        return h0Var.w();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean v9 = v();
        do {
            atomicIntegerFieldUpdater = f3044y;
            i = atomicIntegerFieldUpdater.get(this);
            int i4 = i >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v9) {
                    y();
                }
                Object obj = f3045z.get(this);
                if (obj instanceof C0402p) {
                    throw ((C0402p) obj).f3066a;
                }
                int i6 = this.f2997v;
                if (i6 == 1 || i6 == 2) {
                    Y y7 = (Y) this.f3047x.m(C0407v.f3081u);
                    if (y7 != null && !y7.j()) {
                        CancellationException w3 = ((h0) y7).w();
                        b(obj, w3);
                        throw w3;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((H) f3043A.get(this)) == null) {
            s();
        }
        if (v9) {
            y();
        }
        return A7.a.f215n;
    }

    public final void r() {
        H s9 = s();
        if (s9 == null || (f3045z.get(this) instanceof m0)) {
            return;
        }
        s9.b();
        f3043A.set(this, l0.f3059n);
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC5083i.a(obj);
        if (a9 != null) {
            obj = new C0402p(a9, false);
        }
        A(obj, this.f2997v, null);
    }

    public final H s() {
        H G2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y y7 = (Y) this.f3047x.m(C0407v.f3081u);
        if (y7 == null) {
            return null;
        }
        G2 = ((h0) y7).G((r5 & 1) == 0, (r5 & 2) != 0, new C0395i(this));
        do {
            atomicReferenceFieldUpdater = f3043A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, G2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return G2;
    }

    public final void t(I7.l lVar) {
        u(lVar instanceof C0391e ? (C0391e) lVar : new C0391e(2, lVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0410y.v(this.f3046w));
        sb.append("){");
        Object obj = f3045z.get(this);
        sb.append(obj instanceof m0 ? "Active" : obj instanceof C0394h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0410y.j(this));
        return sb.toString();
    }

    public final void u(m0 m0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3045z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0388b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0391e ? true : obj instanceof X7.t) {
                w(m0Var, obj);
                throw null;
            }
            if (obj instanceof C0402p) {
                C0402p c0402p = (C0402p) obj;
                c0402p.getClass();
                if (!C0402p.f3065b.compareAndSet(c0402p, 0, 1)) {
                    w(m0Var, obj);
                    throw null;
                }
                if (obj instanceof C0394h) {
                    if (!(obj instanceof C0402p)) {
                        c0402p = null;
                    }
                    Throwable th = c0402p != null ? c0402p.f3066a : null;
                    if (m0Var instanceof C0391e) {
                        j((C0391e) m0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((X7.t) m0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0401o)) {
                if (m0Var instanceof X7.t) {
                    return;
                }
                kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0401o c0401o = new C0401o(obj, (C0391e) m0Var, (I7.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0401o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0401o c0401o2 = (C0401o) obj;
            if (c0401o2.f3061b != null) {
                w(m0Var, obj);
                throw null;
            }
            if (m0Var instanceof X7.t) {
                return;
            }
            kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0391e c0391e = (C0391e) m0Var;
            Throwable th2 = c0401o2.f3064e;
            if (th2 != null) {
                j(c0391e, th2);
                return;
            }
            C0401o a9 = C0401o.a(c0401o2, c0391e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.f2997v != 2) {
            return false;
        }
        InterfaceC5240d interfaceC5240d = this.f3046w;
        kotlin.jvm.internal.h.c(interfaceC5240d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return X7.h.f3788A.get((X7.h) interfaceC5240d) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        InterfaceC5240d interfaceC5240d = this.f3046w;
        Throwable th = null;
        X7.h hVar = interfaceC5240d instanceof X7.h ? (X7.h) interfaceC5240d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3788A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0316m c0316m = X7.a.f3778d;
                if (obj == c0316m) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0316m, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != c0316m) {
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
            n();
            m(th);
        }
    }

    public final void z(Object obj, I7.l lVar) {
        A(obj, this.f2997v, lVar);
    }
}
