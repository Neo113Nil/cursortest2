package defpackage;

/* loaded from: classes.dex */
public final class xb extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.iw DFo87pBq1E5;
    public final /* synthetic */ defpackage.ac JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(defpackage.ac acVar, defpackage.iw iwVar, java.lang.Object obj, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = acVar;
        this.DFo87pBq1E5 = iwVar;
        this.ez2rX8ReCYw = obj;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.l00 l00Var = this.JlrlGoKF.riuEU0zW4;
                    java.lang.Object obj2 = this.ez2rX8ReCYw;
                    this.SH1y5HwkJhh = 1;
                    if (l00Var.F7NU4MC0GW(this.DFo87pBq1E5, obj2, this) == vjVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.uj ujVar = (defpackage.uj) this.ez2rX8ReCYw;
                    defpackage.rz0 rz0Var = new defpackage.rz0();
                    defpackage.ac acVar = this.JlrlGoKF;
                    defpackage.hw hwVar = acVar.EXtogiMhuM;
                    defpackage.zb zbVar = new defpackage.zb(rz0Var, ujVar, acVar, this.DFo87pBq1E5, 0);
                    this.SH1y5HwkJhh = 1;
                    if (hwVar.IHQe1A4L2xu(zbVar, this) == vjVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
        }
        return vjVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.uj ujVar = (defpackage.uj) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.xb) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.iw iwVar = this.DFo87pBq1E5;
        defpackage.ac acVar = this.JlrlGoKF;
        switch (i) {
            case 0:
                return new defpackage.xb(acVar, iwVar, this.ez2rX8ReCYw, ejVar);
            default:
                defpackage.xb xbVar = new defpackage.xb(acVar, iwVar, ejVar);
                xbVar.ez2rX8ReCYw = obj;
                return xbVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(defpackage.ac acVar, defpackage.iw iwVar, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = acVar;
        this.DFo87pBq1E5 = iwVar;
    }
}
