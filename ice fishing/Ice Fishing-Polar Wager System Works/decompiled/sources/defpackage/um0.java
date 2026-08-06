package defpackage;

/* loaded from: classes.dex */
public final class um0 {
    public final defpackage.oo0 AARZUJiTa;
    public final /* synthetic */ defpackage.qn0 EXtogiMhuM;
    public boolean F7NU4MC0GW;
    public final defpackage.c41 IHQe1A4L2xu;
    public final defpackage.xy0 adDC3e2L;
    public final defpackage.hc1 oh6vYeIP;
    public final defpackage.hc1 r1MBDhnF;
    public final defpackage.xy0 xiZrDbcSW0;

    public um0(defpackage.qn0 qn0Var, defpackage.oo0 oo0Var) {
        oo0Var.getClass();
        this.EXtogiMhuM = qn0Var;
        this.IHQe1A4L2xu = new defpackage.c41(7);
        defpackage.hc1 F7NU4MC0GW = defpackage.gq1.F7NU4MC0GW(defpackage.nt.adDC3e2L);
        this.oh6vYeIP = F7NU4MC0GW;
        defpackage.hc1 F7NU4MC0GW2 = defpackage.gq1.F7NU4MC0GW(defpackage.rt.adDC3e2L);
        this.r1MBDhnF = F7NU4MC0GW2;
        this.adDC3e2L = new defpackage.xy0(F7NU4MC0GW);
        this.xiZrDbcSW0 = new defpackage.xy0(F7NU4MC0GW2);
        this.AARZUJiTa = oo0Var;
    }

