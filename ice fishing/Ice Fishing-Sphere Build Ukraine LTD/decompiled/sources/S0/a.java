package S0;

import E0.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f948m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: e, reason: collision with root package name */
    public final m f949e;

    /* renamed from: f, reason: collision with root package name */
    public final p f950f;

    /* renamed from: g, reason: collision with root package name */
    public int f951g;

    /* renamed from: h, reason: collision with root package name */
    public long f952h;

    /* renamed from: i, reason: collision with root package name */
    public long f953i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public int f954j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f955k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f956l;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f956l = bVar;
        setDaemon(true);
        this.f949e = new m();
        this.f950f = new p();
        this.f951g = 4;
        this.nextParkedWorker = b.f960o;
        F0.e.f326e.getClass();
        this.f954j = F0.e.f327f.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f951g;
        h hVar = null;
        m mVar = this.f949e;
        b bVar2 = this.f956l;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f958m;
            do {
                bVar = this.f956l;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f986b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f974f.f975a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f988d.get(mVar);
                    int i4 = m.f987c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f989e.get(mVar) == 0) {
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
                    h hVar3 = (h) bVar2.f966j.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f958m.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f951g = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f961e * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f986b.getAndSet(mVar, null);
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
        int i3 = this.f954j;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f954j = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f956l;
        if (d2 == 0) {
            h hVar = (h) bVar.f965i.d();
            return hVar != null ? hVar : (h) bVar.f966j.d();
        }
        h hVar2 = (h) bVar.f966j.d();
        return hVar2 != null ? hVar2 : (h) bVar.f965i.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f956l.f964h);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f951g;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f958m.addAndGet(this.f956l, 4398046511104L);
        }
        if (i3 != i2) {
            this.f951g = i2;
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f958m;
        b bVar = this.f956l;
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
            a aVar = (a) bVar.f967k.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f949e;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f988d.get(mVar);
                    int i8 = m.f987c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.f989e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                p pVar = this.f950f;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f986b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f974f.f975a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f982f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f973e;
                        long j4 = k.f978b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                pVar.f313e = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    pVar.f313e = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) pVar.f313e;
                    pVar.f313e = hVar2;
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
        this.f953i = j3;
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
                b bVar = this.f956l;
                bVar.getClass();
                int i3 = 5;
                if (b.f959n.get(bVar) == 0 && this.f951g != 5) {
                    h a2 = a(this.f955k);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f953i = 0L;
                        int i5 = a2.f974f.f975a;
                        this.f952h = 0L;
                        if (this.f951g == 3) {
                            this.f951g = 2;
                        }
                        b bVar2 = this.f956l;
                        if (i5 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.f958m.get(bVar2))) {
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
                            b.f958m.addAndGet(bVar2, -2097152L);
                            if (this.f951g != 5) {
                                this.f951g = 4;
                            }
                        }
                    } else {
                        this.f955k = false;
                        if (this.f953i == 0) {
                            Object obj = this.nextParkedWorker;
                            A.j jVar = b.f960o;
                            if (obj != jVar) {
                                f948m.set(this, -1);
                                while (this.nextParkedWorker != b.f960o) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f948m;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f956l;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f959n;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f951g != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f952h == 0) {
                                                this.f952h = System.nanoTime() + this.f956l.f963g;
                                            }
                                            LockSupport.parkNanos(this.f956l.f963g);
                                            if (System.nanoTime() - this.f952h >= 0) {
                                                this.f952h = 0L;
                                                b bVar4 = this.f956l;
                                                synchronized (bVar4.f967k) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f958m;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f961e) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f967k.b(andDecrement);
                                                                        E0.i.b(b2);
                                                                        a aVar = (a) b2;
                                                                        bVar4.f967k.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.c(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f967k.c(andDecrement, null);
                                                                    this.f951g = 5;
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
                                b bVar5 = this.f956l;
                                bVar5.getClass();
                                if (this.nextParkedWorker == jVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f957l;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f967k.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f953i);
                                this.f953i = 0L;
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
