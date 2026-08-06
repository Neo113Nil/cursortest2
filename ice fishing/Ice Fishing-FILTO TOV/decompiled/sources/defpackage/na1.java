package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class na1 implements ma1 {
    public final Object GWasM1elztuh;
    public final Object Yi7zF1RB1;

    public na1(Object obj, Object obj2) {
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = obj2;
    }

    @Override // defpackage.ma1
    public final Object X1lG3V04pd() {
        return this.Yi7zF1RB1;
    }

    @Override // defpackage.ma1
    public final Object Yi7zF1RB1() {
        return this.GWasM1elztuh;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ma1)) {
            return false;
        }
        ma1 ma1Var = (ma1) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, ma1Var.Yi7zF1RB1()) && o30.rQPn8YBR(this.Yi7zF1RB1, ma1Var.X1lG3V04pd());
    }

    public final int hashCode() {
        Object obj = this.GWasM1elztuh;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.Yi7zF1RB1;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
