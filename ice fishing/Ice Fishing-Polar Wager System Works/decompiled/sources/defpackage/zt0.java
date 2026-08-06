package defpackage;

/* loaded from: classes.dex */
public final class zt0 implements defpackage.xh {
    public final defpackage.k00 AARZUJiTa;
    public final defpackage.le1 EXtogiMhuM = new defpackage.le1(new defpackage.e3(11, this));
    public final defpackage.j31 adDC3e2L;
    public final java.lang.String xiZrDbcSW0;

    public zt0(defpackage.j31 j31Var, java.lang.String str, defpackage.k00 k00Var) {
        this.adDC3e2L = j31Var;
        this.xiZrDbcSW0 = str;
        this.AARZUJiTa = k00Var;
    }

    @Override // defpackage.xh
    public final java.lang.Object DFo87pBq1E5(boolean z, defpackage.k00 k00Var, defpackage.fj fjVar) {
        defpackage.yt0 yt0Var = (defpackage.yt0) fjVar.xiZrDbcSW0().cnag84Bm(defpackage.yt0.xiZrDbcSW0);
        defpackage.xt0 xt0Var = yt0Var != null ? yt0Var.adDC3e2L : null;
        if (xt0Var != null) {
            return k00Var.adDC3e2L(xt0Var, fjVar);
        }
        defpackage.xt0 xt0Var2 = new defpackage.xt0(this.AARZUJiTa, (defpackage.i31) this.EXtogiMhuM.getValue());
        return defpackage.fm.QPwENk36pDC(new defpackage.yt0(xt0Var2), new defpackage.adDC3e2L(k00Var, xt0Var2, null, 28), fjVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.le1 le1Var = this.EXtogiMhuM;
        if (le1Var.xiZrDbcSW0 != defpackage.ad1.riuEU0zW4) {
            ((defpackage.i31) le1Var.getValue()).close();
        }
    }
}
