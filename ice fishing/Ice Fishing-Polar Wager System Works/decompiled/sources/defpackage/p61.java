package defpackage;

/* loaded from: classes.dex */
public final class p61 extends defpackage.ce1 implements defpackage.g00 {
    public final /* synthetic */ defpackage.li1 DFo87pBq1E5;
    public final /* synthetic */ defpackage.s61 JlrlGoKF;
    public final /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ float SyNS6RMn;
    public final /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(java.lang.Object obj, java.lang.Object obj2, defpackage.s61 s61Var, defpackage.li1 li1Var, float f, defpackage.ej ejVar) {
        super(1, ejVar);
        this.SH1y5HwkJhh = obj;
        this.ez2rX8ReCYw = obj2;
        this.JlrlGoKF = s61Var;
        this.DFo87pBq1E5 = li1Var;
        this.SyNS6RMn = f;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.li1 li1Var = this.DFo87pBq1E5;
        float f = this.SyNS6RMn;
        return new defpackage.p61(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, li1Var, f, (defpackage.ej) obj).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.o61 o61Var = new defpackage.o61(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, null);
            this.riuEU0zW4 = 1;
            java.lang.Object kd6TUFXn = defpackage.h1.kd6TUFXn(o61Var, this);
            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
            if (kd6TUFXn == vjVar) {
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
