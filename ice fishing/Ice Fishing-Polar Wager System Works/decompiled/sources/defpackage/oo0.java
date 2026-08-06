package defpackage;

/* loaded from: classes.dex */
public abstract class oo0 {
    public defpackage.um0 IHQe1A4L2xu;
    public boolean oh6vYeIP;

    public void F7NU4MC0GW(java.util.List list, defpackage.co0 co0Var) {
        defpackage.qv qvVar = new defpackage.qv(new defpackage.rv(new defpackage.ue1(new defpackage.zd(0, list), new defpackage.DFo87pBq1E5(17, this, co0Var), 1), new defpackage.r41(4), 0));
        while (qvVar.hasNext()) {
            oh6vYeIP().xiZrDbcSW0((defpackage.nm0) qvVar.next());
        }
    }

    public abstract defpackage.gn0 IHQe1A4L2xu();

    public void adDC3e2L(defpackage.nm0 nm0Var, boolean z) {
        java.util.List list = (java.util.List) oh6vYeIP().adDC3e2L.adDC3e2L.getValue();
        if (!list.contains(nm0Var)) {
            defpackage.db.G3OKOH3wZRC("popBackStack was called with ", nm0Var, " which does not exist in back stack ", list);
            return;
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        defpackage.nm0 nm0Var2 = null;
        while (xiZrDbcSW0()) {
            nm0Var2 = (defpackage.nm0) listIterator.previous();
            if (defpackage.x70.QoRHpC4k(nm0Var2, nm0Var)) {
                break;
            }
        }
        if (nm0Var2 != null) {
            oh6vYeIP().F7NU4MC0GW(nm0Var2, z);
        }
    }

    public final defpackage.um0 oh6vYeIP() {
        defpackage.um0 um0Var = this.IHQe1A4L2xu;
        if (um0Var != null) {
            return um0Var;
        }
        defpackage.db.AARZUJiTa("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public defpackage.gn0 r1MBDhnF(defpackage.gn0 gn0Var) {
        return gn0Var;
    }

    public boolean xiZrDbcSW0() {
        return true;
    }
}
