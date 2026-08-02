package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ReviewPaymentElementType {
    public static final /* synthetic */ ReviewPaymentElementType[] $VALUES;
    public static final ReviewPaymentElementType AMOUNT;
    public static final ReviewPaymentElementType INPUT_NOTE;
    public static final ReviewPaymentElementType RECIPIENT;
    public static final ReviewPaymentElementType SCHEDULE;

    static {
        ReviewPaymentElementType reviewPaymentElementType = new ReviewPaymentElementType("AMOUNT", 0);
        AMOUNT = reviewPaymentElementType;
        ReviewPaymentElementType reviewPaymentElementType2 = new ReviewPaymentElementType("RECIPIENT", 1);
        RECIPIENT = reviewPaymentElementType2;
        ReviewPaymentElementType reviewPaymentElementType3 = new ReviewPaymentElementType("INPUT_NOTE", 2);
        INPUT_NOTE = reviewPaymentElementType3;
        ReviewPaymentElementType reviewPaymentElementType4 = new ReviewPaymentElementType("SCHEDULE", 3);
        SCHEDULE = reviewPaymentElementType4;
        $VALUES = new ReviewPaymentElementType[]{reviewPaymentElementType, reviewPaymentElementType2, reviewPaymentElementType3, reviewPaymentElementType4};
    }

    public static ReviewPaymentElementType valueOf(String str) {
        return (ReviewPaymentElementType) Enum.valueOf(ReviewPaymentElementType.class, str);
    }

    public static ReviewPaymentElementType[] values() {
        return (ReviewPaymentElementType[]) $VALUES.clone();
    }
}
