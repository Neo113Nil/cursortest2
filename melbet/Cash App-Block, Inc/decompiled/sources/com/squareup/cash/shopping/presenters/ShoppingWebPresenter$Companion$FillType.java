package com.squareup.cash.shopping.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$Companion$FillType {
    public static final /* synthetic */ ShoppingWebPresenter$Companion$FillType[] $VALUES;
    public static final ShoppingWebPresenter$Companion$FillType ADDRESS;
    public static final ShoppingWebPresenter$Companion$FillType CARD;

    static {
        ShoppingWebPresenter$Companion$FillType shoppingWebPresenter$Companion$FillType = new ShoppingWebPresenter$Companion$FillType("CARD", 0);
        CARD = shoppingWebPresenter$Companion$FillType;
        ShoppingWebPresenter$Companion$FillType shoppingWebPresenter$Companion$FillType2 = new ShoppingWebPresenter$Companion$FillType("ADDRESS", 1);
        ADDRESS = shoppingWebPresenter$Companion$FillType2;
        $VALUES = new ShoppingWebPresenter$Companion$FillType[]{shoppingWebPresenter$Companion$FillType, shoppingWebPresenter$Companion$FillType2};
    }

    public static ShoppingWebPresenter$Companion$FillType valueOf(String str) {
        return (ShoppingWebPresenter$Companion$FillType) Enum.valueOf(ShoppingWebPresenter$Companion$FillType.class, str);
    }

    public static ShoppingWebPresenter$Companion$FillType[] values() {
        return (ShoppingWebPresenter$Companion$FillType[]) $VALUES.clone();
    }
}
