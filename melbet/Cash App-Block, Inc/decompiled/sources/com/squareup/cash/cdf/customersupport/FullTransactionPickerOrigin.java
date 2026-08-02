package com.squareup.cash.cdf.customersupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FullTransactionPickerOrigin {
    public static final /* synthetic */ FullTransactionPickerOrigin[] $VALUES;
    public static final FullTransactionPickerOrigin ARTICLE;
    public static final FullTransactionPickerOrigin BLOCKER;
    public static final FullTransactionPickerOrigin CHAT;
    public static final FullTransactionPickerOrigin HOME;

    static {
        FullTransactionPickerOrigin fullTransactionPickerOrigin = new FullTransactionPickerOrigin("HOME", 0);
        HOME = fullTransactionPickerOrigin;
        FullTransactionPickerOrigin fullTransactionPickerOrigin2 = new FullTransactionPickerOrigin("CHAT", 1);
        CHAT = fullTransactionPickerOrigin2;
        FullTransactionPickerOrigin fullTransactionPickerOrigin3 = new FullTransactionPickerOrigin("ARTICLE", 2);
        ARTICLE = fullTransactionPickerOrigin3;
        FullTransactionPickerOrigin fullTransactionPickerOrigin4 = new FullTransactionPickerOrigin("BLOCKER", 3);
        BLOCKER = fullTransactionPickerOrigin4;
        $VALUES = new FullTransactionPickerOrigin[]{fullTransactionPickerOrigin, fullTransactionPickerOrigin2, fullTransactionPickerOrigin3, fullTransactionPickerOrigin4, new FullTransactionPickerOrigin("EMAIL", 4)};
    }

    public static FullTransactionPickerOrigin valueOf(String str) {
        return (FullTransactionPickerOrigin) Enum.valueOf(FullTransactionPickerOrigin.class, str);
    }

    public static FullTransactionPickerOrigin[] values() {
        return (FullTransactionPickerOrigin[]) $VALUES.clone();
    }
}
