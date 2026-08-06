package defpackage;

/* loaded from: classes.dex */
public final class f9 {
    public final defpackage.xl0 IHQe1A4L2xu;

    public f9(int i) {
        switch (i) {
            case 1:
                this.IHQe1A4L2xu = new defpackage.xl0(new defpackage.ib0[16]);
                break;
            default:
                this.IHQe1A4L2xu = new defpackage.xl0(new defpackage.ui[16]);
                break;
        }
    }

    public void IHQe1A4L2xu(java.util.concurrent.CancellationException cancellationException) {
        defpackage.xl0 xl0Var = this.IHQe1A4L2xu;
        int i = xl0Var.AARZUJiTa;
        defpackage.ab[] abVarArr = new defpackage.ab[i];
        for (int i2 = 0; i2 < i; i2++) {
            abVarArr[i2] = ((defpackage.ui) xl0Var.adDC3e2L[i2]).oh6vYeIP;
        }
        for (int i3 = 0; i3 < i; i3++) {
            abVarArr[i3].fnWB2E7cs(cancellationException);
        }
        if (xl0Var.AARZUJiTa == 0) {
            return;
        }
        defpackage.a60.r1MBDhnF("uncancelled requests present");
    }

    public void oh6vYeIP() {
        defpackage.xl0 xl0Var = this.IHQe1A4L2xu;
        defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(0, xl0Var.AARZUJiTa);
        int i = QPwENk36pDC.adDC3e2L;
        int i2 = QPwENk36pDC.xiZrDbcSW0;
        if (i <= i2) {
            while (true) {
                ((defpackage.ui) xl0Var.adDC3e2L[i]).oh6vYeIP.SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        xl0Var.AARZUJiTa();
    }
}
