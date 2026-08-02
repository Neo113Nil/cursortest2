package com.squareup.cash.cdf.moneybothome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EntryPointSurface {
    public static final /* synthetic */ EntryPointSurface[] $VALUES;
    public static final EntryPointSurface ACTIVITY;
    public static final EntryPointSurface MONEY;
    public static final EntryPointSurface NEIGHBORHOODS;
    public static final EntryPointSurface PAYMENT_PAD;

    static {
        EntryPointSurface entryPointSurface = new EntryPointSurface("ACTIVITY", 0);
        ACTIVITY = entryPointSurface;
        EntryPointSurface entryPointSurface2 = new EntryPointSurface("DEEP_LINK", 1);
        EntryPointSurface entryPointSurface3 = new EntryPointSurface("IN_APP_MESSAGE", 2);
        EntryPointSurface entryPointSurface4 = new EntryPointSurface("MONEY", 3);
        MONEY = entryPointSurface4;
        EntryPointSurface entryPointSurface5 = new EntryPointSurface("NEIGHBORHOODS", 4);
        NEIGHBORHOODS = entryPointSurface5;
        EntryPointSurface entryPointSurface6 = new EntryPointSurface("PAYMENT_PAD", 5);
        PAYMENT_PAD = entryPointSurface6;
        $VALUES = new EntryPointSurface[]{entryPointSurface, entryPointSurface2, entryPointSurface3, entryPointSurface4, entryPointSurface5, entryPointSurface6, new EntryPointSurface("PUSH_NOTIFICATION", 6)};
    }

    public static EntryPointSurface valueOf(String str) {
        return (EntryPointSurface) Enum.valueOf(EntryPointSurface.class, str);
    }

    public static EntryPointSurface[] values() {
        return (EntryPointSurface[]) $VALUES.clone();
    }
}
