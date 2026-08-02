package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class y8j0 implements Map, bgx {
    public final /* synthetic */ ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof b7j0)) {
            return false;
        }
        return this.a.containsKey(new b7j0(((b7j0) obj).a));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof kzz0)) {
            return false;
        }
        return this.a.containsValue(new kzz0(((kzz0) obj).a));
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof b7j0) {
            kzz0 kzz0Var = (kzz0) this.a.get(new b7j0(((b7j0) obj).a));
            String str = kzz0Var != null ? kzz0Var.a : null;
            if (str != null) {
                return new kzz0(str);
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        kzz0 kzz0Var = (kzz0) this.a.put(new b7j0(((b7j0) obj).a), new kzz0(((kzz0) obj2).a));
        String str = kzz0Var != null ? kzz0Var.a : null;
        if (str != null) {
            return new kzz0(str);
        }
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof b7j0) {
            kzz0 kzz0Var = (kzz0) this.a.remove(new b7j0(((b7j0) obj).a));
            String str = kzz0Var != null ? kzz0Var.a : null;
            if (str != null) {
                return new kzz0(str);
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.a.values();
    }
}
