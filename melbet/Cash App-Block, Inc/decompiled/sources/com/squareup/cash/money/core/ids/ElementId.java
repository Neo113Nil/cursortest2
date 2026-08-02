package com.squareup.cash.money.core.ids;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ElementId {
    public static final /* synthetic */ ElementId[] $VALUES;
    public static final ElementId BALANCE_ADD_CASH;
    public static final ElementId BALANCE_CASH_OUT;
    public static final ElementId BALANCE_OBFUSCATE;

    static {
        ElementId elementId = new ElementId("BALANCE_ADD_CASH", 0);
        BALANCE_ADD_CASH = elementId;
        ElementId elementId2 = new ElementId("BALANCE_CASH_OUT", 1);
        BALANCE_CASH_OUT = elementId2;
        ElementId elementId3 = new ElementId("BALANCE_OBFUSCATE", 2);
        BALANCE_OBFUSCATE = elementId3;
        $VALUES = new ElementId[]{elementId, elementId2, elementId3};
    }

    public static ElementId valueOf(String str) {
        return (ElementId) Enum.valueOf(ElementId.class, str);
    }

    public static ElementId[] values() {
        return (ElementId[]) $VALUES.clone();
    }
}
