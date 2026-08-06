package defpackage;

/* loaded from: classes.dex */
public final class kl extends defpackage.ce1 implements defpackage.k00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.bm ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl(defpackage.bm bmVar, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = bmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r7.riuEU0zW4(r9) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r6) goto L41;
     */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.bm bmVar = this.ez2rX8ReCYw;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    this.SH1y5HwkJhh = 1;
                    return defpackage.bm.adDC3e2L(bmVar, this) == vjVar ? vjVar : ok1Var;
                }
                if (i3 == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return ok1Var;
                }
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.y yVar = bmVar.riuEU0zW4;
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object dOmtpLcqqI1y = ((defpackage.ye) yVar.xiZrDbcSW0).dOmtpLcqqI1y(this);
                    if (dOmtpLcqqI1y != vjVar) {
                        dOmtpLcqqI1y = ok1Var;
                        break;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            defpackage.f70.nBH8hAHy(obj);
                            return ok1Var;
                        }
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                defpackage.hw riuEU0zW4 = defpackage.gq1.riuEU0zW4(bmVar.EXtogiMhuM().r1MBDhnF, -1);
                defpackage.M9IxZHm3 m9IxZHm3 = new defpackage.M9IxZHm3(i2, bmVar);
                this.SH1y5HwkJhh = 2;
                if (riuEU0zW4.IHQe1A4L2xu(m9IxZHm3, this) != vjVar) {
                    return ok1Var;
                }
                return vjVar;
            default:
                defpackage.cm cmVar = bmVar.EXtogiMhuM;
                int i5 = this.SH1y5HwkJhh;
                try {
                    if (i5 == 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        if (!(cmVar.oh6vYeIP() instanceof defpackage.sv)) {
                            this.SH1y5HwkJhh = 1;
                            break;
                        } else {
                            return cmVar.oh6vYeIP();
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                defpackage.f70.nBH8hAHy(obj);
                                return (defpackage.dc1) obj;
                            }
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    this.SH1y5HwkJhh = 2;
                    obj = defpackage.bm.xiZrDbcSW0(bmVar, false, this);
                    break;
                } catch (java.lang.Throwable th) {
                    return new defpackage.uy0(th, -1);
                }
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return ((defpackage.kl) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.iw) obj)).SyNS6RMn(ok1Var);
            case 1:
                return ((defpackage.kl) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.kl) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.bm bmVar = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.kl(bmVar, ejVar, 0);
            case 1:
                return new defpackage.kl(bmVar, ejVar, 1);
            default:
                return new defpackage.kl(bmVar, ejVar, 2);
        }
    }
}
