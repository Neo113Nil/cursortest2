package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n0 {
    public final Context GWasM1elztuh;
    public final long X1lG3V04pd;
    public final el Yi7zF1RB1;
    public final nn0 xqGvceK5x;

    public n0(Context context, el elVar, long j, nn0 nn0Var) {
        this.GWasM1elztuh = context;
        this.Yi7zF1RB1 = elVar;
        this.X1lG3V04pd = j;
        this.xqGvceK5x = nn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        n0 n0Var = (n0) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, n0Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, n0Var.Yi7zF1RB1) && yb.X1lG3V04pd(this.X1lG3V04pd, n0Var.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, n0Var.xqGvceK5x);
    }

    public final int hashCode() {
        int hashCode = (this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31;
        int i = yb.encWxUiV2;
        return this.xqGvceK5x.hashCode() + mr0.X1lG3V04pd(hashCode, 31, this.X1lG3V04pd);
    }
}
