package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class kb0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater AvO7iQsrTN;
    public static final /* synthetic */ AtomicReferenceFieldUpdater EljAMC1QTz;
    public static final /* synthetic */ long JFJ3QoxA;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OOA6hdeuvCS = AtomicReferenceFieldUpdater.newUpdater(kb0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long encWxUiV2;
    public static final /* synthetic */ long mOu10nynGul;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        encWxUiV2 = unsafe.objectFieldOffset(kb0.class.getDeclaredField("_next$volatile"));
        EljAMC1QTz = AtomicReferenceFieldUpdater.newUpdater(kb0.class, Object.class, "_prev$volatile");
        mOu10nynGul = unsafe.objectFieldOffset(kb0.class.getDeclaredField("_prev$volatile"));
        AvO7iQsrTN = AtomicReferenceFieldUpdater.newUpdater(kb0.class, Object.class, "_removedRef$volatile");
        JFJ3QoxA = unsafe.objectFieldOffset(kb0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static kb0 mOu10nynGul(kb0 kb0Var) {
        while (kb0Var.uFEq9NpZ()) {
            EljAMC1QTz.getClass();
            kb0Var = (kb0) o9.GWasM1elztuh.getObjectVolatile(kb0Var, mOu10nynGul);
        }
        return kb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AvO7iQsrTN(dk0 dk0Var) {
        EljAMC1QTz.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        unsafe.putObjectVolatile(dk0Var, mOu10nynGul, this);
        OOA6hdeuvCS.getClass();
        long j = encWxUiV2;
        unsafe.putObjectVolatile(dk0Var, j, this);
        while (this.rQPn8YBR() == this) {
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                kb0 kb0Var = this;
                dk0 dk0Var2 = dk0Var;
                if (unsafe2.compareAndSwapObject(kb0Var, encWxUiV2, this, dk0Var2)) {
                    dk0Var2.JFJ3QoxA(kb0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(kb0Var, j) != kb0Var) {
                        break;
                    }
                    this = kb0Var;
                    dk0Var = dk0Var2;
                }
            }
        }
    }

    public final kb0 E7jCp8Ls() {
        Object rQPn8YBR = rQPn8YBR();
        fu0 fu0Var = rQPn8YBR instanceof fu0 ? (fu0) rQPn8YBR : null;
        if (fu0Var != null) {
            return fu0Var.GWasM1elztuh;
        }
        rQPn8YBR.getClass();
        return (kb0) rQPn8YBR;
    }

    public final boolean EljAMC1QTz(kb0 kb0Var, kb0 kb0Var2) {
        EljAMC1QTz.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        unsafe.putObjectVolatile(kb0Var, mOu10nynGul, this);
        OOA6hdeuvCS.getClass();
        long j = encWxUiV2;
        unsafe.putObjectVolatile(kb0Var, j, kb0Var2);
        while (true) {
            Unsafe unsafe2 = o9.GWasM1elztuh;
            kb0 kb0Var3 = this;
            kb0 kb0Var4 = kb0Var;
            kb0 kb0Var5 = kb0Var2;
            if (unsafe2.compareAndSwapObject(kb0Var3, encWxUiV2, kb0Var5, kb0Var4)) {
                kb0Var4.JFJ3QoxA(kb0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(kb0Var3, j) != kb0Var5) {
                return false;
            }
            this = kb0Var3;
            kb0Var2 = kb0Var5;
            kb0Var = kb0Var4;
        }
    }

    public final void JFJ3QoxA(kb0 kb0Var) {
        kb0 kb0Var2;
        while (true) {
            EljAMC1QTz.getClass();
            if (kb0Var == null) {
                o4.YmKjaVtbfp5Z();
                return;
            }
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = mOu10nynGul;
            kb0 kb0Var3 = (kb0) unsafe.getObjectVolatile(kb0Var, j);
            if (this.rQPn8YBR() != kb0Var) {
                return;
            }
            while (kb0Var != null) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                kb0Var2 = this;
                kb0 kb0Var4 = kb0Var;
                if (unsafe2.compareAndSwapObject(kb0Var4, mOu10nynGul, kb0Var3, kb0Var2)) {
                    if (kb0Var2.uFEq9NpZ()) {
                        kb0Var4.encWxUiV2();
                        return;
                    }
                    return;
                } else {
                    if (kb0Var4 == null) {
                        o4.YmKjaVtbfp5Z();
                        return;
                    }
                    kb0Var = kb0Var4;
                    if (unsafe2.getObjectVolatile(kb0Var4, j) != kb0Var3) {
                        break;
                    } else {
                        this = kb0Var2;
                    }
                }
            }
            o4.YmKjaVtbfp5Z();
            return;
            this = kb0Var2;
        }
    }

    public final boolean OOA6hdeuvCS(kb0 kb0Var, int i) {
        kb0 XnEVoBF0td1l;
        do {
            XnEVoBF0td1l = XnEVoBF0td1l();
            if (XnEVoBF0td1l instanceof ua0) {
                return (((ua0) XnEVoBF0td1l).rQPn8YBR & i) == 0 && XnEVoBF0td1l.OOA6hdeuvCS(kb0Var, i);
            }
        } while (!XnEVoBF0td1l.EljAMC1QTz(kb0Var, this));
        return true;
    }

    public final fu0 WIEu4Ya2g8() {
        AvO7iQsrTN.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        long j = JFJ3QoxA;
        fu0 fu0Var = (fu0) unsafe.getObjectVolatile(this, j);
        if (fu0Var != null) {
            return fu0Var;
        }
        fu0 fu0Var2 = new fu0(this);
        unsafe.putObjectVolatile(this, j, fu0Var2);
        return fu0Var2;
    }

    public final kb0 XnEVoBF0td1l() {
        kb0 encWxUiV22 = encWxUiV2();
        if (encWxUiV22 != null) {
            return encWxUiV22;
        }
        EljAMC1QTz.getClass();
        return mOu10nynGul((kb0) o9.GWasM1elztuh.getObjectVolatile(this, mOu10nynGul));
    }

    public final kb0 encWxUiV2() {
        kb0 kb0Var;
        kb0 kb0Var2;
        Unsafe unsafe;
        loop0: while (true) {
            EljAMC1QTz.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = mOu10nynGul;
            kb0 kb0Var3 = (kb0) unsafe2.getObjectVolatile(this, j);
            kb0 kb0Var4 = null;
            kb0Var = kb0Var3;
            while (true) {
                OOA6hdeuvCS.getClass();
                if (kb0Var == null) {
                    o4.YmKjaVtbfp5Z();
                    return null;
                }
                Unsafe unsafe3 = o9.GWasM1elztuh;
                long j2 = encWxUiV2;
                Object objectVolatile = unsafe3.getObjectVolatile(kb0Var, j2);
                if (objectVolatile != this) {
                    kb0 kb0Var5 = kb0Var3;
                    kb0Var2 = this;
                    if (kb0Var2.uFEq9NpZ()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof fu0)) {
                        objectVolatile.getClass();
                        kb0Var4 = kb0Var;
                        kb0Var = (kb0) objectVolatile;
                    } else if (kb0Var4 != null) {
                        kb0 kb0Var6 = ((fu0) objectVolatile).GWasM1elztuh;
                        do {
                            kb0 kb0Var7 = kb0Var;
                            unsafe = o9.GWasM1elztuh;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(kb0Var4, encWxUiV2, kb0Var7, kb0Var6);
                            kb0Var = kb0Var7;
                            if (compareAndSwapObject) {
                                this = kb0Var2;
                                kb0Var = kb0Var4;
                                kb0Var3 = kb0Var5;
                                kb0Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(kb0Var4, j2) == kb0Var);
                    } else {
                        if (kb0Var == null) {
                            o4.YmKjaVtbfp5Z();
                            return null;
                        }
                        kb0Var = (kb0) unsafe3.getObjectVolatile(kb0Var, j);
                    }
                    this = kb0Var2;
                    kb0Var3 = kb0Var5;
                } else {
                    if (kb0Var3 == kb0Var) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = o9.GWasM1elztuh;
                        kb0 kb0Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(kb0Var8, mOu10nynGul, kb0Var3, kb0Var);
                        kb0 kb0Var9 = kb0Var3;
                        kb0Var2 = kb0Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(kb0Var2, j) != kb0Var9) {
                            break;
                        }
                        this = kb0Var2;
                        kb0Var3 = kb0Var9;
                    }
                }
            }
            this = kb0Var2;
        }
        return kb0Var;
    }

    public final kb0 iwATDS1i01k() {
        kb0 kb0Var;
        while (true) {
            Object rQPn8YBR = this.rQPn8YBR();
            if (rQPn8YBR instanceof fu0) {
                return ((fu0) rQPn8YBR).GWasM1elztuh;
            }
            if (rQPn8YBR == this) {
                return (kb0) rQPn8YBR;
            }
            rQPn8YBR.getClass();
            kb0 kb0Var2 = (kb0) rQPn8YBR;
            fu0 WIEu4Ya2g8 = kb0Var2.WIEu4Ya2g8();
            while (true) {
                OOA6hdeuvCS.getClass();
                Unsafe unsafe = o9.GWasM1elztuh;
                long j = encWxUiV2;
                kb0Var = this;
                if (unsafe.compareAndSwapObject(kb0Var, j, rQPn8YBR, WIEu4Ya2g8)) {
                    kb0Var2.encWxUiV2();
                    return null;
                }
                if (unsafe.getObjectVolatile(kb0Var, j) != rQPn8YBR) {
                    break;
                }
                this = kb0Var;
            }
            this = kb0Var;
        }
    }

    public final Object rQPn8YBR() {
        OOA6hdeuvCS.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, encWxUiV2);
    }

    public String toString() {
        return new l80(1, 1, qj.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + qj.WdrkLMV3xh(this);
    }

    public boolean uFEq9NpZ() {
        return rQPn8YBR() instanceof fu0;
    }
}
