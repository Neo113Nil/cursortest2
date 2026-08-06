package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class k7 extends me0 {
    public final r6 GWasM1elztuh;

    public k7(r6 r6Var) {
        this.GWasM1elztuh = r6Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((l7) he0Var).mE4lRynR = this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k7 k7Var = obj instanceof k7 ? (k7) obj : null;
        return k7Var != null && this.GWasM1elztuh.equals(k7Var.GWasM1elztuh);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.GWasM1elztuh.hashCode() * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        l7 l7Var = new l7();
        l7Var.mE4lRynR = this.GWasM1elztuh;
        return l7Var;
    }
}
