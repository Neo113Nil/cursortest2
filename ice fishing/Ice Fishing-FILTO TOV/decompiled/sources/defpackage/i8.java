package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i8 implements hv {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ i8(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        long j;
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((p9) this.EljAMC1QTz).cancel();
                return kc1.GWasM1elztuh;
            case 1:
                c41 c41Var = (c41) obj;
                synchronized (e41.X1lG3V04pd) {
                    j = e41.OOA6hdeuvCS;
                    e41.OOA6hdeuvCS = 1 + j;
                }
                return new xs0(j, c41Var, (hv) this.EljAMC1QTz);
            case 2:
                i90 i90Var = (i90) obj;
                i90Var.getClass();
                kz0 kz0Var = (kz0) this.EljAMC1QTz;
                kz0Var.EljAMC1QTz.mE4lRynR(new ez0(i90Var));
                return kc1.GWasM1elztuh;
            default:
                ((List) this.EljAMC1QTz).get(((Number) obj).intValue());
                return null;
        }
    }
}
