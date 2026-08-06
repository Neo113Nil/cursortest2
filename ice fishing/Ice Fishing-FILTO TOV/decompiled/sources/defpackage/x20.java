package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x20 extends v20 {
    public static final x20 encWxUiV2 = new x20(1, 0, 1);

    @Override // defpackage.v20
    public final boolean equals(Object obj) {
        if (!(obj instanceof x20)) {
            return false;
        }
        if (isEmpty() && ((x20) obj).isEmpty()) {
            return true;
        }
        x20 x20Var = (x20) obj;
        return this.OOA6hdeuvCS == x20Var.OOA6hdeuvCS && this.EljAMC1QTz == x20Var.EljAMC1QTz;
    }

    @Override // defpackage.v20
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.OOA6hdeuvCS * 31) + this.EljAMC1QTz;
    }

    @Override // defpackage.v20
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS > this.EljAMC1QTz;
    }

    @Override // defpackage.v20
    public final String toString() {
        return this.OOA6hdeuvCS + ".." + this.EljAMC1QTz;
    }
}
