package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class wa1 extends me0 {
    public final z70 GWasM1elztuh;

    public wa1(z70 z70Var) {
        this.GWasM1elztuh = z70Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((xa1) he0Var).mE4lRynR = this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa1) && o30.rQPn8YBR(this.GWasM1elztuh, ((wa1) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.GWasM1elztuh + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        xa1 xa1Var = new xa1();
        xa1Var.mE4lRynR = this.GWasM1elztuh;
        return xa1Var;
    }
}
