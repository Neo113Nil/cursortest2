package defpackage;

/* loaded from: classes.dex */
public final class sw implements defpackage.hw {
    public final /* synthetic */ defpackage.k00 AARZUJiTa;
    public final /* synthetic */ int adDC3e2L = 1;
    public final /* synthetic */ defpackage.hw xiZrDbcSW0;

    public sw(defpackage.hw hwVar, defpackage.k00 k00Var) {
        this.xiZrDbcSW0 = hwVar;
        this.AARZUJiTa = k00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    @Override // defpackage.hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        defpackage.rw rwVar;
        int i;
        defpackage.l31 l31Var;
        defpackage.sw swVar;
        defpackage.hw hwVar;
        int i2 = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.k00 k00Var = this.AARZUJiTa;
        switch (i2) {
            case 0:
                if (ejVar instanceof defpackage.rw) {
                    rwVar = (defpackage.rw) ejVar;
                    int i3 = rwVar.riuEU0zW4;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rwVar.riuEU0zW4 = i3 - Integer.MIN_VALUE;
                        java.lang.Object obj = rwVar.EXtogiMhuM;
                        i = rwVar.riuEU0zW4;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj);
                            defpackage.lj ljVar = rwVar.xiZrDbcSW0;
                            ljVar.getClass();
                            defpackage.l31 l31Var2 = new defpackage.l31(iwVar, ljVar);
                            try {
                                rwVar.ez2rX8ReCYw = this;
                                rwVar.JlrlGoKF = iwVar;
                                rwVar.DFo87pBq1E5 = l31Var2;
                                rwVar.riuEU0zW4 = 1;
                                if (k00Var.adDC3e2L(l31Var2, rwVar) != vjVar) {
                                    swVar = this;
                                    l31Var = l31Var2;
                                }
                                return vjVar;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                l31Var = l31Var2;
                                l31Var.cnag84Bm();
                                throw th;
                            }
                        }
                        if (i != 1) {
                            if (i == 2) {
                                defpackage.f70.nBH8hAHy(obj);
                                return ok1Var;
                            }
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l31Var = rwVar.DFo87pBq1E5;
                        iwVar = rwVar.JlrlGoKF;
                        swVar = rwVar.ez2rX8ReCYw;
                        try {
                            defpackage.f70.nBH8hAHy(obj);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            l31Var.cnag84Bm();
                            throw th;
                        }
                        l31Var.cnag84Bm();
                        hwVar = swVar.xiZrDbcSW0;
                        rwVar.ez2rX8ReCYw = null;
                        rwVar.JlrlGoKF = null;
                        rwVar.DFo87pBq1E5 = null;
                        rwVar.riuEU0zW4 = 2;
                        if (hwVar.IHQe1A4L2xu(iwVar, rwVar) != vjVar) {
                            return ok1Var;
                        }
                        return vjVar;
                    }
                }
                rwVar = new defpackage.rw(this, ejVar);
                java.lang.Object obj2 = rwVar.EXtogiMhuM;
                i = rwVar.riuEU0zW4;
                if (i != 0) {
                }
                l31Var.cnag84Bm();
                hwVar = swVar.xiZrDbcSW0;
                rwVar.ez2rX8ReCYw = null;
                rwVar.JlrlGoKF = null;
                rwVar.DFo87pBq1E5 = null;
                rwVar.riuEU0zW4 = 2;
                if (hwVar.IHQe1A4L2xu(iwVar, rwVar) != vjVar) {
                }
                return vjVar;
            default:
                java.lang.Object IHQe1A4L2xu = this.xiZrDbcSW0.IHQe1A4L2xu(new defpackage.t4(new defpackage.nz0(), iwVar, k00Var, 1), ejVar);
                return IHQe1A4L2xu == vjVar ? IHQe1A4L2xu : ok1Var;
        }
    }

    public sw(defpackage.k00 k00Var, defpackage.hw hwVar) {
        this.AARZUJiTa = k00Var;
        this.xiZrDbcSW0 = hwVar;
    }
}
