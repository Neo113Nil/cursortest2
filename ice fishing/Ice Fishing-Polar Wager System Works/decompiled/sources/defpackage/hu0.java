package defpackage;

/* loaded from: classes.dex */
public class hu0 implements java.util.Map, defpackage.g90 {
    public static final defpackage.hu0 AARZUJiTa = new defpackage.hu0(defpackage.yi1.adDC3e2L, 0);
    public final defpackage.yi1 adDC3e2L;
    public final int xiZrDbcSW0;

    public hu0(defpackage.yi1 yi1Var, int i) {
        this.adDC3e2L = yi1Var;
        this.xiZrDbcSW0 = i;
    }

    public final defpackage.hu0 IHQe1A4L2xu(java.lang.Object obj, defpackage.re0 re0Var) {
        defpackage.fz kNAkVymC = this.adDC3e2L.kNAkVymC(obj != null ? obj.hashCode() : 0, 0, obj, re0Var);
        return kNAkVymC == null ? this : new defpackage.hu0((defpackage.yi1) kNAkVymC.oh6vYeIP, this.xiZrDbcSW0 + kNAkVymC.IHQe1A4L2xu);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.adDC3e2L.F7NU4MC0GW(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (defpackage.x70.QoRHpC4k(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.ou0(this, 0);
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
        if (this.xiZrDbcSW0 != map.size()) {
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
                if (defpackage.x70.QoRHpC4k(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.adDC3e2L.AARZUJiTa(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.xiZrDbcSW0 == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return new defpackage.ou0(this, 1);
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
        return this.xiZrDbcSW0;
    }

    public final java.lang.String toString() {
        return defpackage.td.cSNyPqwud(entrySet(), ", ", "{", "}", new defpackage.DFo87pBq1E5(1, this), 24);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return new defpackage.ai0(1, this);
    }
}
