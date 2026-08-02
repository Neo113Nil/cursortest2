package Z7;

import D.x;
import E2.C0316m;
import S7.AbstractC0410y;
import X7.r;
import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class c implements Executor, Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4174A = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4175B = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4176C = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: D, reason: collision with root package name */
    public static final C0316m f4177D = new C0316m("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final int f4178n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: u, reason: collision with root package name */
    public final int f4179u;

    /* renamed from: v, reason: collision with root package name */
    public final long f4180v;

    /* renamed from: w, reason: collision with root package name */
    public final String f4181w;

    /* renamed from: x, reason: collision with root package name */
    public final f f4182x;

    /* renamed from: y, reason: collision with root package name */
    public final f f4183y;

    /* renamed from: z, reason: collision with root package name */
    public final r f4184z;

    public c(int i, int i4, String str, long j6) {
        this.f4178n = i;
        this.f4179u = i4;
        this.f4180v = j6;
        this.f4181w = str;
        if (i < 1) {
            throw new IllegalArgumentException(x.j(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC5128c.c(i4, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(x.j(i4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f4182x = new f();
        this.f4183y = new f();
        this.f4184z = new r((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void j(c cVar, Runnable runnable, int i) {
        cVar.i(runnable, k.f4199g, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.f4184z) {
            try {
                if (f4176C.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4175B;
                long j6 = atomicLongFieldUpdater.get(this);
                int i = (int) (j6 & 2097151);
                int i4 = i - ((int) ((j6 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f4178n) {
                    return 0;
                }
                if (i >= this.f4179u) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f4184z.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f4184z.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = i4 + 1;
                aVar.start();
                return i9;
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
        if (f4176C.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f4160A, this)) {
                aVar = null;
            }
            synchronized (this.f4184z) {
                i = (int) (f4175B.get(this) & 2097151);
            }
            if (1 <= i) {
                int i4 = 1;
                while (true) {
                    Object b9 = this.f4184z.b(i4);
                    kotlin.jvm.internal.h.b(b9);
                    a aVar2 = (a) b9;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f4161n;
                        f fVar = this.f4183y;
                        mVar.getClass();
                        i iVar2 = (i) m.f4202b.getAndSet(mVar, null);
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
            this.f4183y.b();
            this.f4182x.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f4182x.d();
                if (iVar == null && (iVar = (i) this.f4183y.d()) == null) {
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
                aVar.h(b.f4172x);
            }
            f4174A.set(this, 0L);
            f4175B.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final void i(Runnable runnable, N6.i iVar, boolean z6) {
        i jVar;
        b bVar;
        k.f4198f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f4190n = nanoTime;
            jVar.f4191u = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z9 = false;
        boolean z10 = jVar.f4191u.f2062u == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4175B;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, com.anythink.basead.exoplayer.j.a.c.f8818a) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f4160A, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f4163v) != b.f4172x && (jVar.f4191u.f2062u != 0 || bVar != b.f4169u)) {
            aVar.f4167z = true;
            m mVar = aVar.f4161n;
            if (z6) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar2 = (i) m.f4202b.getAndSet(mVar, jVar);
                jVar = iVar2 == null ? null : mVar.a(iVar2);
            }
        }
        if (jVar != null) {
            if (!(jVar.f4191u.f2062u == 1 ? this.f4183y.a(jVar) : this.f4182x.a(jVar))) {
                throw new RejectedExecutionException(Wv.i(new StringBuilder(), this.f4181w, " was terminated"));
            }
        }
        if (z6 && aVar != null) {
            z9 = true;
        }
        if (z10) {
            if (z9 || z() || l(addAndGet)) {
                return;
            }
            z();
            return;
        }
        if (z9 || z() || l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        z();
    }

    public final void k(a aVar, int i, int i4) {
        while (true) {
            long j6 = f4174A.get(this);
            int i6 = (int) (2097151 & j6);
            long j9 = (com.anythink.basead.exoplayer.j.a.c.f8818a + j6) & (-2097152);
            if (i6 == i) {
                if (i4 == 0) {
                    Object c9 = aVar.c();
                    while (true) {
                        if (c9 == f4177D) {
                            i6 = -1;
                            break;
                        }
                        if (c9 == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) c9;
                        int b9 = aVar2.b();
                        if (b9 != 0) {
                            i6 = b9;
                            break;
                        }
                        c9 = aVar2.c();
                    }
                } else {
                    i6 = i4;
                }
            }
            if (i6 >= 0) {
                if (f4174A.compareAndSet(this, j6, i6 | j9)) {
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
        int i4 = this.f4178n;
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
        r rVar = this.f4184z;
        int a9 = rVar.a();
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < a9; i11++) {
            a aVar = (a) rVar.b(i11);
            if (aVar != null) {
                m mVar = aVar.f4161n;
                mVar.getClass();
                int i12 = m.f4202b.get(mVar) != null ? (m.f4203c.get(mVar) - m.f4204d.get(mVar)) + 1 : m.f4203c.get(mVar) - m.f4204d.get(mVar);
                int ordinal = aVar.f4163v.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i6++;
                } else if (ordinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i12);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i10++;
                }
            }
        }
        long j6 = f4175B.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4181w);
        sb4.append('@');
        sb4.append(AbstractC0410y.j(this));
        sb4.append("[Pool Size {core = ");
        int i13 = this.f4178n;
        sb4.append(i13);
        sb4.append(", max = ");
        sb4.append(this.f4179u);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i9);
        sb4.append(", terminated = ");
        sb4.append(i10);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4182x.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4183y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i13 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean z() {
        C0316m c0316m;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4174A;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f4184z.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j9 = (com.anythink.basead.exoplayer.j.a.c.f8818a + j6) & (-2097152);
                Object c9 = aVar.c();
                while (true) {
                    c0316m = f4177D;
                    if (c9 == c0316m) {
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
                    aVar.g(c0316m);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f4159B.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
