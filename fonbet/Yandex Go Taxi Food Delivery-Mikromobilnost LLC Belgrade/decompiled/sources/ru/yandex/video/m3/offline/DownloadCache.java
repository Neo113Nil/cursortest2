package ru.yandex.video.m3.offline;

import defpackage.bhe;
import defpackage.che;
import defpackage.e2r;
import defpackage.h73;
import defpackage.lc7;
import defpackage.lqg;
import defpackage.oa7;
import defpackage.qrq0;
import defpackage.ra7;
import defpackage.tls;
import defpackage.wc60;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0$H\u0016¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001d0)2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010\u0013J'\u0010/\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u0002022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d0)2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J'\u00108\u001a\u0002072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u001dH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010>J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0016\u0010E\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/yandex/video/m3/offline/DownloadCache;", "Lra7;", "Llqg;", "databaseProvider", "", "minStorageFreeSpaceInBytes", "<init>", "(Llqg;J)V", "", "key", "getFindOrActiveCache", "(Ljava/lang/String;)Lra7;", "", "Lru/yandex/video/m3/offline/DownloadDirectory;", "directories", "Lzy11;", "applyDownloadDirectories", "(Ljava/util/List;)V", "getUid", "()J", "Lche;", "mutations", "applyContentMetadataMutations", "(Ljava/lang/String;Lche;)V", "position", "length", "Ljava/io/File;", "startFile", "(Ljava/lang/String;JJ)Ljava/io/File;", "Llc7;", "startReadWrite", "(Ljava/lang/String;JJ)Llc7;", "startReadWriteNonBlocking", "file", "commitFile", "(Ljava/io/File;J)V", "", "getKeys", "()Ljava/util/Set;", "Loa7;", "listener", "Ljava/util/NavigableSet;", "addListener", "(Ljava/lang/String;Loa7;)Ljava/util/NavigableSet;", "removeListener", "(Ljava/lang/String;Loa7;)V", "getCacheSpace", "getCachedLength", "(Ljava/lang/String;JJ)J", "getCachedBytes", "Lbhe;", "getContentMetadata", "(Ljava/lang/String;)Lbhe;", "getCachedSpans", "(Ljava/lang/String;)Ljava/util/NavigableSet;", "", "isCached", "(Ljava/lang/String;JJ)Z", "release", "()V", "span", "removeSpan", "(Llc7;)V", "holeSpan", "releaseHoleSpan", "removeResource", "(Ljava/lang/String;)V", "Llqg;", "J", "activeCache", "Lra7;", "", "caches", "Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadCache implements ra7 {
    public static final int $stable = 8;
    private ra7 activeCache;
    private Map<String, ra7> caches = new LinkedHashMap();
    private final lqg databaseProvider;
    private final long minStorageFreeSpaceInBytes;

    public DownloadCache(lqg lqgVar, long j) {
        this.databaseProvider = lqgVar;
        this.minStorageFreeSpaceInBytes = j;
    }

    private final ra7 getFindOrActiveCache(String key) {
        Object obj;
        Collection<ra7> values = this.caches.values();
        if (values.size() <= 1) {
            values = null;
        }
        if (values != null) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ra7 ra7Var = (ra7) obj;
                if (ra7Var.getCacheSpace() > 0 && !ra7Var.getCachedSpans(key).isEmpty()) {
                    break;
                }
            }
            ra7 ra7Var2 = (ra7) obj;
            if (ra7Var2 != null) {
                return ra7Var2;
            }
        }
        ra7 ra7Var3 = this.activeCache;
        if (ra7Var3 == null) {
            return null;
        }
        return ra7Var3;
    }

    @Override // defpackage.ra7
    public synchronized NavigableSet<lc7> addListener(final String key, final oa7 listener) {
        TreeSet treeSet;
        e2r k = b.k(new h73(1, this.caches.values()), new tls() { // from class: ru.yandex.video.m3.offline.DownloadCache$addListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final qrq0 invoke(ra7 ra7Var) {
                return new h73(1, ra7Var.addListener(key, listener));
            }
        });
        treeSet = new TreeSet();
        b.r(k, treeSet);
        return treeSet;
    }

    @Override // defpackage.ra7
    public synchronized void applyContentMetadataMutations(String key, che mutations) {
        getFindOrActiveCache(key).applyContentMetadataMutations(key, mutations);
    }

    public final synchronized void applyDownloadDirectories(List<DownloadDirectory> directories) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : directories) {
                DownloadDirectory downloadDirectory = (DownloadDirectory) obj;
                if (!downloadDirectory.getIsActive() && !downloadDirectory.getIsCreated()) {
                }
                arrayList.add(obj);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DownloadDirectory downloadDirectory2 = (DownloadDirectory) it.next();
                if (!this.caches.containsKey(downloadDirectory2.getFile().getAbsolutePath())) {
                    this.caches.put(downloadDirectory2.getFile().getAbsolutePath(), new LazyCache(downloadDirectory2.getFile(), downloadDirectory2.getIsExternal(), this.minStorageFreeSpaceInBytes, new wc60(), this.databaseProvider));
                }
                if (downloadDirectory2.getIsActive()) {
                    this.activeCache = this.caches.get(downloadDirectory2.getFile().getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ra7
    public synchronized void commitFile(File file, long length) {
        ra7 ra7Var = this.activeCache;
        if (ra7Var == null) {
            ra7Var = null;
        }
        ra7Var.commitFile(file, length);
    }

    @Override // defpackage.ra7
    public synchronized long getCacheSpace() {
        ra7 ra7Var;
        ra7Var = this.activeCache;
        if (ra7Var == null) {
            ra7Var = null;
        }
        return ra7Var.getCacheSpace();
    }

    @Override // defpackage.ra7
    public long getCachedBytes(String key, long position, long length) {
        return getFindOrActiveCache(key).getCachedBytes(key, position, length);
    }

    @Override // defpackage.ra7
    public synchronized long getCachedLength(String key, long position, long length) {
        return getFindOrActiveCache(key).getCachedLength(key, position, length);
    }

    @Override // defpackage.ra7
    public synchronized NavigableSet<lc7> getCachedSpans(String key) {
        return getFindOrActiveCache(key).getCachedSpans(key);
    }

    @Override // defpackage.ra7
    public synchronized bhe getContentMetadata(String key) {
        return getFindOrActiveCache(key).getContentMetadata(key);
    }

    @Override // defpackage.ra7
    public synchronized Set<String> getKeys() {
        return b.u(b.k(new h73(1, this.caches.values()), new tls() { // from class: ru.yandex.video.m3.offline.DownloadCache$getKeys$1
            @Override // defpackage.tls
            public final qrq0 invoke(ra7 ra7Var) {
                return new h73(1, ra7Var.getKeys());
            }
        }));
    }

    @Override // defpackage.ra7
    public synchronized long getUid() {
        ra7 ra7Var;
        ra7Var = this.activeCache;
        if (ra7Var == null) {
            ra7Var = null;
        }
        return ra7Var.getUid();
    }

    @Override // defpackage.ra7
    public synchronized boolean isCached(String key, long position, long length) {
        return getFindOrActiveCache(key).isCached(key, position, length);
    }

    @Override // defpackage.ra7
    public synchronized void release() {
        Iterator<T> it = this.caches.values().iterator();
        while (it.hasNext()) {
            ((ra7) it.next()).release();
        }
    }

    @Override // defpackage.ra7
    public synchronized void releaseHoleSpan(lc7 holeSpan) {
        getFindOrActiveCache(holeSpan.a).releaseHoleSpan(holeSpan);
    }

    @Override // defpackage.ra7
    public synchronized void removeListener(String key, oa7 listener) {
        Iterator<T> it = this.caches.values().iterator();
        while (it.hasNext()) {
            ((ra7) it.next()).removeListener(key, listener);
        }
    }

    @Override // defpackage.ra7
    public void removeResource(String key) {
        getFindOrActiveCache(key).removeResource(key);
    }

    @Override // defpackage.ra7
    public synchronized void removeSpan(lc7 span) {
        Iterator<T> it = this.caches.values().iterator();
        while (it.hasNext()) {
            ((ra7) it.next()).removeSpan(span);
        }
    }

    @Override // defpackage.ra7
    public synchronized File startFile(String key, long position, long length) {
        return getFindOrActiveCache(key).startFile(key, position, length);
    }

    @Override // defpackage.ra7
    public synchronized lc7 startReadWrite(String key, long position, long length) {
        return getFindOrActiveCache(key).startReadWrite(key, position, length);
    }

    @Override // defpackage.ra7
    public synchronized lc7 startReadWriteNonBlocking(String key, long position, long length) {
        return getFindOrActiveCache(key).startReadWriteNonBlocking(key, position, length);
    }
}
