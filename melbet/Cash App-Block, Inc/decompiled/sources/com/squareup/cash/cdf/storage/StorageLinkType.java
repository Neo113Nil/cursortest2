package com.squareup.cash.cdf.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class StorageLinkType {
    public static final /* synthetic */ StorageLinkType[] $VALUES;
    public static final StorageLinkType Legacy;
    public static final StorageLinkType Sandboxed;

    static {
        StorageLinkType storageLinkType = new StorageLinkType("Legacy", 0);
        Legacy = storageLinkType;
        StorageLinkType storageLinkType2 = new StorageLinkType("Sandboxed", 1);
        Sandboxed = storageLinkType2;
        $VALUES = new StorageLinkType[]{storageLinkType, storageLinkType2};
    }

    public static StorageLinkType valueOf(String str) {
        return (StorageLinkType) Enum.valueOf(StorageLinkType.class, str);
    }

    public static StorageLinkType[] values() {
        return (StorageLinkType[]) $VALUES.clone();
    }
}
