package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mnHdw6496Bs extends h50 implements hv {
    public final /* synthetic */ rt0 AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnHdw6496Bs(int i, rt0 rt0Var) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = rt0Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        boolean z;
        int i = this.EljAMC1QTz;
        rt0 rt0Var = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                rt0Var.OOA6hdeuvCS = (rt) obj;
                return Boolean.TRUE;
            default:
                xk xkVar = (va1) obj;
                if (((he0) xkVar).OOA6hdeuvCS.Mjvvu5DE) {
                    rt0Var.OOA6hdeuvCS = xkVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
