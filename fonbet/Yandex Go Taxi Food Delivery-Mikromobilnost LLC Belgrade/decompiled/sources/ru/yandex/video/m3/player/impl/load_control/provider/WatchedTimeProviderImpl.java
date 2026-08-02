package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounterImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00052\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<init>", "()V", "Lzy11;", "stopWatchTimeProvider", "resetWatchTimeProvider", "", "getWatchedTimeMs", "()J", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "watchedTimeProvider", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/YandexPlayer;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WatchedTimeProviderImpl implements WatchedTimeProvider, PlayerAnalyticsObserver {
    private volatile ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl watchedTimeProvider;
    private volatile YandexPlayer<?> yandexPlayer;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SystemTimeProvider timeProvider = new SystemTimeProvider();

    private final void resetWatchTimeProvider() {
        stopWatchTimeProvider();
        YandexPlayer<?> yandexPlayer = this.yandexPlayer;
        if (yandexPlayer != null) {
            ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl watchedTimeProviderImpl = new ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl(yandexPlayer, new TimeCounterImpl(timeProvider));
            this.watchedTimeProvider = watchedTimeProviderImpl;
            yandexPlayer.addObserver(watchedTimeProviderImpl);
            this.watchedTimeProvider = watchedTimeProviderImpl;
        }
    }

    private final void stopWatchTimeProvider() {
        YandexPlayer<?> yandexPlayer;
        ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl watchedTimeProviderImpl = this.watchedTimeProvider;
        if (watchedTimeProviderImpl != null && (yandexPlayer = this.yandexPlayer) != null) {
            yandexPlayer.removeObserver(watchedTimeProviderImpl);
        }
        this.watchedTimeProvider = null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.WatchedTimeProvider
    public long getWatchedTimeMs() {
        ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl watchedTimeProviderImpl = this.watchedTimeProvider;
        if (watchedTimeProviderImpl != null) {
            return watchedTimeProviderImpl.getWatchedTime();
        }
        return 0L;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        resetWatchTimeProvider();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        stopWatchTimeProvider();
        yandexPlayer.removeAnalyticsObserver(this);
        this.yandexPlayer = null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        this.yandexPlayer = yandexPlayer;
        resetWatchTimeProvider();
        yandexPlayer.addAnalyticsObserver(this);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/WatchedTimeProviderImpl$Companion;", "", "()V", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/SystemTimeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
