package com.squareup.cash.cdf.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SessionTokenStatus {
    public static final /* synthetic */ SessionTokenStatus[] $VALUES;
    public static final SessionTokenStatus ANONYMOUS;
    public static final SessionTokenStatus FULL;
    public static final SessionTokenStatus PARTIAL;

    static {
        SessionTokenStatus sessionTokenStatus = new SessionTokenStatus("ANONYMOUS", 0);
        ANONYMOUS = sessionTokenStatus;
        SessionTokenStatus sessionTokenStatus2 = new SessionTokenStatus("PARTIAL", 1);
        PARTIAL = sessionTokenStatus2;
        SessionTokenStatus sessionTokenStatus3 = new SessionTokenStatus("FULL", 2);
        FULL = sessionTokenStatus3;
        $VALUES = new SessionTokenStatus[]{sessionTokenStatus, sessionTokenStatus2, sessionTokenStatus3};
    }

    public static SessionTokenStatus valueOf(String str) {
        return (SessionTokenStatus) Enum.valueOf(SessionTokenStatus.class, str);
    }

    public static SessionTokenStatus[] values() {
        return (SessionTokenStatus[]) $VALUES.clone();
    }
}
