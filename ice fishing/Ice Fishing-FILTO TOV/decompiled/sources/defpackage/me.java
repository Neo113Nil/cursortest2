package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class me {
    public final int GWasM1elztuh;
    public final Integer Yi7zF1RB1;

    public me(int i, l60 l60Var, Integer num) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return this.GWasM1elztuh == meVar.GWasM1elztuh && o30.rQPn8YBR(null, null) && o30.rQPn8YBR(this.Yi7zF1RB1, meVar.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.GWasM1elztuh) * 31) + 0) * 31;
        Integer num = this.Yi7zF1RB1;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.GWasM1elztuh + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.Yi7zF1RB1 + ')';
    }
}
