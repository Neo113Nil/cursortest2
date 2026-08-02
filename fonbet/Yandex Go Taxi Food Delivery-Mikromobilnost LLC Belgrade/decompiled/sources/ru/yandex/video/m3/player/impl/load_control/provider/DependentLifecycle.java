package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DependentLifecycle {
    void release(YandexPlayer<?> yandexPlayer);

    void start(YandexPlayer<?> yandexPlayer);
}
