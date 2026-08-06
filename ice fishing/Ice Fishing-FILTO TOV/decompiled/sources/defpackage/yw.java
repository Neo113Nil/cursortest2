package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class yw implements hv {
    public final /* synthetic */ hv EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ yw(hv hvVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = hvVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        hv hvVar = this.EljAMC1QTz;
        switch (i) {
            case 0:
                hvVar.mOu10nynGul(new ow(((Integer) obj).intValue()));
                return kc1.GWasM1elztuh;
            case 1:
                va1 va1Var = (va1) obj;
                if (!(va1Var instanceof fy)) {
                    o4.jivtDDk9H("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) hvVar.mOu10nynGul(((fy) va1Var).mE4lRynR);
                bool.getClass();
                return bool;
            case 2:
                y31 y31Var = (y31) hvVar.mOu10nynGul((c41) obj);
                synchronized (e41.X1lG3V04pd) {
                    e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(y31Var.AvO7iQsrTN());
                }
                return y31Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return hvVar.mOu10nynGul(l);
        }
    }
}
