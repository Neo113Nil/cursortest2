package com.squareup.cash.blockers.views.card;

import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class CardEditorUtilsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CardBrandGuesser$Brand.values().length];
        try {
            iArr[CardBrandGuesser$Brand.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardBrandGuesser$Brand.MASTER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardBrandGuesser$Brand.AMERICAN_EXPRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardBrandGuesser$Brand.DISCOVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardBrandGuesser$Brand.DISCOVER_DINERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardBrandGuesser$Brand.JCB.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardBrandGuesser$Brand.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
