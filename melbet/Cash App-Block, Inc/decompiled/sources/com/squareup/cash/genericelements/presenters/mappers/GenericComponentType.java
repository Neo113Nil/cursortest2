package com.squareup.cash.genericelements.presenters.mappers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GenericComponentType {
    public static final /* synthetic */ GenericComponentType[] $VALUES;
    public static final GenericComponentType BASE_CARD;
    public static final GenericComponentType BLANK_DIVIDER;
    public static final GenericComponentType BUTTON_CTA_GROUP;
    public static final GenericComponentType CELL_ACTIVITY;
    public static final GenericComponentType CELL_DEFAULT;
    public static final GenericComponentType COMPACT_CARD;
    public static final GenericComponentType COMPACT_INFO;
    public static final GenericComponentType DETAILED_CARD;
    public static final GenericComponentType FULL_WIDTH;
    public static final GenericComponentType LINE_DIVIDER;
    public static final GenericComponentType LIST_UNORDERED;
    public static final GenericComponentType SECTION_HEADER;
    public static final GenericComponentType TWO_COLUMN;
    public static final GenericComponentType TWO_COLUMN_CARD;
    public static final GenericComponentType TWO_COLUMN_ROW;
    public static final GenericComponentType VALUE_UNIT;

    static {
        GenericComponentType genericComponentType = new GenericComponentType("TWO_COLUMN", 0);
        TWO_COLUMN = genericComponentType;
        GenericComponentType genericComponentType2 = new GenericComponentType("FULL_WIDTH", 1);
        FULL_WIDTH = genericComponentType2;
        GenericComponentType genericComponentType3 = new GenericComponentType("BASE_CARD", 2);
        BASE_CARD = genericComponentType3;
        GenericComponentType genericComponentType4 = new GenericComponentType("DETAILED_CARD", 3);
        DETAILED_CARD = genericComponentType4;
        GenericComponentType genericComponentType5 = new GenericComponentType("VALUE_UNIT", 4);
        VALUE_UNIT = genericComponentType5;
        GenericComponentType genericComponentType6 = new GenericComponentType("COMPACT_CARD", 5);
        COMPACT_CARD = genericComponentType6;
        GenericComponentType genericComponentType7 = new GenericComponentType("LINE_DIVIDER", 6);
        LINE_DIVIDER = genericComponentType7;
        GenericComponentType genericComponentType8 = new GenericComponentType("BLANK_DIVIDER", 7);
        BLANK_DIVIDER = genericComponentType8;
        GenericComponentType genericComponentType9 = new GenericComponentType("COMPACT_INFO", 8);
        COMPACT_INFO = genericComponentType9;
        GenericComponentType genericComponentType10 = new GenericComponentType("TWO_COLUMN_CARD", 9);
        TWO_COLUMN_CARD = genericComponentType10;
        GenericComponentType genericComponentType11 = new GenericComponentType("TWO_COLUMN_ROW", 10);
        TWO_COLUMN_ROW = genericComponentType11;
        GenericComponentType genericComponentType12 = new GenericComponentType("SECTION_HEADER", 11);
        SECTION_HEADER = genericComponentType12;
        GenericComponentType genericComponentType13 = new GenericComponentType("CELL_ACTIVITY", 12);
        CELL_ACTIVITY = genericComponentType13;
        GenericComponentType genericComponentType14 = new GenericComponentType("CELL_DEFAULT", 13);
        CELL_DEFAULT = genericComponentType14;
        GenericComponentType genericComponentType15 = new GenericComponentType("LIST_UNORDERED", 14);
        LIST_UNORDERED = genericComponentType15;
        GenericComponentType genericComponentType16 = new GenericComponentType("BUTTON_CTA_GROUP", 15);
        BUTTON_CTA_GROUP = genericComponentType16;
        $VALUES = new GenericComponentType[]{genericComponentType, genericComponentType2, genericComponentType3, genericComponentType4, genericComponentType5, genericComponentType6, genericComponentType7, genericComponentType8, genericComponentType9, genericComponentType10, genericComponentType11, genericComponentType12, genericComponentType13, genericComponentType14, genericComponentType15, genericComponentType16};
    }

    public static GenericComponentType valueOf(String str) {
        return (GenericComponentType) Enum.valueOf(GenericComponentType.class, str);
    }

    public static GenericComponentType[] values() {
        return (GenericComponentType[]) $VALUES.clone();
    }
}
