package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fq extends h50 implements hv {
    public final /* synthetic */ lq AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ xq encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq(lq lqVar, xq xqVar, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = lqVar;
        this.encWxUiV2 = xqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9.GWasM1elztuh.GWasM1elztuh != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.GWasM1elztuh.GWasM1elztuh != null) goto L26;
     */
    @Override // defpackage.hv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        lq lqVar = this.AvO7iQsrTN;
        cq cqVar = cq.AvO7iQsrTN;
        cq cqVar2 = cq.EljAMC1QTz;
        cq cqVar3 = cq.OOA6hdeuvCS;
        float f = 1.0f;
        xq xqVar = this.encWxUiV2;
        switch (i) {
            case 0:
                ma1 ma1Var = (ma1) obj;
                if (ma1Var.GWasM1elztuh(cqVar3, cqVar2)) {
                    dr drVar = lqVar.GWasM1elztuh.GWasM1elztuh;
                    return drVar != null ? drVar.GWasM1elztuh : hq.Yi7zF1RB1;
                }
                if (!ma1Var.GWasM1elztuh(cqVar2, cqVar)) {
                    return hq.Yi7zF1RB1;
                }
                dr drVar2 = xqVar.GWasM1elztuh.GWasM1elztuh;
                return drVar2 != null ? drVar2.GWasM1elztuh : hq.Yi7zF1RB1;
            case 1:
                int ordinal = ((cq) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            o4.xqGvceK5x();
                            return null;
                        }
                        break;
                    }
                    return Float.valueOf(f);
                }
            case 2:
                ma1 ma1Var2 = (ma1) obj;
                if (ma1Var2.GWasM1elztuh(cqVar3, cqVar2)) {
                    return hq.Yi7zF1RB1;
                }
                if (!ma1Var2.GWasM1elztuh(cqVar2, cqVar)) {
                    return hq.Yi7zF1RB1;
                }
                ra1 ra1Var = xqVar.GWasM1elztuh;
                return hq.Yi7zF1RB1;
            default:
                int ordinal2 = ((cq) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    ra1 ra1Var2 = xqVar.GWasM1elztuh;
                }
                return Float.valueOf(1.0f);
        }
    }
}
