package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "watchCounter", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;)V", "", "getWatchedTime", "()J", "Lzy11;", "onResumePlayback", "()V", "onPausePlayback", "onPlaybackEnded", "onLoadingStart", "onLoadingFinished", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WatchedTimeProviderImpl implements WatchedTimeProvider, PlayerObserver<Object> {
    public static final int $stable = 0;
    private final YandexPlayer<?> player;
    private final TimeCounter watchCounter;

    public WatchedTimeProviderImpl(YandexPlayer<?> yandexPlayer, TimeCounter timeCounter) {
        this.player = yandexPlayer;
        this.watchCounter = timeCounter;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.WatchedTimeProvider
    public long getWatchedTime() {
        return this.watchCounter.getTime();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdEnd() {
        if (!this.player.isPlaying() || this.player.isPlayingAd()) {
            return;
        }
        this.watchCounter.start();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdStart(Ad ad) {
        this.watchCounter.stop();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingFinished() {
        if (!this.player.isPlaying() || this.player.isPlayingAd()) {
            return;
        }
        this.watchCounter.start();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingStart() {
        this.watchCounter.stop();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPausePlayback() {
        this.watchCounter.stop();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackEnded() {
        this.watchCounter.stop();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlaybackError(PlaybackException playbackException) {
        this.watchCounter.stop();
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onResumePlayback() {
        this.watchCounter.start();
    }
}
