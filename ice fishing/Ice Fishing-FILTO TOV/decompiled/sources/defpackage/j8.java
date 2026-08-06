package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j8 implements d81 {
    public final float EljAMC1QTz;
    public final v11 OOA6hdeuvCS;

    public j8(v11 v11Var, float f) {
        this.OOA6hdeuvCS = v11Var;
        this.EljAMC1QTz = f;
    }

    @Override // defpackage.d81
    public final qj AvO7iQsrTN() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.d81
    public final float Yi7zF1RB1() {
        return this.EljAMC1QTz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return o30.rQPn8YBR(this.OOA6hdeuvCS, j8Var.OOA6hdeuvCS) && Float.compare(this.EljAMC1QTz, j8Var.EljAMC1QTz) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.EljAMC1QTz) + (this.OOA6hdeuvCS.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", alpha=");
        return mr0.JFJ3QoxA(sb, this.EljAMC1QTz, ')');
    }

    @Override // defpackage.d81
    public final long xqGvceK5x() {
        int i = yb.encWxUiV2;
        return yb.AvO7iQsrTN;
    }
}
