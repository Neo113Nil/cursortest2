package com.squareup.cash.cdf.cashcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomizeMode {
    public static final /* synthetic */ CustomizeMode[] $VALUES;
    public static final CustomizeMode DRAW;
    public static final CustomizeMode STAMP;

    static {
        CustomizeMode customizeMode = new CustomizeMode("DRAW", 0);
        DRAW = customizeMode;
        CustomizeMode customizeMode2 = new CustomizeMode("STAMP", 1);
        STAMP = customizeMode2;
        $VALUES = new CustomizeMode[]{customizeMode, customizeMode2};
    }

    public static CustomizeMode valueOf(String str) {
        return (CustomizeMode) Enum.valueOf(CustomizeMode.class, str);
    }

    public static CustomizeMode[] values() {
        return (CustomizeMode[]) $VALUES.clone();
    }
}
