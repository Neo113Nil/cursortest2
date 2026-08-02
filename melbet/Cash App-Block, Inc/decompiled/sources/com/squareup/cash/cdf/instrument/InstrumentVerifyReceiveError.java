package com.squareup.cash.cdf.instrument;

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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentVerifyReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final String message;
    public final Boolean network_error;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final String source;

    public InstrumentVerifyReceiveError(String str, String str2, String str3, Boolean bool, String str4, String str5, int i) {
        bool = (i & 8) != 0 ? null : bool;
        this.client_scenario = str;
        this.flow_token = str2;
        this.message = str3;
        this.network_error = bool;
        this.rate_plan = str4;
        this.source = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Instrument", "cdf_action", "Verify");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "message", str3);
        Countries.putSafe(m, "network_error", bool);
        Countries.putSafe(m, "rate_plan", str4);
        Countries.putSafe(m, "source", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentVerifyReceiveError)) {
            return false;
        }
        InstrumentVerifyReceiveError instrumentVerifyReceiveError = (InstrumentVerifyReceiveError) obj;
        return Intrinsics.areEqual(this.client_scenario, instrumentVerifyReceiveError.client_scenario) && Intrinsics.areEqual(this.flow_token, instrumentVerifyReceiveError.flow_token) && Intrinsics.areEqual(this.message, instrumentVerifyReceiveError.message) && Intrinsics.areEqual(this.network_error, instrumentVerifyReceiveError.network_error) && Intrinsics.areEqual(this.rate_plan, instrumentVerifyReceiveError.rate_plan) && Intrinsics.areEqual(this.source, instrumentVerifyReceiveError.source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Verify ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.network_error;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.rate_plan;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 961;
        String str5 = this.source;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentVerifyReceiveError(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", message=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.message, ", network_error=", this.network_error, ", rate_plan=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.rate_plan, ", response_code=null, source=", this.source, ")");
    }
}
