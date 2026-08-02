package ru.yandex.video.m3.player.impl.trackselection;

import defpackage.vmh;
import kotlin.Metadata;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TrackSelectorFactory;", "", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lvmh;", "create", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;)Lvmh;", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "featuresProvider", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)Lvmh;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackSelectorFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static vmh create(TrackSelectorFactory trackSelectorFactory, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, PlaybackFeaturesProvider playbackFeaturesProvider) {
            return TrackSelectorFactory.super.create(trackSelectionRestrictionsProvider, playbackFeaturesProvider);
        }
    }

    vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider);

    default vmh create(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, PlaybackFeaturesProvider featuresProvider) {
        return create(trackSelectionRestrictionsProvider);
    }
}
