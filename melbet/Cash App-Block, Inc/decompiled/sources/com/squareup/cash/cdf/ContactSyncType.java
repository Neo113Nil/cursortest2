package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactSyncType {
    public static final /* synthetic */ ContactSyncType[] $VALUES;
    public static final ContactSyncType FRESH;
    public static final ContactSyncType INCREMENTAL;

    static {
        ContactSyncType contactSyncType = new ContactSyncType("INCREMENTAL", 0);
        INCREMENTAL = contactSyncType;
        ContactSyncType contactSyncType2 = new ContactSyncType("FRESH", 1);
        FRESH = contactSyncType2;
        $VALUES = new ContactSyncType[]{contactSyncType, contactSyncType2};
    }

    public static ContactSyncType valueOf(String str) {
        return (ContactSyncType) Enum.valueOf(ContactSyncType.class, str);
    }

    public static ContactSyncType[] values() {
        return (ContactSyncType[]) $VALUES.clone();
    }
}
