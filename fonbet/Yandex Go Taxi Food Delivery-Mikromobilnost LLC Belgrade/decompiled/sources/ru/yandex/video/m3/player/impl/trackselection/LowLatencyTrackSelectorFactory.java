package ru.yandex.video.m3.player.impl.trackselection;

import android.content.Context;
import defpackage.omh;
import defpackage.vmh;
import defpackage.y3c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.impl.TrackSelectorImpl;
import ru.yandex.video.m3.player.lowlatency.trackselection.LowLatencyAdaptiveTrackSelection;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectorFactory;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Landroid/content/Context;", "context", "Lomh;", "trackSelectorParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "lowLatencyTrackSelectionParameters", "<init>", "(Landroid/content/Context;Lomh;Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;)V", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "featuresProvider", "Lvmh;", "createInternal", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)Lvmh;", "create", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;)Lvmh;", "Lomh;", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "Landroid/content/Context;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LowLatencyTrackSelectorFactory implements TrackSelectorFactory {
    private final AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
    private final Context context;
    private final LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters;
    private final omh trackSelectorParameters;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectorFactory$Builder;", "", "Landroid/content/Context;", "context", "Lomh;", "trackSelectorParameters", "<init>", "(Landroid/content/Context;Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectorFactory;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectorFactory;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lomh;", "getTrackSelectorParameters", "()Lomh;", "setTrackSelectorParameters", "(Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "getAdaptiveTrackSelectionParameters", "()Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "setAdaptiveTrackSelectionParameters", "(Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;)V", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "lowLatencyTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "getLowLatencyTrackSelectionParameters", "()Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "setLowLatencyTrackSelectionParameters", "(Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
        private Context context;
        private LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters;
        private omh trackSelectorParameters;

        public Builder(Context context, omh omhVar) {
            this.context = context;
            this.trackSelectorParameters = omhVar;
        }

        public final LowLatencyTrackSelectorFactory build$video_player_internalRelease() {
            Context context = this.context;
            omh omhVar = this.trackSelectorParameters;
            AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters = this.adaptiveTrackSelectionParameters;
            if (adaptiveTrackSelectionParameters == null) {
                adaptiveTrackSelectionParameters = AdaptiveTrackSelectionParametersKt.AdaptiveTrackSelectionParameters$default(null, 1, null);
            }
            LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters = this.lowLatencyTrackSelectionParameters;
            if (lowLatencyTrackSelectionParameters == null) {
                lowLatencyTrackSelectionParameters = LowLatencyTrackSelectionParametersKt.LowLatencyTrackSelectionParameters$default(null, 1, null);
            }
            return new LowLatencyTrackSelectorFactory(context, omhVar, adaptiveTrackSelectionParameters, lowLatencyTrackSelectionParameters, null);
        }

        public final AdaptiveTrackSelectionParameters getAdaptiveTrackSelectionParameters() {
            return this.adaptiveTrackSelectionParameters;
        }

        public final Context getContext() {
            return this.context;
        }

        public final LowLatencyTrackSelectionParameters getLowLatencyTrackSelectionParameters() {
            return this.lowLatencyTrackSelectionParameters;
        }

        public final omh getTrackSelectorParameters() {
            return this.trackSelectorParameters;
        }

        public final void setAdaptiveTrackSelectionParameters(AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters) {
            this.adaptiveTrackSelectionParameters = adaptiveTrackSelectionParameters;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setLowLatencyTrackSelectionParameters(LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters) {
            this.lowLatencyTrackSelectionParameters = lowLatencyTrackSelectionParameters;
        }

        public final void setTrackSelectorParameters(omh omhVar) {
            this.trackSelectorParameters = omhVar;
        }
    }

    private LowLatencyTrackSelectorFactory(Context context, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters) {
        this.trackSelectorParameters = omhVar;
        this.adaptiveTrackSelectionParameters = adaptiveTrackSelectionParameters;
        this.lowLatencyTrackSelectionParameters = lowLatencyTrackSelectionParameters;
        this.context = context.getApplicationContext();
    }

    private final vmh createInternal(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, PlaybackFeaturesProvider featuresProvider) {
        Supplier<SurfaceSize> surfaceSizeSupplier = trackSelectionRestrictionsProvider.getSurfaceSizeSupplier();
        Supplier<StartQuality> startQualitySupplier = trackSelectionRestrictionsProvider.getStartQualitySupplier();
        return new TrackSelectorImpl(this.context, new LowLatencyAdaptiveTrackSelection.Factory(surfaceSizeSupplier, this.adaptiveTrackSelectionParameters.getMinDurationForQualityIncreaseMs(), this.adaptiveTrackSelectionParameters.getMaxDurationForQualityDecreaseMs(), this.adaptiveTrackSelectionParameters.getMinDurationToRetainAfterDiscardMs(), this.adaptiveTrackSelectionParameters.getBandwidthFraction(), this.adaptiveTrackSelectionParameters.getBufferedFractionToLiveEdgeForQualityIncrease(), y3c.a, startQualitySupplier, this.lowLatencyTrackSelectionParameters.getShouldAllowInterruptingCurrentChunk(), this.lowLatencyTrackSelectionParameters.getQualityLevelsToDowngradeOnInterrupt(), this.lowLatencyTrackSelectionParameters.getIsSwitchHistoryRuleEnabled(), featuresProvider), this.trackSelectorParameters);
    }

    public static /* synthetic */ vmh createInternal$default(LowLatencyTrackSelectorFactory lowLatencyTrackSelectorFactory, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, PlaybackFeaturesProvider playbackFeaturesProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            playbackFeaturesProvider = PlaybackFeaturesProvider.INSTANCE;
        }
        return lowLatencyTrackSelectorFactory.createInternal(trackSelectionRestrictionsProvider, playbackFeaturesProvider);
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory
    public vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
        return createInternal$default(this, trackSelectionRestrictionsProvider, null, 2, null);
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory
    public vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, PlaybackFeaturesProvider featuresProvider) {
        return createInternal(trackSelectionRestrictionsProvider, featuresProvider);
    }

    public /* synthetic */ LowLatencyTrackSelectorFactory(Context context, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, omhVar, adaptiveTrackSelectionParameters, lowLatencyTrackSelectionParameters);
    }
}
