package defpackage;

/* loaded from: classes.dex */
public final class bx extends defpackage.ce1 implements defpackage.l00 {
    public final /* synthetic */ defpackage.s00 DFo87pBq1E5;
    public /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ defpackage.iw ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(defpackage.ej ejVar, defpackage.h10 h10Var) {
        super(3, ejVar);
        this.riuEU0zW4 = 1;
        this.DFo87pBq1E5 = h10Var;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.s00 s00Var = this.DFo87pBq1E5;
        defpackage.iw iwVar = (defpackage.iw) obj;
        switch (i) {
            case 0:
                defpackage.bx bxVar = new defpackage.bx((defpackage.k00) s00Var, (defpackage.ej) obj3, 0);
                bxVar.ez2rX8ReCYw = iwVar;
                bxVar.JlrlGoKF = obj2;
                return bxVar.SyNS6RMn(ok1Var);
            case 1:
                defpackage.bx bxVar2 = new defpackage.bx((defpackage.ej) obj3, (defpackage.h10) s00Var);
                bxVar2.ez2rX8ReCYw = iwVar;
                bxVar2.JlrlGoKF = (java.lang.Object[]) obj2;
                return bxVar2.SyNS6RMn(ok1Var);
            default:
                defpackage.bx bxVar3 = new defpackage.bx((defpackage.yp0) s00Var, (defpackage.ej) obj3, 2);
                bxVar3.ez2rX8ReCYw = iwVar;
                bxVar3.JlrlGoKF = (java.lang.Object[]) obj2;
                return bxVar3.SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.iw iwVar;
        defpackage.iw iwVar2;
        defpackage.iw iwVar3;
        int i = this.riuEU0zW4;
        defpackage.s00 s00Var = this.DFo87pBq1E5;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    iwVar = this.ez2rX8ReCYw;
                    java.lang.Object obj2 = this.JlrlGoKF;
                    this.ez2rX8ReCYw = iwVar;
                    this.SH1y5HwkJhh = 1;
                    obj = ((defpackage.k00) s00Var).adDC3e2L(obj2, this);
                    if (obj == vjVar) {
                    }
                } else if (i2 == 1) {
                    iwVar = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                } else if (i2 != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                this.ez2rX8ReCYw = null;
                this.SH1y5HwkJhh = 2;
                if (iwVar.EXtogiMhuM(obj, this) == vjVar) {
                }
                break;
            case 1:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    iwVar2 = this.ez2rX8ReCYw;
                    java.lang.Object[] objArr = (java.lang.Object[]) this.JlrlGoKF;
                    java.lang.Object obj3 = objArr[0];
                    java.lang.Object obj4 = objArr[1];
                    java.lang.Object obj5 = objArr[2];
                    java.lang.Object obj6 = objArr[3];
                    java.lang.Object obj7 = objArr[4];
                    this.ez2rX8ReCYw = iwVar2;
                    this.SH1y5HwkJhh = 1;
                    defpackage.h10 h10Var = new defpackage.h10(((defpackage.h10) s00Var).SyNS6RMn, this);
                    h10Var.riuEU0zW4 = (com.corsair.ledger.data.local.entity.PlayerEntity) obj3;
                    h10Var.SH1y5HwkJhh = (java.util.List) obj4;
                    h10Var.ez2rX8ReCYw = (java.util.List) obj5;
                    h10Var.JlrlGoKF = (java.util.List) obj6;
                    h10Var.DFo87pBq1E5 = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj7;
                    obj = h10Var.SyNS6RMn(ok1Var);
                    if (obj == vjVar) {
                    }
                } else if (i3 == 1) {
                    iwVar2 = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                } else if (i3 != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                this.ez2rX8ReCYw = null;
                this.SH1y5HwkJhh = 2;
                if (iwVar2.EXtogiMhuM(obj, this) == vjVar) {
                }
                break;
            default:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    iwVar3 = this.ez2rX8ReCYw;
                    java.lang.Object[] objArr2 = (java.lang.Object[]) this.JlrlGoKF;
                    java.lang.Object obj8 = objArr2[0];
                    java.lang.Object obj9 = objArr2[1];
                    this.ez2rX8ReCYw = iwVar3;
                    this.SH1y5HwkJhh = 1;
                    obj = ((defpackage.yp0) s00Var).F7NU4MC0GW(obj8, obj9, this);
                    if (obj == vjVar) {
                    }
                } else if (i4 == 1) {
                    iwVar3 = this.ez2rX8ReCYw;
                    defpackage.f70.nBH8hAHy(obj);
                } else if (i4 != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                this.ez2rX8ReCYw = null;
                this.SH1y5HwkJhh = 2;
                if (iwVar3.EXtogiMhuM(obj, this) == vjVar) {
                }
                break;
        }
        return ok1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx(defpackage.s00 s00Var, defpackage.ej ejVar, int i) {
        super(3, ejVar);
        this.riuEU0zW4 = i;
        this.DFo87pBq1E5 = s00Var;
    }
}
