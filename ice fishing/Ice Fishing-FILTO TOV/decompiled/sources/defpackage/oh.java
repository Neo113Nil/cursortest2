package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oh implements Executor, Closeable {
    public final long AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final hy JFJ3QoxA;
    public final int OOA6hdeuvCS;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final String encWxUiV2;
    public final hy mOu10nynGul;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final nu0 rQPn8YBR;
    public static final /* synthetic */ AtomicLongFieldUpdater E7jCp8Ls = AtomicLongFieldUpdater.newUpdater(oh.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater XnEVoBF0td1l = AtomicLongFieldUpdater.newUpdater(oh.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater uFEq9NpZ = AtomicIntegerFieldUpdater.newUpdater(oh.class, "_isTerminated$volatile");
    public static final pp iwATDS1i01k = new pp("NOT_IN_STACK", 1);

    public oh(int i, int i2, long j, String str) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = j;
        this.encWxUiV2 = str;
        if (i < 1) {
            o4.OOA6hdeuvCS(mr0.encWxUiV2("Core pool size ", i, " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            o4.OOA6hdeuvCS(mr0.mOu10nynGul("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            o4.OOA6hdeuvCS(mr0.encWxUiV2("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.mOu10nynGul = new hy();
        this.JFJ3QoxA = new hy();
        this.rQPn8YBR = new nu0((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void X1lG3V04pd(oh ohVar, Runnable runnable, int i) {
        ohVar.Yi7zF1RB1(runnable, false, (i & 4) == 0);
    }

    public final boolean EljAMC1QTz() {
        oh ohVar;
        pp ppVar;
        int i;
        while (true) {
            long j = E7jCp8Ls.get(this);
            mh mhVar = (mh) this.rQPn8YBR.Yi7zF1RB1((int) (2097151 & j));
            if (mhVar == null) {
                mhVar = null;
                ohVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object X1lG3V04pd = mhVar.X1lG3V04pd();
                while (true) {
                    ppVar = iwATDS1i01k;
                    if (X1lG3V04pd == ppVar) {
                        i = -1;
                        break;
                    }
                    if (X1lG3V04pd == null) {
                        i = 0;
                        break;
                    }
                    mh mhVar2 = (mh) X1lG3V04pd;
                    i = mhVar2.Yi7zF1RB1();
                    if (i != 0) {
                        break;
                    }
                    X1lG3V04pd = mhVar2.X1lG3V04pd();
                    j = j;
                }
                if (i >= 0) {
                    oh ohVar2 = this;
                    boolean compareAndSet = E7jCp8Ls.compareAndSet(ohVar2, j, i | j2);
                    ohVar = ohVar2;
                    if (compareAndSet) {
                        mhVar.AvO7iQsrTN(ppVar);
                    }
                    this = ohVar;
                } else {
                    continue;
                }
            }
            if (mhVar == null) {
                return false;
            }
            if (mh.XnEVoBF0td1l.compareAndSet(mhVar, -1, 0)) {
                LockSupport.unpark(mhVar);
                return true;
            }
            this = ohVar;
        }
    }

    public final int GWasM1elztuh() {
        synchronized (this.rQPn8YBR) {
            try {
                if (uFEq9NpZ.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = XnEVoBF0td1l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.OOA6hdeuvCS) {
                    return 0;
                }
                if (i >= this.EljAMC1QTz) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.rQPn8YBR.Yi7zF1RB1(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                mh mhVar = new mh(this, i3);
                this.rQPn8YBR.X1lG3V04pd(i3, mhVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                mhVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OOA6hdeuvCS(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.OOA6hdeuvCS;
        if (i < i2) {
            int GWasM1elztuh = GWasM1elztuh();
            if (GWasM1elztuh == 1 && i2 > 1) {
                GWasM1elztuh();
            }
            if (GWasM1elztuh > 0) {
                return true;
            }
        }
        return false;
    }

    public final void Yi7zF1RB1(Runnable runnable, boolean z, boolean z2) {
        u71 v71Var;
        nh nhVar;
        w71.EljAMC1QTz.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof u71) {
            v71Var = (u71) runnable;
            v71Var.OOA6hdeuvCS = nanoTime;
            v71Var.EljAMC1QTz = z;
        } else {
            v71Var = new v71(runnable, nanoTime, z);
        }
        boolean z3 = v71Var.EljAMC1QTz;
        AtomicLongFieldUpdater atomicLongFieldUpdater = XnEVoBF0td1l;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        mh mhVar = null;
        mh mhVar2 = currentThread instanceof mh ? (mh) currentThread : null;
        if (mhVar2 != null && mhVar2.E7jCp8Ls == this) {
            mhVar = mhVar2;
        }
        if (mhVar != null && (nhVar = mhVar.AvO7iQsrTN) != nh.mOu10nynGul && (v71Var.EljAMC1QTz || nhVar != nh.EljAMC1QTz)) {
            mhVar.rQPn8YBR = true;
            v71Var = mhVar.OOA6hdeuvCS.GWasM1elztuh(v71Var, z2);
        }
        if (v71Var != null) {
            if (!(v71Var.EljAMC1QTz ? this.JFJ3QoxA.GWasM1elztuh(v71Var) : this.mOu10nynGul.GWasM1elztuh(v71Var))) {
                throw new RejectedExecutionException(this.encWxUiV2 + " was terminated");
            }
        }
        boolean z4 = z2 && mhVar != null;
        if (z3) {
            if (z4 || EljAMC1QTz() || OOA6hdeuvCS(addAndGet)) {
                return;
            }
            EljAMC1QTz();
            return;
        }
        if (z4 || EljAMC1QTz() || OOA6hdeuvCS(atomicLongFieldUpdater.get(this))) {
            return;
        }
        EljAMC1QTz();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        u71 u71Var;
        if (uFEq9NpZ.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            mh mhVar = null;
            mh mhVar2 = currentThread instanceof mh ? (mh) currentThread : null;
            if (mhVar2 != null && mhVar2.E7jCp8Ls == this) {
                mhVar = mhVar2;
            }
            synchronized (this.rQPn8YBR) {
                i = (int) (XnEVoBF0td1l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object Yi7zF1RB1 = this.rQPn8YBR.Yi7zF1RB1(i2);
                    Yi7zF1RB1.getClass();
                    mh mhVar3 = (mh) Yi7zF1RB1;
                    if (mhVar3 != mhVar) {
                        while (mhVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(mhVar3);
                            mhVar3.join(10000L);
                        }
                        mhVar3.OOA6hdeuvCS.xqGvceK5x(this.JFJ3QoxA);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.JFJ3QoxA.Yi7zF1RB1();
            this.mOu10nynGul.Yi7zF1RB1();
            while (true) {
                if (mhVar != null) {
                    u71Var = mhVar.GWasM1elztuh(true);
                }
                u71Var = (u71) this.mOu10nynGul.xqGvceK5x();
                if (u71Var == null && (u71Var = (u71) this.JFJ3QoxA.xqGvceK5x()) == null) {
                    break;
                }
                try {
                    u71Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (mhVar != null) {
                mhVar.encWxUiV2(nh.mOu10nynGul);
            }
            E7jCp8Ls.set(this, 0L);
            XnEVoBF0td1l.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        X1lG3V04pd(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        nu0 nu0Var = this.rQPn8YBR;
        int GWasM1elztuh = nu0Var.GWasM1elztuh();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < GWasM1elztuh; i6++) {
            mh mhVar = (mh) nu0Var.Yi7zF1RB1(i6);
            if (mhVar != null) {
                int X1lG3V04pd = mhVar.OOA6hdeuvCS.X1lG3V04pd();
                int ordinal = mhVar.AvO7iQsrTN.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(X1lG3V04pd);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(X1lG3V04pd);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (X1lG3V04pd > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(X1lG3V04pd);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = XnEVoBF0td1l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.encWxUiV2);
        sb4.append('@');
        sb4.append(qj.WdrkLMV3xh(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.OOA6hdeuvCS;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.EljAMC1QTz);
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
        sb4.append(this.mOu10nynGul.X1lG3V04pd());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.JFJ3QoxA.X1lG3V04pd());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void xqGvceK5x(mh mhVar, int i, int i2) {
        while (true) {
            long j = E7jCp8Ls.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object X1lG3V04pd = mhVar.X1lG3V04pd();
                    while (true) {
                        if (X1lG3V04pd == iwATDS1i01k) {
                            i3 = -1;
                            break;
                        }
                        if (X1lG3V04pd == null) {
                            i3 = 0;
                            break;
                        }
                        mh mhVar2 = (mh) X1lG3V04pd;
                        int Yi7zF1RB1 = mhVar2.Yi7zF1RB1();
                        if (Yi7zF1RB1 != 0) {
                            i3 = Yi7zF1RB1;
                            break;
                        }
                        X1lG3V04pd = mhVar2.X1lG3V04pd();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                oh ohVar = this;
                if (E7jCp8Ls.compareAndSet(ohVar, j, i3 | j2)) {
                    return;
                } else {
                    this = ohVar;
                }
            }
        }
    }
}
