package com.squareup.cash.arcade.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShowNavigationBack {
    public static final /* synthetic */ ShowNavigationBack[] $VALUES;
    public static final ShowNavigationBack Always;
    public static final ShowNavigationBack Never;
    public static final ShowNavigationBack WhenKeyboardOpen;

    static {
        ShowNavigationBack showNavigationBack = new ShowNavigationBack("Never", 0);
        Never = showNavigationBack;
        ShowNavigationBack showNavigationBack2 = new ShowNavigationBack("WhenKeyboardOpen", 1);
        WhenKeyboardOpen = showNavigationBack2;
        ShowNavigationBack showNavigationBack3 = new ShowNavigationBack("Always", 2);
        Always = showNavigationBack3;
        $VALUES = new ShowNavigationBack[]{showNavigationBack, showNavigationBack2, showNavigationBack3};
    }

    public static ShowNavigationBack valueOf(String str) {
        return (ShowNavigationBack) Enum.valueOf(ShowNavigationBack.class, str);
    }

    public static ShowNavigationBack[] values() {
        return (ShowNavigationBack[]) $VALUES.clone();
    }
}
