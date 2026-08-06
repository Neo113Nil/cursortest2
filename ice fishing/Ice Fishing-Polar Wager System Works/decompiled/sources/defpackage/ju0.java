package defpackage;

/* loaded from: classes.dex */
public class ju0 extends defpackage.iu0 {
    public final defpackage.fu0 EXtogiMhuM;
    public boolean SH1y5HwkJhh;
    public int ez2rX8ReCYw;
    public java.lang.Object riuEU0zW4;

    public ju0(defpackage.fu0 fu0Var, defpackage.zi1[] zi1VarArr) {
        super(fu0Var.xiZrDbcSW0, zi1VarArr);
        this.EXtogiMhuM = fu0Var;
        this.ez2rX8ReCYw = fu0Var.EXtogiMhuM;
    }

    @Override // defpackage.iu0, java.util.Iterator
    public final java.lang.Object next() {
        if (this.EXtogiMhuM.EXtogiMhuM != this.ez2rX8ReCYw) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!this.AARZUJiTa) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        defpackage.zi1 zi1Var = this.adDC3e2L[this.xiZrDbcSW0];
        this.riuEU0zW4 = zi1Var.adDC3e2L[zi1Var.AARZUJiTa];
        this.SH1y5HwkJhh = true;
        return super.next();
    }

    public final void r1MBDhnF(int i, defpackage.yi1 yi1Var, java.lang.Object obj, int i2) {
        int i3 = i2 * 5;
        defpackage.zi1[] zi1VarArr = this.adDC3e2L;
        if (i3 <= 30) {
            int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i3);
            if (yi1Var.EXtogiMhuM(kNAkVymC)) {
                zi1VarArr[i2].IHQe1A4L2xu(yi1Var.F7NU4MC0GW, java.lang.Integer.bitCount(yi1Var.IHQe1A4L2xu) * 2, yi1Var.xiZrDbcSW0(kNAkVymC));
                this.xiZrDbcSW0 = i2;
                return;
            } else {
                int fnWB2E7cs = yi1Var.fnWB2E7cs(kNAkVymC);
                defpackage.yi1 EgCjBq0SZwJ = yi1Var.EgCjBq0SZwJ(fnWB2E7cs);
                zi1VarArr[i2].IHQe1A4L2xu(yi1Var.F7NU4MC0GW, java.lang.Integer.bitCount(yi1Var.IHQe1A4L2xu) * 2, fnWB2E7cs);
                r1MBDhnF(i, EgCjBq0SZwJ, obj, i2 + 1);
                return;
            }
        }
        defpackage.zi1 zi1Var = zi1VarArr[i2];
        java.lang.Object[] objArr = yi1Var.F7NU4MC0GW;
        zi1Var.IHQe1A4L2xu(objArr, objArr.length, 0);
        while (true) {
            defpackage.zi1 zi1Var2 = zi1VarArr[i2];
            if (defpackage.x70.QoRHpC4k(zi1Var2.adDC3e2L[zi1Var2.AARZUJiTa], obj)) {
                this.xiZrDbcSW0 = i2;
                return;
            } else {
                zi1VarArr[i2].AARZUJiTa += 2;
            }
        }
    }

    @Override // defpackage.iu0, java.util.Iterator
    public final void remove() {
        if (!this.SH1y5HwkJhh) {
            throw new java.lang.IllegalStateException();
        }
        boolean z = this.AARZUJiTa;
        defpackage.fu0 fu0Var = this.EXtogiMhuM;
        if (!z) {
            defpackage.mj1.fnWB2E7cs(fu0Var).remove(this.riuEU0zW4);
        } else {
            if (!z) {
                defpackage.db.DFo87pBq1E5();
                return;
            }
            defpackage.zi1 zi1Var = this.adDC3e2L[this.xiZrDbcSW0];
            java.lang.Object obj = zi1Var.adDC3e2L[zi1Var.AARZUJiTa];
            defpackage.mj1.fnWB2E7cs(fu0Var).remove(this.riuEU0zW4);
            r1MBDhnF(obj != null ? obj.hashCode() : 0, fu0Var.xiZrDbcSW0, obj, 0);
        }
        this.riuEU0zW4 = null;
        this.SH1y5HwkJhh = false;
        this.ez2rX8ReCYw = fu0Var.EXtogiMhuM;
    }
}
