package com.squareup.cash.cdf.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ContentType {
    public static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType BITCOIN;
    public static final ContentType LIGHTNING;
    public static final ContentType SHARE_INVOICE;
    public static final ContentType TRANSFER;
    public static final ContentType UNIFIED;
    public static final ContentType UNKNOWN;

    /* JADX INFO: Fake field, exist only in values array */
    ContentType EF0;

    static {
        ContentType contentType = new ContentType("CASHAPP", 0);
        ContentType contentType2 = new ContentType("BITCOIN", 1);
        BITCOIN = contentType2;
        ContentType contentType3 = new ContentType("LIGHTNING", 2);
        LIGHTNING = contentType3;
        ContentType contentType4 = new ContentType("UNIFIED", 3);
        UNIFIED = contentType4;
        ContentType contentType5 = new ContentType("SHARE_INVOICE", 4);
        SHARE_INVOICE = contentType5;
        ContentType contentType6 = new ContentType("TRANSFER", 5);
        TRANSFER = contentType6;
        ContentType contentType7 = new ContentType("UNKNOWN", 6);
        UNKNOWN = contentType7;
        $VALUES = new ContentType[]{contentType, contentType2, contentType3, contentType4, contentType5, contentType6, contentType7};
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }
}
