package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class ti0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater ZpBGe2uQfcn8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.ti0.class, java.lang.Object.class, "_cur$volatile");
    public static final /* synthetic */ long giKS3J6vZuNy = defpackage.ed.ZpBGe2uQfcn8.objectFieldOffset(defpackage.ti0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ java.lang.Object _cur$volatile = new defpackage.vi0(8, false);

    public final java.lang.Object JhCgjQRTAOCT() {
        defpackage.ti0 ti0Var;
        while (true) {
            ZpBGe2uQfcn8.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = giKS3J6vZuNy;
            defpackage.vi0 vi0Var = (defpackage.vi0) unsafe.getObjectVolatile(this, j);
            java.lang.Object WDYagTQQm9ns = vi0Var.WDYagTQQm9ns();
            if (WDYagTQQm9ns != defpackage.vi0.QiMR8OkAhezm) {
                return WDYagTQQm9ns;
            }
            defpackage.vi0 JhCgjQRTAOCT = vi0Var.JhCgjQRTAOCT();
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                ti0Var = this;
                if (!unsafe2.compareAndSwapObject(ti0Var, giKS3J6vZuNy, vi0Var, JhCgjQRTAOCT) && unsafe2.getObjectVolatile(ti0Var, j) == vi0Var) {
                    this = ti0Var;
                }
            }
            this = ti0Var;
        }
    }

    public final boolean ZpBGe2uQfcn8(java.lang.Runnable runnable) {
        defpackage.ti0 ti0Var;
        while (true) {
            ZpBGe2uQfcn8.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = giKS3J6vZuNy;
            defpackage.vi0 vi0Var = (defpackage.vi0) unsafe.getObjectVolatile(this, j);
            int ZpBGe2uQfcn82 = vi0Var.ZpBGe2uQfcn8(runnable);
            if (ZpBGe2uQfcn82 == 0) {
                return true;
            }
            if (ZpBGe2uQfcn82 == 1) {
                defpackage.vi0 JhCgjQRTAOCT = vi0Var.JhCgjQRTAOCT();
                while (true) {
                    sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                    ti0Var = this;
                    if (!unsafe2.compareAndSwapObject(ti0Var, giKS3J6vZuNy, vi0Var, JhCgjQRTAOCT) && unsafe2.getObjectVolatile(ti0Var, j) == vi0Var) {
                        this = ti0Var;
                    }
                }
            } else {
                if (ZpBGe2uQfcn82 == 2) {
                    return false;
                }
                ti0Var = this;
            }
            this = ti0Var;
        }
    }

    public final int fWTAfUmVKrZq() {
        ZpBGe2uQfcn8.getClass();
        defpackage.vi0 vi0Var = (defpackage.vi0) defpackage.ed.ZpBGe2uQfcn8.getObjectVolatile(this, giKS3J6vZuNy);
        vi0Var.getClass();
        long j = defpackage.vi0.oh71FJcDz6S2.get(vi0Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final void giKS3J6vZuNy() {
        defpackage.ti0 ti0Var;
        while (true) {
            ZpBGe2uQfcn8.getClass();
            sun.misc.Unsafe unsafe = defpackage.ed.ZpBGe2uQfcn8;
            long j = giKS3J6vZuNy;
            defpackage.vi0 vi0Var = (defpackage.vi0) unsafe.getObjectVolatile(this, j);
            if (vi0Var.fWTAfUmVKrZq()) {
                return;
            }
            defpackage.vi0 JhCgjQRTAOCT = vi0Var.JhCgjQRTAOCT();
            while (true) {
                sun.misc.Unsafe unsafe2 = defpackage.ed.ZpBGe2uQfcn8;
                ti0Var = this;
                if (!unsafe2.compareAndSwapObject(ti0Var, giKS3J6vZuNy, vi0Var, JhCgjQRTAOCT) && unsafe2.getObjectVolatile(ti0Var, j) == vi0Var) {
                    this = ti0Var;
                }
            }
            this = ti0Var;
        }
    }
}
