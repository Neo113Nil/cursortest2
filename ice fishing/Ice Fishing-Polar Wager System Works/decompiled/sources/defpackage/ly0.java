package defpackage;

/* loaded from: classes.dex */
public abstract class ly0 {
    public final defpackage.fd0 IHQe1A4L2xu;

    public ly0(defpackage.vz vzVar) {
        this.IHQe1A4L2xu = new defpackage.fd0(vzVar);
    }

    public abstract defpackage.ny0 IHQe1A4L2xu(java.lang.Object obj);

    public defpackage.kl1 oh6vYeIP() {
        return this.IHQe1A4L2xu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.kl1 r1MBDhnF(defpackage.ny0 ny0Var, defpackage.kl1 kl1Var) {
        java.lang.Object obj = ny0Var.adDC3e2L;
        boolean z = ny0Var.F7NU4MC0GW;
        defpackage.cs csVar = null;
        if (kl1Var instanceof defpackage.cs) {
            if (z) {
                csVar = (defpackage.cs) kl1Var;
                csVar.IHQe1A4L2xu.setValue(ny0Var.IHQe1A4L2xu());
            }
        } else if ((kl1Var instanceof defpackage.oc1) && ((ny0Var.oh6vYeIP || obj != null) && !z)) {
            defpackage.oc1 oc1Var = (defpackage.oc1) kl1Var;
            if (defpackage.x70.QoRHpC4k(ny0Var.IHQe1A4L2xu(), oc1Var.IHQe1A4L2xu)) {
                csVar = oc1Var;
            }
        }
        if (csVar != null) {
            return csVar;
        }
        if (!z) {
            return new defpackage.oc1(ny0Var.IHQe1A4L2xu());
        }
        defpackage.cb1 cb1Var = ny0Var.r1MBDhnF;
        if (cb1Var == null) {
            cb1Var = defpackage.ad1.xiZrDbcSW0;
        }
        return new defpackage.cs(new defpackage.qt0(obj, cb1Var));
    }
}
