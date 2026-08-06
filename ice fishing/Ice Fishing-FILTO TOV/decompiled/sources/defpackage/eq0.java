package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eq0 {
    public final bq0 GWasM1elztuh;

    public eq0(bq0 bq0Var) {
        this.GWasM1elztuh = bq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eq0) {
            return o30.rQPn8YBR(this.GWasM1elztuh, ((eq0) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        bq0 bq0Var = this.GWasM1elztuh;
        if (bq0Var != null) {
            return bq0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.GWasM1elztuh + ')';
    }
}
