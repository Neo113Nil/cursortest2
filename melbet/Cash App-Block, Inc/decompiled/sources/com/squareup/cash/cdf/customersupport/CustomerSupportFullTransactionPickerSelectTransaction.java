package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportFullTransactionPickerSelectTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final String flow_token;
    public final FullTransactionPickerOrigin origin;
    public final LinkedHashMap parameters;

    public CustomerSupportFullTransactionPickerSelectTransaction(String str, String str2, FullTransactionPickerOrigin fullTransactionPickerOrigin) {
        this.flow_token = str;
        this.entity_id = str2;
        this.origin = fullTransactionPickerOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "FullTransactionPicker");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "entity_id", str2);
        Countries.putSafe(m, "origin", fullTransactionPickerOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportFullTransactionPickerSelectTransaction)) {
            return false;
        }
        CustomerSupportFullTransactionPickerSelectTransaction customerSupportFullTransactionPickerSelectTransaction = (CustomerSupportFullTransactionPickerSelectTransaction) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportFullTransactionPickerSelectTransaction.flow_token) && this.entity_id.equals(customerSupportFullTransactionPickerSelectTransaction.entity_id) && this.origin == customerSupportFullTransactionPickerSelectTransaction.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport FullTransactionPicker SelectTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.entity_id);
        FullTransactionPickerOrigin fullTransactionPickerOrigin = this.origin;
        return m + (fullTransactionPickerOrigin != null ? fullTransactionPickerOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportFullTransactionPickerSelectTransaction(flow_token=", this.flow_token, ", entity_id=", this.entity_id, ", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
