package defpackage;

/* loaded from: classes.dex */
public final class o61 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.s61 DFo87pBq1E5;
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ defpackage.li1 SyNS6RMn;
    public final /* synthetic */ float cnag84Bm;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(java.lang.Object obj, java.lang.Object obj2, defpackage.s61 s61Var, defpackage.li1 li1Var, float f, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = obj;
        this.JlrlGoKF = obj2;
        this.DFo87pBq1E5 = s61Var;
        this.SyNS6RMn = li1Var;
        this.cnag84Bm = f;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.ej ejVar = null;
        defpackage.s61 s61Var = this.DFo87pBq1E5;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.uj ujVar = (defpackage.uj) this.SH1y5HwkJhh;
            java.lang.Object obj2 = this.ez2rX8ReCYw;
            java.lang.Object obj3 = this.JlrlGoKF;
            if (defpackage.x70.QoRHpC4k(obj2, obj3)) {
                s61Var.SyNS6RMn = null;
                if (defpackage.x70.QoRHpC4k(s61Var.r1MBDhnF.getValue(), obj2)) {
                    return ok1Var;
                }
            } else {
                defpackage.s61.JlrlGoKF(s61Var);
            }
            boolean QoRHpC4k = defpackage.x70.QoRHpC4k(obj2, obj3);
            float f = this.cnag84Bm;
            if (!QoRHpC4k) {
                defpackage.li1 li1Var = this.SyNS6RMn;
                li1Var.QoRHpC4k(obj2);
                li1Var.SyNS6RMn(0L);
                s61Var.oh6vYeIP.setValue(obj2);
                li1Var.SH1y5HwkJhh(f);
            }
            s61Var.kNAkVymC(f);
            if (s61Var.DFo87pBq1E5.riuEU0zW4()) {
                defpackage.fm.SiPhmbmu(ujVar, null, new defpackage.ExFEDwBK(s61Var, ejVar, 13), 3);
            } else {
                s61Var.JlrlGoKF = Long.MIN_VALUE;
            }
            this.riuEU0zW4 = 1;
            java.lang.Object cnag84Bm = defpackage.s61.cnag84Bm(s61Var, this);
            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
            if (cnag84Bm == vjVar) {
                return vjVar;
            }
        } else {
            if (i != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.f70.nBH8hAHy(obj);
        }
        s61Var.fnWB2E7cs();
        return ok1Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.o61) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.o61 o61Var = new defpackage.o61(this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, this.cnag84Bm, ejVar);
        o61Var.SH1y5HwkJhh = obj;
        return o61Var;
    }
}
