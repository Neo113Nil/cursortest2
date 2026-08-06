package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class xb1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater GE9mJIPrb8gP;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Ns0WNyEWdPsk;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater P05cfTpS5W5L;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater QiMR8OkAhezm = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.xb1.class, java.lang.Object.class, "head$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater e6mdH7fiFuta;
    public static final /* synthetic */ long fNwYGHIYeJcR;
    public static final /* synthetic */ long h3m55N1URyyK;
    public final int WDYagTQQm9ns;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    public final defpackage.cd oh71FJcDz6S2;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        fNwYGHIYeJcR = unsafe.objectFieldOffset(defpackage.xb1.class.getDeclaredField("head$volatile"));
        P05cfTpS5W5L = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.xb1.class, "deqIdx$volatile");
        e6mdH7fiFuta = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.xb1.class, java.lang.Object.class, "tail$volatile");
        h3m55N1URyyK = unsafe.objectFieldOffset(defpackage.xb1.class.getDeclaredField("tail$volatile"));
        GE9mJIPrb8gP = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(defpackage.xb1.class, "enqIdx$volatile");
        Ns0WNyEWdPsk = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.xb1.class, "_availablePermits$volatile");
    }

    public xb1(int i) {
        this.WDYagTQQm9ns = i;
        if (i <= 0) {
            defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("The number of acquired permits should be in 0..", i));
            throw null;
        }
        defpackage.ac1 ac1Var = new defpackage.ac1(0L, null, 2);
        this.head$volatile = ac1Var;
        this.tail$volatile = ac1Var;
        this._availablePermits$volatile = i;
        this.oh71FJcDz6S2 = new defpackage.cd(5, this);
    }

    public final boolean WDYagTQQm9ns() {
        java.lang.Object jjTN4uUnoyEn;
        sun.misc.Unsafe unsafe;
        QiMR8OkAhezm.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
        long j = fNwYGHIYeJcR;
        defpackage.ac1 ac1Var = (defpackage.ac1) unsafe2.getObjectVolatile(this, j);
        long andIncrement = P05cfTpS5W5L.getAndIncrement(this);
        long j2 = andIncrement / defpackage.zb1.oh71FJcDz6S2;
        defpackage.wb1 wb1Var = defpackage.wb1.fNwYGHIYeJcR;
        loop0: while (true) {
            jjTN4uUnoyEn = defpackage.nq1.jjTN4uUnoyEn(ac1Var, j2, wb1Var);
            if (defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
                break;
            }
            defpackage.ka1 VFeft99leXEK = defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
            while (true) {
                defpackage.ka1 ka1Var = (defpackage.ka1) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, j);
                if (ka1Var.WDYagTQQm9ns >= VFeft99leXEK.WDYagTQQm9ns) {
                    break loop0;
                }
                if (!VFeft99leXEK.gUjdnLbkVAaA()) {
                    break;
                }
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(this, fNwYGHIYeJcR, ka1Var, VFeft99leXEK)) {
                        if (ka1Var.GE9mJIPrb8gP()) {
                            ka1Var.P05cfTpS5W5L();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == ka1Var);
                if (VFeft99leXEK.GE9mJIPrb8gP()) {
                    VFeft99leXEK.P05cfTpS5W5L();
                }
            }
        }
        defpackage.ac1 ac1Var2 = (defpackage.ac1) defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ac1Var2.QiMR8OkAhezm;
        ac1Var2.ZpBGe2uQfcn8();
        boolean z = false;
        if (ac1Var2.WDYagTQQm9ns <= j2) {
            int i = (int) (andIncrement % defpackage.zb1.oh71FJcDz6S2);
            java.lang.Object andSet = atomicReferenceArray.getAndSet(i, defpackage.zb1.giKS3J6vZuNy);
            if (andSet == null) {
                int i2 = defpackage.zb1.ZpBGe2uQfcn8;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == defpackage.zb1.fWTAfUmVKrZq) {
                        return true;
                    }
                }
                defpackage.ru ruVar = defpackage.zb1.giKS3J6vZuNy;
                defpackage.ru ruVar2 = defpackage.zb1.JhCgjQRTAOCT;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, ruVar, ruVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != ruVar) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != defpackage.zb1.WDYagTQQm9ns) {
                if (!(andSet instanceof defpackage.bd)) {
                    defpackage.h7.QiMR8OkAhezm(andSet, "unexpected: ");
                    return false;
                }
                defpackage.bd bdVar = (defpackage.bd) andSet;
                defpackage.ru gUjdnLbkVAaA = bdVar.gUjdnLbkVAaA(defpackage.gs1.ZpBGe2uQfcn8, this.oh71FJcDz6S2);
                if (gUjdnLbkVAaA != null) {
                    bdVar.UmgHb6n58gfG(gUjdnLbkVAaA);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean ZpBGe2uQfcn8(defpackage.vu1 vu1Var) {
        java.lang.Object jjTN4uUnoyEn;
        sun.misc.Unsafe unsafe;
        defpackage.xb1 xb1Var = this;
        e6mdH7fiFuta.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
        long j = h3m55N1URyyK;
        defpackage.ac1 ac1Var = (defpackage.ac1) unsafe2.getObjectVolatile(xb1Var, j);
        long andIncrement = GE9mJIPrb8gP.getAndIncrement(xb1Var);
        defpackage.vb1 vb1Var = defpackage.vb1.fNwYGHIYeJcR;
        long j2 = andIncrement / defpackage.zb1.oh71FJcDz6S2;
        loop0: while (true) {
            jjTN4uUnoyEn = defpackage.nq1.jjTN4uUnoyEn(ac1Var, j2, vb1Var);
            if (defpackage.q70.UmgHb6n58gfG(jjTN4uUnoyEn)) {
                break;
            }
            defpackage.ka1 VFeft99leXEK = defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
            while (true) {
                defpackage.ka1 ka1Var = (defpackage.ka1) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(xb1Var, j);
                if (ka1Var.WDYagTQQm9ns >= VFeft99leXEK.WDYagTQQm9ns) {
                    xb1Var = this;
                    break loop0;
                }
                if (!VFeft99leXEK.gUjdnLbkVAaA()) {
                    break;
                }
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    xb1Var = this;
                    if (unsafe.compareAndSwapObject(xb1Var, h3m55N1URyyK, ka1Var, VFeft99leXEK)) {
                        if (ka1Var.GE9mJIPrb8gP()) {
                            ka1Var.P05cfTpS5W5L();
                        }
                    }
                } while (unsafe.getObjectVolatile(xb1Var, j) == ka1Var);
                if (VFeft99leXEK.GE9mJIPrb8gP()) {
                    VFeft99leXEK.P05cfTpS5W5L();
                }
            }
            xb1Var = this;
        }
        defpackage.ac1 ac1Var2 = (defpackage.ac1) defpackage.q70.VFeft99leXEK(jjTN4uUnoyEn);
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = ac1Var2.QiMR8OkAhezm;
        int i = (int) (andIncrement % defpackage.zb1.oh71FJcDz6S2);
        while (!atomicReferenceArray.compareAndSet(i, null, vu1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                defpackage.ru ruVar = defpackage.zb1.giKS3J6vZuNy;
                defpackage.ru ruVar2 = defpackage.zb1.fWTAfUmVKrZq;
                while (!atomicReferenceArray.compareAndSet(i, ruVar, ruVar2)) {
                    if (atomicReferenceArray.get(i) != ruVar) {
                        return false;
                    }
                }
                ((defpackage.bd) vu1Var).GE9mJIPrb8gP(defpackage.gs1.ZpBGe2uQfcn8, xb1Var.oh71FJcDz6S2);
                return true;
            }
        }
        vu1Var.ZpBGe2uQfcn8(ac1Var2, i);
        return true;
    }

    public final void fWTAfUmVKrZq() {
        int i;
        do {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Ns0WNyEWdPsk;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.WDYagTQQm9ns;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!WDYagTQQm9ns());
    }
}
