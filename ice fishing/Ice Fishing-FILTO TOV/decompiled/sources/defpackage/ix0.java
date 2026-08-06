package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class ix0 implements lv {
    public final /* synthetic */ int OOA6hdeuvCS;

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return Integer.valueOf(((p81) obj2).GWasM1elztuh);
            case 1:
                return Integer.valueOf(((by0) obj2).GWasM1elztuh.AvO7iQsrTN());
            case 2:
                ((Integer) obj2).getClass();
                c91.GWasM1elztuh(n4.lv06NcmrQ(7), (qx) obj);
                return kc1Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                eh ehVar = (eh) obj2;
                if (!(ehVar instanceof ba1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? ehVar : Integer.valueOf(intValue + 1);
            case 4:
                eh ehVar2 = (eh) obj2;
                if (ehVar2 instanceof ba1) {
                    return (ba1) ehVar2;
                }
                return null;
            default:
                g91 g91Var = (g91) obj;
                eh ehVar3 = (eh) obj2;
                if (ehVar3 instanceof ba1) {
                    gh ghVar = g91Var.GWasM1elztuh;
                    Trace.beginSection(null);
                    Object[] objArr = g91Var.Yi7zF1RB1;
                    int i2 = g91Var.xqGvceK5x;
                    objArr[i2] = kc1Var;
                    ba1[] ba1VarArr = g91Var.X1lG3V04pd;
                    g91Var.xqGvceK5x = i2 + 1;
                    ba1VarArr[i2] = (ba1) ehVar3;
                }
                return g91Var;
        }
    }

    public /* synthetic */ ix0(int i, byte b) {
        this.OOA6hdeuvCS = i;
    }
}
