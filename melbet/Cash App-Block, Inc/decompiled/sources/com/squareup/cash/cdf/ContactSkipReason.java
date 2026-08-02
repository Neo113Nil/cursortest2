package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactSkipReason {
    public static final /* synthetic */ ContactSkipReason[] $VALUES;
    public static final ContactSkipReason EMPTY_CONTACTS;

    static {
        ContactSkipReason contactSkipReason = new ContactSkipReason("EMPTY_CONTACTS", 0);
        EMPTY_CONTACTS = contactSkipReason;
        $VALUES = new ContactSkipReason[]{contactSkipReason, new ContactSkipReason("TOO_MANY_ATTEMPTS", 1), new ContactSkipReason("SYNC_DISABLED", 2)};
    }

    public static ContactSkipReason valueOf(String str) {
        return (ContactSkipReason) Enum.valueOf(ContactSkipReason.class, str);
    }

    public static ContactSkipReason[] values() {
        return (ContactSkipReason[]) $VALUES.clone();
    }
}
