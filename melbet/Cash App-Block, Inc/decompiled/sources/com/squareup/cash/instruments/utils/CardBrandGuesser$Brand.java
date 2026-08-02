package com.squareup.cash.instruments.utils;

import com.squareup.cash.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'VISA' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class CardBrandGuesser$Brand {
    public static final /* synthetic */ CardBrandGuesser$Brand[] $VALUES;
    public static final CardBrandGuesser$Brand AMERICAN_EXPRESS;
    public static final CardBrandGuesser$Brand BALANCE;
    public static final CardBrandGuesser$Brand DISCOVER;
    public static final CardBrandGuesser$Brand DISCOVER_DINERS;
    public static final CardBrandGuesser$Brand JCB;
    public static final CardBrandGuesser$Brand MASTER_CARD;
    public static final CardBrandGuesser$Brand UNKNOWN;
    public static final CardBrandGuesser$Brand VISA;
    public final int cvvLength;
    public final int cvvLocation;
    public final int maxDigits;

    static {
        int i = 7;
        CardBrandGuesser$Brand cardBrandGuesser$Brand = new CardBrandGuesser$Brand("VISA", 0, i);
        VISA = cardBrandGuesser$Brand;
        CardBrandGuesser$Brand cardBrandGuesser$Brand2 = new CardBrandGuesser$Brand("MASTER_CARD", 1, i);
        MASTER_CARD = cardBrandGuesser$Brand2;
        CardBrandGuesser$Brand cardBrandGuesser$Brand3 = new CardBrandGuesser$Brand(2, 15, 4, R.string.card_cvv_location_front, "AMERICAN_EXPRESS");
        AMERICAN_EXPRESS = cardBrandGuesser$Brand3;
        CardBrandGuesser$Brand cardBrandGuesser$Brand4 = new CardBrandGuesser$Brand("DISCOVER", 3, i);
        DISCOVER = cardBrandGuesser$Brand4;
        CardBrandGuesser$Brand cardBrandGuesser$Brand5 = new CardBrandGuesser$Brand("DISCOVER_DINERS", 4, i);
        DISCOVER_DINERS = cardBrandGuesser$Brand5;
        int i2 = 5;
        CardBrandGuesser$Brand cardBrandGuesser$Brand6 = new CardBrandGuesser$Brand("JCB", i2, i);
        JCB = cardBrandGuesser$Brand6;
        CardBrandGuesser$Brand cardBrandGuesser$Brand7 = new CardBrandGuesser$Brand("BALANCE", 6, i2);
        BALANCE = cardBrandGuesser$Brand7;
        CardBrandGuesser$Brand cardBrandGuesser$Brand8 = new CardBrandGuesser$Brand("UNKNOWN", i, i);
        UNKNOWN = cardBrandGuesser$Brand8;
        $VALUES = new CardBrandGuesser$Brand[]{cardBrandGuesser$Brand, cardBrandGuesser$Brand2, cardBrandGuesser$Brand3, cardBrandGuesser$Brand4, cardBrandGuesser$Brand5, cardBrandGuesser$Brand6, cardBrandGuesser$Brand7, cardBrandGuesser$Brand8};
    }

    public /* synthetic */ CardBrandGuesser$Brand(String str, int i, int i2) {
        this(i, 16, (i2 & 2) != 0 ? 3 : 4, R.string.card_cvv_location_back, str);
    }

    public static CardBrandGuesser$Brand valueOf(String str) {
        return (CardBrandGuesser$Brand) Enum.valueOf(CardBrandGuesser$Brand.class, str);
    }

    public static CardBrandGuesser$Brand[] values() {
        return (CardBrandGuesser$Brand[]) $VALUES.clone();
    }

    public CardBrandGuesser$Brand(int i, int i2, int i3, int i4, String str) {
        this.maxDigits = i2;
        this.cvvLength = i3;
        this.cvvLocation = i4;
    }
}
