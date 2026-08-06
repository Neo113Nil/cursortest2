package defpackage;

/* loaded from: classes.dex */
public final class xh0 implements java.util.Map, defpackage.g90 {
    public defpackage.eu AARZUJiTa;
    public defpackage.hd1 EXtogiMhuM;
    public final defpackage.nl0 adDC3e2L;
    public defpackage.eu xiZrDbcSW0;

    public xh0(defpackage.nl0 nl0Var) {
        nl0Var.getClass();
        this.adDC3e2L = nl0Var;
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
        return this.adDC3e2L.r1MBDhnF(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.adDC3e2L.F7NU4MC0GW(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        defpackage.eu euVar = this.xiZrDbcSW0;
        if (euVar != null) {
            return euVar;
        }
        defpackage.eu euVar2 = new defpackage.eu(this.adDC3e2L, 0);
        this.xiZrDbcSW0 = euVar2;
        return euVar2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.xh0.class != obj.getClass()) {
            return false;
        }
        return defpackage.x70.QoRHpC4k(this.adDC3e2L, ((defpackage.xh0) obj).adDC3e2L);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.adDC3e2L.AARZUJiTa(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.adDC3e2L.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.adDC3e2L.riuEU0zW4();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        defpackage.eu euVar = this.AARZUJiTa;
        if (euVar != null) {
            return euVar;
        }
        defpackage.eu euVar2 = new defpackage.eu(this.adDC3e2L, 1);
        this.AARZUJiTa = euVar2;
        return euVar2;
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
        return this.adDC3e2L.adDC3e2L;
    }

    public final java.lang.String toString() {
        return this.adDC3e2L.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        defpackage.hd1 hd1Var = this.EXtogiMhuM;
        if (hd1Var != null) {
            return hd1Var;
        }
        defpackage.hd1 hd1Var2 = new defpackage.hd1(this.adDC3e2L);
        this.EXtogiMhuM = hd1Var2;
        return hd1Var2;
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
