package ru.yandex.video.m3.offline;

import android.os.Environment;
import androidx.media3.datasource.cache.Cache$CacheException;
import defpackage.bhe;
import defpackage.che;
import defpackage.eds0;
import defpackage.ib7;
import defpackage.jl40;
import defpackage.lc7;
import defpackage.lqg;
import defpackage.oa7;
import defpackage.ra7;
import java.io.File;
import java.util.NavigableSet;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.video.m3.offline.DownloadDirectoryException;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010&J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0019J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001c2\u0006\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b3\u0010/J'\u00104\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0017J'\u00105\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u00106J)\u00107\u001a\u0004\u0018\u00010)2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00106J'\u00108\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J%\u0010?\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001cH\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0016\u0010J\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lru/yandex/video/m3/offline/LazyCache;", "Lra7;", "Ljava/io/File;", "cacheDir", "", "isExternal", "", "minStorageFreeSpaceInBytes", "Lib7;", "cacheEvictor", "Llqg;", "databaseProvider", "<init>", "(Ljava/io/File;ZJLib7;Llqg;)V", "getOriginCache", "()Lra7;", "isStorageMounted", "()Z", "", "key", "position", "length", "notEnoughSpaceForNewSpan", "(Ljava/lang/String;JJ)Z", "getUid", "()J", "Lche;", "mutations", "Lzy11;", "applyContentMetadataMutations", "(Ljava/lang/String;Lche;)V", "", "getKeys", "()Ljava/util/Set;", "Lbhe;", "getContentMetadata", "(Ljava/lang/String;)Lbhe;", "getCachedLength", "(Ljava/lang/String;JJ)J", "getCachedBytes", "Ljava/util/NavigableSet;", "Llc7;", "getCachedSpans", "(Ljava/lang/String;)Ljava/util/NavigableSet;", "getCacheSpace", "holeSpan", "releaseHoleSpan", "(Llc7;)V", "removeResource", "(Ljava/lang/String;)V", "span", "removeSpan", "isCached", "startReadWrite", "(Ljava/lang/String;JJ)Llc7;", "startReadWriteNonBlocking", "startFile", "(Ljava/lang/String;JJ)Ljava/io/File;", "file", "commitFile", "(Ljava/io/File;J)V", "Loa7;", "listener", "addListener", "(Ljava/lang/String;Loa7;)Ljava/util/NavigableSet;", "removeListener", "(Ljava/lang/String;Loa7;)V", "release", "()V", "Ljava/io/File;", "Z", "J", "Lib7;", "Llqg;", "originCache", "Lra7;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LazyCache implements ra7 {
    public static final int $stable = 8;
    private final File cacheDir;
    private final ib7 cacheEvictor;
    private final lqg databaseProvider;
    private final boolean isExternal;
    private final long minStorageFreeSpaceInBytes;
    private volatile ra7 originCache;

    public LazyCache(File file, boolean z, long j, ib7 ib7Var, lqg lqgVar) {
        this.cacheDir = file;
        this.isExternal = z;
        this.minStorageFreeSpaceInBytes = j;
        this.cacheEvictor = ib7Var;
        this.databaseProvider = lqgVar;
    }

    private final synchronized ra7 getOriginCache() {
        ra7 ra7Var;
        try {
            if (this.originCache == null) {
                if (!isStorageMounted()) {
                    throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
                }
                eds0 eds0Var = new eds0(this.cacheDir, this.cacheEvictor, this.databaseProvider, false);
                try {
                    eds0Var.c();
                    this.originCache = eds0Var;
                } catch (Throwable th) {
                    eds0Var.release();
                    throw th;
                }
            }
            ra7Var = this.originCache;
            if (ra7Var == null) {
                ra7Var = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ra7Var;
    }

    private final boolean isStorageMounted() {
        return !this.isExternal || jl40.l(Environment.getExternalStorageState(this.cacheDir), "mounted");
    }

    private final boolean notEnoughSpaceForNewSpan(String key, long position, long length) {
        return this.cacheDir.getFreeSpace() < this.minStorageFreeSpaceInBytes && getOriginCache().getCachedBytes(key, position, length) == 0;
    }

    @Override // defpackage.ra7
    public NavigableSet<lc7> addListener(String key, oa7 listener) {
        return getOriginCache().addListener(key, listener);
    }

    @Override // defpackage.ra7
    public void applyContentMetadataMutations(String key, che mutations) {
        getOriginCache().applyContentMetadataMutations(key, mutations);
    }

    @Override // defpackage.ra7
    public void commitFile(File file, long length) {
        if (!isStorageMounted()) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
        }
        getOriginCache().commitFile(file, length);
    }

    @Override // defpackage.ra7
    public long getCacheSpace() {
        return getOriginCache().getCacheSpace();
    }

    @Override // defpackage.ra7
    public long getCachedBytes(String key, long position, long length) {
        return getOriginCache().getCachedBytes(key, position, length);
    }

    @Override // defpackage.ra7
    public long getCachedLength(String key, long position, long length) {
        return getOriginCache().getCachedLength(key, position, length);
    }

    @Override // defpackage.ra7
    public NavigableSet<lc7> getCachedSpans(String key) {
        return getOriginCache().getCachedSpans(key);
    }

    @Override // defpackage.ra7
    public bhe getContentMetadata(String key) {
        return getOriginCache().getContentMetadata(key);
    }

    @Override // defpackage.ra7
    public Set<String> getKeys() {
        return getOriginCache().getKeys();
    }

    @Override // defpackage.ra7
    public long getUid() {
        return getOriginCache().getUid();
    }

    @Override // defpackage.ra7
    public boolean isCached(String key, long position, long length) {
        return getOriginCache().isCached(key, position, length);
    }

    @Override // defpackage.ra7
    public void release() {
        if (this.originCache != null) {
            ra7 ra7Var = this.originCache;
            if (ra7Var == null) {
                ra7Var = null;
            }
            ra7Var.release();
        }
    }

    @Override // defpackage.ra7
    public void releaseHoleSpan(lc7 holeSpan) {
        getOriginCache().releaseHoleSpan(holeSpan);
    }

    @Override // defpackage.ra7
    public void removeListener(String key, oa7 listener) {
        getOriginCache().removeListener(key, listener);
    }

    @Override // defpackage.ra7
    public void removeResource(String key) {
        getOriginCache().removeResource(key);
    }

    @Override // defpackage.ra7
    public void removeSpan(lc7 span) {
        if (!isStorageMounted()) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
        }
        getOriginCache().removeSpan(span);
    }

    @Override // defpackage.ra7
    public File startFile(String key, long position, long length) {
        if (!isStorageMounted()) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
        }
        if (notEnoughSpaceForNewSpan(key, position, length)) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageLowSpaceException());
        }
        return getOriginCache().startFile(key, position, length);
    }

    @Override // defpackage.ra7
    public lc7 startReadWrite(String key, long position, long length) {
        if (!isStorageMounted()) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
        }
        if (notEnoughSpaceForNewSpan(key, position, length)) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageLowSpaceException());
        }
        lc7 startReadWrite = getOriginCache().startReadWrite(key, position, length);
        File file = startReadWrite.x;
        if (!(file != null ? file.exists() : false)) {
            startReadWrite = null;
        }
        return startReadWrite == null ? new lc7(key, position, length, -9223372036854775807L, null) : startReadWrite;
    }

    @Override // defpackage.ra7
    public lc7 startReadWriteNonBlocking(String key, long position, long length) {
        File file;
        if (!isStorageMounted()) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageMountedException());
        }
        if (notEnoughSpaceForNewSpan(key, position, length)) {
            throw new Cache$CacheException(new DownloadDirectoryException.StorageLowSpaceException());
        }
        lc7 startReadWriteNonBlocking = getOriginCache().startReadWriteNonBlocking(key, position, length);
        if ((startReadWriteNonBlocking == null || (file = startReadWriteNonBlocking.x) == null) ? false : file.exists()) {
            return startReadWriteNonBlocking;
        }
        return null;
    }
}
