package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fe {
    public boolean AvO7iQsrTN;
    public f51 EljAMC1QTz;
    public n8 OOA6hdeuvCS;
    public final ph X1lG3V04pd;
    public final x5 Yi7zF1RB1;
    public final y5 GWasM1elztuh = new y5(0, this);
    public lv xqGvceK5x = new s1(2, null, 1);

    public fe(ph phVar, wq0 wq0Var) {
        this.Yi7zF1RB1 = new x5(this, wq0Var);
        this.X1lG3V04pd = phVar;
    }

    public final boolean GWasM1elztuh() {
        return this.GWasM1elztuh.Yi7zF1RB1 && this.Yi7zF1RB1.Yi7zF1RB1;
    }

    public final void OOA6hdeuvCS(boolean z) {
        f51 f51Var;
        if (!z && GWasM1elztuh() && (f51Var = this.EljAMC1QTz) != null && !f51Var.Yi7zF1RB1()) {
            Yi7zF1RB1();
        }
        this.GWasM1elztuh.xqGvceK5x(z);
        this.Yi7zF1RB1.EljAMC1QTz(z);
    }

    public final void X1lG3V04pd() {
        if (this.OOA6hdeuvCS != null && !this.AvO7iQsrTN) {
            Yi7zF1RB1();
        }
        if (this.OOA6hdeuvCS == null) {
            this.AvO7iQsrTN = false;
            this.OOA6hdeuvCS = fb1.Yi7zF1RB1(-2, l8.OOA6hdeuvCS, 4);
            this.EljAMC1QTz = fb1.MZhzXH72(this.X1lG3V04pd, null, new xqGvceK5x(this, null, 7), 3);
        }
        n8 n8Var = this.OOA6hdeuvCS;
        if (n8Var != null) {
            d70.E7jCp8Ls(n8Var);
        }
        this.AvO7iQsrTN = false;
    }

    public final void Yi7zF1RB1() {
        n8 n8Var = this.OOA6hdeuvCS;
        if (n8Var != null) {
            n8Var.AvO7iQsrTN(new CancellationException("onBack cancelled"), true);
        }
        f51 f51Var = this.EljAMC1QTz;
        if (f51Var != null) {
            f51Var.GWasM1elztuh(null);
        }
        this.OOA6hdeuvCS = null;
        this.EljAMC1QTz = null;
        this.AvO7iQsrTN = false;
    }

    public final void xqGvceK5x() {
        Yi7zF1RB1();
        if (GWasM1elztuh()) {
            this.AvO7iQsrTN = true;
            this.OOA6hdeuvCS = fb1.Yi7zF1RB1(-2, l8.OOA6hdeuvCS, 4);
            this.EljAMC1QTz = fb1.MZhzXH72(this.X1lG3V04pd, null, new xqGvceK5x(this, null, 7), 3);
        }
    }
}
