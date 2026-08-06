package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class lc0 implements Map.Entry, q40 {
    public final Object AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ lc0(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && o30.rQPn8YBR(entry.getKey(), this.EljAMC1QTz) && o30.rQPn8YBR(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.EljAMC1QTz;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.OOA6hdeuvCS) {
        }
        return this.AvO7iQsrTN;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                Object obj = this.EljAMC1QTz;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.EljAMC1QTz);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
