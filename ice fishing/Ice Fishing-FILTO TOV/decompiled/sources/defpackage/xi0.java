package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class xi0 {
    public d70 GWasM1elztuh;
    public rx0 X1lG3V04pd;
    public boolean Yi7zF1RB1;

    public final void EljAMC1QTz(boolean z) {
        aj0 aj0Var;
        if (this.Yi7zF1RB1 == z) {
            return;
        }
        this.Yi7zF1RB1 = z;
        rx0 rx0Var = this.X1lG3V04pd;
        if (rx0Var == null || (aj0Var = (aj0) rx0Var.EljAMC1QTz) == null) {
            return;
        }
        aj0Var.Yi7zF1RB1();
    }

    public abstract void GWasM1elztuh();

    public final void OOA6hdeuvCS() {
        rx0 rx0Var = this.X1lG3V04pd;
        if (rx0Var == null || !((LinkedHashSet) rx0Var.AvO7iQsrTN).remove(this)) {
            return;
        }
        aj0 aj0Var = (aj0) rx0Var.EljAMC1QTz;
        aj0Var.getClass();
        if (equals(aj0Var.EljAMC1QTz)) {
            if (aj0Var.AvO7iQsrTN == -1) {
                GWasM1elztuh();
            }
            aj0Var.EljAMC1QTz = null;
            aj0Var.AvO7iQsrTN = 0;
            aj0Var.encWxUiV2 = null;
        }
        aj0Var.xqGvceK5x.remove(this);
        aj0Var.OOA6hdeuvCS.remove(this);
        this.X1lG3V04pd = null;
        aj0Var.Yi7zF1RB1();
    }

    public abstract void X1lG3V04pd(vi0 vi0Var);

    public abstract void Yi7zF1RB1();

    public abstract void xqGvceK5x(vi0 vi0Var);
}
