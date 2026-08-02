package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.api.tracking.UserQualityInfoProvider;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@RX\u0096\u000e¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/UserQualityInfoProviderImpl;", "Lru/yandex/video/m3/player/api/tracking/UserQualityInfoProvider;", "()V", "playerAnalyticsObserver", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "getPlayerAnalyticsObserver", "()Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<set-?>", "", "userQuality", "getUserQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserQualityInfoProviderImpl implements UserQualityInfoProvider {
    public static final int $stable = 8;
    private final PlayerAnalyticsObserver playerAnalyticsObserver = new PlayerAnalyticsObserver() { // from class: ru.yandex.video.m3.player.impl.tracking.UserQualityInfoProviderImpl$playerAnalyticsObserver$1
        @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
        public void onUserManuallySelectedQuality(Integer quality) {
            UserQualityInfoProviderImpl.this.userQuality = quality;
        }
    };
    private Integer userQuality;

    public final PlayerAnalyticsObserver getPlayerAnalyticsObserver() {
        return this.playerAnalyticsObserver;
    }

    @Override // ru.yandex.video.m3.player.api.tracking.UserQualityInfoProvider
    public Integer getUserQuality() {
        return this.userQuality;
    }
}
