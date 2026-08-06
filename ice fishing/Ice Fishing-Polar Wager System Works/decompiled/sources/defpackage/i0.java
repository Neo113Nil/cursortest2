package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.gl0 gl0Var = defpackage.v0.c1NqjJifC7;
        synchronized (gl0Var) {
            try {
                int i = android.os.Build.VERSION.SDK_INT;
                java.lang.Object[] objArr = gl0Var.IHQe1A4L2xu;
                int i2 = gl0Var.oh6vYeIP;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        defpackage.v0 v0Var = (defpackage.v0) objArr[i3];
                        boolean showLayoutBounds = v0Var.getShowLayoutBounds();
                        java.lang.Class cls = defpackage.v0.GhHh9OOt4I;
                        v0Var.setShowLayoutBounds(defpackage.x70.v5iciZok());
                        if (showLayoutBounds != v0Var.getShowLayoutBounds()) {
                            v0Var.post(new defpackage.g0(v0Var, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        defpackage.v0 v0Var2 = (defpackage.v0) objArr[i3];
                        v0Var2.post(new defpackage.g0(v0Var2, 3));
                        i3++;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
