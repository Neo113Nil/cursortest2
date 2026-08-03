package yc;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class g extends h0 implements f, hc.d, b2 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8845l = AtomicIntegerFieldUpdater.newUpdater(g.class, "_decisionAndIndex$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8846m = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8847n = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final fc.d f8848j;

    /* renamed from: k, reason: collision with root package name */
    public final fc.i f8849k;

    public g(int i10, fc.d dVar) {
        super(i10);
        this.f8848j = dVar;
        this.f8849k = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f8831a;
    }

    public static Object D(p1 p1Var, Object obj, int i10, oc.c cVar) {
        if (obj instanceof p) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (cVar != null || (p1Var instanceof e)) {
            return new o(obj, p1Var instanceof e ? (e) p1Var : null, cVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, oc.c cVar) {
        B(this.f8853i, obj, cVar);
    }

    public final void B(int i10, Object obj, oc.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8846m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p1) {
                Object D = D((p1) obj2, obj, i10, cVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    l();
                }
                m(i10);
                return;
            }
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                if (h.f8852c.compareAndSet(hVar, 0, 1)) {
                    if (cVar != null) {
                        j(cVar, hVar.f8889a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(u uVar) {
        fc.d dVar = this.f8848j;
        dd.h hVar = dVar instanceof dd.h ? (dd.h) dVar : null;
        B((hVar != null ? hVar.f1855j : null) == uVar ? 4 : this.f8853i, ac.o.f277a, null);
    }

    @Override // yc.b2
    public final void a(dd.u uVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f8845l;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        t(uVar);
    }

    @Override // yc.h0
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8846m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof p) {
                return;
            }
            if (!(obj2 instanceof o)) {
                cancellationException2 = cancellationException;
                o oVar = new o(obj2, (e) null, (oc.c) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            o oVar2 = (o) obj2;
            if (oVar2.f8885e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            o a6 = o.a(oVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = oVar2.f8882b;
            if (eVar != null) {
                i(eVar, cancellationException);
            }
            oc.c cVar = oVar2.f8883c;
            if (cVar != null) {
                j(cVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // yc.h0
    public final fc.d c() {
        return this.f8848j;
    }

    @Override // yc.h0
    public final Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    @Override // yc.f
    public final dd.w e(Object obj, oc.c cVar) {
        dd.w wVar = a0.f8818a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8846m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof p1)) {
                return null;
            }
            Object D = D((p1) obj2, obj, this.f8853i, cVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                l();
            }
            return wVar;
        }
    }

    @Override // yc.h0
    public final Object f(Object obj) {
        return obj instanceof o ? ((o) obj).f8881a : obj;
    }

    @Override // hc.d
    public final hc.d getCallerFrame() {
        fc.d dVar = this.f8848j;
        if (dVar instanceof hc.d) {
            return (hc.d) dVar;
        }
        return null;
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f8849k;
    }

    @Override // yc.h0
    public final Object h() {
        return f8846m.get(this);
    }

    public final void i(e eVar, Throwable th) {
        try {
            switch (eVar.f8841a) {
                case 0:
                    if (th != null) {
                        ((ScheduledFuture) eVar.f8842b).cancel(false);
                        break;
                    }
                    break;
                case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                    ((oc.c) eVar.f8842b).invoke(th);
                    break;
                default:
                    ((k0) eVar.f8842b).a();
                    break;
            }
        } catch (Throwable th2) {
            a0.m(this.f8849k, new ac.d("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(oc.c cVar, Throwable th) {
        try {
            cVar.invoke(th);
        } catch (Throwable th2) {
            a0.m(this.f8849k, new ac.d("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(dd.u uVar, Throwable th) {
        fc.i iVar = this.f8849k;
        int i10 = f8845l.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i10, iVar);
        } catch (Throwable th2) {
            a0.m(iVar, new ac.d("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8847n;
        k0 k0Var = (k0) atomicReferenceFieldUpdater.get(this);
        if (k0Var == null) {
            return;
        }
        k0Var.a();
        atomicReferenceFieldUpdater.set(this, o1.f8887g);
    }

    public final void m(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f8845l;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                fc.d dVar = this.f8848j;
                if (!z10 && (dVar instanceof dd.h)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f8853i;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        dd.h hVar = (dd.h) dVar;
                        u uVar = hVar.f1855j;
                        fc.i context = hVar.f1856k.getContext();
                        if (uVar.y()) {
                            uVar.w(context, this);
                            return;
                        }
                        s0 a6 = u1.a();
                        if (a6.f8901i >= 4294967296L) {
                            a6.A(this);
                            return;
                        }
                        a6.C(true);
                        try {
                            a0.t(this, dVar, true);
                            do {
                            } while (a6.E());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                a0.t(this, dVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    @Override // yc.f
    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8846m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p1)) {
                return false;
            }
            h hVar = new h(this, th, (obj instanceof e) || (obj instanceof dd.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, hVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            p1 p1Var = (p1) obj;
            if (p1Var instanceof e) {
                i((e) obj, th);
            } else if (p1Var instanceof dd.u) {
                k((dd.u) obj, th);
            }
            if (!v()) {
                l();
            }
            m(this.f8853i);
            return true;
        }
    }

    public Throwable o(k1 k1Var) {
        return k1Var.m();
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        b1 b1Var;
        boolean v10 = v();
        do {
            atomicIntegerFieldUpdater = f8845l;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v10) {
                    z();
                }
                Object obj = f8846m.get(this);
                if (obj instanceof p) {
                    throw ((p) obj).f8889a;
                }
                int i12 = this.f8853i;
                if ((i12 != 1 && i12 != 2) || (b1Var = (b1) this.f8849k.v(v.f8910h)) == null || b1Var.b()) {
                    return f(obj);
                }
                CancellationException m10 = b1Var.m();
                b(obj, m10);
                throw m10;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((k0) f8847n.get(this)) == null) {
            r();
        }
        if (v10) {
            z();
        }
        return gc.a.f2559g;
    }

    public final void q() {
        k0 r5 = r();
        if (r5 == null || (f8846m.get(this) instanceof p1)) {
            return;
        }
        r5.a();
        f8847n.set(this, o1.f8887g);
    }

    public final k0 r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b1 b1Var = (b1) this.f8849k.v(v.f8910h);
        if (b1Var == null) {
            return null;
        }
        k0 n7 = a0.n(b1Var, true, new i(this), 2);
        do {
            atomicReferenceFieldUpdater = f8847n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n7)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n7;
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        Throwable a6 = ac.l.a(obj);
        if (a6 != null) {
            obj = new p(a6, false);
        }
        B(this.f8853i, obj, null);
    }

    public final void s(oc.c cVar) {
        t(new e(1, cVar));
    }

    public final void t(p1 p1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8846m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z10 = true;
            if (obj instanceof e ? true : obj instanceof dd.u) {
                w(p1Var, obj);
                throw null;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!p.f8888b.compareAndSet(pVar, 0, 1)) {
                    w(p1Var, obj);
                    throw null;
                }
                if (obj instanceof h) {
                    Throwable th = pVar.f8889a;
                    if (p1Var instanceof e) {
                        i((e) p1Var, th);
                        return;
                    } else {
                        pc.j.c(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        k((dd.u) p1Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (oVar.f8882b != null) {
                    w(p1Var, obj);
                    throw null;
                }
                if (p1Var instanceof dd.u) {
                    return;
                }
                pc.j.c(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                e eVar = (e) p1Var;
                Throwable th2 = oVar.f8885e;
                if (th2 != null) {
                    i(eVar, th2);
                    return;
                }
                o a6 = o.a(oVar, eVar, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a6)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                if (p1Var instanceof dd.u) {
                    return;
                }
                pc.j.c(p1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                o oVar2 = new o(obj, (e) p1Var, (oc.c) null, (Throwable) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(a0.x(this.f8848j));
        sb.append("){");
        Object obj = f8846m.get(this);
        sb.append(obj instanceof p1 ? "Active" : obj instanceof h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a0.j(this));
        return sb.toString();
    }

    public final boolean u() {
        return f8846m.get(this) instanceof p1;
    }

    public final boolean v() {
        if (this.f8853i != 2) {
            return false;
        }
        fc.d dVar = this.f8848j;
        pc.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return dd.h.f1854n.get((dd.h) dVar) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    @Override // yc.f
    public final void y(Object obj) {
        m(this.f8853i);
    }

    public final void z() {
        fc.d dVar = this.f8848j;
        Throwable th = null;
        dd.h hVar = dVar instanceof dd.h ? (dd.h) dVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.h.f1854n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                dd.w wVar = dd.a.f1842d;
                if (obj == wVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
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
            l();
            n(th);
        }
    }
}
