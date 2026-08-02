package com.squareup.cash.nearby.backend.ble;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BleDeviceState {
    public static final /* synthetic */ BleDeviceState[] $VALUES;
    public static final BleDeviceState DISABLED;
    public static final BleDeviceState ENABLED;
    public static final BleDeviceState UNAVAILABLE;

    static {
        BleDeviceState bleDeviceState = new BleDeviceState("UNAVAILABLE", 0);
        UNAVAILABLE = bleDeviceState;
        BleDeviceState bleDeviceState2 = new BleDeviceState("DISABLED", 1);
        DISABLED = bleDeviceState2;
        BleDeviceState bleDeviceState3 = new BleDeviceState("ENABLED", 2);
        ENABLED = bleDeviceState3;
        $VALUES = new BleDeviceState[]{bleDeviceState, bleDeviceState2, bleDeviceState3};
    }

    public static BleDeviceState valueOf(String str) {
        return (BleDeviceState) Enum.valueOf(BleDeviceState.class, str);
    }

    public static BleDeviceState[] values() {
        return (BleDeviceState[]) $VALUES.clone();
    }
}
