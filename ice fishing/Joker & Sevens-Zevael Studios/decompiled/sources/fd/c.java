package fd;

import dd.s;
import dd.w;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2366n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2367o = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2368p = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final w f2369q = new w("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final int f2370g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2371h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2372i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2373j;

    /* renamed from: k, reason: collision with root package name */
    public final f f2374k;

    /* renamed from: l, reason: collision with root package name */
    public final f f2375l;

    /* renamed from: m, reason: collision with root package name */
    public final s f2376m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i10, int i11, long j3, String str) {
        this.f2370g = i10;
        this.f2371h = i11;
        this.f2372i = j3;
        this.f2373j = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(a4.d.h("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(a4.d.f(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(a4.d.h("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f2374k = new f();
        this.f2375l = new f();
        this.f2376m = new s((i10 + 1) * 2);
        this.controlState$volatile = i10 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void d(c cVar, Runnable runnable, int i10) {
        cVar.b(runnable, l.f2392g, (i10 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f2376m) {
            try {
                if (f2368p.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2367o;
                long j3 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j3 & 2097151);
                int i11 = i10 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f2370g) {
                    return 0;
                }
                if (i10 >= this.f2371h) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f2376m.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f2376m.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, j jVar, boolean z10) {
        i kVar;
        b bVar;
        l.f2391f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            kVar = (i) runnable;
            kVar.f2382g = nanoTime;
            kVar.f2383h = jVar;
        } else {
            kVar = new k(runnable, nanoTime, jVar);
        }
        boolean z11 = false;
        boolean z12 = kVar.f2383h.f2384a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2367o;
        long addAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !pc.j.a(aVar.f2359n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f2354i) != b.f2364k && (kVar.f2383h.f2384a != 0 || bVar != b.f2361h)) {
            aVar.f2358m = true;
            n nVar = aVar.f2352g;
            if (z10) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                i iVar = (i) n.f2395b.getAndSet(nVar, kVar);
                kVar = iVar == null ? null : nVar.a(iVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f2383h.f2384a == 1 ? this.f2375l.a(kVar) : this.f2374k.a(kVar))) {
                throw new RejectedExecutionException(this.f2373j + " was terminated");
            }
        }
        if (z10 && aVar != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || i() || g(addAndGet)) {
                return;
            }
            i();
            return;
        }
        if (z11 || i() || g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i10;
        i iVar;
        if (f2368p.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !pc.j.a(aVar.f2359n, this)) {
                aVar = null;
            }
            synchronized (this.f2376m) {
                i10 = (int) (f2367o.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b2 = this.f2376m.b(i11);
                    pc.j.b(b2);
                    a aVar2 = (a) b2;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        n nVar = aVar2.f2352g;
                        f fVar = this.f2375l;
                        nVar.getClass();
                        i iVar2 = (i) n.f2395b.getAndSet(nVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b10 = nVar.b();
                            if (b10 == null) {
                                break;
                            } else {
                                fVar.a(b10);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f2375l.b();
            this.f2374k.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f2374k.d();
                if (iVar == null && (iVar = (i) this.f2375l.d()) == null) {
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
                aVar.h(b.f2364k);
            }
            f2366n.set(this, 0L);
            f2367o.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final void f(a aVar, int i10, int i11) {
        while (true) {
            long j3 = f2366n.get(this);
            int i12 = (int) (2097151 & j3);
            long j6 = (2097152 + j3) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f2369q) {
                            i12 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b2 = aVar2.b();
                        if (b2 != 0) {
                            i12 = b2;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f2366n.compareAndSet(this, j3, i12 | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean g(long j3) {
        int i10 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f2370g;
        if (i10 < i11) {
            int a6 = a();
            if (a6 == 1 && i11 > 1) {
                a();
            }
            if (a6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        w wVar;
        int i10;
        while (true) {
            long j3 = f2366n.get(this);
            a aVar = (a) this.f2376m.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    wVar = f2369q;
                    if (c3 == wVar) {
                        i10 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i10 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i10 = aVar2.b();
                    if (i10 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i10 >= 0) {
                    if (f2366n.compareAndSet(this, j3, i10 | j6)) {
                        aVar.g(wVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f2351o.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f2376m;
        int a6 = sVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a6; i15++) {
            a aVar = (a) sVar.b(i15);
            if (aVar != null) {
                n nVar = aVar.f2352g;
                nVar.getClass();
                int i16 = n.f2395b.get(nVar) != null ? (n.f2396c.get(nVar) - n.f2397d.get(nVar)) + 1 : n.f2396c.get(nVar) - n.f2397d.get(nVar);
                int ordinal = aVar.f2354i.ordinal();
                if (ordinal == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i12++;
                } else if (ordinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (ordinal == 4) {
                    i14++;
                }
            }
        }
        long j3 = f2367o.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2373j);
        sb4.append('@');
        sb4.append(a0.j(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f2370g;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f2371h);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2374k.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2375l.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
