package ru.yandex.video.m3.model.config.datasource;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!BE\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", "", "enableDebugCacheMiss", "", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "enableFallbackToUpstream", "experimentalPreloadLiveDashConfig", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "okHttpClient", "Lokhttp3/OkHttpClient;", "cacheProvider", "Lru/yandex/video/m3/cache/CacheProvider;", "failFast", "(ZLru/yandex/video/m3/player/utils/PlayerLogger;ZLru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;Lokhttp3/OkHttpClient;Lru/yandex/video/m3/cache/CacheProvider;Z)V", "getCacheProvider", "()Lru/yandex/video/m3/cache/CacheProvider;", "getEnableDebugCacheMiss", "()Z", "getEnableFallbackToUpstream", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getFailFast", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "equals", "other", "hashCode", "", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDataSourceFactoryCreatorConfig {
    public static final int $stable = 8;
    private final CacheProvider cacheProvider;
    private final boolean enableDebugCacheMiss;
    private final boolean enableFallbackToUpstream;
    private final PreloadLiveDashConfig experimentalPreloadLiveDashConfig;
    private final boolean failFast;
    private final OkHttpClient okHttpClient;
    private final PlayerLogger playerLogger;

    private DefaultDataSourceFactoryCreatorConfig(boolean z, PlayerLogger playerLogger, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, OkHttpClient okHttpClient, CacheProvider cacheProvider, boolean z3) {
        this.enableDebugCacheMiss = z;
        this.playerLogger = playerLogger;
        this.enableFallbackToUpstream = z2;
        this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        this.okHttpClient = okHttpClient;
        this.cacheProvider = cacheProvider;
        this.failFast = z3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DefaultDataSourceFactoryCreatorConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DefaultDataSourceFactoryCreatorConfig defaultDataSourceFactoryCreatorConfig = (DefaultDataSourceFactoryCreatorConfig) other;
        return this.enableDebugCacheMiss == defaultDataSourceFactoryCreatorConfig.enableDebugCacheMiss && this.enableFallbackToUpstream == defaultDataSourceFactoryCreatorConfig.enableFallbackToUpstream && this.failFast == defaultDataSourceFactoryCreatorConfig.failFast && jl40.l(this.playerLogger, defaultDataSourceFactoryCreatorConfig.playerLogger) && jl40.l(this.experimentalPreloadLiveDashConfig, defaultDataSourceFactoryCreatorConfig.experimentalPreloadLiveDashConfig) && jl40.l(this.okHttpClient, defaultDataSourceFactoryCreatorConfig.okHttpClient) && jl40.l(this.cacheProvider, defaultDataSourceFactoryCreatorConfig.cacheProvider);
    }

    public final CacheProvider getCacheProvider() {
        return this.cacheProvider;
    }

    public final boolean getEnableDebugCacheMiss() {
        return this.enableDebugCacheMiss;
    }

    public final boolean getEnableFallbackToUpstream() {
        return this.enableFallbackToUpstream;
    }

    public final PreloadLiveDashConfig getExperimentalPreloadLiveDashConfig() {
        return this.experimentalPreloadLiveDashConfig;
    }

    public final boolean getFailFast() {
        return this.failFast;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final PlayerLogger getPlayerLogger() {
        return this.playerLogger;
    }

    public int hashCode() {
        int hashCode = (this.playerLogger.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.enableDebugCacheMiss) * 31, 31, this.enableFallbackToUpstream), 31, this.failFast)) * 31;
        PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
        int hashCode2 = (hashCode + (preloadLiveDashConfig != null ? preloadLiveDashConfig.hashCode() : 0)) * 31;
        OkHttpClient okHttpClient = this.okHttpClient;
        int hashCode3 = (hashCode2 + (okHttpClient != null ? okHttpClient.hashCode() : 0)) * 31;
        CacheProvider cacheProvider = this.cacheProvider;
        return hashCode3 + (cacheProvider != null ? cacheProvider.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultDataSourceFactoryCreatorConfig(cacheProvider=");
        sb.append(this.cacheProvider);
        sb.append(", enableDebugCacheMiss=");
        sb.append(this.enableDebugCacheMiss);
        sb.append(", playerLogger=");
        sb.append(this.playerLogger);
        sb.append(", enableFallbackToUpstream=");
        sb.append(this.enableFallbackToUpstream);
        sb.append(", experimentalPreloadLiveDashConfig=");
        sb.append(this.experimentalPreloadLiveDashConfig);
        sb.append(", okHttpClient=");
        sb.append(this.okHttpClient);
        sb.append(", failFast=");
        return unr0.u(sb, this.failFast, ')');
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010)\u001a\u00020*J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010+J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010+J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010+J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010'\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0003\u001a\u0004\u0018\u00010#@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig$Builder;", "", "()V", "<set-?>", "Lru/yandex/video/m3/cache/CacheProvider;", "cacheProvider", "getCacheProvider", "()Lru/yandex/video/m3/cache/CacheProvider;", "setCacheProvider", "(Lru/yandex/video/m3/cache/CacheProvider;)V", "", "enableDebugCacheMiss", "getEnableDebugCacheMiss", "()Ljava/lang/Boolean;", "setEnableDebugCacheMiss", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableFallbackToUpstream", "getEnableFallbackToUpstream", "setEnableFallbackToUpstream", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "experimentalPreloadLiveDashConfig", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "setExperimentalPreloadLiveDashConfig", "(Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;)V", "failFast", "getFailFast", "setFailFast", "Lokhttp3/OkHttpClient;", "okHttpClient", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "build", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig;", "(Ljava/lang/Boolean;)Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceFactoryCreatorConfig$Builder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private CacheProvider cacheProvider;
        private Boolean enableDebugCacheMiss;
        private Boolean enableFallbackToUpstream;
        private PreloadLiveDashConfig experimentalPreloadLiveDashConfig;
        private Boolean failFast;
        private OkHttpClient okHttpClient;
        private PlayerLogger playerLogger;

        public final DefaultDataSourceFactoryCreatorConfig build() {
            Boolean bool = this.enableDebugCacheMiss;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            PlayerLogger playerLogger = this.playerLogger;
            if (playerLogger == null) {
                playerLogger = new DummyPlayerLogger();
            }
            Boolean bool2 = this.enableFallbackToUpstream;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
            PlayerLogger playerLogger2 = playerLogger;
            boolean z = booleanValue2;
            OkHttpClient okHttpClient = this.okHttpClient;
            boolean z2 = false;
            CacheProvider cacheProvider = this.cacheProvider;
            Boolean bool3 = this.failFast;
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            }
            return new DefaultDataSourceFactoryCreatorConfig(booleanValue, playerLogger2, z, preloadLiveDashConfig, okHttpClient, cacheProvider, z2, null);
        }

        public final CacheProvider getCacheProvider() {
            return this.cacheProvider;
        }

        public final Boolean getEnableDebugCacheMiss() {
            return this.enableDebugCacheMiss;
        }

        public final Boolean getEnableFallbackToUpstream() {
            return this.enableFallbackToUpstream;
        }

        public final PreloadLiveDashConfig getExperimentalPreloadLiveDashConfig() {
            return this.experimentalPreloadLiveDashConfig;
        }

        public final Boolean getFailFast() {
            return this.failFast;
        }

        public final OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        /* renamed from: setCacheProvider, reason: collision with other method in class */
        public final /* synthetic */ void m748setCacheProvider(CacheProvider cacheProvider) {
            this.cacheProvider = cacheProvider;
        }

        /* renamed from: setEnableDebugCacheMiss, reason: collision with other method in class */
        public final /* synthetic */ void m749setEnableDebugCacheMiss(Boolean bool) {
            this.enableDebugCacheMiss = bool;
        }

        /* renamed from: setEnableFallbackToUpstream, reason: collision with other method in class */
        public final /* synthetic */ void m750setEnableFallbackToUpstream(Boolean bool) {
            this.enableFallbackToUpstream = bool;
        }

        /* renamed from: setExperimentalPreloadLiveDashConfig, reason: collision with other method in class */
        public final /* synthetic */ void m751setExperimentalPreloadLiveDashConfig(PreloadLiveDashConfig preloadLiveDashConfig) {
            this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        }

        /* renamed from: setFailFast, reason: collision with other method in class */
        public final /* synthetic */ void m752setFailFast(Boolean bool) {
            this.failFast = bool;
        }

        /* renamed from: setOkHttpClient, reason: collision with other method in class */
        public final /* synthetic */ void m753setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
        }

        /* renamed from: setPlayerLogger, reason: collision with other method in class */
        public final /* synthetic */ void m754setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }

        public final Builder setCacheProvider(CacheProvider cacheProvider) {
            this.cacheProvider = cacheProvider;
            return this;
        }

        public final Builder setEnableDebugCacheMiss(Boolean enableDebugCacheMiss) {
            this.enableDebugCacheMiss = enableDebugCacheMiss;
            return this;
        }

        public final Builder setEnableFallbackToUpstream(Boolean enableFallbackToUpstream) {
            this.enableFallbackToUpstream = enableFallbackToUpstream;
            return this;
        }

        public final Builder setExperimentalPreloadLiveDashConfig(PreloadLiveDashConfig experimentalPreloadLiveDashConfig) {
            this.experimentalPreloadLiveDashConfig = experimentalPreloadLiveDashConfig;
            return this;
        }

        public final Builder setFailFast(Boolean failFast) {
            this.failFast = failFast;
            return this;
        }

        public final Builder setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
            return this;
        }

        public final Builder setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
            return this;
        }
    }

    public /* synthetic */ DefaultDataSourceFactoryCreatorConfig(boolean z, PlayerLogger playerLogger, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, OkHttpClient okHttpClient, CacheProvider cacheProvider, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, playerLogger, z2, preloadLiveDashConfig, okHttpClient, cacheProvider, z3);
    }
}
