package ru.yandex.video.m3.player;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerDelegateFactory;", CA20Status.STATUS_CERTIFICATE_H, "", "create", "Lru/yandex/video/m3/player/PlayerDelegate;", "parameters", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "playbackFeaturesProvider", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerDelegateFactory<H> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <H> PlayerDelegate<H> create(PlayerDelegateFactory<H> playerDelegateFactory, PlayerDelegateParameters playerDelegateParameters, PlaybackFeaturesProvider playbackFeaturesProvider) {
            return PlayerDelegateFactory.super.create(playerDelegateParameters, playbackFeaturesProvider);
        }
    }

    PlayerDelegate<H> create(PlayerDelegateParameters parameters);

    default PlayerDelegate<H> create(PlayerDelegateParameters parameters, PlaybackFeaturesProvider playbackFeaturesProvider) {
        return create(parameters);
    }
}
