package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ss implements ls {
    public final /* synthetic */ mv EljAMC1QTz;
    public final /* synthetic */ ls OOA6hdeuvCS;

    public ss(ls lsVar, mv mvVar) {
        this.OOA6hdeuvCS = lsVar;
        this.EljAMC1QTz = mvVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.GWasM1elztuh(r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r10 = new defpackage.k91(r9);
        r9 = r9.EljAMC1QTz;
        r0.rQPn8YBR = r9;
        r0.E7jCp8Ls = null;
        r0.mOu10nynGul = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (defpackage.ki1.YmKjaVtbfp5Z(r10, r9, r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(ms msVar, vg vgVar) {
        rs rsVar;
        int i;
        qh qhVar;
        cw0 cw0Var;
        cw0 cw0Var2;
        mv mvVar;
        try {
            if (vgVar instanceof rs) {
                rsVar = (rs) vgVar;
                int i2 = rsVar.mOu10nynGul;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rsVar.mOu10nynGul = i2 - Integer.MIN_VALUE;
                    Object obj = rsVar.encWxUiV2;
                    i = rsVar.mOu10nynGul;
                    qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        ls lsVar = this.OOA6hdeuvCS;
                        rsVar.rQPn8YBR = this;
                        rsVar.E7jCp8Ls = msVar;
                        rsVar.mOu10nynGul = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) rsVar.rQPn8YBR;
                                o50.A1EKNP6CxJ(obj);
                                throw th;
                            }
                            if (i != 3) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cw0Var2 = (cw0) rsVar.rQPn8YBR;
                            try {
                                o50.A1EKNP6CxJ(obj);
                                cw0Var2.YmKjaVtbfp5Z();
                                return kc1.GWasM1elztuh;
                            } catch (Throwable th2) {
                                th = th2;
                                cw0Var2.YmKjaVtbfp5Z();
                                throw th;
                            }
                        }
                        msVar = rsVar.E7jCp8Ls;
                        this = (ss) rsVar.rQPn8YBR;
                        o50.A1EKNP6CxJ(obj);
                    }
                    gh ghVar = rsVar.EljAMC1QTz;
                    ghVar.getClass();
                    cw0Var = new cw0(msVar, ghVar);
                    mvVar = this.EljAMC1QTz;
                    rsVar.rQPn8YBR = cw0Var;
                    rsVar.E7jCp8Ls = null;
                    rsVar.mOu10nynGul = 3;
                    if (mvVar.X1lG3V04pd(cw0Var, null, rsVar) != qhVar) {
                        cw0Var2 = cw0Var;
                        cw0Var2.YmKjaVtbfp5Z();
                        return kc1.GWasM1elztuh;
                    }
                    return qhVar;
                }
            }
            mvVar = this.EljAMC1QTz;
            rsVar.rQPn8YBR = cw0Var;
            rsVar.E7jCp8Ls = null;
            rsVar.mOu10nynGul = 3;
            if (mvVar.X1lG3V04pd(cw0Var, null, rsVar) != qhVar) {
            }
            return qhVar;
        } catch (Throwable th3) {
            th = th3;
            cw0Var2 = cw0Var;
            cw0Var2.YmKjaVtbfp5Z();
            throw th;
        }
        rsVar = new rs(this, vgVar);
        Object obj2 = rsVar.encWxUiV2;
        i = rsVar.mOu10nynGul;
        qhVar = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        gh ghVar2 = rsVar.EljAMC1QTz;
        ghVar2.getClass();
        cw0Var = new cw0(msVar, ghVar2);
    }
}
