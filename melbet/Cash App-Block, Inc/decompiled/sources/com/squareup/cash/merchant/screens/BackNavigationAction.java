package com.squareup.cash.merchant.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BackNavigationAction {
    public static final /* synthetic */ BackNavigationAction[] $VALUES;
    public static final BackNavigationAction CLOSE;

    static {
        BackNavigationAction backNavigationAction = new BackNavigationAction("CLOSE", 0);
        CLOSE = backNavigationAction;
        $VALUES = new BackNavigationAction[]{backNavigationAction, new BackNavigationAction("BACK", 1)};
    }

    public static BackNavigationAction valueOf(String str) {
        return (BackNavigationAction) Enum.valueOf(BackNavigationAction.class, str);
    }

    public static BackNavigationAction[] values() {
        return (BackNavigationAction[]) $VALUES.clone();
    }
}
