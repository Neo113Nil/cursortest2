package defpackage;

/* loaded from: classes.dex */
public final class pg0 implements java.util.Map.Entry, defpackage.g90 {
    public final int AARZUJiTa;
    public final defpackage.rg0 adDC3e2L;
    public final int xiZrDbcSW0;

    public pg0(defpackage.rg0 rg0Var, int i) {
        rg0Var.getClass();
        this.adDC3e2L = rg0Var;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = rg0Var.JlrlGoKF;
    }

    public final void IHQe1A4L2xu() {
        if (this.adDC3e2L.JlrlGoKF != this.AARZUJiTa) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return defpackage.x70.QoRHpC4k(entry.getKey(), getKey()) && defpackage.x70.QoRHpC4k(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        IHQe1A4L2xu();
        return this.adDC3e2L.adDC3e2L[this.xiZrDbcSW0];
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        IHQe1A4L2xu();
        java.lang.Object[] objArr = this.adDC3e2L.xiZrDbcSW0;
        objArr.getClass();
        return objArr[this.xiZrDbcSW0];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        IHQe1A4L2xu();
        defpackage.rg0 rg0Var = this.adDC3e2L;
        rg0Var.r1MBDhnF();
        java.lang.Object[] objArr = rg0Var.xiZrDbcSW0;
        if (objArr == null) {
            int length = rg0Var.adDC3e2L.length;
            if (length < 0) {
                defpackage.db.fnWB2E7cs("capacity must be non-negative.");
                return null;
            }
            objArr = new java.lang.Object[length];
            rg0Var.xiZrDbcSW0 = objArr;
        }
        int i = this.xiZrDbcSW0;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
