package com.squareup.cash.cdf.notificationssettings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ContactMethodType {
    public static final /* synthetic */ ContactMethodType[] $VALUES;
    public static final ContactMethodType EMAIL;
    public static final ContactMethodType PHONE;

    static {
        ContactMethodType contactMethodType = new ContactMethodType("PHONE", 0);
        PHONE = contactMethodType;
        ContactMethodType contactMethodType2 = new ContactMethodType("EMAIL", 1);
        EMAIL = contactMethodType2;
        $VALUES = new ContactMethodType[]{contactMethodType, contactMethodType2};
    }

    public static ContactMethodType valueOf(String str) {
        return (ContactMethodType) Enum.valueOf(ContactMethodType.class, str);
    }

    public static ContactMethodType[] values() {
        return (ContactMethodType[]) $VALUES.clone();
    }
}
