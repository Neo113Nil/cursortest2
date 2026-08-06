package defpackage;

/* loaded from: classes.dex */
public final class qw implements defpackage.hw {
    public final /* synthetic */ defpackage.hw adDC3e2L;
    public final /* synthetic */ defpackage.l00 xiZrDbcSW0;

    public qw(defpackage.hw hwVar, defpackage.l00 l00Var) {
        this.adDC3e2L = hwVar;
        this.xiZrDbcSW0 = l00Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.IHQe1A4L2xu(r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r10 = new defpackage.tg1(r9);
        r9 = r9.xiZrDbcSW0;
        r0.ez2rX8ReCYw = r9;
        r0.JlrlGoKF = null;
        r0.riuEU0zW4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (defpackage.fm.cnag84Bm(r10, r9, r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        defpackage.pw pwVar;
        int i;
        defpackage.vj vjVar;
        defpackage.l31 l31Var;
        defpackage.l31 l31Var2;
        defpackage.l00 l00Var;
        try {
            if (ejVar instanceof defpackage.pw) {
                pwVar = (defpackage.pw) ejVar;
                int i2 = pwVar.riuEU0zW4;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pwVar.riuEU0zW4 = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = pwVar.EXtogiMhuM;
                    i = pwVar.riuEU0zW4;
                    vjVar = defpackage.vj.adDC3e2L;
                    if (i != 0) {
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.hw hwVar = this.adDC3e2L;
                        pwVar.ez2rX8ReCYw = this;
                        pwVar.JlrlGoKF = iwVar;
                        pwVar.riuEU0zW4 = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                java.lang.Throwable th = (java.lang.Throwable) pwVar.ez2rX8ReCYw;
                                defpackage.f70.nBH8hAHy(obj);
                                throw th;
                            }
                            if (i != 3) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l31Var2 = (defpackage.l31) pwVar.ez2rX8ReCYw;
                            try {
                                defpackage.f70.nBH8hAHy(obj);
                                l31Var2.cnag84Bm();
                                return defpackage.ok1.IHQe1A4L2xu;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                l31Var2.cnag84Bm();
                                throw th;
                            }
                        }
                        iwVar = pwVar.JlrlGoKF;
                        this = (defpackage.qw) pwVar.ez2rX8ReCYw;
                        defpackage.f70.nBH8hAHy(obj);
                    }
                    defpackage.lj ljVar = pwVar.xiZrDbcSW0;
                    ljVar.getClass();
                    l31Var = new defpackage.l31(iwVar, ljVar);
                    l00Var = this.xiZrDbcSW0;
                    pwVar.ez2rX8ReCYw = l31Var;
                    pwVar.JlrlGoKF = null;
                    pwVar.riuEU0zW4 = 3;
                    if (l00Var.F7NU4MC0GW(l31Var, null, pwVar) != vjVar) {
                        l31Var2 = l31Var;
                        l31Var2.cnag84Bm();
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                    return vjVar;
                }
            }
            l00Var = this.xiZrDbcSW0;
            pwVar.ez2rX8ReCYw = l31Var;
            pwVar.JlrlGoKF = null;
            pwVar.riuEU0zW4 = 3;
            if (l00Var.F7NU4MC0GW(l31Var, null, pwVar) != vjVar) {
            }
            return vjVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
            l31Var2 = l31Var;
            l31Var2.cnag84Bm();
            throw th;
        }
        pwVar = new defpackage.pw(this, ejVar);
        java.lang.Object obj2 = pwVar.EXtogiMhuM;
        i = pwVar.riuEU0zW4;
        vjVar = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        defpackage.lj ljVar2 = pwVar.xiZrDbcSW0;
        ljVar2.getClass();
        l31Var = new defpackage.l31(iwVar, ljVar2);
    }
}
