package com.squareup.cash.benefits.components.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class GreenStatus {
    public static final /* synthetic */ GreenStatus[] $VALUES;
    public static final GreenStatus ACTIVE;
    public static final GreenStatus INACTIVE;

    static {
        GreenStatus greenStatus = new GreenStatus("INACTIVE", 0);
        INACTIVE = greenStatus;
        GreenStatus greenStatus2 = new GreenStatus("ACTIVE", 1);
        ACTIVE = greenStatus2;
        $VALUES = new GreenStatus[]{greenStatus, greenStatus2};
    }

    public static GreenStatus valueOf(String str) {
        return (GreenStatus) Enum.valueOf(GreenStatus.class, str);
    }

    public static GreenStatus[] values() {
        return (GreenStatus[]) $VALUES.clone();
    }
}
