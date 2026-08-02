package com.squareup.cash.cdf.minttag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class DeviceType {
    public static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType HEART;
    public static final DeviceType MINI_CARD;
    public static final DeviceType WAND;

    static {
        DeviceType deviceType = new DeviceType("WAND", 0);
        WAND = deviceType;
        DeviceType deviceType2 = new DeviceType("MINI_CARD", 1);
        MINI_CARD = deviceType2;
        DeviceType deviceType3 = new DeviceType("HEART", 2);
        HEART = deviceType3;
        $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3};
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }
}
