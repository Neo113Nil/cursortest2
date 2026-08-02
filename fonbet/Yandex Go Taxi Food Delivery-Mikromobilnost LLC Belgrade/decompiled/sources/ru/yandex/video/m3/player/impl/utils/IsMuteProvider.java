package ru.yandex.video.m3.player.impl.utils;

import kotlin.Metadata;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;", "", "yandexPlayer", "Lru/yandex/video/m3/player/YandexPlayer;", "systemMediaVolumeProvider", "Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/impl/tracking/SystemMediaVolumeProvider;)V", "isPlaybackMuted", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IsMuteProvider {
    public static final int $stable = 0;
    private final SystemMediaVolumeProvider systemMediaVolumeProvider;
    private final YandexPlayer<?> yandexPlayer;

    public IsMuteProvider(YandexPlayer<?> yandexPlayer, SystemMediaVolumeProvider systemMediaVolumeProvider) {
        this.yandexPlayer = yandexPlayer;
        this.systemMediaVolumeProvider = systemMediaVolumeProvider;
    }

    public final boolean isPlaybackMuted() {
        return this.systemMediaVolumeProvider.getSystemVolume() == 0.0f || this.yandexPlayer.getVolume() == 0.0f || this.yandexPlayer.isMuted();
    }
}
