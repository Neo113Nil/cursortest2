package com.squareup.cash.arcade.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class FilterBarChipType {
    public static final /* synthetic */ FilterBarChipType[] $VALUES;
    public static final FilterBarChipType Button;
    public static final FilterBarChipType Dropdown;

    static {
        FilterBarChipType filterBarChipType = new FilterBarChipType("Button", 0);
        Button = filterBarChipType;
        FilterBarChipType filterBarChipType2 = new FilterBarChipType("Dropdown", 1);
        Dropdown = filterBarChipType2;
        $VALUES = new FilterBarChipType[]{filterBarChipType, filterBarChipType2};
    }

    public static FilterBarChipType valueOf(String str) {
        return (FilterBarChipType) Enum.valueOf(FilterBarChipType.class, str);
    }

    public static FilterBarChipType[] values() {
        return (FilterBarChipType[]) $VALUES.clone();
    }
}
