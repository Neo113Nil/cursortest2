package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SearchOrigin {
    public static final /* synthetic */ SearchOrigin[] $VALUES;
    public static final SearchOrigin ACTIVITY_TAB;
    public static final SearchOrigin DISCOVER_TAB;
    public static final SearchOrigin MONEY;
    public static final SearchOrigin PAYMENT_PAD;
    public static final SearchOrigin UNSPECIFIED;

    static {
        SearchOrigin searchOrigin = new SearchOrigin("DISCOVER_TAB", 0);
        DISCOVER_TAB = searchOrigin;
        SearchOrigin searchOrigin2 = new SearchOrigin("MONEY", 1);
        MONEY = searchOrigin2;
        SearchOrigin searchOrigin3 = new SearchOrigin("PAYMENT_PAD", 2);
        PAYMENT_PAD = searchOrigin3;
        SearchOrigin searchOrigin4 = new SearchOrigin("ACTIVITY_TAB", 3);
        ACTIVITY_TAB = searchOrigin4;
        SearchOrigin searchOrigin5 = new SearchOrigin("UNSPECIFIED", 4);
        UNSPECIFIED = searchOrigin5;
        $VALUES = new SearchOrigin[]{searchOrigin, searchOrigin2, searchOrigin3, searchOrigin4, searchOrigin5};
    }

    public static SearchOrigin valueOf(String str) {
        return (SearchOrigin) Enum.valueOf(SearchOrigin.class, str);
    }

    public static SearchOrigin[] values() {
        return (SearchOrigin[]) $VALUES.clone();
    }
}
