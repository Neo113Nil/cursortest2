package ru.yandex.video.m3.player.observers;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.BasePlayerStrategy;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001bJ\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u001bJ\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u001bJ\u000f\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010\u001bJ\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010\u001bR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/¨\u00060"}, d2 = {"Lru/yandex/video/m3/player/observers/PlayerStrategyToObserverAdapter;", "Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/PlayerStrategy;", "playerStrategy", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerStrategy;)V", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lzy11;", "onPreparingInternal", "(Lru/yandex/video/m3/player/PreparingParams;Ljava/util/Map;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "startPosition", "", "autoPlay", "onPreparedInternal", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;Z)V", "onPlayerReleased", "()V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onEngineBufferingStart", "onEngineBufferingEnd", "onPausePlayback", "onResumePlayback", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/PlayerStrategy;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerStrategyToObserverAdapter implements InternalPlayerObserver {
    public static final int $stable = 0;
    private final YandexPlayer<?> player;
    private final PlayerStrategy<?> playerStrategy;

    public PlayerStrategyToObserverAdapter(YandexPlayer<?> yandexPlayer, PlayerStrategy<?> playerStrategy) {
        this.player = yandexPlayer;
        this.playerStrategy = playerStrategy;
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdEnd() {
        this.playerStrategy.onAdEnd();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdError(AdException exception) {
        this.playerStrategy.onAdError(exception);
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdPodEnd() {
        this.playerStrategy.onAdPodEnd();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdPodStart(Ad ad, int index) {
        this.playerStrategy.onAdPodStart(ad, index);
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onAdStart(Ad ad) {
        this.playerStrategy.onAdStart(ad);
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onEngineBufferingEnd() {
        this.playerStrategy.onBufferingEnd();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onEngineBufferingStart() {
        this.playerStrategy.onBufferingStart();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPausePlayback() {
        this.playerStrategy.onPausePlayback();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPlayerReleased() {
        PlayerStrategy<?> playerStrategy = this.playerStrategy;
        BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
        if (basePlayerStrategy != null) {
            basePlayerStrategy.onRelease();
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPreparedInternal(VideoData videoData, Long startPosition, boolean autoPlay) throws ClassCastException {
        PlayerStrategy<?> playerStrategy = this.playerStrategy;
        BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
        if (basePlayerStrategy != null) {
            basePlayerStrategy.onPreparedInternal$video_player_internalRelease(videoData, startPosition, autoPlay);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPreparingInternal(PreparingParams preparingParams, Map<String, ? extends Object> additionalParameters) {
        PlayerStrategy<?> playerStrategy = this.playerStrategy;
        BasePlayerStrategy basePlayerStrategy = playerStrategy instanceof BasePlayerStrategy ? (BasePlayerStrategy) playerStrategy : null;
        if (basePlayerStrategy != null) {
            basePlayerStrategy.onPreparing(additionalParameters);
        }
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onResumePlayback() {
        this.playerStrategy.onResumePlayback();
    }
}
