package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactStatus {
    public static final /* synthetic */ ContactStatus[] $VALUES;
    public static final ContactStatus CONTACTS_DISABLED;
    public static final ContactStatus IN_CONTACTS;
    public static final ContactStatus NOT_IN_CONTACTS;

    static {
        ContactStatus contactStatus = new ContactStatus("NOT_IN_CONTACTS", 0);
        NOT_IN_CONTACTS = contactStatus;
        ContactStatus contactStatus2 = new ContactStatus("IN_CONTACTS", 1);
        IN_CONTACTS = contactStatus2;
        ContactStatus contactStatus3 = new ContactStatus("CONTACTS_DISABLED", 2);
        CONTACTS_DISABLED = contactStatus3;
        $VALUES = new ContactStatus[]{contactStatus, contactStatus2, contactStatus3};
    }

    public static ContactStatus valueOf(String str) {
        return (ContactStatus) Enum.valueOf(ContactStatus.class, str);
    }

    public static ContactStatus[] values() {
        return (ContactStatus[]) $VALUES.clone();
    }
}
