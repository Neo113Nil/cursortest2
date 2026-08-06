package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ok implements r90 {
    public final Object AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 2;

    public ok(s90 s90Var) {
        this.EljAMC1QTz = s90Var;
        ya yaVar = ya.X1lG3V04pd;
        Class<?> cls = s90Var.getClass();
        wa waVar = (wa) yaVar.GWasM1elztuh.get(cls);
        this.AvO7iQsrTN = waVar == null ? yaVar.GWasM1elztuh(cls, null) : waVar;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        int i = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        Object obj2 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                mk mkVar = (mk) obj;
                switch (nk.GWasM1elztuh[l90Var.ordinal()]) {
                    case 1:
                        mkVar.getClass();
                        break;
                    case 2:
                        mkVar.Yi7zF1RB1(t90Var);
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        mkVar.X1lG3V04pd(t90Var);
                        break;
                    case 4:
                        mkVar.getClass();
                        break;
                    case 5:
                        mkVar.GWasM1elztuh(t90Var);
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        mkVar.getClass();
                        break;
                    case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                        o4.mE4lRynR("ON_ANY must not been send by anybody");
                        break;
                    default:
                        o4.xqGvceK5x();
                        break;
                }
                r90 r90Var = (r90) obj2;
                if (r90Var != null) {
                    r90Var.OOA6hdeuvCS(t90Var, l90Var);
                    break;
                }
                break;
            case 1:
                if (l90Var == l90.ON_START) {
                    ((w90) obj).EljAMC1QTz(this);
                    ((d) obj2).Y6hRI1cF8();
                    break;
                }
                break;
            case 2:
                bl0 bl0Var = (bl0) obj;
                int i2 = gl0.GWasM1elztuh[l90Var.ordinal()];
                if (i2 == 1) {
                    bl0Var.AvO7iQsrTN(true);
                    break;
                } else if (i2 == 2) {
                    bl0Var.AvO7iQsrTN(false);
                    break;
                } else if (i2 == 3) {
                    bl0Var.OOA6hdeuvCS();
                    ((w90) obj2).EljAMC1QTz(this);
                    break;
                }
                break;
            default:
                HashMap hashMap = ((wa) obj2).GWasM1elztuh;
                wa.GWasM1elztuh((List) hashMap.get(l90Var), t90Var, l90Var, obj);
                wa.GWasM1elztuh((List) hashMap.get(l90.ON_ANY), t90Var, l90Var, obj);
                break;
        }
    }

    public ok(mk mkVar, r90 r90Var) {
        mkVar.getClass();
        this.EljAMC1QTz = mkVar;
        this.AvO7iQsrTN = r90Var;
    }

    public ok(d dVar, w90 w90Var) {
        this.EljAMC1QTz = w90Var;
        this.AvO7iQsrTN = dVar;
    }

    public ok(bl0 bl0Var, hl0 hl0Var, w90 w90Var) {
        this.EljAMC1QTz = bl0Var;
        this.AvO7iQsrTN = w90Var;
    }
}
