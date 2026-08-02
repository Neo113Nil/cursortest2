package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ErrorSource {
    public static final /* synthetic */ ErrorSource[] $VALUES;
    public static final ErrorSource CLIENT;
    public static final ErrorSource FIDESMO_SDK;
    public static final ErrorSource FIDESMO_SERVER;
    public static final ErrorSource SERVER;

    static {
        ErrorSource errorSource = new ErrorSource("CLIENT", 0);
        CLIENT = errorSource;
        ErrorSource errorSource2 = new ErrorSource("SERVER", 1);
        SERVER = errorSource2;
        ErrorSource errorSource3 = new ErrorSource("FIDESMO", 2);
        ErrorSource errorSource4 = new ErrorSource("FIDESMO_SDK", 3);
        FIDESMO_SDK = errorSource4;
        ErrorSource errorSource5 = new ErrorSource("FIDESMO_SERVER", 4);
        FIDESMO_SERVER = errorSource5;
        $VALUES = new ErrorSource[]{errorSource, errorSource2, errorSource3, errorSource4, errorSource5, new ErrorSource("UNKNOWN", 5)};
    }

    public static ErrorSource valueOf(String str) {
        return (ErrorSource) Enum.valueOf(ErrorSource.class, str);
    }

    public static ErrorSource[] values() {
        return (ErrorSource[]) $VALUES.clone();
    }
}
