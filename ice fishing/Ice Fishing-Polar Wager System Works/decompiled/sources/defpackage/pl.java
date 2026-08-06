package defpackage;

/* loaded from: classes.dex */
public final class pl implements defpackage.hw {
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public /* synthetic */ pl(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // defpackage.hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        defpackage.fnWB2E7cs fnwb2e7cs;
        int i;
        defpackage.l31 l31Var;
        java.lang.Throwable th;
        int i2 = this.adDC3e2L;
        int i3 = 1;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i2) {
            case 0:
                java.lang.Object IHQe1A4L2xu = ((defpackage.sw) obj).IHQe1A4L2xu(new defpackage.ol(iwVar, 0), ejVar);
                return IHQe1A4L2xu == vjVar ? IHQe1A4L2xu : ok1Var;
            case 1:
                java.lang.Object IHQe1A4L2xu2 = ((defpackage.pl) obj).IHQe1A4L2xu(new defpackage.ol(iwVar, i3), ejVar);
                return IHQe1A4L2xu2 == vjVar ? IHQe1A4L2xu2 : ok1Var;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                if (ejVar instanceof defpackage.fnWB2E7cs) {
                    fnwb2e7cs = (defpackage.fnWB2E7cs) ejVar;
                    int i4 = fnwb2e7cs.ez2rX8ReCYw;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fnwb2e7cs.ez2rX8ReCYw = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = fnwb2e7cs.riuEU0zW4;
                        i = fnwb2e7cs.ez2rX8ReCYw;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj2);
                            defpackage.lj ljVar = fnwb2e7cs.xiZrDbcSW0;
                            ljVar.getClass();
                            defpackage.l31 l31Var2 = new defpackage.l31(iwVar, ljVar);
                            try {
                                fnwb2e7cs.EXtogiMhuM = l31Var2;
                                fnwb2e7cs.ez2rX8ReCYw = 1;
                                java.lang.Object adDC3e2L = ((defpackage.k00) obj).adDC3e2L(l31Var2, fnwb2e7cs);
                                if (adDC3e2L != vjVar) {
                                    adDC3e2L = ok1Var;
                                }
                                if (adDC3e2L == vjVar) {
                                    return vjVar;
                                }
                                l31Var = l31Var2;
                            } catch (java.lang.Throwable th2) {
                                l31Var = l31Var2;
                                th = th2;
                                l31Var.cnag84Bm();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l31Var = fnwb2e7cs.EXtogiMhuM;
                            try {
                                defpackage.f70.nBH8hAHy(obj2);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                l31Var.cnag84Bm();
                                throw th;
                            }
                        }
                        l31Var.cnag84Bm();
                        return ok1Var;
                    }
                }
                fnwb2e7cs = new defpackage.fnWB2E7cs(this, ejVar);
                java.lang.Object obj22 = fnwb2e7cs.riuEU0zW4;
                i = fnwb2e7cs.ez2rX8ReCYw;
                if (i != 0) {
                }
                l31Var.cnag84Bm();
                return ok1Var;
            default:
                java.lang.Object IHQe1A4L2xu3 = ((defpackage.uw) obj).IHQe1A4L2xu(new defpackage.ol(iwVar, 3), ejVar);
                return IHQe1A4L2xu3 == vjVar ? IHQe1A4L2xu3 : ok1Var;
        }
    }
}
