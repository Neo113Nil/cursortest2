package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xw implements java.util.Map.Entry, defpackage.nb0 {
    public defpackage.xw P05cfTpS5W5L;
    public defpackage.xw QiMR8OkAhezm;
    public final java.lang.Object WDYagTQQm9ns;
    public boolean e6mdH7fiFuta;
    public final defpackage.yg0 oh71FJcDz6S2;

    public xw(defpackage.vg0 vg0Var, defpackage.yg0 yg0Var) {
        this.WDYagTQQm9ns = vg0Var;
        this.oh71FJcDz6S2 = yg0Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xw) {
            defpackage.xw xwVar = (defpackage.xw) obj;
            return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, xwVar.WDYagTQQm9ns) && this.oh71FJcDz6S2 == xwVar.oh71FJcDz6S2;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.WDYagTQQm9ns;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.oh71FJcDz6S2;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Object obj = this.WDYagTQQm9ns;
        return this.oh71FJcDz6S2.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final java.lang.String toString() {
        return "Entry(key=" + this.WDYagTQQm9ns + ", value=" + this.oh71FJcDz6S2 + ")";
    }
}
