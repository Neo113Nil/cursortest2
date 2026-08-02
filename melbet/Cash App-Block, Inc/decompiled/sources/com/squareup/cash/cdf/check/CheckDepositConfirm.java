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
public final class CheckDepositConfirm implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Side side;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side BACK;
        public static final Side FRONT;

        static {
            Side side = new Side("BACK", 0);
            BACK = side;
            Side side2 = new Side("FRONT", 1);
            FRONT = side2;
            $VALUES = new Side[]{side, side2};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public CheckDepositConfirm(Side side) {
        this.side = side;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Check", "cdf_action", "Deposit");
        Countries.putSafe(m, "side", side);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckDepositConfirm) && this.side == ((CheckDepositConfirm) obj).side;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Check Deposit Confirm";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.side.hashCode();
    }

    public final String toString() {
        return "CheckDepositConfirm(side=" + this.side + ")";
    }
}
