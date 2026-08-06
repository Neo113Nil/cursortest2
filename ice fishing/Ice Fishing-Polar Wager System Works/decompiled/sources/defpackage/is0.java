package defpackage;

/* loaded from: classes.dex */
public final class is0 extends defpackage.l80 {
    public int AARZUJiTa;
    public int ez2rX8ReCYw;
    public int riuEU0zW4;
    public defpackage.gs0[] xiZrDbcSW0 = new defpackage.gs0[16];
    public int[] EXtogiMhuM = new int[16];
    public java.lang.Object[] SH1y5HwkJhh = new java.lang.Object[16];

    public final void D2vUnMij() {
        this.AARZUJiTa = 0;
        this.riuEU0zW4 = 0;
        java.util.Arrays.fill(this.SH1y5HwkJhh, 0, this.ez2rX8ReCYw, (java.lang.Object) null);
        this.ez2rX8ReCYw = 0;
    }

    public final boolean SiPhmbmu() {
        return this.AARZUJiTa == 0;
    }

    public final void frpfPPIgqM9O(defpackage.b6 b6Var, defpackage.ia1 ia1Var, defpackage.v01 v01Var, defpackage.hs0 hs0Var) {
        if (this.AARZUJiTa != 0) {
            defpackage.pd pdVar = new defpackage.pd(this);
            defpackage.is0 is0Var = (defpackage.is0) pdVar.F7NU4MC0GW;
            while (true) {
                defpackage.gs0 gs0Var = is0Var.xiZrDbcSW0[pdVar.IHQe1A4L2xu];
                defpackage.o10 oh6vYeIP = gs0Var.oh6vYeIP(pdVar);
                defpackage.b6 b6Var2 = b6Var;
                defpackage.ia1 ia1Var2 = ia1Var;
                defpackage.v01 v01Var2 = v01Var;
                defpackage.hs0 hs0Var2 = hs0Var;
                try {
                    gs0Var.IHQe1A4L2xu(pdVar, b6Var2, ia1Var2, v01Var2, hs0Var2);
                    int i = pdVar.IHQe1A4L2xu;
                    int i2 = is0Var.AARZUJiTa;
                    if (i < i2) {
                        defpackage.gs0 gs0Var2 = is0Var.xiZrDbcSW0[i];
                        pdVar.oh6vYeIP += gs0Var2.IHQe1A4L2xu;
                        pdVar.r1MBDhnF += gs0Var2.oh6vYeIP;
                        int i3 = i + 1;
                        pdVar.IHQe1A4L2xu = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        b6Var = b6Var2;
                        ia1Var = ia1Var2;
                        v01Var = v01Var2;
                        hs0Var = hs0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        D2vUnMij();
    }

    public final void p4kuH6PDtgom(defpackage.gs0 gs0Var) {
        int i = this.AARZUJiTa;
        defpackage.gs0[] gs0VarArr = this.xiZrDbcSW0;
        if (i == gs0VarArr.length) {
            defpackage.gs0[] gs0VarArr2 = new defpackage.gs0[(i > 1024 ? 1024 : i) + i];
            java.lang.System.arraycopy(gs0VarArr, 0, gs0VarArr2, 0, i);
            this.xiZrDbcSW0 = gs0VarArr2;
        }
        int i2 = this.riuEU0zW4;
        int i3 = gs0Var.IHQe1A4L2xu;
        int i4 = gs0Var.oh6vYeIP;
        int i5 = i2 + i3;
        int[] iArr = this.EXtogiMhuM;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            defpackage.t6.Ye0N2xE9Hc(iArr, iArr2, 0, 0, length);
            this.EXtogiMhuM = iArr2;
        }
        int i7 = this.ez2rX8ReCYw + i4;
        java.lang.Object[] objArr = this.SH1y5HwkJhh;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[i7];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.SH1y5HwkJhh = objArr2;
        }
        defpackage.gs0[] gs0VarArr3 = this.xiZrDbcSW0;
        int i9 = this.AARZUJiTa;
        this.AARZUJiTa = i9 + 1;
        gs0VarArr3[i9] = gs0Var;
        this.riuEU0zW4 += gs0Var.IHQe1A4L2xu;
        this.ez2rX8ReCYw += i4;
    }
}
