package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cp0 {
    public boolean JhCgjQRTAOCT;
    public final /* synthetic */ defpackage.xp0 P05cfTpS5W5L;
    public final defpackage.yq0 QiMR8OkAhezm;
    public final defpackage.c31 WDYagTQQm9ns;
    public final defpackage.l21 ZpBGe2uQfcn8;
    public final defpackage.gg1 fWTAfUmVKrZq;
    public final defpackage.gg1 giKS3J6vZuNy;
    public final defpackage.c31 oh71FJcDz6S2;

    public cp0(defpackage.xp0 xp0Var, defpackage.yq0 yq0Var) {
        yq0Var.getClass();
        this.P05cfTpS5W5L = xp0Var;
        this.ZpBGe2uQfcn8 = new defpackage.l21(15);
        defpackage.gg1 fNwYGHIYeJcR = defpackage.nq1.fNwYGHIYeJcR(defpackage.av.WDYagTQQm9ns);
        this.giKS3J6vZuNy = fNwYGHIYeJcR;
        defpackage.gg1 fNwYGHIYeJcR2 = defpackage.nq1.fNwYGHIYeJcR(defpackage.ev.WDYagTQQm9ns);
        this.fWTAfUmVKrZq = fNwYGHIYeJcR2;
        this.WDYagTQQm9ns = new defpackage.c31(fNwYGHIYeJcR);
        this.oh71FJcDz6S2 = new defpackage.c31(fNwYGHIYeJcR2);
        this.QiMR8OkAhezm = yq0Var;
    }

    public final void JhCgjQRTAOCT(defpackage.xo0 xo0Var, boolean z) {
        xo0Var.getClass();
        defpackage.ep0 ep0Var = this.P05cfTpS5W5L.giKS3J6vZuNy;
        defpackage.S0YpfprlOYIn s0YpfprlOYIn = new defpackage.S0YpfprlOYIn(this, xo0Var, z);
        ep0Var.getClass();
        defpackage.yq0 giKS3J6vZuNy = ep0Var.BHfvd2J71qpO.giKS3J6vZuNy(xo0Var.oh71FJcDz6S2.WDYagTQQm9ns);
        ep0Var.IJ0hOnjhPOri.put(xo0Var, java.lang.Boolean.valueOf(z));
        if (!giKS3J6vZuNy.equals(this.QiMR8OkAhezm)) {
            java.lang.Object obj = ep0Var.ZVVdXbWmyCSK.get(giKS3J6vZuNy);
            obj.getClass();
            ((defpackage.cp0) obj).JhCgjQRTAOCT(xo0Var, z);
            return;
        }
        defpackage.dl0 dl0Var = ep0Var.maCixPsq4ml2;
        if (dl0Var != null) {
            dl0Var.P05cfTpS5W5L(xo0Var);
            s0YpfprlOYIn.ZpBGe2uQfcn8();
            return;
        }
        defpackage.p7 p7Var = ep0Var.oh71FJcDz6S2;
        int indexOf = p7Var.indexOf(xo0Var);
        if (indexOf < 0) {
            android.util.Log.i("NavController", "Ignoring pop of " + xo0Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != p7Var.QiMR8OkAhezm) {
            ep0Var.Ns0WNyEWdPsk(((defpackage.xo0) p7Var.get(i)).oh71FJcDz6S2.oh71FJcDz6S2.ZpBGe2uQfcn8, true, false);
        }
        defpackage.ep0.h3m55N1URyyK(ep0Var, xo0Var);
        s0YpfprlOYIn.ZpBGe2uQfcn8();
        ep0Var.giKS3J6vZuNy.ZpBGe2uQfcn8();
        ep0Var.giKS3J6vZuNy();
    }

    public final void WDYagTQQm9ns(defpackage.xo0 xo0Var, boolean z) {
        java.lang.Object obj;
        xo0Var.getClass();
        defpackage.gg1 gg1Var = this.fWTAfUmVKrZq;
        java.lang.Iterable iterable = (java.lang.Iterable) gg1Var.getValue();
        boolean z2 = iterable instanceof java.util.Collection;
        defpackage.c31 c31Var = this.WDYagTQQm9ns;
        if (!z2 || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((defpackage.xo0) it.next()) == xo0Var) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) c31Var.WDYagTQQm9ns.getValue();
                    if ((iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable2).isEmpty()) {
                        return;
                    }
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((defpackage.xo0) it2.next()) == xo0Var) {
                        }
                    }
                    return;
                }
            }
        }
        gg1Var.GE9mJIPrb8gP(null, defpackage.wc1.EPEWHACkMcF1((java.util.Set) gg1Var.getValue(), xo0Var));
        defpackage.gg1 gg1Var2 = c31Var.WDYagTQQm9ns;
        defpackage.gg1 gg1Var3 = c31Var.WDYagTQQm9ns;
        java.util.List list = (java.util.List) gg1Var2.getValue();
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            defpackage.xo0 xo0Var2 = (defpackage.xo0) obj;
            if (!defpackage.ma0.QiMR8OkAhezm(xo0Var2, xo0Var) && ((java.util.List) gg1Var3.getValue()).lastIndexOf(xo0Var2) < ((java.util.List) gg1Var3.getValue()).lastIndexOf(xo0Var)) {
                break;
            }
        }
        defpackage.xo0 xo0Var3 = (defpackage.xo0) obj;
        if (xo0Var3 != null) {
            gg1Var.GE9mJIPrb8gP(null, defpackage.wc1.EPEWHACkMcF1((java.util.Set) gg1Var.getValue(), xo0Var3));
        }
        JhCgjQRTAOCT(xo0Var, z);
    }

    public final void ZpBGe2uQfcn8(defpackage.xo0 xo0Var) {
        xo0Var.getClass();
        synchronized (this.ZpBGe2uQfcn8) {
            defpackage.gg1 gg1Var = this.giKS3J6vZuNy;
            gg1Var.GE9mJIPrb8gP(null, defpackage.hf.lXYSMswtzmix((java.util.Collection) gg1Var.getValue(), xo0Var));
        }
    }

    public final void fWTAfUmVKrZq(defpackage.xo0 xo0Var) {
        defpackage.fp0 fp0Var;
        xo0Var.getClass();
        defpackage.ep0 ep0Var = this.P05cfTpS5W5L.giKS3J6vZuNy;
        defpackage.gg1 gg1Var = ep0Var.P05cfTpS5W5L;
        java.lang.String str = xo0Var.GE9mJIPrb8gP;
        java.util.LinkedHashMap linkedHashMap = ep0Var.IJ0hOnjhPOri;
        boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(linkedHashMap.get(xo0Var), java.lang.Boolean.TRUE);
        defpackage.gg1 gg1Var2 = this.fWTAfUmVKrZq;
        java.util.Set set = (java.util.Set) gg1Var2.getValue();
        set.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.jk0.zJPqDeoF0Os1(set.size()));
        boolean z = false;
        for (java.lang.Object obj : set) {
            boolean z2 = true;
            if (!z && defpackage.ma0.QiMR8OkAhezm(obj, xo0Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        gg1Var2.GE9mJIPrb8gP(null, linkedHashSet);
        linkedHashMap.remove(xo0Var);
        defpackage.p7 p7Var = ep0Var.oh71FJcDz6S2;
        if (p7Var.contains(xo0Var)) {
            if (this.JhCgjQRTAOCT) {
                return;
            }
            ep0Var.WmetiUbpKU9I();
            defpackage.gg1 gg1Var3 = ep0Var.QiMR8OkAhezm;
            java.util.ArrayList arrayList = new java.util.ArrayList(p7Var);
            gg1Var3.getClass();
            gg1Var3.GE9mJIPrb8gP(null, arrayList);
            java.util.ArrayList gUjdnLbkVAaA = ep0Var.gUjdnLbkVAaA();
            gg1Var.getClass();
            gg1Var.GE9mJIPrb8gP(null, gUjdnLbkVAaA);
            return;
        }
        ep0Var.XntWc4eZSQ8j(xo0Var);
        if (xo0Var.fNwYGHIYeJcR.GE9mJIPrb8gP.P05cfTpS5W5L.compareTo(defpackage.pg0.QiMR8OkAhezm) >= 0) {
            xo0Var.ZpBGe2uQfcn8(defpackage.pg0.WDYagTQQm9ns);
        }
        if (!p7Var.isEmpty()) {
            java.util.Iterator it = p7Var.iterator();
            while (it.hasNext()) {
                if (defpackage.ma0.QiMR8OkAhezm(((defpackage.xo0) it.next()).GE9mJIPrb8gP, str)) {
                    break;
                }
            }
        }
        if (!QiMR8OkAhezm && (fp0Var = ep0Var.T1fB7bDYiVJQ) != null) {
            str.getClass();
            defpackage.qu1 qu1Var = (defpackage.qu1) fp0Var.giKS3J6vZuNy.remove(str);
            if (qu1Var != null) {
                qu1Var.ZpBGe2uQfcn8();
            }
        }
        ep0Var.WmetiUbpKU9I();
        java.util.ArrayList gUjdnLbkVAaA2 = ep0Var.gUjdnLbkVAaA();
        gg1Var.getClass();
        gg1Var.GE9mJIPrb8gP(null, gUjdnLbkVAaA2);
    }

    public final defpackage.xo0 giKS3J6vZuNy(defpackage.np0 np0Var, android.os.Bundle bundle) {
        defpackage.ep0 ep0Var = this.P05cfTpS5W5L.giKS3J6vZuNy;
        ep0Var.getClass();
        return defpackage.hu.Ns0WNyEWdPsk(ep0Var.ZpBGe2uQfcn8.fWTAfUmVKrZq, np0Var, bundle, ep0Var.QiMR8OkAhezm(), ep0Var.T1fB7bDYiVJQ);
    }

    public final void oh71FJcDz6S2(defpackage.xo0 xo0Var) {
        xo0Var.getClass();
        defpackage.ep0 ep0Var = this.P05cfTpS5W5L.giKS3J6vZuNy;
        ep0Var.getClass();
        defpackage.yq0 giKS3J6vZuNy = ep0Var.BHfvd2J71qpO.giKS3J6vZuNy(xo0Var.oh71FJcDz6S2.WDYagTQQm9ns);
        if (!giKS3J6vZuNy.equals(this.QiMR8OkAhezm)) {
            java.lang.Object obj = ep0Var.ZVVdXbWmyCSK.get(giKS3J6vZuNy);
            if (obj != null) {
                ((defpackage.cp0) obj).oh71FJcDz6S2(xo0Var);
                return;
            } else {
                defpackage.h7.e6mdH7fiFuta("NavigatorBackStack for ", xo0Var.oh71FJcDz6S2.WDYagTQQm9ns, " should already be created");
                return;
            }
        }
        defpackage.y10 y10Var = ep0Var.w7APNrr0aGRc;
        if (y10Var != null) {
            y10Var.P05cfTpS5W5L(xo0Var);
            ZpBGe2uQfcn8(xo0Var);
        } else {
            android.util.Log.i("NavController", "Ignoring add of destination " + xo0Var.oh71FJcDz6S2 + " outside of the call to navigate(). ");
        }
    }
}
