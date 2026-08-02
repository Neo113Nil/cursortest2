package com.squareup.cash.cdf.check;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CheckDepositVerify implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Side side;
    public final State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side BACK;
        public static final Side FRONT;

        static {
            Side side = new Side("FRONT", 0);
            FRONT = side;
            Side side2 = new Side("BACK", 1);
            BACK = side2;
            $VALUES = new Side[]{side, side2};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State CAPTURING;
        public static final State START;
        public static final State SUBMIT;

        static {
            State state = new State("START", 0);
            START = state;
            State state2 = new State("CAPTURING", 1);
            CAPTURING = state2;
            State state3 = new State("CAPTURED", 2);
            State state4 = new State("SUBMIT", 3);
            SUBMIT = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public CheckDepositVerify(Side side, State state, int i) {
        side = (i & 2) != 0 ? null : side;
        this.side = side;
        this.state = state;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Check", "cdf_action", "Deposit");
        Countries.putSafe(m, "side", side);
        Countries.putSafe(m, "state", state);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDepositVerify)) {
            return false;
        }
        CheckDepositVerify checkDepositVerify = (CheckDepositVerify) obj;
        return this.side == checkDepositVerify.side && this.state == checkDepositVerify.state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Check Deposit Verify";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Side side = this.side;
        return this.state.hashCode() + ((side == null ? 0 : side.hashCode()) * 31);
    }

    public final String toString() {
        return "CheckDepositVerify(capture_mode=null, side=" + this.side + ", state=" + this.state + ")";
    }
}
