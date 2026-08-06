package defpackage;

/* loaded from: classes.dex */
public final class r1 implements defpackage.hq {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object oh6vYeIP;

    public /* synthetic */ r1(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    @Override // defpackage.hq
    public final void IHQe1A4L2xu() {
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.oh6vYeIP;
        switch (i) {
            case 0:
                defpackage.qo qoVar = (defpackage.qo) obj;
                qoVar.dismiss();
                qoVar.JlrlGoKF.xiZrDbcSW0();
                break;
            case 1:
                ((defpackage.lq) obj).xiZrDbcSW0.IHQe1A4L2xu();
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.rb0) obj).F7NU4MC0GW = null;
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ec0 ec0Var = (defpackage.ec0) obj;
                defpackage.q90 q90Var = ec0Var.r1MBDhnF;
                if (q90Var != null) {
                    q90Var.IHQe1A4L2xu = false;
                }
                ec0Var.r1MBDhnF = null;
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.zb0) obj).xiZrDbcSW0 = true;
                break;
            default:
                defpackage.bh1 bh1Var = (defpackage.bh1) obj;
                android.widget.Toast toast = bh1Var.IHQe1A4L2xu;
                if (toast != null) {
                    toast.cancel();
                }
                bh1Var.IHQe1A4L2xu = null;
                break;
        }
    }
}
