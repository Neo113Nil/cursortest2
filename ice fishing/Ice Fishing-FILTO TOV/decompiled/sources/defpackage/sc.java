package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sc {
    public final Object GWasM1elztuh;
    public final Throwable OOA6hdeuvCS;
    public final mv X1lG3V04pd;
    public final j9 Yi7zF1RB1;
    public final Object xqGvceK5x;

    public /* synthetic */ sc(Object obj, j9 j9Var, mv mvVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : j9Var, (i & 4) != 0 ? null : mvVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static sc GWasM1elztuh(sc scVar, j9 j9Var, Throwable th, int i) {
        Object obj = scVar.GWasM1elztuh;
        if ((i & 2) != 0) {
            j9Var = scVar.Yi7zF1RB1;
        }
        j9 j9Var2 = j9Var;
        mv mvVar = scVar.X1lG3V04pd;
        Object obj2 = scVar.xqGvceK5x;
        if ((i & 16) != 0) {
            th = scVar.OOA6hdeuvCS;
        }
        return new sc(obj, j9Var2, mvVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, scVar.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, scVar.Yi7zF1RB1) && o30.rQPn8YBR(this.X1lG3V04pd, scVar.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, scVar.xqGvceK5x) && o30.rQPn8YBR(this.OOA6hdeuvCS, scVar.OOA6hdeuvCS);
    }

    public final int hashCode() {
        Object obj = this.GWasM1elztuh;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j9 j9Var = this.Yi7zF1RB1;
        int hashCode2 = (hashCode + (j9Var == null ? 0 : j9Var.hashCode())) * 31;
        mv mvVar = this.X1lG3V04pd;
        int hashCode3 = (hashCode2 + (mvVar == null ? 0 : mvVar.hashCode())) * 31;
        Object obj2 = this.xqGvceK5x;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.OOA6hdeuvCS;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.GWasM1elztuh + ", cancelHandler=" + this.Yi7zF1RB1 + ", onCancellation=" + this.X1lG3V04pd + ", idempotentResume=" + this.xqGvceK5x + ", cancelCause=" + this.OOA6hdeuvCS + ')';
    }

    public sc(Object obj, j9 j9Var, mv mvVar, Object obj2, Throwable th) {
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = j9Var;
        this.X1lG3V04pd = mvVar;
        this.xqGvceK5x = obj2;
        this.OOA6hdeuvCS = th;
    }
}
