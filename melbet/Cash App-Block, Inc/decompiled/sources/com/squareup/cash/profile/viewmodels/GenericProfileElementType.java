package com.squareup.cash.profile.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GenericProfileElementType {
    public static final /* synthetic */ GenericProfileElementType[] $VALUES;
    public static final GenericProfileElementType ACHIEVEMENTS;
    public static final GenericProfileElementType ACTIVITY;
    public static final GenericProfileElementType ACTIVITY_STATS_ELEMENT;
    public static final GenericProfileElementType BUTTON;
    public static final GenericProfileElementType ICON_TEXT;
    public static final GenericProfileElementType TEXT;
    public static final GenericProfileElementType TRUST_INDICATOR;

    static {
        GenericProfileElementType genericProfileElementType = new GenericProfileElementType("ACTIVITY", 0);
        ACTIVITY = genericProfileElementType;
        GenericProfileElementType genericProfileElementType2 = new GenericProfileElementType("ACTIVITY_STATS_ELEMENT", 1);
        ACTIVITY_STATS_ELEMENT = genericProfileElementType2;
        GenericProfileElementType genericProfileElementType3 = new GenericProfileElementType("BUTTON", 2);
        BUTTON = genericProfileElementType3;
        GenericProfileElementType genericProfileElementType4 = new GenericProfileElementType("ICON_TEXT", 3);
        ICON_TEXT = genericProfileElementType4;
        GenericProfileElementType genericProfileElementType5 = new GenericProfileElementType("TRUST_INDICATOR", 4);
        TRUST_INDICATOR = genericProfileElementType5;
        GenericProfileElementType genericProfileElementType6 = new GenericProfileElementType("TEXT", 5);
        TEXT = genericProfileElementType6;
        GenericProfileElementType genericProfileElementType7 = new GenericProfileElementType("ACHIEVEMENTS", 6);
        ACHIEVEMENTS = genericProfileElementType7;
        $VALUES = new GenericProfileElementType[]{genericProfileElementType, genericProfileElementType2, genericProfileElementType3, genericProfileElementType4, genericProfileElementType5, genericProfileElementType6, genericProfileElementType7};
    }

    public static GenericProfileElementType valueOf(String str) {
        return (GenericProfileElementType) Enum.valueOf(GenericProfileElementType.class, str);
    }

    public static GenericProfileElementType[] values() {
        return (GenericProfileElementType[]) $VALUES.clone();
    }
}
