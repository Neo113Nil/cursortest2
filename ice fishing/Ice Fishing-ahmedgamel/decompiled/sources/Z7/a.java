package Z7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4181B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ c f4182A;
    private volatile int indexInArray;

    /* renamed from: n, reason: collision with root package name */
    public final m f4183n;
    private volatile Object nextParkedWorker;

    /* renamed from: u, reason: collision with root package name */
    public final r f4184u;

    /* renamed from: v, reason: collision with root package name */
    public b f4185v;

    /* renamed from: w, reason: collision with root package name */
    public long f4186w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public long f4187x;

    /* renamed from: y, reason: collision with root package name */
    public int f4188y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4189z;

    public a(c cVar, int i) {
        this.f4182A = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f4183n = new m();
        this.f4184u = new r();
        this.f4185v = b.f4193w;
        this.nextParkedWorker = c.f4199D;
        L7.d dVar = L7.e.f1758n;
        this.f4188y = L7.e.f1759u.a().nextInt();
        f(i);
    }

    public final i a(boolean z3) {
        i e9;
        i e10;
        c cVar;
        long j6;
        b bVar = this.f4185v;
        b bVar2 = b.f4190n;
        i iVar = null;
        m mVar = this.f4183n;
        c cVar2 = this.f4182A;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4197B;
            do {
                cVar = this.f4182A;
                j6 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4224b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f4213u.f1974u == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f4226d.get(mVar);
                    int i6 = m.f4225c.get(mVar);
                    while (true) {
                        if (i == i6 || m.f4227e.get(mVar) == 0) {
                            break;
                        }
                        i6--;
                        i c9 = mVar.c(i6, true);
                        if (c9 != null) {
                            iVar = c9;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f4205y.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f4197B.compareAndSet(cVar, j6, j6 - 4398046511104L));
            this.f4185v = b.f4190n;
        }
        if (z3) {
            boolean z6 = d(cVar2.f4200n * 2) == 0;
            if (z6 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f4224b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z6 && (e9 = e()) != null) {
                return e9;
            }
        } else {
            i e11 = e();
            if (e11 != null) {
                return e11;
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
        int i6 = this.f4188y;
        int i9 = i6 ^ (i6 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f4188y = i11;
        int i12 = i - 1;
        return (i12 & i) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d2 = d(2);
        c cVar = this.f4182A;
        if (d2 == 0) {
            i iVar = (i) cVar.f4204x.d();
            return iVar != null ? iVar : (i) cVar.f4205y.d();
        }
        i iVar2 = (i) cVar.f4205y.d();
        return iVar2 != null ? iVar2 : (i) cVar.f4204x.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4182A.f4203w);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f4185v;
        boolean z3 = bVar2 == b.f4190n;
        if (z3) {
            c.f4197B.addAndGet(this.f4182A, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f4185v = bVar;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i i(int i) {
        int i6;
        long j6;
        i iVar;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4197B;
        c cVar = this.f4182A;
        int i9 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i9 < 2) {
            return null;
        }
        int d2 = d(i9);
        int i10 = 0;
        long j11 = Long.MAX_VALUE;
        while (i10 < i9) {
            int i11 = d2 + 1;
            if (i11 > i9) {
                i11 = 1;
            }
            a aVar = (a) cVar.f4206z.b(i11);
            if (aVar == null || aVar == this) {
                i6 = i11;
            } else {
                m mVar = aVar.f4183n;
                if (i == 3) {
                    iVar = mVar.b();
                    j6 = 0;
                } else {
                    mVar.getClass();
                    int i12 = m.f4226d.get(mVar);
                    int i13 = m.f4225c.get(mVar);
                    boolean z3 = i == 1;
                    while (true) {
                        if (i12 == i13) {
                            j6 = 0;
                            break;
                        }
                        j6 = 0;
                        if (!z3 || m.f4227e.get(mVar) != 0) {
                            int i14 = i12 + 1;
                            iVar = mVar.c(i12, z3);
                            if (iVar != null) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar2;
                }
                r rVar = this.f4184u;
                if (iVar != null) {
                    rVar.f38717n = iVar;
                    i6 = i11;
                    j10 = -1;
                    j9 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4224b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j9 = -1;
                            break;
                        }
                        j9 = -1;
                        if (((iVar3.f4213u.f1974u == 1 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f4220f.getClass();
                        i6 = i11;
                        long nanoTime = System.nanoTime() - iVar3.f4212n;
                        long j12 = k.f4216b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                rVar.f38717n = iVar3;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i11 = i6;
                        iVar2 = null;
                    }
                }
                if (j10 == j9) {
                    i iVar4 = (i) rVar.f38717n;
                    rVar.f38717n = iVar2;
                    return iVar4;
                }
                if (j10 > j6) {
                    j11 = Math.min(j11, j10);
                }
            }
            i10++;
            d2 = i6;
            iVar2 = null;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = 0;
        }
        this.f4187x = j11;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j9;
        int i;
        long j10;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                c cVar = this.f4182A;
                cVar.getClass();
                if (c.f4198C.get(cVar) == 0) {
                    b bVar = this.f4185v;
                    b bVar2 = b.f4194x;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a9 = a(this.f4189z);
                    if (a9 != null) {
                        this.f4187x = 0L;
                        int i6 = a9.f4213u.f1974u;
                        this.f4186w = 0L;
                        if (this.f4185v == b.f4192v) {
                            this.f4185v = b.f4191u;
                        }
                        c cVar2 = this.f4182A;
                        if (i6 != 0 && h(b.f4191u) && !cVar2.z() && !cVar2.l(c.f4197B.get(cVar2))) {
                            cVar2.z();
                        }
                        cVar2.getClass();
                        try {
                            a9.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i6 != 0) {
                            c.f4197B.addAndGet(cVar2, -2097152L);
                            if (this.f4185v != bVar2) {
                                this.f4185v = b.f4193w;
                            }
                        }
                    } else {
                        this.f4189z = false;
                        if (this.f4187x == 0) {
                            Object obj = this.nextParkedWorker;
                            D2.b bVar3 = c.f4199D;
                            long j11 = 2097151;
                            if (obj != bVar3) {
                                f4181B.set(this, -1);
                                while (this.nextParkedWorker != c.f4199D) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4181B;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar3 = this.f4182A;
                                        cVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f4198C;
                                        if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
                                            break;
                                        }
                                        b bVar4 = this.f4185v;
                                        b bVar5 = b.f4194x;
                                        if (bVar4 == bVar5) {
                                            break;
                                        }
                                        h(b.f4192v);
                                        Thread.interrupted();
                                        if (this.f4186w == 0) {
                                            j10 = j11;
                                            this.f4186w = System.nanoTime() + this.f4182A.f4202v;
                                        } else {
                                            j10 = j11;
                                        }
                                        LockSupport.parkNanos(this.f4182A.f4202v);
                                        if (System.nanoTime() - this.f4186w >= 0) {
                                            this.f4186w = 0L;
                                            c cVar4 = this.f4182A;
                                            synchronized (cVar4.f4206z) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f4197B;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar4) & j10)) > cVar4.f4200n) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i9 = this.indexInArray;
                                                                f(0);
                                                                cVar4.k(this, i9, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar4) & j10);
                                                                if (andDecrement != i9) {
                                                                    Object b9 = cVar4.f4206z.b(andDecrement);
                                                                    kotlin.jvm.internal.h.b(b9);
                                                                    a aVar = (a) b9;
                                                                    cVar4.f4206z.c(i9, aVar);
                                                                    aVar.f(i9);
                                                                    cVar4.k(aVar, andDecrement, i9);
                                                                }
                                                                cVar4.f4206z.c(andDecrement, null);
                                                                this.f4185v = bVar5;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        j11 = j10;
                                    }
                                }
                            } else {
                                c cVar5 = this.f4182A;
                                cVar5.getClass();
                                if (this.nextParkedWorker == bVar3) {
                                    do {
                                        atomicLongFieldUpdater = c.f4196A;
                                        j6 = atomicLongFieldUpdater.get(cVar5);
                                        j9 = (com.anythink.basead.exoplayer.j.a.c.f8032a + j6) & (-2097152);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f4206z.b((int) (j6 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar5, j6, j9 | i));
                                }
                            }
                        } else {
                            if (z3) {
                                h(b.f4192v);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f4187x);
                                this.f4187x = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f4194x);
    }
}
