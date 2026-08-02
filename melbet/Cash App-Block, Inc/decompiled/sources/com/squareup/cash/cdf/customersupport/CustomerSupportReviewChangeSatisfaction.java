package com.squareup.cash.cdf.customersupport;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerSupportReviewChangeSatisfaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final Integer satisfaction;
    public final String survey_token;

    public CustomerSupportReviewChangeSatisfaction(Integer num, String str) {
        this.satisfaction = num;
        this.survey_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Review");
        Countries.putSafe(m, "satisfaction", num);
        Countries.putSafe(m, "survey_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportReviewChangeSatisfaction)) {
            return false;
        }
        CustomerSupportReviewChangeSatisfaction customerSupportReviewChangeSatisfaction = (CustomerSupportReviewChangeSatisfaction) obj;
        return this.satisfaction.equals(customerSupportReviewChangeSatisfaction.satisfaction) && Intrinsics.areEqual(this.survey_token, customerSupportReviewChangeSatisfaction.survey_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Review ChangeSatisfaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.satisfaction.hashCode() * 31;
        String str = this.survey_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CustomerSupportReviewChangeSatisfaction(satisfaction=" + this.satisfaction + ", survey_token=" + this.survey_token + ")";
    }
}
