package com.squareup.cash.cdf.alertbannernotification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class State {
    public static final /* synthetic */ State[] $VALUES;
    public static final State INFO;
    public static final State SUCCESS;
    public static final State WARNING;

    static {
        State state = new State("WARNING", 0);
        WARNING = state;
        State state2 = new State("INFO", 1);
        INFO = state2;
        State state3 = new State("SUCCESS", 2);
        SUCCESS = state3;
        $VALUES = new State[]{state, state2, state3, new State("UNSPECIFIED", 3)};
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
