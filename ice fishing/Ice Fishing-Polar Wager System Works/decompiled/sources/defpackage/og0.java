package defpackage;

/* loaded from: classes.dex */
public final class og0 extends defpackage.qg0 implements java.util.Iterator, defpackage.g90 {
    public final /* synthetic */ int riuEU0zW4;

    public og0(defpackage.rg0 rg0Var, int i) {
        this.riuEU0zW4 = i;
        rg0Var.getClass();
        this.EXtogiMhuM = rg0Var;
        this.xiZrDbcSW0 = -1;
        this.AARZUJiTa = rg0Var.JlrlGoKF;
        r1MBDhnF();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.riuEU0zW4) {
            case 0:
                oh6vYeIP();
                int i = this.adDC3e2L;
                defpackage.rg0 rg0Var = (defpackage.rg0) this.EXtogiMhuM;
                if (i >= rg0Var.SH1y5HwkJhh) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    this.adDC3e2L = i + 1;
                    this.xiZrDbcSW0 = i;
                    defpackage.pg0 pg0Var = new defpackage.pg0(rg0Var, i);
                    r1MBDhnF();
                    break;
                }
            case 1:
                oh6vYeIP();
                int i2 = this.adDC3e2L;
                defpackage.rg0 rg0Var2 = (defpackage.rg0) this.EXtogiMhuM;
                if (i2 >= rg0Var2.SH1y5HwkJhh) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    this.adDC3e2L = i2 + 1;
                    this.xiZrDbcSW0 = i2;
                    java.lang.Object obj = rg0Var2.adDC3e2L[i2];
                    r1MBDhnF();
                    break;
                }
            default:
                oh6vYeIP();
                int i3 = this.adDC3e2L;
                defpackage.rg0 rg0Var3 = (defpackage.rg0) this.EXtogiMhuM;
                if (i3 >= rg0Var3.SH1y5HwkJhh) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    this.adDC3e2L = i3 + 1;
                    this.xiZrDbcSW0 = i3;
                    java.lang.Object[] objArr = rg0Var3.xiZrDbcSW0;
                    objArr.getClass();
                    java.lang.Object obj2 = objArr[this.xiZrDbcSW0];
                    r1MBDhnF();
                    break;
                }
        }
        return null;
    }
}
