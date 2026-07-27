package R0;

import E0.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f937n = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: f, reason: collision with root package name */
    public final m f938f;

    /* renamed from: g, reason: collision with root package name */
    public final p f939g;

    /* renamed from: h, reason: collision with root package name */
    public int f940h;

    /* renamed from: i, reason: collision with root package name */
    public long f941i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f942j;

    /* renamed from: k, reason: collision with root package name */
    public int f943k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f944l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f945m;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f945m = bVar;
        setDaemon(true);
        this.f938f = new m();
        this.f939g = new p();
        this.f940h = 4;
        this.nextParkedWorker = b.f949p;
        F0.e.f325f.getClass();
        this.f943k = F0.e.f326g.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f940h;
        h hVar = null;
        m mVar = this.f938f;
        b bVar2 = this.f945m;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f947n;
            do {
                bVar = this.f945m;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f975b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f963g.f964a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f977d.get(mVar);
                    int i4 = m.f976c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f978e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f955k.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f947n.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f940h = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f950f * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f975b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
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

    public final int d(int i2) {
        int i3 = this.f943k;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f943k = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f945m;
        if (d2 == 0) {
            h hVar = (h) bVar.f954j.d();
            return hVar != null ? hVar : (h) bVar.f955k.d();
        }
        h hVar2 = (h) bVar.f955k.d();
        return hVar2 != null ? hVar2 : (h) bVar.f954j.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f945m.f953i);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f940h;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f947n.addAndGet(this.f945m, 4398046511104L);
        }
        if (i3 != i2) {
            this.f940h = i2;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i2) {
        int i3;
        h hVar;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f947n;
        b bVar = this.f945m;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d2 = d(i4);
        int i5 = 0;
        long j3 = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = d2 + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f956l.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f938f;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f977d.get(mVar);
                    int i8 = m.f976c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.f978e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                p pVar = this.f939g;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f975b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f963g.f964a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f971f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f962f;
                        long j4 = k.f967b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                pVar.f312f = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    pVar.f312f = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) pVar.f312f;
                    pVar.f312f = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j3 = Math.min(j3, j2);
                }
            }
            i5++;
            d2 = i3;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f942j = j3;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.f945m;
                bVar.getClass();
                int i3 = 5;
                if (b.f948o.get(bVar) == 0 && this.f940h != 5) {
                    h a2 = a(this.f944l);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f942j = 0L;
                        int i5 = a2.f963g.f964a;
                        this.f941i = 0L;
                        if (this.f940h == 3) {
                            this.f940h = 2;
                        }
                        b bVar2 = this.f945m;
                        if (i5 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.f947n.get(bVar2))) {
                            bVar2.e();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i5 != 0) {
                            b.f947n.addAndGet(bVar2, -2097152L);
                            if (this.f940h != 5) {
                                this.f940h = 4;
                            }
                        }
                    } else {
                        this.f944l = false;
                        if (this.f942j == 0) {
                            Object obj = this.nextParkedWorker;
                            A.j jVar = b.f949p;
                            if (obj != jVar) {
                                f937n.set(this, -1);
                                while (this.nextParkedWorker != b.f949p) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f937n;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f945m;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f948o;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f940h != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f941i == 0) {
                                                this.f941i = System.nanoTime() + this.f945m.f952h;
                                            }
                                            LockSupport.parkNanos(this.f945m.f952h);
                                            if (System.nanoTime() - this.f941i >= 0) {
                                                this.f941i = 0L;
                                                b bVar4 = this.f945m;
                                                synchronized (bVar4.f956l) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f947n;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f950f) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f956l.b(andDecrement);
                                                                        E0.i.b(b2);
                                                                        a aVar = (a) b2;
                                                                        bVar4.f956l.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.c(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f956l.c(andDecrement, null);
                                                                    this.f940h = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i3 = 5;
                                            i4 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f945m;
                                bVar5.getClass();
                                if (this.nextParkedWorker == jVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f946m;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f956l.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f942j);
                                this.f942j = 0L;
                                break;
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
