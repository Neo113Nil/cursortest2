package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class dp0 implements Map, q40 {
    public static final dp0 AvO7iQsrTN = new dp0(za1.OOA6hdeuvCS, 0);
    public final int EljAMC1QTz;
    public final za1 OOA6hdeuvCS;

    public dp0(za1 za1Var, int i) {
        this.OOA6hdeuvCS = za1Var;
        this.EljAMC1QTz = i;
    }

    public final dp0 GWasM1elztuh(Object obj, ra0 ra0Var) {
        qu Y6hRI1cF8 = this.OOA6hdeuvCS.Y6hRI1cF8(obj != null ? obj.hashCode() : 0, 0, obj, ra0Var);
        return Y6hRI1cF8 == null ? this : new dp0((za1) Y6hRI1cF8.Yi7zF1RB1, this.EljAMC1QTz + Y6hRI1cF8.GWasM1elztuh);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.OOA6hdeuvCS.xqGvceK5x(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (o30.rQPn8YBR(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new kp0(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.EljAMC1QTz != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (o30.rQPn8YBR(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.OOA6hdeuvCS.AvO7iQsrTN(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.EljAMC1QTz == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new kp0(this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.EljAMC1QTz;
    }

    public final String toString() {
        return rb.WkXHDbKiD(entrySet(), ", ", "{", "}", new E7jCp8Ls(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new tc0(1, this);
    }
}
