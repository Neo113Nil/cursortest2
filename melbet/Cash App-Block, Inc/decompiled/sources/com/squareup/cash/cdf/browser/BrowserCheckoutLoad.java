package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserCheckoutLoad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String affiliate_url;
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final String merchant_token;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutLoad(InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3, String str4, String str5) {
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.entity_token = str2;
        this.merchant_token = str3;
        this.affiliate_url = str4;
        this.entry_url = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "entity_token", str2);
        Countries.putSafe(m, "merchant_token", str3);
        Countries.putSafe(m, "affiliate_url", str4);
        Countries.putSafe(m, "entry_url", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutLoad)) {
            return false;
        }
        BrowserCheckoutLoad browserCheckoutLoad = (BrowserCheckoutLoad) obj;
        return this.info_context == browserCheckoutLoad.info_context && this.origin == browserCheckoutLoad.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutLoad.referrer_flow_token) && Intrinsics.areEqual(this.entity_token, browserCheckoutLoad.entity_token) && Intrinsics.areEqual(this.merchant_token, browserCheckoutLoad.merchant_token) && Intrinsics.areEqual(this.affiliate_url, browserCheckoutLoad.affiliate_url) && Intrinsics.areEqual(this.entry_url, browserCheckoutLoad.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout Load";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InfoContext infoContext = this.info_context;
        int hashCode = (infoContext == null ? 0 : infoContext.hashCode()) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str = this.referrer_flow_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entity_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchant_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.affiliate_url;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entry_url;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.origin, this.info_context, "BrowserCheckoutLoad(info_context=", ", origin=", ", referrer_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.referrer_flow_token, ", entity_token=", this.entity_token, ", merchant_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.merchant_token, ", affiliate_url=", this.affiliate_url, ", entry_url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.entry_url, ")");
    }
}
