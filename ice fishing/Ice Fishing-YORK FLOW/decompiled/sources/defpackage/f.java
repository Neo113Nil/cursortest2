package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.sn0 sn0Var = defpackage.u.vgZvSmsixr00;
        synchronized (sn0Var) {
            try {
                int i = android.os.Build.VERSION.SDK_INT;
                java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
                int i2 = sn0Var.giKS3J6vZuNy;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        defpackage.u uVar = (defpackage.u) objArr[i3];
                        boolean showLayoutBounds = uVar.getShowLayoutBounds();
                        java.lang.Class cls = defpackage.u.J2k156ROr5mz;
                        uVar.setShowLayoutBounds(defpackage.nn.VFeft99leXEK());
                        if (showLayoutBounds != uVar.getShowLayoutBounds()) {
                            uVar.post(new defpackage.d(uVar, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        defpackage.u uVar2 = (defpackage.u) objArr[i3];
                        uVar2.post(new defpackage.d(uVar2, 3));
                        i3++;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
