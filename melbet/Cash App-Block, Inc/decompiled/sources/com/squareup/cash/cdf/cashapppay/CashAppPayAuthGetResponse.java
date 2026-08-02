package com.squareup.cash.cdf.cashapppay;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashAppPayAuthGetResponse implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String error_message;
    public final String error_title;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String paykit_url;
    public final String referrer_flow_token;
    public final Integer response_code;

    public CashAppPayAuthGetResponse(String str, String str2, Integer num, String str3, String str4, BrowserOrigin browserOrigin) {
        this.referrer_flow_token = str;
        this.paykit_url = str2;
        this.response_code = num;
        this.error_title = str3;
        this.error_message = str4;
        this.origin = browserOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "CashAppPay", "cdf_action", "Auth");
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "paykit_url", str2);
        Countries.putSafe(m, "response_code", num);
        Countries.putSafe(m, "error_title", str3);
        Countries.putSafe(m, "error_message", str4);
        Countries.putSafe(m, "origin", browserOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayAuthGetResponse)) {
            return false;
        }
        CashAppPayAuthGetResponse cashAppPayAuthGetResponse = (CashAppPayAuthGetResponse) obj;
        return Intrinsics.areEqual(this.referrer_flow_token, cashAppPayAuthGetResponse.referrer_flow_token) && Intrinsics.areEqual(this.paykit_url, cashAppPayAuthGetResponse.paykit_url) && Intrinsics.areEqual(this.response_code, cashAppPayAuthGetResponse.response_code) && Intrinsics.areEqual(this.error_title, cashAppPayAuthGetResponse.error_title) && Intrinsics.areEqual(this.error_message, cashAppPayAuthGetResponse.error_message) && this.origin == cashAppPayAuthGetResponse.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppPay Auth GetResponse";
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
        Integer num = this.response_code;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.error_title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error_message;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        return hashCode5 + (browserOrigin != null ? browserOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashAppPayAuthGetResponse(referrer_flow_token=", this.referrer_flow_token, ", paykit_url=", this.paykit_url, ", response_code=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.response_code, ", error_title=", this.error_title, ", error_message=");
        m.append(this.error_message);
        m.append(", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
