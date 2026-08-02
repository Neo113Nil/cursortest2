package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.battery.BatteryState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lru/yandex/video/m3/player/impl/tracking/data/BatteryStateDto;", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatteryStateDtoKt {
    public static final BatteryStateDto toDto(BatteryState batteryState) {
        return new BatteryStateDto(batteryState.getBatteryPercentage(), batteryState.isCharging(), batteryState.isPowerSaveMode());
    }
}
