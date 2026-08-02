package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class p5g extends a implements xu7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(p5g.class, "runningWorkers$volatile");
    public final /* synthetic */ xu7 d;
    public final a e;
    public final int f;
    public final oqg g;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public p5g(a aVar, int i2) {
        xu7 xu7Var = aVar instanceof xu7 ? (xu7) aVar : null;
        this.d = xu7Var == null ? zl7.a : xu7Var;
        this.e = aVar;
        this.f = i2;
        this.g = new oqg();
        this.h = new Object();
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable J0;
        this.g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) >= this.f || !K0() || (J0 = J0()) == null) {
            return;
        }
        try {
            w98.b(new pv7(20, this, J0), this, this.e);
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.a
    public final void G0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable J0;
        this.g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
        if (atomicIntegerFieldUpdater.get(this) >= this.f || !K0() || (J0 = J0()) == null) {
            return;
        }
        try {
            this.e.G0(this, new pv7(20, this, J0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.a
    public final a I0(int i2) {
        q5g.B(i2);
        return i2 >= this.f ? this : super.I0(i2);
    }

    public final Runnable J0() {
        while (true) {
            Runnable runnable = (Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean K0() {
        synchronized (this.h) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (atomicIntegerFieldUpdater.get(this) >= this.f) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.xu7
    public final void Q(long j, zt3 zt3Var) {
        this.d.Q(j, zt3Var);
    }

    @Override // defpackage.xu7
    public final qa8 S(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.d.S(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.a
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(".limitedParallelism(");
        return vz1.r(sb, this.f, ')');
    }
}
