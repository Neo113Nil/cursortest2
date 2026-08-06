package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n6 {
    public final rs0 GWasM1elztuh;
    public final ArrayList OOA6hdeuvCS;
    public final lv X1lG3V04pd;
    public final va Yi7zF1RB1;
    public final z40 xqGvceK5x;

    public n6(rs0 rs0Var, va vaVar, lv lvVar, z40 z40Var) {
        rs0Var.getClass();
        this.GWasM1elztuh = rs0Var;
        this.Yi7zF1RB1 = vaVar;
        this.X1lG3V04pd = lvVar;
        this.xqGvceK5x = z40Var;
        this.OOA6hdeuvCS = new ArrayList(xp.OOA6hdeuvCS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        n6 n6Var = (n6) obj;
        return this.Yi7zF1RB1.equals(n6Var.Yi7zF1RB1) && o30.rQPn8YBR(this.GWasM1elztuh, n6Var.GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() + (this.Yi7zF1RB1.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.xqGvceK5x);
        sb.append(": '");
        sb.append(p40.GWasM1elztuh(this.Yi7zF1RB1));
        sb.append('\'');
        a61 a61Var = rx0.mOu10nynGul;
        rs0 rs0Var = this.GWasM1elztuh;
        if (!o30.rQPn8YBR(rs0Var, a61Var)) {
            sb.append(",scope:");
            sb.append(rs0Var);
        }
        ArrayList arrayList = this.OOA6hdeuvCS;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            rb.UjhVk5crk(arrayList, sb, ",", new bCsSzSHkbaQ(8), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
