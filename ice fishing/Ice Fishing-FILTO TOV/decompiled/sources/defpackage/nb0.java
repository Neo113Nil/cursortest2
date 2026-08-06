package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nb0 {
    public final int GWasM1elztuh;
    public final int X1lG3V04pd;
    public final boolean Yi7zF1RB1;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final /* synthetic */ AtomicReferenceArray xqGvceK5x;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OOA6hdeuvCS = AtomicReferenceFieldUpdater.newUpdater(nb0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long encWxUiV2 = o9.GWasM1elztuh.objectFieldOffset(nb0.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater EljAMC1QTz = AtomicLongFieldUpdater.newUpdater(nb0.class, "_state$volatile");
    public static final pp AvO7iQsrTN = new pp("REMOVE_FROZEN", 1);

    public nb0(int i, boolean z) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = z;
        int i2 = i - 1;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            o4.jivtDDk9H("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        o4.jivtDDk9H("Check failed.");
        throw null;
    }

    public final int GWasM1elztuh(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.X1lG3V04pd;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.Yi7zF1RB1;
            AtomicReferenceArray atomicReferenceArray = this.xqGvceK5x;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                nb0 nb0Var = this;
                if (EljAMC1QTz.compareAndSet(nb0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    nb0 nb0Var2 = nb0Var;
                    while ((atomicLongFieldUpdater.get(nb0Var2) & 1152921504606846976L) != 0) {
                        nb0Var2 = nb0Var2.xqGvceK5x();
                        AtomicReferenceArray atomicReferenceArray2 = nb0Var2.xqGvceK5x;
                        int i4 = nb0Var2.X1lG3V04pd & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof mb0) && ((mb0) obj2).GWasM1elztuh == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            nb0Var2 = null;
                        }
                        if (nb0Var2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = nb0Var;
            } else {
                int i5 = this.GWasM1elztuh;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final Object OOA6hdeuvCS() {
        nb0 nb0Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            long j = atomicLongFieldUpdater.get(nb0Var);
            if ((j & 1152921504606846976L) != 0) {
                return AvO7iQsrTN;
            }
            int i = (int) (j & 1073741823);
            int i2 = nb0Var.X1lG3V04pd;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nb0Var.xqGvceK5x;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = nb0Var.Yi7zF1RB1;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof mb0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (EljAMC1QTz.compareAndSet(nb0Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                nb0Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(nb0Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            nb0Var = nb0Var.xqGvceK5x();
                        } else {
                            nb0 nb0Var2 = nb0Var;
                            if (EljAMC1QTz.compareAndSet(nb0Var2, j3, (j3 & (-1073741824)) | j2)) {
                                nb0Var2.xqGvceK5x.set(i4 & nb0Var2.X1lG3V04pd, null);
                                nb0Var = null;
                            } else {
                                nb0Var = nb0Var2;
                            }
                        }
                        if (nb0Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean X1lG3V04pd() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            nb0 nb0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(nb0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = nb0Var;
        }
    }

    public final nb0 Yi7zF1RB1(long j) {
        nb0 nb0Var;
        while (true) {
            OOA6hdeuvCS.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j2 = encWxUiV2;
            nb0 nb0Var2 = (nb0) unsafe.getObjectVolatile(this, j2);
            if (nb0Var2 != null) {
                return nb0Var2;
            }
            nb0 nb0Var3 = new nb0(this.GWasM1elztuh * 2, this.Yi7zF1RB1);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.X1lG3V04pd;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.xqGvceK5x.get(i4);
                if (obj == null) {
                    obj = new mb0(i);
                }
                nb0Var3.xqGvceK5x.set(nb0Var3.X1lG3V04pd & i, obj);
                i++;
            }
            EljAMC1QTz.set(nb0Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                nb0Var = this;
                if (!unsafe2.compareAndSwapObject(nb0Var, encWxUiV2, (Object) null, nb0Var3) && unsafe2.getObjectVolatile(nb0Var, j2) == null) {
                    this = nb0Var;
                }
            }
            this = nb0Var;
        }
    }

    public final nb0 xqGvceK5x() {
        long j;
        nb0 nb0Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                nb0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            nb0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(nb0Var, j, j2)) {
                j = j2;
                break;
            }
            this = nb0Var;
        }
        return nb0Var.Yi7zF1RB1(j);
    }
}
