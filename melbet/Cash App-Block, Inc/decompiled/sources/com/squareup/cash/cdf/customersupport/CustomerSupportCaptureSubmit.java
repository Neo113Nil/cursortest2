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
public final class CustomerSupportCaptureSubmit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String request_id;
    public final Integer screenshot_count;
    public final CaptureTrigger trigger;

    public CustomerSupportCaptureSubmit(String str, String str2, CaptureTrigger captureTrigger, Integer num) {
        this.flow_token = str;
        this.request_id = str2;
        this.trigger = captureTrigger;
        this.screenshot_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Capture");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "request_id", str2);
        Countries.putSafe(m, "trigger", captureTrigger);
        Countries.putSafe(m, "screenshot_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportCaptureSubmit)) {
            return false;
        }
        CustomerSupportCaptureSubmit customerSupportCaptureSubmit = (CustomerSupportCaptureSubmit) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportCaptureSubmit.flow_token) && Intrinsics.areEqual(this.request_id, customerSupportCaptureSubmit.request_id) && this.trigger == customerSupportCaptureSubmit.trigger && this.screenshot_count.equals(customerSupportCaptureSubmit.screenshot_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Capture Submit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.request_id;
        return this.screenshot_count.hashCode() + ((this.trigger.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportCaptureSubmit(flow_token=", this.flow_token, ", request_id=", this.request_id, ", trigger=");
        m.append(this.trigger);
        m.append(", screenshot_count=");
        m.append(this.screenshot_count);
        m.append(")");
        return m.toString();
    }
}
