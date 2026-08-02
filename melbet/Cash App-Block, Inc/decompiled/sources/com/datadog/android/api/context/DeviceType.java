package com.datadog.android.api.context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DeviceType {
    public static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType MOBILE;
    public static final DeviceType OTHER;
    public static final DeviceType TABLET;
    public static final DeviceType TV;

    static {
        DeviceType deviceType = new DeviceType("MOBILE", 0);
        MOBILE = deviceType;
        DeviceType deviceType2 = new DeviceType("TABLET", 1);
        TABLET = deviceType2;
        DeviceType deviceType3 = new DeviceType("TV", 2);
        TV = deviceType3;
        DeviceType deviceType4 = new DeviceType("DESKTOP", 3);
        DeviceType deviceType5 = new DeviceType("GAMING_CONSOLE", 4);
        DeviceType deviceType6 = new DeviceType("BOT", 5);
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
