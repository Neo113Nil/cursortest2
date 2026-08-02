package com.squareup.cash.cdf.customersupport;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerSupportReviewChangeReason implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String reason;
    public final Boolean selected;
    public final String survey_token;

    public CustomerSupportReviewChangeReason(Boolean bool, String str, String str2) {
        this.reason = str;
        this.selected = bool;
        this.survey_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Review");
        Countries.putSafe(m, "reason", str);
        Countries.putSafe(m, "selected", bool);
        Countries.putSafe(m, "survey_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportReviewChangeReason)) {
            return false;
        }
        CustomerSupportReviewChangeReason customerSupportReviewChangeReason = (CustomerSupportReviewChangeReason) obj;
        return Intrinsics.areEqual(this.reason, customerSupportReviewChangeReason.reason) && this.selected.equals(customerSupportReviewChangeReason.selected) && Intrinsics.areEqual(this.survey_token, customerSupportReviewChangeReason.survey_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Review ChangeReason";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.reason;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.selected, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.survey_token;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.selected, "CustomerSupportReviewChangeReason(reason=", this.reason, ", selected=", ", survey_token="), this.survey_token, ")");
    }
}
