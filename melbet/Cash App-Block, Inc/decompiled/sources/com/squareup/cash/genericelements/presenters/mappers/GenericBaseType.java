package com.squareup.cash.genericelements.presenters.mappers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GenericBaseType {
    public static final /* synthetic */ GenericBaseType[] $VALUES;
    public static final GenericBaseType ARCADE_BADGED_AVATAR;
    public static final GenericBaseType ARCADE_BUTTON;
    public static final GenericBaseType ARCADE_TEXT;
    public static final GenericBaseType AVATAR;
    public static final GenericBaseType BETWEEN_SECTION_SPACER;
    public static final GenericBaseType BLANK_DIVIDER;
    public static final GenericBaseType BUTTON;
    public static final GenericBaseType COPY_CODE;
    public static final GenericBaseType ICON_BUTTON;
    public static final GenericBaseType ICON_TEXT_DETAIL;
    public static final GenericBaseType IMAGE;
    public static final GenericBaseType PILL_TEXT;
    public static final GenericBaseType PROGRESS_METER;
    public static final GenericBaseType TEXT;
    public static final GenericBaseType WITHIN_SECTION_SPACER;

    static {
        GenericBaseType genericBaseType = new GenericBaseType("TEXT", 0);
        TEXT = genericBaseType;
        GenericBaseType genericBaseType2 = new GenericBaseType("BUTTON", 1);
        BUTTON = genericBaseType2;
        GenericBaseType genericBaseType3 = new GenericBaseType("ICON_BUTTON", 2);
        ICON_BUTTON = genericBaseType3;
        GenericBaseType genericBaseType4 = new GenericBaseType("IMAGE", 3);
        IMAGE = genericBaseType4;
        GenericBaseType genericBaseType5 = new GenericBaseType("PROGRESS_METER", 4);
        PROGRESS_METER = genericBaseType5;
        GenericBaseType genericBaseType6 = new GenericBaseType("AVATAR", 5);
        AVATAR = genericBaseType6;
        GenericBaseType genericBaseType7 = new GenericBaseType("ARCADE_BADGED_AVATAR", 6);
        ARCADE_BADGED_AVATAR = genericBaseType7;
        GenericBaseType genericBaseType8 = new GenericBaseType("BLANK_DIVIDER", 7);
        BLANK_DIVIDER = genericBaseType8;
        GenericBaseType genericBaseType9 = new GenericBaseType("ICON_TEXT_DETAIL", 8);
        ICON_TEXT_DETAIL = genericBaseType9;
        GenericBaseType genericBaseType10 = new GenericBaseType("PILL_TEXT", 9);
        PILL_TEXT = genericBaseType10;
        GenericBaseType genericBaseType11 = new GenericBaseType("WITHIN_SECTION_SPACER", 10);
        WITHIN_SECTION_SPACER = genericBaseType11;
        GenericBaseType genericBaseType12 = new GenericBaseType("BETWEEN_SECTION_SPACER", 11);
        BETWEEN_SECTION_SPACER = genericBaseType12;
        GenericBaseType genericBaseType13 = new GenericBaseType("ARCADE_TEXT", 12);
        ARCADE_TEXT = genericBaseType13;
        GenericBaseType genericBaseType14 = new GenericBaseType("ARCADE_BUTTON", 13);
        ARCADE_BUTTON = genericBaseType14;
        GenericBaseType genericBaseType15 = new GenericBaseType("COPY_CODE", 14);
        COPY_CODE = genericBaseType15;
        $VALUES = new GenericBaseType[]{genericBaseType, genericBaseType2, genericBaseType3, genericBaseType4, genericBaseType5, genericBaseType6, genericBaseType7, genericBaseType8, genericBaseType9, genericBaseType10, genericBaseType11, genericBaseType12, genericBaseType13, genericBaseType14, genericBaseType15};
    }

    public static GenericBaseType valueOf(String str) {
        return (GenericBaseType) Enum.valueOf(GenericBaseType.class, str);
    }

    public static GenericBaseType[] values() {
        return (GenericBaseType[]) $VALUES.clone();
    }
}
