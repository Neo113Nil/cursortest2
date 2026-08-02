package com.squareup.cash.cdf.earnings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class EarningsOnboardingViewCategorySelection implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String default_category;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public EarningsOnboardingViewCategorySelection(String str, String str2) {
        str.getClass();
        this.flow_token = str;
        this.default_category = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Earnings", "cdf_action", "Onboarding");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "default_category", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsOnboardingViewCategorySelection)) {
            return false;
        }
        EarningsOnboardingViewCategorySelection earningsOnboardingViewCategorySelection = (EarningsOnboardingViewCategorySelection) obj;
        return Intrinsics.areEqual(this.flow_token, earningsOnboardingViewCategorySelection.flow_token) && Intrinsics.areEqual(this.default_category, earningsOnboardingViewCategorySelection.default_category);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings Onboarding ViewCategorySelection";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.flow_token.hashCode() * 31;
        String str = this.default_category;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("EarningsOnboardingViewCategorySelection(flow_token=", this.flow_token, ", default_category=", this.default_category, ")");
    }
}
