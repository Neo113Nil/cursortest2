package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ic0 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.kc0 xiZrDbcSW0;

    public /* synthetic */ ic0(defpackage.kc0 kc0Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = kc0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.kc0 kc0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.oc0 oc0Var = (defpackage.oc0) kc0Var.EgCjBq0SZwJ.IHQe1A4L2xu();
                int r1MBDhnF = oc0Var.r1MBDhnF();
                int i2 = 0;
                while (true) {
                    if (i2 >= r1MBDhnF) {
                        i2 = -1;
                    } else if (!oc0Var.F7NU4MC0GW(i2).equals(obj)) {
                        i2++;
                    }
                }
                return java.lang.Integer.valueOf(i2);
            default:
                int intValue = ((java.lang.Integer) obj).intValue();
                defpackage.oc0 oc0Var2 = (defpackage.oc0) kc0Var.EgCjBq0SZwJ.IHQe1A4L2xu();
                if (intValue < 0 || intValue >= oc0Var2.r1MBDhnF()) {
                    java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    JlrlGoKF.append(oc0Var2.r1MBDhnF());
                    JlrlGoKF.append(')');
                    defpackage.a60.IHQe1A4L2xu(JlrlGoKF.toString());
                }
                defpackage.fm.SiPhmbmu(kc0Var.dOmtpLcqqI1y(), null, new defpackage.rp(kc0Var, intValue, null, 1), 3);
                return java.lang.Boolean.TRUE;
        }
    }
}
