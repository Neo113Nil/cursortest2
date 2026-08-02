package com.squareup.cash.moneybot.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ThumbDirection {
    public static final /* synthetic */ ThumbDirection[] $VALUES;
    public static final ThumbDirection THUMBS_DOWN;
    public static final ThumbDirection THUMBS_UP;

    static {
        ThumbDirection thumbDirection = new ThumbDirection("THUMBS_UP", 0);
        THUMBS_UP = thumbDirection;
        ThumbDirection thumbDirection2 = new ThumbDirection("THUMBS_DOWN", 1);
        THUMBS_DOWN = thumbDirection2;
        $VALUES = new ThumbDirection[]{thumbDirection, thumbDirection2};
    }

    public static ThumbDirection valueOf(String str) {
        return (ThumbDirection) Enum.valueOf(ThumbDirection.class, str);
    }

    public static ThumbDirection[] values() {
        return (ThumbDirection[]) $VALUES.clone();
    }
}
