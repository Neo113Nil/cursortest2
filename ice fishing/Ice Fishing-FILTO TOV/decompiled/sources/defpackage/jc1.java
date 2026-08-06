package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jc1 implements sf1 {
    public final sf1 GWasM1elztuh;
    public final sf1 Yi7zF1RB1;

    public jc1(sf1 sf1Var, sf1 sf1Var2) {
        this.GWasM1elztuh = sf1Var;
        this.Yi7zF1RB1 = sf1Var2;
    }

    @Override // defpackage.sf1
    public final int GWasM1elztuh(dd0 dd0Var, p50 p50Var) {
        return Math.max(this.GWasM1elztuh.GWasM1elztuh(dd0Var, p50Var), this.Yi7zF1RB1.GWasM1elztuh(dd0Var, p50Var));
    }

    @Override // defpackage.sf1
    public final int X1lG3V04pd(dd0 dd0Var, p50 p50Var) {
        return Math.max(this.GWasM1elztuh.X1lG3V04pd(dd0Var, p50Var), this.Yi7zF1RB1.X1lG3V04pd(dd0Var, p50Var));
    }

    @Override // defpackage.sf1
    public final int Yi7zF1RB1(dd0 dd0Var) {
        return Math.max(this.GWasM1elztuh.Yi7zF1RB1(dd0Var), this.Yi7zF1RB1.Yi7zF1RB1(dd0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc1)) {
            return false;
        }
        jc1 jc1Var = (jc1) obj;
        return o30.rQPn8YBR(jc1Var.GWasM1elztuh, this.GWasM1elztuh) && o30.rQPn8YBR(jc1Var.Yi7zF1RB1, this.Yi7zF1RB1);
    }

    public final int hashCode() {
        return (this.Yi7zF1RB1.hashCode() * 31) + this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "(" + this.GWasM1elztuh + " ∪ " + this.Yi7zF1RB1 + ')';
    }

    @Override // defpackage.sf1
    public final int xqGvceK5x(dd0 dd0Var) {
        return Math.max(this.GWasM1elztuh.xqGvceK5x(dd0Var), this.Yi7zF1RB1.xqGvceK5x(dd0Var));
    }
}
