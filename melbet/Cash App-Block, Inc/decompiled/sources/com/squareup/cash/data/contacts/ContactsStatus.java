package com.squareup.cash.data.contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContactsStatus {
    public static final /* synthetic */ ContactsStatus[] $VALUES;
    public static final ContactsStatus CONTACTS_DISABLED;
    public static final ContactsStatus IN_CONTACTS;
    public static final ContactsStatus NOT_IN_CONTACTS;

    static {
        ContactsStatus contactsStatus = new ContactsStatus("IN_CONTACTS", 0);
        IN_CONTACTS = contactsStatus;
        ContactsStatus contactsStatus2 = new ContactsStatus("NOT_IN_CONTACTS", 1);
        NOT_IN_CONTACTS = contactsStatus2;
        ContactsStatus contactsStatus3 = new ContactsStatus("CONTACTS_DISABLED", 2);
        CONTACTS_DISABLED = contactsStatus3;
        $VALUES = new ContactsStatus[]{contactsStatus, contactsStatus2, contactsStatus3};
    }

    public static ContactsStatus valueOf(String str) {
        return (ContactsStatus) Enum.valueOf(ContactsStatus.class, str);
    }

    public static ContactsStatus[] values() {
        return (ContactsStatus[]) $VALUES.clone();
    }
}
