package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ph1 implements r90 {
    public final /* synthetic */ gt0 AvO7iQsrTN;
    public final /* synthetic */ y1 EljAMC1QTz;
    public final /* synthetic */ ug OOA6hdeuvCS;
    public final /* synthetic */ rt0 encWxUiV2;

    public ph1(ug ugVar, y1 y1Var, gt0 gt0Var, rt0 rt0Var) {
        this.OOA6hdeuvCS = ugVar;
        this.EljAMC1QTz = y1Var;
        this.AvO7iQsrTN = gt0Var;
        this.encWxUiV2 = rt0Var;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        boolean z;
        l9 l9Var = null;
        switch (oh1.GWasM1elztuh[l90Var.ordinal()]) {
            case 1:
                fb1.MZhzXH72(this.OOA6hdeuvCS, null, new i2(this.encWxUiV2, this.AvO7iQsrTN, t90Var, this, null, 9), 1);
                return;
            case 2:
                y1 y1Var = this.EljAMC1QTz;
                if (y1Var != null) {
                    i50 i50Var = (i50) y1Var.AvO7iQsrTN;
                    synchronized (i50Var.Yi7zF1RB1) {
                        try {
                            synchronized (i50Var.Yi7zF1RB1) {
                                z = i50Var.GWasM1elztuh;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) i50Var.X1lG3V04pd;
                                i50Var.X1lG3V04pd = (ArrayList) i50Var.xqGvceK5x;
                                i50Var.xqGvceK5x = arrayList;
                                i50Var.GWasM1elztuh = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((vg) arrayList.get(i)).AvO7iQsrTN(kc1.GWasM1elztuh);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                gt0 gt0Var = this.AvO7iQsrTN;
                synchronized (gt0Var.X1lG3V04pd) {
                    if (gt0Var.jivtDDk9H) {
                        gt0Var.jivtDDk9H = false;
                        l9Var = gt0Var.WRKkgoJXwDn();
                    }
                }
                if (l9Var != null) {
                    ((n9) l9Var).AvO7iQsrTN(kc1.GWasM1elztuh);
                    return;
                }
                return;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                gt0 gt0Var2 = this.AvO7iQsrTN;
                synchronized (gt0Var2.X1lG3V04pd) {
                    gt0Var2.jivtDDk9H = true;
                }
                return;
            case 4:
                this.AvO7iQsrTN.WdrkLMV3xh();
                return;
            case 5:
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                o4.xqGvceK5x();
                return;
        }
    }
}
