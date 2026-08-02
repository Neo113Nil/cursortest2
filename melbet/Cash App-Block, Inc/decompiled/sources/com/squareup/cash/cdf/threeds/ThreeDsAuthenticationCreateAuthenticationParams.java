package com.squareup.cash.cdf.threeds;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ThreeDsAuthenticationCreateAuthenticationParams implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String flow_token;
    public final LinkedHashMap parameters;

    public ThreeDsAuthenticationCreateAuthenticationParams(String str) {
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "ThreeDs", "cdf_action", "Authentication");
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDsAuthenticationCreateAuthenticationParams) && Intrinsics.areEqual(this.flow_token, ((ThreeDsAuthenticationCreateAuthenticationParams) obj).flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ThreeDs Authentication CreateAuthenticationParams";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ThreeDsAuthenticationCreateAuthenticationParams(flow_token=", this.flow_token, ")");
    }
}
