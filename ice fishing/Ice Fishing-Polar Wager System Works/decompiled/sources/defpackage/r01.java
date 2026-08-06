package defpackage;

/* loaded from: classes.dex */
public final class r01 extends defpackage.ce1 implements defpackage.k00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.u01 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r01(defpackage.u01 u01Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = u01Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.g01 g01Var = defpackage.g01.IHQe1A4L2xu;
        defpackage.u01 u01Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.x9 x9Var = u01Var.EXtogiMhuM;
                    this.SH1y5HwkJhh = 1;
                    if (x9Var.IHQe1A4L2xu(this, g01Var) == vjVar) {
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
                    defpackage.x9 x9Var2 = u01Var.EXtogiMhuM;
                    this.SH1y5HwkJhh = 1;
                    if (x9Var2.IHQe1A4L2xu(this, g01Var) == vjVar) {
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
        return ((defpackage.r01) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.u01 u01Var = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.r01(u01Var, ejVar, 0);
            default:
                return new defpackage.r01(u01Var, ejVar, 1);
        }
    }
}
