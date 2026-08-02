package com.squareup.cash.shopping.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ErrorUrlAction {
    public static final /* synthetic */ ErrorUrlAction[] $VALUES;
    public static final ErrorUrlAction RETRY;

    static {
        ErrorUrlAction errorUrlAction = new ErrorUrlAction("RETRY", 0);
        RETRY = errorUrlAction;
        $VALUES = new ErrorUrlAction[]{errorUrlAction, new ErrorUrlAction("CLOSE", 1)};
    }

    public static ErrorUrlAction valueOf(String str) {
        return (ErrorUrlAction) Enum.valueOf(ErrorUrlAction.class, str);
    }

    public static ErrorUrlAction[] values() {
        return (ErrorUrlAction[]) $VALUES.clone();
    }
}
