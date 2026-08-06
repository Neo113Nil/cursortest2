package defpackage;

/* loaded from: classes.dex */
public final class pq implements defpackage.iw {
    public final /* synthetic */ defpackage.rz0 AARZUJiTa;
    public final /* synthetic */ int adDC3e2L = 1;
    public final /* synthetic */ defpackage.iw xiZrDbcSW0;

    public pq(defpackage.qq qqVar, defpackage.rz0 rz0Var, defpackage.iw iwVar) {
        this.AARZUJiTa = rz0Var;
        this.xiZrDbcSW0 = iwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EXtogiMhuM(java.lang.Object obj, defpackage.ej ejVar) {
        defpackage.oq oqVar;
        int i;
        defpackage.ww wwVar;
        int i2;
        int i3 = this.adDC3e2L;
        java.lang.Object obj2 = defpackage.ok1.IHQe1A4L2xu;
        defpackage.iw iwVar = this.xiZrDbcSW0;
        java.lang.Object obj3 = defpackage.vj.adDC3e2L;
        switch (i3) {
            case 0:
                if (ejVar instanceof defpackage.oq) {
                    oqVar = (defpackage.oq) ejVar;
                    int i4 = oqVar.SH1y5HwkJhh;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        oqVar.SH1y5HwkJhh = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj4 = oqVar.EXtogiMhuM;
                        i = oqVar.SH1y5HwkJhh;
                        if (i == 0) {
                            if (i == 1) {
                                defpackage.f70.nBH8hAHy(obj4);
                                return obj2;
                            }
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.f70.nBH8hAHy(obj4);
                        defpackage.rz0 rz0Var = this.AARZUJiTa;
                        java.lang.Object obj5 = rz0Var.adDC3e2L;
                        if (obj5 != defpackage.x70.F7NU4MC0GW && defpackage.x70.QoRHpC4k(obj5, obj)) {
                            return obj2;
                        }
                        rz0Var.adDC3e2L = obj;
                        oqVar.SH1y5HwkJhh = 1;
                        return iwVar.EXtogiMhuM(obj, oqVar) == obj3 ? obj3 : obj2;
                    }
                }
                oqVar = new defpackage.oq(this, ejVar);
                java.lang.Object obj42 = oqVar.EXtogiMhuM;
                i = oqVar.SH1y5HwkJhh;
                if (i == 0) {
                }
                break;
            default:
                try {
                    if (ejVar instanceof defpackage.ww) {
                        wwVar = (defpackage.ww) ejVar;
                        int i5 = wwVar.ez2rX8ReCYw;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            wwVar.ez2rX8ReCYw = i5 - Integer.MIN_VALUE;
                            java.lang.Object obj6 = wwVar.riuEU0zW4;
                            i2 = wwVar.ez2rX8ReCYw;
                            if (i2 != 0) {
                                defpackage.f70.nBH8hAHy(obj6);
                                wwVar.EXtogiMhuM = this;
                                wwVar.ez2rX8ReCYw = 1;
                                java.lang.Object EXtogiMhuM = iwVar.EXtogiMhuM(obj, wwVar);
                                this = EXtogiMhuM;
                                if (EXtogiMhuM == obj3) {
                                    obj2 = obj3;
                                    this = EXtogiMhuM;
                                }
                            } else {
                                if (i2 != 1) {
                                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                defpackage.pq pqVar = wwVar.EXtogiMhuM;
                                defpackage.f70.nBH8hAHy(obj6);
                                this = pqVar;
                            }
                            return obj2;
                        }
                    }
                    if (i2 != 0) {
                    }
                    return obj2;
                } catch (java.lang.Throwable th) {
                    this.AARZUJiTa.adDC3e2L = th;
                    throw th;
                }
                wwVar = new defpackage.ww(this, ejVar);
                java.lang.Object obj62 = wwVar.riuEU0zW4;
                i2 = wwVar.ez2rX8ReCYw;
        }
    }

    public pq(defpackage.iw iwVar, defpackage.rz0 rz0Var) {
        this.xiZrDbcSW0 = iwVar;
        this.AARZUJiTa = rz0Var;
    }
}
