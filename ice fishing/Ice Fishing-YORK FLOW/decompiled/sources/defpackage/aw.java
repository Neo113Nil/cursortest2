package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class aw extends defpackage.vv implements defpackage.uo {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Ns0WNyEWdPsk = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aw.class, java.lang.Object.class, "_queue$volatile");
    public static final /* synthetic */ long T1fB7bDYiVJQ;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater fNwYGHIYeJcR;
    public static final /* synthetic */ long gUjdnLbkVAaA;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater h3m55N1URyyK;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        T1fB7bDYiVJQ = unsafe.objectFieldOffset(defpackage.aw.class.getDeclaredField("_queue$volatile"));
        fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aw.class, java.lang.Object.class, "_delayed$volatile");
        gUjdnLbkVAaA = unsafe.objectFieldOffset(defpackage.aw.class.getDeclaredField("_delayed$volatile"));
        h3m55N1URyyK = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.aw.class, "_isCompleted$volatile");
    }

    public abstract java.lang.Thread CZa7MwI9IzLd();

    public final boolean EPEWHACkMcF1() {
        defpackage.p7 p7Var = this.e6mdH7fiFuta;
        if (p7Var != null ? p7Var.isEmpty() : true) {
            fNwYGHIYeJcR.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            defpackage.zv zvVar = (defpackage.zv) unsafe.getObjectVolatile(this, gUjdnLbkVAaA);
            if (zvVar != null && defpackage.ao1.giKS3J6vZuNy.get(zvVar) != 0) {
                return false;
            }
            Ns0WNyEWdPsk.getClass();
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, T1fB7bDYiVJQ);
            if (objectVolatile != null) {
                if (objectVolatile instanceof defpackage.vi0) {
                    long j = defpackage.vi0.oh71FJcDz6S2.get((defpackage.vi0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == defpackage.nn.WDYagTQQm9ns) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean FhgBoOud6zyW(defpackage.yv yvVar) {
        fNwYGHIYeJcR.getClass();
        defpackage.zv zvVar = (defpackage.zv) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, gUjdnLbkVAaA);
        if (zvVar != null) {
            synchronized (zvVar) {
                defpackage.yv[] yvVarArr = zvVar.ZpBGe2uQfcn8;
                r0 = yvVarArr != null ? yvVarArr[0] : null;
            }
        }
        return r0 == yvVar;
    }

    public final long Fu5WBEia9jBo() {
        defpackage.yv yvVar;
        defpackage.p7 p7Var = this.e6mdH7fiFuta;
        if (((p7Var == null || p7Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(this, T1fB7bDYiVJQ);
            if (objectVolatile != null) {
                if (objectVolatile instanceof defpackage.vi0) {
                    long j = defpackage.vi0.oh71FJcDz6S2.get((defpackage.vi0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == defpackage.nn.WDYagTQQm9ns) {
                    return Long.MAX_VALUE;
                }
            }
            fNwYGHIYeJcR.getClass();
            defpackage.zv zvVar = (defpackage.zv) unsafe.getObjectVolatile(this, gUjdnLbkVAaA);
            if (zvVar != null) {
                synchronized (zvVar) {
                    defpackage.yv[] yvVarArr = zvVar.ZpBGe2uQfcn8;
                    yvVar = yvVarArr != null ? yvVarArr[0] : null;
                }
                if (yvVar != null) {
                    long nanoTime = yvVar.WDYagTQQm9ns - java.lang.System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    @Override // defpackage.vv
    public final long GcLuU6pT9wO9() {
        if (xahdJg25P1Bv()) {
            return 0L;
        }
        OVwOqzUGHcCU();
        java.lang.Runnable zJPqDeoF0Os1 = zJPqDeoF0Os1();
        if (zJPqDeoF0Os1 == null) {
            return Fu5WBEia9jBo();
        }
        zJPqDeoF0Os1.run();
        return 0L;
    }

    public final void GoIRkIe1iwj6(long j, defpackage.yv yvVar) {
        java.lang.Thread CZa7MwI9IzLd;
        int fhbmYuu9J3cT = fhbmYuu9J3cT(j, yvVar);
        if (fhbmYuu9J3cT == 0) {
            if (!FhgBoOud6zyW(yvVar) || java.lang.Thread.currentThread() == (CZa7MwI9IzLd = CZa7MwI9IzLd())) {
                return;
            }
            java.util.concurrent.locks.LockSupport.unpark(CZa7MwI9IzLd);
            return;
        }
        if (fhbmYuu9J3cT == 1) {
            z16KqenTjq8o(j, yvVar);
        } else {
            if (fhbmYuu9J3cT == 2) {
                return;
            }
            defpackage.h7.P05cfTpS5W5L("unexpected result");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Jkfc0NcwyPL8(java.lang.Runnable runnable) {
        defpackage.aw awVar;
        java.lang.Runnable runnable2;
        sun.misc.Unsafe unsafe;
        sun.misc.Unsafe unsafe2;
        loop0: while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
            long j = T1fB7bDYiVJQ;
            java.lang.Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (h3m55N1URyyK.get(this) != 0) {
                return false;
            }
            if (objectVolatile == null) {
                while (true) {
                    sun.misc.Unsafe unsafe4 = defpackage.ed.ZpBGe2uQfcn8;
                    defpackage.aw awVar2 = this;
                    runnable2 = runnable;
                    awVar = awVar2;
                    if (unsafe4.compareAndSwapObject(awVar2, T1fB7bDYiVJQ, (java.lang.Object) null, runnable2)) {
                        break loop0;
                    }
                    if (unsafe4.getObjectVolatile(awVar, j) != null) {
                        break;
                    }
                    this = awVar;
                    runnable = runnable2;
                }
                this = awVar;
                runnable = runnable2;
            } else {
                awVar = this;
                runnable2 = runnable;
                if (objectVolatile instanceof defpackage.vi0) {
                    defpackage.vi0 vi0Var = (defpackage.vi0) objectVolatile;
                    int ZpBGe2uQfcn8 = vi0Var.ZpBGe2uQfcn8(runnable2);
                    if (ZpBGe2uQfcn8 == 0) {
                        break;
                    }
                    if (ZpBGe2uQfcn8 == 1) {
                        defpackage.vi0 JhCgjQRTAOCT = vi0Var.JhCgjQRTAOCT();
                        do {
                            unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                            if (unsafe2.compareAndSwapObject(awVar, T1fB7bDYiVJQ, objectVolatile, JhCgjQRTAOCT)) {
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(awVar, j) == objectVolatile);
                    } else if (ZpBGe2uQfcn8 == 2) {
                        break;
                    }
                    this = awVar;
                    runnable = runnable2;
                } else {
                    if (objectVolatile == defpackage.nn.WDYagTQQm9ns) {
                        break;
                    }
                    defpackage.vi0 vi0Var2 = new defpackage.vi0(8, true);
                    vi0Var2.ZpBGe2uQfcn8((java.lang.Runnable) objectVolatile);
                    vi0Var2.ZpBGe2uQfcn8(runnable2);
                    do {
                        unsafe = defpackage.ed.ZpBGe2uQfcn8;
                        if (unsafe.compareAndSwapObject(awVar, T1fB7bDYiVJQ, objectVolatile, vi0Var2)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(awVar, j) == objectVolatile);
                    this = awVar;
                    runnable = runnable2;
                }
            }
        }
        return true;
    }

    public final void NkfcFfdaVTox() {
        defpackage.yv giKS3J6vZuNy;
        long nanoTime = java.lang.System.nanoTime();
        while (true) {
            fNwYGHIYeJcR.getClass();
            defpackage.zv zvVar = (defpackage.zv) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, gUjdnLbkVAaA);
            if (zvVar == null) {
                return;
            }
            synchronized (zvVar) {
                giKS3J6vZuNy = defpackage.ao1.giKS3J6vZuNy.get(zvVar) > 0 ? zvVar.giKS3J6vZuNy(0) : null;
            }
            if (giKS3J6vZuNy == null) {
                return;
            } else {
                z16KqenTjq8o(nanoTime, giKS3J6vZuNy);
            }
        }
    }

    public final void OVwOqzUGHcCU() {
        defpackage.yv yvVar;
        fNwYGHIYeJcR.getClass();
        defpackage.zv zvVar = (defpackage.zv) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, gUjdnLbkVAaA);
        if (zvVar == null || defpackage.ao1.giKS3J6vZuNy.get(zvVar) == 0) {
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        do {
            synchronized (zvVar) {
                try {
                    defpackage.yv[] yvVarArr = zvVar.ZpBGe2uQfcn8;
                    defpackage.yv yvVar2 = yvVarArr != null ? yvVarArr[0] : null;
                    if (yvVar2 != null) {
                        yvVar = ((nanoTime - yvVar2.WDYagTQQm9ns) > 0L ? 1 : ((nanoTime - yvVar2.WDYagTQQm9ns) == 0L ? 0 : -1)) >= 0 ? Jkfc0NcwyPL8(yvVar2) : false ? zvVar.giKS3J6vZuNy(0) : null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } while (yvVar != null);
    }

    public final void PS16moFv2oLu() {
        Ns0WNyEWdPsk.getClass();
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        unsafe.putObjectVolatile(this, T1fB7bDYiVJQ, (java.lang.Object) null);
        fNwYGHIYeJcR.getClass();
        unsafe.putObjectVolatile(this, gUjdnLbkVAaA, (java.lang.Object) null);
    }

    @Override // defpackage.uo
    public defpackage.cr QiMR8OkAhezm(long j, defpackage.ho1 ho1Var, defpackage.jm jmVar) {
        return defpackage.vn.ZpBGe2uQfcn8.QiMR8OkAhezm(j, ho1Var, jmVar);
    }

    public void Wc0TdmRSwbbi(java.lang.Runnable runnable) {
        OVwOqzUGHcCU();
        if (!Jkfc0NcwyPL8(runnable)) {
            defpackage.un.XntWc4eZSQ8j.Wc0TdmRSwbbi(runnable);
            return;
        }
        java.lang.Thread CZa7MwI9IzLd = CZa7MwI9IzLd();
        if (java.lang.Thread.currentThread() != CZa7MwI9IzLd) {
            java.util.concurrent.locks.LockSupport.unpark(CZa7MwI9IzLd);
        }
    }

    @Override // defpackage.uo
    public final void e6mdH7fiFuta(long j, defpackage.dd ddVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = java.lang.System.nanoTime();
            defpackage.wv wvVar = new defpackage.wv(this, j2 + nanoTime, ddVar);
            GoIRkIe1iwj6(nanoTime, wvVar);
            ddVar.dG7RjM6DqYVL(new defpackage.yc(2, wvVar));
        }
    }

    public final int fhbmYuu9J3cT(long j, defpackage.yv yvVar) {
        defpackage.aw awVar;
        sun.misc.Unsafe unsafe;
        if (h3m55N1URyyK.get(this) != 0) {
            return 1;
        }
        fNwYGHIYeJcR.getClass();
        sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
        long j2 = gUjdnLbkVAaA;
        defpackage.zv zvVar = (defpackage.zv) unsafe2.getObjectVolatile(this, j2);
        if (zvVar == null) {
            defpackage.zv zvVar2 = new defpackage.zv();
            zvVar2.fWTAfUmVKrZq = j;
            while (true) {
                unsafe = defpackage.ed.ZpBGe2uQfcn8;
                awVar = this;
                if (!unsafe.compareAndSwapObject(awVar, gUjdnLbkVAaA, (java.lang.Object) null, zvVar2) && unsafe.getObjectVolatile(awVar, j2) == null) {
                    this = awVar;
                }
            }
            java.lang.Object objectVolatile = unsafe.getObjectVolatile(awVar, j2);
            objectVolatile.getClass();
            zvVar = (defpackage.zv) objectVolatile;
        } else {
            awVar = this;
        }
        return yvVar.giKS3J6vZuNy(j, zvVar, awVar);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        Wc0TdmRSwbbi(runnable);
    }

    @Override // defpackage.vv
    public void shutdown() {
        defpackage.xn1.ZpBGe2uQfcn8.set(null);
        h3m55N1URyyK.set(this, 1);
        w6IV1lieBIux();
        while (GcLuU6pT9wO9() <= 0) {
        }
        NkfcFfdaVTox();
    }

    public final void w6IV1lieBIux() {
        defpackage.aw awVar;
        sun.misc.Unsafe unsafe;
        defpackage.ru ruVar = defpackage.nn.WDYagTQQm9ns;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = T1fB7bDYiVJQ;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    awVar = this;
                    if (unsafe3.compareAndSwapObject(awVar, T1fB7bDYiVJQ, (java.lang.Object) null, ruVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(awVar, j) != null) {
                        break;
                    } else {
                        this = awVar;
                    }
                }
            } else {
                awVar = this;
                if (objectVolatile instanceof defpackage.vi0) {
                    ((defpackage.vi0) objectVolatile).fWTAfUmVKrZq();
                    return;
                }
                if (objectVolatile == ruVar) {
                    return;
                }
                defpackage.vi0 vi0Var = new defpackage.vi0(8, true);
                vi0Var.ZpBGe2uQfcn8((java.lang.Runnable) objectVolatile);
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(awVar, T1fB7bDYiVJQ, objectVolatile, vi0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(awVar, j) == objectVolatile);
            }
            this = awVar;
        }
    }

    public void z16KqenTjq8o(long j, defpackage.yv yvVar) {
        defpackage.un.XntWc4eZSQ8j.GoIRkIe1iwj6(j, yvVar);
    }

    public final java.lang.Runnable zJPqDeoF0Os1() {
        defpackage.aw awVar;
        sun.misc.Unsafe unsafe;
        while (true) {
            Ns0WNyEWdPsk.getClass();
            sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
            long j = T1fB7bDYiVJQ;
            java.lang.Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof defpackage.vi0) {
                defpackage.vi0 vi0Var = (defpackage.vi0) objectVolatile;
                java.lang.Object WDYagTQQm9ns = vi0Var.WDYagTQQm9ns();
                if (WDYagTQQm9ns != defpackage.vi0.QiMR8OkAhezm) {
                    return (java.lang.Runnable) WDYagTQQm9ns;
                }
                defpackage.vi0 JhCgjQRTAOCT = vi0Var.JhCgjQRTAOCT();
                while (true) {
                    sun.misc.Unsafe unsafe3 = defpackage.ed.ZpBGe2uQfcn8;
                    awVar = this;
                    if (!unsafe3.compareAndSwapObject(awVar, T1fB7bDYiVJQ, objectVolatile, JhCgjQRTAOCT) && unsafe3.getObjectVolatile(awVar, j) == objectVolatile) {
                        this = awVar;
                    }
                }
            } else {
                awVar = this;
                if (objectVolatile == defpackage.nn.WDYagTQQm9ns) {
                    return null;
                }
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(awVar, T1fB7bDYiVJQ, objectVolatile, (java.lang.Object) null)) {
                        return (java.lang.Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(awVar, j) == objectVolatile);
            }
            this = awVar;
        }
    }
}
