package com.squareup.cash.cdf.taptopay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ErrorType {
    public static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType ClientPolicyError;
    public static final ErrorType ClientSystemWarmUpError;
    public static final ErrorType PaymentCardReaderError;
    public static final ErrorType PaymentCardReaderSessionReadError;

    static {
        ErrorType errorType = new ErrorType("PaymentCardReaderError", 0);
        PaymentCardReaderError = errorType;
        ErrorType errorType2 = new ErrorType("PaymentCardReaderSessionReadError", 1);
        PaymentCardReaderSessionReadError = errorType2;
        ErrorType errorType3 = new ErrorType("ClientPolicyError", 2);
        ClientPolicyError = errorType3;
        ErrorType errorType4 = new ErrorType("ClientSystemWarmUpError", 3);
        ClientSystemWarmUpError = errorType4;
        $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4};
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
