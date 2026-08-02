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
public final class CheckDepositExit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Step step;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Step {
        public static final /* synthetic */ Step[] $VALUES;
        public static final Step AMOUNT_ENTRY;
        public static final Step CAPTURE;

        static {
            Step step = new Step("AMOUNT_ENTRY", 0);
            AMOUNT_ENTRY = step;
            Step step2 = new Step("ENDORSEMENT", 1);
            Step step3 = new Step("CAPTURE", 2);
            CAPTURE = step3;
            $VALUES = new Step[]{step, step2, step3};
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public CheckDepositExit(Step step) {
        this.step = step;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Check", "cdf_action", "Deposit");
        Countries.putSafe(m, "step", step);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckDepositExit) && this.step == ((CheckDepositExit) obj).step;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Check Deposit Exit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.step.hashCode();
    }

    public final String toString() {
        return "CheckDepositExit(step=" + this.step + ")";
    }
}
