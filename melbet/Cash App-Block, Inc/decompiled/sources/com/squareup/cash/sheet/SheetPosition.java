package com.squareup.cash.sheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SheetPosition {
    public static final /* synthetic */ SheetPosition[] $VALUES;
    public static final SheetPosition Collapsed;
    public static final SheetPosition Expanded;
    public static final SheetPosition Hidden;
    public static final SheetPosition Peeking;

    static {
        SheetPosition sheetPosition = new SheetPosition("Expanded", 0);
        Expanded = sheetPosition;
        SheetPosition sheetPosition2 = new SheetPosition("Peeking", 1);
        Peeking = sheetPosition2;
        SheetPosition sheetPosition3 = new SheetPosition("Collapsed", 2);
        Collapsed = sheetPosition3;
        SheetPosition sheetPosition4 = new SheetPosition("Hidden", 3);
        Hidden = sheetPosition4;
        $VALUES = new SheetPosition[]{sheetPosition, sheetPosition2, sheetPosition3, sheetPosition4};
    }

    public static SheetPosition valueOf(String str) {
        return (SheetPosition) Enum.valueOf(SheetPosition.class, str);
    }

    public static SheetPosition[] values() {
        return (SheetPosition[]) $VALUES.clone();
    }
}
