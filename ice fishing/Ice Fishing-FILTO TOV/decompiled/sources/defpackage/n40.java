package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n40 {
    public final Integer GWasM1elztuh;
    public final Object Yi7zF1RB1;

    public n40(Integer num, Object obj) {
        this.GWasM1elztuh = num;
        this.Yi7zF1RB1 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return this.GWasM1elztuh.equals(n40Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, n40Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = this.GWasM1elztuh.hashCode() * 31;
        Object obj = this.Yi7zF1RB1;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.GWasM1elztuh + ", right=" + this.Yi7zF1RB1 + ')';
    }
}
