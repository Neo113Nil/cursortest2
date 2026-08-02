package com.squareup.cash.cdf.benefitleaflet;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BenefitLeafletClickClickDone implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final BenefitType benefit_type;
    public final LinkedHashMap parameters;

    public BenefitLeafletClickClickDone(BenefitType benefitType) {
        this.benefit_type = benefitType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BenefitLeaflet", "cdf_action", "Click");
        Countries.putSafe(m, "benefit_type", benefitType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitLeafletClickClickDone) && this.benefit_type == ((BenefitLeafletClickClickDone) obj).benefit_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BenefitLeaflet Click ClickDone";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.benefit_type.hashCode();
    }

    public final String toString() {
        return "BenefitLeafletClickClickDone(benefit_type=" + this.benefit_type + ")";
    }
}
