package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneybotSurface {
    public static final /* synthetic */ MoneybotSurface[] $VALUES;
    public static final MoneybotSurface CHAT;
    public static final MoneybotSurface HOME;

    static {
        MoneybotSurface moneybotSurface = new MoneybotSurface("HOME", 0);
        HOME = moneybotSurface;
        MoneybotSurface moneybotSurface2 = new MoneybotSurface("CHAT", 1);
        CHAT = moneybotSurface2;
        $VALUES = new MoneybotSurface[]{moneybotSurface, moneybotSurface2};
    }

    public static MoneybotSurface valueOf(String str) {
        return (MoneybotSurface) Enum.valueOf(MoneybotSurface.class, str);
    }

    public static MoneybotSurface[] values() {
        return (MoneybotSurface[]) $VALUES.clone();
    }
}
