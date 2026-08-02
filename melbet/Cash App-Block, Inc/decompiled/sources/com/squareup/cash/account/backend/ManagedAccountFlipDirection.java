package com.squareup.cash.account.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ManagedAccountFlipDirection {
    public static final /* synthetic */ ManagedAccountFlipDirection[] $VALUES;
    public static final ManagedAccountFlipDirection TO_KID;
    public static final ManagedAccountFlipDirection TO_SPONSOR;

    static {
        ManagedAccountFlipDirection managedAccountFlipDirection = new ManagedAccountFlipDirection("TO_KID", 0);
        TO_KID = managedAccountFlipDirection;
        ManagedAccountFlipDirection managedAccountFlipDirection2 = new ManagedAccountFlipDirection("TO_SPONSOR", 1);
        TO_SPONSOR = managedAccountFlipDirection2;
        $VALUES = new ManagedAccountFlipDirection[]{managedAccountFlipDirection, managedAccountFlipDirection2};
    }

    public static ManagedAccountFlipDirection valueOf(String str) {
        return (ManagedAccountFlipDirection) Enum.valueOf(ManagedAccountFlipDirection.class, str);
    }

    public static ManagedAccountFlipDirection[] values() {
        return (ManagedAccountFlipDirection[]) $VALUES.clone();
    }
}
