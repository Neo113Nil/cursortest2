package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class VeqTn1PQw7 {
    public final String GWasM1elztuh;
    public final tv Yi7zF1RB1;

    public VeqTn1PQw7(String str, tv tvVar) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = tvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VeqTn1PQw7)) {
            return false;
        }
        VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, veqTn1PQw7.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, veqTn1PQw7.Yi7zF1RB1);
    }

    public final int hashCode() {
        String str = this.GWasM1elztuh;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        tv tvVar = this.Yi7zF1RB1;
        return hashCode + (tvVar != null ? tvVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.GWasM1elztuh + ", action=" + this.Yi7zF1RB1 + ')';
    }
}
