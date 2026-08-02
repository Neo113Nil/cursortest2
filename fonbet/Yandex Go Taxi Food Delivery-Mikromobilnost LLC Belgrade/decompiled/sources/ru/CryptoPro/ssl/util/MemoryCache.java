package ru.CryptoPro.ssl.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import ru.CryptoPro.ssl.util.Cache;

/* loaded from: classes4.dex */
class MemoryCache extends Cache {
    public final LinkedHashMap a;
    public int b;
    public long c;
    public final ReferenceQueue d;

    public interface CacheEntry {
        Object getKey();

        Object getValue();

        void invalidate();

        boolean isValid(long j);
    }

    public static class HardCacheEntry implements CacheEntry {
        public Object a;
        public Object b;
        public long c;

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public Object getKey() {
            return this.a;
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public Object getValue() {
            return this.b;
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public void invalidate() {
            this.a = null;
            this.b = null;
            this.c = -1L;
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public boolean isValid(long j) {
            boolean z = j <= this.c;
            if (!z) {
                invalidate();
            }
            return z;
        }
    }

    public static class SoftCacheEntry extends SoftReference implements CacheEntry {
        public Object a;
        public long b;

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public Object getKey() {
            return this.a;
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public Object getValue() {
            return get();
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public void invalidate() {
            clear();
            this.a = null;
            this.b = -1L;
        }

        @Override // ru.CryptoPro.ssl.util.MemoryCache.CacheEntry
        public boolean isValid(long j) {
            boolean z = j <= this.b && get() != 0;
            if (!z) {
                invalidate();
            }
            return z;
        }
    }

    public MemoryCache(boolean z, int i, int i2) {
        this.b = i;
        this.c = i2 * 1000;
        this.d = z ? new ReferenceQueue() : null;
        this.a = new LinkedHashMap(((int) (i / 0.75f)) + 1, 0.75f, true);
    }

    public final void a() {
        CacheEntry cacheEntry;
        ReferenceQueue referenceQueue = this.d;
        if (referenceQueue == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        linkedHashMap.size();
        while (true) {
            CacheEntry cacheEntry2 = (CacheEntry) referenceQueue.poll();
            if (cacheEntry2 == null) {
                return;
            }
            Object key = cacheEntry2.getKey();
            if (key != null && (cacheEntry = (CacheEntry) linkedHashMap.remove(key)) != null && cacheEntry2 != cacheEntry) {
                linkedHashMap.put(key, cacheEntry);
            }
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void accept(Cache.CacheVisitor cacheVisitor) {
        b();
        LinkedHashMap linkedHashMap = this.a;
        HashMap hashMap = new HashMap(linkedHashMap.size());
        for (CacheEntry cacheEntry : linkedHashMap.values()) {
            hashMap.put(cacheEntry.getKey(), cacheEntry.getValue());
        }
        cacheVisitor.visit(hashMap);
    }

    public final void b() {
        a();
        if (this.c == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            if (!((CacheEntry) it.next()).isValid(currentTimeMillis)) {
                it.remove();
            }
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void clear() {
        try {
            if (this.d != null) {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((CacheEntry) it.next()).invalidate();
                }
                while (this.d.poll() != null) {
                }
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized Object get(Object obj) {
        a();
        CacheEntry cacheEntry = (CacheEntry) this.a.get(obj);
        if (cacheEntry == null) {
            return null;
        }
        long j = 0;
        if (this.c != 0) {
            j = System.currentTimeMillis();
        }
        if (cacheEntry.isValid(j)) {
            return cacheEntry.getValue();
        }
        this.a.remove(obj);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void put(Object obj, Object obj2) {
        HardCacheEntry hardCacheEntry;
        a();
        long j = 0;
        if (this.c != 0) {
            j = this.c + System.currentTimeMillis();
        }
        ReferenceQueue referenceQueue = this.d;
        if (referenceQueue != null) {
            SoftCacheEntry softCacheEntry = new SoftCacheEntry(obj2, referenceQueue);
            softCacheEntry.a = obj;
            softCacheEntry.b = j;
            hardCacheEntry = softCacheEntry;
        } else {
            HardCacheEntry hardCacheEntry2 = new HardCacheEntry();
            hardCacheEntry2.a = obj;
            hardCacheEntry2.b = obj2;
            hardCacheEntry2.c = j;
            hardCacheEntry = hardCacheEntry2;
        }
        CacheEntry cacheEntry = (CacheEntry) this.a.put(obj, hardCacheEntry);
        if (cacheEntry != null) {
            cacheEntry.invalidate();
            return;
        }
        if (this.b > 0 && this.a.size() > this.b) {
            b();
            if (this.a.size() > this.b) {
                Iterator it = this.a.values().iterator();
                CacheEntry cacheEntry2 = (CacheEntry) it.next();
                it.remove();
                cacheEntry2.invalidate();
            }
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void remove(Object obj) {
        a();
        CacheEntry cacheEntry = (CacheEntry) this.a.remove(obj);
        if (cacheEntry != null) {
            cacheEntry.invalidate();
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void setCapacity(int i) {
        try {
            b();
            if (i > 0 && this.a.size() > i) {
                Iterator it = this.a.values().iterator();
                for (int size = this.a.size() - i; size > 0; size--) {
                    CacheEntry cacheEntry = (CacheEntry) it.next();
                    it.remove();
                    cacheEntry.invalidate();
                }
            }
            if (i <= 0) {
                i = 0;
            }
            this.b = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized void setTimeout(int i) {
        a();
        this.c = i > 0 ? i * 1000 : 0L;
    }

    @Override // ru.CryptoPro.ssl.util.Cache
    public synchronized int size() {
        b();
        return this.a.size();
    }

    public MemoryCache(boolean z, int i) {
        this(z, i, 0);
    }
}
