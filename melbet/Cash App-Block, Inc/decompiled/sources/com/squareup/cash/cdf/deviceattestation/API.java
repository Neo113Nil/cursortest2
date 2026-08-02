package com.squareup.cash.cdf.deviceattestation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class API {
    public static final /* synthetic */ API[] $VALUES;
    public static final API PLAY_INTEGRITY;

    /* JADX INFO: Fake field, exist only in values array */
    API EF0;

    static {
        API api = new API("APP_ATTEST", 0);
        API api2 = new API("PLAY_INTEGRITY", 1);
        PLAY_INTEGRITY = api2;
        $VALUES = new API[]{api, api2, new API("SAFETY_NET", 2)};
    }

    public static API valueOf(String str) {
        return (API) Enum.valueOf(API.class, str);
    }

    public static API[] values() {
        return (API[]) $VALUES.clone();
    }
}
