package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class bo extends me0 {
    public final hv GWasM1elztuh;

    public bo(hv hvVar) {
        this.GWasM1elztuh = hvVar;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((ao) he0Var).mE4lRynR = this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bo) {
            return this.GWasM1elztuh == ((bo) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        ao aoVar = new ao();
        aoVar.mE4lRynR = this.GWasM1elztuh;
        return aoVar;
    }
}
