package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tx implements wu {
    public final /* synthetic */ ux OOA6hdeuvCS;

    public tx(ux uxVar) {
        this.OOA6hdeuvCS = uxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        ArrayList arrayList = this.OOA6hdeuvCS.GWasM1elztuh;
        hg0 hg0Var = new hg0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x40 x40Var = (x40) arrayList.get(i);
            Object obj = x40Var.Yi7zF1RB1;
            int i2 = x40Var.GWasM1elztuh;
            Object n40Var = obj != null ? new n40(Integer.valueOf(i2), x40Var.Yi7zF1RB1) : Integer.valueOf(i2);
            int EljAMC1QTz = hg0Var.EljAMC1QTz(n40Var);
            boolean z = EljAMC1QTz < 0;
            Object obj2 = z ? null : hg0Var.X1lG3V04pd[EljAMC1QTz];
            if (obj2 != null) {
                if (obj2 instanceof ag0) {
                    ag0 ag0Var = (ag0) obj2;
                    ag0Var.GWasM1elztuh(x40Var);
                    x40Var = ag0Var;
                } else {
                    Object[] objArr = qk0.GWasM1elztuh;
                    ag0 ag0Var2 = new ag0(2);
                    ag0Var2.GWasM1elztuh(obj2);
                    ag0Var2.GWasM1elztuh(x40Var);
                    x40Var = ag0Var2;
                }
            }
            if (z) {
                int i3 = ~EljAMC1QTz;
                hg0Var.Yi7zF1RB1[i3] = n40Var;
                hg0Var.X1lG3V04pd[i3] = x40Var;
            } else {
                hg0Var.X1lG3V04pd[EljAMC1QTz] = x40Var;
            }
        }
        return new nf0(hg0Var);
    }
}
