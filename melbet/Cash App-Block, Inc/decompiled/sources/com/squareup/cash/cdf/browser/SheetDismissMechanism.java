package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SheetDismissMechanism {
    public static final /* synthetic */ SheetDismissMechanism[] $VALUES;
    public static final SheetDismissMechanism Button;
    public static final SheetDismissMechanism Other;

    static {
        SheetDismissMechanism sheetDismissMechanism = new SheetDismissMechanism("Button", 0);
        Button = sheetDismissMechanism;
        SheetDismissMechanism sheetDismissMechanism2 = new SheetDismissMechanism("Other", 1);
        Other = sheetDismissMechanism2;
        $VALUES = new SheetDismissMechanism[]{sheetDismissMechanism, sheetDismissMechanism2};
    }

    public static SheetDismissMechanism valueOf(String str) {
        return (SheetDismissMechanism) Enum.valueOf(SheetDismissMechanism.class, str);
    }

    public static SheetDismissMechanism[] values() {
        return (SheetDismissMechanism[]) $VALUES.clone();
    }
}
