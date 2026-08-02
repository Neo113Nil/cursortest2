package com.squareup.cash.cdf.cashapppay;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
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
public final class CashAppPayAuthDismissError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String paykit_url;
    public final String referrer_flow_token;

    public CashAppPayAuthDismissError(String str, String str2, BrowserOrigin browserOrigin) {
        this.referrer_flow_token = str;
        this.paykit_url = str2;
        this.origin = browserOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashAppPay", "cdf_action", "Auth");
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "paykit_url", str2);
        Countries.putSafe(m, "origin", browserOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayAuthDismissError)) {
            return false;
        }
        CashAppPayAuthDismissError cashAppPayAuthDismissError = (CashAppPayAuthDismissError) obj;
        return Intrinsics.areEqual(this.referrer_flow_token, cashAppPayAuthDismissError.referrer_flow_token) && Intrinsics.areEqual(this.paykit_url, cashAppPayAuthDismissError.paykit_url) && this.origin == cashAppPayAuthDismissError.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppPay Auth DismissError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.referrer_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paykit_url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        return hashCode2 + (browserOrigin != null ? browserOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashAppPayAuthDismissError(referrer_flow_token=", this.referrer_flow_token, ", paykit_url=", this.paykit_url, ", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
