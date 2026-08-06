package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kc implements d81 {
    public final long OOA6hdeuvCS;

    public kc(long j) {
        this.OOA6hdeuvCS = j;
        if (j != 16) {
            return;
        }
        u10.GWasM1elztuh("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.d81
    public final qj AvO7iQsrTN() {
        return null;
    }

    @Override // defpackage.d81
    public final float Yi7zF1RB1() {
        return yb.xqGvceK5x(this.OOA6hdeuvCS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc) && yb.X1lG3V04pd(this.OOA6hdeuvCS, ((kc) obj).OOA6hdeuvCS);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Long.hashCode(this.OOA6hdeuvCS);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) yb.mOu10nynGul(this.OOA6hdeuvCS)) + ')';
    }

    @Override // defpackage.d81
    public final long xqGvceK5x() {
        return this.OOA6hdeuvCS;
    }
}
