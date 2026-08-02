package com.squareup.cash.cdf.account;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CleanupStyle {
    public static final /* synthetic */ CleanupStyle[] $VALUES;
    public static final CleanupStyle ACCOUNT_SWITCH;
    public static final CleanupStyle FULL;

    static {
        CleanupStyle cleanupStyle = new CleanupStyle("FULL", 0);
        FULL = cleanupStyle;
        CleanupStyle cleanupStyle2 = new CleanupStyle("ACCOUNT_SWITCH", 1);
        ACCOUNT_SWITCH = cleanupStyle2;
        $VALUES = new CleanupStyle[]{cleanupStyle, cleanupStyle2};
    }

    public static CleanupStyle valueOf(String str) {
        return (CleanupStyle) Enum.valueOf(CleanupStyle.class, str);
    }

    public static CleanupStyle[] values() {
        return (CleanupStyle[]) $VALUES.clone();
    }
}
