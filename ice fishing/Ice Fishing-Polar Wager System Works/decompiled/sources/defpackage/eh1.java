package defpackage;

/* loaded from: classes.dex */
public final class eh1 extends defpackage.dd {
    public defpackage.g00 TFRaUu83X3E;
    public final defpackage.e3 WLpAkxCo;
    public boolean hkbnNdmy;

    public eh1(boolean z, defpackage.zk0 zk0Var, boolean z2, defpackage.l21 l21Var, defpackage.g00 g00Var) {
        super(zk0Var, null, false, z2, l21Var, new defpackage.zh(2, g00Var, z));
        this.hkbnNdmy = z;
        this.TFRaUu83X3E = g00Var;
        this.WLpAkxCo = new defpackage.e3(23, this);
    }

    @Override // defpackage.dd
    public final void WnQbjbWuMR(defpackage.n71 n71Var) {
        defpackage.h2 h2Var;
        android.view.autofill.AutofillValue forToggle;
        defpackage.fh1 fh1Var = this.hkbnNdmy ? defpackage.fh1.adDC3e2L : defpackage.fh1.xiZrDbcSW0;
        defpackage.j90[] j90VarArr = defpackage.l71.IHQe1A4L2xu;
        defpackage.m71 m71Var = defpackage.j71.yIx6ChFVk;
        defpackage.j90[] j90VarArr2 = defpackage.l71.IHQe1A4L2xu;
        defpackage.j90 j90Var = j90VarArr2[26];
        n71Var.IHQe1A4L2xu(m71Var, fh1Var);
        defpackage.p1 p1Var = defpackage.n.NHJTzaLwkd;
        defpackage.m71 m71Var2 = defpackage.j71.EgCjBq0SZwJ;
        defpackage.j90 j90Var2 = j90VarArr2[9];
        n71Var.IHQe1A4L2xu(m71Var2, p1Var);
        boolean z = this.hkbnNdmy;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            forToggle = android.view.autofill.AutofillValue.forToggle(z);
            h2Var = new defpackage.h2(forToggle);
        } else {
            h2Var = null;
        }
        if (h2Var != null) {
            defpackage.m71 m71Var3 = defpackage.j71.fnWB2E7cs;
            defpackage.j90 j90Var3 = j90VarArr2[10];
            n71Var.IHQe1A4L2xu(m71Var3, h2Var);
        }
        n71Var.IHQe1A4L2xu(defpackage.a71.EXtogiMhuM, new defpackage.TFRaUu83X3E(null, new defpackage.dh1(0, n71Var)));
    }
}
