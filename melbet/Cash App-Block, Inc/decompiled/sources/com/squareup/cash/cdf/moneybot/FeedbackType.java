package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FeedbackType {
    public static final /* synthetic */ FeedbackType[] $VALUES;
    public static final FeedbackType NEGATIVE;
    public static final FeedbackType POSITIVE;

    static {
        FeedbackType feedbackType = new FeedbackType("POSITIVE", 0);
        POSITIVE = feedbackType;
        FeedbackType feedbackType2 = new FeedbackType("NEGATIVE", 1);
        NEGATIVE = feedbackType2;
        $VALUES = new FeedbackType[]{feedbackType, feedbackType2};
    }

    public static FeedbackType valueOf(String str) {
        return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
    }

    public static FeedbackType[] values() {
        return (FeedbackType[]) $VALUES.clone();
    }
}
