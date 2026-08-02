package ru.yandex.video.m3.model.config.datasource;

import defpackage.jl40;
import defpackage.jxi;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;

@jxi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001!B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006\""}, d2 = {"Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "", "", "enableDebugCacheMiss", "enableFallbackToUpstream", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "experimentalPreloadLiveDashConfig", "enableCacheWriteWhileWatching", "<init>", "(ZZLru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnableDebugCacheMiss", "()Z", "getEnableFallbackToUpstream", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getEnableCacheWriteWhileWatching", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedDataSourceConfig {
    public static final int $stable = 0;
    private final boolean enableCacheWriteWhileWatching;
    private final boolean enableDebugCacheMiss;
    private final boolean enableFallbackToUpstream;
    private final PreloadLiveDashConfig experimentalPreloadLiveDashConfig;

    private CachedDataSourceConfig(boolean z, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, boolean z3) {
        this.enableDebugCacheMiss = z;
        this.enableFallbackToUpstream = z2;
        this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        this.enableCacheWriteWhileWatching = z3;
    }

    public static /* synthetic */ CachedDataSourceConfig copy$default(CachedDataSourceConfig cachedDataSourceConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((CachedDataSourceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(CachedDataSourceConfig.Builder builder) {
                }
            };
        }
        return cachedDataSourceConfig.copy(tlsVar);
    }

    public final CachedDataSourceConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!CachedDataSourceConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        CachedDataSourceConfig cachedDataSourceConfig = (CachedDataSourceConfig) other;
        return this.enableDebugCacheMiss == cachedDataSourceConfig.enableDebugCacheMiss && this.enableFallbackToUpstream == cachedDataSourceConfig.enableFallbackToUpstream && this.enableCacheWriteWhileWatching == cachedDataSourceConfig.enableCacheWriteWhileWatching && jl40.l(this.experimentalPreloadLiveDashConfig, cachedDataSourceConfig.experimentalPreloadLiveDashConfig);
    }

    public final boolean getEnableCacheWriteWhileWatching() {
        return this.enableCacheWriteWhileWatching;
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

    public int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.enableDebugCacheMiss) * 31, 31, this.enableFallbackToUpstream), 31, this.enableCacheWriteWhileWatching);
        PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
        return e + (preloadLiveDashConfig != null ? preloadLiveDashConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedDataSourceConfig(enableDebugCacheMiss=");
        sb.append(this.enableDebugCacheMiss);
        sb.append(", enableFallbackToUpstream=");
        sb.append(this.enableFallbackToUpstream);
        sb.append(", experimentalPreloadLiveDashConfig=");
        sb.append(this.experimentalPreloadLiveDashConfig);
        sb.append(", enableCacheWriteWhileWatching=");
        return unr0.u(sb, this.enableCacheWriteWhileWatching, ')');
    }

    public /* synthetic */ CachedDataSourceConfig(boolean z, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, preloadLiveDashConfig, z3);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0019\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig$Builder;", "", "cachedDataSourceConfig", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "(Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;)V", "()V", "enableCacheWriteWhileWatching", "", "getEnableCacheWriteWhileWatching", "()Ljava/lang/Boolean;", "setEnableCacheWriteWhileWatching", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableDebugCacheMiss", "getEnableDebugCacheMiss", "setEnableDebugCacheMiss", "enableFallbackToUpstream", "getEnableFallbackToUpstream", "setEnableFallbackToUpstream", "experimentalPreloadLiveDashConfig", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "setExperimentalPreloadLiveDashConfig", "(Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean enableCacheWriteWhileWatching;
        private Boolean enableDebugCacheMiss;
        private Boolean enableFallbackToUpstream;
        private PreloadLiveDashConfig experimentalPreloadLiveDashConfig;

        public Builder(CachedDataSourceConfig cachedDataSourceConfig) {
            this();
            this.enableDebugCacheMiss = Boolean.valueOf(cachedDataSourceConfig.getEnableDebugCacheMiss());
            this.enableFallbackToUpstream = Boolean.valueOf(cachedDataSourceConfig.getEnableFallbackToUpstream());
            this.experimentalPreloadLiveDashConfig = cachedDataSourceConfig.getExperimentalPreloadLiveDashConfig();
            this.enableCacheWriteWhileWatching = Boolean.valueOf(cachedDataSourceConfig.getEnableCacheWriteWhileWatching());
        }

        public final CachedDataSourceConfig build$video_player_internalRelease() {
            Boolean bool = this.enableDebugCacheMiss;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.enableFallbackToUpstream;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
            Boolean bool3 = this.enableCacheWriteWhileWatching;
            return new CachedDataSourceConfig(booleanValue, booleanValue2, preloadLiveDashConfig, bool3 != null ? bool3.booleanValue() : true, null);
        }

        public final Boolean getEnableCacheWriteWhileWatching() {
            return this.enableCacheWriteWhileWatching;
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

        public final void setEnableCacheWriteWhileWatching(Boolean bool) {
            this.enableCacheWriteWhileWatching = bool;
        }

        public final void setEnableDebugCacheMiss(Boolean bool) {
            this.enableDebugCacheMiss = bool;
        }

        public final void setEnableFallbackToUpstream(Boolean bool) {
            this.enableFallbackToUpstream = bool;
        }

        public final void setExperimentalPreloadLiveDashConfig(PreloadLiveDashConfig preloadLiveDashConfig) {
            this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        }

        public Builder() {
        }
    }
}
