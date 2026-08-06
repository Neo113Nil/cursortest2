package defpackage;

/* loaded from: classes.dex */
public final class s01 extends defpackage.ce1 implements defpackage.g00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.u01 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s01(defpackage.u01 u01Var, defpackage.ej ejVar, int i) {
        super(1, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = u01Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.u01 u01Var = this.ez2rX8ReCYw;
        defpackage.ej ejVar = (defpackage.ej) obj;
        switch (i) {
            case 0:
                return new defpackage.s01(u01Var, ejVar, 0).SyNS6RMn(ok1Var);
            case 1:
                return new defpackage.s01(u01Var, ejVar, 1).SyNS6RMn(ok1Var);
            default:
                return new defpackage.s01(u01Var, ejVar, 2).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.u01 u01Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        int i2 = 1;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.vc vcVar = u01Var.oh6vYeIP;
                    java.lang.String str = u01Var.adDC3e2L;
                    this.SH1y5HwkJhh = 1;
                    defpackage.l10 l10Var = vcVar.IHQe1A4L2xu;
                    l10Var.getClass();
                    java.lang.Object riuEU0zW4 = l10Var.riuEU0zW4(new defpackage.e10(str, l10Var, ejVar, 0), this);
                    if (riuEU0zW4 == vjVar) {
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
            case 1:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.vc vcVar2 = u01Var.r1MBDhnF;
                    java.lang.String str2 = u01Var.adDC3e2L;
                    this.SH1y5HwkJhh = 1;
                    defpackage.l10 l10Var2 = vcVar2.IHQe1A4L2xu;
                    l10Var2.getClass();
                    java.lang.Object riuEU0zW42 = l10Var2.riuEU0zW4(new defpackage.e10(str2, l10Var2, ejVar, i2), this);
                    if (riuEU0zW42 == vjVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i5 = this.SH1y5HwkJhh;
                if (i5 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.vc vcVar3 = u01Var.F7NU4MC0GW;
                    java.lang.String str3 = u01Var.adDC3e2L;
                    this.SH1y5HwkJhh = 1;
                    defpackage.l10 l10Var3 = vcVar3.IHQe1A4L2xu;
                    l10Var3.getClass();
                    java.lang.Object riuEU0zW43 = l10Var3.riuEU0zW4(new defpackage.e10(str3, l10Var3, ejVar, 2), this);
                    if (riuEU0zW43 == vjVar) {
                        break;
                    }
                } else if (i5 != 1) {
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
}
