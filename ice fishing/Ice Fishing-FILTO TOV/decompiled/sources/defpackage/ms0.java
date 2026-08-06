package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ms0 extends i9 implements u40 {
    public final boolean rQPn8YBR;

    public ms0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.rQPn8YBR = false;
    }

    public final o40 AvO7iQsrTN() {
        if (this.rQPn8YBR) {
            return this;
        }
        o40 o40Var = this.OOA6hdeuvCS;
        if (o40Var != null) {
            return o40Var;
        }
        o40 xqGvceK5x = xqGvceK5x();
        this.OOA6hdeuvCS = xqGvceK5x;
        return xqGvceK5x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ms0) {
            ms0 ms0Var = (ms0) obj;
            return OOA6hdeuvCS().equals(ms0Var.OOA6hdeuvCS()) && this.encWxUiV2.equals(ms0Var.encWxUiV2) && this.mOu10nynGul.equals(ms0Var.mOu10nynGul) && o30.rQPn8YBR(this.EljAMC1QTz, ms0Var.EljAMC1QTz);
        }
        if (obj instanceof u40) {
            return obj.equals(AvO7iQsrTN());
        }
        return false;
    }

    public final int hashCode() {
        return this.mOu10nynGul.hashCode() + ((this.encWxUiV2.hashCode() + (OOA6hdeuvCS().hashCode() * 31)) * 31);
    }

    public final String toString() {
        o40 AvO7iQsrTN = AvO7iQsrTN();
        if (AvO7iQsrTN != this) {
            return AvO7iQsrTN.toString();
        }
        return "property " + this.encWxUiV2 + " (Kotlin reflection is not available)";
    }
}
