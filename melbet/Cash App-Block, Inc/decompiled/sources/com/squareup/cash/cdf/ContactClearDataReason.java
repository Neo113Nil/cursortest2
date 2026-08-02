package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactClearDataReason {
    public static final /* synthetic */ ContactClearDataReason[] $VALUES;
    public static final ContactClearDataReason NON_RETRYABLE_ERROR;
    public static final ContactClearDataReason PERMISSION_DENIED;
    public static final ContactClearDataReason SIGN_OUT;

    static {
        ContactClearDataReason contactClearDataReason = new ContactClearDataReason("SIGN_OUT", 0);
        SIGN_OUT = contactClearDataReason;
        ContactClearDataReason contactClearDataReason2 = new ContactClearDataReason("ACCOUNT_SWITCH", 1);
        ContactClearDataReason contactClearDataReason3 = new ContactClearDataReason("CLEAR_APP_DATA", 2);
        ContactClearDataReason contactClearDataReason4 = new ContactClearDataReason("PERMISSION_DENIED", 3);
        PERMISSION_DENIED = contactClearDataReason4;
        ContactClearDataReason contactClearDataReason5 = new ContactClearDataReason("FORCE_FRESH_SYNC", 4);
        ContactClearDataReason contactClearDataReason6 = new ContactClearDataReason("NON_RETRYABLE_ERROR", 5);
        NON_RETRYABLE_ERROR = contactClearDataReason6;
        $VALUES = new ContactClearDataReason[]{contactClearDataReason, contactClearDataReason2, contactClearDataReason3, contactClearDataReason4, contactClearDataReason5, contactClearDataReason6};
    }

    public static ContactClearDataReason valueOf(String str) {
        return (ContactClearDataReason) Enum.valueOf(ContactClearDataReason.class, str);
    }

    public static ContactClearDataReason[] values() {
        return (ContactClearDataReason[]) $VALUES.clone();
    }
}
