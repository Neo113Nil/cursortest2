package defpackage;

/* loaded from: classes.dex */
public abstract class ub implements defpackage.w00 {
    public final defpackage.t9 AARZUJiTa;
    public final defpackage.lj adDC3e2L;
    public final int xiZrDbcSW0;

    public ub(defpackage.lj ljVar, int i, defpackage.t9 t9Var) {
        this.adDC3e2L = ljVar;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = t9Var;
    }

    public defpackage.sb AARZUJiTa(defpackage.uj ujVar) {
        int i = this.xiZrDbcSW0;
        if (i == -3) {
            i = -2;
        }
        defpackage.k00 addc3e2l = new defpackage.adDC3e2L(this, (defpackage.ej) null, 6);
        defpackage.x9 oh6vYeIP = defpackage.w70.oh6vYeIP(i, 4, this.AARZUJiTa);
        defpackage.lj C0U8sNJm = defpackage.s21.C0U8sNJm(ujVar.AARZUJiTa(), this.adDC3e2L, true);
        defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
        if (C0U8sNJm != bnVar && C0U8sNJm.cnag84Bm(defpackage.n.QQUzIjv3iOC5) == null) {
            C0U8sNJm = C0U8sNJm.JlrlGoKF(bnVar);
        }
        defpackage.yx0 yx0Var = new defpackage.yx0(C0U8sNJm, oh6vYeIP);
        yx0Var.flIYPhR0(defpackage.xj.AARZUJiTa, yx0Var, addc3e2l);
        return yx0Var;
    }

    public abstract java.lang.Object F7NU4MC0GW(defpackage.yx0 yx0Var, defpackage.ej ejVar);

    @Override // defpackage.hw
    public java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        java.lang.Object kd6TUFXn = defpackage.h1.kd6TUFXn(new defpackage.AARZUJiTa(iwVar, this, null, 3), ejVar);
        return kd6TUFXn == defpackage.vj.adDC3e2L ? kd6TUFXn : defpackage.ok1.IHQe1A4L2xu;
    }

    public abstract defpackage.ub adDC3e2L(defpackage.lj ljVar, int i, defpackage.t9 t9Var);

    @Override // defpackage.w00
    public final defpackage.hw oh6vYeIP(defpackage.lj ljVar, int i, defpackage.t9 t9Var) {
        defpackage.lj ljVar2 = this.adDC3e2L;
        defpackage.lj JlrlGoKF = ljVar.JlrlGoKF(ljVar2);
        defpackage.t9 t9Var2 = defpackage.t9.adDC3e2L;
        defpackage.t9 t9Var3 = this.AARZUJiTa;
        int i2 = this.xiZrDbcSW0;
        if (t9Var == t9Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            t9Var = t9Var3;
        }
        return (defpackage.x70.QoRHpC4k(JlrlGoKF, ljVar2) && i == i2 && t9Var == t9Var3) ? this : adDC3e2L(JlrlGoKF, i, t9Var);
    }

    public java.lang.String r1MBDhnF() {
        return null;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String r1MBDhnF = r1MBDhnF();
        if (r1MBDhnF != null) {
            arrayList.add(r1MBDhnF);
        }
        defpackage.lt ltVar = defpackage.lt.adDC3e2L;
        defpackage.lj ljVar = this.adDC3e2L;
        if (ljVar != ltVar) {
            arrayList.add("context=" + ljVar);
        }
        int i = this.xiZrDbcSW0;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        defpackage.t9 t9Var = defpackage.t9.adDC3e2L;
        defpackage.t9 t9Var2 = this.AARZUJiTa;
        if (t9Var2 != t9Var) {
            arrayList.add("onBufferOverflow=" + t9Var2);
        }
        return getClass().getSimpleName() + '[' + defpackage.td.cSNyPqwud(arrayList, ", ", null, null, null, 62) + ']';
    }

    public defpackage.hw xiZrDbcSW0() {
        return null;
    }
}
