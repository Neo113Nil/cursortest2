package com.squareup.cash.cdf.identity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ScreenType {
    public static final /* synthetic */ ScreenType[] $VALUES;
    public static final ScreenType IdentityHub;
    public static final ScreenType PIRefresh;

    static {
        ScreenType screenType = new ScreenType("IdentityHub", 0);
        IdentityHub = screenType;
        ScreenType screenType2 = new ScreenType("PIRefresh", 1);
        PIRefresh = screenType2;
        $VALUES = new ScreenType[]{screenType, screenType2};
    }

    public static ScreenType valueOf(String str) {
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }

    public static ScreenType[] values() {
        return (ScreenType[]) $VALUES.clone();
    }
}
