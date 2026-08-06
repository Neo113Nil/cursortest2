package defpackage;

/* loaded from: classes.dex */
public final class u3 extends defpackage.ce1 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object DFo87pBq1E5;
    public final /* synthetic */ defpackage.w3 JlrlGoKF;
    public final /* synthetic */ defpackage.g00 QoRHpC4k;
    public defpackage.nz0 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.ye1 SyNS6RMn;
    public final /* synthetic */ long cnag84Bm;
    public int ez2rX8ReCYw;
    public defpackage.d5 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(defpackage.w3 w3Var, java.lang.Object obj, defpackage.ye1 ye1Var, long j, defpackage.g00 g00Var, defpackage.ej ejVar) {
        super(1, ejVar);
        this.JlrlGoKF = w3Var;
        this.DFo87pBq1E5 = obj;
        this.SyNS6RMn = ye1Var;
        this.cnag84Bm = j;
        this.QoRHpC4k = g00Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        long j = this.cnag84Bm;
        defpackage.g00 g00Var = this.QoRHpC4k;
        return new defpackage.u3(this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, j, g00Var, (defpackage.ej) obj).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.w3 w3Var;
        defpackage.d5 d5Var;
        defpackage.nz0 nz0Var;
        java.util.concurrent.CancellationException cancellationException;
        defpackage.ye1 ye1Var = this.SyNS6RMn;
        int i = this.ez2rX8ReCYw;
        defpackage.w3 w3Var2 = this.JlrlGoKF;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            try {
                w3Var2.r1MBDhnF.AARZUJiTa = (defpackage.i5) ((defpackage.g00) w3Var2.IHQe1A4L2xu.xiZrDbcSW0).AARZUJiTa(this.DFo87pBq1E5);
                w3Var2.adDC3e2L.setValue(ye1Var.r1MBDhnF);
                w3Var2.F7NU4MC0GW.setValue(java.lang.Boolean.TRUE);
                defpackage.d5 d5Var2 = w3Var2.r1MBDhnF;
                defpackage.d5 d5Var3 = new defpackage.d5(d5Var2.adDC3e2L, d5Var2.xiZrDbcSW0.getValue(), defpackage.ci0.kd6TUFXn(d5Var2.AARZUJiTa), d5Var2.EXtogiMhuM, Long.MIN_VALUE, d5Var2.SH1y5HwkJhh);
                defpackage.nz0 nz0Var2 = new defpackage.nz0();
                long j = this.cnag84Bm;
                defpackage.t3 t3Var = new defpackage.t3(w3Var2, d5Var3, this.QoRHpC4k, nz0Var2, 0);
                w3Var = w3Var2;
                try {
                    this.riuEU0zW4 = d5Var3;
                    this.SH1y5HwkJhh = nz0Var2;
                    this.ez2rX8ReCYw = 1;
                    java.lang.Object F7NU4MC0GW = defpackage.l80.F7NU4MC0GW(d5Var3, ye1Var, j, t3Var, this);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (F7NU4MC0GW == vjVar) {
                        return vjVar;
                    }
                    d5Var = d5Var3;
                    nz0Var = nz0Var2;
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    cancellationException = e;
                    defpackage.w3.oh6vYeIP(w3Var);
                    throw cancellationException;
                }
            } catch (java.util.concurrent.CancellationException e2) {
                e = e2;
                w3Var = w3Var2;
                cancellationException = e;
                defpackage.w3.oh6vYeIP(w3Var);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nz0Var = this.SH1y5HwkJhh;
            d5Var = this.riuEU0zW4;
            try {
                defpackage.f70.nBH8hAHy(obj);
                w3Var = w3Var2;
            } catch (java.util.concurrent.CancellationException e3) {
                cancellationException = e3;
                w3Var = w3Var2;
                defpackage.w3.oh6vYeIP(w3Var);
                throw cancellationException;
            }
        }
        defpackage.z4 z4Var = nz0Var.adDC3e2L ? defpackage.z4.adDC3e2L : defpackage.z4.xiZrDbcSW0;
        defpackage.w3.oh6vYeIP(w3Var);
        return new defpackage.a5(d5Var, z4Var);
    }
}
