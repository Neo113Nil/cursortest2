package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class q9 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater eVhOlqcC = AtomicIntegerFieldUpdater.newUpdater(q9.class, "workerCtl$volatile");
    public static final /* synthetic */ long k3x7lurq = b1.qoPGr6Ce.objectFieldOffset(q9.class.getDeclaredField("workerCtl$volatile"));
    public final l20 MdtA4re8;
    public final bj0 NCTxEWno;
    public long P7K7Inc8;
    public boolean Qr9iLBAD;
    public long VgvYg0wo;
    public int b2ZJblxo;
    private volatile int indexInArray;
    public final /* synthetic */ s9 jb9XjC4I;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;
    public r9 wxUZMvaN;

    public q9(s9 s9Var, int i) {
        this.jb9XjC4I = s9Var;
        setDaemon(true);
        setContextClassLoader(s9.class.getClassLoader());
        this.NCTxEWno = new bj0();
        this.MdtA4re8 = new l20();
        this.wxUZMvaN = r9.VgvYg0wo;
        this.nextParkedWorker = s9.ow5vqvCr;
        int nanoTime = (int) System.nanoTime();
        this.b2ZJblxo = nanoTime == 0 ? 42 : nanoTime;
        P7K7Inc8(i);
    }

    public final Object MdtA4re8() {
        return this.nextParkedWorker;
    }

    public final int NCTxEWno() {
        return this.indexInArray;
    }

    public final void P7K7Inc8(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.jb9XjC4I.VgvYg0wo);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final boolean Qr9iLBAD(r9 r9Var) {
        r9 r9Var2 = this.wxUZMvaN;
        boolean z = r9Var2 == r9.NCTxEWno;
        if (z) {
            s9.eVhOlqcC.addAndGet(this.jb9XjC4I, 4398046511104L);
        }
        if (r9Var2 != r9Var) {
            this.wxUZMvaN = r9Var;
        }
        return z;
    }

    public final ob0 VgvYg0wo() {
        int wxUZMvaN = wxUZMvaN(2);
        s9 s9Var = this.jb9XjC4I;
        xl xlVar = s9Var.b2ZJblxo;
        xl xlVar2 = s9Var.P7K7Inc8;
        if (wxUZMvaN == 0) {
            ob0 ob0Var = (ob0) xlVar2.wxUZMvaN();
            return ob0Var != null ? ob0Var : (ob0) xlVar.wxUZMvaN();
        }
        ob0 ob0Var2 = (ob0) xlVar.wxUZMvaN();
        return ob0Var2 != null ? ob0Var2 : (ob0) xlVar2.wxUZMvaN();
    }

    public final void b2ZJblxo(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
    
        r1 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ob0 jb9XjC4I(int i) {
        int i2;
        long j;
        ob0 ob0Var;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = s9.eVhOlqcC;
        s9 s9Var = this.jb9XjC4I;
        int i4 = (int) (atomicLongFieldUpdater.get(s9Var) & 2097151);
        ob0 ob0Var2 = null;
        if (i4 < 2) {
            return null;
        }
        int wxUZMvaN = wxUZMvaN(i4);
        int i5 = 0;
        long j4 = Long.MAX_VALUE;
        while (i5 < i4) {
            wxUZMvaN++;
            if (wxUZMvaN > i4) {
                wxUZMvaN = 1;
            }
            q9 q9Var = (q9) s9Var.Qr9iLBAD.NCTxEWno(wxUZMvaN);
            if (q9Var == null || q9Var == this) {
                i2 = i4;
            } else {
                bj0 bj0Var = q9Var.NCTxEWno;
                if (i3 == 3) {
                    ob0Var = bj0Var.MdtA4re8();
                    i2 = i4;
                    j = 0;
                } else {
                    bj0Var.getClass();
                    Unsafe unsafe2 = b1.qoPGr6Ce;
                    int intVolatile = unsafe2.getIntVolatile(bj0Var, bj0.VgvYg0wo);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(bj0Var, bj0.b2ZJblxo);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (b1.qoPGr6Ce.getIntVolatile(bj0Var, bj0.wxUZMvaN) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        ob0 wxUZMvaN2 = bj0Var.wxUZMvaN(intVolatile, z);
                        if (wxUZMvaN2 != null) {
                            ob0Var = wxUZMvaN2;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                    ob0Var = ob0Var2;
                }
                l20 l20Var = this.MdtA4re8;
                if (ob0Var == null) {
                    j2 = -1;
                    long j5 = bj0.P7K7Inc8;
                    while (true) {
                        ob0 ob0Var3 = (ob0) b1.qoPGr6Ce.getObjectVolatile(bj0Var, j5);
                        if (ob0Var3 == null) {
                            break;
                        }
                        if (((ob0Var3.MdtA4re8 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        rb0.P7K7Inc8.getClass();
                        bj0 bj0Var2 = bj0Var;
                        long nanoTime = System.nanoTime() - ob0Var3.NCTxEWno;
                        long j6 = rb0.NCTxEWno;
                        if (nanoTime < j6) {
                            j3 = j6 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = b1.qoPGr6Ce;
                            if (unsafe.compareAndSwapObject(bj0Var2, bj0.P7K7Inc8, ob0Var3, (Object) null)) {
                                l20Var.NCTxEWno = ob0Var3;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(bj0Var2, j5) == ob0Var3);
                        bj0Var = bj0Var2;
                    }
                } else {
                    l20Var.NCTxEWno = ob0Var;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    ob0 ob0Var4 = (ob0) l20Var.NCTxEWno;
                    l20Var.NCTxEWno = null;
                    return ob0Var4;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            ob0Var2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.P7K7Inc8 = j4;
        return null;
    }

    public final ob0 qoPGr6Ce(boolean z) {
        ob0 VgvYg0wo;
        ob0 VgvYg0wo2;
        long j;
        Unsafe unsafe;
        Unsafe unsafe2;
        r9 r9Var = this.wxUZMvaN;
        s9 s9Var = this.jb9XjC4I;
        ob0 ob0Var = null;
        bj0 bj0Var = this.NCTxEWno;
        r9 r9Var2 = r9.NCTxEWno;
        if (r9Var != r9Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s9.eVhOlqcC;
            do {
                j = atomicLongFieldUpdater.get(s9Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    bj0Var.getClass();
                    long j2 = bj0.P7K7Inc8;
                    loop1: while (true) {
                        unsafe = b1.qoPGr6Ce;
                        ob0 ob0Var2 = (ob0) unsafe.getObjectVolatile(bj0Var, j2);
                        if (ob0Var2 != null && ob0Var2.MdtA4re8) {
                            do {
                                unsafe2 = b1.qoPGr6Ce;
                                if (unsafe2.compareAndSwapObject(bj0Var, bj0.P7K7Inc8, ob0Var2, (Object) null)) {
                                    ob0Var = ob0Var2;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(bj0Var, j2) == ob0Var2);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(bj0Var, bj0.VgvYg0wo);
                    int intVolatile2 = unsafe.getIntVolatile(bj0Var, bj0.b2ZJblxo);
                    while (true) {
                        if (intVolatile == intVolatile2 || b1.qoPGr6Ce.getIntVolatile(bj0Var, bj0.wxUZMvaN) == 0) {
                            break;
                        }
                        intVolatile2--;
                        ob0 wxUZMvaN = bj0Var.wxUZMvaN(intVolatile2, true);
                        if (wxUZMvaN != null) {
                            ob0Var = wxUZMvaN;
                            break;
                        }
                    }
                    if (ob0Var != null) {
                        return ob0Var;
                    }
                    ob0 ob0Var3 = (ob0) s9Var.b2ZJblxo.wxUZMvaN();
                    return ob0Var3 == null ? jb9XjC4I(1) : ob0Var3;
                }
            } while (!s9.eVhOlqcC.compareAndSet(s9Var, j, j - 4398046511104L));
            this.wxUZMvaN = r9Var2;
        }
        if (z) {
            boolean z2 = wxUZMvaN(s9Var.NCTxEWno * 2) == 0;
            if (z2 && (VgvYg0wo2 = VgvYg0wo()) != null) {
                return VgvYg0wo2;
            }
            bj0Var.getClass();
            ob0 ob0Var4 = (ob0) b1.qoPGr6Ce.getAndSetObject(bj0Var, bj0.P7K7Inc8, (Object) null);
            if (ob0Var4 == null) {
                ob0Var4 = bj0Var.MdtA4re8();
            }
            if (ob0Var4 != null) {
                return ob0Var4;
            }
            if (!z2 && (VgvYg0wo = VgvYg0wo()) != null) {
                return VgvYg0wo;
            }
        } else {
            ob0 VgvYg0wo3 = VgvYg0wo();
            if (VgvYg0wo3 != null) {
                return VgvYg0wo3;
            }
        }
        return jb9XjC4I(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r9 r9Var;
        loop0: while (true) {
            boolean z = false;
            while (s9.k3x7lurq.get(this.jb9XjC4I) == 0) {
                r9 r9Var2 = this.wxUZMvaN;
                r9 r9Var3 = r9.P7K7Inc8;
                if (r9Var2 == r9Var3) {
                    break loop0;
                }
                ob0 qoPGr6Ce = qoPGr6Ce(this.Qr9iLBAD);
                if (qoPGr6Ce != null) {
                    this.P7K7Inc8 = 0L;
                    s9 s9Var = this.jb9XjC4I;
                    this.VgvYg0wo = 0L;
                    if (this.wxUZMvaN == r9.wxUZMvaN) {
                        this.wxUZMvaN = r9.MdtA4re8;
                    }
                    if (qoPGr6Ce.MdtA4re8) {
                        if (Qr9iLBAD(r9.MdtA4re8) && !s9Var.lDXGDhIF() && !s9Var.OnDfzHZD(s9.eVhOlqcC.get(s9Var))) {
                            s9Var.lDXGDhIF();
                        }
                        try {
                            qoPGr6Ce.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        s9.eVhOlqcC.addAndGet(s9Var, -2097152L);
                        if (this.wxUZMvaN != r9Var3) {
                            this.wxUZMvaN = r9.VgvYg0wo;
                        }
                    } else {
                        try {
                            qoPGr6Ce.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.Qr9iLBAD = false;
                    if (this.P7K7Inc8 == 0) {
                        Object obj = this.nextParkedWorker;
                        lf lfVar = s9.ow5vqvCr;
                        if (obj != lfVar) {
                            int i = -1;
                            b1.qoPGr6Ce.putIntVolatile(this, k3x7lurq, -1);
                            while (this.nextParkedWorker != s9.ow5vqvCr) {
                                Unsafe unsafe = b1.qoPGr6Ce;
                                long j = k3x7lurq;
                                if (unsafe.getIntVolatile(this, j) == i) {
                                    s9 s9Var2 = this.jb9XjC4I;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s9.k3x7lurq;
                                    if (atomicIntegerFieldUpdater.get(s9Var2) != 0) {
                                        break;
                                    }
                                    r9 r9Var4 = this.wxUZMvaN;
                                    r9 r9Var5 = r9.P7K7Inc8;
                                    if (r9Var4 == r9Var5) {
                                        break;
                                    }
                                    Qr9iLBAD(r9.wxUZMvaN);
                                    Thread.interrupted();
                                    if (this.VgvYg0wo == 0) {
                                        r9Var = r9Var5;
                                        this.VgvYg0wo = System.nanoTime() + this.jb9XjC4I.wxUZMvaN;
                                    } else {
                                        r9Var = r9Var5;
                                    }
                                    LockSupport.parkNanos(this.jb9XjC4I.wxUZMvaN);
                                    if (System.nanoTime() - this.VgvYg0wo >= 0) {
                                        this.VgvYg0wo = 0L;
                                        s9 s9Var3 = this.jb9XjC4I;
                                        synchronized (s9Var3.Qr9iLBAD) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater.get(s9Var3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = s9.eVhOlqcC;
                                                    if (((int) (atomicLongFieldUpdater.get(s9Var3) & 2097151)) > s9Var3.NCTxEWno) {
                                                        if (unsafe.compareAndSwapInt(this, j, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            P7K7Inc8(0);
                                                            s9Var3.eVhOlqcC(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(s9Var3) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Object NCTxEWno = s9Var3.Qr9iLBAD.NCTxEWno(andDecrement);
                                                                NCTxEWno.getClass();
                                                                q9 q9Var = (q9) NCTxEWno;
                                                                s9Var3.Qr9iLBAD.MdtA4re8(i2, q9Var);
                                                                q9Var.P7K7Inc8(i2);
                                                                s9Var3.eVhOlqcC(q9Var, andDecrement, i2);
                                                            }
                                                            s9Var3.Qr9iLBAD.MdtA4re8(andDecrement, null);
                                                            this.wxUZMvaN = r9Var;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    i = -1;
                                }
                            }
                        } else {
                            s9 s9Var4 = this.jb9XjC4I;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = s9.jb9XjC4I;
                            if (this.nextParkedWorker == lfVar) {
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(s9Var4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = s9Var4.Qr9iLBAD.NCTxEWno((int) (j2 & 2097151));
                                    s9 s9Var5 = s9Var4;
                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                    if (atomicLongFieldUpdater3.compareAndSet(s9Var5, j2, ((j2 + 2097152) & (-2097152)) | i3)) {
                                        break;
                                    }
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    s9Var4 = s9Var5;
                                }
                            }
                        }
                    } else if (z) {
                        Qr9iLBAD(r9.wxUZMvaN);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.P7K7Inc8);
                        this.P7K7Inc8 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        Qr9iLBAD(r9.P7K7Inc8);
    }

    public final int wxUZMvaN(int i) {
        int i2 = this.b2ZJblxo;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.b2ZJblxo = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }
}
