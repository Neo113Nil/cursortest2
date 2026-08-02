package com.squareup.cash.device;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DeviceOrientation {
    public static final /* synthetic */ DeviceOrientation[] $VALUES;
    public static final DeviceOrientation LANDSCAPE_LEFT;
    public static final DeviceOrientation LANDSCAPE_RIGHT;
    public static final DeviceOrientation PORTRAIT;
    public static final DeviceOrientation PORTRAIT_UPSIDE_DOWN;
    public static final DeviceOrientation UNKNOWN;

    static {
        DeviceOrientation deviceOrientation = new DeviceOrientation("PORTRAIT", 0);
        PORTRAIT = deviceOrientation;
        DeviceOrientation deviceOrientation2 = new DeviceOrientation("PORTRAIT_UPSIDE_DOWN", 1);
        PORTRAIT_UPSIDE_DOWN = deviceOrientation2;
        DeviceOrientation deviceOrientation3 = new DeviceOrientation("LANDSCAPE_RIGHT", 2);
        LANDSCAPE_RIGHT = deviceOrientation3;
        DeviceOrientation deviceOrientation4 = new DeviceOrientation("LANDSCAPE_LEFT", 3);
        LANDSCAPE_LEFT = deviceOrientation4;
        DeviceOrientation deviceOrientation5 = new DeviceOrientation("UNKNOWN", 4);
        UNKNOWN = deviceOrientation5;
        $VALUES = new DeviceOrientation[]{deviceOrientation, deviceOrientation2, deviceOrientation3, deviceOrientation4, deviceOrientation5};
    }

    public static DeviceOrientation valueOf(String str) {
        return (DeviceOrientation) Enum.valueOf(DeviceOrientation.class, str);
    }

    public static DeviceOrientation[] values() {
        return (DeviceOrientation[]) $VALUES.clone();
    }
}
