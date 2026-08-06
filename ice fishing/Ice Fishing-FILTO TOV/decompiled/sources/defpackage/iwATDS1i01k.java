package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class iwATDS1i01k extends h50 implements lv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwATDS1i01k(int i, Object obj) {
        super(2);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.EljAMC1QTz;
        fe0 fe0Var = fe0.GWasM1elztuh;
        boolean z = false;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj3 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                qx qxVar = (qx) obj;
                int intValue = ((Number) obj2).intValue();
                if (qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                    ((WIEu4Ya2g8) obj3).Yi7zF1RB1(0, qxVar);
                } else {
                    qxVar.YXi2hvwn7WL();
                }
                return kc1Var;
            case 1:
                qx qxVar2 = (qx) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (qxVar2.dqB83aoLBB(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object HFYAaqMd6 = qxVar2.HFYAaqMd6();
                    if (HFYAaqMd6 == ue.GWasM1elztuh) {
                        HFYAaqMd6 = XdwzlWIkSDqF.rQPn8YBR;
                        qxVar2.dcDmLGVhzWm(HFYAaqMd6);
                    }
                    rj0.JFJ3QoxA(a01.GWasM1elztuh(fe0Var, (hv) HFYAaqMd6), (lv) ((mg0) obj3).getValue(), qxVar2, 0);
                } else {
                    qxVar2.YXi2hvwn7WL();
                }
                return kc1Var;
            case 2:
                cq cqVar = (cq) obj;
                cq cqVar2 = (cq) obj2;
                cq cqVar3 = cq.AvO7iQsrTN;
                if (cqVar == cqVar3 && cqVar2 == cqVar3 && !((xq) obj3).GWasM1elztuh.Yi7zF1RB1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((Number) obj2).intValue();
                ((pe) obj3).Yi7zF1RB1(n4.lv06NcmrQ(1), (qx) obj);
                return kc1Var;
            case 4:
                ie0 ie0Var = (ie0) obj;
                ie0 ie0Var2 = (ge0) obj2;
                qx qxVar3 = (qx) obj3;
                if (ie0Var2 instanceof te) {
                    mv mvVar = ((te) ie0Var2).GWasM1elztuh;
                    fb1.XnEVoBF0td1l(3, mvVar);
                    ie0Var2 = n30.A1EKNP6CxJ(qxVar3, (ie0) mvVar.X1lG3V04pd(fe0Var, qxVar3, 0));
                }
                return ie0Var.X1lG3V04pd(ie0Var2);
            default:
                ((Number) obj2).intValue();
                ((yl) obj3).Yi7zF1RB1(n4.lv06NcmrQ(1), (qx) obj);
                return kc1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwATDS1i01k(WIEu4Ya2g8 wIEu4Ya2g8, int i, int i2) {
        super(2);
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = wIEu4Ya2g8;
    }
}
