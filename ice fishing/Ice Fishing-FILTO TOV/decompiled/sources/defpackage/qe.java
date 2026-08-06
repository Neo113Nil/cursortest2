package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qe extends h50 implements lv {
    public final /* synthetic */ se AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz = 0;
    public final /* synthetic */ c encWxUiV2;
    public final /* synthetic */ lv mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(c cVar, se seVar, lv lvVar) {
        super(2);
        this.encWxUiV2 = cVar;
        this.AvO7iQsrTN = seVar;
        this.mOu10nynGul = lvVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.EljAMC1QTz;
        kc1 kc1Var = kc1.GWasM1elztuh;
        lv lvVar = this.mOu10nynGul;
        c cVar = this.encWxUiV2;
        se seVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                qx qxVar = (qx) obj;
                int intValue = ((Number) obj2).intValue();
                if (!qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                    qxVar.YXi2hvwn7WL();
                    break;
                } else {
                    qxVar.MjxSquD6Av(866651995);
                    kf.GWasM1elztuh(cVar, seVar.rQPn8YBR, lvVar, qxVar, 0);
                    qxVar.WIEu4Ya2g8(false);
                    break;
                }
            default:
                ((Number) obj2).intValue();
                seVar.GWasM1elztuh(cVar, lvVar, (qx) obj, n4.lv06NcmrQ(1));
                break;
        }
        return kc1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(se seVar, c cVar, lv lvVar, int i) {
        super(2);
        this.AvO7iQsrTN = seVar;
        this.encWxUiV2 = cVar;
        this.mOu10nynGul = lvVar;
    }
}
