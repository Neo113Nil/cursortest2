package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TrailingZeroesBehavior {
    public static final /* synthetic */ TrailingZeroesBehavior[] $VALUES;
    public static final TrailingZeroesBehavior SHOW_ALL;
    public static final TrailingZeroesBehavior SHOW_NONE;
    public static final TrailingZeroesBehavior SHOW_TWO;

    static {
        TrailingZeroesBehavior trailingZeroesBehavior = new TrailingZeroesBehavior("SHOW_NONE", 0);
        SHOW_NONE = trailingZeroesBehavior;
        TrailingZeroesBehavior trailingZeroesBehavior2 = new TrailingZeroesBehavior("SHOW_ALL", 1);
        SHOW_ALL = trailingZeroesBehavior2;
        TrailingZeroesBehavior trailingZeroesBehavior3 = new TrailingZeroesBehavior("SHOW_TWO", 2);
        SHOW_TWO = trailingZeroesBehavior3;
        $VALUES = new TrailingZeroesBehavior[]{trailingZeroesBehavior, trailingZeroesBehavior2, trailingZeroesBehavior3};
    }

    public static TrailingZeroesBehavior valueOf(String str) {
        return (TrailingZeroesBehavior) Enum.valueOf(TrailingZeroesBehavior.class, str);
    }

    public static TrailingZeroesBehavior[] values() {
        return (TrailingZeroesBehavior[]) $VALUES.clone();
    }
}
