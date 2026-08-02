package ru.yandex.video.m3.player;

import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/SimplePlayerStrategyFactory;", "Lru/yandex/video/m3/player/PlayerStrategyFactory;", "strategyBuilder", "Lru/yandex/video/m3/player/SimplePlayerStrategyBuilder;", "(Lru/yandex/video/m3/player/SimplePlayerStrategyBuilder;)V", "create", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "errorNotifying", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "eventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimplePlayerStrategyFactory implements PlayerStrategyFactory {
    public static final int $stable = 8;
    private final SimplePlayerStrategyBuilder strategyBuilder;

    public SimplePlayerStrategyFactory(SimplePlayerStrategyBuilder simplePlayerStrategyBuilder) {
        this.strategyBuilder = simplePlayerStrategyBuilder;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategyFactory
    public PlayerStrategy<VideoData> create(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, StrmEventLogger eventLogger) {
        return this.strategyBuilder.build$video_player_internalRelease(player);
    }
}
