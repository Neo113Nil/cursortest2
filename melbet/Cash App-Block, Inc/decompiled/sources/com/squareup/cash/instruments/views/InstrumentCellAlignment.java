package com.squareup.cash.instruments.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InstrumentCellAlignment {
    public static final /* synthetic */ InstrumentCellAlignment[] $VALUES;
    public static final InstrumentCellAlignment LEFT;
    public static final InstrumentCellAlignment RIGHT;

    static {
        InstrumentCellAlignment instrumentCellAlignment = new InstrumentCellAlignment("LEFT", 0);
        LEFT = instrumentCellAlignment;
        InstrumentCellAlignment instrumentCellAlignment2 = new InstrumentCellAlignment("RIGHT", 1);
        RIGHT = instrumentCellAlignment2;
        $VALUES = new InstrumentCellAlignment[]{instrumentCellAlignment, instrumentCellAlignment2};
    }

    public static InstrumentCellAlignment valueOf(String str) {
        return (InstrumentCellAlignment) Enum.valueOf(InstrumentCellAlignment.class, str);
    }

    public static InstrumentCellAlignment[] values() {
        return (InstrumentCellAlignment[]) $VALUES.clone();
    }
}
