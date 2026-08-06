package defpackage;

/* loaded from: classes.dex */
public final class f61 extends defpackage.ce1 implements defpackage.k00 {
    public /* synthetic */ java.lang.Object DFo87pBq1E5;
    public int JlrlGoKF;
    public final /* synthetic */ long QoRHpC4k;
    public defpackage.qz0 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.i61 SyNS6RMn;
    public final /* synthetic */ defpackage.qz0 cnag84Bm;
    public long ez2rX8ReCYw;
    public defpackage.i61 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(defpackage.i61 i61Var, defpackage.qz0 qz0Var, long j, defpackage.ej ejVar) {
        super(2, ejVar);
        this.SyNS6RMn = i61Var;
        this.cnag84Bm = qz0Var;
        this.QoRHpC4k = j;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.i61 i61Var;
        defpackage.qz0 qz0Var;
        defpackage.i61 i61Var2;
        long j;
        int i = this.JlrlGoKF;
        defpackage.ks0 ks0Var = defpackage.ks0.xiZrDbcSW0;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.g61 g61Var = (defpackage.g61) this.DFo87pBq1E5;
            i61Var = this.SyNS6RMn;
            defpackage.e61 e61Var = new defpackage.e61(i61Var, g61Var);
            defpackage.qm qmVar = i61Var.r1MBDhnF;
            qz0Var = this.cnag84Bm;
            long j2 = qz0Var.adDC3e2L;
            defpackage.ks0 ks0Var2 = i61Var.F7NU4MC0GW;
            long j3 = this.QoRHpC4k;
            float F7NU4MC0GW = i61Var.F7NU4MC0GW(ks0Var2 == ks0Var ? defpackage.rl1.oh6vYeIP(j3) : defpackage.rl1.r1MBDhnF(j3));
            this.DFo87pBq1E5 = i61Var;
            this.riuEU0zW4 = i61Var;
            this.SH1y5HwkJhh = qz0Var;
            this.ez2rX8ReCYw = j2;
            this.JlrlGoKF = 1;
            qmVar.getClass();
            obj = defpackage.fm.QPwENk36pDC(qmVar.oh6vYeIP, new defpackage.pm(F7NU4MC0GW, qmVar, e61Var, null), this);
            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
            if (obj == vjVar) {
                return vjVar;
            }
            i61Var2 = i61Var;
            j = j2;
        } else {
            if (i != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.ez2rX8ReCYw;
            qz0Var = this.SH1y5HwkJhh;
            i61Var = this.riuEU0zW4;
            i61Var2 = (defpackage.i61) this.DFo87pBq1E5;
            defpackage.f70.nBH8hAHy(obj);
        }
        float F7NU4MC0GW2 = i61Var2.F7NU4MC0GW(((java.lang.Number) obj).floatValue());
        qz0Var.adDC3e2L = i61Var.F7NU4MC0GW == ks0Var ? defpackage.rl1.IHQe1A4L2xu(j, F7NU4MC0GW2, 0.0f, 2) : defpackage.rl1.IHQe1A4L2xu(j, 0.0f, F7NU4MC0GW2, 1);
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.f61) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.g61) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.f61 f61Var = new defpackage.f61(this.SyNS6RMn, this.cnag84Bm, this.QoRHpC4k, ejVar);
        f61Var.DFo87pBq1E5 = obj;
        return f61Var;
    }
}
