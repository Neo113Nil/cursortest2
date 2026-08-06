package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kl0 extends h50 implements hv {
    public final /* synthetic */ rt AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ n2 JFJ3QoxA;
    public final /* synthetic */ rt encWxUiV2;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl0(rt rtVar, rt rtVar2, Object obj, int i, n2 n2Var, int i2) {
        super(1);
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = rtVar;
        this.encWxUiV2 = rtVar2;
        this.rQPn8YBR = obj;
        this.mOu10nynGul = i;
        this.JFJ3QoxA = n2Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        n2 n2Var = this.JFJ3QoxA;
        int i2 = this.mOu10nynGul;
        Object obj2 = this.rQPn8YBR;
        rt rtVar = this.encWxUiV2;
        rt rtVar2 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                o6 o6Var = (o6) obj;
                if (rtVar2 != ((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz()) {
                    return Boolean.TRUE;
                }
                boolean eUH21U3apd = b70.eUH21U3apd(rtVar, (rt) obj2, i2, n2Var);
                Boolean valueOf = Boolean.valueOf(eUH21U3apd);
                if (eUH21U3apd || !o6Var.GWasM1elztuh()) {
                    return valueOf;
                }
                return null;
            default:
                o6 o6Var2 = (o6) obj;
                if (rtVar2 != ((nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner()).EljAMC1QTz()) {
                    return Boolean.TRUE;
                }
                boolean MZhzXH72 = d70.MZhzXH72(i2, n2Var, rtVar, (kt0) obj2);
                Boolean valueOf2 = Boolean.valueOf(MZhzXH72);
                if (MZhzXH72 || !o6Var2.GWasM1elztuh()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
