package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class dd extends defpackage.qq implements defpackage.bd, defpackage.um, defpackage.vu1 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater GE9mJIPrb8gP = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.dd.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Ns0WNyEWdPsk = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dd.class, java.lang.Object.class, "_state$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater fNwYGHIYeJcR;
    public static final /* synthetic */ long gUjdnLbkVAaA;
    public static final /* synthetic */ long h3m55N1URyyK;
    public final defpackage.kl P05cfTpS5W5L;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    public final defpackage.jm e6mdH7fiFuta;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        gUjdnLbkVAaA = unsafe.objectFieldOffset(defpackage.dd.class.getDeclaredField("_state$volatile"));
        fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.dd.class, java.lang.Object.class, "_parentHandle$volatile");
        h3m55N1URyyK = unsafe.objectFieldOffset(defpackage.dd.class.getDeclaredField("_parentHandle$volatile"));
    }

    public dd(int i, defpackage.kl klVar) {
        super(i);
        this.P05cfTpS5W5L = klVar;
        this.e6mdH7fiFuta = klVar.oh71FJcDz6S2();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = defpackage.ZEXjjCYihNTt.ZpBGe2uQfcn8;
    }

    public static java.lang.Object IBvW5fLsPuHy(defpackage.ds0 ds0Var, java.lang.Object obj, int i, defpackage.d20 d20Var) {
        if (obj instanceof defpackage.ug) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (d20Var != null || (ds0Var instanceof defpackage.yc)) {
            return new defpackage.sg(obj, ds0Var instanceof defpackage.yc ? (defpackage.yc) ds0Var : null, d20Var, (java.lang.Throwable) null, 16);
        }
        return obj;
    }

    public static void blKFvluuDQOf(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public java.lang.Throwable BHfvd2J71qpO(defpackage.jb0 jb0Var) {
        return jb0Var.s0TASMVLSWD5();
    }

    public final defpackage.ru BXaznwstz2U0(java.lang.Object obj, defpackage.d20 d20Var) {
        defpackage.dd ddVar;
        defpackage.ru ruVar = defpackage.ok0.ZpBGe2uQfcn8;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = gUjdnLbkVAaA;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.ds0)) {
                return null;
            }
            java.lang.Object IBvW5fLsPuHy = IBvW5fLsPuHy((defpackage.ds0) objectVolatile, obj, this.QiMR8OkAhezm, d20Var);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                ddVar = this;
                if (unsafe2.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, IBvW5fLsPuHy)) {
                    if (!ddVar.OcTWLQzke1i2()) {
                        ddVar.WmetiUbpKU9I();
                    }
                    return ruVar;
                }
                if (unsafe2.getObjectVolatile(ddVar, j) != objectVolatile) {
                    break;
                }
                this = ddVar;
            }
            this = ddVar;
        }
    }

    @Override // defpackage.bd
    public final void GE9mJIPrb8gP(java.lang.Object obj, defpackage.d20 d20Var) {
        frSwwKIlbUhK(obj, this.QiMR8OkAhezm, d20Var);
    }

    public final void IJ0hOnjhPOri() {
        defpackage.cr VFeft99leXEK = VFeft99leXEK();
        if (VFeft99leXEK == null || (maCixPsq4ml2() instanceof defpackage.ds0)) {
            return;
        }
        VFeft99leXEK.ZpBGe2uQfcn8();
        fNwYGHIYeJcR.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, h3m55N1URyyK, defpackage.zr0.WDYagTQQm9ns);
    }

    @Override // defpackage.qq
    public final java.lang.Throwable JhCgjQRTAOCT(java.lang.Object obj) {
        java.lang.Throwable JhCgjQRTAOCT = super.JhCgjQRTAOCT(obj);
        if (JhCgjQRTAOCT != null) {
            return JhCgjQRTAOCT;
        }
        return null;
    }

    public final void KrtOTfE6jiS2(defpackage.lm lmVar) {
        defpackage.kl klVar = this.P05cfTpS5W5L;
        defpackage.oq oqVar = klVar instanceof defpackage.oq ? (defpackage.oq) klVar : null;
        frSwwKIlbUhK(defpackage.gs1.ZpBGe2uQfcn8, (oqVar != null ? oqVar.P05cfTpS5W5L : null) == lmVar ? 4 : this.QiMR8OkAhezm, null);
    }

    public final boolean Mearx7yMn90V() {
        Ns0WNyEWdPsk.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        long j = gUjdnLbkVAaA;
        java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof defpackage.sg) && ((defpackage.sg) objectVolatile).JhCgjQRTAOCT != null) {
            WmetiUbpKU9I();
            return false;
        }
        GE9mJIPrb8gP.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, defpackage.ZEXjjCYihNTt.ZpBGe2uQfcn8);
        return true;
    }

    @Override // defpackage.qq
    public final java.lang.Object Ns0WNyEWdPsk() {
        return maCixPsq4ml2();
    }

    public final boolean OcTWLQzke1i2() {
        return this.QiMR8OkAhezm == 2 && ((defpackage.oq) this.P05cfTpS5W5L).WmetiUbpKU9I();
    }

    @Override // defpackage.qq
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj) {
        return obj instanceof defpackage.sg ? ((defpackage.sg) obj).ZpBGe2uQfcn8 : obj;
    }

    @Override // defpackage.bd
    public final boolean T1fB7bDYiVJQ(java.lang.Throwable th) {
        defpackage.dd ddVar;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = gUjdnLbkVAaA;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.ds0)) {
                return false;
            }
            defpackage.gd gdVar = new defpackage.gd(this, th, (objectVolatile instanceof defpackage.yc) || (objectVolatile instanceof defpackage.ka1));
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                ddVar = this;
                if (unsafe2.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, gdVar)) {
                    defpackage.ds0 ds0Var = (defpackage.ds0) objectVolatile;
                    if (ds0Var instanceof defpackage.yc) {
                        ddVar.fNwYGHIYeJcR((defpackage.yc) objectVolatile, th);
                    } else if (ds0Var instanceof defpackage.ka1) {
                        ddVar.XntWc4eZSQ8j((defpackage.ka1) objectVolatile, th);
                    }
                    if (!ddVar.OcTWLQzke1i2()) {
                        ddVar.WmetiUbpKU9I();
                    }
                    ddVar.s0TASMVLSWD5(ddVar.QiMR8OkAhezm);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ddVar, j) != objectVolatile) {
                    break;
                }
                this = ddVar;
            }
            this = ddVar;
        }
    }

    @Override // defpackage.bd
    public final void UmgHb6n58gfG(java.lang.Object obj) {
        s0TASMVLSWD5(this.QiMR8OkAhezm);
    }

    public final defpackage.cr VFeft99leXEK() {
        defpackage.cb0 cb0Var = (defpackage.cb0) this.e6mdH7fiFuta.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var == null) {
            return null;
        }
        defpackage.cr dG7RjM6DqYVL = defpackage.b80.dG7RjM6DqYVL(cb0Var, true, new defpackage.he(this));
        while (true) {
            fNwYGHIYeJcR.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = h3m55N1URyyK;
            defpackage.dd ddVar = this;
            if (!unsafe.compareAndSwapObject(ddVar, j, (java.lang.Object) null, dG7RjM6DqYVL) && unsafe.getObjectVolatile(ddVar, j) == null) {
                this = ddVar;
            }
        }
        return dG7RjM6DqYVL;
    }

    @Override // defpackage.um
    public final defpackage.um WDYagTQQm9ns() {
        defpackage.kl klVar = this.P05cfTpS5W5L;
        if (klVar instanceof defpackage.um) {
            return (defpackage.um) klVar;
        }
        return null;
    }

    public final void WmetiUbpKU9I() {
        defpackage.cr ZVVdXbWmyCSK = ZVVdXbWmyCSK();
        if (ZVVdXbWmyCSK == null) {
            return;
        }
        ZVVdXbWmyCSK.ZpBGe2uQfcn8();
        fNwYGHIYeJcR.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, h3m55N1URyyK, defpackage.zr0.WDYagTQQm9ns);
    }

    public final void XntWc4eZSQ8j(defpackage.ka1 ka1Var, java.lang.Throwable th) {
        defpackage.jm jmVar = this.e6mdH7fiFuta;
        int i = GE9mJIPrb8gP.get(this) & 536870911;
        if (i == 536870911) {
            defpackage.h7.P05cfTpS5W5L("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            ka1Var.fNwYGHIYeJcR(i, jmVar);
        } catch (java.lang.Throwable th2) {
            defpackage.ma0.ZVVdXbWmyCSK(jmVar, new defpackage.vg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final defpackage.cr ZVVdXbWmyCSK() {
        fNwYGHIYeJcR.getClass();
        return (defpackage.cr) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, h3m55N1URyyK);
    }

    @Override // defpackage.vu1
    public final void ZpBGe2uQfcn8(defpackage.ka1 ka1Var, int i) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = GE9mJIPrb8gP;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                defpackage.h7.P05cfTpS5W5L("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        dG7RjM6DqYVL(ka1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        blKFvluuDQOf(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dG7RjM6DqYVL(defpackage.ds0 ds0Var) {
        defpackage.dd ddVar;
        sun.misc.Unsafe unsafe;
        defpackage.dd ddVar2;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = gUjdnLbkVAaA;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof defpackage.ZEXjjCYihNTt) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    ddVar = this;
                    if (unsafe3.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, ds0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ddVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = ddVar;
                    }
                }
            } else {
                ddVar = this;
                if ((objectVolatile instanceof defpackage.yc) || (objectVolatile instanceof defpackage.ka1)) {
                    break;
                }
                if (objectVolatile instanceof defpackage.ug) {
                    defpackage.ug ugVar = (defpackage.ug) objectVolatile;
                    if (!defpackage.ug.giKS3J6vZuNy.compareAndSet(ugVar, 0, 1)) {
                        blKFvluuDQOf(ds0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof defpackage.gd) {
                        java.lang.Throwable th = ugVar.ZpBGe2uQfcn8;
                        if (ds0Var instanceof defpackage.yc) {
                            ddVar.fNwYGHIYeJcR((defpackage.yc) ds0Var, th);
                            return;
                        } else {
                            ds0Var.getClass();
                            ddVar.XntWc4eZSQ8j((defpackage.ka1) ds0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof defpackage.sg) {
                    defpackage.sg sgVar = (defpackage.sg) objectVolatile;
                    if (sgVar.giKS3J6vZuNy != null) {
                        blKFvluuDQOf(ds0Var, objectVolatile);
                        throw null;
                    }
                    if (ds0Var instanceof defpackage.ka1) {
                        return;
                    }
                    ds0Var.getClass();
                    defpackage.yc ycVar = (defpackage.yc) ds0Var;
                    java.lang.Throwable th2 = sgVar.WDYagTQQm9ns;
                    if (th2 != null) {
                        ddVar.fNwYGHIYeJcR(ycVar, th2);
                        return;
                    }
                    defpackage.sg ZpBGe2uQfcn8 = defpackage.sg.ZpBGe2uQfcn8(sgVar, ycVar, null, 29);
                    do {
                        unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        ddVar2 = ddVar;
                        if (unsafe.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, ZpBGe2uQfcn8)) {
                            return;
                        } else {
                            ddVar = ddVar2;
                        }
                    } while (unsafe.getObjectVolatile(ddVar2, j) == objectVolatile);
                } else {
                    defpackage.dd ddVar3 = ddVar;
                    if (ds0Var instanceof defpackage.ka1) {
                        return;
                    }
                    ds0Var.getClass();
                    defpackage.sg sgVar2 = new defpackage.sg(objectVolatile, (defpackage.yc) ds0Var, (defpackage.d20) null, (java.lang.Throwable) null, 28);
                    while (true) {
                        defpackage.sg sgVar3 = sgVar2;
                        sun.misc.Unsafe unsafe4 = defpackage.ed.ZpBGe2uQfcn8;
                        ddVar = ddVar3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, sgVar3);
                        sgVar2 = sgVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(ddVar, j) != objectVolatile) {
                            break;
                        } else {
                            ddVar3 = ddVar;
                        }
                    }
                }
            }
            this = ddVar;
        }
    }

    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        java.lang.Throwable ZpBGe2uQfcn8 = defpackage.h51.ZpBGe2uQfcn8(obj);
        if (ZpBGe2uQfcn8 != null) {
            obj = new defpackage.ug(ZpBGe2uQfcn8, false);
        }
        frSwwKIlbUhK(obj, this.QiMR8OkAhezm, null);
    }

    public final void fNwYGHIYeJcR(defpackage.yc ycVar, java.lang.Throwable th) {
        try {
            switch (ycVar.ZpBGe2uQfcn8) {
                case 0:
                    ((java.util.concurrent.ScheduledFuture) ycVar.giKS3J6vZuNy).cancel(false);
                    break;
                case 1:
                    ((defpackage.y10) ycVar.giKS3J6vZuNy).P05cfTpS5W5L(th);
                    break;
                default:
                    ((defpackage.cr) ycVar.giKS3J6vZuNy).ZpBGe2uQfcn8();
                    break;
            }
        } catch (java.lang.Throwable th2) {
            defpackage.ma0.ZVVdXbWmyCSK(this.e6mdH7fiFuta, new defpackage.vg("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.qq
    public final defpackage.kl fWTAfUmVKrZq() {
        return this.P05cfTpS5W5L;
    }

    public final void frSwwKIlbUhK(java.lang.Object obj, int i, defpackage.d20 d20Var) {
        defpackage.dd ddVar;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = gUjdnLbkVAaA;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof defpackage.ds0)) {
                defpackage.dd ddVar2 = this;
                if (objectVolatile instanceof defpackage.gd) {
                    defpackage.gd gdVar = (defpackage.gd) objectVolatile;
                    if (defpackage.gd.fWTAfUmVKrZq.compareAndSet(gdVar, 0, 1)) {
                        if (d20Var != null) {
                            ddVar2.h3m55N1URyyK(d20Var, gdVar.ZpBGe2uQfcn8, obj);
                            return;
                        }
                        return;
                    }
                }
                defpackage.h7.QiMR8OkAhezm(obj, "Already resumed, but proposed with update ");
                return;
            }
            java.lang.Object IBvW5fLsPuHy = IBvW5fLsPuHy((defpackage.ds0) objectVolatile, obj, i, d20Var);
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                ddVar = this;
                if (unsafe2.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, IBvW5fLsPuHy)) {
                    if (!ddVar.OcTWLQzke1i2()) {
                        ddVar.WmetiUbpKU9I();
                    }
                    ddVar.s0TASMVLSWD5(i);
                    return;
                } else if (unsafe2.getObjectVolatile(ddVar, j) != objectVolatile) {
                    break;
                } else {
                    this = ddVar;
                }
            }
            this = ddVar;
        }
    }

    @Override // defpackage.bd
    public final defpackage.ru gUjdnLbkVAaA(java.lang.Object obj, defpackage.d20 d20Var) {
        return BXaznwstz2U0(obj, d20Var);
    }

    @Override // defpackage.qq
    public final void giKS3J6vZuNy(java.util.concurrent.CancellationException cancellationException) {
        java.util.concurrent.CancellationException cancellationException2;
        defpackage.dd ddVar;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = gUjdnLbkVAaA;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof defpackage.ds0) {
                defpackage.h7.P05cfTpS5W5L("Not completed");
                return;
            }
            if (objectVolatile instanceof defpackage.ug) {
                return;
            }
            if (objectVolatile instanceof defpackage.sg) {
                defpackage.sg sgVar = (defpackage.sg) objectVolatile;
                if (sgVar.WDYagTQQm9ns != null) {
                    defpackage.h7.P05cfTpS5W5L("Must be called at most once");
                    return;
                }
                defpackage.sg ZpBGe2uQfcn8 = defpackage.sg.ZpBGe2uQfcn8(sgVar, null, cancellationException, 15);
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    defpackage.dd ddVar2 = this;
                    if (unsafe2.compareAndSwapObject(ddVar2, gUjdnLbkVAaA, objectVolatile, ZpBGe2uQfcn8)) {
                        defpackage.yc ycVar = sgVar.giKS3J6vZuNy;
                        if (ycVar != null) {
                            ddVar2.fNwYGHIYeJcR(ycVar, cancellationException);
                        }
                        defpackage.d20 d20Var = sgVar.fWTAfUmVKrZq;
                        if (d20Var != null) {
                            ddVar2.h3m55N1URyyK(d20Var, cancellationException, sgVar.ZpBGe2uQfcn8);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ddVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ddVar = ddVar2;
                        break;
                    }
                    this = ddVar2;
                }
            } else {
                defpackage.dd ddVar3 = this;
                java.util.concurrent.CancellationException cancellationException3 = cancellationException;
                defpackage.sg sgVar2 = new defpackage.sg(objectVolatile, (defpackage.yc) null, (defpackage.d20) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    defpackage.sg sgVar3 = sgVar2;
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    ddVar = ddVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(ddVar, gUjdnLbkVAaA, objectVolatile, sgVar3);
                    sgVar2 = sgVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ddVar, j) != objectVolatile) {
                        break;
                    } else {
                        ddVar3 = ddVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ddVar;
        }
    }

    public final void h3m55N1URyyK(defpackage.d20 d20Var, java.lang.Throwable th, java.lang.Object obj) {
        defpackage.jm jmVar = this.e6mdH7fiFuta;
        try {
            d20Var.JhCgjQRTAOCT(th, obj, jmVar);
        } catch (java.lang.Throwable th2) {
            defpackage.ma0.ZVVdXbWmyCSK(jmVar, new defpackage.vg("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void jjTN4uUnoyEn() {
        java.lang.Throwable BHfvd2J71qpO;
        defpackage.kl klVar = this.P05cfTpS5W5L;
        defpackage.oq oqVar = klVar instanceof defpackage.oq ? (defpackage.oq) klVar : null;
        if (oqVar == null || (BHfvd2J71qpO = oqVar.BHfvd2J71qpO(this)) == null) {
            return;
        }
        WmetiUbpKU9I();
        T1fB7bDYiVJQ(BHfvd2J71qpO);
    }

    public final java.lang.Object maCixPsq4ml2() {
        Ns0WNyEWdPsk.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, gUjdnLbkVAaA);
    }

    public final void oCu53ZX2v4Ju(defpackage.y10 y10Var) {
        dG7RjM6DqYVL(new defpackage.yc(1, y10Var));
    }

    @Override // defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        return this.e6mdH7fiFuta;
    }

    public java.lang.String qjMheFZ0l9kA() {
        return "CancellableContinuation";
    }

    public final void s0TASMVLSWD5(int i) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = GE9mJIPrb8gP;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    defpackage.h7.P05cfTpS5W5L("Already resumed");
                    return;
                }
                boolean z = i == 4;
                defpackage.kl klVar = this.P05cfTpS5W5L;
                if (!z && (klVar instanceof defpackage.oq)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.QiMR8OkAhezm;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        defpackage.oq oqVar = (defpackage.oq) klVar;
                        defpackage.lm lmVar = oqVar.P05cfTpS5W5L;
                        defpackage.jm oh71FJcDz6S2 = oqVar.e6mdH7fiFuta.oh71FJcDz6S2();
                        if (lmVar.frSwwKIlbUhK(oh71FJcDz6S2)) {
                            lmVar.jjTN4uUnoyEn(oh71FJcDz6S2, this);
                            return;
                        }
                        defpackage.vv ZpBGe2uQfcn8 = defpackage.xn1.ZpBGe2uQfcn8();
                        if (ZpBGe2uQfcn8.QiMR8OkAhezm >= 4294967296L) {
                            ZpBGe2uQfcn8.BXaznwstz2U0(this);
                            return;
                        }
                        ZpBGe2uQfcn8.hH0RRJrNssvh(true);
                        try {
                            defpackage.vx1.hH0RRJrNssvh(this, klVar, true);
                            do {
                            } while (ZpBGe2uQfcn8.xahdJg25P1Bv());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                defpackage.vx1.hH0RRJrNssvh(this, klVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(qjMheFZ0l9kA());
        sb.append('(');
        sb.append(defpackage.nn.jjTN4uUnoyEn(this.P05cfTpS5W5L));
        sb.append("){");
        java.lang.Object maCixPsq4ml2 = maCixPsq4ml2();
        sb.append(maCixPsq4ml2 instanceof defpackage.ds0 ? "Active" : maCixPsq4ml2 instanceof defpackage.gd ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(defpackage.nn.IJ0hOnjhPOri(this));
        return sb.toString();
    }

    public final java.lang.Object w7APNrr0aGRc() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        defpackage.cb0 cb0Var;
        boolean OcTWLQzke1i2 = OcTWLQzke1i2();
        do {
            atomicIntegerFieldUpdater = GE9mJIPrb8gP;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    defpackage.h7.P05cfTpS5W5L("Already suspended");
                    return null;
                }
                if (OcTWLQzke1i2) {
                    jjTN4uUnoyEn();
                }
                java.lang.Object maCixPsq4ml2 = maCixPsq4ml2();
                if (maCixPsq4ml2 instanceof defpackage.ug) {
                    throw ((defpackage.ug) maCixPsq4ml2).ZpBGe2uQfcn8;
                }
                int i3 = this.QiMR8OkAhezm;
                if ((i3 != 1 && i3 != 2) || (cb0Var = (defpackage.cb0) this.e6mdH7fiFuta.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8)) == null || cb0Var.giKS3J6vZuNy()) {
                    return QiMR8OkAhezm(maCixPsq4ml2);
                }
                java.util.concurrent.CancellationException s0TASMVLSWD5 = cb0Var.s0TASMVLSWD5();
                giKS3J6vZuNy(s0TASMVLSWD5);
                throw s0TASMVLSWD5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (ZVVdXbWmyCSK() == null) {
            VFeft99leXEK();
        }
        if (OcTWLQzke1i2) {
            jjTN4uUnoyEn();
        }
        return defpackage.tm.WDYagTQQm9ns;
    }
}
