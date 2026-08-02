package com.squareup.cash.sheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SheetTopCornerBehavior {
    public static final /* synthetic */ SheetTopCornerBehavior[] $VALUES;
    public static final SheetTopCornerBehavior AlwaysRounded;
    public static final SheetTopCornerBehavior SquareAtStatusBar;

    static {
        SheetTopCornerBehavior sheetTopCornerBehavior = new SheetTopCornerBehavior("SquareAtStatusBar", 0);
        SquareAtStatusBar = sheetTopCornerBehavior;
        SheetTopCornerBehavior sheetTopCornerBehavior2 = new SheetTopCornerBehavior("AlwaysRounded", 1);
        AlwaysRounded = sheetTopCornerBehavior2;
        $VALUES = new SheetTopCornerBehavior[]{sheetTopCornerBehavior, sheetTopCornerBehavior2};
    }

    public static SheetTopCornerBehavior valueOf(String str) {
        return (SheetTopCornerBehavior) Enum.valueOf(SheetTopCornerBehavior.class, str);
    }

    public static SheetTopCornerBehavior[] values() {
        return (SheetTopCornerBehavior[]) $VALUES.clone();
    }
}
