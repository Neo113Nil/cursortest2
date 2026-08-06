package defpackage;

/* loaded from: classes.dex */
public final class m61 extends defpackage.ce1 implements defpackage.g00 {
    public final /* synthetic */ defpackage.li1 DFo87pBq1E5;
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.s61 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(defpackage.li1 li1Var, defpackage.s61 s61Var, java.lang.Object obj, defpackage.ej ejVar) {
        super(1, ejVar);
        this.DFo87pBq1E5 = li1Var;
        this.ez2rX8ReCYw = s61Var;
        this.JlrlGoKF = obj;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.li1 li1Var = this.DFo87pBq1E5;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.s61 s61Var = this.ez2rX8ReCYw;
        defpackage.ej ejVar = (defpackage.ej) obj;
        switch (i) {
            case 0:
                return new defpackage.m61(li1Var, s61Var, obj2, ejVar).SyNS6RMn(ok1Var);
            default:
                return new defpackage.m61(s61Var, obj2, li1Var, ejVar).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.s61 s61Var = this.ez2rX8ReCYw;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.li1 li1Var = this.DFo87pBq1E5;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.cl clVar = new defpackage.cl(s61Var, obj2, li1Var, (defpackage.ej) null);
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.h1.kd6TUFXn(clVar, this) == vjVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                }
                li1Var.riuEU0zW4();
                break;
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    s61Var.G3OKOH3wZRC();
                    defpackage.qt0 qt0Var = s61Var.oh6vYeIP;
                    s61Var.JlrlGoKF = Long.MIN_VALUE;
                    s61Var.kNAkVymC(0.0f);
                    float f = obj2.equals(s61Var.r1MBDhnF.getValue()) ? -4.0f : obj2.equals(qt0Var.getValue()) ? -5.0f : -3.0f;
                    li1Var.QoRHpC4k(obj2);
                    li1Var.SyNS6RMn(0L);
                    qt0Var.setValue(obj2);
                    s61Var.kNAkVymC(0.0f);
                    s61Var.riuEU0zW4(obj2);
                    li1Var.SH1y5HwkJhh(f);
                    if (f == -3.0f) {
                        this.SH1y5HwkJhh = 1;
                        if (defpackage.s61.cnag84Bm(s61Var, this) == vjVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                }
                li1Var.riuEU0zW4();
                break;
        }
        return ok1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(defpackage.s61 s61Var, java.lang.Object obj, defpackage.li1 li1Var, defpackage.ej ejVar) {
        super(1, ejVar);
        this.ez2rX8ReCYw = s61Var;
        this.JlrlGoKF = obj;
        this.DFo87pBq1E5 = li1Var;
    }
}
