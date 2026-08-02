package com.squareup.cash.profile.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CategoryListType {
    public static final /* synthetic */ CategoryListType[] $VALUES;
    public static final CategoryListType ACTIVITY;
    public static final CategoryListType INVESTING;
    public static final CategoryListType MARKETING;

    static {
        CategoryListType categoryListType = new CategoryListType("ACTIVITY", 0);
        ACTIVITY = categoryListType;
        CategoryListType categoryListType2 = new CategoryListType("INVESTING", 1);
        INVESTING = categoryListType2;
        CategoryListType categoryListType3 = new CategoryListType("MARKETING", 2);
        MARKETING = categoryListType3;
        $VALUES = new CategoryListType[]{categoryListType, categoryListType2, categoryListType3};
    }

    public static CategoryListType valueOf(String str) {
        return (CategoryListType) Enum.valueOf(CategoryListType.class, str);
    }

    public static CategoryListType[] values() {
        return (CategoryListType[]) $VALUES.clone();
    }
}
