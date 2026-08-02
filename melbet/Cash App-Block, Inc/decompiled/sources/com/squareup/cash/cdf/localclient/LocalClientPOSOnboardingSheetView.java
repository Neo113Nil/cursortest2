package com.squareup.cash.cdf.localclient;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientPOSOnboardingSheetView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String body;
    public final Boolean how_it_works_shown;
    public final LinkedHashMap parameters;
    public final String title;

    public LocalClientPOSOnboardingSheetView(String str, String str2, Boolean bool) {
        this.title = str;
        this.body = str2;
        this.how_it_works_shown = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "LocalClient", "cdf_action", "POSOnboardingSheet");
        Countries.putSafe(m, "title", str);
        Countries.putSafe(m, "body", str2);
        Countries.putSafe(m, "how_it_works_shown", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientPOSOnboardingSheetView)) {
            return false;
        }
        LocalClientPOSOnboardingSheetView localClientPOSOnboardingSheetView = (LocalClientPOSOnboardingSheetView) obj;
        return this.title.equals(localClientPOSOnboardingSheetView.title) && this.body.equals(localClientPOSOnboardingSheetView.body) && this.how_it_works_shown.equals(localClientPOSOnboardingSheetView.how_it_works_shown);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient POSOnboardingSheet View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.how_it_works_shown.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientPOSOnboardingSheetView(title=", this.title, ", body=", this.body, ", how_it_works_shown="), this.how_it_works_shown, ")");
    }
}
