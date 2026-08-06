package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ak0 implements java.util.Map.Entry, defpackage.nb0 {
    public final int QiMR8OkAhezm;
    public final defpackage.ck0 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public ak0(defpackage.ck0 ck0Var, int i) {
        ck0Var.getClass();
        this.WDYagTQQm9ns = ck0Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = ck0Var.fNwYGHIYeJcR;
    }

    public final void ZpBGe2uQfcn8() {
        if (this.WDYagTQQm9ns.fNwYGHIYeJcR != this.QiMR8OkAhezm) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return defpackage.ma0.QiMR8OkAhezm(entry.getKey(), getKey()) && defpackage.ma0.QiMR8OkAhezm(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        ZpBGe2uQfcn8();
        return this.WDYagTQQm9ns.WDYagTQQm9ns[this.oh71FJcDz6S2];
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        ZpBGe2uQfcn8();
        java.lang.Object[] objArr = this.WDYagTQQm9ns.oh71FJcDz6S2;
        objArr.getClass();
        return objArr[this.oh71FJcDz6S2];
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
        ZpBGe2uQfcn8();
        defpackage.ck0 ck0Var = this.WDYagTQQm9ns;
        ck0Var.fWTAfUmVKrZq();
        java.lang.Object[] objArr = ck0Var.oh71FJcDz6S2;
        if (objArr == null) {
            int length = ck0Var.WDYagTQQm9ns.length;
            if (length < 0) {
                defpackage.h7.w7APNrr0aGRc("capacity must be non-negative.");
                return null;
            }
            objArr = new java.lang.Object[length];
            ck0Var.oh71FJcDz6S2 = objArr;
        }
        int i = this.oh71FJcDz6S2;
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
