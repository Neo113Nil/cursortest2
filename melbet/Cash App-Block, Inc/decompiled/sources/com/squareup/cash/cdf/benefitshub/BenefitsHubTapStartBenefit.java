package com.squareup.cash.cdf.benefitshub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BenefitsHubTapStartBenefit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Benefit benefit;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Benefit {
        public static final /* synthetic */ Benefit[] $VALUES;
        public static final Benefit OverdraftCoverage;
        public static final Benefit Savings;

        static {
            Benefit benefit = new Benefit("OverdraftCoverage", 0);
            OverdraftCoverage = benefit;
            Benefit benefit2 = new Benefit("Savings", 1);
            Savings = benefit2;
            $VALUES = new Benefit[]{benefit, benefit2};
        }

        public static Benefit valueOf(String str) {
            return (Benefit) Enum.valueOf(Benefit.class, str);
        }

        public static Benefit[] values() {
            return (Benefit[]) $VALUES.clone();
        }
    }

    public BenefitsHubTapStartBenefit(Benefit benefit) {
        this.benefit = benefit;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BenefitsHub", "cdf_action", "Tap");
        Countries.putSafe(m, "benefit", benefit);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHubTapStartBenefit) && this.benefit == ((BenefitsHubTapStartBenefit) obj).benefit;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BenefitsHub Tap StartBenefit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Benefit benefit = this.benefit;
        if (benefit == null) {
            return 0;
        }
        return benefit.hashCode();
    }

    public final String toString() {
        return "BenefitsHubTapStartBenefit(benefit=" + this.benefit + ")";
    }
}
