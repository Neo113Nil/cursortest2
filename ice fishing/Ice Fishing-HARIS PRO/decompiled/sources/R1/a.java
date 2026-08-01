package R1;

import D1.n;
import Q1.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final m f1019a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1020b;

    /* renamed from: c, reason: collision with root package name */
    public int f1021c;

    /* renamed from: d, reason: collision with root package name */
    public long f1022d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public int f1023f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f1025h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1025h = bVar;
        setDaemon(true);
        this.f1019a = new m();
        this.f1020b = new n(0);
        this.f1021c = 4;
        this.nextParkedWorker = b.f1027k;
        F1.e.f258a.getClass();
        this.f1023f = F1.e.f259b.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e;
        h e2;
        b bVar;
        long j;
        int i2 = this.f1021c;
        h hVar = null;
        m mVar = this.f1019a;
        b bVar2 = this.f1025h;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.i;
            do {
                bVar = this.f1025h;
                j = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1051b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1040b.f1041a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f1053d.get(mVar);
                    int i4 = m.f1052c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.e.get(mVar) == 0) {
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
                    h hVar3 = (h) bVar2.f1032f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.i.compareAndSet(bVar, j, j - 4398046511104L));
            this.f1021c = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f1028a * 2) == 0;
            if (z3 && (e2 = e()) != null) {
                return e2;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1051b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e = e()) != null) {
                return e;
            }
        } else {
            h e3 = e();
            if (e3 != null) {
                return e3;
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
        int i3 = this.f1023f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1023f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1025h;
        if (d2 == 0) {
            h hVar = (h) bVar.e.d();
            return hVar != null ? hVar : (h) bVar.f1032f.d();
        }
        h hVar2 = (h) bVar.f1032f.d();
        return hVar2 != null ? hVar2 : (h) bVar.e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1025h.f1031d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1021c;
        boolean z2 = i3 == 1;
        if (z2) {
            b.i.addAndGet(this.f1025h, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1021c = i2;
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
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.i;
        b bVar = this.f1025h;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d2 = d(i4);
        int i5 = 0;
        long j2 = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = d2 + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f1033g.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f1019a;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f1053d.get(mVar);
                    int i8 = m.f1052c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                n nVar = this.f1020b;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1051b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f1040b.f1041a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f1047f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f1039a;
                        long j3 = k.f1044b;
                        if (nanoTime < j3) {
                            j = j3 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                nVar.f170b = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    nVar.f170b = hVar;
                    i3 = i6;
                }
                j = -1;
                if (j == -1) {
                    h hVar4 = (h) nVar.f170b;
                    nVar.f170b = hVar2;
                    return hVar4;
                }
                if (j > 0) {
                    j2 = Math.min(j2, j);
                }
            }
            i5++;
            d2 = i3;
            hVar2 = null;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = 0;
        }
        this.e = j2;
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
        long j;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.f1025h;
                bVar.getClass();
                int i3 = 5;
                if (b.j.get(bVar) == 0 && this.f1021c != 5) {
                    h a2 = a(this.f1024g);
                    int i4 = 3;
                    if (a2 != null) {
                        this.e = 0L;
                        int i5 = a2.f1040b.f1041a;
                        this.f1022d = 0L;
                        if (this.f1021c == 3) {
                            this.f1021c = 2;
                        }
                        b bVar2 = this.f1025h;
                        if (i5 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.i.get(bVar2))) {
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
                            b.i.addAndGet(bVar2, -2097152L);
                            if (this.f1021c != 5) {
                                this.f1021c = 4;
                            }
                        }
                    } else {
                        this.f1024g = false;
                        if (this.e == 0) {
                            Object obj = this.nextParkedWorker;
                            u uVar = b.f1027k;
                            if (obj != uVar) {
                                i.set(this, -1);
                                while (this.nextParkedWorker != b.f1027k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f1025h;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.j;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f1021c != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f1022d == 0) {
                                                this.f1022d = System.nanoTime() + this.f1025h.f1030c;
                                            }
                                            LockSupport.parkNanos(this.f1025h.f1030c);
                                            if (System.nanoTime() - this.f1022d >= 0) {
                                                this.f1022d = 0L;
                                                b bVar4 = this.f1025h;
                                                synchronized (bVar4.f1033g) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.i;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f1028a) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f1033g.b(andDecrement);
                                                                        D1.i.b(b2);
                                                                        a aVar = (a) b2;
                                                                        bVar4.f1033g.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.c(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f1033g.c(andDecrement, null);
                                                                    this.f1021c = 5;
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
                                b bVar5 = this.f1025h;
                                bVar5.getClass();
                                if (this.nextParkedWorker == uVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f1026h;
                                        j = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f1033g.b((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j, ((j + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.e);
                                this.e = 0L;
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
