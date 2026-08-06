package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
@defpackage.xq0("composable")
/* loaded from: classes.dex */
public final class gi extends defpackage.yq0 {
    public final defpackage.pw0 fWTAfUmVKrZq = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);

    @Override // defpackage.yq0
    public final void JhCgjQRTAOCT(java.util.List list, defpackage.jq0 jq0Var) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.xo0 xo0Var = (defpackage.xo0) it.next();
            defpackage.cp0 giKS3J6vZuNy = giKS3J6vZuNy();
            defpackage.c31 c31Var = giKS3J6vZuNy.WDYagTQQm9ns;
            xo0Var.getClass();
            defpackage.gg1 gg1Var = giKS3J6vZuNy.fWTAfUmVKrZq;
            java.lang.Iterable iterable = (java.lang.Iterable) gg1Var.getValue();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((defpackage.xo0) it2.next()) == xo0Var) {
                        java.lang.Iterable iterable2 = (java.lang.Iterable) c31Var.WDYagTQQm9ns.getValue();
                        if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                            java.util.Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((defpackage.xo0) it3.next()) == xo0Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            defpackage.xo0 xo0Var2 = (defpackage.xo0) defpackage.hf.LCK4GGEwbWAr((java.util.List) c31Var.WDYagTQQm9ns.getValue());
            if (xo0Var2 != null) {
                gg1Var.GE9mJIPrb8gP(null, defpackage.wc1.EPEWHACkMcF1((java.util.Set) gg1Var.getValue(), xo0Var2));
            }
            gg1Var.GE9mJIPrb8gP(null, defpackage.wc1.EPEWHACkMcF1((java.util.Set) gg1Var.getValue(), xo0Var));
            giKS3J6vZuNy.oh71FJcDz6S2(xo0Var);
        }
        this.fWTAfUmVKrZq.setValue(java.lang.Boolean.FALSE);
    }

    public final void QiMR8OkAhezm(defpackage.xo0 xo0Var) {
        defpackage.cp0 giKS3J6vZuNy = giKS3J6vZuNy();
        xo0Var.getClass();
        defpackage.gg1 gg1Var = giKS3J6vZuNy.fWTAfUmVKrZq;
        gg1Var.GE9mJIPrb8gP(null, defpackage.wc1.EPEWHACkMcF1((java.util.Set) gg1Var.getValue(), xo0Var));
        defpackage.ep0 ep0Var = giKS3J6vZuNy.P05cfTpS5W5L.giKS3J6vZuNy;
        ep0Var.getClass();
        if (ep0Var.oh71FJcDz6S2.contains(xo0Var)) {
            xo0Var.ZpBGe2uQfcn8(defpackage.pg0.P05cfTpS5W5L);
        } else {
            defpackage.h7.P05cfTpS5W5L("Cannot transition entry that is not in the back stack");
        }
    }

    @Override // defpackage.yq0
    public final void WDYagTQQm9ns(defpackage.xo0 xo0Var, boolean z) {
        giKS3J6vZuNy().WDYagTQQm9ns(xo0Var, z);
        this.fWTAfUmVKrZq.setValue(java.lang.Boolean.TRUE);
    }

    @Override // defpackage.yq0
    public final defpackage.np0 ZpBGe2uQfcn8() {
        return new defpackage.fi(this, defpackage.sh.ZpBGe2uQfcn8);
    }
}
