package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class iu1 {
    public final defpackage.ju1 ZpBGe2uQfcn8 = new defpackage.ju1();

    public final void ZpBGe2uQfcn8(java.lang.String str, java.lang.AutoCloseable autoCloseable) {
        java.lang.AutoCloseable autoCloseable2;
        defpackage.ju1 ju1Var = this.ZpBGe2uQfcn8;
        if (ju1Var != null) {
            if (ju1Var.JhCgjQRTAOCT) {
                defpackage.ju1.ZpBGe2uQfcn8(autoCloseable);
                return;
            }
            synchronized (ju1Var.ZpBGe2uQfcn8) {
                autoCloseable2 = (java.lang.AutoCloseable) ju1Var.giKS3J6vZuNy.put(str, autoCloseable);
            }
            defpackage.ju1.ZpBGe2uQfcn8(autoCloseable2);
        }
    }

    public final java.lang.AutoCloseable fWTAfUmVKrZq(java.lang.String str) {
        java.lang.AutoCloseable autoCloseable;
        defpackage.ju1 ju1Var = this.ZpBGe2uQfcn8;
        if (ju1Var == null) {
            return null;
        }
        synchronized (ju1Var.ZpBGe2uQfcn8) {
            autoCloseable = (java.lang.AutoCloseable) ju1Var.giKS3J6vZuNy.get(str);
        }
        return autoCloseable;
    }

    public final void giKS3J6vZuNy() {
        defpackage.ju1 ju1Var = this.ZpBGe2uQfcn8;
        if (ju1Var != null && !ju1Var.JhCgjQRTAOCT) {
            ju1Var.JhCgjQRTAOCT = true;
            synchronized (ju1Var.ZpBGe2uQfcn8) {
                try {
                    java.util.Iterator it = ju1Var.giKS3J6vZuNy.values().iterator();
                    while (it.hasNext()) {
                        defpackage.ju1.ZpBGe2uQfcn8((java.lang.AutoCloseable) it.next());
                    }
                    java.util.Iterator it2 = ju1Var.fWTAfUmVKrZq.iterator();
                    while (it2.hasNext()) {
                        defpackage.ju1.ZpBGe2uQfcn8((java.lang.AutoCloseable) it2.next());
                    }
                    ju1Var.fWTAfUmVKrZq.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        JhCgjQRTAOCT();
    }

    public void JhCgjQRTAOCT() {
    }
}
