package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class qqi extends agp implements oqi {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(qqi.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public qqi(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : rqi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.j(kotlin.Unit.a, r3.b);
     */
    @Override // defpackage.oqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        if (g()) {
            return Unit.a;
        }
        zt3 J = i4w.J(qxe.b(continuation));
        try {
            pqi pqiVar = new pqi(this, J);
            while (true) {
                int andDecrement = agp.g.getAndDecrement(this);
                if (andDecrement <= this.a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (d(pqiVar)) {
                        break;
                    }
                }
            }
            Object q = J.q();
            nm6 nm6Var = nm6.a;
            if (q != nm6Var) {
                q = Unit.a;
            }
            return q == nm6Var ? q : Unit.a;
        } catch (Throwable th) {
            J.C();
            throw th;
        }
    }

    @Override // defpackage.oqi
    public final void b(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            js3 js3Var = rqi.a;
            if (obj2 != js3Var) {
                if (obj2 != obj && obj != null) {
                    tuh.c("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, js3Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                e();
                return;
            }
        }
        xq0.q("This mutex is not locked");
    }

    public final boolean f() {
        return Math.max(agp.g.get(this), 0) == 0;
    }

    public final boolean g() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = agp.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + ff7.B(this) + "[isLocked=" + f() + ",owner=" + h.get(this) + ']';
    }
}
