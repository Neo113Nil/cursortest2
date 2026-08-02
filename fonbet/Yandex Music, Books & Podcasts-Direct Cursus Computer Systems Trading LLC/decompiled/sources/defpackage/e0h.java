package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class e0h {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final nqg lock;

    @NotNull
    private final f0h map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public e0h(int i) {
        this.maxSize = i;
        if (i <= 0) {
            xq0.x("maxSize <= 0");
            throw null;
        }
        this.map = new f0h();
        this.lock = new nqg();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public Object create(@NotNull Object obj) {
        obj.getClass();
        return null;
    }

    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        obj2.getClass();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final Object get(@NotNull Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.lock) {
            f0h f0hVar = this.map;
            f0hVar.getClass();
            Object obj2 = f0hVar.a.get(obj);
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
                    this.createCount++;
                    f0h f0hVar2 = this.map;
                    f0hVar2.getClass();
                    put = f0hVar2.a.put(obj, create);
                    if (put != null) {
                        f0h f0hVar3 = this.map;
                        f0hVar3.getClass();
                        f0hVar3.a.put(obj, put);
                    } else {
                        this.size += a(obj, create);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, obj, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(@NotNull Object obj, @NotNull Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            f0h f0hVar = this.map;
            f0hVar.getClass();
            put = f0hVar.a.put(obj, obj2);
            if (put != null) {
                this.size -= a(obj, put);
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final Object remove(@NotNull Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.lock) {
            f0h f0hVar = this.map;
            f0hVar.getClass();
            remove = f0hVar.a.remove(obj);
            if (remove != null) {
                this.size -= a(obj, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, null);
        }
        return remove;
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(@NotNull Object obj, @NotNull Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    @NotNull
    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set entrySet = this.map.a.entrySet();
            entrySet.getClass();
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = this.map.a.entrySet();
            entrySet2.getClass();
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i || this.map.a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.map.a.entrySet();
                    entrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.R(entrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    f0h f0hVar = this.map;
                    f0hVar.getClass();
                    key.getClass();
                    f0hVar.a.remove(key);
                    this.size -= a(key, value);
                    this.evictionCount++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
