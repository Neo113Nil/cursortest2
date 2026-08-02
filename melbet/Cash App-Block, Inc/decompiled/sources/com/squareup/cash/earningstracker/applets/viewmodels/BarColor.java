package com.squareup.cash.earningstracker.applets.viewmodels;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BarColor {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ BarColor[] $VALUES;
    public static final BarColor ACTIVE;
    public static final BarColor DISABLED;
    public static final BarColor FUTURE;

    static {
        BarColor barColor = new BarColor("ACTIVE", 0);
        ACTIVE = barColor;
        BarColor barColor2 = new BarColor("DISABLED", 1);
        DISABLED = barColor2;
        BarColor barColor3 = new BarColor("FUTURE", 2);
        FUTURE = barColor3;
        BarColor[] barColorArr = {barColor, barColor2, barColor3};
        $VALUES = barColorArr;
        $ENTRIES = new EnumEntriesList(barColorArr);
    }

    public static BarColor valueOf(String str) {
        return (BarColor) Enum.valueOf(BarColor.class, str);
    }

    public static BarColor[] values() {
        return (BarColor[]) $VALUES.clone();
    }
}
