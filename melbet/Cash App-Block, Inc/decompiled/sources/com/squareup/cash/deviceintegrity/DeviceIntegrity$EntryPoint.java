package com.squareup.cash.deviceintegrity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeviceIntegrity$EntryPoint {
    public static final /* synthetic */ DeviceIntegrity$EntryPoint[] $VALUES;
    public static final DeviceIntegrity$EntryPoint INITIATE_SESSION;
    public static final DeviceIntegrity$EntryPoint PERSONA_DIDV;
    public static final DeviceIntegrity$EntryPoint PUSH_NOTIFICATION;
    public static final DeviceIntegrity$EntryPoint REFRESH_SESSION;
    public static final DeviceIntegrity$EntryPoint TTP;

    static {
        DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = new DeviceIntegrity$EntryPoint("INITIATE_SESSION", 0);
        INITIATE_SESSION = deviceIntegrity$EntryPoint;
        DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint2 = new DeviceIntegrity$EntryPoint("REFRESH_SESSION", 1);
        REFRESH_SESSION = deviceIntegrity$EntryPoint2;
        DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint3 = new DeviceIntegrity$EntryPoint("PUSH_NOTIFICATION", 2);
        PUSH_NOTIFICATION = deviceIntegrity$EntryPoint3;
        DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint4 = new DeviceIntegrity$EntryPoint("PERSONA_DIDV", 3);
        PERSONA_DIDV = deviceIntegrity$EntryPoint4;
        DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint5 = new DeviceIntegrity$EntryPoint("TTP", 4);
        TTP = deviceIntegrity$EntryPoint5;
        $VALUES = new DeviceIntegrity$EntryPoint[]{deviceIntegrity$EntryPoint, deviceIntegrity$EntryPoint2, deviceIntegrity$EntryPoint3, deviceIntegrity$EntryPoint4, deviceIntegrity$EntryPoint5, new DeviceIntegrity$EntryPoint("DEBUG_MENU", 5)};
    }

    public static DeviceIntegrity$EntryPoint valueOf(String str) {
        return (DeviceIntegrity$EntryPoint) Enum.valueOf(DeviceIntegrity$EntryPoint.class, str);
    }

    public static DeviceIntegrity$EntryPoint[] values() {
        return (DeviceIntegrity$EntryPoint[]) $VALUES.clone();
    }
}
