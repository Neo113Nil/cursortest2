package com.squareup.cash.profile.devicemanager.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DeviceType {
    public static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType ANDROID;
    public static final DeviceType BROWSER;
    public static final DeviceType IPAD;
    public static final DeviceType IPHONE;
    public static final DeviceType IPOD_TOUCH;
    public static final DeviceType MAC;
    public static final DeviceType OTHER;
    public static final DeviceType WINDOWS;

    static {
        DeviceType deviceType = new DeviceType("BROWSER", 0);
        BROWSER = deviceType;
        DeviceType deviceType2 = new DeviceType("ANDROID", 1);
        ANDROID = deviceType2;
        DeviceType deviceType3 = new DeviceType("IPHONE", 2);
        IPHONE = deviceType3;
        DeviceType deviceType4 = new DeviceType("MAC", 3);
        MAC = deviceType4;
        DeviceType deviceType5 = new DeviceType("WINDOWS", 4);
        WINDOWS = deviceType5;
        DeviceType deviceType6 = new DeviceType("IPAD", 5);
        IPAD = deviceType6;
        DeviceType deviceType7 = new DeviceType("IPOD_TOUCH", 6);
        IPOD_TOUCH = deviceType7;
        DeviceType deviceType8 = new DeviceType("OTHER", 7);
        OTHER = deviceType8;
        $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4, deviceType5, deviceType6, deviceType7, deviceType8};
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }
}
