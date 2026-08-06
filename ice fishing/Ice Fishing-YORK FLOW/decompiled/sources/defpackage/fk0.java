package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class fk0 implements java.util.Map.Entry, defpackage.nb0 {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ fk0(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
                return entry != null && defpackage.ma0.QiMR8OkAhezm(entry.getKey(), this.oh71FJcDz6S2) && defpackage.ma0.QiMR8OkAhezm(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.oh71FJcDz6S2;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        switch (this.WDYagTQQm9ns) {
        }
        return this.QiMR8OkAhezm;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                java.lang.Object obj = this.oh71FJcDz6S2;
                int hashCode = obj != null ? obj.hashCode() : 0;
                java.lang.Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        switch (this.WDYagTQQm9ns) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.oh71FJcDz6S2);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
