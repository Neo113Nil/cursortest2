package coil3.memory;

import coil3.Image;
import coil3.memory.RealStrongMemoryCache;
import coil3.memory.RealWeakMemoryCache;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class RealMemoryCache {
    public final Object lock = new Object();
    public final RealStrongMemoryCache strongMemoryCache;
    public final RealWeakMemoryCache weakMemoryCache;

    public RealMemoryCache(RealStrongMemoryCache realStrongMemoryCache, RealWeakMemoryCache realWeakMemoryCache) {
        this.strongMemoryCache = realStrongMemoryCache;
        this.weakMemoryCache = realWeakMemoryCache;
    }

    public final void clear() {
        synchronized (this.lock) {
            ((RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache).trimToSize(-1L);
            RealWeakMemoryCache realWeakMemoryCache = this.weakMemoryCache;
            realWeakMemoryCache.operationsSinceCleanUp = 0;
            realWeakMemoryCache.cache.clear();
        }
    }

    public final MemoryCache$Value get(MemoryCache$Key memoryCache$Key) {
        MemoryCache$Value memoryCache$Value;
        MemoryCache$Value memoryCache$Value2;
        synchronized (this.lock) {
            try {
                RealStrongMemoryCache.InternalValue internalValue = (RealStrongMemoryCache.InternalValue) ((LinkedHashMap) ((RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache).map).get(memoryCache$Key);
                memoryCache$Value = internalValue != null ? new MemoryCache$Value(internalValue.image, internalValue.extras) : null;
                if (memoryCache$Value == null) {
                    RealWeakMemoryCache realWeakMemoryCache = this.weakMemoryCache;
                    ArrayList arrayList = (ArrayList) realWeakMemoryCache.cache.get(memoryCache$Key);
                    if (arrayList == null) {
                        memoryCache$Value = null;
                    } else {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                memoryCache$Value2 = null;
                                break;
                            }
                            RealWeakMemoryCache.InternalValue internalValue2 = (RealWeakMemoryCache.InternalValue) arrayList.get(i);
                            Image image = (Image) internalValue2.image.get();
                            memoryCache$Value2 = image != null ? new MemoryCache$Value(image, internalValue2.extras) : null;
                            if (memoryCache$Value2 != null) {
                                break;
                            }
                            i++;
                        }
                        realWeakMemoryCache.cleanUpIfNecessary();
                        memoryCache$Value = memoryCache$Value2;
                    }
                }
                if (memoryCache$Value != null && !memoryCache$Value.image.getShareable()) {
                    synchronized (this.lock) {
                        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache;
                        Object remove = ((LinkedHashMap) realStrongMemoryCache$cache$1.map).remove(memoryCache$Key);
                        if (remove != null) {
                            realStrongMemoryCache$cache$1.size = realStrongMemoryCache$cache$1.getSize() - realStrongMemoryCache$cache$1.safeSizeOf(memoryCache$Key, remove);
                            realStrongMemoryCache$cache$1.entryRemoved(memoryCache$Key, remove, null);
                        }
                        if (remove != null) {
                        }
                        if (this.weakMemoryCache.cache.remove(memoryCache$Key) != null) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return memoryCache$Value;
    }

    public final long getInitialMaxSize() {
        long j;
        synchronized (this.lock) {
            j = this.strongMemoryCache.initialMaxSize;
        }
        return j;
    }

    public final long getSize() {
        long size;
        synchronized (this.lock) {
            size = ((RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache).getSize();
        }
        return size;
    }

    public final void setMaxSize(long j) {
        synchronized (this.lock) {
            RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = (RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache;
            realStrongMemoryCache$cache$1.maxSize = j;
            realStrongMemoryCache$cache$1.trimToSize(j);
        }
    }

    public final void trimToSize(long j) {
        synchronized (this.lock) {
            ((RealStrongMemoryCache$cache$1) this.strongMemoryCache.cache).trimToSize(j);
        }
    }
}
