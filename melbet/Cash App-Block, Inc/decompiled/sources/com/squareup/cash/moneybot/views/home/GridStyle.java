package com.squareup.cash.moneybot.views.home;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class GridStyle {
    public static final /* synthetic */ GridStyle[] $VALUES;
    public static final GridStyle ASCII;
    public static final GridStyle GLYPH;

    /* JADX INFO: Fake field, exist only in values array */
    GridStyle EF0;

    static {
        GridStyle gridStyle = new GridStyle("DOTS", 0);
        GridStyle gridStyle2 = new GridStyle("ASCII", 1);
        ASCII = gridStyle2;
        GridStyle gridStyle3 = new GridStyle("GLYPH", 2);
        GLYPH = gridStyle3;
        $VALUES = new GridStyle[]{gridStyle, gridStyle2, gridStyle3};
    }

    public static GridStyle valueOf(String str) {
        return (GridStyle) Enum.valueOf(GridStyle.class, str);
    }

    public static GridStyle[] values() {
        return (GridStyle[]) $VALUES.clone();
    }
}
