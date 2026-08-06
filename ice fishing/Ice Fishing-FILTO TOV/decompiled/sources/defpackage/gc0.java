package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gc0 implements Map.Entry, q40 {
    public final int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final ic0 OOA6hdeuvCS;

    public gc0(ic0 ic0Var, int i) {
        ic0Var.getClass();
        this.OOA6hdeuvCS = ic0Var;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = ic0Var.E7jCp8Ls;
    }

    public final void GWasM1elztuh() {
        if (this.OOA6hdeuvCS.E7jCp8Ls != this.AvO7iQsrTN) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return o30.rQPn8YBR(entry.getKey(), getKey()) && o30.rQPn8YBR(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        GWasM1elztuh();
        return this.OOA6hdeuvCS.OOA6hdeuvCS[this.EljAMC1QTz];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        GWasM1elztuh();
        Object[] objArr = this.OOA6hdeuvCS.EljAMC1QTz;
        objArr.getClass();
        return objArr[this.EljAMC1QTz];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        GWasM1elztuh();
        ic0 ic0Var = this.OOA6hdeuvCS;
        ic0Var.Yi7zF1RB1();
        Object[] objArr = ic0Var.EljAMC1QTz;
        if (objArr == null) {
            int length = ic0Var.OOA6hdeuvCS.length;
            if (length < 0) {
                o4.mE4lRynR("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            ic0Var.EljAMC1QTz = objArr;
        }
        int i = this.EljAMC1QTz;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
