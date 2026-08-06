package defpackage;

/* loaded from: classes.dex */
public final class ml extends defpackage.ce1 implements defpackage.l00 {
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(defpackage.bm bmVar, defpackage.ej ejVar) {
        super(3, ejVar);
        this.ez2rX8ReCYw = bmVar;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return new defpackage.ml((defpackage.bm) this.ez2rX8ReCYw, (defpackage.ej) obj3).SyNS6RMn(ok1Var);
            default:
                ((java.lang.Boolean) obj2).getClass();
                defpackage.ml mlVar = new defpackage.ml(3, (defpackage.ej) obj3);
                mlVar.ez2rX8ReCYw = (defpackage.gv) obj;
                return mlVar.SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.bm bmVar = (defpackage.bm) this.ez2rX8ReCYw;
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.bm.r1MBDhnF(bmVar, this) == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 != 0) {
                    if (i3 == 1) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.f70.nBH8hAHy(obj);
                defpackage.gv gvVar = (defpackage.gv) this.ez2rX8ReCYw;
                this.SH1y5HwkJhh = 1;
                gvVar.getClass();
                java.lang.Object IHQe1A4L2xu = defpackage.gv.IHQe1A4L2xu(gvVar, this);
                return IHQe1A4L2xu == vjVar ? vjVar : IHQe1A4L2xu;
        }
    }

    public /* synthetic */ ml(int i, defpackage.ej ejVar) {
        super(i, ejVar);
    }
}
