package defpackage;

/* loaded from: classes.dex */
public abstract class vb extends defpackage.ub {
    public final defpackage.hw EXtogiMhuM;

    public vb(defpackage.hw hwVar, defpackage.lj ljVar, int i, defpackage.t9 t9Var) {
        super(ljVar, i, t9Var);
        this.EXtogiMhuM = hwVar;
    }

    public abstract java.lang.Object EXtogiMhuM(defpackage.iw iwVar, defpackage.ej ejVar);

    @Override // defpackage.ub
    public final java.lang.Object F7NU4MC0GW(defpackage.yx0 yx0Var, defpackage.ej ejVar) {
        java.lang.Object EXtogiMhuM = EXtogiMhuM(new defpackage.x71(yx0Var), ejVar);
        return EXtogiMhuM == defpackage.vj.adDC3e2L ? EXtogiMhuM : defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.ub, defpackage.hw
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        int i = this.xiZrDbcSW0;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == -3) {
            defpackage.lj xiZrDbcSW0 = ejVar.xiZrDbcSW0();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            defpackage.e6 e6Var = new defpackage.e6(11, (byte) 0);
            defpackage.lj ljVar = this.adDC3e2L;
            defpackage.lj JlrlGoKF = !((java.lang.Boolean) ljVar.EgCjBq0SZwJ(e6Var, bool)).booleanValue() ? xiZrDbcSW0.JlrlGoKF(ljVar) : defpackage.s21.C0U8sNJm(xiZrDbcSW0, ljVar, false);
            if (defpackage.x70.QoRHpC4k(JlrlGoKF, xiZrDbcSW0)) {
                java.lang.Object EXtogiMhuM = EXtogiMhuM(iwVar, ejVar);
                if (EXtogiMhuM == vjVar) {
                    return EXtogiMhuM;
                }
            } else {
                defpackage.n nVar = defpackage.n.QQUzIjv3iOC5;
                if (defpackage.x70.QoRHpC4k(JlrlGoKF.cnag84Bm(nVar), xiZrDbcSW0.cnag84Bm(nVar))) {
                    defpackage.lj xiZrDbcSW02 = ejVar.xiZrDbcSW0();
                    if (!(iwVar instanceof defpackage.x71) && !(iwVar instanceof defpackage.qp0)) {
                        iwVar = new defpackage.t4(iwVar, xiZrDbcSW02);
                    }
                    java.lang.Object Ye0N2xE9Hc = defpackage.fm.Ye0N2xE9Hc(JlrlGoKF, iwVar, defpackage.x70.QPwENk36pDC(JlrlGoKF), new defpackage.adDC3e2L(this, (defpackage.ej) null, 7), ejVar);
                    if (Ye0N2xE9Hc == vjVar) {
                        return Ye0N2xE9Hc;
                    }
                }
            }
            return defpackage.ok1.IHQe1A4L2xu;
        }
        java.lang.Object IHQe1A4L2xu = super.IHQe1A4L2xu(iwVar, ejVar);
        if (IHQe1A4L2xu == vjVar) {
            return IHQe1A4L2xu;
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.ub
    public final java.lang.String toString() {
        return this.EXtogiMhuM + " -> " + super.toString();
    }
}
