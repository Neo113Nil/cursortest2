package com.squareup.cash.mooncake.compose_ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NavigationIconType {
    public static final /* synthetic */ NavigationIconType[] $VALUES;
    public static final NavigationIconType BACK;
    public static final NavigationIconType CLOSE;

    static {
        NavigationIconType navigationIconType = new NavigationIconType("BACK", 0);
        BACK = navigationIconType;
        NavigationIconType navigationIconType2 = new NavigationIconType("CLOSE", 1);
        CLOSE = navigationIconType2;
        $VALUES = new NavigationIconType[]{navigationIconType, navigationIconType2};
    }

    public static NavigationIconType valueOf(String str) {
        return (NavigationIconType) Enum.valueOf(NavigationIconType.class, str);
    }

    public static NavigationIconType[] values() {
        return (NavigationIconType[]) $VALUES.clone();
    }
}
