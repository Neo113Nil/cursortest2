package com.squareup.cash.moneybot.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class OverflowMenuItem {
    public static final /* synthetic */ OverflowMenuItem[] $VALUES;
    public static final OverflowMenuItem AUTOMATIONS;
    public static final OverflowMenuItem NEW_CHAT;

    static {
        OverflowMenuItem overflowMenuItem = new OverflowMenuItem("NEW_CHAT", 0);
        NEW_CHAT = overflowMenuItem;
        OverflowMenuItem overflowMenuItem2 = new OverflowMenuItem("AUTOMATIONS", 1);
        AUTOMATIONS = overflowMenuItem2;
        $VALUES = new OverflowMenuItem[]{overflowMenuItem, overflowMenuItem2};
    }

    public static OverflowMenuItem valueOf(String str) {
        return (OverflowMenuItem) Enum.valueOf(OverflowMenuItem.class, str);
    }

    public static OverflowMenuItem[] values() {
        return (OverflowMenuItem[]) $VALUES.clone();
    }
}
