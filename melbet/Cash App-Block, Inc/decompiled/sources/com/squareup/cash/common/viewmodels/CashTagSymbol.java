package com.squareup.cash.common.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class CashTagSymbol {
    public static final /* synthetic */ CashTagSymbol[] $VALUES;
    public static final CashTagSymbol CARD;
    public static final CashTagSymbol HEART;
    public static final CashTagSymbol WAND;

    static {
        CashTagSymbol cashTagSymbol = new CashTagSymbol("WAND", 0);
        WAND = cashTagSymbol;
        CashTagSymbol cashTagSymbol2 = new CashTagSymbol("CARD", 1);
        CARD = cashTagSymbol2;
        CashTagSymbol cashTagSymbol3 = new CashTagSymbol("HEART", 2);
        HEART = cashTagSymbol3;
        $VALUES = new CashTagSymbol[]{cashTagSymbol, cashTagSymbol2, cashTagSymbol3};
    }

    public static CashTagSymbol valueOf(String str) {
        return (CashTagSymbol) Enum.valueOf(CashTagSymbol.class, str);
    }

    public static CashTagSymbol[] values() {
        return (CashTagSymbol[]) $VALUES.clone();
    }
}
