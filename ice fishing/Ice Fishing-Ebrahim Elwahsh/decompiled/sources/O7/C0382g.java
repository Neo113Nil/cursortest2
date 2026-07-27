package O7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.AbstractC4940i;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;

/* renamed from: O7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0382g extends E implements InterfaceC0381f, x7.d, y0 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC5133d f2599w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5138i f2600x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2597y = AtomicIntegerFieldUpdater.newUpdater(C0382g.class, "_decisionAndIndex$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2598z = AtomicReferenceFieldUpdater.newUpdater(C0382g.class, Object.class, "_state$volatile");

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2596A = AtomicReferenceFieldUpdater.newUpdater(C0382g.class, Object.class, "_parentHandle$volatile");

    public C0382g(int i, InterfaceC5133d interfaceC5133d) {
        super(i);
        this.f2599w = interfaceC5133d;
        this.f2600x = interfaceC5133d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0377b.f2579n;
    }

    public static Object C(m0 m0Var, Object obj, int i, E7.l lVar) {
        if (obj instanceof C0391p) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (lVar != null || (m0Var instanceof C0380e)) {
            return new C0390o(obj, m0Var instanceof C0380e ? (C0380e) m0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(m0 m0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + m0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, E7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2598z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m0) {
                Object C7 = C((m0) obj2, obj, i, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
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
            if (obj2 instanceof C0383h) {
                C0383h c0383h = (C0383h) obj2;
                c0383h.getClass();
                if (C0383h.f2605c.compareAndSet(c0383h, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0383h.f2619a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0395u abstractC0395u) {
        q7.v vVar = q7.v.f40183a;
        InterfaceC5133d interfaceC5133d = this.f2599w;
        T7.h hVar = interfaceC5133d instanceof T7.h ? (T7.h) interfaceC5133d : null;
        A(vVar, (hVar != null ? hVar.f3140w : null) == abstractC0395u ? 4 : this.f2550v, null);
    }

    @Override // O7.y0
    public final void a(T7.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f2597y;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i));
        u(tVar);
    }

    @Override // O7.E
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2598z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof m0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0391p) {
                return;
            }
            if (!(obj2 instanceof C0390o)) {
                cancellationException2 = cancellationException;
                C0390o c0390o = new C0390o(obj2, (C0380e) null, (E7.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0390o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0390o c0390o2 = (C0390o) obj2;
            if (c0390o2.f2617e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0390o a9 = C0390o.a(c0390o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C0380e c0380e = c0390o2.f2614b;
            if (c0380e != null) {
                j(c0380e, cancellationException);
            }
            E7.l lVar = c0390o2.f2615c;
            if (lVar != null) {
                k(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // O7.E
    public final InterfaceC5133d c() {
        return this.f2599w;
    }

    @Override // O7.InterfaceC0381f
    public final T7.v d(Object obj, E7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2598z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z8 = obj2 instanceof m0;
            T7.v vVar = AbstractC0399y.f2643a;
            if (!z8) {
                boolean z9 = obj2 instanceof C0390o;
                return null;
            }
            Object C7 = C((m0) obj2, obj, this.f2550v, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return vVar;
        }
    }

    @Override // O7.E
    public final Throwable e(Object obj) {
        Throwable e6 = super.e(obj);
        if (e6 != null) {
            return e6;
        }
        return null;
    }

    @Override // O7.InterfaceC0381f
    public final void f(Object obj) {
        o(this.f2550v);
    }

    @Override // O7.E
    public final Object g(Object obj) {
        return obj instanceof C0390o ? ((C0390o) obj).f2613a : obj;
    }

    @Override // x7.d
    public final x7.d getCallerFrame() {
        InterfaceC5133d interfaceC5133d = this.f2599w;
        if (interfaceC5133d instanceof x7.d) {
            return (x7.d) interfaceC5133d;
        }
        return null;
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f2600x;
    }

    @Override // O7.E
    public final Object i() {
        return f2598z.get(this);
    }

    public final void j(C0380e c0380e, Throwable th) {
        try {
            c0380e.a(th);
        } catch (Throwable th2) {
            AbstractC0399y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), this.f2600x);
        }
    }

    public final void k(E7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC0399y.l(new B0.c("Exception in resume onCancellation handler for " + this, th2), this.f2600x);
        }
    }

    public final void l(T7.t tVar, Throwable th) {
        InterfaceC5138i interfaceC5138i = this.f2600x;
        int i = f2597y.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, interfaceC5138i);
        } catch (Throwable th2) {
            AbstractC0399y.l(new B0.c("Exception in invokeOnCancellation handler for " + this, th2), interfaceC5138i);
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2598z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m0)) {
                return false;
            }
            C0383h c0383h = new C0383h(this, th, (obj instanceof C0380e) || (obj instanceof T7.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0383h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            m0 m0Var = (m0) obj;
            if (m0Var instanceof C0380e) {
                j((C0380e) obj, th);
            } else if (m0Var instanceof T7.t) {
                l((T7.t) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f2550v);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2596A;
        H h9 = (H) atomicReferenceFieldUpdater.get(this);
        if (h9 == null) {
            return;
        }
        h9.b();
        atomicReferenceFieldUpdater.set(this, l0.f2612n);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f2597y;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i9 = i4 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z8 = i == 4;
                InterfaceC5133d interfaceC5133d = this.f2599w;
                if (!z8 && (interfaceC5133d instanceof T7.h)) {
                    boolean z9 = i == 1 || i == 2;
                    int i10 = this.f2550v;
                    if (z9 == (i10 == 1 || i10 == 2)) {
                        AbstractC0395u abstractC0395u = ((T7.h) interfaceC5133d).f3140w;
                        InterfaceC5138i context = ((T7.h) interfaceC5133d).f3141x.getContext();
                        if (abstractC0395u.z()) {
                            abstractC0395u.p(context, this);
                            return;
                        }
                        P a9 = q0.a();
                        if (a9.f2568v >= 4294967296L) {
                            a9.B(this);
                            return;
                        }
                        a9.D(true);
                        try {
                            AbstractC0399y.r(this, interfaceC5133d, true);
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
                AbstractC0399y.r(this, interfaceC5133d, z8);
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
        boolean v6 = v();
        do {
            atomicIntegerFieldUpdater = f2597y;
            i = atomicIntegerFieldUpdater.get(this);
            int i4 = i >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v6) {
                    y();
                }
                Object obj = f2598z.get(this);
                if (obj instanceof C0391p) {
                    throw ((C0391p) obj).f2619a;
                }
                int i9 = this.f2550v;
                if (i9 == 1 || i9 == 2) {
                    Y y6 = (Y) this.f2600x.i(C0396v.f2634u);
                    if (y6 != null && !y6.j()) {
                        CancellationException w9 = ((h0) y6).w();
                        b(obj, w9);
                        throw w9;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((H) f2596A.get(this)) == null) {
            s();
        }
        if (v6) {
            y();
        }
        return EnumC5179a.f41704n;
    }

    public final void r() {
        H s3 = s();
        if (s3 == null || (f2598z.get(this) instanceof m0)) {
            return;
        }
        s3.b();
        f2596A.set(this, l0.f2612n);
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        Throwable a9 = AbstractC4940i.a(obj);
        if (a9 != null) {
            obj = new C0391p(a9, false);
        }
        A(obj, this.f2550v, null);
    }

    public final H s() {
        H G7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y y6 = (Y) this.f2600x.i(C0396v.f2634u);
        if (y6 == null) {
            return null;
        }
        G7 = ((h0) y6).G((r5 & 1) == 0, (r5 & 2) != 0, new C0384i(this));
        do {
            atomicReferenceFieldUpdater = f2596A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, G7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return G7;
    }

    public final void t(E7.l lVar) {
        u(lVar instanceof C0380e ? (C0380e) lVar : new C0380e(2, lVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0399y.v(this.f2599w));
        sb.append("){");
        Object obj = f2598z.get(this);
        sb.append(obj instanceof m0 ? "Active" : obj instanceof C0383h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0399y.j(this));
        return sb.toString();
    }

    public final void u(m0 m0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2598z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0377b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0380e ? true : obj instanceof T7.t) {
                w(m0Var, obj);
                throw null;
            }
            if (obj instanceof C0391p) {
                C0391p c0391p = (C0391p) obj;
                c0391p.getClass();
                if (!C0391p.f2618b.compareAndSet(c0391p, 0, 1)) {
                    w(m0Var, obj);
                    throw null;
                }
                if (obj instanceof C0383h) {
                    if (!(obj instanceof C0391p)) {
                        c0391p = null;
                    }
                    Throwable th = c0391p != null ? c0391p.f2619a : null;
                    if (m0Var instanceof C0380e) {
                        j((C0380e) m0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((T7.t) m0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0390o)) {
                if (m0Var instanceof T7.t) {
                    return;
                }
                kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0390o c0390o = new C0390o(obj, (C0380e) m0Var, (E7.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0390o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0390o c0390o2 = (C0390o) obj;
            if (c0390o2.f2614b != null) {
                w(m0Var, obj);
                throw null;
            }
            if (m0Var instanceof T7.t) {
                return;
            }
            kotlin.jvm.internal.h.c(m0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0380e c0380e = (C0380e) m0Var;
            Throwable th2 = c0390o2.f2617e;
            if (th2 != null) {
                j(c0380e, th2);
                return;
            }
            C0390o a9 = C0390o.a(c0390o2, c0380e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.f2550v != 2) {
            return false;
        }
        InterfaceC5133d interfaceC5133d = this.f2599w;
        kotlin.jvm.internal.h.c(interfaceC5133d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return T7.h.f3139A.get((T7.h) interfaceC5133d) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        InterfaceC5133d interfaceC5133d = this.f2599w;
        Throwable th = null;
        T7.h hVar = interfaceC5133d instanceof T7.h ? (T7.h) interfaceC5133d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.h.f3139A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                T7.v vVar = T7.a.f3129d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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

    public final void z(Object obj, E7.l lVar) {
        A(obj, this.f2550v, lVar);
    }
}
