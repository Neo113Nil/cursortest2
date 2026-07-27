package V7;

import D.y;
import O7.AbstractC0399y;
import T7.r;
import T7.v;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3340A = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3341B = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3342C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: D, reason: collision with root package name */
    public static final v f3343D = new v("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f3344n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f3345u;

    /* renamed from: v, reason: collision with root package name */
    public final long f3346v;

    /* renamed from: w, reason: collision with root package name */
    public final String f3347w;

    /* renamed from: x, reason: collision with root package name */
    public final f f3348x;

    /* renamed from: y, reason: collision with root package name */
    public final f f3349y;

    /* renamed from: z, reason: collision with root package name */
    public final r f3350z;

    public c(int i, int i4, String str, long j9) {
        this.f3344n = i;
        this.f3345u = i4;
        this.f3346v = j9;
        this.f3347w = str;
        if (i < 1) {
            throw new IllegalArgumentException(y.i(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC5051n.c(i4, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(y.i(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j9 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j9 + " must be positive").toString());
        }
        this.f3348x = new f();
        this.f3349y = new f();
        this.f3350z = new r((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void i(c cVar, Runnable runnable, int i) {
        cVar.g(runnable, k.f3365g, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.f3350z) {
            try {
                if (f3342C.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3341B;
                long j9 = atomicLongFieldUpdater.get(this);
                int i = (int) (j9 & 2097151);
                int i4 = i - ((int) ((j9 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f3344n) {
                    return 0;
                }
                if (i >= this.f3345u) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f3350z.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f3350z.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i4 + 1;
                aVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        i iVar;
        if (f3342C.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f3326A, this)) {
                aVar = null;
            }
            synchronized (this.f3350z) {
                i = (int) (f3341B.get(this) & 2097151);
            }
            if (1 <= i) {
                int i4 = 1;
                while (true) {
                    Object b9 = this.f3350z.b(i4);
                    kotlin.jvm.internal.h.b(b9);
                    a aVar2 = (a) b9;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f3327n;
                        f fVar = this.f3349y;
                        mVar.getClass();
                        i iVar2 = (i) m.f3368b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b10 = mVar.b();
                            if (b10 == null) {
                                break;
                            } else {
                                fVar.a(b10);
                            }
                        }
                    }
                    if (i4 == i) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f3349y.b();
            this.f3348x.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f3348x.d();
                if (iVar == null && (iVar = (i) this.f3349y.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f3338x);
            }
            f3340A.set(this, 0L);
            f3341B.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void g(Runnable runnable, J6.i iVar, boolean z8) {
        i jVar;
        b bVar;
        k.f3364f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f3356n = nanoTime;
            jVar.f3357u = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z9 = false;
        boolean z10 = jVar.f3357u.f1421u == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3341B;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, com.anythink.basead.exoplayer.j.a.c.f8189a) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f3326A, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3329v) != b.f3338x && (jVar.f3357u.f1421u != 0 || bVar != b.f3335u)) {
            aVar.f3333z = true;
            m mVar = aVar.f3327n;
            if (z8) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar2 = (i) m.f3368b.getAndSet(mVar, jVar);
                jVar = iVar2 == null ? null : mVar.a(iVar2);
            }
        }
        if (jVar != null) {
            if (!(jVar.f3357u.f1421u == 1 ? this.f3349y.a(jVar) : this.f3348x.a(jVar))) {
                throw new RejectedExecutionException(AbstractC5051n.g(new StringBuilder(), this.f3347w, " was terminated"));
            }
        }
        if (z8 && aVar != null) {
            z9 = true;
        }
        if (z10) {
            if (z9 || z() || k(addAndGet)) {
                return;
            }
            z();
            return;
        }
        if (z9 || z() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        z();
    }

    public final void j(a aVar, int i, int i4) {
        while (true) {
            long j9 = f3340A.get(this);
            int i9 = (int) (2097151 & j9);
            long j10 = (com.anythink.basead.exoplayer.j.a.c.f8189a + j9) & (-2097152);
            if (i9 == i) {
                if (i4 == 0) {
                    Object c4 = aVar.c();
                    while (true) {
                        if (c4 == f3343D) {
                            i9 = -1;
                            break;
                        }
                        if (c4 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c4;
                        int b9 = aVar2.b();
                        if (b9 != 0) {
                            i9 = b9;
                            break;
                        }
                        c4 = aVar2.c();
                    }
                } else {
                    i9 = i4;
                }
            }
            if (i9 >= 0) {
                if (f3340A.compareAndSet(this, j9, i9 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j9) {
        int i = ((int) (2097151 & j9)) - ((int) ((j9 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i4 = this.f3344n;
        if (i < i4) {
            int b9 = b();
            if (b9 == 1 && i4 > 1) {
                b();
            }
            if (b9 > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f3350z;
        int a9 = rVar.a();
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a9; i12++) {
            a aVar = (a) rVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f3327n;
                mVar.getClass();
                int i13 = m.f3368b.get(mVar) != null ? (m.f3369c.get(mVar) - m.f3370d.get(mVar)) + 1 : m.f3369c.get(mVar) - m.f3370d.get(mVar);
                int ordinal = aVar.f3329v.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i9++;
                } else if (ordinal == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i11++;
                }
            }
        }
        long j9 = f3341B.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3347w);
        sb4.append('@');
        sb4.append(AbstractC0399y.j(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f3344n;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f3345u);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3348x.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3349y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j9));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j9) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j9 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean z() {
        v vVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3340A;
            long j9 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f3350z.b((int) (2097151 & j9));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (com.anythink.basead.exoplayer.j.a.c.f8189a + j9) & (-2097152);
                Object c4 = aVar.c();
                while (true) {
                    vVar = f3343D;
                    if (c4 == vVar) {
                        i = -1;
                        break;
                    }
                    if (c4 == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c4;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c4 = aVar2.c();
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j9, j10 | i)) {
                    aVar.g(vVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3325B.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
