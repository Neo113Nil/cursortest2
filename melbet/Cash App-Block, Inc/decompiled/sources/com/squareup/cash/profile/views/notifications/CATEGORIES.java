package com.squareup.cash.profile.views.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CATEGORIES {
    public static final /* synthetic */ CATEGORIES[] $VALUES;
    public static final CATEGORIES OTHER;
    public static final CATEGORIES STOCK_I_FOLLOW;
    public static final CATEGORIES STOCK_I_OWN;

    static {
        CATEGORIES categories = new CATEGORIES("STOCK_I_OWN", 0);
        STOCK_I_OWN = categories;
        CATEGORIES categories2 = new CATEGORIES("STOCK_I_FOLLOW", 1);
        STOCK_I_FOLLOW = categories2;
        CATEGORIES categories3 = new CATEGORIES("OTHER", 2);
        OTHER = categories3;
        $VALUES = new CATEGORIES[]{categories, categories2, categories3};
    }

    public static CATEGORIES valueOf(String str) {
        return (CATEGORIES) Enum.valueOf(CATEGORIES.class, str);
    }

    public static CATEGORIES[] values() {
        return (CATEGORIES[]) $VALUES.clone();
    }
}
