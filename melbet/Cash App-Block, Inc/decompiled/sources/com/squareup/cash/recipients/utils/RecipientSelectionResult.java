package com.squareup.cash.recipients.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RecipientSelectionResult {
    public static final /* synthetic */ RecipientSelectionResult[] $VALUES;
    public static final RecipientSelectionResult CROSS_BORDER_NOT_ALLOWED;
    public static final RecipientSelectionResult SUCCESS;

    static {
        RecipientSelectionResult recipientSelectionResult = new RecipientSelectionResult("SUCCESS", 0);
        SUCCESS = recipientSelectionResult;
        RecipientSelectionResult recipientSelectionResult2 = new RecipientSelectionResult("CASH_TAG_ONLY", 1);
        RecipientSelectionResult recipientSelectionResult3 = new RecipientSelectionResult("BUSINESS_NOT_ALLOWED", 2);
        RecipientSelectionResult recipientSelectionResult4 = new RecipientSelectionResult("CROSS_BORDER_NOT_ALLOWED", 3);
        CROSS_BORDER_NOT_ALLOWED = recipientSelectionResult4;
        $VALUES = new RecipientSelectionResult[]{recipientSelectionResult, recipientSelectionResult2, recipientSelectionResult3, recipientSelectionResult4, new RecipientSelectionResult("CREDIT_CARD_NOT_ALLOWED", 4)};
    }

    public static RecipientSelectionResult valueOf(String str) {
        return (RecipientSelectionResult) Enum.valueOf(RecipientSelectionResult.class, str);
    }

    public static RecipientSelectionResult[] values() {
        return (RecipientSelectionResult[]) $VALUES.clone();
    }
}
