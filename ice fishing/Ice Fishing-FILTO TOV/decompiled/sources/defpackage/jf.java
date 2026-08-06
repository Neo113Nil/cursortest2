package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jf extends h50 implements lv {
    public final /* synthetic */ lv AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz = 1;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(gn0 gn0Var, k61 k61Var, lv lvVar, int i) {
        super(2);
        this.encWxUiV2 = gn0Var;
        this.mOu10nynGul = k61Var;
        this.AvO7iQsrTN = lvVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        lv lvVar = this.AvO7iQsrTN;
        Object obj3 = this.mOu10nynGul;
        Object obj4 = this.encWxUiV2;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                kf.GWasM1elztuh((gn0) obj4, (k61) obj3, lvVar, (qx) obj, n4.lv06NcmrQ(1));
                break;
            default:
                qx qxVar = (qx) obj;
                int intValue = ((Number) obj2).intValue();
                fi1 fi1Var = (fi1) obj4;
                int i3 = 0;
                if (!qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                    qxVar.YXi2hvwn7WL();
                    break;
                } else {
                    c cVar = fi1Var.OOA6hdeuvCS;
                    boolean encWxUiV2 = qxVar.encWxUiV2(fi1Var);
                    Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                    vg vgVar = null;
                    k61 k61Var = ue.GWasM1elztuh;
                    if (encWxUiV2 || HFYAaqMd6 == k61Var) {
                        HFYAaqMd6 = new ei1(fi1Var, vgVar, i3);
                        qxVar.dcDmLGVhzWm(HFYAaqMd6);
                    }
                    ki1.encWxUiV2((lv) HFYAaqMd6, qxVar, cVar);
                    boolean encWxUiV22 = qxVar.encWxUiV2(fi1Var);
                    Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                    if (encWxUiV22 || HFYAaqMd62 == k61Var) {
                        HFYAaqMd62 = new ei1(fi1Var, vgVar, i2);
                        qxVar.dcDmLGVhzWm(HFYAaqMd62);
                    }
                    ki1.encWxUiV2((lv) HFYAaqMd62, qxVar, cVar);
                    ((se) obj3).GWasM1elztuh(cVar, lvVar, qxVar, 0);
                    break;
                }
        }
        return kc1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(fi1 fi1Var, se seVar, lv lvVar) {
        super(2);
        this.encWxUiV2 = fi1Var;
        this.mOu10nynGul = seVar;
        this.AvO7iQsrTN = lvVar;
    }
}
