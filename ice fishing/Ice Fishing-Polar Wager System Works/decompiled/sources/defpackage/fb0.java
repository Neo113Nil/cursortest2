package defpackage;

/* loaded from: classes.dex */
public final class fb0 implements java.util.Map {
    public final java.util.Map adDC3e2L;

    public fb0(java.util.Map map) {
        this.adDC3e2L = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Class) {
            return this.adDC3e2L.containsKey(((java.lang.Class) obj).getName());
        }
        defpackage.db.fnWB2E7cs("Key must be a class");
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.adDC3e2L.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Class) {
            return this.adDC3e2L.get(((java.lang.Class) obj).getName());
        }
        defpackage.db.fnWB2E7cs("Key must be a class");
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.adDC3e2L.size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.adDC3e2L.values();
    }
}
