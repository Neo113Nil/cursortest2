package defpackage;

/* loaded from: classes.dex */
public final class la1 implements java.util.Map.Entry, java.lang.Comparable {
    public final /* synthetic */ defpackage.ka1 AARZUJiTa;
    public final java.lang.Comparable adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public la1(defpackage.ka1 ka1Var, java.lang.Comparable comparable, java.lang.Object obj) {
        this.AARZUJiTa = ka1Var;
        this.adDC3e2L = comparable;
        this.xiZrDbcSW0 = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.adDC3e2L.compareTo(((defpackage.la1) obj).adDC3e2L);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof java.util.Map.Entry) {
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                java.lang.Comparable comparable = this.adDC3e2L;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    java.lang.Object obj2 = this.xiZrDbcSW0;
                    java.lang.Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.adDC3e2L;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.xiZrDbcSW0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.adDC3e2L;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        java.lang.Object obj = this.xiZrDbcSW0;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        this.AARZUJiTa.oh6vYeIP();
        java.lang.Object obj2 = this.xiZrDbcSW0;
        this.xiZrDbcSW0 = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        return this.adDC3e2L + "=" + this.xiZrDbcSW0;
    }
}
