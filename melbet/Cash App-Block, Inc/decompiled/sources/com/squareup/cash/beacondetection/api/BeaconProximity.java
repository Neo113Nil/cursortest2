package com.squareup.cash.beacondetection.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BeaconProximity {
    public static final /* synthetic */ BeaconProximity[] $VALUES;
    public static final BeaconProximity FAR;
    public static final BeaconProximity IMMEDIATE;
    public static final BeaconProximity NEAR;
    public static final BeaconProximity UNKNOWN;

    static {
        BeaconProximity beaconProximity = new BeaconProximity("IMMEDIATE", 0);
        IMMEDIATE = beaconProximity;
        BeaconProximity beaconProximity2 = new BeaconProximity("NEAR", 1);
        NEAR = beaconProximity2;
        BeaconProximity beaconProximity3 = new BeaconProximity("FAR", 2);
        FAR = beaconProximity3;
        BeaconProximity beaconProximity4 = new BeaconProximity("UNKNOWN", 3);
        UNKNOWN = beaconProximity4;
        $VALUES = new BeaconProximity[]{beaconProximity, beaconProximity2, beaconProximity3, beaconProximity4};
    }

    public static BeaconProximity valueOf(String str) {
        return (BeaconProximity) Enum.valueOf(BeaconProximity.class, str);
    }

    public static BeaconProximity[] values() {
        return (BeaconProximity[]) $VALUES.clone();
    }
}
