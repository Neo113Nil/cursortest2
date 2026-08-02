package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public class LruCache {
    public int hitCount;
    public final Lock lock;
    public final LruHashMap map;
    public int maxSize;
    public int missCount;
    public int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
            throw null;
        }
        this.map = new LruHashMap(0);
        this.lock = new Lock(0);
    }

    public Object create(Object obj) {
        obj.getClass();
        return null;
    }

    public final Object get(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.lock) {
            LruHashMap lruHashMap = this.map;
            lruHashMap.getClass();
            Object obj2 = lruHashMap.map.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object create = create(obj);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    LruHashMap lruHashMap2 = this.map;
                    lruHashMap2.getClass();
                    put = lruHashMap2.map.put(obj, create);
                    if (put != null) {
                        LruHashMap lruHashMap3 = this.map;
                        lruHashMap3.getClass();
                        lruHashMap3.map.put(obj, put);
                    } else {
                        this.size++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.lock) {
            this.size++;
            LruHashMap lruHashMap = this.map;
            lruHashMap.getClass();
            put = lruHashMap.map.put(obj, obj2);
            if (put != null) {
                this.size--;
            }
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final Object remove(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.lock) {
            LruHashMap lruHashMap = this.map;
            lruHashMap.getClass();
            remove = lruHashMap.map.remove(obj);
            if (remove != null) {
                this.size--;
            }
        }
        return remove;
    }

    public final String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void trimToSize(int i) {
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i || this.map.map.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.map.map.entrySet();
                    entrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(entrySet);
                    if (entry == null) {
                        return;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    LruHashMap lruHashMap = this.map;
                    lruHashMap.getClass();
                    key.getClass();
                    lruHashMap.map.remove(key);
                    int i2 = this.size;
                    value.getClass();
                    this.size = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
