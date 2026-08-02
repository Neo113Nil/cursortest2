package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactSyncResult {
    public static final /* synthetic */ ContactSyncResult[] $VALUES;
    public static final ContactSyncResult FAILURE;
    public static final ContactSyncResult INVALID;
    public static final ContactSyncResult REQUEST_SKIPPED;
    public static final ContactSyncResult SUCCESS;
    public static final ContactSyncResult TOO_MANY_ATTEMPTS;

    static {
        ContactSyncResult contactSyncResult = new ContactSyncResult("SUCCESS", 0);
        SUCCESS = contactSyncResult;
        ContactSyncResult contactSyncResult2 = new ContactSyncResult("TOO_MANY_ATTEMPTS", 1);
        TOO_MANY_ATTEMPTS = contactSyncResult2;
        ContactSyncResult contactSyncResult3 = new ContactSyncResult("FAILURE", 2);
        FAILURE = contactSyncResult3;
        ContactSyncResult contactSyncResult4 = new ContactSyncResult("INVALID", 3);
        INVALID = contactSyncResult4;
        ContactSyncResult contactSyncResult5 = new ContactSyncResult("REQUEST_SKIPPED", 4);
        REQUEST_SKIPPED = contactSyncResult5;
        $VALUES = new ContactSyncResult[]{contactSyncResult, contactSyncResult2, contactSyncResult3, contactSyncResult4, contactSyncResult5};
    }

    public static ContactSyncResult valueOf(String str) {
        return (ContactSyncResult) Enum.valueOf(ContactSyncResult.class, str);
    }

    public static ContactSyncResult[] values() {
        return (ContactSyncResult[]) $VALUES.clone();
    }
}
