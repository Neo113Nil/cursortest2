package ru.yandex.video.m3.player.feature;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cvu0;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.unr0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ab.config.AbConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/feature/FeatureConfigurator;", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "<init>", "(Lru/yandex/video/m3/ab/config/AbConfig;)V", "", LaunchBrowserActivity.KEY_URI, "Lzy11;", "updateLowLatencyFeatures", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "Lru/yandex/video/m3/player/feature/FeatureConfigurator$PlaybackFeaturesInternal;", "internal", "(Lru/yandex/video/m3/player/feature/PlaybackFeatures;)Lru/yandex/video/m3/player/feature/FeatureConfigurator$PlaybackFeaturesInternal;", "public", "(Lru/yandex/video/m3/player/feature/FeatureConfigurator$PlaybackFeaturesInternal;)Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "get", "()Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "updateFeaturesByUri", "Lru/yandex/video/m3/ab/config/AbConfig;", "getAbConfig", "()Lru/yandex/video/m3/ab/config/AbConfig;", "<set-?>", ClidProvider.STATE, "Lru/yandex/video/m3/player/feature/FeatureConfigurator$PlaybackFeaturesInternal;", "", "supportLowLatency", "Z", "getSupportLowLatency", "()Z", "isLowLatency", "getExpDoRetryForStreamResetException", "expDoRetryForStreamResetException", "LowLatency", "PlaybackFeaturesInternal", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeatureConfigurator implements PlaybackFeaturesProvider {
    public static final int $stable = 8;
    private final AbConfig abConfig;
    private PlaybackFeaturesInternal state = internal(PlaybackFeaturesProvider.INSTANCE.getValue());
    private final boolean supportLowLatency;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/feature/FeatureConfigurator$LowLatency;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LowLatency {
        public static final String QUERY_LOW_LATENCY = "lowlatency";
        public static final String QUERY_PACKAGER = "packager";
        public static final String URL_PATH_START = "/live";
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/feature/FeatureConfigurator$PlaybackFeaturesInternal;", "", "lowLatency", "", "(Z)V", "getLowLatency", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PlaybackFeaturesInternal {
        private final boolean lowLatency;

        public PlaybackFeaturesInternal(boolean z) {
            this.lowLatency = z;
        }

        public static /* synthetic */ PlaybackFeaturesInternal copy$default(PlaybackFeaturesInternal playbackFeaturesInternal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = playbackFeaturesInternal.lowLatency;
            }
            return playbackFeaturesInternal.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLowLatency() {
            return this.lowLatency;
        }

        public final PlaybackFeaturesInternal copy(boolean lowLatency) {
            return new PlaybackFeaturesInternal(lowLatency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlaybackFeaturesInternal) && this.lowLatency == ((PlaybackFeaturesInternal) other).lowLatency;
        }

        public final boolean getLowLatency() {
            return this.lowLatency;
        }

        public int hashCode() {
            return Boolean.hashCode(this.lowLatency);
        }

        public String toString() {
            return unr0.u(new StringBuilder("PlaybackFeaturesInternal(lowLatency="), this.lowLatency, ')');
        }
    }

    public FeatureConfigurator(AbConfig abConfig) {
        this.abConfig = abConfig;
    }

    private final PlaybackFeaturesInternal internal(PlaybackFeatures playbackFeatures) {
        return new PlaybackFeaturesInternal(playbackFeatures.getLowLatency());
    }

    /* renamed from: public, reason: not valid java name */
    private final PlaybackFeatures m763public(PlaybackFeaturesInternal playbackFeaturesInternal) {
        return new PlaybackFeatures(Boolean.valueOf(playbackFeaturesInternal.getLowLatency()));
    }

    private final void updateLowLatencyFeatures(String uri) {
        if (getSupportLowLatency()) {
            kwu kwuVar = null;
            try {
                jwu jwuVar = new jwu();
                jwuVar.i(null, uri);
                kwuVar = jwuVar.e();
            } catch (IllegalArgumentException unused) {
            }
            if (kwuVar == null) {
                return;
            }
            boolean z = false;
            if (cvu0.x(kwuVar.b(), LowLatency.URL_PATH_START, false) && jl40.l(kwuVar.i(LowLatency.QUERY_LOW_LATENCY), "1") && jl40.l(kwuVar.i(LowLatency.QUERY_PACKAGER), "1")) {
                z = true;
            }
            this.state = this.state.copy(z);
        }
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public PlaybackFeatures getValue() {
        return m763public(this.state);
    }

    public final AbConfig getAbConfig() {
        return this.abConfig;
    }

    @Override // ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider
    public boolean getExpDoRetryForStreamResetException() {
        return this.abConfig.getFlags().getDoRetryForStreamResetException();
    }

    @Override // ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider
    public boolean getSupportLowLatency() {
        return this.supportLowLatency;
    }

    @Override // ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider
    public boolean isLowLatency() {
        return this.state.getLowLatency();
    }

    public final void updateFeaturesByUri(String uri) {
        updateLowLatencyFeatures(uri);
    }
}
