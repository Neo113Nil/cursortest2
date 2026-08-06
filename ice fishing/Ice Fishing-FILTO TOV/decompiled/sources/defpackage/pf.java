package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class pf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater GWasM1elztuh = AtomicReferenceFieldUpdater.newUpdater(pf.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long X1lG3V04pd;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Yi7zF1RB1;
    public static final /* synthetic */ long xqGvceK5x;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        X1lG3V04pd = unsafe.objectFieldOffset(pf.class.getDeclaredField("_next$volatile"));
        Yi7zF1RB1 = AtomicReferenceFieldUpdater.newUpdater(pf.class, Object.class, "_prev$volatile");
        xqGvceK5x = unsafe.objectFieldOffset(pf.class.getDeclaredField("_prev$volatile"));
    }

    public pf(wz0 wz0Var) {
        this._prev$volatile = wz0Var;
    }

    public final boolean AvO7iQsrTN() {
        pp ppVar = rj0.OOA6hdeuvCS;
        while (true) {
            GWasM1elztuh.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = X1lG3V04pd;
            pf pfVar = this;
            if (unsafe.compareAndSwapObject(pfVar, j, (Object) null, ppVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(pfVar, j) != null) {
                return false;
            }
            this = pfVar;
        }
    }

    public abstract boolean EljAMC1QTz();

    public final void GWasM1elztuh() {
        Yi7zF1RB1.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, xqGvceK5x, (Object) null);
    }

    public final pf OOA6hdeuvCS() {
        Yi7zF1RB1.getClass();
        return (pf) o9.GWasM1elztuh.getObjectVolatile(this, xqGvceK5x);
    }

    public final pf X1lG3V04pd() {
        Object xqGvceK5x2 = xqGvceK5x();
        if (xqGvceK5x2 == rj0.OOA6hdeuvCS) {
            return null;
        }
        return (pf) xqGvceK5x2;
    }

    public final pf Yi7zF1RB1() {
        pf OOA6hdeuvCS = OOA6hdeuvCS();
        while (OOA6hdeuvCS != null && OOA6hdeuvCS.EljAMC1QTz()) {
            Yi7zF1RB1.getClass();
            OOA6hdeuvCS = (pf) o9.GWasM1elztuh.getObjectVolatile(OOA6hdeuvCS, xqGvceK5x);
        }
        return OOA6hdeuvCS;
    }

    public final void encWxUiV2() {
        pf pfVar;
        Unsafe unsafe;
        if (X1lG3V04pd() == null) {
            return;
        }
        while (true) {
            pf Yi7zF1RB12 = Yi7zF1RB1();
            pf X1lG3V04pd2 = X1lG3V04pd();
            X1lG3V04pd2.getClass();
            do {
                pfVar = X1lG3V04pd2;
                if (!pfVar.EljAMC1QTz()) {
                    break;
                } else {
                    X1lG3V04pd2 = pfVar.X1lG3V04pd();
                }
            } while (X1lG3V04pd2 != null);
            while (true) {
                Yi7zF1RB1.getClass();
                Unsafe unsafe2 = o9.GWasM1elztuh;
                long j = xqGvceK5x;
                Object objectVolatile = unsafe2.getObjectVolatile(pfVar, j);
                pf pfVar2 = ((pf) objectVolatile) == null ? null : Yi7zF1RB12;
                do {
                    unsafe = o9.GWasM1elztuh;
                    if (unsafe.compareAndSwapObject(pfVar, xqGvceK5x, objectVolatile, pfVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(pfVar, j) == objectVolatile);
            }
            if (Yi7zF1RB12 != null) {
                GWasM1elztuh.getClass();
                unsafe.putObjectVolatile(Yi7zF1RB12, X1lG3V04pd, pfVar);
            }
            if (!pfVar.EljAMC1QTz() || pfVar.X1lG3V04pd() == null) {
                if (Yi7zF1RB12 == null || !Yi7zF1RB12.EljAMC1QTz()) {
                    return;
                }
            }
        }
    }

    public final boolean mOu10nynGul(wz0 wz0Var) {
        while (true) {
            GWasM1elztuh.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = X1lG3V04pd;
            pf pfVar = this;
            wz0 wz0Var2 = wz0Var;
            if (unsafe.compareAndSwapObject(pfVar, j, (Object) null, wz0Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(pfVar, j) != null) {
                return false;
            }
            this = pfVar;
            wz0Var = wz0Var2;
        }
    }

    public final Object xqGvceK5x() {
        GWasM1elztuh.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, X1lG3V04pd);
    }
}
