package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x60 extends me0 {
    public final float GWasM1elztuh;
    public final boolean Yi7zF1RB1;

    public x60(float f, boolean z) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = z;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        y60 y60Var = (y60) he0Var;
        y60Var.mE4lRynR = this.GWasM1elztuh;
        y60Var.jivtDDk9H = this.Yi7zF1RB1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        x60 x60Var = obj instanceof x60 ? (x60) obj : null;
        return x60Var != null && this.GWasM1elztuh == x60Var.GWasM1elztuh && this.Yi7zF1RB1 == x60Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Yi7zF1RB1) + (Float.hashCode(this.GWasM1elztuh) * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        y60 y60Var = new y60();
        y60Var.mE4lRynR = this.GWasM1elztuh;
        y60Var.jivtDDk9H = this.Yi7zF1RB1;
        return y60Var;
    }
}
