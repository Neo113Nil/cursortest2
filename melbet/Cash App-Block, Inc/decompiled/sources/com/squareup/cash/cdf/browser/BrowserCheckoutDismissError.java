package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BrowserCheckoutDismissError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String affiliate_url;
    public final String entity_token;
    public final String entry_url;
    public final CheckoutError error_type;
    public final InfoContext info_context;
    public final String merchant_token;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutDismissError(CheckoutError checkoutError, InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3, String str4, String str5) {
        this.error_type = checkoutError;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.entity_token = str2;
        this.merchant_token = str3;
        this.affiliate_url = str4;
        this.entry_url = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "error_type", checkoutError);
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
        if (!(obj instanceof BrowserCheckoutDismissError)) {
            return false;
        }
        BrowserCheckoutDismissError browserCheckoutDismissError = (BrowserCheckoutDismissError) obj;
        return this.error_type == browserCheckoutDismissError.error_type && this.info_context == browserCheckoutDismissError.info_context && this.origin == browserCheckoutDismissError.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutDismissError.referrer_flow_token) && Intrinsics.areEqual(this.entity_token, browserCheckoutDismissError.entity_token) && Intrinsics.areEqual(this.merchant_token, browserCheckoutDismissError.merchant_token) && Intrinsics.areEqual(this.affiliate_url, browserCheckoutDismissError.affiliate_url) && Intrinsics.areEqual(this.entry_url, browserCheckoutDismissError.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout DismissError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.error_type.hashCode() * 31;
        InfoContext infoContext = this.info_context;
        int hashCode2 = (hashCode + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode3 = (hashCode2 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entity_token;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchant_token;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.affiliate_url;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entry_url;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserCheckoutDismissError(error_type=");
        sb.append(this.error_type);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.entity_token, ", merchant_token=", this.merchant_token, ", affiliate_url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.affiliate_url, ", entry_url=", this.entry_url, ")");
    }
}
