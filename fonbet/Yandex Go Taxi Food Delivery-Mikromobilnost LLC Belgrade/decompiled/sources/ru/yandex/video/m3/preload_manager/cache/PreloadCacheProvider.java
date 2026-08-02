package ru.yandex.video.m3.preload_manager.cache;

import android.content.Context;
import defpackage.ipg;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.sls;
import java.io.File;
import kotlin.Metadata;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "Lru/yandex/video/m3/cache/CacheProvider;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "getCacheInitializationException", "()Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lipg;", "upstreamDataSourceFactory", "getCacheDataSourceFactory", "(Lipg;)Lipg;", "Lra7;", "getCacheOrThrow", "()Lra7;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreloadCacheProvider extends CacheProvider {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R$\u00105\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R$\u00108\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)¨\u0006;"}, d2 = {"Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider$Builder;", "", "Landroid/content/Context;", "context", "", "cacheSizeKb", "<init>", "(Landroid/content/Context;J)V", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProviderImpl;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProviderImpl;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "J", "getCacheSizeKb", "()J", "setCacheSizeKb", "(J)V", "", "experimentalStorageByContentIdCount", "Ljava/lang/Integer;", "getExperimentalStorageByContentIdCount", "()Ljava/lang/Integer;", "setExperimentalStorageByContentIdCount", "(Ljava/lang/Integer;)V", "experimentalStorageByContentIdSizeKb", "Ljava/lang/Long;", "getExperimentalStorageByContentIdSizeKb", "()Ljava/lang/Long;", "setExperimentalStorageByContentIdSizeKb", "(Ljava/lang/Long;)V", "", "useCacheDatabaseProvider", "Ljava/lang/Boolean;", "getUseCacheDatabaseProvider", "()Ljava/lang/Boolean;", "setUseCacheDatabaseProvider", "(Ljava/lang/Boolean;)V", "Lkotlin/Function0;", "Ljava/io/File;", "getCacheDir", "Lsls;", "getGetCacheDir", "()Lsls;", "setGetCacheDir", "(Lsls;)V", "ignoreQueryParametersAndFragments", "getIgnoreQueryParametersAndFragments", "setIgnoreQueryParametersAndFragments", "discardHostAndHostSignature", "getDiscardHostAndHostSignature", "setDiscardHostAndHostSignature", "discardTimestampInUrl", "getDiscardTimestampInUrl", "setDiscardTimestampInUrl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private long cacheSizeKb;
        private Context context;
        private Boolean discardHostAndHostSignature;
        private Boolean discardTimestampInUrl;
        private Integer experimentalStorageByContentIdCount;
        private Long experimentalStorageByContentIdSizeKb;
        private sls getCacheDir;
        private Boolean ignoreQueryParametersAndFragments;
        private Boolean useCacheDatabaseProvider;

        public Builder(Context context, long j) {
            this.context = context;
            this.cacheSizeKb = j;
        }

        public final PreloadCacheProviderImpl build$video_player_internalRelease() {
            Context context = this.context;
            long j = this.cacheSizeKb;
            Integer num = this.experimentalStorageByContentIdCount;
            int intValue = num != null ? num.intValue() : 0;
            Long l = this.experimentalStorageByContentIdSizeKb;
            long longValue = l != null ? l.longValue() : 0L;
            Boolean bool = this.useCacheDatabaseProvider;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            sls slsVar = this.getCacheDir;
            if (slsVar == null) {
                slsVar = new sls() { // from class: ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider$Builder$build$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final File invoke() {
                        return new File(PreloadCacheProvider.Builder.this.getContext().getExternalFilesDir(null), PreloadCacheProviderImpl.DEFAULT_CACHE_NAME);
                    }
                };
            }
            Boolean bool2 = this.ignoreQueryParametersAndFragments;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
            Boolean bool3 = this.discardHostAndHostSignature;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            Boolean bool4 = this.discardTimestampInUrl;
            return new PreloadCacheProviderImpl(context, j, intValue, longValue, booleanValue, slsVar, booleanValue2, booleanValue3, bool4 != null ? bool4.booleanValue() : true);
        }

        public final long getCacheSizeKb() {
            return this.cacheSizeKb;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Boolean getDiscardHostAndHostSignature() {
            return this.discardHostAndHostSignature;
        }

        public final Boolean getDiscardTimestampInUrl() {
            return this.discardTimestampInUrl;
        }

        public final Integer getExperimentalStorageByContentIdCount() {
            return this.experimentalStorageByContentIdCount;
        }

        public final Long getExperimentalStorageByContentIdSizeKb() {
            return this.experimentalStorageByContentIdSizeKb;
        }

        public final sls getGetCacheDir() {
            return this.getCacheDir;
        }

        public final Boolean getIgnoreQueryParametersAndFragments() {
            return this.ignoreQueryParametersAndFragments;
        }

        public final Boolean getUseCacheDatabaseProvider() {
            return this.useCacheDatabaseProvider;
        }

        public final void setCacheSizeKb(long j) {
            this.cacheSizeKb = j;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDiscardHostAndHostSignature(Boolean bool) {
            this.discardHostAndHostSignature = bool;
        }

        public final void setDiscardTimestampInUrl(Boolean bool) {
            this.discardTimestampInUrl = bool;
        }

        public final void setExperimentalStorageByContentIdCount(Integer num) {
            this.experimentalStorageByContentIdCount = num;
        }

        public final void setExperimentalStorageByContentIdSizeKb(Long l) {
            this.experimentalStorageByContentIdSizeKb = l;
        }

        public final void setGetCacheDir(sls slsVar) {
            this.getCacheDir = slsVar;
        }

        public final void setIgnoreQueryParametersAndFragments(Boolean bool) {
            this.ignoreQueryParametersAndFragments = bool;
        }

        public final void setUseCacheDatabaseProvider(Boolean bool) {
            this.useCacheDatabaseProvider = bool;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static pb7 getCacheKeyFactory(PreloadCacheProvider preloadCacheProvider, PlaybackParameters playbackParameters) {
            return PreloadCacheProvider.super.getCacheKeyFactory(playbackParameters);
        }

        @Deprecated
        public static ra7 getCacheOrThrow(PreloadCacheProvider preloadCacheProvider) {
            return PreloadCacheProvider.super.getCacheOrThrow();
        }
    }

    ipg getCacheDataSourceFactory(ipg upstreamDataSourceFactory);

    PreloadException.CacheInitException getCacheInitializationException();

    default ra7 getCacheOrThrow() {
        ra7 cache$default = CacheProvider.getCache$default(this, null, 1, null);
        if (cache$default != null) {
            return cache$default;
        }
        throw getCacheInitializationException();
    }
}
