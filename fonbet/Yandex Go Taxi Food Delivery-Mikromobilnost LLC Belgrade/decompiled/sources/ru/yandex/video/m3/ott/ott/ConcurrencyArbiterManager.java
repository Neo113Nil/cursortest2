package ru.yandex.video.m3.ott.ott;

import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "concurrencyArbiterConfig", "Ljava/util/concurrent/Future;", "ensureStarted", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Ljava/util/concurrent/Future;", "Lzy11;", "stop", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ConcurrencyArbiterManager {
    Future<?> ensureStarted(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig);

    void stop();
}
