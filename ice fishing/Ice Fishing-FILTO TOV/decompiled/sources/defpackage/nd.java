package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nd implements mv {
    public final /* synthetic */ int OOA6hdeuvCS;
    public static final nd EljAMC1QTz = new nd(0);
    public static final nd AvO7iQsrTN = new nd(1);

    public /* synthetic */ nd(int i) {
        this.OOA6hdeuvCS = i;
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                break;
            default:
                m31 m31Var = (m31) obj;
                qx qxVar = (qx) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= qxVar.EljAMC1QTz(m31Var) ? 4 : 2;
                }
                if (!qxVar.dqB83aoLBB(intValue & 1, (intValue & 19) != 18)) {
                    qxVar.YXi2hvwn7WL();
                    break;
                } else {
                    b70.EljAMC1QTz(m31Var, null, null, 0L, 0L, 0L, 0L, 0L, qxVar, intValue & 14);
                    break;
                }
        }
        return kc1Var;
    }
}
