package com.squareup.cash.session.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SyncState$Progress {
    public static final /* synthetic */ SyncState$Progress[] $VALUES;
    public static final SyncState$Progress FAILURE;
    public static final SyncState$Progress IN_FLIGHT;
    public static final SyncState$Progress SUCCESS;

    static {
        SyncState$Progress syncState$Progress = new SyncState$Progress("IN_FLIGHT", 0);
        IN_FLIGHT = syncState$Progress;
        SyncState$Progress syncState$Progress2 = new SyncState$Progress("SUCCESS", 1);
        SUCCESS = syncState$Progress2;
        SyncState$Progress syncState$Progress3 = new SyncState$Progress("FAILURE", 2);
        FAILURE = syncState$Progress3;
        $VALUES = new SyncState$Progress[]{syncState$Progress, syncState$Progress2, syncState$Progress3};
    }

    public static SyncState$Progress valueOf(String str) {
        return (SyncState$Progress) Enum.valueOf(SyncState$Progress.class, str);
    }

    public static SyncState$Progress[] values() {
        return (SyncState$Progress[]) $VALUES.clone();
    }
}
