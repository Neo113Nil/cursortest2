package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s9 implements Executor, Closeable {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final xl P7K7Inc8;
    public final b30 Qr9iLBAD;
    public final String VgvYg0wo;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final xl b2ZJblxo;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final long wxUZMvaN;
    public static final /* synthetic */ AtomicLongFieldUpdater jb9XjC4I = AtomicLongFieldUpdater.newUpdater(s9.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater eVhOlqcC = AtomicLongFieldUpdater.newUpdater(s9.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater k3x7lurq = AtomicIntegerFieldUpdater.newUpdater(s9.class, "_isTerminated$volatile");
    public static final lf ow5vqvCr = new lf("NOT_IN_STACK", 1);

    public s9(int i, int i2, long j, String str) {
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
        this.wxUZMvaN = j;
        this.VgvYg0wo = str;
        if (i < 1) {
            m1.Qr9iLBAD("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            m1.NCTxEWno(q70.wxUZMvaN(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            m1.Qr9iLBAD("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            m1.jb9XjC4I("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.P7K7Inc8 = new xl();
        this.b2ZJblxo = new xl();
        this.Qr9iLBAD = new b30((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void Qr9iLBAD(s9 s9Var, Runnable runnable, int i) {
        s9Var.P7K7Inc8(runnable, false, (i & 4) == 0);
    }

    public final boolean OnDfzHZD(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.NCTxEWno;
        if (i < i2) {
            int VgvYg0wo = VgvYg0wo();
            if (VgvYg0wo == 1 && i2 > 1) {
                VgvYg0wo();
            }
            if (VgvYg0wo > 0) {
                return true;
            }
        }
        return false;
    }

    public final void P7K7Inc8(Runnable runnable, boolean z, boolean z2) {
        ob0 pb0Var;
        r9 r9Var;
        rb0.P7K7Inc8.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof ob0) {
            pb0Var = (ob0) runnable;
            pb0Var.NCTxEWno = nanoTime;
            pb0Var.MdtA4re8 = z;
        } else {
            pb0Var = new pb0(runnable, nanoTime, z);
        }
        boolean z3 = pb0Var.MdtA4re8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = eVhOlqcC;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        q9 q9Var = currentThread instanceof q9 ? (q9) currentThread : null;
        if (q9Var == null || q9Var.jb9XjC4I != this) {
            q9Var = null;
        }
        if (q9Var != null && (r9Var = q9Var.wxUZMvaN) != r9.P7K7Inc8 && (pb0Var.MdtA4re8 || r9Var != r9.MdtA4re8)) {
            q9Var.Qr9iLBAD = true;
            bj0 bj0Var = q9Var.NCTxEWno;
            if (z2) {
                pb0Var = bj0Var.qoPGr6Ce(pb0Var);
            } else {
                bj0Var.getClass();
                ob0 ob0Var = (ob0) b1.qoPGr6Ce.getAndSetObject(bj0Var, bj0.P7K7Inc8, pb0Var);
                pb0Var = ob0Var == null ? null : bj0Var.qoPGr6Ce(ob0Var);
            }
        }
        if (pb0Var != null) {
            if (!(pb0Var.MdtA4re8 ? this.b2ZJblxo.qoPGr6Ce(pb0Var) : this.P7K7Inc8.qoPGr6Ce(pb0Var))) {
                throw new RejectedExecutionException(this.VgvYg0wo + " was terminated");
            }
        }
        boolean z4 = z2 && q9Var != null;
        if (z3) {
            if (z4 || lDXGDhIF() || OnDfzHZD(addAndGet)) {
                return;
            }
            lDXGDhIF();
            return;
        }
        if (z4 || lDXGDhIF() || OnDfzHZD(atomicLongFieldUpdater.get(this))) {
            return;
        }
        lDXGDhIF();
    }

    public final int VgvYg0wo() {
        synchronized (this.Qr9iLBAD) {
            try {
                if (k3x7lurq.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = eVhOlqcC;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.NCTxEWno) {
                    return 0;
                }
                if (i >= this.MdtA4re8) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Qr9iLBAD.NCTxEWno(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                q9 q9Var = new q9(this, i3);
                this.Qr9iLBAD.MdtA4re8(i3, q9Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                q9Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        ob0 ob0Var;
        if (k3x7lurq.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            q9 q9Var = currentThread instanceof q9 ? (q9) currentThread : null;
            if (q9Var == null || q9Var.jb9XjC4I != this) {
                q9Var = null;
            }
            synchronized (this.Qr9iLBAD) {
                i = (int) (eVhOlqcC.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object NCTxEWno = this.Qr9iLBAD.NCTxEWno(i2);
                    NCTxEWno.getClass();
                    q9 q9Var2 = (q9) NCTxEWno;
                    if (q9Var2 != q9Var) {
                        while (q9Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(q9Var2);
                            q9Var2.join(10000L);
                        }
                        bj0 bj0Var = q9Var2.NCTxEWno;
                        xl xlVar = this.b2ZJblxo;
                        bj0Var.getClass();
                        ob0 ob0Var2 = (ob0) b1.qoPGr6Ce.getAndSetObject(bj0Var, bj0.P7K7Inc8, (Object) null);
                        if (ob0Var2 != null) {
                            xlVar.qoPGr6Ce(ob0Var2);
                        }
                        while (true) {
                            ob0 MdtA4re8 = bj0Var.MdtA4re8();
                            if (MdtA4re8 == null) {
                                break;
                            } else {
                                xlVar.qoPGr6Ce(MdtA4re8);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.b2ZJblxo.NCTxEWno();
            this.P7K7Inc8.NCTxEWno();
            while (true) {
                if (q9Var != null) {
                    ob0Var = q9Var.qoPGr6Ce(true);
                }
                ob0Var = (ob0) this.P7K7Inc8.wxUZMvaN();
                if (ob0Var == null && (ob0Var = (ob0) this.b2ZJblxo.wxUZMvaN()) == null) {
                    break;
                }
                try {
                    ob0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (q9Var != null) {
                q9Var.Qr9iLBAD(r9.P7K7Inc8);
            }
            jb9XjC4I.set(this, 0L);
            eVhOlqcC.set(this, 0L);
        }
    }

    public final void eVhOlqcC(q9 q9Var, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = jb9XjC4I;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object MdtA4re8 = q9Var.MdtA4re8();
                    while (true) {
                        if (MdtA4re8 == ow5vqvCr) {
                            i3 = -1;
                            break;
                        }
                        if (MdtA4re8 == null) {
                            i3 = 0;
                            break;
                        }
                        q9 q9Var2 = (q9) MdtA4re8;
                        int NCTxEWno = q9Var2.NCTxEWno();
                        if (NCTxEWno != 0) {
                            i3 = NCTxEWno;
                            break;
                        }
                        MdtA4re8 = q9Var2.MdtA4re8();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | i3;
                s9 s9Var = this;
                if (atomicLongFieldUpdater.compareAndSet(s9Var, j, j3)) {
                    return;
                } else {
                    this = s9Var;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Qr9iLBAD(this, runnable, 6);
    }

    public final boolean lDXGDhIF() {
        s9 s9Var;
        lf lfVar;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = jb9XjC4I;
            long j = atomicLongFieldUpdater.get(this);
            q9 q9Var = (q9) this.Qr9iLBAD.NCTxEWno((int) (2097151 & j));
            if (q9Var == null) {
                q9Var = null;
                s9Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object MdtA4re8 = q9Var.MdtA4re8();
                while (true) {
                    lfVar = ow5vqvCr;
                    if (MdtA4re8 == lfVar) {
                        i = -1;
                        break;
                    }
                    if (MdtA4re8 == null) {
                        i = 0;
                        break;
                    }
                    q9 q9Var2 = (q9) MdtA4re8;
                    i = q9Var2.NCTxEWno();
                    if (i != 0) {
                        break;
                    }
                    MdtA4re8 = q9Var2.MdtA4re8();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (i >= 0) {
                    s9 s9Var2 = this;
                    boolean compareAndSet = atomicLongFieldUpdater.compareAndSet(s9Var2, j, j2 | i);
                    s9Var = s9Var2;
                    if (compareAndSet) {
                        q9Var.b2ZJblxo(lfVar);
                    }
                    this = s9Var;
                } else {
                    continue;
                }
            }
            if (q9Var == null) {
                return false;
            }
            if (q9.eVhOlqcC.compareAndSet(q9Var, -1, 0)) {
                LockSupport.unpark(q9Var);
                return true;
            }
            this = s9Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        b30 b30Var = this.Qr9iLBAD;
        int qoPGr6Ce = b30Var.qoPGr6Ce();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < qoPGr6Ce; i6++) {
            q9 q9Var = (q9) b30Var.NCTxEWno(i6);
            if (q9Var != null) {
                bj0 bj0Var = q9Var.NCTxEWno;
                bj0Var.getClass();
                Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(bj0Var, bj0.P7K7Inc8);
                int NCTxEWno = bj0Var.NCTxEWno();
                if (objectVolatile != null) {
                    NCTxEWno++;
                }
                int ordinal = q9Var.wxUZMvaN.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(NCTxEWno);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(NCTxEWno);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (NCTxEWno > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(NCTxEWno);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new d7();
                    }
                    i5++;
                }
            }
        }
        long j = eVhOlqcC.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.VgvYg0wo);
        sb4.append('@');
        sb4.append(ra.I5GHvsYW(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.NCTxEWno;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.MdtA4re8);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.P7K7Inc8.MdtA4re8());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.b2ZJblxo.MdtA4re8());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
