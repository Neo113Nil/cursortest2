package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jq extends h50 implements hv {
    public final /* synthetic */ kq AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq(kq kqVar, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = kqVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        cq cqVar = cq.AvO7iQsrTN;
        cq cqVar2 = cq.EljAMC1QTz;
        cq cqVar3 = cq.OOA6hdeuvCS;
        kq kqVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                ma1 ma1Var = (ma1) obj;
                boolean GWasM1elztuh = ma1Var.GWasM1elztuh(cqVar3, cqVar2);
                c51 c51Var = null;
                if (!GWasM1elztuh) {
                    if (ma1Var.GWasM1elztuh(cqVar2, cqVar)) {
                        ra1 ra1Var = kqVar.jivtDDk9H.GWasM1elztuh;
                    } else {
                        c51Var = hq.xqGvceK5x;
                    }
                }
                return c51Var == null ? hq.xqGvceK5x : c51Var;
            default:
                ma1 ma1Var2 = (ma1) obj;
                if (ma1Var2.GWasM1elztuh(cqVar3, cqVar2)) {
                    return hq.X1lG3V04pd;
                }
                if (!ma1Var2.GWasM1elztuh(cqVar2, cqVar)) {
                    return hq.X1lG3V04pd;
                }
                ra1 ra1Var2 = kqVar.jivtDDk9H.GWasM1elztuh;
                return hq.X1lG3V04pd;
        }
    }
}
