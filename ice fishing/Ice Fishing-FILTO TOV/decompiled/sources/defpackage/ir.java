package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ir implements Map.Entry, q40 {
    public ir AvO7iQsrTN;
    public final v90 EljAMC1QTz;
    public final Object OOA6hdeuvCS;
    public ir encWxUiV2;
    public boolean mOu10nynGul;

    public ir(s90 s90Var, v90 v90Var) {
        this.OOA6hdeuvCS = s90Var;
        this.EljAMC1QTz = v90Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ir) {
            ir irVar = (ir) obj;
            return o30.rQPn8YBR(this.OOA6hdeuvCS, irVar.OOA6hdeuvCS) && this.EljAMC1QTz == irVar.EljAMC1QTz;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.OOA6hdeuvCS;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.EljAMC1QTz;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.OOA6hdeuvCS;
        return this.EljAMC1QTz.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.OOA6hdeuvCS + ", value=" + this.EljAMC1QTz + ")";
    }
}
