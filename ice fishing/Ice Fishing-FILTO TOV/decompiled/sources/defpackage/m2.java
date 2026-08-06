package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m2 implements sm {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ Object X1lG3V04pd;
    public final /* synthetic */ Object Yi7zF1RB1;
    public final /* synthetic */ Object xqGvceK5x;

    public m2(am amVar, fh0 fh0Var, p41 p41Var) {
        this.GWasM1elztuh = 1;
        this.X1lG3V04pd = amVar;
        this.xqGvceK5x = fh0Var;
        this.Yi7zF1RB1 = p41Var;
    }

    @Override // defpackage.sm
    public final void GWasM1elztuh() {
        int i = this.GWasM1elztuh;
        Object obj = this.xqGvceK5x;
        Object obj2 = this.X1lG3V04pd;
        Object obj3 = this.Yi7zF1RB1;
        switch (i) {
            case 0:
                ((p41) obj3).remove(obj2);
                ((a3) obj).xqGvceK5x.rQPn8YBR(obj2);
                break;
            case 1:
                fh0 fh0Var = (fh0) obj;
                ((am) obj2).Yi7zF1RB1().X1lG3V04pd(fh0Var);
                ((p41) obj3).remove(fh0Var);
                break;
            case 2:
                ((t90) obj3).AvO7iQsrTN().EljAMC1QTz((p90) obj2);
                bx bxVar = (bx) ((rt0) obj).OOA6hdeuvCS;
                if (bxVar != null) {
                    kx kxVar = bxVar.GWasM1elztuh;
                    kxVar.EljAMC1QTz.mE4lRynR(pw.GWasM1elztuh);
                    break;
                }
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ((t90) obj3).AvO7iQsrTN().EljAMC1QTz((p90) obj2);
                zq0 zq0Var = (zq0) ((rt0) obj).OOA6hdeuvCS;
                if (zq0Var != null) {
                    zq0Var.GWasM1elztuh();
                    break;
                }
                break;
            default:
                jw0 jw0Var = (jw0) obj3;
                ow0 ow0Var = (ow0) obj;
                if (jw0Var.EljAMC1QTz.rQPn8YBR(obj2) == ow0Var) {
                    Map map = jw0Var.OOA6hdeuvCS;
                    Map OOA6hdeuvCS = ow0Var.OOA6hdeuvCS();
                    if (!OOA6hdeuvCS.isEmpty()) {
                        map.put(obj2, OOA6hdeuvCS);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, int i) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
        this.X1lG3V04pd = obj2;
        this.xqGvceK5x = obj3;
    }
}
