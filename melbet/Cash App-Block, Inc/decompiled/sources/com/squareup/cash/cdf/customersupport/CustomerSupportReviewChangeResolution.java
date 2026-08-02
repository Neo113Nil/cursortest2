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
public final class CustomerSupportReviewChangeResolution implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Boolean resolved;
    public final String survey_token;

    public CustomerSupportReviewChangeResolution(Boolean bool, String str) {
        this.resolved = bool;
        this.survey_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Review");
        Countries.putSafe(m, "resolved", bool);
        Countries.putSafe(m, "survey_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportReviewChangeResolution)) {
            return false;
        }
        CustomerSupportReviewChangeResolution customerSupportReviewChangeResolution = (CustomerSupportReviewChangeResolution) obj;
        return Intrinsics.areEqual(this.resolved, customerSupportReviewChangeResolution.resolved) && Intrinsics.areEqual(this.survey_token, customerSupportReviewChangeResolution.survey_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Review ChangeResolution";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Boolean bool = this.resolved;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.survey_token;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerSupportReviewChangeResolution(resolved=" + this.resolved + ", survey_token=" + this.survey_token + ")";
    }
}
