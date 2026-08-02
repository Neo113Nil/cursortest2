package com.squareup.cash.cdf.browser;

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
public final class BrowserCheckoutRestrictedItemFailApiCall implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final Integer http_failure_code;
    public final InfoContext info_context;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutRestrictedItemFailApiCall(InfoContext infoContext, Integer num, String str, String str2) {
        this.info_context = infoContext;
        this.http_failure_code = num;
        this.entity_token = str;
        this.referrer_flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "http_failure_code", num);
        Countries.putSafe(m, "entity_token", str);
        Countries.putSafe(m, "referrer_flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutRestrictedItemFailApiCall)) {
            return false;
        }
        BrowserCheckoutRestrictedItemFailApiCall browserCheckoutRestrictedItemFailApiCall = (BrowserCheckoutRestrictedItemFailApiCall) obj;
        return this.info_context == browserCheckoutRestrictedItemFailApiCall.info_context && Intrinsics.areEqual(this.http_failure_code, browserCheckoutRestrictedItemFailApiCall.http_failure_code) && Intrinsics.areEqual(this.entity_token, browserCheckoutRestrictedItemFailApiCall.entity_token) && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutRestrictedItemFailApiCall.referrer_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout RestrictedItemFailApiCall";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InfoContext infoContext = this.info_context;
        int hashCode = (infoContext == null ? 0 : infoContext.hashCode()) * 31;
        Integer num = this.http_failure_code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.entity_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referrer_flow_token;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserCheckoutRestrictedItemFailApiCall(info_context=");
        sb.append(this.info_context);
        sb.append(", http_failure_code=");
        sb.append(this.http_failure_code);
        sb.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entity_token, ", referrer_flow_token=", this.referrer_flow_token, ")");
    }
}
