package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rn0 implements Serializable {
    public final Object EljAMC1QTz;
    public final Object OOA6hdeuvCS;

    public rn0(Object obj, Object obj2) {
        this.OOA6hdeuvCS = obj;
        this.EljAMC1QTz = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn0)) {
            return false;
        }
        rn0 rn0Var = (rn0) obj;
        return o30.rQPn8YBR(this.OOA6hdeuvCS, rn0Var.OOA6hdeuvCS) && o30.rQPn8YBR(this.EljAMC1QTz, rn0Var.EljAMC1QTz);
    }

    public final int hashCode() {
        Object obj = this.OOA6hdeuvCS;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.EljAMC1QTz;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.OOA6hdeuvCS + ", " + this.EljAMC1QTz + ')';
    }
}
