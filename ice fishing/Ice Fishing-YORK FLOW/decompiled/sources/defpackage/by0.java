package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class by0 implements java.util.Map, defpackage.nb0 {
    public static final defpackage.by0 QiMR8OkAhezm = new defpackage.by0(defpackage.vp1.WDYagTQQm9ns, 0);
    public final defpackage.vp1 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public by0(defpackage.vp1 vp1Var, int i) {
        this.WDYagTQQm9ns = vp1Var;
        this.oh71FJcDz6S2 = i;
    }

    public final defpackage.by0 ZpBGe2uQfcn8(java.lang.Object obj, defpackage.th0 th0Var) {
        defpackage.wg w7APNrr0aGRc = this.WDYagTQQm9ns.w7APNrr0aGRc(obj != null ? obj.hashCode() : 0, 0, obj, th0Var);
        return w7APNrr0aGRc == null ? this : new defpackage.by0((defpackage.vp1) w7APNrr0aGRc.giKS3J6vZuNy, this.oh71FJcDz6S2 + w7APNrr0aGRc.ZpBGe2uQfcn8);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (defpackage.ma0.QiMR8OkAhezm(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.hy0(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this.oh71FJcDz6S2 != map.size()) {
            return false;
        }
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof java.util.Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (java.util.Map.Entry entry : entrySet) {
            if (entry != null) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                java.lang.Object obj2 = get(key);
                if (defpackage.ma0.QiMR8OkAhezm(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.WDYagTQQm9ns.QiMR8OkAhezm(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.oh71FJcDz6S2 == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return new defpackage.hy0(this, 1);
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
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.oh71FJcDz6S2;
    }

    public final java.lang.String toString() {
        return defpackage.hf.m6iZQUu7XjoL(entrySet(), ", ", "{", "}", new defpackage.fNwYGHIYeJcR(1, this), 24);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return new defpackage.lk0(1, this);
    }
}
