package defpackage;

/* loaded from: classes.dex */
public abstract class cq1 {
    public static final android.view.ViewGroup.LayoutParams IHQe1A4L2xu = new android.view.ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.aq1 IHQe1A4L2xu(defpackage.G3OKOH3wZRC g3OKOH3wZRC, defpackage.zg zgVar, defpackage.sf sfVar) {
        defpackage.v0 v0Var;
        defpackage.aq1 aq1Var;
        java.lang.Object[] objArr = 0;
        if (defpackage.m20.IHQe1A4L2xu.compareAndSet(false, true)) {
            defpackage.x9 oh6vYeIP = defpackage.w70.oh6vYeIP(1, 6, null);
            defpackage.fm.SiPhmbmu(defpackage.h1.oh6vYeIP((defpackage.lj) defpackage.l3.G3OKOH3wZRC.getValue()), null, new defpackage.AARZUJiTa(oh6vYeIP, objArr == true ? 1 : 0, 10), 3);
            defpackage.s sVar = new defpackage.s(13, oh6vYeIP);
            synchronized (defpackage.wa1.r1MBDhnF) {
                defpackage.wa1.riuEU0zW4 = defpackage.td.ZNF7fheNE(defpackage.wa1.riuEU0zW4, sVar);
            }
            defpackage.wa1.IHQe1A4L2xu();
        }
        if (g3OKOH3wZRC.getChildCount() > 0) {
            android.view.View childAt = g3OKOH3wZRC.getChildAt(0);
            v0Var = childAt instanceof defpackage.v0 ? (defpackage.v0) childAt : null;
            if (v0Var != null) {
                v0Var.setComposeViewContext(zgVar);
                if (v0Var == null) {
                    v0Var = new defpackage.v0(g3OKOH3wZRC.getContext(), zgVar);
                    g3OKOH3wZRC.addView(v0Var.getView(), IHQe1A4L2xu);
                }
                v0Var.setComposeViewContext(zgVar);
                if (g3OKOH3wZRC.getComposeViewContext$ui() != null) {
                    zgVar.r1MBDhnF();
                    v0Var.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                java.lang.Object tag = v0Var.getTag(com.combinations.spin.balbi.R.id.wrapped_composition_tag);
                aq1Var = tag instanceof defpackage.aq1 ? (defpackage.aq1) tag : null;
                if (aq1Var == null) {
                    aq1Var = new defpackage.aq1(v0Var, new defpackage.kh(zgVar.oh6vYeIP, new defpackage.gk1(v0Var.getRoot())));
                    v0Var.setTag(com.combinations.spin.balbi.R.id.wrapped_composition_tag, aq1Var);
                }
                aq1Var.r1MBDhnF(sfVar);
                v0Var.setFrameEndScheduler$ui(new defpackage.bq1(zgVar.oh6vYeIP));
                return aq1Var;
            }
        } else {
            g3OKOH3wZRC.removeAllViews();
        }
        v0Var = null;
        if (v0Var == null) {
        }
        v0Var.setComposeViewContext(zgVar);
        if (g3OKOH3wZRC.getComposeViewContext$ui() != null) {
        }
        java.lang.Object tag2 = v0Var.getTag(com.combinations.spin.balbi.R.id.wrapped_composition_tag);
        if (tag2 instanceof defpackage.aq1) {
        }
        if (aq1Var == null) {
        }
        aq1Var.r1MBDhnF(sfVar);
        v0Var.setFrameEndScheduler$ui(new defpackage.bq1(zgVar.oh6vYeIP));
        return aq1Var;
    }
}
