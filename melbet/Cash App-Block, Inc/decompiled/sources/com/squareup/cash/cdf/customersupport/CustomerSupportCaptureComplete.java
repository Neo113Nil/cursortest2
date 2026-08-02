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
public final class CustomerSupportCaptureComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String request_id;
    public final CaptureTrigger trigger;

    public CustomerSupportCaptureComplete(String str, String str2, CaptureTrigger captureTrigger) {
        this.flow_token = str;
        this.request_id = str2;
        this.trigger = captureTrigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Capture");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "request_id", str2);
        Countries.putSafe(m, "trigger", captureTrigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportCaptureComplete)) {
            return false;
        }
        CustomerSupportCaptureComplete customerSupportCaptureComplete = (CustomerSupportCaptureComplete) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportCaptureComplete.flow_token) && Intrinsics.areEqual(this.request_id, customerSupportCaptureComplete.request_id) && this.trigger == customerSupportCaptureComplete.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Capture Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.request_id;
        return this.trigger.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportCaptureComplete(flow_token=", this.flow_token, ", request_id=", this.request_id, ", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
