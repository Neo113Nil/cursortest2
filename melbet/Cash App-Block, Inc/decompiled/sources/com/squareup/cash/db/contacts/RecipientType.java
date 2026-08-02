package com.squareup.cash.db.contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RecipientType {
    public static final /* synthetic */ RecipientType[] $VALUES;
    public static final RecipientType CUSTOMER;
    public static final RecipientType EMAIL;
    public static final RecipientType PHONE;
    public static final RecipientType UNKNOWN;

    static {
        RecipientType recipientType = new RecipientType("CUSTOMER", 0);
        CUSTOMER = recipientType;
        RecipientType recipientType2 = new RecipientType("EMAIL", 1);
        EMAIL = recipientType2;
        RecipientType recipientType3 = new RecipientType("PHONE", 2);
        PHONE = recipientType3;
        RecipientType recipientType4 = new RecipientType("UNKNOWN", 3);
        UNKNOWN = recipientType4;
        $VALUES = new RecipientType[]{recipientType, recipientType2, recipientType3, recipientType4};
    }

    public static RecipientType valueOf(String str) {
        return (RecipientType) Enum.valueOf(RecipientType.class, str);
    }

    public static RecipientType[] values() {
        return (RecipientType[]) $VALUES.clone();
    }
}
