package ru.yandex.video.m3.player;

import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/PlayerStrategyFactory;", "", "create", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "errorNotifying", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "eventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerStrategyFactory {
    PlayerStrategy<VideoData> create(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, StrmEventLogger eventLogger);
}
