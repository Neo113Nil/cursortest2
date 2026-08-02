package com.squareup.cash.knot.backend.real;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KnotEventConstants {
    public static final /* synthetic */ KnotEventConstants[] $VALUES = {new KnotEventConstants("REFRESH_SESSION_REQUEST", 0), new KnotEventConstants("MERCHANT_CLICKED", 1), new KnotEventConstants("LOGIN_STARTED", 2), new KnotEventConstants("AUTHENTICATED", 3), new KnotEventConstants("OTP_REQUIRED", 4), new KnotEventConstants("SECURITY_QUESTIONS_REQUIRED", 5), new KnotEventConstants("APPROVAL_REQUIRED", 6), new KnotEventConstants("ZIPCODE_REQUIRED", 7), new KnotEventConstants("LICENSE_REQUIRED", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    KnotEventConstants EF5;

    public static KnotEventConstants valueOf(String str) {
        return (KnotEventConstants) Enum.valueOf(KnotEventConstants.class, str);
    }

    public static KnotEventConstants[] values() {
        return (KnotEventConstants[]) $VALUES.clone();
    }
}
