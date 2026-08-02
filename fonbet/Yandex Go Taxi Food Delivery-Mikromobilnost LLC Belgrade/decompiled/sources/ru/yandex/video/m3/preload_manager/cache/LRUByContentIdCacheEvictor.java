package ru.yandex.video.m3.preload_manager.cache;

import defpackage.b64;
import defpackage.cvu0;
import defpackage.d5z0;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.ib7;
import defpackage.jl40;
import defpackage.lc7;
import defpackage.qv10;
import defpackage.ra7;
import defpackage.u1l;
import defpackage.w610;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0004:;<=B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010)J'\u0010-\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u00101\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\f038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor;", "Lib7;", "", "storageByContentIdMaxCount", "", "storageByContentIdMaxBytes", "maxBytes", "<init>", "(IJJ)V", "Lra7;", "cache", "requiredSpace", "Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;", "storage", "Lzy11;", "evictCacheInStorage", "(Lra7;JLru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;)V", "evictStorages", "(Lra7;)V", "evictCache", "(Lra7;J)V", "Llc7;", "span", "", "shouldCreateIfNotExists", "getStorageBySpan", "(Lra7;Llc7;Z)Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;", "", "key", "isStorageByKeyExists$video_player_internalRelease", "(Ljava/lang/String;)Z", "isStorageByKeyExists", "requiresCacheSpanTouches", "()Z", "onCacheInitialized", "()V", "position", "length", "onStartFile", "(Lra7;Ljava/lang/String;JJ)V", "onSpanAdded", "(Lra7;Llc7;)V", "onSpanRemoved", "oldSpan", "newSpan", "onSpanTouched", "(Lra7;Llc7;Llc7;)V", CA20Status.STATUS_USER_I, "J", "TAG", "Ljava/lang/String;", "Ljava/util/TreeSet;", "storages", "Ljava/util/TreeSet;", "currentSize", "Lkotlin/text/Regex;", "contentIdRegex", "Lkotlin/text/Regex;", "ManifestAndInitPriorityComparator", "SpanComparator", "Storage", "StorageComparator", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LRUByContentIdCacheEvictor implements ib7 {
    public static final int $stable = 8;
    private long currentSize;
    private final long maxBytes;
    private final long storageByContentIdMaxBytes;
    private final int storageByContentIdMaxCount;
    private final String TAG = "LRUByContentIdCacheEvic";
    private TreeSet<Storage> storages = new TreeSet<>(new StorageComparator());
    private final Regex contentIdRegex = new Regex("vod-content/([^/]*)");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$ManifestAndInitPriorityComparator;", "Ljava/util/Comparator;", "Llc7;", "Lkotlin/Comparator;", "<init>", "()V", "lhs", "rhs", "", "compare", "(Llc7;Llc7;)I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ManifestAndInitPriorityComparator implements Comparator<lc7> {
        @Override // java.util.Comparator
        public int compare(lc7 lhs, lc7 rhs) {
            String str = lhs.a;
            String str2 = rhs.a;
            long j = lhs.y;
            long j2 = rhs.y;
            if (j - j2 == 0) {
                return lhs.compareTo(rhs);
            }
            if (evu0.y(str, "/manifest.mpd", false) || evu0.y(str, "/init-", false)) {
                j += 604800000;
            }
            if (evu0.y(str2, "/manifest.mpd", false) || evu0.y(str2, "/init-", false)) {
                j2 += 604800000;
            }
            return j < j2 ? -1 : 1;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$SpanComparator;", "Ljava/util/Comparator;", "Llc7;", "Lkotlin/Comparator;", "<init>", "()V", "lhs", "rhs", "", "compare", "(Llc7;Llc7;)I", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SpanComparator implements Comparator<lc7> {
        @Override // java.util.Comparator
        public int compare(lc7 lhs, lc7 rhs) {
            long j = lhs.y;
            long j2 = rhs.y;
            return j - j2 == 0 ? lhs.compareTo(rhs) : j < j2 ? -1 : 1;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;", "", "", "lastTouchTimestamp", "currentSize", "Ljava/util/TreeSet;", "Llc7;", "leastRecentlyUsed", "", "key", "<init>", "(JJLjava/util/TreeSet;Ljava/lang/String;)V", "another", "", "compareTo", "(Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;)I", "component1", "()J", "component2", "component3", "()Ljava/util/TreeSet;", "component4", "()Ljava/lang/String;", "copy", "(JJLjava/util/TreeSet;Ljava/lang/String;)Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getLastTouchTimestamp", "setLastTouchTimestamp", "(J)V", "getCurrentSize", "setCurrentSize", "Ljava/util/TreeSet;", "getLeastRecentlyUsed", "Ljava/lang/String;", "getKey", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Storage {
        private long currentSize;
        private final String key;
        private long lastTouchTimestamp;
        private final TreeSet<lc7> leastRecentlyUsed;

        public Storage(long j, long j2, TreeSet<lc7> treeSet, String str) {
            this.lastTouchTimestamp = j;
            this.currentSize = j2;
            this.leastRecentlyUsed = treeSet;
            this.key = str;
        }

        public static /* synthetic */ Storage copy$default(Storage storage, long j, long j2, TreeSet treeSet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = storage.lastTouchTimestamp;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = storage.currentSize;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                treeSet = storage.leastRecentlyUsed;
            }
            TreeSet treeSet2 = treeSet;
            if ((i & 8) != 0) {
                str = storage.key;
            }
            return storage.copy(j3, j4, treeSet2, str);
        }

        public final int compareTo(Storage another) {
            if (cvu0.t(this.key, another.key, false)) {
                return 0;
            }
            String str = this.key;
            if (str == null) {
                return -1;
            }
            String str2 = another.key;
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLastTouchTimestamp() {
            return this.lastTouchTimestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final long getCurrentSize() {
            return this.currentSize;
        }

        public final TreeSet<lc7> component3() {
            return this.leastRecentlyUsed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final Storage copy(long lastTouchTimestamp, long currentSize, TreeSet<lc7> leastRecentlyUsed, String key) {
            return new Storage(lastTouchTimestamp, currentSize, leastRecentlyUsed, key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Storage)) {
                return false;
            }
            Storage storage = (Storage) other;
            return this.lastTouchTimestamp == storage.lastTouchTimestamp && this.currentSize == storage.currentSize && jl40.l(this.leastRecentlyUsed, storage.leastRecentlyUsed) && jl40.l(this.key, storage.key);
        }

        public final long getCurrentSize() {
            return this.currentSize;
        }

        public final String getKey() {
            return this.key;
        }

        public final long getLastTouchTimestamp() {
            return this.lastTouchTimestamp;
        }

        public final TreeSet<lc7> getLeastRecentlyUsed() {
            return this.leastRecentlyUsed;
        }

        public int hashCode() {
            int hashCode = (this.leastRecentlyUsed.hashCode() + qv10.c(Long.hashCode(this.lastTouchTimestamp) * 31, 31, this.currentSize)) * 31;
            String str = this.key;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final void setCurrentSize(long j) {
            this.currentSize = j;
        }

        public final void setLastTouchTimestamp(long j) {
            this.lastTouchTimestamp = j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Storage(lastTouchTimestamp=");
            sb.append(this.lastTouchTimestamp);
            sb.append(", currentSize=");
            sb.append(this.currentSize);
            sb.append(", leastRecentlyUsed=");
            sb.append(this.leastRecentlyUsed);
            sb.append(", key=");
            return b64.p(sb, this.key, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$StorageComparator;", "Ljava/util/Comparator;", "Lru/yandex/video/m3/preload_manager/cache/LRUByContentIdCacheEvictor$Storage;", "Lkotlin/Comparator;", "()V", "compare", "", "lhs", "rhs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StorageComparator implements Comparator<Storage> {
        @Override // java.util.Comparator
        public int compare(Storage lhs, Storage rhs) {
            return lhs.getLastTouchTimestamp() - rhs.getLastTouchTimestamp() == 0 ? lhs.compareTo(rhs) : lhs.getLastTouchTimestamp() < rhs.getLastTouchTimestamp() ? -1 : 1;
        }
    }

    public LRUByContentIdCacheEvictor(int i, long j, long j2) {
        this.storageByContentIdMaxCount = i;
        this.storageByContentIdMaxBytes = j;
        this.maxBytes = j2;
    }

    private final void evictCache(ra7 cache, long requiredSpace) {
        lc7 lc7Var;
        Object obj;
        TreeSet<lc7> leastRecentlyUsed;
        while (this.currentSize + requiredSpace > this.maxBytes) {
            Iterator<T> it = this.storages.iterator();
            while (true) {
                lc7Var = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Storage) obj).getLeastRecentlyUsed().size() > 0) {
                        break;
                    }
                }
            }
            Storage storage = (Storage) obj;
            if (storage != null && (leastRecentlyUsed = storage.getLeastRecentlyUsed()) != null) {
                lc7Var = (lc7) a.Q(leastRecentlyUsed);
            }
            if (lc7Var != null) {
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t(this.TAG);
                d5z0Var.a("evictCache from storage " + storage.getKey() + " will be removed " + lc7Var.a, new Object[0]);
                cache.removeSpan(lc7Var);
            }
        }
    }

    private final void evictCacheInStorage(ra7 cache, long requiredSpace, Storage storage) {
        if (storage.getKey() == null) {
            return;
        }
        while (storage.getCurrentSize() + requiredSpace > this.storageByContentIdMaxBytes && storage.getCurrentSize() > 0) {
            lc7 lc7Var = (lc7) a.Q(storage.getLeastRecentlyUsed());
            if (lc7Var != null) {
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t(this.TAG);
                d5z0Var.a("evictCacheInStorage from storage " + storage.getKey() + " will be removed " + lc7Var.a, new Object[0]);
                cache.removeSpan(lc7Var);
            }
        }
    }

    private final void evictStorages(ra7 cache) {
        Object obj;
        if (this.storages.size() > this.storageByContentIdMaxCount + 1) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(this.TAG);
            d5z0Var.a("evictStorages too many storages " + this.storages.size(), new Object[0]);
            Iterator<T> it = this.storages.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Storage) obj).getKey() != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Storage storage = (Storage) obj;
            if (storage != null) {
                for (lc7 lc7Var : a.J0(storage.getLeastRecentlyUsed())) {
                    d5z0 d5z0Var2 = h5z0.a;
                    d5z0Var2.t(this.TAG);
                    d5z0Var2.a("evictStorages from storage " + storage.getKey() + " will be removed " + lc7Var.a, new Object[0]);
                    cache.removeSpan(lc7Var);
                }
                this.storages.remove(storage);
            }
        }
    }

    private final Storage getStorageBySpan(ra7 cache, lc7 span, boolean shouldCreateIfNotExists) {
        Object obj;
        Object obj2;
        w610 b;
        Iterator<T> it = this.storages.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            Storage storage = (Storage) obj2;
            if (storage.getKey() != null && evu0.y(span.a, storage.getKey(), false)) {
                break;
            }
        }
        Storage storage2 = (Storage) obj2;
        if (storage2 != null) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(this.TAG);
            d5z0Var.a("getStorageBySpan storage " + storage2.getKey() + " found for " + span.a, new Object[0]);
            return storage2;
        }
        if (shouldCreateIfNotExists && (b = this.contentIdRegex.b(span.a)) != null && b.a().size() >= 2) {
            String str = (String) ((u1l) b.a()).get(1);
            d5z0 d5z0Var2 = h5z0.a;
            d5z0Var2.t(this.TAG);
            d5z0Var2.a("getStorageBySpan create new storage for " + str, new Object[0]);
            Storage storage3 = new Storage(System.currentTimeMillis(), 0L, new TreeSet(new ManifestAndInitPriorityComparator()), str);
            this.storages.add(storage3);
            return storage3;
        }
        Iterator<T> it2 = this.storages.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Storage) next).getKey() == null) {
                obj = next;
                break;
            }
        }
        Storage storage4 = (Storage) obj;
        if (storage4 == null && shouldCreateIfNotExists) {
            Storage storage5 = new Storage(System.currentTimeMillis(), 0L, new TreeSet(new SpanComparator()), null);
            this.storages.add(storage5);
            storage4 = storage5;
        }
        d5z0 d5z0Var3 = h5z0.a;
        d5z0Var3.t(this.TAG);
        d5z0Var3.a("getStorageBySpan can not find storage. Will be stored in default", new Object[0]);
        return storage4;
    }

    public final boolean isStorageByKeyExists$video_player_internalRelease(String key) {
        Object obj;
        Iterator<T> it = this.storages.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((Storage) obj).getKey(), key, false)) {
                break;
            }
        }
        return obj != null;
    }

    @Override // defpackage.ib7
    public void onCacheInitialized() {
    }

    @Override // defpackage.oa7
    public void onSpanAdded(ra7 cache, lc7 span) {
        d5z0 d5z0Var = h5z0.a;
        StringBuilder sb = new StringBuilder("onSpanAdded span size ");
        long j = span.c;
        sb.append(j);
        sb.append(" - ");
        sb.append(span.a);
        d5z0Var.a(sb.toString(), new Object[0]);
        Storage storageBySpan = getStorageBySpan(cache, span, true);
        if (storageBySpan != null) {
            storageBySpan.getLeastRecentlyUsed().add(span);
            storageBySpan.setLastTouchTimestamp(System.currentTimeMillis());
            storageBySpan.setCurrentSize(storageBySpan.getCurrentSize() + j);
            this.currentSize += j;
            d5z0Var.a("onSpanAdded complete to " + storageBySpan.getKey() + Extension.FIX_SPACE + storageBySpan.getCurrentSize() + '/' + this.storageByContentIdMaxBytes, new Object[0]);
        }
        evictStorages(cache);
        if (storageBySpan != null) {
            evictCacheInStorage(cache, 0L, storageBySpan);
        }
        evictCache(cache, 0L);
    }

    @Override // defpackage.oa7
    public void onSpanRemoved(ra7 cache, lc7 span) {
        long j = span.c;
        Storage storageBySpan = getStorageBySpan(cache, span, false);
        if (storageBySpan != null) {
            storageBySpan.getLeastRecentlyUsed().remove(span);
            storageBySpan.setCurrentSize(storageBySpan.getCurrentSize() - j);
            if (storageBySpan.getLeastRecentlyUsed().size() == 0) {
                this.storages.remove(storageBySpan);
            }
        }
        this.currentSize -= j;
    }

    @Override // defpackage.oa7
    public void onSpanTouched(ra7 cache, lc7 oldSpan, lc7 newSpan) {
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // defpackage.ib7
    public void onStartFile(ra7 cache, String key, long position, long length) {
        if (length != -1) {
            evictStorages(cache);
            Iterator<T> it = this.storages.iterator();
            while (it.hasNext()) {
                evictCacheInStorage(cache, 0L, (Storage) it.next());
            }
            evictCache(cache, length);
        }
    }

    @Override // defpackage.ib7
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
