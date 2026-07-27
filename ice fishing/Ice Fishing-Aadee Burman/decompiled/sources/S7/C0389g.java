package S7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u7.AbstractC5091i;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* renamed from: S7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0389g extends E implements InterfaceC0388f, B7.d, y0 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5267d f2963w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5272i f2964x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2961y = AtomicIntegerFieldUpdater.newUpdater(C0389g.class, "_decisionAndIndex$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2962z = AtomicReferenceFieldUpdater.newUpdater(C0389g.class, Object.class, "_state$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2960A = AtomicReferenceFieldUpdater.newUpdater(C0389g.class, Object.class, "_parentHandle$volatile");

    public C0389g(int i, InterfaceC5267d interfaceC5267d) {
        super(i);
        this.f2963w = interfaceC5267d;
        this.f2964x = interfaceC5267d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0384b.f2943n;
    }

    public static Object C(m0 m0Var, Object obj, int i, I7.l lVar) {
        if (obj instanceof C0398p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (lVar != null || (m0Var instanceof C0387e)) {
            return new C0397o(obj, m0Var instanceof C0387e ? (C0387e) m0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(m0 m0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + m0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, I7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2962z;
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
            if (obj2 instanceof C0390h) {
                C0390h c0390h = (C0390h) obj2;
                c0390h.getClass();
                if (C0390h.f2969c.compareAndSet(c0390h, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0390h.f2983a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0402u abstractC0402u) {
        u7.v vVar = u7.v.f41350a;
        InterfaceC5267d interfaceC5267d = this.f2963w;
        X7.h hVar = interfaceC5267d instanceof X7.h ? (X7.h) interfaceC5267d : null;
        A(vVar, (hVar != null ? hVar.f3834w : null) == abstractC0402u ? 4 : this.f2914v, null);
    }

    @Override // S7.y0
    public final void a(X7.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f2961y;
            i6 = atomicIntegerFieldUpdater.get(this);
            if ((i6 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, ((i6 >> 29) << 29) + i));
        u(tVar);
    }

    @Override // S7.E
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2962z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0398p) {
                return;
            }
            if (!(obj2 instanceof C0397o)) {
                cancellationException2 = cancellationException;
                C0397o c0397o = new C0397o(obj2, (C0387e) null, (I7.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0397o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0397o c0397o2 = (C0397o) obj2;
            if (c0397o2.f2981e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0397o a9 = C0397o.a(c0397o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C0387e c0387e = c0397o2.f2978b;
            if (c0387e != null) {
                j(c0387e, cancellationException);
            }
            I7.l lVar = c0397o2.f2979c;
            if (lVar != null) {
                k(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // S7.InterfaceC0388f
    public final D2.b c(Object obj, I7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2962z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof m0;
            D2.b bVar = AbstractC0406y.f3007a;
            if (!z3) {
                boolean z6 = obj2 instanceof C0397o;
                return null;
            }
            Object C8 = C((m0) obj2, obj, this.f2914v, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return bVar;
        }
    }

    @Override // S7.E
    public final InterfaceC5267d d() {
        return this.f2963w;
    }

    @Override // S7.E
    public final Throwable e(Object obj) {
        Throwable e9 = super.e(obj);
        if (e9 != null) {
            return e9;
        }
        return null;
    }

    @Override // S7.InterfaceC0388f
    public final void f(Object obj) {
        o(this.f2914v);
    }

    @Override // S7.E
    public final Object g(Object obj) {
        return obj instanceof C0397o ? ((C0397o) obj).f2977a : obj;
    }

    @Override // B7.d
    public final B7.d getCallerFrame() {
        InterfaceC5267d interfaceC5267d = this.f2963w;
        if (interfaceC5267d instanceof B7.d) {
            return (B7.d) interfaceC5267d;
        }
        return null;
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f2964x;
    }

    @Override // S7.E
    public final Object i() {
        return f2962z.get(this);
    }

    public final void j(C0387e c0387e, Throwable th) {
        try {
            c0387e.a(th);
        } catch (Throwable th2) {
            AbstractC0406y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), this.f2964x);
        }
    }

    public final void k(I7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0406y.l(new B0.c("Exception in resume onCancellation handler for " + this, th2), this.f2964x);
        }
    }

    public final void l(X7.t tVar, Throwable th) {
        InterfaceC5272i interfaceC5272i = this.f2964x;
        int i = f2961y.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, interfaceC5272i);
        } catch (Throwable th2) {
            AbstractC0406y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), interfaceC5272i);
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2962z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m0)) {
                return false;
            }
            C0390h c0390h = new C0390h(this, th, (obj instanceof C0387e) || (obj instanceof X7.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0390h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            m0 m0Var = (m0) obj;
            if (m0Var instanceof C0387e) {
                j((C0387e) obj, th);
            } else if (m0Var instanceof X7.t) {
                l((X7.t) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f2914v);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2960A;
        H h9 = (H) atomicReferenceFieldUpdater.get(this);
        if (h9 == null) {
            return;
        }
        h9.b();
        atomicReferenceFieldUpdater.set(this, l0.f2976n);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        do {
            atomicIntegerFieldUpdater = f2961y;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i9 = i6 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i == 4;
                InterfaceC5267d interfaceC5267d = this.f2963w;
                if (!z3 && (interfaceC5267d instanceof X7.h)) {
                    boolean z6 = i == 1 || i == 2;
                    int i10 = this.f2914v;
                    if (z6 == (i10 == 1 || i10 == 2)) {
                        AbstractC0402u abstractC0402u = ((X7.h) interfaceC5267d).f3834w;
                        InterfaceC5272i context = ((X7.h) interfaceC5267d).f3835x.getContext();
                        if (abstractC0402u.z()) {
                            abstractC0402u.p(context, this);
                            return;
                        }
                        P a9 = q0.a();
                        if (a9.f2932v >= 4294967296L) {
                            a9.B(this);
                            return;
                        }
                        a9.D(true);
                        try {
                            AbstractC0406y.r(this, interfaceC5267d, true);
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
                AbstractC0406y.r(this, interfaceC5267d, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 1073741824 + (536870911 & i6)));
    }

    public Throwable p(h0 h0Var) {
        return h0Var.w();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean v9 = v();
        do {
            atomicIntegerFieldUpdater = f2961y;
            i = atomicIntegerFieldUpdater.get(this);
            int i6 = i >> 29;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v9) {
                    y();
                }
                Object obj = f2962z.get(this);
                if (obj instanceof C0398p) {
                    throw ((C0398p) obj).f2983a;
                }
                int i9 = this.f2914v;
                if (i9 == 1 || i9 == 2) {
                    Y y7 = (Y) this.f2964x.m(C0403v.f2998u);
                    if (y7 != null && !y7.j()) {
                        CancellationException w6 = ((h0) y7).w();
                        b(obj, w6);
                        throw w6;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((H) f2960A.get(this)) == null) {
            s();
        }
        if (v9) {
            y();
        }
        return A7.a.f58n;
    }

    public final void r() {
        H s9 = s();
        if (s9 == null || (f2962z.get(this) instanceof m0)) {
            return;
        }
        s9.b();
        f2960A.set(this, l0.f2976n);
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC5091i.a(obj);
        if (a9 != null) {
            obj = new C0398p(a9, false);
        }
        A(obj, this.f2914v, null);
    }

    public final H s() {
        H G7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y y7 = (Y) this.f2964x.m(C0403v.f2998u);
        if (y7 == null) {
            return null;
        }
        G7 = ((h0) y7).G((r5 & 1) == 0, (r5 & 2) != 0, new C0391i(this));
        do {
            atomicReferenceFieldUpdater = f2960A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, G7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return G7;
    }

    public final void t(I7.l lVar) {
        u(lVar instanceof C0387e ? (C0387e) lVar : new C0387e(2, lVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0406y.v(this.f2963w));
        sb.append("){");
        Object obj = f2962z.get(this);
        sb.append(obj instanceof m0 ? "Active" : obj instanceof C0390h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0406y.j(this));
        return sb.toString();
    }

    public final void u(m0 m0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2962z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0384b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0387e ? true : obj instanceof X7.t) {
                w(m0Var, obj);
                throw null;
            }
            if (obj instanceof C0398p) {
                C0398p c0398p = (C0398p) obj;
                c0398p.getClass();
                if (!C0398p.f2982b.compareAndSet(c0398p, 0, 1)) {
                    w(m0Var, obj);
                    throw null;
                }
                if (obj instanceof C0390h) {
                    if (!(obj instanceof C0398p)) {
                        c0398p = null;
                    }
                    Throwable th = c0398p != null ? c0398p.f2983a : null;
                    if (m0Var instanceof C0387e) {
                        j((C0387e) m0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((X7.t) m0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0397o)) {
                if (m0Var instanceof X7.t) {
                    return;
                }
                kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0397o c0397o = new C0397o(obj, (C0387e) m0Var, (I7.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0397o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0397o c0397o2 = (C0397o) obj;
            if (c0397o2.f2978b != null) {
                w(m0Var, obj);
                throw null;
            }
            if (m0Var instanceof X7.t) {
                return;
            }
            kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0387e c0387e = (C0387e) m0Var;
            Throwable th2 = c0397o2.f2981e;
            if (th2 != null) {
                j(c0387e, th2);
                return;
            }
            C0397o a9 = C0397o.a(c0397o2, c0387e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.f2914v != 2) {
            return false;
        }
        InterfaceC5267d interfaceC5267d = this.f2963w;
        kotlin.jvm.internal.h.c(interfaceC5267d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return X7.h.f3833A.get((X7.h) interfaceC5267d) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        InterfaceC5267d interfaceC5267d = this.f2963w;
        Throwable th = null;
        X7.h hVar = interfaceC5267d instanceof X7.h ? (X7.h) interfaceC5267d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3833A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D2.b bVar = X7.a.f3823d;
                if (obj == bVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, bVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != bVar) {
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
        A(obj, this.f2914v, lVar);
    }
}
