package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.player.api.tracking.BatteryStateProvider;
import ru.yandex.video.m3.player.utils.battery.BatteryState;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/BatteryStateProviderImpl;", "Lru/yandex/video/m3/player/api/tracking/BatteryStateProvider;", "()V", "batteryState", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "getBatteryState", "()Lru/yandex/video/m3/player/utils/battery/BatteryState;", "setBatteryState", "(Lru/yandex/video/m3/player/utils/battery/BatteryState;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatteryStateProviderImpl implements BatteryStateProvider {
    public static final int $stable = 8;
    private BatteryState batteryState;

    @Override // ru.yandex.video.m3.player.api.tracking.BatteryStateProvider
    public BatteryState getBatteryState() {
        return this.batteryState;
    }

    public void setBatteryState(BatteryState batteryState) {
        this.batteryState = batteryState;
    }
}
