package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class j70 extends me0 {
    public final m70 GWasM1elztuh;

    public j70(m70 m70Var) {
        this.GWasM1elztuh = m70Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        k70 k70Var = (k70) he0Var;
        m70 m70Var = k70Var.mE4lRynR;
        m70 m70Var2 = this.GWasM1elztuh;
        if (o30.rQPn8YBR(m70Var, m70Var2) || !k70Var.OOA6hdeuvCS.Mjvvu5DE) {
            return;
        }
        m70 m70Var3 = k70Var.mE4lRynR;
        m70Var3.X1lG3V04pd();
        m70Var3.Yi7zF1RB1 = null;
        k70Var.mE4lRynR = m70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j70) && this.GWasM1elztuh == ((j70) obj).GWasM1elztuh;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.GWasM1elztuh + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        k70 k70Var = new k70();
        k70Var.mE4lRynR = this.GWasM1elztuh;
        return k70Var;
    }
}
