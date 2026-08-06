package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ik0 implements java.util.Map, defpackage.nb0 {
    public defpackage.sh1 P05cfTpS5W5L;
    public defpackage.qv QiMR8OkAhezm;
    public final defpackage.yn0 WDYagTQQm9ns;
    public defpackage.qv oh71FJcDz6S2;

    public ik0(defpackage.yn0 yn0Var) {
        yn0Var.getClass();
        this.WDYagTQQm9ns = yn0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.WDYagTQQm9ns.fWTAfUmVKrZq(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.qv qvVar = this.oh71FJcDz6S2;
        if (qvVar != null) {
            return qvVar;
        }
        defpackage.qv qvVar2 = new defpackage.qv(this.WDYagTQQm9ns, 0);
        this.oh71FJcDz6S2 = qvVar2;
        return qvVar2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.ik0.class != obj.getClass()) {
            return false;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, ((defpackage.ik0) obj).WDYagTQQm9ns);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.WDYagTQQm9ns.QiMR8OkAhezm(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.e6mdH7fiFuta();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.qv qvVar = this.QiMR8OkAhezm;
        if (qvVar != null) {
            return qvVar;
        }
        defpackage.qv qvVar2 = new defpackage.qv(this.WDYagTQQm9ns, 1);
        this.QiMR8OkAhezm = qvVar2;
        return qvVar2;
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.WDYagTQQm9ns.WDYagTQQm9ns;
    }

    public final java.lang.String toString() {
        return this.WDYagTQQm9ns.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.sh1 sh1Var = this.P05cfTpS5W5L;
        if (sh1Var != null) {
            return sh1Var;
        }
        defpackage.sh1 sh1Var2 = new defpackage.sh1(this.WDYagTQQm9ns);
        this.P05cfTpS5W5L = sh1Var2;
        return sh1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
