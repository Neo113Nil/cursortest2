package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class eh0 {
    public final ui0 GWasM1elztuh;
    public final Object X1lG3V04pd;
    public final boolean Yi7zF1RB1;

    public eh0(ui0 ui0Var, Object obj, boolean z) {
        if (z && obj == null) {
            o4.iwATDS1i01k("Argument with type ", ui0Var.Yi7zF1RB1(), " has null value but is not nullable.");
            throw null;
        }
        this.GWasM1elztuh = ui0Var;
        this.X1lG3V04pd = obj;
        this.Yi7zF1RB1 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eh0.class != obj.getClass()) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        if (this.Yi7zF1RB1 != eh0Var.Yi7zF1RB1 || !this.GWasM1elztuh.equals(eh0Var.GWasM1elztuh)) {
            return false;
        }
        Object obj2 = eh0Var.X1lG3V04pd;
        Object obj3 = this.X1lG3V04pd;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((this.GWasM1elztuh.hashCode() * 961) + (this.Yi7zF1RB1 ? 1 : 0)) * 31;
        Object obj = this.X1lG3V04pd;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(st0.GWasM1elztuh(eh0.class).Yi7zF1RB1());
        sb.append(" Type: " + this.GWasM1elztuh);
        sb.append(" Nullable: false");
        if (this.Yi7zF1RB1) {
            sb.append(" DefaultValue: " + this.X1lG3V04pd);
        }
        return sb.toString();
    }
}
