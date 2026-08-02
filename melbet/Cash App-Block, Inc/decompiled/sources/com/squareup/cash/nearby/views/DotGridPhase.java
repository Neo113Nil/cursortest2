package com.squareup.cash.nearby.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DotGridPhase {
    public static final /* synthetic */ DotGridPhase[] $VALUES;
    public static final DotGridPhase BluetoothPulse;
    public static final DotGridPhase ErrorPulse;
    public static final DotGridPhase Formation;
    public static final DotGridPhase NuxPulse;
    public static final DotGridPhase PersonFound;
    public static final DotGridPhase RadialPulsing;
    public static final DotGridPhase RadialTransition;
    public static final DotGridPhase Scanning;

    /* JADX INFO: Fake field, exist only in values array */
    DotGridPhase EF0;

    static {
        DotGridPhase dotGridPhase = new DotGridPhase("Idle", 0);
        DotGridPhase dotGridPhase2 = new DotGridPhase("Formation", 1);
        Formation = dotGridPhase2;
        DotGridPhase dotGridPhase3 = new DotGridPhase("NuxPulse", 2);
        NuxPulse = dotGridPhase3;
        DotGridPhase dotGridPhase4 = new DotGridPhase("Scanning", 3);
        Scanning = dotGridPhase4;
        DotGridPhase dotGridPhase5 = new DotGridPhase("PersonFound", 4);
        PersonFound = dotGridPhase5;
        DotGridPhase dotGridPhase6 = new DotGridPhase("RadialTransition", 5);
        RadialTransition = dotGridPhase6;
        DotGridPhase dotGridPhase7 = new DotGridPhase("RadialPulsing", 6);
        RadialPulsing = dotGridPhase7;
        DotGridPhase dotGridPhase8 = new DotGridPhase("BluetoothPulse", 7);
        BluetoothPulse = dotGridPhase8;
        DotGridPhase dotGridPhase9 = new DotGridPhase("ErrorPulse", 8);
        ErrorPulse = dotGridPhase9;
        $VALUES = new DotGridPhase[]{dotGridPhase, dotGridPhase2, dotGridPhase3, dotGridPhase4, dotGridPhase5, dotGridPhase6, dotGridPhase7, dotGridPhase8, dotGridPhase9};
    }

    public static DotGridPhase valueOf(String str) {
        return (DotGridPhase) Enum.valueOf(DotGridPhase.class, str);
    }

    public static DotGridPhase[] values() {
        return (DotGridPhase[]) $VALUES.clone();
    }
}
