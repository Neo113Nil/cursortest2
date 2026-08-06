package defpackage;

/* loaded from: classes.dex */
public final class h41 {
    public boolean AARZUJiTa;
    public final defpackage.i41 IHQe1A4L2xu;
    public boolean adDC3e2L;
    public final defpackage.e3 oh6vYeIP;
    public android.os.Bundle xiZrDbcSW0;
    public final defpackage.c41 r1MBDhnF = new defpackage.c41(8);
    public final java.util.LinkedHashMap F7NU4MC0GW = new java.util.LinkedHashMap();
    public boolean EXtogiMhuM = true;

    public h41(defpackage.i41 i41Var, defpackage.e3 e3Var) {
        this.IHQe1A4L2xu = i41Var;
        this.oh6vYeIP = e3Var;
    }

    public final void IHQe1A4L2xu() {
        defpackage.i41 i41Var = this.IHQe1A4L2xu;
        if (i41Var.EXtogiMhuM().EXtogiMhuM != defpackage.nd0.xiZrDbcSW0) {
            defpackage.db.AARZUJiTa("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.adDC3e2L) {
                defpackage.db.AARZUJiTa("SavedStateRegistry was already attached.");
                return;
            }
            this.oh6vYeIP.IHQe1A4L2xu();
            i41Var.EXtogiMhuM().IHQe1A4L2xu(new defpackage.vm0(1, this));
            this.adDC3e2L = true;
        }
    }
}
