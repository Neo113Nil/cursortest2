package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SheetDismissOrigin {
    public static final /* synthetic */ SheetDismissOrigin[] $VALUES;
    public static final SheetDismissOrigin Button;
    public static final SheetDismissOrigin Other;

    static {
        SheetDismissOrigin sheetDismissOrigin = new SheetDismissOrigin("Button", 0);
        Button = sheetDismissOrigin;
        SheetDismissOrigin sheetDismissOrigin2 = new SheetDismissOrigin("Other", 1);
        Other = sheetDismissOrigin2;
        $VALUES = new SheetDismissOrigin[]{sheetDismissOrigin, sheetDismissOrigin2};
    }

    public static SheetDismissOrigin valueOf(String str) {
        return (SheetDismissOrigin) Enum.valueOf(SheetDismissOrigin.class, str);
    }

    public static SheetDismissOrigin[] values() {
        return (SheetDismissOrigin[]) $VALUES.clone();
    }
}
