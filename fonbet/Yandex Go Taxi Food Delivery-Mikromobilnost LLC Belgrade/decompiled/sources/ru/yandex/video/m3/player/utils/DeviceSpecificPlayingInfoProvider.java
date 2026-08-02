package ru.yandex.video.m3.player.utils;

import defpackage.i3y;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfoProvider;", "", "<init>", "()V", "Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;", "deviceSpecific$delegate", "Li3y;", "getDeviceSpecific", "()Lru/yandex/video/m3/player/utils/DeviceSpecificPlayingInfo;", "deviceSpecific", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceSpecificPlayingInfoProvider {
    public static final DeviceSpecificPlayingInfoProvider INSTANCE = new DeviceSpecificPlayingInfoProvider();

    /* renamed from: deviceSpecific$delegate, reason: from kotlin metadata */
    private static final i3y deviceSpecific = a.a(new sls() { // from class: ru.yandex.video.m3.player.utils.DeviceSpecificPlayingInfoProvider$deviceSpecific$2
        @Override // defpackage.sls
        public final DeviceSpecificPlayingInfo invoke() {
            return DeviceSpecificPlayingInfoKt.DeviceSpecificPlayingInfo$default(MediaInfoProvider.INSTANCE.getMediaInfo(), DRMInfoProvider.INSTANCE.getDRMInfo(), null, 4, null);
        }
    });
    public static final int $stable = 8;

    private DeviceSpecificPlayingInfoProvider() {
    }

    public final DeviceSpecificPlayingInfo getDeviceSpecific() {
        return (DeviceSpecificPlayingInfo) deviceSpecific.getValue();
    }
}
