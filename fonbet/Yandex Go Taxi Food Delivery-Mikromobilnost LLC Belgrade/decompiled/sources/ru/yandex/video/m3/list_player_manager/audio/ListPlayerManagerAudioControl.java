package ru.yandex.video.m3.list_player_manager.audio;

import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/audio/ListPlayerManagerAudioControl;", "", "Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;", "observer", "Lzy11;", "addObserver", "(Lru/yandex/video/m3/list_player_manager/audio/ListPlayerAudioStateObserver;)V", "removeObserver", "", "isMuted", "()Z", "isNotMuted", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "listYandexPlayer", "onGet", "(Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;)V", "onReturn", "onRelease", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListPlayerManagerAudioControl {
    void addObserver(ListPlayerAudioStateObserver observer);

    boolean isMuted();

    boolean isNotMuted();

    void onGet(ListYandexPlayer listYandexPlayer);

    void onRelease();

    void onReturn(ListYandexPlayer listYandexPlayer);

    void removeObserver(ListPlayerAudioStateObserver observer);
}
