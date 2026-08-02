package ru.yandex.video.m3.model.config.mediasource;

import defpackage.b64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "", "liveDashPreloadEnabled", "", "timeSincePreloadingWhileCacheIsValid", "", "(ZJ)V", "getLiveDashPreloadEnabled", "()Z", "getTimeSincePreloadingWhileCacheIsValid", "()J", "equals", "other", "hashCode", "", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadLiveDashConfig {
    public static final int $stable = 0;
    private final boolean liveDashPreloadEnabled;
    private final long timeSincePreloadingWhileCacheIsValid;

    private PreloadLiveDashConfig(boolean z, long j) {
        this.liveDashPreloadEnabled = z;
        this.timeSincePreloadingWhileCacheIsValid = j;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PreloadLiveDashConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PreloadLiveDashConfig preloadLiveDashConfig = (PreloadLiveDashConfig) other;
        return this.liveDashPreloadEnabled == preloadLiveDashConfig.liveDashPreloadEnabled && this.timeSincePreloadingWhileCacheIsValid == preloadLiveDashConfig.timeSincePreloadingWhileCacheIsValid;
    }

    public final boolean getLiveDashPreloadEnabled() {
        return this.liveDashPreloadEnabled;
    }

    public final long getTimeSincePreloadingWhileCacheIsValid() {
        return this.timeSincePreloadingWhileCacheIsValid;
    }

    public int hashCode() {
        return Long.hashCode(this.timeSincePreloadingWhileCacheIsValid) + (Boolean.hashCode(this.liveDashPreloadEnabled) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreloadLiveDashConfig(liveDashPreloadEnabled=");
        sb.append(this.liveDashPreloadEnabled);
        sb.append(", timeSincePreloadingWhileCacheIsValid=");
        return b64.o(sb, this.timeSincePreloadingWhileCacheIsValid, ')');
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig$Builder;", "", "liveDashPreloadEnabled", "", "timeSincePreloadingWhileCacheIsValid", "", "(ZJ)V", "getLiveDashPreloadEnabled", "()Z", "setLiveDashPreloadEnabled", "(Z)V", "getTimeSincePreloadingWhileCacheIsValid", "()J", "setTimeSincePreloadingWhileCacheIsValid", "(J)V", "build", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private boolean liveDashPreloadEnabled;
        private long timeSincePreloadingWhileCacheIsValid;

        public Builder(boolean z, long j) {
            this.liveDashPreloadEnabled = z;
            this.timeSincePreloadingWhileCacheIsValid = j;
        }

        public final PreloadLiveDashConfig build() {
            return new PreloadLiveDashConfig(this.liveDashPreloadEnabled, this.timeSincePreloadingWhileCacheIsValid, null);
        }

        public final boolean getLiveDashPreloadEnabled() {
            return this.liveDashPreloadEnabled;
        }

        public final long getTimeSincePreloadingWhileCacheIsValid() {
            return this.timeSincePreloadingWhileCacheIsValid;
        }

        /* renamed from: setLiveDashPreloadEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m755setLiveDashPreloadEnabled(boolean z) {
            this.liveDashPreloadEnabled = z;
        }

        /* renamed from: setTimeSincePreloadingWhileCacheIsValid, reason: collision with other method in class */
        public final /* synthetic */ void m756setTimeSincePreloadingWhileCacheIsValid(long j) {
            this.timeSincePreloadingWhileCacheIsValid = j;
        }

        public final Builder setLiveDashPreloadEnabled(boolean liveDashPreloadEnabled) {
            this.liveDashPreloadEnabled = liveDashPreloadEnabled;
            return this;
        }

        public final Builder setTimeSincePreloadingWhileCacheIsValid(long timeSincePreloadingWhileCacheIsValid) {
            this.timeSincePreloadingWhileCacheIsValid = timeSincePreloadingWhileCacheIsValid;
            return this;
        }
    }

    public /* synthetic */ PreloadLiveDashConfig(boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j);
    }
}
