package ru.yandex.video.m3.player.impl.trackselection;

import android.content.Context;
import defpackage.omh;
import defpackage.vmh;
import defpackage.y3c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.TrackSelectorImpl;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatAdaptiveTrackSelection;
import ru.yandex.video.m3.player.mesure.TargetFormatProvider;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "targetFormatProvider", "Lomh;", "trackSelectorParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "targetFormatTrackSelectionConfig", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/mesure/TargetFormatProvider;Lomh;Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;)V", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lvmh;", "createInternal", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;)Lvmh;", "create", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "Lomh;", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "Landroid/content/Context;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetFormatTrackSelectorFactory implements TrackSelectorFactory {
    public static final int $stable = 8;
    private final AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
    private final Context context;
    private final TargetFormatProvider targetFormatProvider;
    private final TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig;
    private final omh trackSelectorParameters;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory$Builder;", "", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "targetFormatProvider", "Lomh;", "trackSelectorParameters", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/mesure/TargetFormatProvider;Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectorFactory;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "getTargetFormatProvider", "()Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "setTargetFormatProvider", "(Lru/yandex/video/m3/player/mesure/TargetFormatProvider;)V", "Lomh;", "getTrackSelectorParameters", "()Lomh;", "setTrackSelectorParameters", "(Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "getAdaptiveTrackSelectionParameters", "()Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "setAdaptiveTrackSelectionParameters", "(Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;)V", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "targetFormatTrackSelectionConfig", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "getTargetFormatTrackSelectionConfig", "()Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "setTargetFormatTrackSelectionConfig", "(Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
        private Context context;
        private TargetFormatProvider targetFormatProvider;
        private TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig;
        private omh trackSelectorParameters;

        public Builder(Context context, TargetFormatProvider targetFormatProvider, omh omhVar) {
            this.context = context;
            this.targetFormatProvider = targetFormatProvider;
            this.trackSelectorParameters = omhVar;
        }

        public final TargetFormatTrackSelectorFactory build$video_player_internalRelease() {
            Context context = this.context;
            TargetFormatProvider targetFormatProvider = this.targetFormatProvider;
            omh omhVar = this.trackSelectorParameters;
            AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters = this.adaptiveTrackSelectionParameters;
            if (adaptiveTrackSelectionParameters == null) {
                adaptiveTrackSelectionParameters = AdaptiveTrackSelectionParametersKt.AdaptiveTrackSelectionParameters$default(null, 1, null);
            }
            TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig = this.targetFormatTrackSelectionConfig;
            if (targetFormatTrackSelectionConfig == null) {
                targetFormatTrackSelectionConfig = TargetFormatTrackSelectionConfigKt.TargetFormatTrackSelectionConfig$default(null, 1, null);
            }
            return new TargetFormatTrackSelectorFactory(context, targetFormatProvider, omhVar, adaptiveTrackSelectionParameters, targetFormatTrackSelectionConfig, null);
        }

        public final AdaptiveTrackSelectionParameters getAdaptiveTrackSelectionParameters() {
            return this.adaptiveTrackSelectionParameters;
        }

        public final Context getContext() {
            return this.context;
        }

        public final TargetFormatProvider getTargetFormatProvider() {
            return this.targetFormatProvider;
        }

        public final TargetFormatTrackSelectionConfig getTargetFormatTrackSelectionConfig() {
            return this.targetFormatTrackSelectionConfig;
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

        public final void setTargetFormatProvider(TargetFormatProvider targetFormatProvider) {
            this.targetFormatProvider = targetFormatProvider;
        }

        public final void setTargetFormatTrackSelectionConfig(TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig) {
            this.targetFormatTrackSelectionConfig = targetFormatTrackSelectionConfig;
        }

        public final void setTrackSelectorParameters(omh omhVar) {
            this.trackSelectorParameters = omhVar;
        }
    }

    private TargetFormatTrackSelectorFactory(Context context, TargetFormatProvider targetFormatProvider, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig) {
        this.targetFormatProvider = targetFormatProvider;
        this.trackSelectorParameters = omhVar;
        this.adaptiveTrackSelectionParameters = adaptiveTrackSelectionParameters;
        this.targetFormatTrackSelectionConfig = targetFormatTrackSelectionConfig;
        this.context = context.getApplicationContext();
    }

    private final vmh createInternal(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
        Supplier<SurfaceSize> surfaceSizeSupplier = trackSelectionRestrictionsProvider.getSurfaceSizeSupplier();
        Supplier<StartQuality> startQualitySupplier = trackSelectionRestrictionsProvider.getStartQualitySupplier();
        return new TrackSelectorImpl(this.context, new TargetFormatAdaptiveTrackSelection.Factory(this.targetFormatProvider.getTargetFormat(), surfaceSizeSupplier, this.adaptiveTrackSelectionParameters.getMinDurationForQualityIncreaseMs(), this.adaptiveTrackSelectionParameters.getMaxDurationForQualityDecreaseMs(), this.adaptiveTrackSelectionParameters.getMinDurationToRetainAfterDiscardMs(), this.adaptiveTrackSelectionParameters.getBandwidthFraction(), this.adaptiveTrackSelectionParameters.getBufferedFractionToLiveEdgeForQualityIncrease(), y3c.a, startQualitySupplier, this.targetFormatTrackSelectionConfig.getSelectMonoBitrate(), this.targetFormatTrackSelectionConfig.getDegradationSteps()), this.trackSelectorParameters);
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory
    public vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
        return createInternal(trackSelectionRestrictionsProvider);
    }

    public /* synthetic */ TargetFormatTrackSelectorFactory(Context context, TargetFormatProvider targetFormatProvider, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, targetFormatProvider, omhVar, adaptiveTrackSelectionParameters, targetFormatTrackSelectionConfig);
    }
}
