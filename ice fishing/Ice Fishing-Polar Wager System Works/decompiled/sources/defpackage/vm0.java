package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vm0 implements defpackage.sd0 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ vm0(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        int i = this.adDC3e2L;
        int i2 = 0;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.ym0 ym0Var = (defpackage.ym0) obj;
                ym0Var.G3OKOH3wZRC = md0Var.IHQe1A4L2xu();
                if (ym0Var.r1MBDhnF != null) {
                    java.util.ArrayList seT5W8IHOge = defpackage.td.seT5W8IHOge(ym0Var.xiZrDbcSW0);
                    int size = seT5W8IHOge.size();
                    while (i2 < size) {
                        java.lang.Object obj2 = seT5W8IHOge.get(i2);
                        i2++;
                        defpackage.nm0 nm0Var = (defpackage.nm0) obj2;
                        nm0Var.getClass();
                        defpackage.pm0 pm0Var = nm0Var.JlrlGoKF;
                        pm0Var.getClass();
                        pm0Var.IHQe1A4L2xu.EXtogiMhuM = md0Var.IHQe1A4L2xu();
                        pm0Var.F7NU4MC0GW = md0Var.IHQe1A4L2xu();
                        pm0Var.oh6vYeIP();
                    }
                    break;
                }
                break;
            default:
                defpackage.h41 h41Var = (defpackage.h41) obj;
                if (md0Var != defpackage.md0.ON_START) {
                    if (md0Var == defpackage.md0.ON_STOP) {
                        h41Var.EXtogiMhuM = false;
                        break;
                    }
                } else {
                    h41Var.EXtogiMhuM = true;
                    break;
                }
                break;
        }
    }
}
