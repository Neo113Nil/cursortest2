package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n2 extends h50 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
        this.mOu10nynGul = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.EljAMC1QTz;
        boolean z = false;
        Object[] objArr = 0;
        ga1 ga1Var = null;
        Object obj2 = this.encWxUiV2;
        Object obj3 = this.mOu10nynGul;
        Object obj4 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return new m2((p41) obj4, obj2, (a3) obj3, objArr == true ? 1 : 0);
            case 1:
                va1 va1Var = (va1) obj;
                gn gnVar = (gn) va1Var;
                if (!((i0) ((c) vc0.A1EKNP6CxJ((gn) obj2)).getDragAndDropManager()).Yi7zF1RB1.contains(gnVar) || !vc0.rQPn8YBR(gnVar, rj0.WRKkgoJXwDn((j6IIN2O8eOU) obj3))) {
                    return ua1.OOA6hdeuvCS;
                }
                ((rt0) obj4).OOA6hdeuvCS = va1Var;
                return ua1.AvO7iQsrTN;
            case 2:
                yu0 yu0Var = (yu0) obj;
                m51 m51Var = (m51) obj2;
                m51 m51Var2 = (m51) obj4;
                yu0Var.X1lG3V04pd(m51Var2 != null ? ((Number) m51Var2.getValue()).floatValue() : 1.0f);
                yu0Var.OOA6hdeuvCS(m51Var != null ? ((Number) m51Var.getValue()).floatValue() : 1.0f);
                yu0Var.EljAMC1QTz(m51Var != null ? ((Number) m51Var.getValue()).floatValue() : 1.0f);
                m51 m51Var3 = (m51) obj3;
                yu0Var.AvO7iQsrTN(m51Var3 != null ? ((ga1) m51Var3.getValue()).GWasM1elztuh : ga1.Yi7zF1RB1);
                return kc1.GWasM1elztuh;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                xq xqVar = (xq) obj3;
                int ordinal = ((cq) obj).ordinal();
                if (ordinal == 0) {
                    ra1 ra1Var = xqVar.GWasM1elztuh;
                } else if (ordinal == 1) {
                    ga1Var = (ga1) obj4;
                } else {
                    if (ordinal != 2) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    ra1 ra1Var2 = xqVar.GWasM1elztuh;
                }
                return new ga1(ga1Var != null ? ga1Var.GWasM1elztuh : ga1.Yi7zF1RB1);
            default:
                rt rtVar = (rt) obj;
                if (!o30.rQPn8YBR(rtVar, (rt) obj4)) {
                    if (o30.rQPn8YBR(rtVar, ((nt) obj2).X1lG3V04pd)) {
                        o4.jivtDDk9H("Focus search landed at the root.");
                        return null;
                    }
                    z = ((Boolean) ((hv) obj3).mOu10nynGul(rtVar)).booleanValue();
                }
                return Boolean.valueOf(z);
        }
    }
}
