package i5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import pc.j;
import qc.e;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements Map, e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap f3195g = new ConcurrentHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f3195g.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f3195g.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f3195g.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set entrySet = this.f3195g.entrySet();
        j.d(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f3195g.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3195g.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set keySet = this.f3195g.keySet();
        j.d(keySet, "<get-keys>(...)");
        return keySet;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f3195g.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j.e(map, "from");
        this.f3195g.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f3195g.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3195g.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection values = this.f3195g.values();
        j.d(values, "<get-values>(...)");
        return values;
    }
}
