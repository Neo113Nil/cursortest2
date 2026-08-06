package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kd1 implements sf1 {
    public final String GWasM1elztuh;
    public final fo0 Yi7zF1RB1;

    public kd1(l20 l20Var, String str) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = z50.WRKkgoJXwDn(l20Var);
    }

    public final void EljAMC1QTz(l20 l20Var) {
        this.Yi7zF1RB1.setValue(l20Var);
    }

    @Override // defpackage.sf1
    public final int GWasM1elztuh(dd0 dd0Var, p50 p50Var) {
        return OOA6hdeuvCS().GWasM1elztuh;
    }

    public final l20 OOA6hdeuvCS() {
        return (l20) this.Yi7zF1RB1.getValue();
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
        if (obj == this) {
            return true;
        }
        if (obj instanceof kd1) {
            return o30.rQPn8YBR(OOA6hdeuvCS(), ((kd1) obj).OOA6hdeuvCS());
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return this.GWasM1elztuh + "(left=" + OOA6hdeuvCS().GWasM1elztuh + ", top=" + OOA6hdeuvCS().Yi7zF1RB1 + ", right=" + OOA6hdeuvCS().X1lG3V04pd + ", bottom=" + OOA6hdeuvCS().xqGvceK5x + ')';
    }

    @Override // defpackage.sf1
    public final int xqGvceK5x(dd0 dd0Var) {
        return OOA6hdeuvCS().xqGvceK5x;
    }
}
