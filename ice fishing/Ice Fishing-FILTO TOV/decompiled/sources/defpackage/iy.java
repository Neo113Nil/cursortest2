package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class iy implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ iy(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        long j;
        switch (this.OOA6hdeuvCS) {
            case 0:
                c41 c41Var = (c41) obj;
                synchronized (e41.X1lG3V04pd) {
                    j = e41.OOA6hdeuvCS;
                    e41.OOA6hdeuvCS = 1 + j;
                }
                return new lg0(j, c41Var, (hv) this.EljAMC1QTz, (hv) this.AvO7iQsrTN);
            case 1:
                i50 i50Var = (i50) this.EljAMC1QTz;
                Object obj2 = i50Var.Yi7zF1RB1;
                n9 n9Var = (n9) this.AvO7iQsrTN;
                synchronized (obj2) {
                    ((ArrayList) i50Var.X1lG3V04pd).remove(n9Var);
                }
                return kc1.GWasM1elztuh;
            default:
                return ((dx0) this.EljAMC1QTz).mOu10nynGul(((List) this.AvO7iQsrTN).get(((Number) obj).intValue()));
        }
    }
}
