package ru.yandex.video.m3.player.observers;

import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracking.StrmManager;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0004\u0018\u0001`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/observers/StrmManagerToObserverAdapter;", "Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/tracking/StrmManager;", "strmManager", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/tracking/StrmManager;)V", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lzy11;", "onPreparingInternal", "(Lru/yandex/video/m3/player/PreparingParams;Ljava/util/Map;)V", "onPlayerReleased", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmManagerToObserverAdapter implements InternalPlayerObserver {
    public static final int $stable = 0;
    private final YandexPlayer<?> player;
    private final StrmManager strmManager;

    public StrmManagerToObserverAdapter(YandexPlayer<?> yandexPlayer, StrmManager strmManager) {
        this.player = yandexPlayer;
        this.strmManager = strmManager;
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPlayerReleased() {
        this.strmManager.release();
    }

    @Override // ru.yandex.video.m3.player.observers.InternalPlayerObserver
    public void onPreparingInternal(PreparingParams preparingParams, Map<String, ? extends Object> additionalParameters) {
        this.strmManager.start(this.player, additionalParameters, preparingParams.getIsOffline());
    }
}
