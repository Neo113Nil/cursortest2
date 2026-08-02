package com.squareup.cash.integration.contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContactBook$AliasType {
    public static final /* synthetic */ ContactBook$AliasType[] $VALUES;
    public static final ContactBook$AliasType EMAIL;
    public static final ContactBook$AliasType PHONE;

    static {
        ContactBook$AliasType contactBook$AliasType = new ContactBook$AliasType("PHONE", 0);
        PHONE = contactBook$AliasType;
        ContactBook$AliasType contactBook$AliasType2 = new ContactBook$AliasType("EMAIL", 1);
        EMAIL = contactBook$AliasType2;
        $VALUES = new ContactBook$AliasType[]{contactBook$AliasType, contactBook$AliasType2};
    }

    public static ContactBook$AliasType valueOf(String str) {
        return (ContactBook$AliasType) Enum.valueOf(ContactBook$AliasType.class, str);
    }

    public static ContactBook$AliasType[] values() {
        return (ContactBook$AliasType[]) $VALUES.clone();
    }
}
