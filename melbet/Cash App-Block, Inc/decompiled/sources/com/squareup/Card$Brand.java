package com.squareup;

import defpackage.DropMode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public class Card$Brand {
    public static final /* synthetic */ Card$Brand[] $VALUES;
    public static final AnonymousClass2 AMERICAN_EXPRESS;
    public static final Card$Brand DISCOVER;
    public static final Card$Brand DISCOVER_DINERS;
    public static final Card$Brand EFTPOS;
    public static final Card$Brand INTERAC;
    public static final Card$Brand JCB;
    public static final Card$Brand MASTER_CARD;
    public static final Card$Brand SQUARE_CAPITAL_CARD;
    public static final Card$Brand SQUARE_GIFT_CARD_V2;
    public static final AnonymousClass4 UNION_PAY;
    public static final Card$Brand UNKNOWN;
    public static final AnonymousClass1 VISA;
    public final String shortCode;
    public final int[] validNumberLengths;

    /* renamed from: com.squareup.Card$Brand$1, reason: invalid class name */
    public enum AnonymousClass1 extends Card$Brand {
        @Override // com.squareup.Card$Brand
        public final boolean validateLuhnIfRequired(String str) {
            int luhnSum = DropMode.luhnSum(str);
            return str.length() == 19 ? luhnSum != -1 : luhnSum % 10 == 0;
        }
    }

    /* renamed from: com.squareup.Card$Brand$2, reason: invalid class name */
    public enum AnonymousClass2 extends Card$Brand {
        @Override // com.squareup.Card$Brand
        public final int cvvLength() {
            return 4;
        }
    }

    /* renamed from: com.squareup.Card$Brand$3, reason: invalid class name */
    public enum AnonymousClass3 extends Card$Brand {
        @Override // com.squareup.Card$Brand
        public final boolean isValidNumberLength(int i) {
            return i > 0;
        }

        @Override // com.squareup.Card$Brand
        public final boolean validateLuhnIfRequired(String str) {
            return DropMode.luhnSum(str) != -1;
        }
    }

    /* renamed from: com.squareup.Card$Brand$4, reason: invalid class name */
    public enum AnonymousClass4 extends Card$Brand {
        @Override // com.squareup.Card$Brand
        public final boolean validateLuhnIfRequired(String str) {
            return DropMode.luhnSum(str) != -1;
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("VISA", 0, "VI", 16, 19);
        VISA = anonymousClass1;
        Card$Brand card$Brand = new Card$Brand("MASTER_CARD", 1, "MC", 16, 17, 18, 19);
        MASTER_CARD = card$Brand;
        Card$Brand card$Brand2 = new Card$Brand("ALIPAY", 2, "AL", new int[0]);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("AMERICAN_EXPRESS", 3, "AX", 15);
        AMERICAN_EXPRESS = anonymousClass2;
        Card$Brand card$Brand3 = new Card$Brand("CASH_APP", 4, "CA", new int[0]);
        Card$Brand card$Brand4 = new Card$Brand("DISCOVER", 5, "DI", 16, 19);
        DISCOVER = card$Brand4;
        Card$Brand card$Brand5 = new Card$Brand("DISCOVER_DINERS", 6, "DD", 14);
        DISCOVER_DINERS = card$Brand5;
        Card$Brand card$Brand6 = new Card$Brand("EBT", 7, "EBT", 16, 17, 18, 19);
        Card$Brand card$Brand7 = new Card$Brand("EFTPOS", 8, "EF", 16, 17, 18, 19);
        EFTPOS = card$Brand7;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("FELICA", 9, "FE", new int[0]);
        Card$Brand card$Brand8 = new Card$Brand("INTERAC", 10, "IN", 13, 14, 16, 17, 18, 19);
        INTERAC = card$Brand8;
        Card$Brand card$Brand9 = new Card$Brand("JCB", 11, "JC", 16, 17, 18, 19);
        JCB = card$Brand9;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("UNION_PAY", 12, "CU", 16, 17, 18, 19);
        UNION_PAY = anonymousClass4;
        Card$Brand card$Brand10 = new Card$Brand("SQUARE_GIFT_CARD_V2", 13, "SQ", 16);
        SQUARE_GIFT_CARD_V2 = card$Brand10;
        Card$Brand card$Brand11 = new Card$Brand("SQUARE_CAPITAL_CARD", 14, "SI", 16);
        SQUARE_CAPITAL_CARD = card$Brand11;
        Card$Brand card$Brand12 = new Card$Brand("UNKNOWN", 15, "XX", 13, 14, 15, 16, 17, 18, 19);
        UNKNOWN = card$Brand12;
        $VALUES = new Card$Brand[]{anonymousClass1, card$Brand, card$Brand2, anonymousClass2, card$Brand3, card$Brand4, card$Brand5, card$Brand6, card$Brand7, anonymousClass3, card$Brand8, card$Brand9, anonymousClass4, card$Brand10, card$Brand11, card$Brand12};
    }

    public Card$Brand(String str, int i, String str2, int... iArr) {
        this.shortCode = str2;
        this.validNumberLengths = iArr;
    }

    public static Card$Brand valueOf(String str) {
        return (Card$Brand) Enum.valueOf(Card$Brand.class, str);
    }

    public static Card$Brand[] values() {
        return (Card$Brand[]) $VALUES.clone();
    }

    public int cvvLength() {
        return 3;
    }

    public boolean isValidNumberLength(int i) {
        for (int i2 : this.validNumberLengths) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.shortCode;
    }

    public boolean validateLuhnIfRequired(String str) {
        return DropMode.luhnSum(str) % 10 == 0;
    }
}
