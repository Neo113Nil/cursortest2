package ru.yandex.video.m3.player.impl.tracking.device;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.sls;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u00010Bw\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R/\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010!¨\u00061"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "deviceType", "", "id", "codename", "", "customInfo", "manufacturer", "model", "osVersion", "SoC", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "widevineAvailable", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "getDeviceType", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getCodename", "Ljava/util/Map;", "getCustomInfo", "()Ljava/util/Map;", "getManufacturer", "getModel", "getOsVersion", "getSoC", "getVendor", "Ljava/lang/Boolean;", "getWidevineAvailable", "()Ljava/lang/Boolean;", "properties$delegate", "Li3y;", "getProperties", "getProperties$annotations", "()V", "properties", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceInfo {
    public static final int $stable = 8;
    private final String SoC;
    private final String codename;
    private final Map<String, Object> customInfo;
    private final DeviceType deviceType;
    private final String id;
    private final String manufacturer;
    private final String model;
    private final String osVersion;

    /* renamed from: properties$delegate, reason: from kotlin metadata */
    private final i3y properties;
    private final String vendor;
    private final Boolean widevineAvailable;

    private DeviceInfo(DeviceType deviceType, String str, String str2, Map<String, ? extends Object> map, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.deviceType = deviceType;
        this.id = str;
        this.codename = str2;
        this.customInfo = map;
        this.manufacturer = str3;
        this.model = str4;
        this.osVersion = str5;
        this.SoC = str6;
        this.vendor = str7;
        this.widevineAvailable = bool;
        this.properties = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.device.DeviceInfo$properties$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Map<String, Object> invoke() {
                return b.i(new Pair("codename", DeviceInfo.this.getCodename()), new Pair("customInfo", DeviceInfo.this.getCustomInfo()), new Pair("deviceType", DeviceInfo.this.getDeviceType()), new Pair("id", DeviceInfo.this.getId()), new Pair("manufacturer", DeviceInfo.this.getManufacturer()), new Pair("model", DeviceInfo.this.getModel()), new Pair("osVersion", DeviceInfo.this.getOsVersion()), new Pair("SoC", DeviceInfo.this.getSoC()), new Pair(DRMInfoProvider.MediaDRMKeys.VENDOR, DeviceInfo.this.getVendor()), new Pair("widevineAvailable", DeviceInfo.this.getWidevineAvailable()));
            }
        });
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DeviceInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return this.deviceType == deviceInfo.deviceType && jl40.l(this.id, deviceInfo.id) && jl40.l(this.codename, deviceInfo.codename) && jl40.l(this.customInfo, deviceInfo.customInfo) && jl40.l(this.manufacturer, deviceInfo.manufacturer) && jl40.l(this.model, deviceInfo.model) && jl40.l(this.osVersion, deviceInfo.osVersion) && jl40.l(this.SoC, deviceInfo.SoC) && jl40.l(this.vendor, deviceInfo.vendor) && jl40.l(this.widevineAvailable, deviceInfo.widevineAvailable);
    }

    public final String getCodename() {
        return this.codename;
    }

    public final Map<String, Object> getCustomInfo() {
        return this.customInfo;
    }

    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Map<String, Object> getProperties() {
        return (Map) this.properties.getValue();
    }

    public final String getSoC() {
        return this.SoC;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final Boolean getWidevineAvailable() {
        return this.widevineAvailable;
    }

    public int hashCode() {
        int hashCode = this.deviceType.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.codename;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.customInfo;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        String str3 = this.manufacturer;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.model;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.osVersion;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.SoC;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.vendor;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool = this.widevineAvailable;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public /* synthetic */ DeviceInfo(DeviceType deviceType, String str, String str2, Map map, String str3, String str4, String str5, String str6, String str7, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceType, str, str2, map, str3, str4, str5, str6, str7, bool);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\r\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0002\b2R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001e\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo$Builder;", "", "deviceInfo", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;)V", "deviceType", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "id", "", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;Ljava/lang/String;)V", "SoC", "getSoC", "()Ljava/lang/String;", "setSoC", "(Ljava/lang/String;)V", "codename", "getCodename", "setCodename", "customInfo", "", "getCustomInfo", "()Ljava/util/Map;", "setCustomInfo", "(Ljava/util/Map;)V", "getDeviceType", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;", "setDeviceType", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceType;)V", "getId", "setId", "manufacturer", "getManufacturer", "setManufacturer", "model", "getModel", "setModel", "osVersion", "getOsVersion", "setOsVersion", DRMInfoProvider.MediaDRMKeys.VENDOR, "getVendor", "setVendor", "widevineAvailable", "", "getWidevineAvailable", "()Ljava/lang/Boolean;", "setWidevineAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String SoC;
        private String codename;
        private Map<String, ? extends Object> customInfo;
        private DeviceType deviceType;
        private String id;
        private String manufacturer;
        private String model;
        private String osVersion;
        private String vendor;
        private Boolean widevineAvailable;

        public Builder(DeviceInfo deviceInfo) {
            this(deviceInfo.getDeviceType(), deviceInfo.getId());
            this.codename = deviceInfo.getCodename();
            this.customInfo = deviceInfo.getCustomInfo();
            this.manufacturer = deviceInfo.getManufacturer();
            this.model = deviceInfo.getModel();
            this.osVersion = deviceInfo.getOsVersion();
            this.SoC = deviceInfo.getSoC();
            this.vendor = deviceInfo.getVendor();
            this.widevineAvailable = deviceInfo.getWidevineAvailable();
        }

        public final DeviceInfo build$video_player_internalRelease() {
            return new DeviceInfo(this.deviceType, this.id, this.codename, this.customInfo, this.manufacturer, this.model, this.osVersion, this.SoC, this.vendor, this.widevineAvailable, null);
        }

        public final String getCodename() {
            return this.codename;
        }

        public final Map<String, Object> getCustomInfo() {
            return this.customInfo;
        }

        public final DeviceType getDeviceType() {
            return this.deviceType;
        }

        public final String getId() {
            return this.id;
        }

        public final String getManufacturer() {
            return this.manufacturer;
        }

        public final String getModel() {
            return this.model;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public final String getSoC() {
            return this.SoC;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public final Boolean getWidevineAvailable() {
            return this.widevineAvailable;
        }

        public final void setCodename(String str) {
            this.codename = str;
        }

        public final void setCustomInfo(Map<String, ? extends Object> map) {
            this.customInfo = map;
        }

        public final void setDeviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setManufacturer(String str) {
            this.manufacturer = str;
        }

        public final void setModel(String str) {
            this.model = str;
        }

        public final void setOsVersion(String str) {
            this.osVersion = str;
        }

        public final void setSoC(String str) {
            this.SoC = str;
        }

        public final void setVendor(String str) {
            this.vendor = str;
        }

        public final void setWidevineAvailable(Boolean bool) {
            this.widevineAvailable = bool;
        }

        public Builder(DeviceType deviceType, String str) {
            this.deviceType = deviceType;
            this.id = str;
        }
    }
}
