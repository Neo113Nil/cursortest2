package Z7;

import D.y;
import S7.AbstractC0406y;
import X7.r;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4196A = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4197B = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4198C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: D, reason: collision with root package name */
    public static final D2.b f4199D = new D2.b("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f4200n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f4201u;

    /* renamed from: v, reason: collision with root package name */
    public final long f4202v;

    /* renamed from: w, reason: collision with root package name */
    public final String f4203w;

    /* renamed from: x, reason: collision with root package name */
    public final f f4204x;

    /* renamed from: y, reason: collision with root package name */
    public final f f4205y;

    /* renamed from: z, reason: collision with root package name */
    public final r f4206z;

    public c(int i, int i6, String str, long j6) {
        this.f4200n = i;
        this.f4201u = i6;
        this.f4202v = j6;
        this.f4203w = str;
        if (i < 1) {
            throw new IllegalArgumentException(y.k(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i6 < i) {
            throw new IllegalArgumentException(u1.h.c(i6, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i6 > 2097150) {
            throw new IllegalArgumentException(y.k(i6, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f4204x = new f();
        this.f4205y = new f();
        this.f4206z = new r((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void j(c cVar, Runnable runnable, int i) {
        cVar.i(runnable, k.f4221g, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.f4206z) {
            try {
                if (f4198C.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4197B;
                long j6 = atomicLongFieldUpdater.get(this);
                int i = (int) (j6 & 2097151);
                int i6 = i - ((int) ((j6 & 4398044413952L) >> 21));
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= this.f4200n) {
                    return 0;
                }
                if (i >= this.f4201u) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f4206z.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f4206z.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i6 + 1;
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
        if (f4198C.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f4182A, this)) {
                aVar = null;
            }
            synchronized (this.f4206z) {
                i = (int) (f4197B.get(this) & 2097151);
            }
            if (1 <= i) {
                int i6 = 1;
                while (true) {
                    Object b9 = this.f4206z.b(i6);
                    kotlin.jvm.internal.h.b(b9);
                    a aVar2 = (a) b9;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f4183n;
                        f fVar = this.f4205y;
                        mVar.getClass();
                        i iVar2 = (i) m.f4224b.getAndSet(mVar, null);
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
                    if (i6 == i) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f4205y.b();
            this.f4204x.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f4204x.d();
                if (iVar == null && (iVar = (i) this.f4205y.d()) == null) {
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
                aVar.h(b.f4194x);
            }
            f4196A.set(this, 0L);
            f4197B.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final void i(Runnable runnable, N6.i iVar, boolean z3) {
        i jVar;
        b bVar;
        k.f4220f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f4212n = nanoTime;
            jVar.f4213u = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z6 = false;
        boolean z9 = jVar.f4213u.f1974u == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4197B;
        long addAndGet = z9 ? atomicLongFieldUpdater.addAndGet(this, com.anythink.basead.exoplayer.j.a.c.f8032a) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f4182A, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f4185v) != b.f4194x && (jVar.f4213u.f1974u != 0 || bVar != b.f4191u)) {
            aVar.f4189z = true;
            m mVar = aVar.f4183n;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar2 = (i) m.f4224b.getAndSet(mVar, jVar);
                jVar = iVar2 == null ? null : mVar.a(iVar2);
            }
        }
        if (jVar != null) {
            if (!(jVar.f4213u.f1974u == 1 ? this.f4205y.a(jVar) : this.f4204x.a(jVar))) {
                throw new RejectedExecutionException(u1.h.g(new StringBuilder(), this.f4203w, " was terminated"));
            }
        }
        if (z3 && aVar != null) {
            z6 = true;
        }
        if (z9) {
            if (z6 || z() || l(addAndGet)) {
                return;
            }
            z();
            return;
        }
        if (z6 || z() || l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        z();
    }

    public final void k(a aVar, int i, int i6) {
        while (true) {
            long j6 = f4196A.get(this);
            int i9 = (int) (2097151 & j6);
            long j9 = (com.anythink.basead.exoplayer.j.a.c.f8032a + j6) & (-2097152);
            if (i9 == i) {
                if (i6 == 0) {
                    Object c9 = aVar.c();
                    while (true) {
                        if (c9 == f4199D) {
                            i9 = -1;
                            break;
                        }
                        if (c9 == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) c9;
                        int b9 = aVar2.b();
                        if (b9 != 0) {
                            i9 = b9;
                            break;
                        }
                        c9 = aVar2.c();
                    }
                } else {
                    i9 = i6;
                }
            }
            if (i9 >= 0) {
                if (f4196A.compareAndSet(this, j6, i9 | j9)) {
                    return;
                }
            }
        }
    }

    public final boolean l(long j6) {
        int i = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i6 = this.f4200n;
        if (i < i6) {
            int b9 = b();
            if (b9 == 1 && i6 > 1) {
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
        r rVar = this.f4206z;
        int a9 = rVar.a();
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < a9; i12++) {
            a aVar = (a) rVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f4183n;
                mVar.getClass();
                int i13 = m.f4224b.get(mVar) != null ? (m.f4225c.get(mVar) - m.f4226d.get(mVar)) + 1 : m.f4225c.get(mVar) - m.f4226d.get(mVar);
                int ordinal = aVar.f4185v.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i6++;
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
        long j6 = f4197B.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4203w);
        sb4.append('@');
        sb4.append(AbstractC0406y.j(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f4200n;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f4201u);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i6);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4204x.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4205y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean z() {
        D2.b bVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4196A;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f4206z.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (com.anythink.basead.exoplayer.j.a.c.f8032a + j6) & (-2097152);
                Object c9 = aVar.c();
                while (true) {
                    bVar = f4199D;
                    if (c9 == bVar) {
                        i = -1;
                        break;
                    }
                    if (c9 == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c9;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c9 = aVar2.c();
                }
                if (i >= 0 && atomicLongFieldUpdater.compareAndSet(this, j6, j9 | i)) {
                    aVar.g(bVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f4181B.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
