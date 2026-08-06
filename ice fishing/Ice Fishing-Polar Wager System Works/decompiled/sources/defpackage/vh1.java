package defpackage;

/* loaded from: classes.dex */
public final class vh1 extends defpackage.ce1 implements defpackage.g00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.wh1 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh1(defpackage.wh1 wh1Var, defpackage.ej ejVar, int i) {
        super(1, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = wh1Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.wh1 wh1Var = this.ez2rX8ReCYw;
        defpackage.ej ejVar = (defpackage.ej) obj;
        switch (i) {
            case 0:
                return new defpackage.vh1(wh1Var, ejVar, 0).SyNS6RMn(ok1Var);
            default:
                return new defpackage.vh1(wh1Var, ejVar, 1).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.wh1 wh1Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.oa oaVar = wh1Var.oh6vYeIP;
                    this.SH1y5HwkJhh = 1;
                    defpackage.l10 l10Var = oaVar.IHQe1A4L2xu;
                    oaVar.oh6vYeIP.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    l10Var.getClass();
                    java.lang.Object riuEU0zW4 = l10Var.riuEU0zW4(new defpackage.d10(currentTimeMillis, l10Var, null, 1), this);
                    if (riuEU0zW4 == vjVar) {
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
                    defpackage.oa oaVar2 = wh1Var.F7NU4MC0GW;
                    this.SH1y5HwkJhh = 1;
                    defpackage.l10 l10Var2 = oaVar2.IHQe1A4L2xu;
                    defpackage.frpfPPIgqM9O frpfppigqm9o = defpackage.ry0.adDC3e2L;
                    long nextLong = defpackage.ry0.adDC3e2L.F7NU4MC0GW().nextLong();
                    oaVar2.oh6vYeIP.getClass();
                    java.lang.System.currentTimeMillis();
                    l10Var2.getClass();
                    java.lang.Object riuEU0zW42 = l10Var2.riuEU0zW4(new defpackage.d10(l10Var2, nextLong, null), this);
                    if (riuEU0zW42 == vjVar) {
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
}
