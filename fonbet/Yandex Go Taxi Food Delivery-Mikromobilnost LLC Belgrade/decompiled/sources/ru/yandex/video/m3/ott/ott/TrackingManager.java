package ru.yandex.video.m3.ott.ott;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Tracking;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/ott/TrackingManager;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "Lru/yandex/video/m3/ott/data/dto/Tracking;", "tracking", "onPrepared", "(Lru/yandex/video/m3/ott/data/dto/Tracking;)V", "onBufferingStart", "()V", "onBufferingEnd", "stop", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackingManager {
    void onBufferingEnd();

    void onBufferingStart();

    void onPrepared(Tracking tracking);

    void start(YandexPlayer<?> player);

    void stop();
}
