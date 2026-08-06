package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class si0 {
    public static final /* synthetic */ long GE9mJIPrb8gP;
    public static final /* synthetic */ long P05cfTpS5W5L;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater QiMR8OkAhezm;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater WDYagTQQm9ns = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.si0.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ long e6mdH7fiFuta;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater oh71FJcDz6S2;
    private volatile /* synthetic */ java.lang.Object _next$volatile = this;
    private volatile /* synthetic */ java.lang.Object _prev$volatile = this;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        P05cfTpS5W5L = unsafe.objectFieldOffset(defpackage.si0.class.getDeclaredField("_next$volatile"));
        oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.si0.class, java.lang.Object.class, "_prev$volatile");
        e6mdH7fiFuta = unsafe.objectFieldOffset(defpackage.si0.class.getDeclaredField("_prev$volatile"));
        QiMR8OkAhezm = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.si0.class, java.lang.Object.class, "_removedRef$volatile");
        GE9mJIPrb8gP = unsafe.objectFieldOffset(defpackage.si0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static defpackage.si0 e6mdH7fiFuta(defpackage.si0 si0Var) {
        while (si0Var.gUjdnLbkVAaA()) {
            oh71FJcDz6S2.getClass();
            si0Var = (defpackage.si0) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(si0Var, e6mdH7fiFuta);
        }
        return si0Var;
    }

    public final void GE9mJIPrb8gP(defpackage.si0 si0Var) {
        defpackage.si0 si0Var2;
        while (true) {
            oh71FJcDz6S2.getClass();
            if (si0Var == null) {
                defpackage.p81.ZpBGe2uQfcn8();
                return;
            }
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = e6mdH7fiFuta;
            defpackage.si0 si0Var3 = (defpackage.si0) unsafe.getObjectVolatile(si0Var, j);
            if (this.Ns0WNyEWdPsk() != si0Var) {
                return;
            }
            while (si0Var != null) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                si0Var2 = this;
                defpackage.si0 si0Var4 = si0Var;
                if (unsafe2.compareAndSwapObject(si0Var4, e6mdH7fiFuta, si0Var3, si0Var2)) {
                    if (si0Var2.gUjdnLbkVAaA()) {
                        si0Var4.P05cfTpS5W5L();
                        return;
                    }
                    return;
                } else {
                    if (si0Var4 == null) {
                        defpackage.p81.ZpBGe2uQfcn8();
                        return;
                    }
                    si0Var = si0Var4;
                    if (unsafe2.getObjectVolatile(si0Var4, j) != si0Var3) {
                        break;
                    } else {
                        this = si0Var2;
                    }
                }
            }
            defpackage.p81.ZpBGe2uQfcn8();
            return;
            this = si0Var2;
        }
    }

    public final java.lang.Object Ns0WNyEWdPsk() {
        WDYagTQQm9ns.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, P05cfTpS5W5L);
    }

    public final defpackage.si0 P05cfTpS5W5L() {
        defpackage.si0 si0Var;
        defpackage.si0 si0Var2;
        sun.misc.Unsafe unsafe;
        loop0: while (true) {
            oh71FJcDz6S2.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = e6mdH7fiFuta;
            defpackage.si0 si0Var3 = (defpackage.si0) unsafe2.getObjectVolatile(this, j);
            defpackage.si0 si0Var4 = null;
            si0Var = si0Var3;
            while (true) {
                WDYagTQQm9ns.getClass();
                if (si0Var == null) {
                    defpackage.p81.ZpBGe2uQfcn8();
                    return null;
                }
                sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                long j2 = P05cfTpS5W5L;
                java.lang.Object objectVolatile = unsafe3.getObjectVolatile(si0Var, j2);
                if (objectVolatile != this) {
                    defpackage.si0 si0Var5 = si0Var3;
                    si0Var2 = this;
                    if (si0Var2.gUjdnLbkVAaA()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof defpackage.n41)) {
                        objectVolatile.getClass();
                        si0Var4 = si0Var;
                        si0Var = (defpackage.si0) objectVolatile;
                    } else if (si0Var4 != null) {
                        defpackage.si0 si0Var6 = ((defpackage.n41) objectVolatile).ZpBGe2uQfcn8;
                        do {
                            defpackage.si0 si0Var7 = si0Var;
                            unsafe = defpackage.ed.ZpBGe2uQfcn8;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(si0Var4, P05cfTpS5W5L, si0Var7, si0Var6);
                            si0Var = si0Var7;
                            if (compareAndSwapObject) {
                                this = si0Var2;
                                si0Var = si0Var4;
                                si0Var3 = si0Var5;
                                si0Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(si0Var4, j2) == si0Var);
                    } else {
                        if (si0Var == null) {
                            defpackage.p81.ZpBGe2uQfcn8();
                            return null;
                        }
                        si0Var = (defpackage.si0) unsafe3.getObjectVolatile(si0Var, j);
                    }
                    this = si0Var2;
                    si0Var3 = si0Var5;
                } else {
                    if (si0Var3 == si0Var) {
                        break;
                    }
                    while (true) {
                        sun.misc.Unsafe unsafe4 = defpackage.ed.ZpBGe2uQfcn8;
                        defpackage.si0 si0Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(si0Var8, e6mdH7fiFuta, si0Var3, si0Var);
                        defpackage.si0 si0Var9 = si0Var3;
                        si0Var2 = si0Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(si0Var2, j) != si0Var9) {
                            break;
                        }
                        this = si0Var2;
                        si0Var3 = si0Var9;
                    }
                }
            }
            this = si0Var2;
        }
        return si0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QiMR8OkAhezm(defpackage.ur0 ur0Var) {
        oh71FJcDz6S2.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        unsafe.putObjectVolatile(ur0Var, e6mdH7fiFuta, this);
        WDYagTQQm9ns.getClass();
        long j = P05cfTpS5W5L;
        unsafe.putObjectVolatile(ur0Var, j, this);
        while (this.Ns0WNyEWdPsk() == this) {
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                defpackage.si0 si0Var = this;
                defpackage.ur0 ur0Var2 = ur0Var;
                if (unsafe2.compareAndSwapObject(si0Var, P05cfTpS5W5L, this, ur0Var2)) {
                    ur0Var2.GE9mJIPrb8gP(si0Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(si0Var, j) != si0Var) {
                        break;
                    }
                    this = si0Var;
                    ur0Var = ur0Var2;
                }
            }
        }
    }

    public final defpackage.si0 T1fB7bDYiVJQ() {
        defpackage.si0 si0Var;
        while (true) {
            java.lang.Object Ns0WNyEWdPsk = this.Ns0WNyEWdPsk();
            if (Ns0WNyEWdPsk instanceof defpackage.n41) {
                return ((defpackage.n41) Ns0WNyEWdPsk).ZpBGe2uQfcn8;
            }
            if (Ns0WNyEWdPsk == this) {
                return (defpackage.si0) Ns0WNyEWdPsk;
            }
            Ns0WNyEWdPsk.getClass();
            defpackage.si0 si0Var2 = (defpackage.si0) Ns0WNyEWdPsk;
            defpackage.n41 XntWc4eZSQ8j = si0Var2.XntWc4eZSQ8j();
            while (true) {
                WDYagTQQm9ns.getClass();
                sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
                long j = P05cfTpS5W5L;
                si0Var = this;
                if (unsafe.compareAndSwapObject(si0Var, j, Ns0WNyEWdPsk, XntWc4eZSQ8j)) {
                    si0Var2.P05cfTpS5W5L();
                    return null;
                }
                if (unsafe.getObjectVolatile(si0Var, j) != Ns0WNyEWdPsk) {
                    break;
                }
                this = si0Var;
            }
            this = si0Var;
        }
    }

    public final boolean WDYagTQQm9ns(defpackage.si0 si0Var, int i) {
        defpackage.si0 h3m55N1URyyK;
        do {
            h3m55N1URyyK = h3m55N1URyyK();
            if (h3m55N1URyyK instanceof defpackage.xh0) {
                return (((defpackage.xh0) h3m55N1URyyK).Ns0WNyEWdPsk & i) == 0 && h3m55N1URyyK.WDYagTQQm9ns(si0Var, i);
            }
        } while (!h3m55N1URyyK.oh71FJcDz6S2(si0Var, this));
        return true;
    }

    public final defpackage.n41 XntWc4eZSQ8j() {
        QiMR8OkAhezm.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        long j = GE9mJIPrb8gP;
        defpackage.n41 n41Var = (defpackage.n41) unsafe.getObjectVolatile(this, j);
        if (n41Var != null) {
            return n41Var;
        }
        defpackage.n41 n41Var2 = new defpackage.n41(this);
        unsafe.putObjectVolatile(this, j, n41Var2);
        return n41Var2;
    }

    public final defpackage.si0 fNwYGHIYeJcR() {
        java.lang.Object Ns0WNyEWdPsk = Ns0WNyEWdPsk();
        defpackage.n41 n41Var = Ns0WNyEWdPsk instanceof defpackage.n41 ? (defpackage.n41) Ns0WNyEWdPsk : null;
        if (n41Var != null) {
            return n41Var.ZpBGe2uQfcn8;
        }
        Ns0WNyEWdPsk.getClass();
        return (defpackage.si0) Ns0WNyEWdPsk;
    }

    public boolean gUjdnLbkVAaA() {
        return Ns0WNyEWdPsk() instanceof defpackage.n41;
    }

    public final defpackage.si0 h3m55N1URyyK() {
        defpackage.si0 P05cfTpS5W5L2 = P05cfTpS5W5L();
        if (P05cfTpS5W5L2 != null) {
            return P05cfTpS5W5L2;
        }
        oh71FJcDz6S2.getClass();
        return e6mdH7fiFuta((defpackage.si0) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, e6mdH7fiFuta));
    }

    public final boolean oh71FJcDz6S2(defpackage.si0 si0Var, defpackage.si0 si0Var2) {
        oh71FJcDz6S2.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        unsafe.putObjectVolatile(si0Var, e6mdH7fiFuta, this);
        WDYagTQQm9ns.getClass();
        long j = P05cfTpS5W5L;
        unsafe.putObjectVolatile(si0Var, j, si0Var2);
        while (true) {
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            defpackage.si0 si0Var3 = this;
            defpackage.si0 si0Var4 = si0Var;
            defpackage.si0 si0Var5 = si0Var2;
            if (unsafe2.compareAndSwapObject(si0Var3, P05cfTpS5W5L, si0Var5, si0Var4)) {
                si0Var4.GE9mJIPrb8gP(si0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(si0Var3, j) != si0Var5) {
                return false;
            }
            this = si0Var3;
            si0Var2 = si0Var5;
            si0Var = si0Var4;
        }
    }

    public java.lang.String toString() {
        return new defpackage.kf0(1, 1, defpackage.nn.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + defpackage.nn.IJ0hOnjhPOri(this);
    }
}
