package defpackage;

@defpackage.no0("dialog")
/* loaded from: classes.dex */
public final class no extends defpackage.oo0 {
    @Override // defpackage.oo0
    public final void F7NU4MC0GW(java.util.List list, defpackage.co0 co0Var) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oh6vYeIP().xiZrDbcSW0((defpackage.nm0) it.next());
        }
    }

    @Override // defpackage.oo0
    public final defpackage.gn0 IHQe1A4L2xu() {
        defpackage.sf sfVar = defpackage.xf.IHQe1A4L2xu;
        return new defpackage.mo(this);
    }

    @Override // defpackage.oo0
    public final void adDC3e2L(defpackage.nm0 nm0Var, boolean z) {
        oh6vYeIP().adDC3e2L(nm0Var, z);
        int d6FAb9xVJ8GU = defpackage.td.d6FAb9xVJ8GU((java.lang.Iterable) oh6vYeIP().xiZrDbcSW0.adDC3e2L.getValue(), nm0Var);
        int i = 0;
        for (java.lang.Object obj : (java.lang.Iterable) oh6vYeIP().xiZrDbcSW0.adDC3e2L.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            defpackage.nm0 nm0Var2 = (defpackage.nm0) obj;
            if (i > d6FAb9xVJ8GU) {
                oh6vYeIP().r1MBDhnF(nm0Var2);
            }
            i = i2;
        }
    }
}
