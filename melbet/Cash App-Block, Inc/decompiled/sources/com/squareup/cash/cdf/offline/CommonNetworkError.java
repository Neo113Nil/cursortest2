package com.squareup.cash.cdf.offline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CommonNetworkError {
    public static final /* synthetic */ CommonNetworkError[] $VALUES;
    public static final CommonNetworkError CONNECTION_LOST;
    public static final CommonNetworkError CONNECTION_TIMED_OUT;
    public static final CommonNetworkError NOT_CONNECTED_TO_INTERNET;
    public static final CommonNetworkError OTHER;

    static {
        CommonNetworkError commonNetworkError = new CommonNetworkError("NOT_CONNECTED_TO_INTERNET", 0);
        NOT_CONNECTED_TO_INTERNET = commonNetworkError;
        CommonNetworkError commonNetworkError2 = new CommonNetworkError("CONNECTION_LOST", 1);
        CONNECTION_LOST = commonNetworkError2;
        CommonNetworkError commonNetworkError3 = new CommonNetworkError("CONNECTION_TIMED_OUT", 2);
        CONNECTION_TIMED_OUT = commonNetworkError3;
        CommonNetworkError commonNetworkError4 = new CommonNetworkError("OTHER", 3);
        OTHER = commonNetworkError4;
        $VALUES = new CommonNetworkError[]{commonNetworkError, commonNetworkError2, commonNetworkError3, commonNetworkError4};
    }

    public static CommonNetworkError valueOf(String str) {
        return (CommonNetworkError) Enum.valueOf(CommonNetworkError.class, str);
    }

    public static CommonNetworkError[] values() {
        return (CommonNetworkError[]) $VALUES.clone();
    }
}
