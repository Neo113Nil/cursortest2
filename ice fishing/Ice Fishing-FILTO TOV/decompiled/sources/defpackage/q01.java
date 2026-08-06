package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class q01 {
    public static final /* synthetic */ long AvO7iQsrTN;
    public static final /* synthetic */ AtomicIntegerFieldUpdater EljAMC1QTz;
    public static final /* synthetic */ AtomicLongFieldUpdater OOA6hdeuvCS;
    public static final /* synthetic */ AtomicLongFieldUpdater X1lG3V04pd;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Yi7zF1RB1 = AtomicReferenceFieldUpdater.newUpdater(q01.class, Object.class, "head$volatile");
    public static final /* synthetic */ long encWxUiV2;
    public static final /* synthetic */ AtomicReferenceFieldUpdater xqGvceK5x;
    public final m9 GWasM1elztuh;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        AvO7iQsrTN = unsafe.objectFieldOffset(q01.class.getDeclaredField("head$volatile"));
        X1lG3V04pd = AtomicLongFieldUpdater.newUpdater(q01.class, "deqIdx$volatile");
        xqGvceK5x = AtomicReferenceFieldUpdater.newUpdater(q01.class, Object.class, "tail$volatile");
        encWxUiV2 = unsafe.objectFieldOffset(q01.class.getDeclaredField("tail$volatile"));
        OOA6hdeuvCS = AtomicLongFieldUpdater.newUpdater(q01.class, "enqIdx$volatile");
        EljAMC1QTz = AtomicIntegerFieldUpdater.newUpdater(q01.class, "_availablePermits$volatile");
    }

    public q01() {
        s01 s01Var = new s01(0L, null, 2);
        this.head$volatile = s01Var;
        this.tail$volatile = s01Var;
        this._availablePermits$volatile = 1;
        this.GWasM1elztuh = new m9(2, this);
    }

    public final boolean GWasM1elztuh(ah0 ah0Var) {
        Object Y6hRI1cF8;
        Unsafe unsafe;
        q01 q01Var = this;
        xqGvceK5x.getClass();
        Unsafe unsafe2 = o9.GWasM1elztuh;
        long j = encWxUiV2;
        s01 s01Var = (s01) unsafe2.getObjectVolatile(q01Var, j);
        long andIncrement = OOA6hdeuvCS.getAndIncrement(q01Var);
        o01 o01Var = o01.E7jCp8Ls;
        long j2 = andIncrement / r01.EljAMC1QTz;
        loop0: while (true) {
            Y6hRI1cF8 = rj0.Y6hRI1cF8(s01Var, j2, o01Var);
            if (!o50.pog2g9KITJA(Y6hRI1cF8)) {
                wz0 lv06NcmrQ = o50.lv06NcmrQ(Y6hRI1cF8);
                while (true) {
                    wz0 wz0Var = (wz0) o9.GWasM1elztuh.getObjectVolatile(q01Var, j);
                    if (wz0Var.OOA6hdeuvCS >= lv06NcmrQ.OOA6hdeuvCS) {
                        break loop0;
                    }
                    if (!lv06NcmrQ.uFEq9NpZ()) {
                        break;
                    }
                    do {
                        unsafe = o9.GWasM1elztuh;
                        q01Var = this;
                        if (unsafe.compareAndSwapObject(q01Var, encWxUiV2, wz0Var, lv06NcmrQ)) {
                            if (wz0Var.JFJ3QoxA()) {
                                wz0Var.encWxUiV2();
                            }
                        }
                    } while (unsafe.getObjectVolatile(q01Var, j) == wz0Var);
                    if (lv06NcmrQ.JFJ3QoxA()) {
                        lv06NcmrQ.encWxUiV2();
                    }
                }
            } else {
                break;
            }
            q01Var = this;
        }
        s01 s01Var2 = (s01) o50.lv06NcmrQ(Y6hRI1cF8);
        AtomicReferenceArray atomicReferenceArray = s01Var2.AvO7iQsrTN;
        int i = (int) (andIncrement % r01.EljAMC1QTz);
        while (!atomicReferenceArray.compareAndSet(i, null, ah0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                pp ppVar = r01.Yi7zF1RB1;
                pp ppVar2 = r01.X1lG3V04pd;
                do {
                    int i2 = 0;
                    if (atomicReferenceArray.compareAndSet(i, ppVar, ppVar2)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bh0.mOu10nynGul;
                        bh0 bh0Var = ah0Var.EljAMC1QTz;
                        atomicReferenceFieldUpdater.set(bh0Var, null);
                        n9 n9Var = ah0Var.OOA6hdeuvCS;
                        n9Var.YZjbz8VdP5(kc1.GWasM1elztuh, n9Var.AvO7iQsrTN, new m9(i2, new E7jCp8Ls(11, bh0Var, ah0Var)));
                        return true;
                    }
                } while (atomicReferenceArray.get(i) == ppVar);
                return false;
            }
        }
        ah0Var.GWasM1elztuh(s01Var2, i);
        return true;
    }

    public final boolean X1lG3V04pd() {
        Object Y6hRI1cF8;
        Unsafe unsafe;
        Yi7zF1RB1.getClass();
        Unsafe unsafe2 = o9.GWasM1elztuh;
        long j = AvO7iQsrTN;
        s01 s01Var = (s01) unsafe2.getObjectVolatile(this, j);
        long andIncrement = X1lG3V04pd.getAndIncrement(this);
        long j2 = andIncrement / r01.EljAMC1QTz;
        p01 p01Var = p01.E7jCp8Ls;
        loop0: while (true) {
            Y6hRI1cF8 = rj0.Y6hRI1cF8(s01Var, j2, p01Var);
            if (o50.pog2g9KITJA(Y6hRI1cF8)) {
                break;
            }
            wz0 lv06NcmrQ = o50.lv06NcmrQ(Y6hRI1cF8);
            while (true) {
                wz0 wz0Var = (wz0) o9.GWasM1elztuh.getObjectVolatile(this, j);
                if (wz0Var.OOA6hdeuvCS >= lv06NcmrQ.OOA6hdeuvCS) {
                    break loop0;
                }
                if (!lv06NcmrQ.uFEq9NpZ()) {
                    break;
                }
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(this, AvO7iQsrTN, wz0Var, lv06NcmrQ)) {
                        if (wz0Var.JFJ3QoxA()) {
                            wz0Var.encWxUiV2();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == wz0Var);
                if (lv06NcmrQ.JFJ3QoxA()) {
                    lv06NcmrQ.encWxUiV2();
                }
            }
        }
        s01 s01Var2 = (s01) o50.lv06NcmrQ(Y6hRI1cF8);
        AtomicReferenceArray atomicReferenceArray = s01Var2.AvO7iQsrTN;
        s01Var2.GWasM1elztuh();
        boolean z = false;
        if (s01Var2.OOA6hdeuvCS <= j2) {
            int i = (int) (andIncrement % r01.EljAMC1QTz);
            Object andSet = atomicReferenceArray.getAndSet(i, r01.Yi7zF1RB1);
            if (andSet == null) {
                int i2 = r01.GWasM1elztuh;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == r01.X1lG3V04pd) {
                        return true;
                    }
                }
                pp ppVar = r01.Yi7zF1RB1;
                pp ppVar2 = r01.xqGvceK5x;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, ppVar, ppVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != ppVar) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != r01.OOA6hdeuvCS) {
                if (!(andSet instanceof l9)) {
                    o4.EljAMC1QTz(andSet, "unexpected: ");
                    return false;
                }
                l9 l9Var = (l9) andSet;
                pp JFJ3QoxA = l9Var.JFJ3QoxA(kc1.GWasM1elztuh, this.GWasM1elztuh);
                if (JFJ3QoxA != null) {
                    l9Var.WRKkgoJXwDn(JFJ3QoxA);
                    return true;
                }
            }
        }
        return false;
    }

    public final void Yi7zF1RB1() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = EljAMC1QTz;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!X1lG3V04pd());
    }
}
