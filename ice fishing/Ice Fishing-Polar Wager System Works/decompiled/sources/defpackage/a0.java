package defpackage;

/* loaded from: classes.dex */
public final class a0 extends defpackage.f7 implements defpackage.xx {
    public final defpackage.v0 AARZUJiTa;
    public final defpackage.mz0 EXtogiMhuM;
    public boolean JlrlGoKF;
    public final android.view.autofill.AutofillId SH1y5HwkJhh;
    public final defpackage.c1NqjJifC7 adDC3e2L;
    public final defpackage.yk0 ez2rX8ReCYw;
    public final java.lang.String riuEU0zW4;
    public final defpackage.i71 xiZrDbcSW0;

    public a0(defpackage.c1NqjJifC7 c1nqjjifc7, defpackage.i71 i71Var, defpackage.v0 v0Var, defpackage.mz0 mz0Var, java.lang.String str) {
        this.adDC3e2L = c1nqjjifc7;
        this.xiZrDbcSW0 = i71Var;
        this.AARZUJiTa = v0Var;
        this.EXtogiMhuM = mz0Var;
        this.riuEU0zW4 = str;
        new android.graphics.Rect();
        v0Var.setImportantForAutofill(1);
        defpackage.FyULxpbU8bu V7bD7b8KA = defpackage.s70.V7bD7b8KA(v0Var);
        android.view.autofill.AutofillId oh6vYeIP = V7bD7b8KA != null ? defpackage.e7.oh6vYeIP(V7bD7b8KA.IHQe1A4L2xu) : null;
        if (oh6vYeIP == null) {
            throw defpackage.fx0.AARZUJiTa("Required value was null.");
        }
        this.SH1y5HwkJhh = oh6vYeIP;
        this.ez2rX8ReCYw = new defpackage.yk0();
    }

    @Override // defpackage.xx
    public final void IHQe1A4L2xu(defpackage.gy gyVar, defpackage.gy gyVar2) {
        defpackage.ma0 D2vUnMij;
        defpackage.b71 abhbClRa;
        defpackage.ma0 D2vUnMij2;
        defpackage.b71 abhbClRa2;
        if (gyVar != null && (D2vUnMij2 = defpackage.w70.D2vUnMij(gyVar)) != null && (abhbClRa2 = D2vUnMij2.abhbClRa()) != null) {
            defpackage.nl0 nl0Var = abhbClRa2.adDC3e2L;
            if (nl0Var.oh6vYeIP(defpackage.a71.AARZUJiTa) || nl0Var.oh6vYeIP(defpackage.a71.EXtogiMhuM)) {
                ((android.view.autofill.AutofillManager) this.adDC3e2L.xiZrDbcSW0).notifyViewExited(this.AARZUJiTa, D2vUnMij2.xiZrDbcSW0);
            }
        }
        if (gyVar2 == null || (D2vUnMij = defpackage.w70.D2vUnMij(gyVar2)) == null || (abhbClRa = D2vUnMij.abhbClRa()) == null) {
            return;
        }
        defpackage.nl0 nl0Var2 = abhbClRa.adDC3e2L;
        if (nl0Var2.oh6vYeIP(defpackage.a71.AARZUJiTa) || nl0Var2.oh6vYeIP(defpackage.a71.EXtogiMhuM)) {
            int i = D2vUnMij.xiZrDbcSW0;
            this.EXtogiMhuM.oh6vYeIP.EXtogiMhuM(i, new defpackage.z(this, i));
        }
    }
}
