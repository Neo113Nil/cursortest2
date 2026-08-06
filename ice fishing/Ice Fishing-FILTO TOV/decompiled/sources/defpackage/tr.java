package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class tr extends me0 {
    public final gm GWasM1elztuh;

    public tr(gm gmVar) {
        this.GWasM1elztuh = gmVar;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ur urVar = (ur) he0Var;
        urVar.mE4lRynR = this.GWasM1elztuh;
        urVar.jivtDDk9H = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tr) {
            return this.GWasM1elztuh == ((tr) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.GWasM1elztuh.hashCode() * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        ur urVar = new ur();
        urVar.mE4lRynR = this.GWasM1elztuh;
        urVar.jivtDDk9H = 1.0f;
        return urVar;
    }
}
