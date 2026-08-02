package Z7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4159B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ c f4160A;
    private volatile int indexInArray;

    /* renamed from: n, reason: collision with root package name */
    public final m f4161n;
    private volatile Object nextParkedWorker;

    /* renamed from: u, reason: collision with root package name */
    public final r f4162u;

    /* renamed from: v, reason: collision with root package name */
    public b f4163v;

    /* renamed from: w, reason: collision with root package name */
    public long f4164w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public long f4165x;

    /* renamed from: y, reason: collision with root package name */
    public int f4166y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4167z;

    public a(c cVar, int i) {
        this.f4160A = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f4161n = new m();
        this.f4162u = new r();
        this.f4163v = b.f4171w;
        this.nextParkedWorker = c.f4177D;
        L7.d dVar = L7.e.f1789n;
        this.f4166y = L7.e.f1790u.a().nextInt();
        f(i);
    }

    public final i a(boolean z6) {
        i e9;
        i e10;
        c cVar;
        long j6;
        b bVar = this.f4163v;
        b bVar2 = b.f4168n;
        i iVar = null;
        m mVar = this.f4161n;
        c cVar2 = this.f4160A;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4175B;
            do {
                cVar = this.f4160A;
                j6 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4202b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f4191u.f2062u == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f4204d.get(mVar);
                    int i4 = m.f4203c.get(mVar);
                    while (true) {
                        if (i == i4 || m.f4205e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i c9 = mVar.c(i4, true);
                        if (c9 != null) {
                            iVar = c9;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f4183y.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f4175B.compareAndSet(cVar, j6, j6 - 4398046511104L));
            this.f4163v = b.f4168n;
        }
        if (z6) {
            boolean z9 = d(cVar2.f4178n * 2) == 0;
            if (z9 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f4202b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z9 && (e9 = e()) != null) {
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
        int i4 = this.f4166y;
        int i6 = i4 ^ (i4 << 13);
        int i9 = i6 ^ (i6 >> 17);
        int i10 = i9 ^ (i9 << 5);
        this.f4166y = i10;
        int i11 = i - 1;
        return (i11 & i) == 0 ? i10 & i11 : (i10 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d9 = d(2);
        c cVar = this.f4160A;
        if (d9 == 0) {
            i iVar = (i) cVar.f4182x.d();
            return iVar != null ? iVar : (i) cVar.f4183y.d();
        }
        i iVar2 = (i) cVar.f4183y.d();
        return iVar2 != null ? iVar2 : (i) cVar.f4182x.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4160A.f4181w);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f4163v;
        boolean z6 = bVar2 == b.f4168n;
        if (z6) {
            c.f4175B.addAndGet(this.f4160A, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f4163v = bVar;
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i i(int i) {
        int i4;
        long j6;
        i iVar;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4175B;
        c cVar = this.f4160A;
        int i6 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i6 < 2) {
            return null;
        }
        int d9 = d(i6);
        int i9 = 0;
        long j11 = Long.MAX_VALUE;
        while (i9 < i6) {
            int i10 = d9 + 1;
            if (i10 > i6) {
                i10 = 1;
            }
            a aVar = (a) cVar.f4184z.b(i10);
            if (aVar == null || aVar == this) {
                i4 = i10;
            } else {
                m mVar = aVar.f4161n;
                if (i == 3) {
                    iVar = mVar.b();
                    j6 = 0;
                } else {
                    mVar.getClass();
                    int i11 = m.f4204d.get(mVar);
                    int i12 = m.f4203c.get(mVar);
                    boolean z6 = i == 1;
                    while (true) {
                        if (i11 == i12) {
                            j6 = 0;
                            break;
                        }
                        j6 = 0;
                        if (!z6 || m.f4205e.get(mVar) != 0) {
                            int i13 = i11 + 1;
                            iVar = mVar.c(i11, z6);
                            if (iVar != null) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar2;
                }
                r rVar = this.f4162u;
                if (iVar != null) {
                    rVar.f38644n = iVar;
                    i4 = i10;
                    j10 = -1;
                    j9 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4202b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j9 = -1;
                            break;
                        }
                        j9 = -1;
                        if (((iVar3.f4191u.f2062u == 1 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f4198f.getClass();
                        i4 = i10;
                        long nanoTime = System.nanoTime() - iVar3.f4190n;
                        long j12 = k.f4194b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                rVar.f38644n = iVar3;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i10 = i4;
                        iVar2 = null;
                    }
                }
                if (j10 == j9) {
                    i iVar4 = (i) rVar.f38644n;
                    rVar.f38644n = iVar2;
                    return iVar4;
                }
                if (j10 > j6) {
                    j11 = Math.min(j11, j10);
                }
            }
            i9++;
            d9 = i4;
            iVar2 = null;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = 0;
        }
        this.f4165x = j11;
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
            boolean z6 = false;
            while (true) {
                c cVar = this.f4160A;
                cVar.getClass();
                if (c.f4176C.get(cVar) == 0) {
                    b bVar = this.f4163v;
                    b bVar2 = b.f4172x;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a9 = a(this.f4167z);
                    if (a9 != null) {
                        this.f4165x = 0L;
                        int i4 = a9.f4191u.f2062u;
                        this.f4164w = 0L;
                        if (this.f4163v == b.f4170v) {
                            this.f4163v = b.f4169u;
                        }
                        c cVar2 = this.f4160A;
                        if (i4 != 0 && h(b.f4169u) && !cVar2.z() && !cVar2.l(c.f4175B.get(cVar2))) {
                            cVar2.z();
                        }
                        cVar2.getClass();
                        try {
                            a9.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i4 != 0) {
                            c.f4175B.addAndGet(cVar2, -2097152L);
                            if (this.f4163v != bVar2) {
                                this.f4163v = b.f4171w;
                            }
                        }
                    } else {
                        this.f4167z = false;
                        if (this.f4165x == 0) {
                            Object obj = this.nextParkedWorker;
                            C0316m c0316m = c.f4177D;
                            long j11 = 2097151;
                            if (obj != c0316m) {
                                f4159B.set(this, -1);
                                while (this.nextParkedWorker != c.f4177D) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4159B;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar3 = this.f4160A;
                                        cVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f4176C;
                                        if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
                                            break;
                                        }
                                        b bVar3 = this.f4163v;
                                        b bVar4 = b.f4172x;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        h(b.f4170v);
                                        Thread.interrupted();
                                        if (this.f4164w == 0) {
                                            j10 = j11;
                                            this.f4164w = System.nanoTime() + this.f4160A.f4180v;
                                        } else {
                                            j10 = j11;
                                        }
                                        LockSupport.parkNanos(this.f4160A.f4180v);
                                        if (System.nanoTime() - this.f4164w >= 0) {
                                            this.f4164w = 0L;
                                            c cVar4 = this.f4160A;
                                            synchronized (cVar4.f4184z) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f4175B;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar4) & j10)) > cVar4.f4178n) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i6 = this.indexInArray;
                                                                f(0);
                                                                cVar4.k(this, i6, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar4) & j10);
                                                                if (andDecrement != i6) {
                                                                    Object b9 = cVar4.f4184z.b(andDecrement);
                                                                    kotlin.jvm.internal.h.b(b9);
                                                                    a aVar = (a) b9;
                                                                    cVar4.f4184z.c(i6, aVar);
                                                                    aVar.f(i6);
                                                                    cVar4.k(aVar, andDecrement, i6);
                                                                }
                                                                cVar4.f4184z.c(andDecrement, null);
                                                                this.f4163v = bVar4;
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
                                c cVar5 = this.f4160A;
                                cVar5.getClass();
                                if (this.nextParkedWorker == c0316m) {
                                    do {
                                        atomicLongFieldUpdater = c.f4174A;
                                        j6 = atomicLongFieldUpdater.get(cVar5);
                                        j9 = (com.anythink.basead.exoplayer.j.a.c.f8818a + j6) & (-2097152);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f4184z.b((int) (j6 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar5, j6, j9 | i));
                                }
                            }
                        } else {
                            if (z6) {
                                h(b.f4170v);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f4165x);
                                this.f4165x = 0L;
                                break;
                            }
                            z6 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f4172x);
    }
}
