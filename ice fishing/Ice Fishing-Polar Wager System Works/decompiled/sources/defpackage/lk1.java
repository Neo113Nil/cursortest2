package defpackage;

/* loaded from: classes.dex */
public final class lk1 extends defpackage.e51 {
    public final java.lang.ThreadLocal ez2rX8ReCYw;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lk1(defpackage.ej ejVar, defpackage.lj ljVar) {
        super(ejVar, ljVar.cnag84Bm(r0) == null ? ljVar.JlrlGoKF(r0) : ljVar);
        defpackage.gb gbVar = defpackage.gb.EXtogiMhuM;
        this.ez2rX8ReCYw = new java.lang.ThreadLocal();
        if (ejVar.xiZrDbcSW0().cnag84Bm(defpackage.n.QQUzIjv3iOC5) instanceof defpackage.nj) {
            return;
        }
        java.lang.Object nVhUznk1t = defpackage.x70.nVhUznk1t(ljVar, null);
        defpackage.x70.hkbnNdmy(ljVar, nVhUznk1t);
        JX5fKip1C6(ljVar, nVhUznk1t);
    }

    public final void JX5fKip1C6(defpackage.lj ljVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.ez2rX8ReCYw.set(new defpackage.et0(ljVar, obj));
    }

    @Override // defpackage.e51, defpackage.c90
    public final void QQUzIjv3iOC5(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            defpackage.et0 et0Var = (defpackage.et0) this.ez2rX8ReCYw.get();
            if (et0Var != null) {
                defpackage.x70.hkbnNdmy((defpackage.lj) et0Var.adDC3e2L, et0Var.xiZrDbcSW0);
            }
            this.ez2rX8ReCYw.remove();
        }
        java.lang.Object v5iciZok = defpackage.gq1.v5iciZok(obj);
        defpackage.ej ejVar = this.SH1y5HwkJhh;
        defpackage.lj xiZrDbcSW0 = ejVar.xiZrDbcSW0();
        java.lang.Object nVhUznk1t = defpackage.x70.nVhUznk1t(xiZrDbcSW0, null);
        defpackage.lk1 OtkytngK3Mr = nVhUznk1t != defpackage.x70.riuEU0zW4 ? defpackage.s21.OtkytngK3Mr(ejVar, xiZrDbcSW0, nVhUznk1t) : null;
        try {
            this.SH1y5HwkJhh.SH1y5HwkJhh(v5iciZok);
            if (OtkytngK3Mr == null || OtkytngK3Mr.k3hcgHS3MP()) {
                defpackage.x70.hkbnNdmy(xiZrDbcSW0, nVhUznk1t);
            }
        } catch (java.lang.Throwable th) {
            if (OtkytngK3Mr == null || OtkytngK3Mr.k3hcgHS3MP()) {
                defpackage.x70.hkbnNdmy(xiZrDbcSW0, nVhUznk1t);
            }
            throw th;
        }
    }

    public final boolean k3hcgHS3MP() {
        boolean z = this.threadLocalIsSet && this.ez2rX8ReCYw.get() == null;
        this.ez2rX8ReCYw.remove();
        return !z;
    }
}
