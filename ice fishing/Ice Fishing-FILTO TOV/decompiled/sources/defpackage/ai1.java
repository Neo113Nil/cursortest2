package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ai1 {
    public final AtomicReferenceArray GWasM1elztuh = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Yi7zF1RB1 = AtomicReferenceFieldUpdater.newUpdater(ai1.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long EljAMC1QTz = o9.GWasM1elztuh.objectFieldOffset(ai1.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater X1lG3V04pd = AtomicIntegerFieldUpdater.newUpdater(ai1.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater xqGvceK5x = AtomicIntegerFieldUpdater.newUpdater(ai1.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater OOA6hdeuvCS = AtomicIntegerFieldUpdater.newUpdater(ai1.class, "blockingTasksInBuffer$volatile");

    public final u71 AvO7iQsrTN() {
        ai1 ai1Var;
        while (true) {
            Yi7zF1RB1.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = EljAMC1QTz;
            u71 u71Var = (u71) unsafe.getObjectVolatile(this, j);
            if (u71Var != null && u71Var.EljAMC1QTz) {
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    ai1Var = this;
                    if (unsafe2.compareAndSwapObject(ai1Var, EljAMC1QTz, u71Var, (Object) null)) {
                        return u71Var;
                    }
                    if (unsafe2.getObjectVolatile(ai1Var, j) != u71Var) {
                        break;
                    }
                    this = ai1Var;
                }
            }
            this = ai1Var;
        }
        ai1 ai1Var2 = this;
        int i = xqGvceK5x.get(ai1Var2);
        int i2 = X1lG3V04pd.get(ai1Var2);
        while (i != i2 && OOA6hdeuvCS.get(ai1Var2) != 0) {
            i2--;
            u71 encWxUiV2 = ai1Var2.encWxUiV2(i2, true);
            if (encWxUiV2 != null) {
                return encWxUiV2;
            }
        }
        return null;
    }

    public final u71 EljAMC1QTz() {
        u71 u71Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = xqGvceK5x;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - X1lG3V04pd.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (u71Var = (u71) this.GWasM1elztuh.getAndSet(i2, null)) != null) {
                if (u71Var.EljAMC1QTz) {
                    OOA6hdeuvCS.decrementAndGet(this);
                }
                return u71Var;
            }
        }
    }

    public final u71 GWasM1elztuh(u71 u71Var, boolean z) {
        if (z) {
            return Yi7zF1RB1(u71Var);
        }
        Yi7zF1RB1.getClass();
        u71 u71Var2 = (u71) o9.GWasM1elztuh.getAndSetObject(this, EljAMC1QTz, u71Var);
        if (u71Var2 == null) {
            return null;
        }
        return Yi7zF1RB1(u71Var2);
    }

    public final u71 OOA6hdeuvCS() {
        Yi7zF1RB1.getClass();
        u71 u71Var = (u71) o9.GWasM1elztuh.getAndSetObject(this, EljAMC1QTz, (Object) null);
        return u71Var == null ? EljAMC1QTz() : u71Var;
    }

    public final int X1lG3V04pd() {
        Yi7zF1RB1.getClass();
        Object objectVolatile = o9.GWasM1elztuh.getObjectVolatile(this, EljAMC1QTz);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = xqGvceK5x;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = X1lG3V04pd;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final u71 Yi7zF1RB1(u71 u71Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = X1lG3V04pd;
        if (atomicIntegerFieldUpdater.get(this) - xqGvceK5x.get(this) == 127) {
            return u71Var;
        }
        if (u71Var.EljAMC1QTz) {
            OOA6hdeuvCS.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.GWasM1elztuh;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, u71Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final u71 encWxUiV2(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.GWasM1elztuh;
        u71 u71Var = (u71) atomicReferenceArray.get(i2);
        if (u71Var != null && u71Var.EljAMC1QTz == z) {
            while (!atomicReferenceArray.compareAndSet(i2, u71Var, null)) {
                if (atomicReferenceArray.get(i2) != u71Var) {
                }
            }
            if (z) {
                OOA6hdeuvCS.decrementAndGet(this);
            }
            return u71Var;
        }
        return null;
    }

    public final long mOu10nynGul(int i, rt0 rt0Var) {
        ai1 ai1Var;
        while (true) {
            Yi7zF1RB1.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = EljAMC1QTz;
            u71 u71Var = (u71) unsafe.getObjectVolatile(this, j);
            if (u71Var == null) {
                return -2L;
            }
            if (((u71Var.EljAMC1QTz ? 1 : 2) & i) == 0) {
                return -2L;
            }
            w71.EljAMC1QTz.getClass();
            long nanoTime = System.nanoTime() - u71Var.OOA6hdeuvCS;
            long j2 = w71.Yi7zF1RB1;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                ai1Var = this;
                if (unsafe2.compareAndSwapObject(ai1Var, EljAMC1QTz, u71Var, (Object) null)) {
                    rt0Var.OOA6hdeuvCS = u71Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ai1Var, j) != u71Var) {
                    break;
                }
                this = ai1Var;
            }
            this = ai1Var;
        }
    }

    public final void xqGvceK5x(hy hyVar) {
        Yi7zF1RB1.getClass();
        u71 u71Var = (u71) o9.GWasM1elztuh.getAndSetObject(this, EljAMC1QTz, (Object) null);
        if (u71Var != null) {
            hyVar.GWasM1elztuh(u71Var);
        }
        while (true) {
            u71 EljAMC1QTz2 = EljAMC1QTz();
            if (EljAMC1QTz2 == null) {
                return;
            } else {
                hyVar.GWasM1elztuh(EljAMC1QTz2);
            }
        }
    }
}
