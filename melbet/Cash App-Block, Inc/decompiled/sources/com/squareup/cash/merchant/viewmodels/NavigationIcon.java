package com.squareup.cash.merchant.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NavigationIcon {
    public static final /* synthetic */ NavigationIcon[] $VALUES;
    public static final NavigationIcon BACK;
    public static final NavigationIcon CLOSE;

    static {
        NavigationIcon navigationIcon = new NavigationIcon("BACK", 0);
        BACK = navigationIcon;
        NavigationIcon navigationIcon2 = new NavigationIcon("CLOSE", 1);
        CLOSE = navigationIcon2;
        $VALUES = new NavigationIcon[]{navigationIcon, navigationIcon2};
    }

    public static NavigationIcon valueOf(String str) {
        return (NavigationIcon) Enum.valueOf(NavigationIcon.class, str);
    }

    public static NavigationIcon[] values() {
        return (NavigationIcon[]) $VALUES.clone();
    }
}
