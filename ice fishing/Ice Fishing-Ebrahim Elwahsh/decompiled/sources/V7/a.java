package V7;

import T7.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3325B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ c f3326A;
    private volatile int indexInArray;

    /* renamed from: n, reason: collision with root package name */
    public final m f3327n;
    private volatile Object nextParkedWorker;

    /* renamed from: u, reason: collision with root package name */
    public final r f3328u;

    /* renamed from: v, reason: collision with root package name */
    public b f3329v;

    /* renamed from: w, reason: collision with root package name */
    public long f3330w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: x, reason: collision with root package name */
    public long f3331x;

    /* renamed from: y, reason: collision with root package name */
    public int f3332y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3333z;

    public a(c cVar, int i) {
        this.f3326A = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f3327n = new m();
        this.f3328u = new r();
        this.f3329v = b.f3337w;
        this.nextParkedWorker = c.f3343D;
        H7.d dVar = H7.e.f1218n;
        this.f3332y = H7.e.f1219u.a().nextInt();
        f(i);
    }

    public final i a(boolean z8) {
        i e6;
        i e9;
        c cVar;
        long j9;
        b bVar = this.f3329v;
        b bVar2 = b.f3334n;
        i iVar = null;
        m mVar = this.f3327n;
        c cVar2 = this.f3326A;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3341B;
            do {
                cVar = this.f3326A;
                j9 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j9) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3368b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f3357u.f1421u == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f3370d.get(mVar);
                    int i4 = m.f3369c.get(mVar);
                    while (true) {
                        if (i == i4 || m.f3371e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i c4 = mVar.c(i4, true);
                        if (c4 != null) {
                            iVar = c4;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f3349y.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f3341B.compareAndSet(cVar, j9, j9 - 4398046511104L));
            this.f3329v = b.f3334n;
        }
        if (z8) {
            boolean z9 = d(cVar2.f3344n * 2) == 0;
            if (z9 && (e9 = e()) != null) {
                return e9;
            }
            mVar.getClass();
            i iVar4 = (i) m.f3368b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z9 && (e6 = e()) != null) {
                return e6;
            }
        } else {
            i e10 = e();
            if (e10 != null) {
                return e10;
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
        int i4 = this.f3332y;
        int i9 = i4 ^ (i4 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f3332y = i11;
        int i12 = i - 1;
        return (i12 & i) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d2 = d(2);
        c cVar = this.f3326A;
        if (d2 == 0) {
            i iVar = (i) cVar.f3348x.d();
            return iVar != null ? iVar : (i) cVar.f3349y.d();
        }
        i iVar2 = (i) cVar.f3349y.d();
        return iVar2 != null ? iVar2 : (i) cVar.f3348x.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3326A.f3347w);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f3329v;
        boolean z8 = bVar2 == b.f3334n;
        if (z8) {
            c.f3341B.addAndGet(this.f3326A, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3329v = bVar;
        }
        return z8;
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
        long j9;
        i iVar;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3341B;
        c cVar = this.f3326A;
        int i9 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i9 < 2) {
            return null;
        }
        int d2 = d(i9);
        int i10 = 0;
        long j12 = Long.MAX_VALUE;
        while (i10 < i9) {
            int i11 = d2 + 1;
            if (i11 > i9) {
                i11 = 1;
            }
            a aVar = (a) cVar.f3350z.b(i11);
            if (aVar == null || aVar == this) {
                i4 = i11;
            } else {
                m mVar = aVar.f3327n;
                if (i == 3) {
                    iVar = mVar.b();
                    j9 = 0;
                } else {
                    mVar.getClass();
                    int i12 = m.f3370d.get(mVar);
                    int i13 = m.f3369c.get(mVar);
                    boolean z8 = i == 1;
                    while (true) {
                        if (i12 == i13) {
                            j9 = 0;
                            break;
                        }
                        j9 = 0;
                        if (!z8 || m.f3371e.get(mVar) != 0) {
                            int i14 = i12 + 1;
                            iVar = mVar.c(i12, z8);
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
                r rVar = this.f3328u;
                if (iVar != null) {
                    rVar.f38861n = iVar;
                    i4 = i11;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3368b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (((iVar3.f3357u.f1421u == 1 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f3364f.getClass();
                        i4 = i11;
                        long nanoTime = System.nanoTime() - iVar3.f3356n;
                        long j13 = k.f3360b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                rVar.f38861n = iVar3;
                                j11 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i11 = i4;
                        iVar2 = null;
                    }
                }
                if (j11 == j10) {
                    i iVar4 = (i) rVar.f38861n;
                    rVar.f38861n = iVar2;
                    return iVar4;
                }
                if (j11 > j9) {
                    j12 = Math.min(j12, j11);
                }
            }
            i10++;
            d2 = i4;
            iVar2 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.f3331x = j12;
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
        long j9;
        long j10;
        int i;
        long j11;
        loop0: while (true) {
            boolean z8 = false;
            while (true) {
                c cVar = this.f3326A;
                cVar.getClass();
                if (c.f3342C.get(cVar) == 0) {
                    b bVar = this.f3329v;
                    b bVar2 = b.f3338x;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a9 = a(this.f3333z);
                    if (a9 != null) {
                        this.f3331x = 0L;
                        int i4 = a9.f3357u.f1421u;
                        this.f3330w = 0L;
                        if (this.f3329v == b.f3336v) {
                            this.f3329v = b.f3335u;
                        }
                        c cVar2 = this.f3326A;
                        if (i4 != 0 && h(b.f3335u) && !cVar2.z() && !cVar2.k(c.f3341B.get(cVar2))) {
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
                            c.f3341B.addAndGet(cVar2, -2097152L);
                            if (this.f3329v != bVar2) {
                                this.f3329v = b.f3337w;
                            }
                        }
                    } else {
                        this.f3333z = false;
                        if (this.f3331x == 0) {
                            Object obj = this.nextParkedWorker;
                            v vVar = c.f3343D;
                            long j12 = 2097151;
                            if (obj != vVar) {
                                f3325B.set(this, -1);
                                while (this.nextParkedWorker != c.f3343D) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3325B;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar3 = this.f3326A;
                                        cVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f3342C;
                                        if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
                                            break;
                                        }
                                        b bVar3 = this.f3329v;
                                        b bVar4 = b.f3338x;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        h(b.f3336v);
                                        Thread.interrupted();
                                        if (this.f3330w == 0) {
                                            j11 = j12;
                                            this.f3330w = System.nanoTime() + this.f3326A.f3346v;
                                        } else {
                                            j11 = j12;
                                        }
                                        LockSupport.parkNanos(this.f3326A.f3346v);
                                        if (System.nanoTime() - this.f3330w >= 0) {
                                            this.f3330w = 0L;
                                            c cVar4 = this.f3326A;
                                            synchronized (cVar4.f3350z) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f3341B;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar4) & j11)) > cVar4.f3344n) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i9 = this.indexInArray;
                                                                f(0);
                                                                cVar4.j(this, i9, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar4) & j11);
                                                                if (andDecrement != i9) {
                                                                    Object b9 = cVar4.f3350z.b(andDecrement);
                                                                    kotlin.jvm.internal.h.b(b9);
                                                                    a aVar = (a) b9;
                                                                    cVar4.f3350z.c(i9, aVar);
                                                                    aVar.f(i9);
                                                                    cVar4.j(aVar, andDecrement, i9);
                                                                }
                                                                cVar4.f3350z.c(andDecrement, null);
                                                                this.f3329v = bVar4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        j12 = j11;
                                    }
                                }
                            } else {
                                c cVar5 = this.f3326A;
                                cVar5.getClass();
                                if (this.nextParkedWorker == vVar) {
                                    do {
                                        atomicLongFieldUpdater = c.f3340A;
                                        j9 = atomicLongFieldUpdater.get(cVar5);
                                        j10 = (com.anythink.basead.exoplayer.j.a.c.f8189a + j9) & (-2097152);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f3350z.b((int) (j9 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar5, j9, j10 | i));
                                }
                            }
                        } else {
                            if (z8) {
                                h(b.f3336v);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3331x);
                                this.f3331x = 0L;
                                break;
                            }
                            z8 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f3338x);
    }
}
