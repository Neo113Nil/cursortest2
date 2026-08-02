package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes5.dex */
public final class ChangePasswordViewModel {
    public final State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State ACTIVE;
        public static final State INACTIVE;

        static {
            State state = new State("ACTIVE", 0);
            ACTIVE = state;
            State state2 = new State("INACTIVE", 1);
            INACTIVE = state2;
            $VALUES = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public ChangePasswordViewModel(State state) {
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangePasswordViewModel) && this.state == ((ChangePasswordViewModel) obj).state;
    }

    public final int hashCode() {
        return this.state.hashCode();
    }

    public final String toString() {
        return "ChangePasswordViewModel(state=" + this.state + ")";
    }
}
