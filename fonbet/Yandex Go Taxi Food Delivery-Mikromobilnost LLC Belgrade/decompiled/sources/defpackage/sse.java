package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* loaded from: classes9.dex */
public final class sse implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(sse.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(sse.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(sse.class, "_isTerminated$volatile");
    public static final jb20 D = new jb20("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final String w;
    public final gjt x;
    public final gjt y;
    public final vrj0 z;

    public sse(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.w = str;
        if (i < 1) {
            w511.f(oyr.j(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            w511.f(oyr.h(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            w511.f(oyr.j(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            w511.f(qv10.k(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.x = new gjt();
        this.y = new gjt();
        this.z = new vrj0((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public static /* synthetic */ void d(sse sseVar, Runnable runnable, int i) {
        sseVar.c(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.z) {
            try {
                if (C.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = B;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.z.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                rse rseVar = new rse(this, i3);
                this.z.c(i3, rseVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                rseVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        xsx0 ftx0Var;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        otx0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof xsx0) {
            ftx0Var = (xsx0) runnable;
            ftx0Var.a = nanoTime;
            ftx0Var.b = z;
        } else {
            ftx0Var = new ftx0(runnable, nanoTime, z);
        }
        boolean z3 = ftx0Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread currentThread = Thread.currentThread();
        rse rseVar = null;
        rse rseVar2 = currentThread instanceof rse ? (rse) currentThread : null;
        if (rseVar2 != null && rseVar2.A == this) {
            rseVar = rseVar2;
        }
        if (rseVar != null && (coroutineScheduler$WorkerState = rseVar.c) != CoroutineScheduler$WorkerState.TERMINATED && (ftx0Var.b || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            rseVar.z = true;
            ftx0Var = rseVar.a.a(ftx0Var, z2);
        }
        if (ftx0Var != null) {
            if (!(ftx0Var.b ? this.y.a(ftx0Var) : this.x.a(ftx0Var))) {
                throw new RejectedExecutionException(oyr.t(new StringBuilder(), this.w, " was terminated"));
            }
        }
        if (z3) {
            if (n() || k(addAndGet)) {
                return;
            }
            n();
            return;
        }
        if (n() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        xsx0 xsx0Var;
        if (C.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            rse rseVar = null;
            rse rseVar2 = currentThread instanceof rse ? (rse) currentThread : null;
            if (rseVar2 != null && rseVar2.A == this) {
                rseVar = rseVar2;
            }
            synchronized (this.z) {
                i = (int) (B.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    rse rseVar3 = (rse) this.z.b(i2);
                    if (rseVar3 != rseVar) {
                        while (rseVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(rseVar3);
                            rseVar3.join(10000L);
                        }
                        rseVar3.a.d(this.y);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.y.b();
            this.x.b();
            while (true) {
                if (rseVar != null) {
                    xsx0Var = rseVar.a(true);
                }
                xsx0Var = (xsx0) this.x.d();
                if (xsx0Var == null && (xsx0Var = (xsx0) this.y.d()) == null) {
                    break;
                }
                try {
                    xsx0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (rseVar != null) {
                rseVar.h(CoroutineScheduler$WorkerState.TERMINATED);
            }
            A.set(this, 0L);
            B.set(this, 0L);
        }
    }

    public final void e(rse rseVar, int i, int i2) {
        while (true) {
            long j = A.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = rseVar.c();
                    while (true) {
                        if (c == D) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        rse rseVar2 = (rse) c;
                        int b = rseVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = rseVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                sse sseVar = this;
                if (A.compareAndSet(sseVar, j, i3 | j2)) {
                    return;
                } else {
                    this = sseVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final boolean k(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        sse sseVar;
        jb20 jb20Var;
        int i;
        while (true) {
            long j = A.get(this);
            rse rseVar = (rse) this.z.b((int) (2097151 & j));
            if (rseVar == null) {
                rseVar = null;
                sseVar = this;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object c = rseVar.c();
                while (true) {
                    jb20Var = D;
                    if (c == jb20Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    rse rseVar2 = (rse) c;
                    i = rseVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = rseVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    sse sseVar2 = this;
                    boolean compareAndSet = A.compareAndSet(sseVar2, j, i | j2);
                    sseVar = sseVar2;
                    if (compareAndSet) {
                        rseVar.g(jb20Var);
                    }
                    this = sseVar;
                } else {
                    continue;
                }
            }
            if (rseVar == null) {
                return false;
            }
            if (rse.B.compareAndSet(rseVar, -1, 0)) {
                LockSupport.unpark(rseVar);
                return true;
            }
            this = sseVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        vrj0 vrj0Var = this.z;
        int a = vrj0Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            rse rseVar = (rse) vrj0Var.b(i6);
            if (rseVar != null) {
                int c = rseVar.a.c();
                int i7 = qse.a[rseVar.c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        w511.b();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = B.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.w);
        sb4.append('@');
        sb4.append(wwg.s(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        vfc.u(this.b, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        vfc.u(i2, i3, ", parked = ", ", dormant = ", sb4);
        vfc.u(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.x.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
