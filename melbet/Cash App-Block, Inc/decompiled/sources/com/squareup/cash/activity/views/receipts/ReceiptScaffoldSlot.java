package com.squareup.cash.activity.views.receipts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ReceiptScaffoldSlot {
    public static final /* synthetic */ ReceiptScaffoldSlot[] $VALUES;
    public static final ReceiptScaffoldSlot Content;
    public static final ReceiptScaffoldSlot Footer;

    static {
        ReceiptScaffoldSlot receiptScaffoldSlot = new ReceiptScaffoldSlot("Footer", 0);
        Footer = receiptScaffoldSlot;
        ReceiptScaffoldSlot receiptScaffoldSlot2 = new ReceiptScaffoldSlot("Content", 1);
        Content = receiptScaffoldSlot2;
        $VALUES = new ReceiptScaffoldSlot[]{receiptScaffoldSlot, receiptScaffoldSlot2};
    }

    public static ReceiptScaffoldSlot valueOf(String str) {
        return (ReceiptScaffoldSlot) Enum.valueOf(ReceiptScaffoldSlot.class, str);
    }

    public static ReceiptScaffoldSlot[] values() {
        return (ReceiptScaffoldSlot[]) $VALUES.clone();
    }
}
