package com.gamericefishpro.space.wi;

import com.gamericefishpro.space.ei.a0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final /* synthetic */ c A;
    public final m d;
    public final a0 e;
    public b i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public long v;
    public long w;
    private volatile /* synthetic */ int workerCtl$volatile;
    public int y;
    public boolean z;

    public a(c cVar, int i) {
        this.A = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.d = new m();
        this.e = new a0();
        this.i = b.v;
        this.nextParkedWorker = c.D;
        int iNanoTime = (int) System.nanoTime();
        this.y = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final i a(boolean z) {
        i iVarE;
        i iVarE2;
        long j;
        b bVar = this.i;
        b bVar2 = b.d;
        c cVar = this.A;
        i iVar = null;
        m mVar = this.d;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.B;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.e) {
                            int i = m.d.get(mVar);
                            int i2 = m.c.get(mVar);
                            while (i != i2 && m.e.get(mVar) != 0) {
                                i2--;
                                i iVarC = mVar.c(i2, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.y.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.B.compareAndSet(cVar, j, j - 4398046511104L));
            this.i = b.d;
        }
        if (z) {
            boolean z2 = d(cVar.d * 2) == 0;
            if (z2 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z2 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
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
        int i2 = this.y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.y = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.A;
        if (iD == 0) {
            i iVar = (i) cVar.w.d();
            return iVar != null ? iVar : (i) cVar.y.d();
        }
        i iVar2 = (i) cVar.y.d();
        return iVar2 != null ? iVar2 : (i) cVar.w.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A.v);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.i;
        boolean z = bVar2 == b.d;
        if (z) {
            c.B.addAndGet(this.A, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.i = bVar;
        }
        return z;
    }

    public final i i(int i) {
        long j;
        i iVarC;
        long j2;
        long j3;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.B;
        c cVar = this.A;
        int i2 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            a aVar = (a) cVar.z.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.d;
                if (i != 3) {
                    mVar.getClass();
                    int i4 = m.d.get(mVar);
                    int i5 = m.c.get(mVar);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || m.e.get(mVar) != 0) {
                                int i6 = i4 + 1;
                                iVarC = mVar.c(i4, z);
                                if (iVarC != null) {
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        iVarC = iVar2;
                        break;
                    }
                } else {
                    iVarC = mVar.b();
                    j = 0;
                }
                a0 a0Var = this.e;
                if (iVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((iVar3.e ? 1 : 2) & i) != 0) {
                                k.f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.d;
                                long j4 = k.b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        a0Var.d = iVar3;
                                        j3 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j3 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    a0Var.d = iVarC;
                    iVar = iVar2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    i iVar4 = (i) a0Var.d;
                    a0Var.d = iVar;
                    return iVar4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.w = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (c.C.get(this.A) != 1) {
                    b bVar = this.i;
                    b bVar2 = b.w;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.z);
                    if (iVarA != null) {
                        this.w = 0L;
                        c cVar = this.A;
                        this.v = 0L;
                        if (this.i == b.i) {
                            this.i = b.e;
                        }
                        if (!iVarA.e) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.e) && !cVar.o() && !cVar.n(c.B.get(cVar))) {
                            cVar.o();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.B.addAndGet(cVar, -2097152L);
                        if (this.i == bVar2) {
                            break;
                        }
                        this.i = b.v;
                        break;
                    }
                    this.z = false;
                    if (this.w == 0) {
                        Object obj = this.nextParkedWorker;
                        com.gamericefishpro.space.d6.a aVar = c.D;
                        if (obj != aVar) {
                            B.set(this, -1);
                            while (this.nextParkedWorker != c.D) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.A;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.C;
                                if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                    break;
                                }
                                b bVar3 = this.i;
                                b bVar4 = b.w;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.i);
                                Thread.interrupted();
                                if (this.v == 0) {
                                    j = 2097151;
                                    this.v = System.nanoTime() + this.A.i;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.A.i);
                                if (System.nanoTime() - this.v >= 0) {
                                    this.v = 0L;
                                    c cVar3 = this.A;
                                    synchronized (cVar3.z) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.B;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.d) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        cVar3.l(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = cVar3.z.b(andDecrement);
                                                            Intrinsics.b(objB);
                                                            a aVar2 = (a) objB;
                                                            cVar3.z.c(i, aVar2);
                                                            aVar2.f(i);
                                                            cVar3.l(aVar2, andDecrement, i);
                                                        }
                                                        cVar3.z.c(andDecrement, null);
                                                        Unit unit = Unit.a;
                                                        this.i = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.A;
                            if (this.nextParkedWorker == aVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.A;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(cVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.z.b((int) (j2 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.A.compareAndSet(cVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(b.i);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.w);
                            this.w = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.w);
    }
}
