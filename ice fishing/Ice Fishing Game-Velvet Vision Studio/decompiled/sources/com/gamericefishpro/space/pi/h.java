package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class h extends i0 implements f, com.gamericefishpro.space.vh.d, e2 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final com.gamericefishpro.space.th.a v;
    public final CoroutineContext w;
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");

    public h(int i, com.gamericefishpro.space.th.a aVar) {
        super(i);
        this.v = aVar;
        this.w = aVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.a;
    }

    public static Object D(q1 q1Var, Object obj, int i, com.gamericefishpro.space.di.c cVar) {
        if (obj instanceof q) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (cVar != null || (q1Var instanceof e)) {
            return new p(obj, q1Var instanceof e ? (e) q1Var : null, cVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        com.gamericefishpro.space.th.a aVar = this.v;
        Throwable th = null;
        com.gamericefishpro.space.ui.f fVar = aVar instanceof com.gamericefishpro.space.ui.f ? (com.gamericefishpro.space.ui.f) aVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = com.gamericefishpro.space.ui.f.A;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                com.gamericefishpro.space.d6.a aVar2 = com.gamericefishpro.space.ui.a.c;
                if (obj != aVar2) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, aVar2, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == aVar2);
            }
            if (th == null) {
                return;
            }
            n();
            i(th);
        }
    }

    public final void B(Object obj, int i, com.gamericefishpro.space.di.c cVar) throws g0 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q1)) {
                if (obj2 instanceof i) {
                    i iVar = (i) obj2;
                    if (i.c.compareAndSet(iVar, 0, 1)) {
                        if (cVar != null) {
                            l(cVar, iVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objD = D((q1) obj2, obj, i, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        n();
                    }
                    o(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void C(t tVar, Unit unit) throws g0 {
        com.gamericefishpro.space.th.a aVar = this.v;
        com.gamericefishpro.space.ui.f fVar = aVar instanceof com.gamericefishpro.space.ui.f ? (com.gamericefishpro.space.ui.f) aVar : null;
        B(unit, (fVar != null ? fVar.v : null) == tVar ? 4 : this.i, null);
    }

    @Override // com.gamericefishpro.space.pi.e2
    public final void a(com.gamericefishpro.space.ui.q qVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(qVar);
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof q) {
                return;
            }
            if (!(obj instanceof p)) {
                cancellationException2 = cancellationException;
                p pVar = new p(obj, (e) null, (com.gamericefishpro.space.di.c) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            p pVar2 = (p) obj;
            if (pVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            p pVarA = p.a(pVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, pVarA)) {
                    e eVar = pVar2.b;
                    if (eVar != null) {
                        k(eVar, cancellationException);
                    }
                    com.gamericefishpro.space.di.c cVar = pVar2.c;
                    if (cVar != null) {
                        l(cVar, cancellationException, pVar2.a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final com.gamericefishpro.space.th.a c() {
        return this.v;
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final Object e(Object obj) {
        return obj instanceof p ? ((p) obj).a : obj;
    }

    @Override // com.gamericefishpro.space.pi.f
    public final com.gamericefishpro.space.d6.a f(Object obj, com.gamericefishpro.space.di.c cVar) {
        com.gamericefishpro.space.d6.a aVar = a0.a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q1)) {
                return null;
            }
            Object objD = D((q1) obj2, obj, this.i, cVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!x()) {
                        n();
                    }
                    return aVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // com.gamericefishpro.space.vh.d
    public final com.gamericefishpro.space.vh.d getCallerFrame() {
        com.gamericefishpro.space.th.a aVar = this.v;
        if (aVar instanceof com.gamericefishpro.space.vh.d) {
            return (com.gamericefishpro.space.vh.d) aVar;
        }
        return null;
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return this.w;
    }

    @Override // com.gamericefishpro.space.pi.f
    public final void h(Object obj, com.gamericefishpro.space.di.c cVar) throws g0 {
        B(obj, this.i, cVar);
    }

    @Override // com.gamericefishpro.space.pi.f
    public final boolean i(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                return false;
            }
            boolean z2 = (obj instanceof e) || (obj instanceof com.gamericefishpro.space.ui.q);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            i iVar = new i(cancellationException, z2);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                    q1 q1Var = (q1) obj;
                    if (q1Var instanceof e) {
                        k((e) obj, th);
                    } else if (q1Var instanceof com.gamericefishpro.space.ui.q) {
                        m((com.gamericefishpro.space.ui.q) obj, th);
                    }
                    if (!x()) {
                        n();
                    }
                    o(this.i);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // com.gamericefishpro.space.pi.i0
    public final Object j() {
        return z.get(this);
    }

    public final void k(e eVar, Throwable th) {
        try {
            switch (eVar.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) eVar.b).cancel(false);
                    break;
                case 1:
                    ((Function1) eVar.b).invoke(th);
                    break;
                default:
                    ((m0) eVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            a0.p(new com.gamericefishpro.space.bb.n("Exception in invokeOnCancellation handler for " + this, th2), this.w);
        }
    }

    public final void l(com.gamericefishpro.space.di.c cVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.w;
        try {
            cVar.a(th, obj, coroutineContext);
        } catch (Throwable th2) {
            a0.p(new com.gamericefishpro.space.bb.n("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m(com.gamericefishpro.space.ui.q qVar, Throwable th) {
        CoroutineContext coroutineContext = this.w;
        int i = y.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.g(i, coroutineContext);
        } catch (Throwable th2) {
            a0.p(new com.gamericefishpro.space.bb.n("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var == null) {
            return;
        }
        m0Var.a();
        atomicReferenceFieldUpdater.set(this, p1.d);
    }

    public final void o(int i) throws g0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                com.gamericefishpro.space.th.a aVar = this.v;
                if (!z2 && (aVar instanceof com.gamericefishpro.space.ui.f)) {
                    boolean z3 = i == 1 || i == 2;
                    int i4 = this.i;
                    if (z3 == (i4 == 1 || i4 == 2)) {
                        com.gamericefishpro.space.ui.f fVar = (com.gamericefishpro.space.ui.f) aVar;
                        t tVar = fVar.v;
                        CoroutineContext context = fVar.w.getContext();
                        if (com.gamericefishpro.space.ui.a.i(tVar, context)) {
                            com.gamericefishpro.space.ui.a.h(tVar, context, this);
                            return;
                        }
                        u0 u0VarA = w1.a();
                        if (u0VarA.i >= 4294967296L) {
                            u0VarA.U(this);
                            return;
                        }
                        u0VarA.W(true);
                        try {
                            a0.x(this, aVar, true);
                            do {
                            } while (u0VarA.Y());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                u0VarA.T(true);
                            }
                        }
                        return;
                    }
                }
                a0.x(this, aVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // com.gamericefishpro.space.pi.f
    public final void p(Object obj) throws g0 {
        o(this.i);
    }

    public Throwable q(l1 l1Var) {
        return l1Var.t();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        d1 d1Var;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = y;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = z.get(this);
                if (obj instanceof q) {
                    throw ((q) obj).a;
                }
                int i3 = this.i;
                if ((i3 != 1 && i3 != 2) || (d1Var = (d1) this.w.j(u.e)) == null || d1Var.b()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionT = d1Var.t();
                b(cancellationExceptionT);
                throw cancellationExceptionT;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((m0) A.get(this)) == null) {
            t();
        }
        if (zX) {
            A();
        }
        return com.gamericefishpro.space.uh.a.d;
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        Throwable thA = com.gamericefishpro.space.oh.p.a(obj);
        if (thA != null) {
            obj = new q(thA, false);
        }
        B(obj, this.i, null);
    }

    public final void s() {
        m0 m0VarT = t();
        if (m0VarT == null || (z.get(this) instanceof q1)) {
            return;
        }
        m0VarT.a();
        A.set(this, p1.d);
    }

    public final m0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d1 d1Var = (d1) this.w.j(u.e);
        if (d1Var == null) {
            return null;
        }
        m0 m0VarQ = a0.q(d1Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m0VarQ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m0VarQ;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(a0.B(this.v));
        sb.append("){");
        Object obj = z.get(this);
        if (obj instanceof q1) {
            str = "Active";
        } else {
            str = obj instanceof i ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(a0.m(this));
        return sb.toString();
    }

    public final void u(Function1 function1) {
        v(new e(1, function1));
    }

    public final void v(q1 q1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof e) || (obj instanceof com.gamericefishpro.space.ui.q)) {
                y(q1Var, obj);
                throw null;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!q.b.compareAndSet(qVar, 0, 1)) {
                    y(q1Var, obj);
                    throw null;
                }
                if (obj instanceof i) {
                    Throwable th = qVar.a;
                    if (q1Var instanceof e) {
                        k((e) q1Var, th);
                        return;
                    } else {
                        Intrinsics.c(q1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((com.gamericefishpro.space.ui.q) q1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof p)) {
                if (q1Var instanceof com.gamericefishpro.space.ui.q) {
                    return;
                }
                Intrinsics.c(q1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                p pVar = new p(obj, (e) q1Var, (com.gamericefishpro.space.di.c) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            p pVar2 = (p) obj;
            if (pVar2.b != null) {
                y(q1Var, obj);
                throw null;
            }
            if (q1Var instanceof com.gamericefishpro.space.ui.q) {
                return;
            }
            Intrinsics.c(q1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            e eVar = (e) q1Var;
            Throwable th2 = pVar2.e;
            if (th2 != null) {
                k(eVar, th2);
                return;
            }
            p pVarA = p.a(pVar2, eVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        return z.get(this) instanceof q1;
    }

    public final boolean x() {
        if (this.i != 2) {
            return false;
        }
        com.gamericefishpro.space.th.a aVar = this.v;
        Intrinsics.c(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return com.gamericefishpro.space.ui.f.A.get((com.gamericefishpro.space.ui.f) aVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
