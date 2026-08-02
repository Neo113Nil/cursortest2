package ru.yandex.video.m3.model.config.mediasource;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.model.config.mediasource.MediaSourceConfig;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001*BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b)\u0010\u001f¨\u0006+"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "", "", "validateDashRangeRequests", "interruptPendingRequests", "requestCMAFSegments", "Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "livePlaybackConfig", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "loadErrorHandlingConfig", "experimentalAllowGzipSubtitles", "experimentalPreloadLiveDashEnabled", "<init>", "(ZZZLru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;ZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getValidateDashRangeRequests", "()Z", "getInterruptPendingRequests", "getRequestCMAFSegments", "Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "getLivePlaybackConfig", "()Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "getLoadErrorHandlingConfig", "()Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "getExperimentalAllowGzipSubtitles", "getExperimentalPreloadLiveDashEnabled", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaSourceConfig {
    public static final int $stable = 0;
    private final boolean experimentalAllowGzipSubtitles;
    private final boolean experimentalPreloadLiveDashEnabled;
    private final boolean interruptPendingRequests;
    private final LivePlaybackConfig livePlaybackConfig;
    private final LoadErrorHandlingConfig loadErrorHandlingConfig;
    private final boolean requestCMAFSegments;
    private final boolean validateDashRangeRequests;

    private MediaSourceConfig(boolean z, boolean z2, boolean z3, LivePlaybackConfig livePlaybackConfig, LoadErrorHandlingConfig loadErrorHandlingConfig, boolean z4, boolean z5) {
        this.validateDashRangeRequests = z;
        this.interruptPendingRequests = z2;
        this.requestCMAFSegments = z3;
        this.livePlaybackConfig = livePlaybackConfig;
        this.loadErrorHandlingConfig = loadErrorHandlingConfig;
        this.experimentalAllowGzipSubtitles = z4;
        this.experimentalPreloadLiveDashEnabled = z5;
    }

    public static /* synthetic */ MediaSourceConfig copy$default(MediaSourceConfig mediaSourceConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.mediasource.MediaSourceConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaSourceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaSourceConfig.Builder builder) {
                }
            };
        }
        return mediaSourceConfig.copy(tlsVar);
    }

    public final MediaSourceConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!MediaSourceConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        MediaSourceConfig mediaSourceConfig = (MediaSourceConfig) other;
        return this.validateDashRangeRequests == mediaSourceConfig.validateDashRangeRequests && this.interruptPendingRequests == mediaSourceConfig.interruptPendingRequests && this.requestCMAFSegments == mediaSourceConfig.requestCMAFSegments && this.experimentalAllowGzipSubtitles == mediaSourceConfig.experimentalAllowGzipSubtitles && this.experimentalPreloadLiveDashEnabled == mediaSourceConfig.experimentalPreloadLiveDashEnabled && jl40.l(this.livePlaybackConfig, mediaSourceConfig.livePlaybackConfig) && jl40.l(this.loadErrorHandlingConfig, mediaSourceConfig.loadErrorHandlingConfig);
    }

    public final boolean getExperimentalAllowGzipSubtitles() {
        return this.experimentalAllowGzipSubtitles;
    }

    public final boolean getExperimentalPreloadLiveDashEnabled() {
        return this.experimentalPreloadLiveDashEnabled;
    }

    public final boolean getInterruptPendingRequests() {
        return this.interruptPendingRequests;
    }

    public final LivePlaybackConfig getLivePlaybackConfig() {
        return this.livePlaybackConfig;
    }

    public final LoadErrorHandlingConfig getLoadErrorHandlingConfig() {
        return this.loadErrorHandlingConfig;
    }

    public final boolean getRequestCMAFSegments() {
        return this.requestCMAFSegments;
    }

    public final boolean getValidateDashRangeRequests() {
        return this.validateDashRangeRequests;
    }

    public int hashCode() {
        return this.loadErrorHandlingConfig.hashCode() + ((this.livePlaybackConfig.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.validateDashRangeRequests) * 31, 31, this.interruptPendingRequests), 31, this.requestCMAFSegments), 31, this.experimentalAllowGzipSubtitles), 31, this.experimentalPreloadLiveDashEnabled)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSourceConfig(validateDashRangeRequests=");
        sb.append(this.validateDashRangeRequests);
        sb.append(", interruptPendingRequests=");
        sb.append(this.interruptPendingRequests);
        sb.append(", requestCMAFSegments=");
        sb.append(this.requestCMAFSegments);
        sb.append(", livePlaybackConfig=");
        sb.append(this.livePlaybackConfig);
        sb.append(", loadErrorHandlingConfig=");
        sb.append(this.loadErrorHandlingConfig);
        sb.append(", experimentalAllowGzipSubtitles=");
        sb.append(this.experimentalAllowGzipSubtitles);
        sb.append(", experimentalPreloadLiveDashEnabled=");
        return unr0.u(sb, this.experimentalPreloadLiveDashEnabled, ')');
    }

    public /* synthetic */ MediaSourceConfig(boolean z, boolean z2, boolean z3, LivePlaybackConfig livePlaybackConfig, LoadErrorHandlingConfig loadErrorHandlingConfig, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, livePlaybackConfig, loadErrorHandlingConfig, z4, z5);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0002\b&R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000b¨\u0006'"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig$Builder;", "", "mediaSourceConfig", "Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;", "(Lru/yandex/video/m3/model/config/mediasource/MediaSourceConfig;)V", "()V", "experimentalAllowGzipSubtitles", "", "getExperimentalAllowGzipSubtitles", "()Ljava/lang/Boolean;", "setExperimentalAllowGzipSubtitles", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "experimentalPreloadLiveDashEnabled", "getExperimentalPreloadLiveDashEnabled", "setExperimentalPreloadLiveDashEnabled", "interruptPendingRequests", "getInterruptPendingRequests", "setInterruptPendingRequests", "livePlaybackConfig", "Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "getLivePlaybackConfig", "()Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "setLivePlaybackConfig", "(Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;)V", "loadErrorHandlingConfig", "Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "getLoadErrorHandlingConfig", "()Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;", "setLoadErrorHandlingConfig", "(Lru/yandex/video/m3/model/config/mediasource/LoadErrorHandlingConfig;)V", "requestCMAFSegments", "getRequestCMAFSegments", "setRequestCMAFSegments", "validateDashRangeRequests", "getValidateDashRangeRequests", "setValidateDashRangeRequests", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean experimentalAllowGzipSubtitles;
        private Boolean experimentalPreloadLiveDashEnabled;
        private Boolean interruptPendingRequests;
        private LivePlaybackConfig livePlaybackConfig;
        private LoadErrorHandlingConfig loadErrorHandlingConfig;
        private Boolean requestCMAFSegments;
        private Boolean validateDashRangeRequests;

        public Builder(MediaSourceConfig mediaSourceConfig) {
            this();
            this.validateDashRangeRequests = Boolean.valueOf(mediaSourceConfig.getValidateDashRangeRequests());
            this.interruptPendingRequests = Boolean.valueOf(mediaSourceConfig.getInterruptPendingRequests());
            this.requestCMAFSegments = Boolean.valueOf(mediaSourceConfig.getRequestCMAFSegments());
            this.livePlaybackConfig = mediaSourceConfig.getLivePlaybackConfig();
            this.loadErrorHandlingConfig = mediaSourceConfig.getLoadErrorHandlingConfig();
            this.experimentalAllowGzipSubtitles = Boolean.valueOf(mediaSourceConfig.getExperimentalAllowGzipSubtitles());
            this.experimentalPreloadLiveDashEnabled = Boolean.valueOf(mediaSourceConfig.getExperimentalPreloadLiveDashEnabled());
        }

        public final MediaSourceConfig build$video_player_internalRelease() {
            Boolean bool = this.validateDashRangeRequests;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.interruptPendingRequests;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.requestCMAFSegments;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            LivePlaybackConfig livePlaybackConfig = this.livePlaybackConfig;
            if (livePlaybackConfig == null) {
                livePlaybackConfig = LivePlaybackConfigKt.LivePlaybackConfig$default(null, 1, null);
            }
            LoadErrorHandlingConfig LoadErrorHandlingConfig$default = LoadErrorHandlingConfigKt.LoadErrorHandlingConfig$default(null, 1, null);
            Boolean bool4 = this.experimentalAllowGzipSubtitles;
            boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            Boolean bool5 = this.experimentalPreloadLiveDashEnabled;
            return new MediaSourceConfig(booleanValue, booleanValue2, booleanValue3, livePlaybackConfig, LoadErrorHandlingConfig$default, booleanValue4, bool5 != null ? bool5.booleanValue() : false, null);
        }

        public final Boolean getExperimentalAllowGzipSubtitles() {
            return this.experimentalAllowGzipSubtitles;
        }

        public final Boolean getExperimentalPreloadLiveDashEnabled() {
            return this.experimentalPreloadLiveDashEnabled;
        }

        public final Boolean getInterruptPendingRequests() {
            return this.interruptPendingRequests;
        }

        public final LivePlaybackConfig getLivePlaybackConfig() {
            return this.livePlaybackConfig;
        }

        public final LoadErrorHandlingConfig getLoadErrorHandlingConfig() {
            return this.loadErrorHandlingConfig;
        }

        public final Boolean getRequestCMAFSegments() {
            return this.requestCMAFSegments;
        }

        public final Boolean getValidateDashRangeRequests() {
            return this.validateDashRangeRequests;
        }

        public final void setExperimentalAllowGzipSubtitles(Boolean bool) {
            this.experimentalAllowGzipSubtitles = bool;
        }

        public final void setExperimentalPreloadLiveDashEnabled(Boolean bool) {
            this.experimentalPreloadLiveDashEnabled = bool;
        }

        public final void setInterruptPendingRequests(Boolean bool) {
            this.interruptPendingRequests = bool;
        }

        public final void setLivePlaybackConfig(LivePlaybackConfig livePlaybackConfig) {
            this.livePlaybackConfig = livePlaybackConfig;
        }

        public final void setLoadErrorHandlingConfig(LoadErrorHandlingConfig loadErrorHandlingConfig) {
            this.loadErrorHandlingConfig = loadErrorHandlingConfig;
        }

        public final void setRequestCMAFSegments(Boolean bool) {
            this.requestCMAFSegments = bool;
        }

        public final void setValidateDashRangeRequests(Boolean bool) {
            this.validateDashRangeRequests = bool;
        }

        public Builder() {
        }
    }
}
