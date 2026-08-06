package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class wj {
    public static final /* synthetic */ long JhCgjQRTAOCT;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater ZpBGe2uQfcn8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.wj.class, java.lang.Object.class, "_next$volatile");
    public static final /* synthetic */ long fWTAfUmVKrZq;
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater giKS3J6vZuNy;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
        sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
        fWTAfUmVKrZq = unsafe.objectFieldOffset(defpackage.wj.class.getDeclaredField("_next$volatile"));
        giKS3J6vZuNy = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.wj.class, java.lang.Object.class, "_prev$volatile");
        JhCgjQRTAOCT = unsafe.objectFieldOffset(defpackage.wj.class.getDeclaredField("_prev$volatile"));
    }

    public wj(defpackage.ka1 ka1Var) {
        this._prev$volatile = ka1Var;
    }

    public final java.lang.Object JhCgjQRTAOCT() {
        ZpBGe2uQfcn8.getClass();
        return defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, fWTAfUmVKrZq);
    }

    public final void P05cfTpS5W5L() {
        defpackage.wj wjVar;
        sun.misc.Unsafe unsafe;
        if (fWTAfUmVKrZq() == null) {
            return;
        }
        while (true) {
            defpackage.wj giKS3J6vZuNy2 = giKS3J6vZuNy();
            defpackage.wj fWTAfUmVKrZq2 = fWTAfUmVKrZq();
            fWTAfUmVKrZq2.getClass();
            do {
                wjVar = fWTAfUmVKrZq2;
                if (!wjVar.oh71FJcDz6S2()) {
                    break;
                } else {
                    fWTAfUmVKrZq2 = wjVar.fWTAfUmVKrZq();
                }
            } while (fWTAfUmVKrZq2 != null);
            while (true) {
                giKS3J6vZuNy.getClass();
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                long j = JhCgjQRTAOCT;
                java.lang.Object objectVolatile = unsafe2.getObjectVolatile(wjVar, j);
                defpackage.wj wjVar2 = ((defpackage.wj) objectVolatile) == null ? null : giKS3J6vZuNy2;
                do {
                    unsafe = defpackage.ed.ZpBGe2uQfcn8;
                    if (unsafe.compareAndSwapObject(wjVar, JhCgjQRTAOCT, objectVolatile, wjVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(wjVar, j) == objectVolatile);
            }
            if (giKS3J6vZuNy2 != null) {
                ZpBGe2uQfcn8.getClass();
                unsafe.putObjectVolatile(giKS3J6vZuNy2, fWTAfUmVKrZq, wjVar);
            }
            if (!wjVar.oh71FJcDz6S2() || wjVar.fWTAfUmVKrZq() == null) {
                if (giKS3J6vZuNy2 == null || !giKS3J6vZuNy2.oh71FJcDz6S2()) {
                    return;
                }
            }
        }
    }

    public final boolean QiMR8OkAhezm() {
        defpackage.ru ruVar = defpackage.nq1.JhCgjQRTAOCT;
        while (true) {
            ZpBGe2uQfcn8.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = fWTAfUmVKrZq;
            defpackage.wj wjVar = this;
            if (unsafe.compareAndSwapObject(wjVar, j, (java.lang.Object) null, ruVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(wjVar, j) != null) {
                return false;
            }
            this = wjVar;
        }
    }

    public final defpackage.wj WDYagTQQm9ns() {
        giKS3J6vZuNy.getClass();
        return (defpackage.wj) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, JhCgjQRTAOCT);
    }

    public final void ZpBGe2uQfcn8() {
        giKS3J6vZuNy.getClass();
        defpackage.ed.ZpBGe2uQfcn8.putObjectVolatile(this, JhCgjQRTAOCT, (java.lang.Object) null);
    }

    public final boolean e6mdH7fiFuta(defpackage.ka1 ka1Var) {
        while (true) {
            ZpBGe2uQfcn8.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = fWTAfUmVKrZq;
            defpackage.wj wjVar = this;
            defpackage.ka1 ka1Var2 = ka1Var;
            if (unsafe.compareAndSwapObject(wjVar, j, (java.lang.Object) null, ka1Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(wjVar, j) != null) {
                return false;
            }
            this = wjVar;
            ka1Var = ka1Var2;
        }
    }

    public final defpackage.wj fWTAfUmVKrZq() {
        java.lang.Object JhCgjQRTAOCT2 = JhCgjQRTAOCT();
        if (JhCgjQRTAOCT2 == defpackage.nq1.JhCgjQRTAOCT) {
            return null;
        }
        return (defpackage.wj) JhCgjQRTAOCT2;
    }

    public final defpackage.wj giKS3J6vZuNy() {
        defpackage.wj WDYagTQQm9ns = WDYagTQQm9ns();
        while (WDYagTQQm9ns != null && WDYagTQQm9ns.oh71FJcDz6S2()) {
            giKS3J6vZuNy.getClass();
            WDYagTQQm9ns = (defpackage.wj) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(WDYagTQQm9ns, JhCgjQRTAOCT);
        }
        return WDYagTQQm9ns;
    }

    public abstract boolean oh71FJcDz6S2();
}
