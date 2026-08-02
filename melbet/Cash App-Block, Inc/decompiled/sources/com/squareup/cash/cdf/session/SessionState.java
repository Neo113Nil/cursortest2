package com.squareup.cash.cdf.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SessionState {
    public static final /* synthetic */ SessionState[] $VALUES;
    public static final SessionState AUTHENTICATED;
    public static final SessionState INITIATED;
    public static final SessionState NOT_INITIATED;
    public static final SessionState SWITCHING;

    static {
        SessionState sessionState = new SessionState("NOT_INITIATED", 0);
        NOT_INITIATED = sessionState;
        SessionState sessionState2 = new SessionState("INITIATED", 1);
        INITIATED = sessionState2;
        SessionState sessionState3 = new SessionState("AUTHENTICATED", 2);
        AUTHENTICATED = sessionState3;
        SessionState sessionState4 = new SessionState("SWITCHING", 3);
        SWITCHING = sessionState4;
        $VALUES = new SessionState[]{sessionState, sessionState2, sessionState3, sessionState4};
    }

    public static SessionState valueOf(String str) {
        return (SessionState) Enum.valueOf(SessionState.class, str);
    }

    public static SessionState[] values() {
        return (SessionState[]) $VALUES.clone();
    }
}
