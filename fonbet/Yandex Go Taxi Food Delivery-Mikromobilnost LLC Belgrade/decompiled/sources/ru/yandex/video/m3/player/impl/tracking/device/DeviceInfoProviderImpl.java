package ru.yandex.video.m3.player.impl.tracking.device;

import android.os.Build;
import defpackage.dbj;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProviderImpl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bB3\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0005\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001c¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "Lkotlin/Function0;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "getSourceInfo", "<init>", "(Lsls;)V", "deviceInfo", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)V", "", "id", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "deviceType", "", "", "customInfo", "(Ljava/lang/String;Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;Ljava/util/Map;)V", "info", "", "needsDeviceIdUpdate", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)Z", "isDeviceIdValid", "(Ljava/lang/String;)Z", "isDeviceIdInvalid", "sourceInfo", "populateInfo", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "get", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "populatedInfo", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "rawInfo$delegate", "Li3y;", "getRawInfo", "rawInfo", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceInfoProviderImpl implements DeviceInfoProvider {
    private static final String UNKNOWN = "unknown";
    private static String deviceId;
    private DeviceInfo populatedInfo;

    /* renamed from: rawInfo$delegate, reason: from kotlin metadata */
    private final i3y rawInfo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DeviceInfoProviderImpl(final sls slsVar) {
        this.rawInfo = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl$rawInfo$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final DeviceInfo invoke() {
                try {
                    return (DeviceInfo) sls.this.invoke();
                } catch (Exception unused) {
                    return DeviceInfoKt.DeviceInfo$default(DeviceType.OTHER, null, null, 4, null);
                }
            }
        });
    }

    private final DeviceInfo getRawInfo() {
        return (DeviceInfo) this.rawInfo.getValue();
    }

    private final boolean isDeviceIdInvalid(String id) {
        return !isDeviceIdValid(id);
    }

    private final boolean isDeviceIdValid(String id) {
        return true ^ (id == null || evu0.J(id));
    }

    private final boolean needsDeviceIdUpdate(DeviceInfo info) {
        return isDeviceIdInvalid(info != null ? info.getId() : null) && INSTANCE.getDeviceId() != null;
    }

    private final DeviceInfo populateInfo(final DeviceInfo sourceInfo) {
        DeviceType deviceType;
        String deviceId2;
        boolean isEmulator = EmulatorDetector.INSTANCE.isEmulator();
        if (isEmulator) {
            deviceType = DeviceType.EMULATOR;
        } else {
            if (isEmulator) {
                w511.b();
                return null;
            }
            deviceType = sourceInfo.getDeviceType();
        }
        boolean isDeviceIdValid = isDeviceIdValid(sourceInfo.getId());
        if (isDeviceIdValid) {
            deviceId2 = sourceInfo.getId();
        } else {
            if (isDeviceIdValid) {
                w511.b();
                return null;
            }
            deviceId2 = INSTANCE.getDeviceId();
        }
        return DeviceInfoKt.DeviceInfo(deviceType, deviceId2, new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl$populateInfo$1
            {
                super(1);
            }

            public final void invoke(DeviceInfo.Builder builder) {
                builder.setCodename(DeviceInfo.this.getCodename());
                builder.setCustomInfo(DeviceInfo.this.getCustomInfo());
                String manufacturer = DeviceInfo.this.getManufacturer();
                if (manufacturer == null) {
                    manufacturer = Build.MANUFACTURER;
                }
                String str = null;
                if (manufacturer == null || manufacturer.equals("unknown")) {
                    manufacturer = null;
                }
                builder.setManufacturer(manufacturer);
                String model = DeviceInfo.this.getModel();
                if (model == null) {
                    model = Build.MODEL;
                }
                if (model == null || model.equals("unknown")) {
                    model = null;
                }
                builder.setModel(model);
                String osVersion = DeviceInfo.this.getOsVersion();
                if (osVersion == null) {
                    osVersion = Build.VERSION.RELEASE;
                }
                if (osVersion == null || osVersion.equals("unknown")) {
                    osVersion = null;
                }
                builder.setOsVersion(osVersion);
                String soC = DeviceInfo.this.getSoC() != null ? DeviceInfo.this.getSoC() : Build.VERSION.SDK_INT >= 31 ? Build.SOC_MODEL : null;
                if (soC == null || soC.equals("unknown")) {
                    soC = null;
                }
                builder.setSoC(soC);
                String vendor = DeviceInfo.this.getVendor();
                if (vendor == null) {
                    vendor = Build.MANUFACTURER;
                }
                if (vendor != null && !vendor.equals("unknown")) {
                    str = vendor;
                }
                builder.setVendor(str);
                builder.setWidevineAvailable(Boolean.valueOf(DrmInfoProvider.INSTANCE.isWidevineDrmSupported()));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DeviceInfo.Builder) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider
    /* renamed from: get */
    public DeviceInfo getInfo() {
        DeviceInfo deviceInfo = this.populatedInfo;
        if (deviceInfo == null) {
            deviceInfo = populateInfo(getRawInfo());
            this.populatedInfo = deviceInfo;
        }
        if (!needsDeviceIdUpdate(deviceInfo)) {
            return deviceInfo;
        }
        DeviceInfo populateInfo = populateInfo(getRawInfo());
        this.populatedInfo = populateInfo;
        return populateInfo;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProviderImpl$Companion;", "", "()V", "UNKNOWN", "", "deviceId", "getDeviceId", "()Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getDeviceId() {
            if (DeviceInfoProviderImpl.deviceId == null) {
                DeviceIdProviderImpl.INSTANCE.addListener(new dbj());
            }
            return DeviceInfoProviderImpl.deviceId;
        }

        private Companion() {
        }
    }

    public DeviceInfoProviderImpl(final DeviceInfo deviceInfo) {
        this(new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl.1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final DeviceInfo invoke() {
                return DeviceInfo.this;
            }
        });
    }

    public /* synthetic */ DeviceInfoProviderImpl(String str, DeviceType deviceType, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, deviceType, (i & 4) != 0 ? null : map);
    }

    public DeviceInfoProviderImpl(String str, DeviceType deviceType, final Map<String, ? extends Object> map) {
        this(DeviceInfoKt.DeviceInfo(deviceType, str, new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProviderImpl.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DeviceInfo.Builder) obj);
                return zy11.a;
            }

            public final void invoke(DeviceInfo.Builder builder) {
                builder.setCustomInfo(map);
            }
        }));
    }
}
