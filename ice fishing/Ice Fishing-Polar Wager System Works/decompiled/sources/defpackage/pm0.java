package defpackage;

/* loaded from: classes.dex */
public final class pm0 {
    public final android.os.Bundle AARZUJiTa;
    public final defpackage.le1 DFo87pBq1E5;
    public final defpackage.F7NU4MC0GW EXtogiMhuM;
    public defpackage.nd0 F7NU4MC0GW;
    public final defpackage.nm0 IHQe1A4L2xu;
    public final defpackage.j41 JlrlGoKF;
    public final defpackage.xd0 SH1y5HwkJhh;
    public final defpackage.zm0 adDC3e2L;
    public defpackage.nd0 ez2rX8ReCYw;
    public final defpackage.gn0 oh6vYeIP;
    public final android.os.Bundle r1MBDhnF;
    public boolean riuEU0zW4;
    public final java.lang.String xiZrDbcSW0;

    public pm0(defpackage.nm0 nm0Var) {
        this.IHQe1A4L2xu = nm0Var;
        this.oh6vYeIP = nm0Var.xiZrDbcSW0;
        this.r1MBDhnF = nm0Var.AARZUJiTa;
        this.F7NU4MC0GW = nm0Var.EXtogiMhuM;
        this.adDC3e2L = nm0Var.riuEU0zW4;
        this.xiZrDbcSW0 = nm0Var.SH1y5HwkJhh;
        this.AARZUJiTa = nm0Var.ez2rX8ReCYw;
        this.EXtogiMhuM = new defpackage.F7NU4MC0GW(new defpackage.h41(nm0Var, new defpackage.e3(16, nm0Var)));
        defpackage.le1 le1Var = new defpackage.le1(new defpackage.g(25));
        this.SH1y5HwkJhh = new defpackage.xd0(nm0Var, true);
        this.ez2rX8ReCYw = defpackage.nd0.xiZrDbcSW0;
        this.JlrlGoKF = (defpackage.j41) le1Var.getValue();
        this.DFo87pBq1E5 = new defpackage.le1(new defpackage.g(26));
    }

    public final android.os.Bundle IHQe1A4L2xu() {
        android.os.Bundle bundle = this.r1MBDhnF;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
        SyNS6RMn.putAll(bundle);
        return SyNS6RMn;
    }

    public final void oh6vYeIP() {
        if (!this.riuEU0zW4) {
            defpackage.F7NU4MC0GW f7nu4mc0gw = this.EXtogiMhuM;
            ((defpackage.h41) f7nu4mc0gw.xiZrDbcSW0).IHQe1A4L2xu();
            this.riuEU0zW4 = true;
            if (this.adDC3e2L != null) {
                defpackage.w70.fnWB2E7cs(this.IHQe1A4L2xu);
            }
            f7nu4mc0gw.PAEGRtP0bX(this.AARZUJiTa);
        }
        int ordinal = this.F7NU4MC0GW.ordinal();
        int ordinal2 = this.ez2rX8ReCYw.ordinal();
        defpackage.xd0 xd0Var = this.SH1y5HwkJhh;
        if (ordinal < ordinal2) {
            defpackage.nd0 nd0Var = this.F7NU4MC0GW;
            xd0Var.getClass();
            nd0Var.getClass();
            xd0Var.r1MBDhnF("setCurrentState");
            xd0Var.adDC3e2L(nd0Var);
            return;
        }
        defpackage.nd0 nd0Var2 = this.ez2rX8ReCYw;
        xd0Var.getClass();
        nd0Var2.getClass();
        xd0Var.r1MBDhnF("setCurrentState");
        xd0Var.adDC3e2L(nd0Var2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.sz0.IHQe1A4L2xu(defpackage.nm0.class).r1MBDhnF());
        sb.append("(" + this.xiZrDbcSW0 + ')');
        sb.append(" destination=");
        sb.append(this.oh6vYeIP);
        return sb.toString();
    }
}
