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
public final class CustomerSupportFullTransactionPickerStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final FullTransactionPickerOrigin origin;
    public final LinkedHashMap parameters;

    public CustomerSupportFullTransactionPickerStart(String str, FullTransactionPickerOrigin fullTransactionPickerOrigin) {
        this.flow_token = str;
        this.origin = fullTransactionPickerOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "FullTransactionPicker");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "origin", fullTransactionPickerOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportFullTransactionPickerStart)) {
            return false;
        }
        CustomerSupportFullTransactionPickerStart customerSupportFullTransactionPickerStart = (CustomerSupportFullTransactionPickerStart) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportFullTransactionPickerStart.flow_token) && this.origin == customerSupportFullTransactionPickerStart.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport FullTransactionPicker Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.origin.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CustomerSupportFullTransactionPickerStart(flow_token=" + this.flow_token + ", origin=" + this.origin + ")";
    }
}
