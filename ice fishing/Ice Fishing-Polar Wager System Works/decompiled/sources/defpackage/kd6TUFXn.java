package defpackage;

/* loaded from: classes.dex */
public abstract class kd6TUFXn extends defpackage.c90 implements defpackage.ej, defpackage.uj {
    public final defpackage.lj riuEU0zW4;

    public kd6TUFXn(defpackage.lj ljVar, boolean z) {
        super(z);
        QPwENk36pDC((defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS));
        this.riuEU0zW4 = ljVar.JlrlGoKF(this);
    }

    @Override // defpackage.uj
    public final defpackage.lj AARZUJiTa() {
        return this.riuEU0zW4;
    }

    @Override // defpackage.c90
    public final void AQHddgaEX(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bf)) {
            ZNF7fheNE(obj);
        } else {
            defpackage.bf bfVar = (defpackage.bf) obj;
            dOmtpLcqqI1y(bfVar.IHQe1A4L2xu, defpackage.bf.oh6vYeIP.get(bfVar) != 0);
        }
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(obj);
        if (IHQe1A4L2xu != null) {
            obj = new defpackage.bf(IHQe1A4L2xu, false);
        }
        java.lang.Object AsxAYCCkb3Hi = AsxAYCCkb3Hi(obj);
        if (AsxAYCCkb3Hi == defpackage.gq1.xiZrDbcSW0) {
            return;
        }
        QQUzIjv3iOC5(AsxAYCCkb3Hi);
    }

    @Override // defpackage.c90
    public final void WLpAkxCo(defpackage.cf cfVar) {
        defpackage.gq1.kNAkVymC(this.riuEU0zW4, cfVar);
    }

    public final void flIYPhR0(defpackage.xj xjVar, defpackage.kd6TUFXn kd6tufxn, defpackage.k00 k00Var) {
        java.lang.Object adDC3e2L;
        int ordinal = xjVar.ordinal();
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        if (ordinal == 0) {
            try {
                defpackage.fm.hyxIchWRW(defpackage.c80.V7bD7b8KA(defpackage.c80.DFo87pBq1E5(kd6tufxn, this, k00Var)), ok1Var);
                return;
            } finally {
                SH1y5HwkJhh(new defpackage.p11(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                k00Var.getClass();
                defpackage.c80.V7bD7b8KA(defpackage.c80.DFo87pBq1E5(kd6tufxn, this, k00Var)).SH1y5HwkJhh(ok1Var);
                return;
            }
            if (ordinal != 3) {
                defpackage.db.F7NU4MC0GW();
                return;
            }
            try {
                defpackage.lj ljVar = this.riuEU0zW4;
                java.lang.Object nVhUznk1t = defpackage.x70.nVhUznk1t(ljVar, null);
                try {
                    if (k00Var instanceof defpackage.v7) {
                        defpackage.mj1.kNAkVymC(2, k00Var);
                        adDC3e2L = k00Var.adDC3e2L(kd6tufxn, this);
                    } else {
                        adDC3e2L = defpackage.c80.wll2JLbTBC2(k00Var, kd6tufxn, this);
                    }
                    defpackage.x70.hkbnNdmy(ljVar, nVhUznk1t);
                    if (adDC3e2L != defpackage.vj.adDC3e2L) {
                        SH1y5HwkJhh(adDC3e2L);
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.x70.hkbnNdmy(ljVar, nVhUznk1t);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
            }
        }
    }

    @Override // defpackage.c90
    public final java.lang.String frpfPPIgqM9O() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return this.riuEU0zW4;
    }

    public void ZNF7fheNE(java.lang.Object obj) {
    }

    public void dOmtpLcqqI1y(java.lang.Throwable th, boolean z) {
    }
}
