package com.squareup.cash.cdf.shifts;

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
public final class ShiftsPayViewScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String person_token;

    public ShiftsPayViewScreen(String str, String str2) {
        this.person_token = str;
        this.merchant_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Shifts", "cdf_action", "Pay");
        Countries.putSafe(m, "person_token", str);
        Countries.putSafe(m, "employee_token", "");
        Countries.putSafe(m, "merchant_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsPayViewScreen)) {
            return false;
        }
        ShiftsPayViewScreen shiftsPayViewScreen = (ShiftsPayViewScreen) obj;
        return this.person_token.equals(shiftsPayViewScreen.person_token) && Intrinsics.areEqual(this.merchant_token, shiftsPayViewScreen.merchant_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Shifts Pay ViewScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.person_token.hashCode() * 961;
        String str = this.merchant_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ShiftsPayViewScreen(person_token=", this.person_token, ", employee_token=, merchant_token=", this.merchant_token, ")");
    }
}
