package defpackage;

/* loaded from: classes.dex */
public abstract class ho0 {
    public defpackage.c80 IHQe1A4L2xu;
    public boolean oh6vYeIP;
    public defpackage.y r1MBDhnF;

    public abstract void F7NU4MC0GW(defpackage.fo0 fo0Var);

    public abstract void IHQe1A4L2xu();

    public final void adDC3e2L() {
        defpackage.y yVar = this.r1MBDhnF;
        if (yVar == null || !((java.util.LinkedHashSet) yVar.AARZUJiTa).remove(this)) {
            return;
        }
        defpackage.ko0 ko0Var = (defpackage.ko0) yVar.xiZrDbcSW0;
        ko0Var.getClass();
        if (equals(ko0Var.xiZrDbcSW0)) {
            if (ko0Var.AARZUJiTa == -1) {
                IHQe1A4L2xu();
            }
            ko0Var.xiZrDbcSW0 = null;
            ko0Var.AARZUJiTa = 0;
            ko0Var.EXtogiMhuM = null;
        }
        ko0Var.F7NU4MC0GW.remove(this);
        ko0Var.adDC3e2L.remove(this);
        this.r1MBDhnF = null;
        ko0Var.oh6vYeIP();
    }

    public abstract void oh6vYeIP();

    public abstract void r1MBDhnF(defpackage.fo0 fo0Var);

    public final void xiZrDbcSW0(boolean z) {
        defpackage.ko0 ko0Var;
        if (this.oh6vYeIP == z) {
            return;
        }
        this.oh6vYeIP = z;
        defpackage.y yVar = this.r1MBDhnF;
        if (yVar == null || (ko0Var = (defpackage.ko0) yVar.xiZrDbcSW0) == null) {
            return;
        }
        ko0Var.oh6vYeIP();
    }
}
