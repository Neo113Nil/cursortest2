package defpackage;

/* loaded from: classes.dex */
public final class pm extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.qm DFo87pBq1E5;
    public final /* synthetic */ float JlrlGoKF;
    public defpackage.d5 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.e61 SyNS6RMn;
    public int ez2rX8ReCYw;
    public defpackage.oz0 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(float f, defpackage.qm qmVar, defpackage.e61 e61Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = f;
        this.DFo87pBq1E5 = qmVar;
        this.SyNS6RMn = e61Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        float f;
        defpackage.d5 d5Var;
        defpackage.oz0 oz0Var;
        defpackage.d5 d5Var2;
        defpackage.hm hmVar;
        defpackage.t3 t3Var;
        int i = this.ez2rX8ReCYw;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            f = this.JlrlGoKF;
            if (java.lang.Math.abs(f) > 1.0f) {
                defpackage.oz0 oz0Var2 = new defpackage.oz0();
                oz0Var2.adDC3e2L = f;
                defpackage.oz0 oz0Var3 = new defpackage.oz0();
                defpackage.d5 oh6vYeIP = defpackage.x70.oh6vYeIP(f, 28);
                try {
                    defpackage.qm qmVar = this.DFo87pBq1E5;
                    hmVar = qmVar.IHQe1A4L2xu;
                    t3Var = new defpackage.t3(oz0Var3, this.SyNS6RMn, oz0Var2, qmVar, 1);
                    this.riuEU0zW4 = oz0Var2;
                    this.SH1y5HwkJhh = oh6vYeIP;
                    this.ez2rX8ReCYw = 1;
                    d5Var = oh6vYeIP;
                } catch (java.util.concurrent.CancellationException unused) {
                    d5Var = oh6vYeIP;
                }
                try {
                    java.lang.Object F7NU4MC0GW = defpackage.l80.F7NU4MC0GW(d5Var, new defpackage.gm(hmVar, defpackage.gq1.QoRHpC4k, oh6vYeIP.xiZrDbcSW0.getValue(), oh6vYeIP.AARZUJiTa), Long.MIN_VALUE, t3Var, this);
                    java.lang.Object obj2 = defpackage.vj.adDC3e2L;
                    if (F7NU4MC0GW != obj2) {
                        F7NU4MC0GW = defpackage.ok1.IHQe1A4L2xu;
                    }
                    if (F7NU4MC0GW == obj2) {
                        return obj2;
                    }
                    oz0Var = oz0Var2;
                } catch (java.util.concurrent.CancellationException unused2) {
                    oz0Var = oz0Var2;
                    d5Var2 = d5Var;
                    oz0Var.adDC3e2L = ((java.lang.Number) ((defpackage.g00) d5Var2.adDC3e2L.AARZUJiTa).AARZUJiTa(d5Var2.AARZUJiTa)).floatValue();
                    f = oz0Var.adDC3e2L;
                    return new java.lang.Float(f);
                }
            }
            return new java.lang.Float(f);
        }
        if (i != 1) {
            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d5Var2 = this.SH1y5HwkJhh;
        oz0Var = this.riuEU0zW4;
        try {
            defpackage.f70.nBH8hAHy(obj);
        } catch (java.util.concurrent.CancellationException unused3) {
            oz0Var.adDC3e2L = ((java.lang.Number) ((defpackage.g00) d5Var2.adDC3e2L.AARZUJiTa).AARZUJiTa(d5Var2.AARZUJiTa)).floatValue();
            f = oz0Var.adDC3e2L;
            return new java.lang.Float(f);
        }
        f = oz0Var.adDC3e2L;
        return new java.lang.Float(f);
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.pm) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.pm(this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, ejVar);
    }
}
