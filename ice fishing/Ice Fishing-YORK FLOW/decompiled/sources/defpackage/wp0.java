package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
@defpackage.xq0("navigation")
/* loaded from: classes.dex */
public class wp0 extends defpackage.yq0 {
    public final defpackage.zq0 fWTAfUmVKrZq;

    public wp0(defpackage.zq0 zq0Var) {
        zq0Var.getClass();
        this.fWTAfUmVKrZq = zq0Var;
    }

    @Override // defpackage.yq0
    public final void JhCgjQRTAOCT(java.util.List list, defpackage.jq0 jq0Var) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.xo0 xo0Var = (defpackage.xo0) it.next();
            defpackage.np0 np0Var = xo0Var.oh71FJcDz6S2;
            np0Var.getClass();
            defpackage.rp0 rp0Var = (defpackage.rp0) np0Var;
            defpackage.qp0 qp0Var = rp0Var.oh71FJcDz6S2;
            defpackage.z31 z31Var = new defpackage.z31();
            z31Var.WDYagTQQm9ns = xo0Var.fNwYGHIYeJcR.ZpBGe2uQfcn8();
            defpackage.up0 up0Var = rp0Var.GE9mJIPrb8gP;
            int i = up0Var.ZpBGe2uQfcn8;
            java.lang.String str = (java.lang.String) up0Var.WDYagTQQm9ns;
            if (i == 0 && str == null) {
                qp0Var.getClass();
                java.lang.String valueOf = java.lang.String.valueOf(qp0Var.ZpBGe2uQfcn8);
                valueOf.getClass();
                if (((defpackage.rp0) up0Var.giKS3J6vZuNy).oh71FJcDz6S2.ZpBGe2uQfcn8 == 0) {
                    valueOf = "the root navigation";
                }
                throw new java.lang.IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            int i2 = 0;
            defpackage.np0 T1fB7bDYiVJQ = str != null ? up0Var.T1fB7bDYiVJQ(str, false) : (defpackage.np0) ((defpackage.rf1) up0Var.fWTAfUmVKrZq).giKS3J6vZuNy(i);
            if (T1fB7bDYiVJQ == null) {
                if (((java.lang.String) up0Var.JhCgjQRTAOCT) == null) {
                    java.lang.String str2 = (java.lang.String) up0Var.WDYagTQQm9ns;
                    if (str2 == null) {
                        str2 = java.lang.String.valueOf(up0Var.ZpBGe2uQfcn8);
                    }
                    up0Var.JhCgjQRTAOCT = str2;
                }
                java.lang.String str3 = (java.lang.String) up0Var.JhCgjQRTAOCT;
                str3.getClass();
                throw new java.lang.IllegalArgumentException("navigation destination " + str3 + " is not a direct child of this NavGraph");
            }
            defpackage.qp0 qp0Var2 = T1fB7bDYiVJQ.oh71FJcDz6S2;
            if (str != null) {
                if (!str.equals((java.lang.String) qp0Var2.WDYagTQQm9ns)) {
                    defpackage.mp0 ZpBGe2uQfcn8 = qp0Var2.ZpBGe2uQfcn8(str);
                    android.os.Bundle bundle = ZpBGe2uQfcn8 != null ? ZpBGe2uQfcn8.oh71FJcDz6S2 : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
                        GE9mJIPrb8gP.putAll(bundle);
                        android.os.Bundle bundle2 = (android.os.Bundle) z31Var.WDYagTQQm9ns;
                        if (bundle2 != null) {
                            GE9mJIPrb8gP.putAll(bundle2);
                        }
                        z31Var.WDYagTQQm9ns = GE9mJIPrb8gP;
                    }
                }
                if (T1fB7bDYiVJQ.giKS3J6vZuNy().isEmpty()) {
                    continue;
                } else {
                    java.util.ArrayList BXaznwstz2U0 = defpackage.w60.BXaznwstz2U0(T1fB7bDYiVJQ.giKS3J6vZuNy(), new defpackage.vp0(i2, z31Var));
                    if (!BXaznwstz2U0.isEmpty()) {
                        throw new java.lang.IllegalArgumentException(("Cannot navigate to startDestination " + T1fB7bDYiVJQ + ". Missing required arguments [" + BXaznwstz2U0 + ']').toString());
                    }
                }
            }
            this.fWTAfUmVKrZq.giKS3J6vZuNy(T1fB7bDYiVJQ.WDYagTQQm9ns).JhCgjQRTAOCT(defpackage.ma0.VFeft99leXEK(giKS3J6vZuNy().giKS3J6vZuNy(T1fB7bDYiVJQ, T1fB7bDYiVJQ.ZpBGe2uQfcn8((android.os.Bundle) z31Var.WDYagTQQm9ns))), jq0Var);
        }
    }

    @Override // defpackage.yq0
    /* renamed from: QiMR8OkAhezm, reason: merged with bridge method [inline-methods] */
    public defpackage.rp0 ZpBGe2uQfcn8() {
        return new defpackage.rp0(this);
    }
}
