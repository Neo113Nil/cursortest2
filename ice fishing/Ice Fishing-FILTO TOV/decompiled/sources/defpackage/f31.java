package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f31 implements Map.Entry, Comparable {
    public final /* synthetic */ e31 AvO7iQsrTN;
    public Object EljAMC1QTz;
    public final Comparable OOA6hdeuvCS;

    public f31(e31 e31Var, Comparable comparable, Object obj) {
        this.AvO7iQsrTN = e31Var;
        this.OOA6hdeuvCS = comparable;
        this.EljAMC1QTz = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OOA6hdeuvCS.compareTo(((f31) obj).OOA6hdeuvCS);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.OOA6hdeuvCS;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.EljAMC1QTz;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
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
        Comparable comparable = this.OOA6hdeuvCS;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.EljAMC1QTz;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.AvO7iQsrTN.Yi7zF1RB1();
        Object obj2 = this.EljAMC1QTz;
        this.EljAMC1QTz = obj;
        return obj2;
    }

    public final String toString() {
        return this.OOA6hdeuvCS + "=" + this.EljAMC1QTz;
    }
}
