package ru.yandex.video.m3.player.impl.trackselection;

import android.content.Context;
import defpackage.omh;
import defpackage.vmh;
import defpackage.y3c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.TrackSelectorImpl;
import ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/DefaultTrackSelectorFactory;", "Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "Landroid/content/Context;", "context", "Lomh;", "trackSelectorParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "<init>", "(Landroid/content/Context;Lomh;Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;)V", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lvmh;", "createInternal", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;)Lvmh;", "create", "Lomh;", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "Landroid/content/Context;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTrackSelectorFactory implements TrackSelectorFactory {
    public static final int $stable = 8;
    private final AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
    private final Context context;
    private final omh trackSelectorParameters;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/DefaultTrackSelectorFactory$Builder;", "", "Landroid/content/Context;", "context", "Lomh;", "trackSelectorParameters", "<init>", "(Landroid/content/Context;Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/DefaultTrackSelectorFactory;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/trackselection/DefaultTrackSelectorFactory;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lomh;", "getTrackSelectorParameters", "()Lomh;", "setTrackSelectorParameters", "(Lomh;)V", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "adaptiveTrackSelectionParameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "getAdaptiveTrackSelectionParameters", "()Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "setAdaptiveTrackSelectionParameters", "(Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters;
        private Context context;
        private omh trackSelectorParameters;

        public Builder(Context context, omh omhVar) {
            this.context = context;
            this.trackSelectorParameters = omhVar;
        }

        public final DefaultTrackSelectorFactory build$video_player_internalRelease() {
            Context context = this.context;
            omh omhVar = this.trackSelectorParameters;
            AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters = this.adaptiveTrackSelectionParameters;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (adaptiveTrackSelectionParameters == null) {
                adaptiveTrackSelectionParameters = AdaptiveTrackSelectionParametersKt.AdaptiveTrackSelectionParameters$default(null, 1, null);
            }
            return new DefaultTrackSelectorFactory(context, omhVar, adaptiveTrackSelectionParameters, defaultConstructorMarker);
        }

        public final AdaptiveTrackSelectionParameters getAdaptiveTrackSelectionParameters() {
            return this.adaptiveTrackSelectionParameters;
        }

        public final Context getContext() {
            return this.context;
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

        public final void setTrackSelectorParameters(omh omhVar) {
            this.trackSelectorParameters = omhVar;
        }
    }

    private DefaultTrackSelectorFactory(Context context, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters) {
        this.trackSelectorParameters = omhVar;
        this.adaptiveTrackSelectionParameters = adaptiveTrackSelectionParameters;
        this.context = context.getApplicationContext();
    }

    private final vmh createInternal(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
        Supplier<SurfaceSize> surfaceSizeSupplier = trackSelectionRestrictionsProvider.getSurfaceSizeSupplier();
        Supplier<StartQuality> startQualitySupplier = trackSelectionRestrictionsProvider.getStartQualitySupplier();
        return new TrackSelectorImpl(this.context, new SurfaceSizeDependAdaptiveTrackSelection.Factory(surfaceSizeSupplier, this.adaptiveTrackSelectionParameters.getMinDurationForQualityIncreaseMs(), this.adaptiveTrackSelectionParameters.getMaxDurationForQualityDecreaseMs(), this.adaptiveTrackSelectionParameters.getMinDurationToRetainAfterDiscardMs(), this.adaptiveTrackSelectionParameters.getBandwidthFraction(), this.adaptiveTrackSelectionParameters.getBufferedFractionToLiveEdgeForQualityIncrease(), y3c.a, startQualitySupplier, false, 256, null), this.trackSelectorParameters);
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.TrackSelectorFactory
    public vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
        return createInternal(trackSelectionRestrictionsProvider);
    }

    public /* synthetic */ DefaultTrackSelectorFactory(Context context, omh omhVar, AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, omhVar, adaptiveTrackSelectionParameters);
    }
}
