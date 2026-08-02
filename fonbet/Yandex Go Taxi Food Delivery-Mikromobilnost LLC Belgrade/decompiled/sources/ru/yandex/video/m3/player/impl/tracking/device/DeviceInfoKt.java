package ru.yandex.video.m3.player.impl.tracking.device;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "deviceType", "", "id", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "DeviceInfo", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;Ljava/lang/String;Ltls;)Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceInfoKt {
    public static final /* synthetic */ DeviceInfo DeviceInfo(DeviceType deviceType, String str, tls tlsVar) {
        DeviceInfo.Builder builder = new DeviceInfo.Builder(deviceType, str);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DeviceInfo DeviceInfo$default(DeviceType deviceType, String str, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoKt$DeviceInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DeviceInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DeviceInfo.Builder builder) {
                }
            };
        }
        return DeviceInfo(deviceType, str, tlsVar);
    }
}
