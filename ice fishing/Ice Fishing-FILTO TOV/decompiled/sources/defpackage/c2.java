package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c2 implements sf1 {
    public final int GWasM1elztuh;
    public final String Yi7zF1RB1;
    public final fo0 X1lG3V04pd = z50.WRKkgoJXwDn(e20.OOA6hdeuvCS);
    public final fo0 xqGvceK5x = z50.WRKkgoJXwDn(Boolean.TRUE);

    public c2(String str, int i) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = str;
    }

    public final void AvO7iQsrTN(wg1 wg1Var, int i) {
        int i2 = this.GWasM1elztuh;
        if (i == 0 || (i & i2) != 0) {
            this.X1lG3V04pd.setValue(wg1Var.GWasM1elztuh.encWxUiV2(i2));
            EljAMC1QTz(wg1Var.GWasM1elztuh.jivtDDk9H(i2));
        }
    }

    public final void EljAMC1QTz(boolean z) {
        this.xqGvceK5x.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.sf1
    public final int GWasM1elztuh(dd0 dd0Var, p50 p50Var) {
        return OOA6hdeuvCS().GWasM1elztuh;
    }

    public final e20 OOA6hdeuvCS() {
        return (e20) this.X1lG3V04pd.getValue();
    }

    @Override // defpackage.sf1
    public final int X1lG3V04pd(dd0 dd0Var, p50 p50Var) {
        return OOA6hdeuvCS().X1lG3V04pd;
    }

    @Override // defpackage.sf1
    public final int Yi7zF1RB1(dd0 dd0Var) {
        return OOA6hdeuvCS().Yi7zF1RB1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c2) {
            return this.GWasM1elztuh == ((c2) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh;
    }

    public final String toString() {
        return this.Yi7zF1RB1 + '(' + OOA6hdeuvCS().GWasM1elztuh + ", " + OOA6hdeuvCS().Yi7zF1RB1 + ", " + OOA6hdeuvCS().X1lG3V04pd + ", " + OOA6hdeuvCS().xqGvceK5x + ')';
    }

    @Override // defpackage.sf1
    public final int xqGvceK5x(dd0 dd0Var) {
        return OOA6hdeuvCS().xqGvceK5x;
    }
}
