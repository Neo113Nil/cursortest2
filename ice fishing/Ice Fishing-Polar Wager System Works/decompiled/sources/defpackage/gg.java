package defpackage;

@defpackage.no0("composable")
/* loaded from: classes.dex */
public final class gg extends defpackage.oo0 {
    public final defpackage.qt0 r1MBDhnF = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);

    public final void AARZUJiTa(defpackage.nm0 nm0Var) {
        defpackage.um0 oh6vYeIP = oh6vYeIP();
        nm0Var.getClass();
        defpackage.hc1 hc1Var = oh6vYeIP.r1MBDhnF;
        hc1Var.ez2rX8ReCYw(null, defpackage.e81.QPwENk36pDC((java.util.Set) hc1Var.getValue(), nm0Var));
        defpackage.ym0 ym0Var = oh6vYeIP.EXtogiMhuM.oh6vYeIP;
        ym0Var.getClass();
        if (ym0Var.xiZrDbcSW0.contains(nm0Var)) {
            nm0Var.IHQe1A4L2xu(defpackage.nd0.EXtogiMhuM);
        } else {
            defpackage.db.AARZUJiTa("Cannot transition entry that is not in the back stack");
        }
    }

    @Override // defpackage.oo0
    public final void F7NU4MC0GW(java.util.List list, defpackage.co0 co0Var) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.nm0 nm0Var = (defpackage.nm0) it.next();
            defpackage.um0 oh6vYeIP = oh6vYeIP();
            defpackage.xy0 xy0Var = oh6vYeIP.adDC3e2L;
            nm0Var.getClass();
            defpackage.hc1 hc1Var = oh6vYeIP.r1MBDhnF;
            java.lang.Iterable iterable = (java.lang.Iterable) hc1Var.getValue();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((defpackage.nm0) it2.next()) == nm0Var) {
                        java.lang.Iterable iterable2 = (java.lang.Iterable) xy0Var.adDC3e2L.getValue();
                        if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                            java.util.Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((defpackage.nm0) it3.next()) == nm0Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            defpackage.nm0 nm0Var2 = (defpackage.nm0) defpackage.td.FyULxpbU8bu((java.util.List) xy0Var.adDC3e2L.getValue());
            if (nm0Var2 != null) {
                hc1Var.ez2rX8ReCYw(null, defpackage.e81.QPwENk36pDC((java.util.Set) hc1Var.getValue(), nm0Var2));
            }
            hc1Var.ez2rX8ReCYw(null, defpackage.e81.QPwENk36pDC((java.util.Set) hc1Var.getValue(), nm0Var));
            oh6vYeIP.xiZrDbcSW0(nm0Var);
        }
        this.r1MBDhnF.setValue(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.oo0
    public final defpackage.gn0 IHQe1A4L2xu() {
        return new defpackage.fg(this, defpackage.vf.IHQe1A4L2xu);
    }

    @Override // defpackage.oo0
    public final void adDC3e2L(defpackage.nm0 nm0Var, boolean z) {
        oh6vYeIP().adDC3e2L(nm0Var, z);
        this.r1MBDhnF.setValue(java.lang.Boolean.TRUE);
    }
}
