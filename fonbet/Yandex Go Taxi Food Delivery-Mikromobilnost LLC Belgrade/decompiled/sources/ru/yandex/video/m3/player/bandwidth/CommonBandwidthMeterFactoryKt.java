package ru.yandex.video.m3.player.bandwidth;

import kotlin.Metadata;
import ru.yandex.video.m3.player.BandwidthMeterFactory;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getCommonFactoryInstance", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "Lru/yandex/video/m3/player/BandwidthMeterFactory$Companion;", "withPlatformSync", "", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonBandwidthMeterFactoryKt {
    public static final BandwidthMeterFactory getCommonFactoryInstance(BandwidthMeterFactory.Companion companion, boolean z) {
        return new CommonBandwidthMeterFactory(z);
    }
}
