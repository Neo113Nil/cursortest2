package ru.yandex.video.m3.player.impl.tracking.device;

import defpackage.jxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/EmptyDeviceInfoProvider;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "()V", "info", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "getInfo", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "get", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyDeviceInfoProvider implements DeviceInfoProvider {
    private final DeviceInfo info = DeviceInfoKt.DeviceInfo$default(DeviceType.OTHER, null, null, 4, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final EmptyDeviceInfoProvider provider = new EmptyDeviceInfoProvider();

    @Override // ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider
    /* renamed from: get, reason: from getter */
    public DeviceInfo getInfo() {
        return this.info;
    }

    public final DeviceInfo getInfo() {
        return this.info;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/EmptyDeviceInfoProvider$Companion;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "()V", "provider", "Lru/yandex/video/m3/player/impl/tracking/device/EmptyDeviceInfoProvider;", "get", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements DeviceInfoProvider {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider
        /* renamed from: get */
        public DeviceInfo getInfo() {
            return EmptyDeviceInfoProvider.provider.getInfo();
        }

        private Companion() {
        }
    }
}
