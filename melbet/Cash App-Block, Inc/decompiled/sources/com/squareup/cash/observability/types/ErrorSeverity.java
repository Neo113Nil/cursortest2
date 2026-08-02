package com.squareup.cash.observability.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ErrorSeverity {
    public static final /* synthetic */ ErrorSeverity[] $VALUES;
    public static final ErrorSeverity HANDLED;
    public static final ErrorSeverity UNHANDLED;

    static {
        ErrorSeverity errorSeverity = new ErrorSeverity("UNHANDLED", 0);
        UNHANDLED = errorSeverity;
        ErrorSeverity errorSeverity2 = new ErrorSeverity("HANDLED", 1);
        HANDLED = errorSeverity2;
        $VALUES = new ErrorSeverity[]{errorSeverity, errorSeverity2};
    }

    public static ErrorSeverity valueOf(String str) {
        return (ErrorSeverity) Enum.valueOf(ErrorSeverity.class, str);
    }

    public static ErrorSeverity[] values() {
        return (ErrorSeverity[]) $VALUES.clone();
    }
}
