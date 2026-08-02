package ru.yandex.video.m3.player;

import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/SimplePlayerStrategy;", "Lru/yandex/video/m3/player/BasePlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "resourceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimplePlayerStrategy extends BasePlayerStrategy<VideoData> {
    public static final int $stable = 0;

    public SimplePlayerStrategy(YandexPlayer<?> yandexPlayer, ResourceProvider resourceProvider, PlayerLogger playerLogger) {
        super(yandexPlayer, resourceProvider, playerLogger);
    }
}
