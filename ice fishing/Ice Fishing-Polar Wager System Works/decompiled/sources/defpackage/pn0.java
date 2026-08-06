package defpackage;

@defpackage.no0("navigation")
/* loaded from: classes.dex */
public class pn0 extends defpackage.oo0 {
    public final defpackage.po0 r1MBDhnF;

    public pn0(defpackage.po0 po0Var) {
        po0Var.getClass();
        this.r1MBDhnF = po0Var;
    }

    @Override // defpackage.oo0
    /* renamed from: AARZUJiTa, reason: merged with bridge method [inline-methods] */
    public defpackage.kn0 IHQe1A4L2xu() {
        return new defpackage.kn0(this);
    }

    @Override // defpackage.oo0
    public final void F7NU4MC0GW(java.util.List list, defpackage.co0 co0Var) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.nm0 nm0Var = (defpackage.nm0) it.next();
            defpackage.gn0 gn0Var = nm0Var.xiZrDbcSW0;
            gn0Var.getClass();
            defpackage.kn0 kn0Var = (defpackage.kn0) gn0Var;
            defpackage.jn0 jn0Var = kn0Var.xiZrDbcSW0;
            defpackage.rz0 rz0Var = new defpackage.rz0();
            rz0Var.adDC3e2L = nm0Var.JlrlGoKF.IHQe1A4L2xu();
            defpackage.nn0 nn0Var = kn0Var.SH1y5HwkJhh;
            int i = nn0Var.r1MBDhnF;
            java.lang.String str = nn0Var.adDC3e2L;
            if (i == 0 && str == null) {
                jn0Var.getClass();
                java.lang.String valueOf = java.lang.String.valueOf(jn0Var.IHQe1A4L2xu);
                valueOf.getClass();
                if (nn0Var.IHQe1A4L2xu.xiZrDbcSW0.IHQe1A4L2xu == 0) {
                    valueOf = "the root navigation";
                }
                throw new java.lang.IllegalStateException("no start destination defined via app:startDestination for ".concat(valueOf).toString());
            }
            int i2 = 0;
            defpackage.gn0 oh6vYeIP = str != null ? nn0Var.oh6vYeIP(str, false) : (defpackage.gn0) nn0Var.oh6vYeIP.oh6vYeIP(i);
            if (oh6vYeIP == null) {
                if (nn0Var.F7NU4MC0GW == null) {
                    java.lang.String str2 = nn0Var.adDC3e2L;
                    if (str2 == null) {
                        str2 = java.lang.String.valueOf(nn0Var.r1MBDhnF);
                    }
                    nn0Var.F7NU4MC0GW = str2;
                }
                java.lang.String str3 = nn0Var.F7NU4MC0GW;
                str3.getClass();
                defpackage.db.fnWB2E7cs(defpackage.fx0.ez2rX8ReCYw("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            defpackage.jn0 jn0Var2 = oh6vYeIP.xiZrDbcSW0;
            if (str != null) {
                if (!str.equals((java.lang.String) jn0Var2.adDC3e2L)) {
                    defpackage.fn0 IHQe1A4L2xu = jn0Var2.IHQe1A4L2xu(str);
                    android.os.Bundle bundle = IHQe1A4L2xu != null ? IHQe1A4L2xu.xiZrDbcSW0 : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                        SyNS6RMn.putAll(bundle);
                        android.os.Bundle bundle2 = (android.os.Bundle) rz0Var.adDC3e2L;
                        if (bundle2 != null) {
                            SyNS6RMn.putAll(bundle2);
                        }
                        rz0Var.adDC3e2L = SyNS6RMn;
                    }
                }
                if (oh6vYeIP.oh6vYeIP().isEmpty()) {
                    continue;
                } else {
                    java.util.ArrayList abhbClRa = defpackage.j70.abhbClRa(oh6vYeIP.oh6vYeIP(), new defpackage.on0(i2, rz0Var));
                    if (!abhbClRa.isEmpty()) {
                        throw new java.lang.IllegalArgumentException(("Cannot navigate to startDestination " + oh6vYeIP + ". Missing required arguments [" + abhbClRa + ']').toString());
                    }
                }
            }
            this.r1MBDhnF.oh6vYeIP(oh6vYeIP.adDC3e2L).F7NU4MC0GW(defpackage.fm.p4kuH6PDtgom(oh6vYeIP().oh6vYeIP(oh6vYeIP, oh6vYeIP.IHQe1A4L2xu((android.os.Bundle) rz0Var.adDC3e2L))), co0Var);
        }
    }
}
