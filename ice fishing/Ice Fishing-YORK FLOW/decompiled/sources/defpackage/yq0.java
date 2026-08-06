package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class yq0 {
    public defpackage.cp0 ZpBGe2uQfcn8;
    public boolean giKS3J6vZuNy;

    public void JhCgjQRTAOCT(java.util.List list, defpackage.jq0 jq0Var) {
        defpackage.bx bxVar = new defpackage.bx(new defpackage.cx(new defpackage.dj1(new defpackage.of(0, list), new defpackage.fNwYGHIYeJcR(19, this, jq0Var), 1), new defpackage.g81(23), 0));
        while (bxVar.hasNext()) {
            giKS3J6vZuNy().oh71FJcDz6S2((defpackage.xo0) bxVar.next());
        }
    }

    public void WDYagTQQm9ns(defpackage.xo0 xo0Var, boolean z) {
        java.util.List list = (java.util.List) giKS3J6vZuNy().WDYagTQQm9ns.WDYagTQQm9ns.getValue();
        if (!list.contains(xo0Var)) {
            defpackage.h7.s0TASMVLSWD5("popBackStack was called with ", xo0Var, " which does not exist in back stack ", list);
            return;
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        defpackage.xo0 xo0Var2 = null;
        while (oh71FJcDz6S2()) {
            xo0Var2 = (defpackage.xo0) listIterator.previous();
            if (defpackage.ma0.QiMR8OkAhezm(xo0Var2, xo0Var)) {
                break;
            }
        }
        if (xo0Var2 != null) {
            giKS3J6vZuNy().JhCgjQRTAOCT(xo0Var2, z);
        }
    }

    public abstract defpackage.np0 ZpBGe2uQfcn8();

    public final defpackage.cp0 giKS3J6vZuNy() {
        defpackage.cp0 cp0Var = this.ZpBGe2uQfcn8;
        if (cp0Var != null) {
            return cp0Var;
        }
        defpackage.h7.P05cfTpS5W5L("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public boolean oh71FJcDz6S2() {
        return true;
    }

    public defpackage.np0 fWTAfUmVKrZq(defpackage.np0 np0Var) {
        return np0Var;
    }
}
