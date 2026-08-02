package ru.yandex.video.m3.player.api.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.battery.BatteryState;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/api/tracking/BatteryStateProvider;", "", "batteryState", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "getBatteryState", "()Lru/yandex/video/m3/player/utils/battery/BatteryState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BatteryStateProvider {
    BatteryState getBatteryState();
}
