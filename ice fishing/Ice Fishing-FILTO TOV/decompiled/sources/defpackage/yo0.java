package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yo0 implements bu0 {
    public final rg0 EljAMC1QTz = new rg0(new vx[16]);
    public final Set OOA6hdeuvCS;

    public yo0(Set set) {
        this.OOA6hdeuvCS = set;
    }

    @Override // defpackage.bu0
    public final void X1lG3V04pd() {
        rg0 rg0Var = this.EljAMC1QTz;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            bu0 bu0Var = ((vx) objArr[i2]).GWasM1elztuh;
            this.OOA6hdeuvCS.remove(bu0Var);
            bu0Var.X1lG3V04pd();
        }
    }

    @Override // defpackage.bu0
    public final void OOA6hdeuvCS() {
    }

    @Override // defpackage.bu0
    public final void xqGvceK5x() {
    }
}
