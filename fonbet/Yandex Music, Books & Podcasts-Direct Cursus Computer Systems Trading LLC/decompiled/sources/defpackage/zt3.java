package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public class zt3 extends y98 implements yt3, om6, hku {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(zt3.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(zt3.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(zt3.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation d;
    public final CoroutineContext e;

    public zt3(int i, Continuation continuation) {
        super(i);
        this.d = continuation;
        this.e = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = fh.a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object F(tej tejVar, Object obj, int i, pyc pycVar) {
        if (obj instanceof sm5) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (pycVar != null || (tejVar instanceof pt3)) {
            return new qm5(obj, tejVar instanceof pt3 ? (pt3) tejVar : null, pycVar, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        Continuation continuation = this.d;
        Throwable th = null;
        v98 v98Var = continuation instanceof v98 ? (v98) continuation : null;
        if (v98Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v98.h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(v98Var);
                js3 js3Var = w98.b;
                if (obj == js3Var) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(v98Var, js3Var, this)) {
                        if (atomicReferenceFieldUpdater.get(v98Var) != js3Var) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        b6e.l(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(v98Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(v98Var) != obj) {
                            xq0.x("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            h(th);
        }
    }

    public final void D(Object obj, int i, pyc pycVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof tej) {
                Object F = F((tej) obj2, obj, i, pycVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof ju3) {
                ju3 ju3Var = (ju3) obj2;
                if (ju3.c.compareAndSet(ju3Var, 0, 1)) {
                    if (pycVar != null) {
                        l(pycVar, ju3Var.a, obj);
                        return;
                    }
                    return;
                }
            }
            b6e.l(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void E(a aVar, Unit unit) {
        Continuation continuation = this.d;
        v98 v98Var = continuation instanceof v98 ? (v98) continuation : null;
        D(unit, (v98Var != null ? v98Var.d : null) == aVar ? 4 : this.c, null);
    }

    public final js3 G(Object obj, pyc pycVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof tej)) {
                return null;
            }
            Object F = F((tej) obj2, obj, this.c, pycVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            boolean z = z();
            js3 js3Var = au3.a;
            if (!z) {
                n();
            }
            return js3Var;
        }
    }

    @Override // defpackage.hku
    public final void a(yap yapVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                xq0.q("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(yapVar);
    }

    @Override // defpackage.y98
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof tej) {
                xq0.q("Not completed");
                return;
            }
            if (obj instanceof sm5) {
                return;
            }
            if (!(obj instanceof qm5)) {
                cancellationException2 = cancellationException;
                qm5 qm5Var = new qm5(obj, (pt3) null, (pyc) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qm5Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            qm5 qm5Var2 = (qm5) obj;
            if (qm5Var2.e != null) {
                xq0.q("Must be called at most once");
                return;
            }
            qm5 a = qm5.a(qm5Var2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            pt3 pt3Var = qm5Var2.b;
            if (pt3Var != null) {
                k(pt3Var, cancellationException);
            }
            pyc pycVar = qm5Var2.c;
            if (pycVar != null) {
                l(pycVar, cancellationException, qm5Var2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.y98
    public final Continuation c() {
        return this.d;
    }

    @Override // defpackage.yt3
    public final js3 d(Object obj, pyc pycVar) {
        return G(obj, pycVar);
    }

    @Override // defpackage.y98
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        if (!ve7.b()) {
            return e;
        }
        Continuation continuation = this.d;
        return !(continuation instanceof om6) ? e : dar.a(e, (om6) continuation);
    }

    @Override // defpackage.y98
    public final Object f(Object obj) {
        return obj instanceof qm5 ? ((qm5) obj).a : obj;
    }

    @Override // defpackage.om6
    public final om6 getCallerFrame() {
        Continuation continuation = this.d;
        if (continuation instanceof om6) {
            return (om6) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.om6
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.yt3
    public final boolean h(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof tej)) {
                return false;
            }
            boolean z = (obj instanceof pt3) || (obj instanceof yap);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            ju3 ju3Var = new ju3(th2, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ju3Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            tej tejVar = (tej) obj;
            if (tejVar instanceof pt3) {
                k((pt3) obj, th);
            } else if (tejVar instanceof yap) {
                m((yap) obj, th);
            }
            if (!z()) {
                n();
            }
            o(this.c);
            return true;
        }
    }

    @Override // defpackage.y98
    public final Object i() {
        return g.get(this);
    }

    @Override // defpackage.yt3
    public final void j(Object obj, pyc pycVar) {
        D(obj, this.c, pycVar);
    }

    public final void k(pt3 pt3Var, Throwable th) {
        try {
            pt3Var.b(th);
        } catch (Throwable th2) {
            cxb.V(new wp3("Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    public final void l(pyc pycVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.e;
        try {
            pycVar.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            cxb.V(new wp3("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m(yap yapVar, Throwable th) {
        CoroutineContext coroutineContext = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            xq0.q("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            yapVar.h(i, coroutineContext);
        } catch (Throwable th2) {
            cxb.V(new wp3("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        qa8 qa8Var = (qa8) atomicReferenceFieldUpdater.get(this);
        if (qa8Var == null) {
            return;
        }
        qa8Var.a();
        atomicReferenceFieldUpdater.set(this, m8j.a);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    xq0.q("Already resumed");
                    return;
                }
                boolean z = i == 4;
                Continuation continuation = this.d;
                if (!z && (continuation instanceof v98)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        v98 v98Var = (v98) continuation;
                        a aVar = v98Var.d;
                        CoroutineContext context = v98Var.e.getContext();
                        if (w98.c(aVar, context)) {
                            w98.b(this, context, aVar);
                            return;
                        }
                        rib a = rfs.a();
                        if (a.d >= 4294967296L) {
                            a.K0(this);
                            return;
                        }
                        a.M0(true);
                        try {
                            h4a.W(this, continuation, true);
                            do {
                            } while (a.O0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                h4a.W(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(h3f h3fVar) {
        return h3fVar.D();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        r2f r2fVar;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    xq0.q("Already suspended");
                    return null;
                }
                if (z) {
                    C();
                }
                Object obj = g.get(this);
                if (obj instanceof sm5) {
                    Throwable th = ((sm5) obj).a;
                    if (ve7.b()) {
                        throw dar.a(th, this);
                    }
                    throw th;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (r2fVar = (r2f) this.e.get(o6c.l)) == null || r2fVar.b()) {
                    return f(obj);
                }
                CancellationException D = r2fVar.D();
                b(D);
                if (ve7.b()) {
                    throw dar.a(D, this);
                }
                throw D;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING + (536870911 & i)));
        if (((qa8) h.get(this)) == null) {
            t();
        }
        if (z) {
            C();
        }
        return nm6.a;
    }

    @Override // defpackage.yt3
    public final void r(Object obj) {
        o(this.c);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a = z7o.a(obj);
        if (a != null) {
            if (ve7.b()) {
                a = dar.a(a, this);
            }
            obj = new sm5(a, false);
        }
        D(obj, this.c, null);
    }

    public final void s() {
        qa8 t = t();
        if (t != null && y()) {
            t.a();
            h.set(this, m8j.a);
        }
    }

    public final qa8 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r2f r2fVar = (r2f) this.e.get(o6c.l);
        if (r2fVar == null) {
            return null;
        }
        qa8 W = saf.W(r2fVar, true, new gj4(this, 0));
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, W)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return W;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(ff7.O(this.d));
        sb.append("){");
        Object obj = g.get(this);
        sb.append(obj instanceof tej ? "Active" : obj instanceof ju3 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(ff7.B(this));
        return sb.toString();
    }

    public final void u(Function1 function1) {
        v(new ot3(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00aa, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(tej tejVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof fh) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tejVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof pt3) || (obj instanceof yap)) {
                break;
            }
            if (obj instanceof sm5) {
                sm5 sm5Var = (sm5) obj;
                if (!sm5.b.compareAndSet(sm5Var, 0, 1)) {
                    A(tejVar, obj);
                    throw null;
                }
                if (obj instanceof ju3) {
                    Throwable th = sm5Var.a;
                    if (tejVar instanceof pt3) {
                        k((pt3) tejVar, th);
                        return;
                    } else {
                        tejVar.getClass();
                        m((yap) tejVar, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof qm5)) {
                if (tejVar instanceof yap) {
                    return;
                }
                tejVar.getClass();
                qm5 qm5Var = new qm5(obj, (pt3) tejVar, (pyc) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qm5Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            qm5 qm5Var2 = (qm5) obj;
            if (qm5Var2.b != null) {
                A(tejVar, obj);
                throw null;
            }
            if (tejVar instanceof yap) {
                return;
            }
            tejVar.getClass();
            pt3 pt3Var = (pt3) tejVar;
            Throwable th2 = qm5Var2.e;
            if (th2 != null) {
                k(pt3Var, th2);
                return;
            }
            qm5 a = qm5.a(qm5Var2, pt3Var, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        return g.get(this) instanceof tej;
    }

    public final boolean x() {
        return g.get(this) instanceof ju3;
    }

    public final boolean y() {
        return !(g.get(this) instanceof tej);
    }

    public final boolean z() {
        if (this.c != 2) {
            return false;
        }
        Continuation continuation = this.d;
        continuation.getClass();
        return v98.h.get((v98) continuation) != null;
    }
}
