package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import defpackage.cj01;
import defpackage.ipg;
import defpackage.jxi;
import defpackage.pb7;
import defpackage.ra7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfigKt;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultDataSourceFactory;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;
import ru.yandex.video.m3.source.DataSourceFactory;

@jxi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/SafeCachedDataSourceFactory;", "Lru/yandex/video/m3/source/DataSourceFactory;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lpb7;", "cacheKeyFactory", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", ConfigConstants.CONFIG, "<init>", "(Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;Lokhttp3/OkHttpClient;Lpb7;Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;)V", "tryCreateCachedDataSourceFactory", "()Lru/yandex/video/m3/source/DataSourceFactory;", "Lcj01;", "transferListener", "Lipg;", "create", "(Lcj01;)Lipg;", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "Lokhttp3/OkHttpClient;", "Lpb7;", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "delegateCachedDataSourceFactory", "Lru/yandex/video/m3/source/DataSourceFactory;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeCachedDataSourceFactory implements DataSourceFactory {
    public static final int $stable = 8;
    private final pb7 cacheKeyFactory;
    private final CachedDataSourceConfig config;
    private DataSourceFactory delegateCachedDataSourceFactory;
    private final OkHttpClient okHttpClient;
    private final PreloadCacheProvider preloadCacheProvider;

    public /* synthetic */ SafeCachedDataSourceFactory(PreloadCacheProvider preloadCacheProvider, OkHttpClient okHttpClient, pb7 pb7Var, CachedDataSourceConfig cachedDataSourceConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preloadCacheProvider, okHttpClient, (i & 4) != 0 ? null : pb7Var, (i & 8) != 0 ? CachedDataSourceConfigKt.CachedDataSourceConfig$default(null, 1, null) : cachedDataSourceConfig);
    }

    private final DataSourceFactory tryCreateCachedDataSourceFactory() {
        ra7 cache$default = CacheProvider.getCache$default(this.preloadCacheProvider, null, 1, null);
        if (cache$default == null) {
            return new DefaultDataSourceFactory(this.okHttpClient, null, 2, null);
        }
        CachedDataSourceFactory cachedDataSourceFactory = new CachedDataSourceFactory(cache$default, this.okHttpClient, this.cacheKeyFactory, this.config);
        this.delegateCachedDataSourceFactory = cachedDataSourceFactory;
        return cachedDataSourceFactory;
    }

    @Override // ru.yandex.video.m3.source.DataSourceFactory
    public ipg create(cj01 transferListener) {
        DataSourceFactory dataSourceFactory = this.delegateCachedDataSourceFactory;
        return dataSourceFactory != null ? dataSourceFactory.create(transferListener) : tryCreateCachedDataSourceFactory().create(transferListener);
    }

    public SafeCachedDataSourceFactory(PreloadCacheProvider preloadCacheProvider, OkHttpClient okHttpClient, pb7 pb7Var, CachedDataSourceConfig cachedDataSourceConfig) {
        this.preloadCacheProvider = preloadCacheProvider;
        this.okHttpClient = okHttpClient;
        this.cacheKeyFactory = pb7Var;
        this.config = cachedDataSourceConfig;
    }
}
