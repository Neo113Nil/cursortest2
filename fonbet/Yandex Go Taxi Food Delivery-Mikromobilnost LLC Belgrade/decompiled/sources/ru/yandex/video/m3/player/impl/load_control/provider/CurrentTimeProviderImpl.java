package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/CurrentTimeProviderImpl;", "Lru/yandex/video/m3/player/impl/load_control/provider/CurrentTimeProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<init>", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "", "positionMs", "onAnalyticsPlaybackProgress", "(J)V", "getCurrentTimeMs", "()J", "currentTimeMs", "J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurrentTimeProviderImpl implements CurrentTimeProvider, PlayerAnalyticsObserver {
    public static final int $stable = 8;
    private volatile long currentTimeMs;

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.CurrentTimeProvider
    public long getCurrentTimeMs() {
        return this.currentTimeMs;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAnalyticsPlaybackProgress(long positionMs) {
        this.currentTimeMs = positionMs;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.removeAnalyticsObserver(this);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.addAnalyticsObserver(this);
    }
}
