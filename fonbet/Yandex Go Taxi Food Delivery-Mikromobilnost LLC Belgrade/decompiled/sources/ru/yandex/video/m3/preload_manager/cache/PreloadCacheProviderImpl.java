package ru.yandex.video.m3.preload_manager.cache;

import android.content.Context;
import android.os.Environment;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.database.ExoDatabaseProvider;
import defpackage.a9y;
import defpackage.b64;
import defpackage.db7;
import defpackage.eds0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.ib7;
import defpackage.ipg;
import defpackage.jl40;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.YandexCacheKeyFactory;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.preload_manager.PreloadException;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 42\u00020\u0001:\u000245BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProviderImpl;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "Landroid/content/Context;", "context", "", "cacheSizeKb", "", "experimentalStorageByContentIdCount", "experimentalStorageByContentIdSizeKb", "", "useCacheDatabaseProvider", "Lkotlin/Function0;", "Ljava/io/File;", "getCacheDir", "ignoreQueryParametersAndFragments", "discardHostAndHostSignature", "discardTimestampInUrl", "<init>", "(Landroid/content/Context;JIJZLsls;ZZZ)V", "Lzy11;", "initCache", "()V", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "Lra7;", "getCache", "(Lru/yandex/video/m3/data/PlaybackParameters;)Lra7;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "getCacheInitializationException", "()Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lipg;", "upstreamDataSourceFactory", "getCacheDataSourceFactory", "(Lipg;)Lipg;", "Lpb7;", "getCacheKeyFactory", "(Lru/yandex/video/m3/data/PlaybackParameters;)Lpb7;", "Landroid/content/Context;", "J", CA20Status.STATUS_USER_I, "Z", "Lsls;", "cache", "Lra7;", "cacheError", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lru/yandex/video/m3/YandexCacheKeyFactory;", "keyFactory$delegate", "Li3y;", "getKeyFactory", "()Lru/yandex/video/m3/YandexCacheKeyFactory;", "keyFactory", "Companion", "FirstCacheInitDetails", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadCacheProviderImpl implements PreloadCacheProvider {
    public static final String DEFAULT_CACHE_NAME = "PreloadCache";
    public static final long MIN_CACHE_SIZE_KB = 10240;
    private static PreloadException.CacheInitException.InitFailed firstSimpleCacheCreationDetails;
    private ra7 cache;
    private PreloadException.CacheInitException cacheError;
    private final long cacheSizeKb;
    private final Context context;
    private final boolean discardHostAndHostSignature;
    private final boolean discardTimestampInUrl;
    private final int experimentalStorageByContentIdCount;
    private final long experimentalStorageByContentIdSizeKb;
    private final sls getCacheDir;
    private final boolean ignoreQueryParametersAndFragments;

    /* renamed from: keyFactory$delegate, reason: from kotlin metadata */
    private final i3y keyFactory = a.a(new sls() { // from class: ru.yandex.video.m3.preload_manager.cache.PreloadCacheProviderImpl$keyFactory$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final YandexCacheKeyFactory invoke() {
            boolean z;
            boolean z2;
            boolean z3;
            z = PreloadCacheProviderImpl.this.ignoreQueryParametersAndFragments;
            z2 = PreloadCacheProviderImpl.this.discardHostAndHostSignature;
            z3 = PreloadCacheProviderImpl.this.discardTimestampInUrl;
            return new YandexCacheKeyFactory(z, z2, z3);
        }
    });
    private final boolean useCacheDatabaseProvider;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProviderImpl$FirstCacheInitDetails;", "", Constants.KEY_MESSAGE, "", "stackTrace", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStackTrace", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FirstCacheInitDetails {
        private final String message;
        private final String stackTrace;

        public FirstCacheInitDetails(String str, String str2) {
            this.message = str;
            this.stackTrace = str2;
        }

        public static /* synthetic */ FirstCacheInitDetails copy$default(FirstCacheInitDetails firstCacheInitDetails, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = firstCacheInitDetails.message;
            }
            if ((i & 2) != 0) {
                str2 = firstCacheInitDetails.stackTrace;
            }
            return firstCacheInitDetails.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStackTrace() {
            return this.stackTrace;
        }

        public final FirstCacheInitDetails copy(String message, String stackTrace) {
            return new FirstCacheInitDetails(message, stackTrace);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstCacheInitDetails)) {
                return false;
            }
            FirstCacheInitDetails firstCacheInitDetails = (FirstCacheInitDetails) other;
            return jl40.l(this.message, firstCacheInitDetails.message) && jl40.l(this.stackTrace, firstCacheInitDetails.stackTrace);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStackTrace() {
            return this.stackTrace;
        }

        public int hashCode() {
            String str = this.message;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.stackTrace;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FirstCacheInitDetails(message=");
            sb.append(this.message);
            sb.append(", stackTrace=");
            return b64.p(sb, this.stackTrace, ')');
        }
    }

    public PreloadCacheProviderImpl(Context context, long j, int i, long j2, boolean z, sls slsVar, boolean z2, boolean z3, boolean z4) {
        this.context = context;
        this.cacheSizeKb = j;
        this.experimentalStorageByContentIdCount = i;
        this.experimentalStorageByContentIdSizeKb = j2;
        this.useCacheDatabaseProvider = z;
        this.getCacheDir = slsVar;
        this.ignoreQueryParametersAndFragments = z2;
        this.discardHostAndHostSignature = z3;
        this.discardTimestampInUrl = z4;
    }

    private final YandexCacheKeyFactory getKeyFactory() {
        return (YandexCacheKeyFactory) this.keyFactory.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:12:0x004a, B:14:0x005a, B:16:0x0062, B:17:0x0079, B:19:0x009e, B:21:0x00ad, B:22:0x0072), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:12:0x004a, B:14:0x005a, B:16:0x0062, B:17:0x0079, B:19:0x009e, B:21:0x00ad, B:22:0x0072), top: B:11:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void initCache() {
        File file;
        FirstCacheInitDetails firstCacheInitDetails;
        ib7 a9yVar;
        String externalStorageState = Environment.getExternalStorageState();
        eds0 eds0Var = null;
        if (jl40.l(externalStorageState, "mounted")) {
            try {
                file = (File) this.getCacheDir.invoke();
            } catch (Throwable th) {
                this.cacheError = new PreloadException.CacheInitException.InitFailed("Failed to create preload cache dir", th);
            }
            if (file != null) {
                try {
                    long max = Math.max(this.cacheSizeKb, MIN_CACHE_SIZE_KB) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    if (this.experimentalStorageByContentIdCount > 0) {
                        long j = this.experimentalStorageByContentIdSizeKb;
                        if (j > 0) {
                            a9yVar = new LRUByContentIdCacheEvictor(this.experimentalStorageByContentIdCount, Math.max(j, MIN_CACHE_SIZE_KB) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, max);
                            firstSimpleCacheCreationDetails = new PreloadException.CacheInitException.InitFailed("SimpleCache created in thread = " + Thread.currentThread().getName() + " this=" + this, null);
                            eds0Var = !this.useCacheDatabaseProvider ? new eds0(file, a9yVar, new ExoDatabaseProvider(this.context), false) : new eds0(file, a9yVar, null, true);
                        }
                    }
                    a9yVar = new a9y(max);
                    firstSimpleCacheCreationDetails = new PreloadException.CacheInitException.InitFailed("SimpleCache created in thread = " + Thread.currentThread().getName() + " this=" + this, null);
                    eds0Var = !this.useCacheDatabaseProvider ? new eds0(file, a9yVar, new ExoDatabaseProvider(this.context), false) : new eds0(file, a9yVar, null, true);
                } catch (Throwable th2) {
                    PreloadException.CacheInitException.InitFailed initFailed = firstSimpleCacheCreationDetails;
                    if (initFailed != null) {
                        StringWriter stringWriter = new StringWriter();
                        initFailed.printStackTrace(new PrintWriter(stringWriter));
                        firstCacheInitDetails = new FirstCacheInitDetails(initFailed.getMessage(), stringWriter.toString());
                    } else {
                        firstCacheInitDetails = null;
                    }
                    this.cacheError = new PreloadException.CacheInitException.InitFailed("SimpleCache init error in thread = " + Thread.currentThread().getName() + Extension.COLON_SPACE + th2.getMessage() + " details: " + firstCacheInitDetails + " this=" + this, th2);
                }
            }
            this.cache = eds0Var;
        }
        if (jl40.l(externalStorageState, "mounted_ro")) {
            this.cacheError = new PreloadException.CacheInitException.StorageReadOnly("External storage is mounted read-only");
        } else {
            this.cacheError = new PreloadException.CacheInitException.StorageNotMounted(g8e.o("External storage mount state is ", externalStorageState));
        }
        file = null;
        if (file != null) {
        }
        this.cache = eds0Var;
    }

    @Override // ru.yandex.video.m3.cache.CacheProvider
    public ra7 getCache(PlaybackParameters playbackParameters) {
        Object obj = this.cache;
        if (obj == null) {
            obj = this.cacheError;
        }
        if (obj == null) {
            initCache();
        }
        return this.cache;
    }

    @Override // ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider
    public ipg getCacheDataSourceFactory(ipg upstreamDataSourceFactory) {
        Object obj = this.cache;
        if (obj == null) {
            obj = this.cacheError;
        }
        if (obj == null) {
            initCache();
        }
        ra7 ra7Var = this.cache;
        if (ra7Var == null) {
            return upstreamDataSourceFactory;
        }
        db7 db7Var = new db7();
        db7Var.a = ra7Var;
        db7Var.y = upstreamDataSourceFactory;
        db7Var.w = getKeyFactory();
        return db7Var;
    }

    @Override // ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider
    public PreloadException.CacheInitException getCacheInitializationException() {
        Object obj = this.cache;
        if (obj == null) {
            obj = this.cacheError;
        }
        if (obj == null) {
            initCache();
        }
        return this.cacheError;
    }

    @Override // ru.yandex.video.m3.cache.CacheProvider
    public pb7 getCacheKeyFactory(PlaybackParameters playbackParameters) {
        return getKeyFactory();
    }
}
