package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SheetButtonType {
    public static final /* synthetic */ SheetButtonType[] $VALUES = {new SheetButtonType("ACTIVATE_CASH_CARD", 0), new SheetButtonType("REQUEST_CASH_CARD", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SheetButtonType EF5;

    public static SheetButtonType valueOf(String str) {
        return (SheetButtonType) Enum.valueOf(SheetButtonType.class, str);
    }

    public static SheetButtonType[] values() {
        return (SheetButtonType[]) $VALUES.clone();
    }
}
