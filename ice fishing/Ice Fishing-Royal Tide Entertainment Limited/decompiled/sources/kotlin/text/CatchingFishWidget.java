package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class CatchingFishWidget implements Map, CatchingFishCardViewFAB {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            if (CatchingFishFirebaseDagger.CatchingFishOkHttp(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new CatchingFishMVVMLiveData((CatchingFishLayoutViewAdMob) this, 0);
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
        if (((CatchingFishLayoutViewAdMob) this).CatchingFishDaggerWebsocket != map.size()) {
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
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((CatchingFishLayoutViewAdMob) this).CatchingFishDaggerWebsocket == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new CatchingFishMVVMLiveData((CatchingFishLayoutViewAdMob) this, 1);
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
        return ((CatchingFishLayoutViewAdMob) this).CatchingFishDaggerWebsocket;
    }

    public final String toString() {
        return CatchingFishCameraXCameraX.CatchingFishMVVMAppCompat(entrySet(), ", ", "{", "}", new CatchingFishFragmentFactory(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new CatchingFishAdMobCameraX((CatchingFishLayoutViewAdMob) this);
    }
}
