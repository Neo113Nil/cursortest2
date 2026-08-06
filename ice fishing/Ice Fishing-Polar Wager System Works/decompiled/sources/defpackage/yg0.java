package defpackage;

/* loaded from: classes.dex */
public class yg0 implements java.util.Map.Entry, defpackage.g90 {
    public final java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.Object xiZrDbcSW0;

    public /* synthetic */ yg0(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                java.util.Map.Entry entry = obj instanceof java.util.Map.Entry ? (java.util.Map.Entry) obj : null;
                return entry != null && defpackage.x70.QoRHpC4k(entry.getKey(), this.xiZrDbcSW0) && defpackage.x70.QoRHpC4k(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        switch (this.adDC3e2L) {
        }
        return this.xiZrDbcSW0;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        switch (this.adDC3e2L) {
        }
        return this.AARZUJiTa;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.adDC3e2L) {
            case 0:
                java.lang.Object obj = this.xiZrDbcSW0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                java.lang.Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.xiZrDbcSW0);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
