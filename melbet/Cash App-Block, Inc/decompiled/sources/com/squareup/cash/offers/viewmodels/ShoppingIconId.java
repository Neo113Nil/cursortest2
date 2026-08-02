package com.squareup.cash.offers.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ShoppingIconId {
    public static final /* synthetic */ ShoppingIconId[] $VALUES;
    public static final ShoppingIconId CARD_NEW;
    public static final ShoppingIconId CARD_SIMPLE;
    public static final ShoppingIconId CASH_APP_CUSTOMER;
    public static final ShoppingIconId CASH_APP_PAY;
    public static final ShoppingIconId DISCOUNT_MIN;
    public static final ShoppingIconId HOURGLASS;
    public static final ShoppingIconId LIMIT_FILL;
    public static final ShoppingIconId STOPWATCH;
    public static final ShoppingIconId TIME;

    static {
        ShoppingIconId shoppingIconId = new ShoppingIconId("CARD_SIMPLE", 0);
        CARD_SIMPLE = shoppingIconId;
        ShoppingIconId shoppingIconId2 = new ShoppingIconId("CARD_NEW", 1);
        CARD_NEW = shoppingIconId2;
        ShoppingIconId shoppingIconId3 = new ShoppingIconId("STOPWATCH", 2);
        STOPWATCH = shoppingIconId3;
        ShoppingIconId shoppingIconId4 = new ShoppingIconId("HOURGLASS", 3);
        HOURGLASS = shoppingIconId4;
        ShoppingIconId shoppingIconId5 = new ShoppingIconId("LIMITS", 4);
        ShoppingIconId shoppingIconId6 = new ShoppingIconId("LIMIT_FILL", 5);
        LIMIT_FILL = shoppingIconId6;
        ShoppingIconId shoppingIconId7 = new ShoppingIconId("DISCOUNT_MIN", 6);
        DISCOUNT_MIN = shoppingIconId7;
        ShoppingIconId shoppingIconId8 = new ShoppingIconId("TIME", 7);
        TIME = shoppingIconId8;
        ShoppingIconId shoppingIconId9 = new ShoppingIconId("CASH_APP_CUSTOMER", 8);
        CASH_APP_CUSTOMER = shoppingIconId9;
        ShoppingIconId shoppingIconId10 = new ShoppingIconId("CASH_APP_PAY", 9);
        CASH_APP_PAY = shoppingIconId10;
        $VALUES = new ShoppingIconId[]{shoppingIconId, shoppingIconId2, shoppingIconId3, shoppingIconId4, shoppingIconId5, shoppingIconId6, shoppingIconId7, shoppingIconId8, shoppingIconId9, shoppingIconId10, new ShoppingIconId("LINK_OUT_24", 10)};
    }

    public static ShoppingIconId valueOf(String str) {
        return (ShoppingIconId) Enum.valueOf(ShoppingIconId.class, str);
    }

    public static ShoppingIconId[] values() {
        return (ShoppingIconId[]) $VALUES.clone();
    }
}
