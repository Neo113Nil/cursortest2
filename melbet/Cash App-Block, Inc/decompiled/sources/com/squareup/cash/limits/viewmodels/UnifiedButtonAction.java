package com.squareup.cash.limits.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UnifiedButtonAction {
    public static final /* synthetic */ UnifiedButtonAction[] $VALUES;
    public static final UnifiedButtonAction DISMISS;
    public static final UnifiedButtonAction OPEN_URL;

    static {
        UnifiedButtonAction unifiedButtonAction = new UnifiedButtonAction("OPEN_URL", 0);
        OPEN_URL = unifiedButtonAction;
        UnifiedButtonAction unifiedButtonAction2 = new UnifiedButtonAction("DISMISS", 1);
        DISMISS = unifiedButtonAction2;
        $VALUES = new UnifiedButtonAction[]{unifiedButtonAction, unifiedButtonAction2};
    }

    public static UnifiedButtonAction valueOf(String str) {
        return (UnifiedButtonAction) Enum.valueOf(UnifiedButtonAction.class, str);
    }

    public static UnifiedButtonAction[] values() {
        return (UnifiedButtonAction[]) $VALUES.clone();
    }
}
