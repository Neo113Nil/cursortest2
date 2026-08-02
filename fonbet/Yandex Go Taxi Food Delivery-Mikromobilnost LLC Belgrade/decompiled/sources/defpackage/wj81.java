package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class wj81 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((jy71) this).a.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((jy71) this).a.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((jy71) this).a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((jy71) this).a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((jy71) this).a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((jy71) this).a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((jy71) this).a.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((jy71) this).a.size();
    }

    public final String toString() {
        return ((jy71) this).a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((jy71) this).a.values();
    }
}
