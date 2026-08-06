package defpackage;

/* loaded from: classes.dex */
public final class EXtogiMhuM extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object DFo87pBq1E5;
    public java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ java.lang.Object SyNS6RMn;
    public final /* synthetic */ long ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EXtogiMhuM(java.lang.Object obj, long j, java.lang.Object obj2, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.DFo87pBq1E5 = obj;
        this.ez2rX8ReCYw = j;
        this.SyNS6RMn = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (((defpackage.u80) r9).C0U8sNJm(r13) == r7) goto L31;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.qx0 qx0Var;
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.SyNS6RMn;
        long j = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj3 = this.DFo87pBq1E5;
        switch (i) {
            case 0:
                defpackage.zk0 zk0Var = (defpackage.zk0) obj2;
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    break;
                } else if (i2 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                } else if (i2 == 2) {
                    qx0Var = (defpackage.qx0) this.JlrlGoKF;
                    defpackage.f70.nBH8hAHy(obj);
                    this.JlrlGoKF = null;
                    this.SH1y5HwkJhh = 3;
                    if (zk0Var.IHQe1A4L2xu(qx0Var, this) != vjVar) {
                    }
                    break;
                } else if (i2 != 3) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                defpackage.px0 px0Var = new defpackage.px0(j);
                defpackage.qx0 qx0Var2 = new defpackage.qx0(px0Var);
                this.JlrlGoKF = qx0Var2;
                this.SH1y5HwkJhh = 2;
                if (zk0Var.IHQe1A4L2xu(px0Var, this) != vjVar) {
                    qx0Var = qx0Var2;
                    this.JlrlGoKF = null;
                    this.SH1y5HwkJhh = 3;
                    if (zk0Var.IHQe1A4L2xu(qx0Var, this) != vjVar) {
                    }
                }
                break;
            default:
                defpackage.i61 i61Var = (defpackage.i61) obj3;
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.g61 g61Var = (defpackage.g61) this.JlrlGoKF;
                    float AARZUJiTa = i61Var.AARZUJiTa(j);
                    defpackage.qm0 qm0Var = new defpackage.qm0((defpackage.oz0) obj2, i61Var, g61Var);
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.l80.adDC3e2L(0.0f, AARZUJiTa, null, qm0Var, this, 12) == vjVar) {
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
        switch (i) {
            case 0:
                return ((defpackage.EXtogiMhuM) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.EXtogiMhuM) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.g61) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        java.lang.Object obj2 = this.SyNS6RMn;
        java.lang.Object obj3 = this.DFo87pBq1E5;
        switch (i) {
            case 0:
                return new defpackage.EXtogiMhuM((defpackage.u80) obj3, this.ez2rX8ReCYw, (defpackage.zk0) obj2, ejVar, 0);
            default:
                defpackage.EXtogiMhuM eXtogiMhuM = new defpackage.EXtogiMhuM((defpackage.i61) obj3, this.ez2rX8ReCYw, (defpackage.oz0) obj2, ejVar, 1);
                eXtogiMhuM.JlrlGoKF = obj;
                return eXtogiMhuM;
        }
    }
}
