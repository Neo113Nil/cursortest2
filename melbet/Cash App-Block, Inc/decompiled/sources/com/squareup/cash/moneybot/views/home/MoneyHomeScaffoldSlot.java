package com.squareup.cash.moneybot.views.home;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneyHomeScaffoldSlot {
    public static final /* synthetic */ MoneyHomeScaffoldSlot[] $VALUES;
    public static final MoneyHomeScaffoldSlot Composer;
    public static final MoneyHomeScaffoldSlot ComposerBackground;
    public static final MoneyHomeScaffoldSlot Content;
    public static final MoneyHomeScaffoldSlot TitleBar;

    static {
        MoneyHomeScaffoldSlot moneyHomeScaffoldSlot = new MoneyHomeScaffoldSlot("TitleBar", 0);
        TitleBar = moneyHomeScaffoldSlot;
        MoneyHomeScaffoldSlot moneyHomeScaffoldSlot2 = new MoneyHomeScaffoldSlot("Composer", 1);
        Composer = moneyHomeScaffoldSlot2;
        MoneyHomeScaffoldSlot moneyHomeScaffoldSlot3 = new MoneyHomeScaffoldSlot("ComposerBackground", 2);
        ComposerBackground = moneyHomeScaffoldSlot3;
        MoneyHomeScaffoldSlot moneyHomeScaffoldSlot4 = new MoneyHomeScaffoldSlot("Content", 3);
        Content = moneyHomeScaffoldSlot4;
        $VALUES = new MoneyHomeScaffoldSlot[]{moneyHomeScaffoldSlot, moneyHomeScaffoldSlot2, moneyHomeScaffoldSlot3, moneyHomeScaffoldSlot4};
    }

    public static MoneyHomeScaffoldSlot valueOf(String str) {
        return (MoneyHomeScaffoldSlot) Enum.valueOf(MoneyHomeScaffoldSlot.class, str);
    }

    public static MoneyHomeScaffoldSlot[] values() {
        return (MoneyHomeScaffoldSlot[]) $VALUES.clone();
    }
}
