package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oq extends defpackage.qq implements defpackage.um, defpackage.kl {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.oq.class, java.lang.Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long h3m55N1URyyK = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.oq.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public java.lang.Object GE9mJIPrb8gP;
    public final java.lang.Object Ns0WNyEWdPsk;
    public final defpackage.lm P05cfTpS5W5L;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;
    public final defpackage.ll e6mdH7fiFuta;

    public oq(defpackage.lm lmVar, defpackage.ll llVar) {
        super(-1);
        this.P05cfTpS5W5L = lmVar;
        this.e6mdH7fiFuta = llVar;
        this.GE9mJIPrb8gP = defpackage.ma0.BHfvd2J71qpO;
        this.Ns0WNyEWdPsk = defpackage.nq1.NkfcFfdaVTox(llVar.oh71FJcDz6S2());
    }

    public final java.lang.Throwable BHfvd2J71qpO(defpackage.dd ddVar) {
        sun.misc.Unsafe unsafe;
        defpackage.oq oqVar;
        defpackage.dd ddVar2;
        while (true) {
            fNwYGHIYeJcR.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = h3m55N1URyyK;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            defpackage.ru ruVar = defpackage.ma0.ZVVdXbWmyCSK;
            if (objectVolatile != ruVar) {
                defpackage.oq oqVar2 = this;
                if (!(objectVolatile instanceof java.lang.Throwable)) {
                    defpackage.h7.QiMR8OkAhezm(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(oqVar2, h3m55N1URyyK, objectVolatile, (java.lang.Object) null)) {
                        return (java.lang.Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(oqVar2, j) == objectVolatile);
                defpackage.h7.w7APNrr0aGRc("Failed requirement.");
                return null;
            }
            while (true) {
                sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                oqVar = this;
                ddVar2 = ddVar;
                if (unsafe3.compareAndSwapObject(oqVar, h3m55N1URyyK, ruVar, ddVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(oqVar, j) != ruVar) {
                    break;
                }
                this = oqVar;
                ddVar = ddVar2;
            }
            this = oqVar;
            ddVar = ddVar2;
        }
    }

    @Override // defpackage.qq
    public final java.lang.Object Ns0WNyEWdPsk() {
        java.lang.Object obj = this.GE9mJIPrb8gP;
        this.GE9mJIPrb8gP = defpackage.ma0.BHfvd2J71qpO;
        return obj;
    }

    @Override // defpackage.um
    public final defpackage.um WDYagTQQm9ns() {
        return this.e6mdH7fiFuta;
    }

    public final boolean WmetiUbpKU9I() {
        fNwYGHIYeJcR.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, h3m55N1URyyK) != null;
    }

    public final defpackage.dd XntWc4eZSQ8j() {
        fNwYGHIYeJcR.getClass();
        java.lang.Object objectVolatile = defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, h3m55N1URyyK);
        if (objectVolatile instanceof defpackage.dd) {
            return (defpackage.dd) objectVolatile;
        }
        return null;
    }

    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        java.lang.Throwable ZpBGe2uQfcn8 = defpackage.h51.ZpBGe2uQfcn8(obj);
        java.lang.Object ugVar = ZpBGe2uQfcn8 == null ? obj : new defpackage.ug(ZpBGe2uQfcn8, false);
        defpackage.ll llVar = this.e6mdH7fiFuta;
        defpackage.jm oh71FJcDz6S2 = llVar.oh71FJcDz6S2();
        defpackage.lm lmVar = this.P05cfTpS5W5L;
        if (lmVar.frSwwKIlbUhK(oh71FJcDz6S2)) {
            this.GE9mJIPrb8gP = ugVar;
            this.QiMR8OkAhezm = 0;
            lmVar.jjTN4uUnoyEn(llVar.oh71FJcDz6S2(), this);
            return;
        }
        defpackage.vv ZpBGe2uQfcn82 = defpackage.xn1.ZpBGe2uQfcn8();
        if (ZpBGe2uQfcn82.QiMR8OkAhezm >= 4294967296L) {
            this.GE9mJIPrb8gP = ugVar;
            this.QiMR8OkAhezm = 0;
            ZpBGe2uQfcn82.BXaznwstz2U0(this);
            return;
        }
        ZpBGe2uQfcn82.hH0RRJrNssvh(true);
        try {
            defpackage.jm oh71FJcDz6S22 = llVar.oh71FJcDz6S2();
            java.lang.Object FhgBoOud6zyW = defpackage.nq1.FhgBoOud6zyW(oh71FJcDz6S22, this.Ns0WNyEWdPsk);
            try {
                llVar.e6mdH7fiFuta(obj);
                while (ZpBGe2uQfcn82.xahdJg25P1Bv()) {
                }
            } finally {
                defpackage.nq1.EPEWHACkMcF1(oh71FJcDz6S22, FhgBoOud6zyW);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void fNwYGHIYeJcR() {
        do {
            fNwYGHIYeJcR.getClass();
        } while (defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, h3m55N1URyyK) == defpackage.ma0.ZVVdXbWmyCSK);
    }

    public final defpackage.dd h3m55N1URyyK() {
        defpackage.oq oqVar;
        defpackage.ru ruVar = defpackage.ma0.ZVVdXbWmyCSK;
        while (true) {
            fNwYGHIYeJcR.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = h3m55N1URyyK;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, ruVar);
                return null;
            }
            if (objectVolatile instanceof defpackage.dd) {
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    defpackage.oq oqVar2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(oqVar2, h3m55N1URyyK, objectVolatile, ruVar);
                    oqVar = oqVar2;
                    if (compareAndSwapObject) {
                        return (defpackage.dd) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(oqVar, j) != objectVolatile) {
                        break;
                    }
                    this = oqVar;
                }
            } else {
                oqVar = this;
                if (objectVolatile != ruVar && !(objectVolatile instanceof java.lang.Throwable)) {
                    defpackage.h7.QiMR8OkAhezm(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = oqVar;
        }
    }

    @Override // defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        return this.e6mdH7fiFuta.oh71FJcDz6S2();
    }

    public final boolean s0TASMVLSWD5(java.lang.Throwable th) {
        defpackage.oq oqVar;
        java.lang.Throwable th2;
        sun.misc.Unsafe unsafe;
        while (true) {
            fNwYGHIYeJcR.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = h3m55N1URyyK;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            defpackage.ru ruVar = defpackage.ma0.ZVVdXbWmyCSK;
            if (defpackage.ma0.QiMR8OkAhezm(objectVolatile, ruVar)) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    defpackage.oq oqVar2 = this;
                    th2 = th;
                    oqVar = oqVar2;
                    if (unsafe3.compareAndSwapObject(oqVar2, h3m55N1URyyK, ruVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(oqVar, j) != ruVar) {
                        break;
                    }
                    this = oqVar;
                    th = th2;
                }
            } else {
                oqVar = this;
                th2 = th;
                if (objectVolatile instanceof java.lang.Throwable) {
                    return true;
                }
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(oqVar, h3m55N1URyyK, objectVolatile, (java.lang.Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(oqVar, j) == objectVolatile);
            }
            this = oqVar;
            th = th2;
        }
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.P05cfTpS5W5L + ", " + defpackage.nn.jjTN4uUnoyEn(this.e6mdH7fiFuta) + ']';
    }

    @Override // defpackage.qq
    public final defpackage.kl fWTAfUmVKrZq() {
        return this;
    }
}
