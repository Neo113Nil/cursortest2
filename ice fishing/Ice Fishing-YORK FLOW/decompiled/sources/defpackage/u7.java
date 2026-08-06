package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u7 implements java.util.Iterator, java.util.Map.Entry {
    public final /* synthetic */ defpackage.w7 P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public int oh71FJcDz6S2 = -1;

    public u7(defpackage.w7 w7Var) {
        this.P05cfTpS5W5L = w7Var;
        this.WDYagTQQm9ns = w7Var.QiMR8OkAhezm - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.QiMR8OkAhezm) {
            defpackage.h7.P05cfTpS5W5L("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            int i = this.oh71FJcDz6S2;
            defpackage.w7 w7Var = this.P05cfTpS5W5L;
            if (defpackage.ma0.QiMR8OkAhezm(key, w7Var.WDYagTQQm9ns(i)) && defpackage.ma0.QiMR8OkAhezm(entry.getValue(), w7Var.P05cfTpS5W5L(this.oh71FJcDz6S2))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.QiMR8OkAhezm) {
            return this.P05cfTpS5W5L.WDYagTQQm9ns(this.oh71FJcDz6S2);
        }
        defpackage.h7.P05cfTpS5W5L("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.QiMR8OkAhezm) {
            return this.P05cfTpS5W5L.P05cfTpS5W5L(this.oh71FJcDz6S2);
        }
        defpackage.h7.P05cfTpS5W5L("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.oh71FJcDz6S2 < this.WDYagTQQm9ns;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.QiMR8OkAhezm) {
            defpackage.h7.P05cfTpS5W5L("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.oh71FJcDz6S2;
        defpackage.w7 w7Var = this.P05cfTpS5W5L;
        java.lang.Object WDYagTQQm9ns = w7Var.WDYagTQQm9ns(i);
        java.lang.Object P05cfTpS5W5L = w7Var.P05cfTpS5W5L(this.oh71FJcDz6S2);
        return (WDYagTQQm9ns == null ? 0 : WDYagTQQm9ns.hashCode()) ^ (P05cfTpS5W5L != null ? P05cfTpS5W5L.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        this.oh71FJcDz6S2++;
        this.QiMR8OkAhezm = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.QiMR8OkAhezm) {
            throw new java.lang.IllegalStateException();
        }
        this.P05cfTpS5W5L.oh71FJcDz6S2(this.oh71FJcDz6S2);
        this.oh71FJcDz6S2--;
        this.WDYagTQQm9ns--;
        this.QiMR8OkAhezm = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.QiMR8OkAhezm) {
            return this.P05cfTpS5W5L.QiMR8OkAhezm(this.oh71FJcDz6S2, obj);
        }
        defpackage.h7.P05cfTpS5W5L("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
