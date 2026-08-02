package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ActivityItemOrigin {
    public static final /* synthetic */ ActivityItemOrigin[] $VALUES;
    public static final ActivityItemOrigin HISTORY;
    public static final ActivityItemOrigin MERCHANT_PROFILE;
    public static final ActivityItemOrigin SEARCH_RESULTS;

    static {
        ActivityItemOrigin activityItemOrigin = new ActivityItemOrigin("HISTORY", 0);
        HISTORY = activityItemOrigin;
        ActivityItemOrigin activityItemOrigin2 = new ActivityItemOrigin("MERCHANT_PROFILE", 1);
        MERCHANT_PROFILE = activityItemOrigin2;
        ActivityItemOrigin activityItemOrigin3 = new ActivityItemOrigin("SEARCH_RESULTS", 2);
        SEARCH_RESULTS = activityItemOrigin3;
        $VALUES = new ActivityItemOrigin[]{activityItemOrigin, activityItemOrigin2, activityItemOrigin3};
    }

    public static ActivityItemOrigin valueOf(String str) {
        return (ActivityItemOrigin) Enum.valueOf(ActivityItemOrigin.class, str);
    }

    public static ActivityItemOrigin[] values() {
        return (ActivityItemOrigin[]) $VALUES.clone();
    }
}
