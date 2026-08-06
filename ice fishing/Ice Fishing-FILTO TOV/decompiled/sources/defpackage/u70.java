package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u70 {
    public boolean EljAMC1QTz;
    public final Object GWasM1elztuh;
    public u70 OOA6hdeuvCS;
    public final w70 Yi7zF1RB1;
    public int xqGvceK5x;
    public int X1lG3V04pd = -1;
    public final fo0 AvO7iQsrTN = z50.WRKkgoJXwDn(null);

    public u70(Object obj, w70 w70Var) {
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = w70Var;
    }

    public final u70 GWasM1elztuh() {
        if (this.EljAMC1QTz) {
            w10.X1lG3V04pd("Pin should not be called on an already disposed item ");
        }
        if (this.xqGvceK5x == 0) {
            this.Yi7zF1RB1.OOA6hdeuvCS.add(this);
            u70 u70Var = (u70) this.AvO7iQsrTN.getValue();
            if (u70Var != null) {
                u70Var.GWasM1elztuh();
            } else {
                u70Var = null;
            }
            this.OOA6hdeuvCS = u70Var;
        }
        this.xqGvceK5x++;
        return this;
    }

    public final void Yi7zF1RB1() {
        if (this.EljAMC1QTz) {
            return;
        }
        if (this.xqGvceK5x <= 0) {
            w10.X1lG3V04pd("Release should only be called once");
        }
        int i = this.xqGvceK5x - 1;
        this.xqGvceK5x = i;
        if (i == 0) {
            this.Yi7zF1RB1.OOA6hdeuvCS.remove(this);
            u70 u70Var = this.OOA6hdeuvCS;
            if (u70Var != null) {
                u70Var.Yi7zF1RB1();
            }
            this.OOA6hdeuvCS = null;
        }
    }
}
