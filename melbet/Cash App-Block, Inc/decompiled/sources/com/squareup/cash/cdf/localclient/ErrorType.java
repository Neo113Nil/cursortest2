package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ErrorType {
    public static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType NETWORK_ERROR;
    public static final ErrorType SERVER_ERROR;

    static {
        ErrorType errorType = new ErrorType("NETWORK_ERROR", 0);
        NETWORK_ERROR = errorType;
        ErrorType errorType2 = new ErrorType("SERVER_ERROR", 1);
        SERVER_ERROR = errorType2;
        $VALUES = new ErrorType[]{errorType, errorType2, new ErrorType("UNKNOWN", 2)};
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
