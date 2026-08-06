package defpackage;

/* loaded from: classes.dex */
public final class d41 implements defpackage.g41 {
    public final defpackage.le1 F7NU4MC0GW;
    public final defpackage.F7NU4MC0GW IHQe1A4L2xu;
    public boolean oh6vYeIP;
    public android.os.Bundle r1MBDhnF;

    public d41(defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.cn1 cn1Var) {
        f7nu4mc0gw.getClass();
        this.IHQe1A4L2xu = f7nu4mc0gw;
        this.F7NU4MC0GW = new defpackage.le1(new defpackage.e3(15, cn1Var));
    }

    @Override // defpackage.g41
    public final android.os.Bundle IHQe1A4L2xu() {
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        android.os.Bundle bundle = this.r1MBDhnF;
        if (bundle != null) {
            SyNS6RMn.putAll(bundle);
        }
        for (java.util.Map.Entry entry : ((defpackage.e41) this.F7NU4MC0GW.getValue()).oh6vYeIP.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle IHQe1A4L2xu = ((defpackage.gf) ((defpackage.y31) entry.getValue()).oh6vYeIP.adDC3e2L).IHQe1A4L2xu();
            if (!IHQe1A4L2xu.isEmpty()) {
                str.getClass();
                SyNS6RMn.putBundle(str, IHQe1A4L2xu);
            }
        }
        this.oh6vYeIP = false;
        return SyNS6RMn;
    }

    public final void oh6vYeIP() {
        if (this.oh6vYeIP) {
            return;
        }
        android.os.Bundle cnag84Bm = this.IHQe1A4L2xu.cnag84Bm("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        android.os.Bundle bundle = this.r1MBDhnF;
        if (bundle != null) {
            SyNS6RMn.putAll(bundle);
        }
        if (cnag84Bm != null) {
            SyNS6RMn.putAll(cnag84Bm);
        }
        this.r1MBDhnF = SyNS6RMn;
        this.oh6vYeIP = true;
    }
}
