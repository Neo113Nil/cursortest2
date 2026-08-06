package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bh0 extends q01 {
    private volatile /* synthetic */ Object owner$volatile = qj.iwATDS1i01k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater mOu10nynGul = AtomicReferenceFieldUpdater.newUpdater(bh0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long JFJ3QoxA = o9.GWasM1elztuh.objectFieldOffset(bh0.class.getDeclaredField("owner$volatile"));

    public final void AvO7iQsrTN(Object obj) {
        while (Math.max(q01.EljAMC1QTz.get(this), 0) == 0) {
            mOu10nynGul.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = JFJ3QoxA;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            pp ppVar = qj.iwATDS1i01k;
            if (objectVolatile != ppVar) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    bh0 bh0Var = this;
                    if (unsafe2.compareAndSwapObject(bh0Var, JFJ3QoxA, objectVolatile, ppVar)) {
                        bh0Var.Yi7zF1RB1();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(bh0Var, j) != objectVolatile) {
                            this = bh0Var;
                            break;
                        }
                        this = bh0Var;
                    }
                }
            }
        }
        o4.jivtDDk9H("This mutex is not locked");
    }

    public final int EljAMC1QTz() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q01.EljAMC1QTz;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    mOu10nynGul.getClass();
                    o9.GWasM1elztuh.putObjectVolatile(this, JFJ3QoxA, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final boolean OOA6hdeuvCS() {
        int EljAMC1QTz = EljAMC1QTz();
        if (EljAMC1QTz == 0) {
            return true;
        }
        if (EljAMC1QTz == 1) {
            return false;
        }
        if (EljAMC1QTz == 2) {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        o4.jivtDDk9H("unexpected");
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(qj.WdrkLMV3xh(this));
        sb.append("[isLocked=");
        sb.append(Math.max(q01.EljAMC1QTz.get(this), 0) == 0);
        sb.append(",owner=");
        mOu10nynGul.getClass();
        sb.append(o9.GWasM1elztuh.getObjectVolatile(this, JFJ3QoxA));
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0021, code lost:
    
        r5 = defpackage.bh0.mOu10nynGul;
        r2 = r0.EljAMC1QTz;
        r5.set(r2, null);
        r5 = r0.OOA6hdeuvCS;
        r5.YZjbz8VdP5(r1, r5.AvO7iQsrTN, new defpackage.m9(0, new defpackage.E7jCp8Ls(11, r2, r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xqGvceK5x(wg wgVar) {
        boolean OOA6hdeuvCS = OOA6hdeuvCS();
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (!OOA6hdeuvCS) {
            n9 ozMwhSAI = n30.ozMwhSAI(rj0.M3K9sHhK(wgVar));
            try {
                ah0 ah0Var = new ah0(this, ozMwhSAI);
                while (true) {
                    int andDecrement = q01.EljAMC1QTz.getAndDecrement(this);
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (GWasM1elztuh(ah0Var)) {
                            break;
                        }
                    }
                }
                Object jivtDDk9H = ozMwhSAI.jivtDDk9H();
                qh qhVar = qh.OOA6hdeuvCS;
                if (jivtDDk9H != qhVar) {
                    jivtDDk9H = kc1Var;
                }
                if (jivtDDk9H == qhVar) {
                    return jivtDDk9H;
                }
            } catch (Throwable th) {
                ozMwhSAI.EXrPz3p7hFb();
                throw th;
            }
        }
        return kc1Var;
    }
}
