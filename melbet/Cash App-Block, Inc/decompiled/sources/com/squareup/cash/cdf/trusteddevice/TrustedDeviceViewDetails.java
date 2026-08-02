package com.squareup.cash.cdf.trusteddevice;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TrustedDeviceViewDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_this_device;
    public final String last_login_date;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final DeviceType f1107type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class DeviceType {
        public static final /* synthetic */ DeviceType[] $VALUES;
        public static final DeviceType ANDROID;
        public static final DeviceType IPAD;
        public static final DeviceType IPHONE;
        public static final DeviceType IPOD_TOUCH;
        public static final DeviceType MAC;
        public static final DeviceType OTHER;
        public static final DeviceType WINDOWS;

        static {
            DeviceType deviceType = new DeviceType("ANDROID", 0);
            ANDROID = deviceType;
            DeviceType deviceType2 = new DeviceType("IPHONE", 1);
            IPHONE = deviceType2;
            DeviceType deviceType3 = new DeviceType("MAC", 2);
            MAC = deviceType3;
            DeviceType deviceType4 = new DeviceType("WINDOWS", 3);
            WINDOWS = deviceType4;
            DeviceType deviceType5 = new DeviceType("IPOD_TOUCH", 4);
            IPOD_TOUCH = deviceType5;
            DeviceType deviceType6 = new DeviceType("IPAD", 5);
            IPAD = deviceType6;
            DeviceType deviceType7 = new DeviceType("OTHER", 6);
            OTHER = deviceType7;
            $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4, deviceType5, deviceType6, deviceType7};
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }
    }

    public TrustedDeviceViewDetails(Boolean bool, String str, DeviceType deviceType) {
        this.is_this_device = bool;
        this.last_login_date = str;
        this.f1107type = deviceType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "TrustedDevice", "cdf_action", "View");
        Countries.putSafe(m, "is_this_device", bool);
        Countries.putSafe(m, "last_login_date", str);
        Countries.putSafe(m, "type", deviceType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedDeviceViewDetails)) {
            return false;
        }
        TrustedDeviceViewDetails trustedDeviceViewDetails = (TrustedDeviceViewDetails) obj;
        return this.is_this_device.equals(trustedDeviceViewDetails.is_this_device) && Intrinsics.areEqual(this.last_login_date, trustedDeviceViewDetails.last_login_date) && this.f1107type == trustedDeviceViewDetails.f1107type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice View Details";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.is_this_device.hashCode() * 31;
        String str = this.last_login_date;
        return (this.f1107type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
    }

    public final String toString() {
        return "TrustedDeviceViewDetails(is_this_device=" + this.is_this_device + ", last_login_date=" + this.last_login_date + ", type=" + this.f1107type + ", source=null)";
    }
}
