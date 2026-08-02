package com.squareup.cash.cdf.browser;

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
public final class BrowserViewOpenCashAppPayOfferPrompt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String merchant_token;
    public final String offer_flow_token;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;

    public BrowserViewOpenCashAppPayOfferPrompt(String str, String str2, BrowserOrigin browserOrigin) {
        this.merchant_token = str;
        this.offer_flow_token = str2;
        this.origin = browserOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "merchant_token", str);
        Countries.putSafe(m, "offer_flow_token", str2);
        Countries.putSafe(m, "origin", browserOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewOpenCashAppPayOfferPrompt)) {
            return false;
        }
        BrowserViewOpenCashAppPayOfferPrompt browserViewOpenCashAppPayOfferPrompt = (BrowserViewOpenCashAppPayOfferPrompt) obj;
        return Intrinsics.areEqual(this.merchant_token, browserViewOpenCashAppPayOfferPrompt.merchant_token) && Intrinsics.areEqual(this.offer_flow_token, browserViewOpenCashAppPayOfferPrompt.offer_flow_token) && this.origin == browserViewOpenCashAppPayOfferPrompt.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View OpenCashAppPayOfferPrompt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.merchant_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offer_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        return hashCode2 + (browserOrigin != null ? browserOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserViewOpenCashAppPayOfferPrompt(merchant_token=", this.merchant_token, ", offer_flow_token=", this.offer_flow_token, ", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
