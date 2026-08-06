package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class si implements ls {
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ si(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // defpackage.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(ms msVar, vg vgVar) {
        mE4lRynR me4lrynr;
        int i;
        cw0 cw0Var;
        Throwable th;
        int i2 = this.OOA6hdeuvCS;
        int i3 = 1;
        Object obj = this.EljAMC1QTz;
        qh qhVar = qh.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i2) {
            case 0:
                Object GWasM1elztuh = ((jj) obj).GWasM1elztuh(new ri(msVar, 0), vgVar);
                return GWasM1elztuh == qhVar ? GWasM1elztuh : kc1Var;
            case 1:
                Object GWasM1elztuh2 = ((ls) obj).GWasM1elztuh(new ri(msVar, i3), vgVar);
                return GWasM1elztuh2 == qhVar ? GWasM1elztuh2 : kc1Var;
            default:
                if (vgVar instanceof mE4lRynR) {
                    me4lrynr = (mE4lRynR) vgVar;
                    int i4 = me4lrynr.rQPn8YBR;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        me4lrynr.rQPn8YBR = i4 - Integer.MIN_VALUE;
                        Object obj2 = me4lrynr.mOu10nynGul;
                        i = me4lrynr.rQPn8YBR;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj2);
                            gh ghVar = me4lrynr.EljAMC1QTz;
                            ghVar.getClass();
                            cw0 cw0Var2 = new cw0(msVar, ghVar);
                            try {
                                me4lrynr.encWxUiV2 = cw0Var2;
                                me4lrynr.rQPn8YBR = 1;
                                Object EljAMC1QTz = ((lv) obj).EljAMC1QTz(cw0Var2, me4lrynr);
                                if (EljAMC1QTz != qhVar) {
                                    EljAMC1QTz = kc1Var;
                                }
                                if (EljAMC1QTz == qhVar) {
                                    return qhVar;
                                }
                                cw0Var = cw0Var2;
                            } catch (Throwable th2) {
                                cw0Var = cw0Var2;
                                th = th2;
                                cw0Var.YmKjaVtbfp5Z();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cw0Var = me4lrynr.encWxUiV2;
                            try {
                                o50.A1EKNP6CxJ(obj2);
                            } catch (Throwable th3) {
                                th = th3;
                                cw0Var.YmKjaVtbfp5Z();
                                throw th;
                            }
                        }
                        cw0Var.YmKjaVtbfp5Z();
                        return kc1Var;
                    }
                }
                me4lrynr = new mE4lRynR(this, vgVar);
                Object obj22 = me4lrynr.mOu10nynGul;
                i = me4lrynr.rQPn8YBR;
                if (i != 0) {
                }
                cw0Var.YmKjaVtbfp5Z();
                return kc1Var;
        }
    }
}