    public final void F7NU4MC0GW(defpackage.nm0 nm0Var, boolean z) {
        defpackage.ym0 ym0Var = this.EXtogiMhuM.oh6vYeIP;
        defpackage.DSux0S2nxMSk dSux0S2nxMSk = new defpackage.DSux0S2nxMSk(this, nm0Var, z);
        ym0Var.getClass();
        defpackage.oo0 oh6vYeIP = ym0Var.EgCjBq0SZwJ.oh6vYeIP(nm0Var.xiZrDbcSW0.adDC3e2L);
        ym0Var.PAEGRtP0bX.put(nm0Var, java.lang.Boolean.valueOf(z));
        if (!oh6vYeIP.equals(this.AARZUJiTa)) {
            java.lang.Object obj = ym0Var.fnWB2E7cs.get(oh6vYeIP);
            obj.getClass();
            ((defpackage.um0) obj).F7NU4MC0GW(nm0Var, z);
            return;
        }
        defpackage.wm0 wm0Var = ym0Var.V7bD7b8KA;
        if (wm0Var != null) {
            wm0Var.AARZUJiTa(nm0Var);
            dSux0S2nxMSk.IHQe1A4L2xu();
            return;
        }
        defpackage.l6 l6Var = ym0Var.xiZrDbcSW0;
        int indexOf = l6Var.indexOf(nm0Var);
        if (indexOf < 0) {
            android.util.Log.i("NavController", "Ignoring pop of " + nm0Var + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != l6Var.AARZUJiTa) {
            ym0Var.SyNS6RMn(((defpackage.nm0) l6Var.get(i)).xiZrDbcSW0.xiZrDbcSW0.IHQe1A4L2xu, true, false);
        }
        defpackage.ym0.QoRHpC4k(ym0Var, nm0Var);
        dSux0S2nxMSk.IHQe1A4L2xu();
        ym0Var.oh6vYeIP.IHQe1A4L2xu();
        ym0Var.oh6vYeIP();
    }

    public final void IHQe1A4L2xu(defpackage.nm0 nm0Var) {
        nm0Var.getClass();
        synchronized (this.IHQe1A4L2xu) {
            defpackage.hc1 hc1Var = this.oh6vYeIP;
            hc1Var.ez2rX8ReCYw(null, defpackage.td.ZNF7fheNE((java.util.Collection) hc1Var.getValue(), nm0Var));
        }
    }

    public final void adDC3e2L(defpackage.nm0 nm0Var, boolean z) {
        java.lang.Object obj;
        defpackage.hc1 hc1Var = this.r1MBDhnF;
        java.lang.Iterable iterable = (java.lang.Iterable) hc1Var.getValue();
        boolean z2 = iterable instanceof java.util.Collection;
        defpackage.xy0 xy0Var = this.adDC3e2L;
        if (!z2 || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((defpackage.nm0) it.next()) == nm0Var) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) xy0Var.adDC3e2L.getValue();
                    if ((iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable2).isEmpty()) {
                        return;
                    }
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((defpackage.nm0) it2.next()) == nm0Var) {
                        }
                    }
                    return;
                }
            }
        }
        hc1Var.ez2rX8ReCYw(null, defpackage.e81.QPwENk36pDC((java.util.Set) hc1Var.getValue(), nm0Var));
        defpackage.hc1 hc1Var2 = xy0Var.adDC3e2L;
        defpackage.hc1 hc1Var3 = xy0Var.adDC3e2L;
        java.util.List list = (java.util.List) hc1Var2.getValue();
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            defpackage.nm0 nm0Var2 = (defpackage.nm0) obj;
            if (!defpackage.x70.QoRHpC4k(nm0Var2, nm0Var) && ((java.util.List) hc1Var3.getValue()).lastIndexOf(nm0Var2) < ((java.util.List) hc1Var3.getValue()).lastIndexOf(nm0Var)) {
                break;
            }
        }
        defpackage.nm0 nm0Var3 = (defpackage.nm0) obj;
        if (nm0Var3 != null) {
            hc1Var.ez2rX8ReCYw(null, defpackage.e81.QPwENk36pDC((java.util.Set) hc1Var.getValue(), nm0Var3));
        }
        F7NU4MC0GW(nm0Var, z);
    }

    public final defpackage.nm0 oh6vYeIP(defpackage.gn0 gn0Var, android.os.Bundle bundle) {
        defpackage.ym0 ym0Var = this.EXtogiMhuM.oh6vYeIP;
        ym0Var.getClass();
        return defpackage.ky.ez2rX8ReCYw(ym0Var.IHQe1A4L2xu.r1MBDhnF, gn0Var, bundle, ym0Var.riuEU0zW4(), ym0Var.cnag84Bm);
    }

    public final void r1MBDhnF(defpackage.nm0 nm0Var) {
        defpackage.zm0 zm0Var;
        nm0Var.getClass();
        defpackage.ym0 ym0Var = this.EXtogiMhuM.oh6vYeIP;
        defpackage.hc1 hc1Var = ym0Var.EXtogiMhuM;
        java.lang.String str = nm0Var.SH1y5HwkJhh;
        java.util.LinkedHashMap linkedHashMap = ym0Var.PAEGRtP0bX;
        boolean QoRHpC4k = defpackage.x70.QoRHpC4k(linkedHashMap.get(nm0Var), java.lang.Boolean.TRUE);
        defpackage.hc1 hc1Var2 = this.r1MBDhnF;
        java.util.Set set = (java.util.Set) hc1Var2.getValue();
        set.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.yh0.yIx6ChFVk(set.size()));
        boolean z = false;
        for (java.lang.Object obj : set) {
            boolean z2 = true;
            if (!z && defpackage.x70.QoRHpC4k(obj, nm0Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        hc1Var2.ez2rX8ReCYw(null, linkedHashSet);
        linkedHashMap.remove(nm0Var);
        defpackage.l6 l6Var = ym0Var.xiZrDbcSW0;
        if (l6Var.contains(nm0Var)) {
            if (this.F7NU4MC0GW) {
                return;
            }
            ym0Var.fnWB2E7cs();
            defpackage.hc1 hc1Var3 = ym0Var.AARZUJiTa;
            java.util.ArrayList arrayList = new java.util.ArrayList(l6Var);
            hc1Var3.getClass();
            hc1Var3.ez2rX8ReCYw(null, arrayList);
            java.util.ArrayList G3OKOH3wZRC = ym0Var.G3OKOH3wZRC();
            hc1Var.getClass();
            hc1Var.ez2rX8ReCYw(null, G3OKOH3wZRC);
            return;
        }
        ym0Var.EgCjBq0SZwJ(nm0Var);
        if (nm0Var.JlrlGoKF.SH1y5HwkJhh.EXtogiMhuM.compareTo(defpackage.nd0.AARZUJiTa) >= 0) {
            nm0Var.IHQe1A4L2xu(defpackage.nd0.adDC3e2L);
        }
        if (!l6Var.isEmpty()) {
            java.util.Iterator it = l6Var.iterator();
            while (it.hasNext()) {
                if (defpackage.x70.QoRHpC4k(((defpackage.nm0) it.next()).SH1y5HwkJhh, str)) {
                    break;
                }
            }
        }
        if (!QoRHpC4k && (zm0Var = ym0Var.cnag84Bm) != null) {
            str.getClass();
            defpackage.bn1 bn1Var = (defpackage.bn1) zm0Var.oh6vYeIP.remove(str);
            if (bn1Var != null) {
                bn1Var.IHQe1A4L2xu();
            }
        }
        ym0Var.fnWB2E7cs();
        java.util.ArrayList G3OKOH3wZRC2 = ym0Var.G3OKOH3wZRC();
        hc1Var.getClass();
        hc1Var.ez2rX8ReCYw(null, G3OKOH3wZRC2);
    }

    public final void xiZrDbcSW0(defpackage.nm0 nm0Var) {
        nm0Var.getClass();
        defpackage.ym0 ym0Var = this.EXtogiMhuM.oh6vYeIP;
        ym0Var.getClass();
        defpackage.oo0 oh6vYeIP = ym0Var.EgCjBq0SZwJ.oh6vYeIP(nm0Var.xiZrDbcSW0.adDC3e2L);
        if (!oh6vYeIP.equals(this.AARZUJiTa)) {
            java.lang.Object obj = ym0Var.fnWB2E7cs.get(oh6vYeIP);
            if (obj != null) {
                ((defpackage.um0) obj).xiZrDbcSW0(nm0Var);
                return;
            } else {
                defpackage.db.riuEU0zW4("NavigatorBackStack for ", nm0Var.xiZrDbcSW0.adDC3e2L, " should already be created");
                return;
            }
        }
        defpackage.g00 g00Var = ym0Var.kNAkVymC;
        if (g00Var != null) {
            g00Var.AARZUJiTa(nm0Var);
            IHQe1A4L2xu(nm0Var);
        } else {
            android.util.Log.i("NavController", "Ignoring add of destination " + nm0Var.xiZrDbcSW0 + " outside of the call to navigate(). ");
        }
    }
}
