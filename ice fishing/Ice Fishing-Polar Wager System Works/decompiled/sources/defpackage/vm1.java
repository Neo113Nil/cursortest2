package defpackage;

/* loaded from: classes.dex */
public abstract class vm1 {
    public final defpackage.wm1 IHQe1A4L2xu = new defpackage.wm1();

    public final void IHQe1A4L2xu(java.lang.String str, java.lang.AutoCloseable autoCloseable) {
        java.lang.AutoCloseable autoCloseable2;
        defpackage.wm1 wm1Var = this.IHQe1A4L2xu;
        if (wm1Var != null) {
            if (wm1Var.F7NU4MC0GW) {
                defpackage.wm1.IHQe1A4L2xu(autoCloseable);
                return;
            }
            synchronized (wm1Var.IHQe1A4L2xu) {
                autoCloseable2 = (java.lang.AutoCloseable) wm1Var.oh6vYeIP.put(str, autoCloseable);
            }
            defpackage.wm1.IHQe1A4L2xu(autoCloseable2);
        }
    }

    public final void oh6vYeIP() {
        defpackage.wm1 wm1Var = this.IHQe1A4L2xu;
        if (wm1Var != null && !wm1Var.F7NU4MC0GW) {
            wm1Var.F7NU4MC0GW = true;
            synchronized (wm1Var.IHQe1A4L2xu) {
                try {
                    java.util.Iterator it = wm1Var.oh6vYeIP.values().iterator();
                    while (it.hasNext()) {
                        defpackage.wm1.IHQe1A4L2xu((java.lang.AutoCloseable) it.next());
                    }
                    java.util.Iterator it2 = wm1Var.r1MBDhnF.iterator();
                    while (it2.hasNext()) {
                        defpackage.wm1.IHQe1A4L2xu((java.lang.AutoCloseable) it2.next());
                    }
                    wm1Var.r1MBDhnF.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        F7NU4MC0GW();
    }

    public final java.lang.AutoCloseable r1MBDhnF(java.lang.String str) {
        java.lang.AutoCloseable autoCloseable;
        defpackage.wm1 wm1Var = this.IHQe1A4L2xu;
        if (wm1Var == null) {
            return null;
        }
        synchronized (wm1Var.IHQe1A4L2xu) {
            autoCloseable = (java.lang.AutoCloseable) wm1Var.oh6vYeIP.get(str);
        }
        return autoCloseable;
    }

    public void F7NU4MC0GW() {
    }
}
