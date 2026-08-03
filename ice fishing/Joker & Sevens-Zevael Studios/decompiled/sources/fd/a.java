package fd;

import dd.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2351o = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: g, reason: collision with root package name */
    public final n f2352g;

    /* renamed from: h, reason: collision with root package name */
    public final s f2353h;

    /* renamed from: i, reason: collision with root package name */
    public b f2354i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f2355j;

    /* renamed from: k, reason: collision with root package name */
    public long f2356k;

    /* renamed from: l, reason: collision with root package name */
    public int f2357l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2358m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f2359n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f2359n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f2352g = new n();
        this.f2353h = new s();
        this.f2354i = b.f2363j;
        this.nextParkedWorker = c.f2369q;
        int nanoTime = (int) System.nanoTime();
        this.f2357l = nanoTime == 0 ? 42 : nanoTime;
        f(i10);
    }

    public final i a(boolean z10) {
        i e10;
        i e11;
        long j3;
        b bVar = this.f2354i;
        c cVar = this.f2359n;
        i iVar = null;
        n nVar = this.f2352g;
        b bVar2 = b.f2360g;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f2367o;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f2395b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar2 != null && iVar2.f2383h.f2384a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(nVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = n.f2397d.get(nVar);
                    int i11 = n.f2396c.get(nVar);
                    while (true) {
                        if (i10 == i11 || n.f2398e.get(nVar) == 0) {
                            break;
                        }
                        i11--;
                        i c3 = nVar.c(i11, true);
                        if (c3 != null) {
                            iVar = c3;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f2375l.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f2367o.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f2354i = bVar2;
        }
        if (z10) {
            boolean z11 = d(cVar.f2370g * 2) == 0;
            if (z11 && (e11 = e()) != null) {
                return e11;
            }
            nVar.getClass();
            i iVar4 = (i) n.f2395b.getAndSet(nVar, null);
            if (iVar4 == null) {
                iVar4 = nVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (e10 = e()) != null) {
                return e10;
            }
        } else {
            i e12 = e();
            if (e12 != null) {
                return e12;
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

    public final int d(int i10) {
        int i11 = this.f2357l;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f2357l = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i e() {
        int d10 = d(2);
        c cVar = this.f2359n;
        if (d10 == 0) {
            i iVar = (i) cVar.f2374k.d();
            return iVar != null ? iVar : (i) cVar.f2375l.d();
        }
        i iVar2 = (i) cVar.f2375l.d();
        return iVar2 != null ? iVar2 : (i) cVar.f2374k.d();
    }

    public final void f(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2359n.f2373j);
        sb.append("-worker-");
        sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f2354i;
        boolean z10 = bVar2 == b.f2360g;
        if (z10) {
            c.f2367o.addAndGet(this.f2359n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f2354i = bVar;
        }
        return z10;
    }

    public final i i(int i10) {
        long j3;
        i iVar;
        long j6;
        long j10;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f2367o;
        c cVar = this.f2359n;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int d10 = d(i11);
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        while (i12 < i11) {
            d10++;
            if (d10 > i11) {
                d10 = 1;
            }
            a aVar = (a) cVar.f2376m.b(d10);
            if (aVar != null && aVar != this) {
                n nVar = aVar.f2352g;
                if (i10 == 3) {
                    iVar = nVar.b();
                    j3 = 0;
                } else {
                    nVar.getClass();
                    int i13 = n.f2397d.get(nVar);
                    int i14 = n.f2396c.get(nVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i13 == i14) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z10 || n.f2398e.get(nVar) != 0) {
                            int i15 = i13 + 1;
                            iVar = nVar.c(i13, z10);
                            if (iVar != null) {
                                break;
                            }
                            i13 = i15;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                s sVar = this.f2353h;
                if (iVar != null) {
                    sVar.f5683g = iVar;
                    iVar2 = iVar3;
                    j10 = -1;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f2395b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar4 == null) {
                            j6 = -1;
                            break;
                        }
                        j6 = -1;
                        if (((iVar4.f2383h.f2384a == 1 ? 1 : 2) & i10) == 0) {
                            break;
                        }
                        l.f2391f.getClass();
                        n nVar2 = nVar;
                        long nanoTime = System.nanoTime() - iVar4.f2382g;
                        long j12 = l.f2387b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar2, iVar4, null)) {
                                sVar.f5683g = iVar4;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar2) == iVar4);
                        nVar = nVar2;
                        iVar3 = null;
                    }
                    j10 = -2;
                    iVar2 = iVar3;
                }
                if (j10 == j6) {
                    i iVar5 = (i) sVar.f5683g;
                    sVar.f5683g = iVar2;
                    return iVar5;
                }
                if (j10 > j3) {
                    j11 = Math.min(j11, j10);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = 0;
        }
        this.f2356k = j11;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        loop0: while (true) {
            boolean z10 = false;
            while (c.f2368p.get(this.f2359n) == 0) {
                b bVar = this.f2354i;
                b bVar2 = b.f2364k;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a6 = a(this.f2358m);
                if (a6 != null) {
                    this.f2356k = 0L;
                    c cVar = this.f2359n;
                    int i10 = a6.f2383h.f2384a;
                    this.f2355j = 0L;
                    if (this.f2354i == b.f2362i) {
                        this.f2354i = b.f2361h;
                    }
                    if (i10 != 0 && h(b.f2361h) && !cVar.i() && !cVar.g(c.f2367o.get(cVar))) {
                        cVar.i();
                    }
                    try {
                        a6.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i10 != 0) {
                        c.f2367o.addAndGet(cVar, -2097152L);
                        if (this.f2354i != bVar2) {
                            this.f2354i = b.f2363j;
                        }
                    }
                } else {
                    this.f2358m = false;
                    if (this.f2356k == 0) {
                        Object obj = this.nextParkedWorker;
                        w wVar = c.f2369q;
                        if (obj != wVar) {
                            f2351o.set(this, -1);
                            while (this.nextParkedWorker != c.f2369q) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2351o;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f2359n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f2368p;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f2354i;
                                    b bVar4 = b.f2364k;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f2362i);
                                    Thread.interrupted();
                                    if (this.f2355j == 0) {
                                        j3 = 2097151;
                                        this.f2355j = System.nanoTime() + this.f2359n.f2372i;
                                    } else {
                                        j3 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f2359n.f2372i);
                                    if (System.nanoTime() - this.f2355j >= 0) {
                                        this.f2355j = 0L;
                                        c cVar3 = this.f2359n;
                                        synchronized (cVar3.f2376m) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f2367o;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j3)) > cVar3.f2370g) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i11 = this.indexInArray;
                                                            f(0);
                                                            cVar3.f(this, i11, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j3);
                                                            if (andDecrement != i11) {
                                                                Object b2 = cVar3.f2376m.b(andDecrement);
                                                                pc.j.b(b2);
                                                                a aVar = (a) b2;
                                                                cVar3.f2376m.c(i11, aVar);
                                                                aVar.f(i11);
                                                                cVar3.f(aVar, andDecrement, i11);
                                                            }
                                                            cVar3.f2376m.c(andDecrement, null);
                                                            this.f2354i = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f2359n;
                            if (this.nextParkedWorker == wVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f2366n;
                                while (true) {
                                    long j6 = atomicLongFieldUpdater2.get(cVar4);
                                    int i12 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f2376m.b((int) (j6 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f2366n.compareAndSet(cVar5, j6, ((j6 + 2097152) & (-2097152)) | i12)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z10) {
                        h(b.f2362i);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f2356k);
                        this.f2356k = 0L;
                    } else {
                        z10 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f2364k);
    }
}
