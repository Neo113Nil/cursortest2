package com.squareup.cash.cdf.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SessionAttributeChange {
    public static final /* synthetic */ SessionAttributeChange[] $VALUES;
    public static final SessionAttributeChange CHANGED;
    public static final SessionAttributeChange DELETED;
    public static final SessionAttributeChange NONE;
    public static final SessionAttributeChange SET;

    static {
        SessionAttributeChange sessionAttributeChange = new SessionAttributeChange("NONE", 0);
        NONE = sessionAttributeChange;
        SessionAttributeChange sessionAttributeChange2 = new SessionAttributeChange("SET", 1);
        SET = sessionAttributeChange2;
        SessionAttributeChange sessionAttributeChange3 = new SessionAttributeChange("CHANGED", 2);
        CHANGED = sessionAttributeChange3;
        SessionAttributeChange sessionAttributeChange4 = new SessionAttributeChange("DELETED", 3);
        DELETED = sessionAttributeChange4;
        $VALUES = new SessionAttributeChange[]{sessionAttributeChange, sessionAttributeChange2, sessionAttributeChange3, sessionAttributeChange4};
    }

    public static SessionAttributeChange valueOf(String str) {
        return (SessionAttributeChange) Enum.valueOf(SessionAttributeChange.class, str);
    }

    public static SessionAttributeChange[] values() {
        return (SessionAttributeChange[]) $VALUES.clone();
    }
}
