package defpackage;

/* loaded from: classes.dex */
public final class r81 extends defpackage.ce1 implements defpackage.l00 {
    public /* synthetic */ defpackage.iw SH1y5HwkJhh;
    public /* synthetic */ java.lang.Throwable ez2rX8ReCYw;
    public int riuEU0zW4;

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.r81 r81Var = new defpackage.r81(3, (defpackage.ej) obj3);
        r81Var.SH1y5HwkJhh = (defpackage.iw) obj;
        r81Var.ez2rX8ReCYw = (java.lang.Throwable) obj2;
        return r81Var.SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.iw iwVar = this.SH1y5HwkJhh;
        java.lang.Throwable th = this.ez2rX8ReCYw;
        int i = this.riuEU0zW4;
        boolean z = true;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            if (!(th instanceof java.io.IOException)) {
                throw th;
            }
            defpackage.kl0 kl0Var = new defpackage.kl0(z);
            this.SH1y5HwkJhh = null;
            this.ez2rX8ReCYw = null;
            this.riuEU0zW4 = 1;
            java.lang.Object EXtogiMhuM = iwVar.EXtogiMhuM(kl0Var, this);
            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
            if (EXtogiMhuM == vjVar) {
                return vjVar;
            }
        } else {
            if (i != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.f70.nBH8hAHy(obj);
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
