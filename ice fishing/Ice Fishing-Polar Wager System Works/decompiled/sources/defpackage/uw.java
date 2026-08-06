package defpackage;

/* loaded from: classes.dex */
public final class uw implements defpackage.hw {
    public final /* synthetic */ defpackage.ce1 AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ uw(java.lang.Object obj, defpackage.ce1 ce1Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = ce1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    @Override // defpackage.hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        defpackage.tw twVar;
        int i;
        java.lang.Throwable th;
        defpackage.yw ywVar;
        int i2;
        defpackage.ax axVar;
        defpackage.IHQe1A4L2xu e;
        int i3 = this.adDC3e2L;
        defpackage.ce1 ce1Var = this.AARZUJiTa;
        java.lang.Object obj = defpackage.vj.adDC3e2L;
        java.lang.Object obj2 = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i3) {
            case 0:
                if (ejVar instanceof defpackage.tw) {
                    twVar = (defpackage.tw) ejVar;
                    int i4 = twVar.riuEU0zW4;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        twVar.riuEU0zW4 = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = twVar.EXtogiMhuM;
                        i = twVar.riuEU0zW4;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj3);
                            twVar.ez2rX8ReCYw = this;
                            twVar.JlrlGoKF = iwVar;
                            twVar.riuEU0zW4 = 1;
                            obj3 = defpackage.gq1.ez2rX8ReCYw((defpackage.hw) obj2, iwVar, twVar);
                            if (obj3 == obj) {
                                return obj;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    defpackage.f70.nBH8hAHy(obj3);
                                    return ok1Var;
                                }
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            iwVar = twVar.JlrlGoKF;
                            this = twVar.ez2rX8ReCYw;
                            defpackage.f70.nBH8hAHy(obj3);
                        }
                        th = (java.lang.Throwable) obj3;
                        if (th != null) {
                            defpackage.r81 r81Var = (defpackage.r81) this.AARZUJiTa;
                            twVar.ez2rX8ReCYw = null;
                            twVar.JlrlGoKF = null;
                            twVar.riuEU0zW4 = 2;
                            if (r81Var.F7NU4MC0GW(iwVar, th, twVar) == obj) {
                                return obj;
                            }
                        }
                        return ok1Var;
                    }
                }
                twVar = new defpackage.tw(this, ejVar);
                java.lang.Object obj32 = twVar.EXtogiMhuM;
                i = twVar.riuEU0zW4;
                if (i != 0) {
                }
                th = (java.lang.Throwable) obj32;
                if (th != null) {
                }
                return ok1Var;
            case 1:
                if (ejVar instanceof defpackage.yw) {
                    ywVar = (defpackage.yw) ejVar;
                    int i5 = ywVar.riuEU0zW4;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ywVar.riuEU0zW4 = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj4 = ywVar.EXtogiMhuM;
                        i2 = ywVar.riuEU0zW4;
                        if (i2 != 0) {
                            defpackage.f70.nBH8hAHy(obj4);
                            defpackage.sw swVar = (defpackage.sw) obj2;
                            defpackage.ax axVar2 = new defpackage.ax(0, (defpackage.ll) ce1Var, iwVar);
                            try {
                                ywVar.ez2rX8ReCYw = axVar2;
                                ywVar.riuEU0zW4 = 1;
                                if (swVar.IHQe1A4L2xu(axVar2, ywVar) == obj) {
                                    return obj;
                                }
                            } catch (defpackage.IHQe1A4L2xu e2) {
                                axVar = axVar2;
                                e = e2;
                                if (e.adDC3e2L != axVar) {
                                }
                                return ok1Var;
                            }
                        } else {
                            if (i2 != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            axVar = ywVar.ez2rX8ReCYw;
                            try {
                                defpackage.f70.nBH8hAHy(obj4);
                            } catch (defpackage.IHQe1A4L2xu e3) {
                                e = e3;
                                if (e.adDC3e2L != axVar) {
                                    throw e;
                                }
                                return ok1Var;
                            }
                        }
                        return ok1Var;
                    }
                }
                ywVar = new defpackage.yw(this, ejVar);
                java.lang.Object obj42 = ywVar.EXtogiMhuM;
                i2 = ywVar.riuEU0zW4;
                if (i2 != 0) {
                }
                return ok1Var;
            default:
                defpackage.ue ueVar = new defpackage.ue((defpackage.hw[]) obj2, new defpackage.bx(null, (defpackage.h10) ce1Var), iwVar, null);
                defpackage.jw jwVar = new defpackage.jw(ejVar, ejVar.xiZrDbcSW0());
                java.lang.Object UsuH8pd5P = defpackage.e90.UsuH8pd5P(jwVar, jwVar, ueVar);
                if (UsuH8pd5P != obj) {
                    UsuH8pd5P = ok1Var;
                }
                return UsuH8pd5P == obj ? UsuH8pd5P : ok1Var;
        }
    }
}
