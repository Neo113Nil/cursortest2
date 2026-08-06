package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e3 implements ms {
    public final Object AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final Object encWxUiV2;

    public e3(ms msVar, gh ghVar) {
        this.OOA6hdeuvCS = 2;
        this.EljAMC1QTz = ghVar;
        this.AvO7iQsrTN = p.WRKkgoJXwDn(ghVar);
        this.encWxUiV2 = new xqGvceK5x(msVar, null, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    @Override // defpackage.ms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E7jCp8Ls(Object obj, vg vgVar) {
        us usVar;
        int i;
        int i2 = this.OOA6hdeuvCS;
        qh qhVar = qh.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.encWxUiV2;
        Object obj3 = this.AvO7iQsrTN;
        Object obj4 = this.EljAMC1QTz;
        switch (i2) {
            case 0:
                qa1 qa1Var = (qa1) obj3;
                ((cs0) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((lv) ((mg0) obj2).getValue()).EljAMC1QTz(qa1Var.GWasM1elztuh.EljAMC1QTz(), qa1Var.xqGvceK5x.getValue())).booleanValue() : false));
                return kc1Var;
            case 1:
                if (vgVar instanceof us) {
                    usVar = (us) vgVar;
                    int i3 = usVar.E7jCp8Ls;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        usVar.E7jCp8Ls = i3 - Integer.MIN_VALUE;
                        Object obj5 = usVar.JFJ3QoxA;
                        i = usVar.E7jCp8Ls;
                        if (i != 0) {
                            o50.A1EKNP6CxJ(obj5);
                            if (((nt0) obj4).OOA6hdeuvCS) {
                                usVar.E7jCp8Ls = 1;
                                if (((ms) obj3).E7jCp8Ls(obj, usVar) == qhVar) {
                                    return qhVar;
                                }
                                return kc1Var;
                            }
                            usVar.encWxUiV2 = this;
                            usVar.mOu10nynGul = obj;
                            usVar.E7jCp8Ls = 2;
                            obj5 = ((lv) obj2).EljAMC1QTz(obj, usVar);
                            if (obj5 == qhVar) {
                                return qhVar;
                            }
                            if (!((Boolean) obj5).booleanValue()) {
                            }
                            return kc1Var;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                obj = usVar.mOu10nynGul;
                                this = usVar.encWxUiV2;
                                o50.A1EKNP6CxJ(obj5);
                                if (!((Boolean) obj5).booleanValue()) {
                                    ((nt0) this.EljAMC1QTz).OOA6hdeuvCS = true;
                                    ms msVar = (ms) this.AvO7iQsrTN;
                                    usVar.encWxUiV2 = null;
                                    usVar.mOu10nynGul = null;
                                    usVar.E7jCp8Ls = 3;
                                    if (msVar.E7jCp8Ls(obj, usVar) == qhVar) {
                                        return qhVar;
                                    }
                                }
                                return kc1Var;
                            }
                            if (i != 3) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        o50.A1EKNP6CxJ(obj5);
                        return kc1Var;
                    }
                }
                usVar = new us(this, vgVar);
                Object obj52 = usVar.JFJ3QoxA;
                i = usVar.E7jCp8Ls;
                if (i != 0) {
                }
            default:
                Object rezfBrjOrqK = rj0.rezfBrjOrqK((gh) obj4, obj, obj3, (xqGvceK5x) obj2, vgVar);
                return rezfBrjOrqK == qhVar ? rezfBrjOrqK : kc1Var;
        }
    }

    public /* synthetic */ e3(Object obj, Object obj2, Object obj3, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
        this.encWxUiV2 = obj3;
    }
}
