package com.squareup.cash.family.familyhub.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ManagedAccountTransferManager$ManagedAccountTransferType {
    public static final /* synthetic */ ManagedAccountTransferManager$ManagedAccountTransferType[] $VALUES;
    public static final ManagedAccountTransferManager$ManagedAccountTransferType ADD_MONEY;
    public static final ManagedAccountTransferManager$ManagedAccountTransferType WITHDRAW;

    static {
        ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType = new ManagedAccountTransferManager$ManagedAccountTransferType("ADD_MONEY", 0);
        ADD_MONEY = managedAccountTransferManager$ManagedAccountTransferType;
        ManagedAccountTransferManager$ManagedAccountTransferType managedAccountTransferManager$ManagedAccountTransferType2 = new ManagedAccountTransferManager$ManagedAccountTransferType("WITHDRAW", 1);
        WITHDRAW = managedAccountTransferManager$ManagedAccountTransferType2;
        $VALUES = new ManagedAccountTransferManager$ManagedAccountTransferType[]{managedAccountTransferManager$ManagedAccountTransferType, managedAccountTransferManager$ManagedAccountTransferType2};
    }

    public static ManagedAccountTransferManager$ManagedAccountTransferType valueOf(String str) {
        return (ManagedAccountTransferManager$ManagedAccountTransferType) Enum.valueOf(ManagedAccountTransferManager$ManagedAccountTransferType.class, str);
    }

    public static ManagedAccountTransferManager$ManagedAccountTransferType[] values() {
        return (ManagedAccountTransferManager$ManagedAccountTransferType[]) $VALUES.clone();
    }
}
