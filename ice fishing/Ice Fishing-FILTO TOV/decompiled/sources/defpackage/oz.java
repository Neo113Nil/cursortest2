package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oz extends me0 {
    public final p6 GWasM1elztuh;

    public oz(p6 p6Var) {
        this.GWasM1elztuh = p6Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((pz) he0Var).mE4lRynR = this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        oz ozVar = obj instanceof oz ? (oz) obj : null;
        if (ozVar == null) {
            return false;
        }
        return this.GWasM1elztuh.equals(ozVar.GWasM1elztuh);
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh.GWasM1elztuh);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        pz pzVar = new pz();
        pzVar.mE4lRynR = this.GWasM1elztuh;
        return pzVar;
    }
}
