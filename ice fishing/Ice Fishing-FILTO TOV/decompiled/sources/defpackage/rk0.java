package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rk0 {
    public final int GWasM1elztuh;
    public final Integer Yi7zF1RB1;

    public rk0(int i, Integer num) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk0)) {
            return false;
        }
        rk0 rk0Var = (rk0) obj;
        return this.GWasM1elztuh == rk0Var.GWasM1elztuh && o30.rQPn8YBR(this.Yi7zF1RB1, rk0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.GWasM1elztuh) * 31;
        Integer num = this.Yi7zF1RB1;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.GWasM1elztuh + ", dataOffset=" + this.Yi7zF1RB1 + ')';
    }
}
