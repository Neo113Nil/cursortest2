package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class s50 extends me0 {
    public final String GWasM1elztuh;

    public s50(String str) {
        this.GWasM1elztuh = str;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((t50) he0Var).mE4lRynR = this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s50) && this.GWasM1elztuh.equals(((s50) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.GWasM1elztuh) + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        t50 t50Var = new t50();
        t50Var.mE4lRynR = this.GWasM1elztuh;
        return t50Var;
    }
}
