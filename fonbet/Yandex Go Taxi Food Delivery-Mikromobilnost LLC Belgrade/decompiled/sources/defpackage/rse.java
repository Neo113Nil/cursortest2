package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class rse extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(rse.class, "workerCtl$volatile");
    public final /* synthetic */ sse A;
    public final z951 a;
    public final Ref$ObjectRef b;
    public CoroutineScheduler$WorkerState c;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public long w;
    private volatile /* synthetic */ int workerCtl$volatile;
    public long x;
    public int y;
    public boolean z;

    public rse(sse sseVar, int i) {
        this.A = sseVar;
        setDaemon(true);
        setContextClassLoader(sse.class.getClassLoader());
        this.a = new z951();
        this.b = new Ref$ObjectRef();
        this.c = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = sse.D;
        int nanoTime = (int) System.nanoTime();
        this.y = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final xsx0 a(boolean z) {
        xsx0 e;
        xsx0 e2;
        long j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.c;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        sse sseVar = this.A;
        z951 z951Var = this.a;
        if (coroutineScheduler$WorkerState != coroutineScheduler$WorkerState2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = sse.B;
            do {
                j = atomicLongFieldUpdater.get(sseVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    xsx0 g = z951Var.g();
                    return (g == null && (g = (xsx0) sseVar.y.d()) == null) ? i(1) : g;
                }
            } while (!sse.B.compareAndSet(sseVar, j, j - 4398046511104L));
            this.c = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = d(sseVar.a * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            xsx0 e3 = z951Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            xsx0 e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.y = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final xsx0 e() {
        int d = d(2);
        sse sseVar = this.A;
        gjt gjtVar = sseVar.y;
        gjt gjtVar2 = sseVar.x;
        if (d == 0) {
            xsx0 xsx0Var = (xsx0) gjtVar2.d();
            return xsx0Var != null ? xsx0Var : (xsx0) gjtVar.d();
        }
        xsx0 xsx0Var2 = (xsx0) gjtVar.d();
        return xsx0Var2 != null ? xsx0Var2 : (xsx0) gjtVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A.w);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.c;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z) {
            sse.B.addAndGet(this.A, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.c = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [xsx0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [xsx0] */
    public final xsx0 i(int i) {
        T t;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sse.B;
        sse sseVar = this.A;
        int i3 = (int) (atomicLongFieldUpdater.get(sseVar) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        for (int i4 = 0; i4 < i3; i4++) {
            d++;
            if (d > i3) {
                d = 1;
            }
            rse rseVar = (rse) sseVar.z.b(d);
            if (rseVar != null && rseVar != this) {
                z951 z951Var = rseVar.a;
                z951Var.getClass();
                if (i == 3) {
                    t = z951Var.f();
                } else {
                    boolean z = i == 1;
                    int i5 = z951.d.get(z951Var);
                    int i6 = z951.c.get(z951Var);
                    while (i5 != i6 && (!z || z951.e.get(z951Var) != 0)) {
                        int i7 = i5 + 1;
                        t = z951Var.h(i5, z);
                        if (t != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    t = 0;
                }
                Ref$ObjectRef ref$ObjectRef = this.b;
                if (t != 0) {
                    ref$ObjectRef.element = t;
                    i2 = -1;
                } else {
                    i2 = z951Var.i(i, ref$ObjectRef);
                }
                if (i2 == -1) {
                    xsx0 xsx0Var = (xsx0) ref$ObjectRef.element;
                    ref$ObjectRef.element = null;
                    return xsx0Var;
                }
                if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
            j = 0;
        }
        this.x = j;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (sse.C.get(this.A) != 1) {
                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.c;
                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.TERMINATED;
                if (coroutineScheduler$WorkerState == coroutineScheduler$WorkerState2) {
                    break loop0;
                }
                xsx0 a = a(this.z);
                if (a != null) {
                    this.x = 0L;
                    sse sseVar = this.A;
                    this.w = 0L;
                    if (this.c == CoroutineScheduler$WorkerState.PARKING) {
                        this.c = CoroutineScheduler$WorkerState.BLOCKING;
                    }
                    if (a.b) {
                        if (h(CoroutineScheduler$WorkerState.BLOCKING) && !sseVar.n() && !sseVar.k(sse.B.get(sseVar))) {
                            sseVar.n();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        sse.B.addAndGet(sseVar, -2097152L);
                        if (this.c != coroutineScheduler$WorkerState2) {
                            this.c = CoroutineScheduler$WorkerState.DORMANT;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.z = false;
                    if (this.x == 0) {
                        Object obj = this.nextParkedWorker;
                        jb20 jb20Var = sse.D;
                        if (obj != jb20Var) {
                            B.set(this, -1);
                            while (this.nextParkedWorker != sse.D) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    sse sseVar2 = this.A;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = sse.C;
                                    if (atomicIntegerFieldUpdater2.get(sseVar2) == 1) {
                                        break;
                                    }
                                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = this.c;
                                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = CoroutineScheduler$WorkerState.TERMINATED;
                                    if (coroutineScheduler$WorkerState3 == coroutineScheduler$WorkerState4) {
                                        break;
                                    }
                                    h(CoroutineScheduler$WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.w == 0) {
                                        j = 2097151;
                                        this.w = System.nanoTime() + this.A.c;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.A.c);
                                    if (System.nanoTime() - this.w >= 0) {
                                        this.w = 0L;
                                        sse sseVar3 = this.A;
                                        synchronized (sseVar3.z) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(sseVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = sse.B;
                                                    if (((int) (atomicLongFieldUpdater.get(sseVar3) & j)) > sseVar3.a && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        sseVar3.e(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(sseVar3) & j);
                                                        if (andDecrement != i) {
                                                            rse rseVar = (rse) sseVar3.z.b(andDecrement);
                                                            sseVar3.z.c(i, rseVar);
                                                            rseVar.f(i);
                                                            sseVar3.e(rseVar, andDecrement, i);
                                                        }
                                                        sseVar3.z.c(andDecrement, null);
                                                        this.c = coroutineScheduler$WorkerState4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            sse sseVar4 = this.A;
                            if (this.nextParkedWorker == jb20Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = sse.A;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(sseVar4);
                                    long j3 = (j2 + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & (-2097152);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = sseVar4.z.b((int) (j2 & 2097151));
                                    sse sseVar5 = sseVar4;
                                    if (sse.A.compareAndSet(sseVar5, j2, j3 | i2)) {
                                        break;
                                    } else {
                                        sseVar4 = sseVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(CoroutineScheduler$WorkerState.PARKING);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.x);
                        this.x = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(CoroutineScheduler$WorkerState.TERMINATED);
    }
}
