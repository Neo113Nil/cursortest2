package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class lb0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater GWasM1elztuh = AtomicReferenceFieldUpdater.newUpdater(lb0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long Yi7zF1RB1 = o9.GWasM1elztuh.objectFieldOffset(lb0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new nb0(8, false);

    public final boolean GWasM1elztuh(Runnable runnable) {
        lb0 lb0Var;
        while (true) {
            GWasM1elztuh.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = Yi7zF1RB1;
            nb0 nb0Var = (nb0) unsafe.getObjectVolatile(this, j);
            int GWasM1elztuh2 = nb0Var.GWasM1elztuh(runnable);
            if (GWasM1elztuh2 == 0) {
                return true;
            }
            if (GWasM1elztuh2 == 1) {
                nb0 xqGvceK5x = nb0Var.xqGvceK5x();
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    lb0Var = this;
                    if (!unsafe2.compareAndSwapObject(lb0Var, Yi7zF1RB1, nb0Var, xqGvceK5x) && unsafe2.getObjectVolatile(lb0Var, j) == nb0Var) {
                        this = lb0Var;
                    }
                }
            } else {
                if (GWasM1elztuh2 == 2) {
                    return false;
                }
                lb0Var = this;
            }
            this = lb0Var;
        }
    }

    public final int X1lG3V04pd() {
        GWasM1elztuh.getClass();
        nb0 nb0Var = (nb0) o9.GWasM1elztuh.getObjectVolatile(this, Yi7zF1RB1);
        nb0Var.getClass();
        long j = nb0.EljAMC1QTz.get(nb0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final void Yi7zF1RB1() {
        lb0 lb0Var;
        while (true) {
            GWasM1elztuh.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = Yi7zF1RB1;
            nb0 nb0Var = (nb0) unsafe.getObjectVolatile(this, j);
            if (nb0Var.X1lG3V04pd()) {
                return;
            }
            nb0 xqGvceK5x = nb0Var.xqGvceK5x();
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                lb0Var = this;
                if (!unsafe2.compareAndSwapObject(lb0Var, Yi7zF1RB1, nb0Var, xqGvceK5x) && unsafe2.getObjectVolatile(lb0Var, j) == nb0Var) {
                    this = lb0Var;
                }
            }
            this = lb0Var;
        }
    }

    public final Object xqGvceK5x() {
        lb0 lb0Var;
        while (true) {
            GWasM1elztuh.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = Yi7zF1RB1;
            nb0 nb0Var = (nb0) unsafe.getObjectVolatile(this, j);
            Object OOA6hdeuvCS = nb0Var.OOA6hdeuvCS();
            if (OOA6hdeuvCS != nb0.AvO7iQsrTN) {
                return OOA6hdeuvCS;
            }
            nb0 xqGvceK5x = nb0Var.xqGvceK5x();
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                lb0Var = this;
                if (!unsafe2.compareAndSwapObject(lb0Var, Yi7zF1RB1, nb0Var, xqGvceK5x) && unsafe2.getObjectVolatile(lb0Var, j) == nb0Var) {
                    this = lb0Var;
                }
            }
            this = lb0Var;
        }
    }
}
