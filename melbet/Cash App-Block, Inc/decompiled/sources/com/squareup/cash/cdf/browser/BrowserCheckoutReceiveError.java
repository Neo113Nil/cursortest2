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
public final class BrowserCheckoutReceiveError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String affiliate_url;
    public final String entity_token;
    public final String entry_url;
    public final String error_code;
    public final String error_description;
    public final CheckoutError error_type;
    public final InfoContext info_context;
    public final String merchant_token;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutReceiveError(CheckoutError checkoutError, InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        checkoutError = (i & 1) != 0 ? null : checkoutError;
        str6 = (i & 256) != 0 ? null : str6;
        str7 = (i & 512) != 0 ? null : str7;
        this.error_type = checkoutError;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.entity_token = str2;
        this.merchant_token = str3;
        this.affiliate_url = str4;
        this.entry_url = str5;
        this.error_description = str6;
        this.error_code = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "error_type", checkoutError);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "entity_token", str2);
        Countries.putSafe(m, "merchant_token", str3);
        Countries.putSafe(m, "affiliate_url", str4);
        Countries.putSafe(m, "entry_url", str5);
        Countries.putSafe(m, "error_description", str6);
        Countries.putSafe(m, "error_code", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutReceiveError)) {
            return false;
        }
        BrowserCheckoutReceiveError browserCheckoutReceiveError = (BrowserCheckoutReceiveError) obj;
        return this.error_type == browserCheckoutReceiveError.error_type && this.info_context == browserCheckoutReceiveError.info_context && this.origin == browserCheckoutReceiveError.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutReceiveError.referrer_flow_token) && Intrinsics.areEqual(this.entity_token, browserCheckoutReceiveError.entity_token) && Intrinsics.areEqual(this.merchant_token, browserCheckoutReceiveError.merchant_token) && Intrinsics.areEqual(this.affiliate_url, browserCheckoutReceiveError.affiliate_url) && Intrinsics.areEqual(this.entry_url, browserCheckoutReceiveError.entry_url) && Intrinsics.areEqual(this.error_description, browserCheckoutReceiveError.error_description) && Intrinsics.areEqual(this.error_code, browserCheckoutReceiveError.error_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout ReceiveError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        CheckoutError checkoutError = this.error_type;
        int hashCode = (checkoutError == null ? 0 : checkoutError.hashCode()) * 31;
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
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.error_description;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.error_code;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserCheckoutReceiveError(error_type=");
        sb.append(this.error_type);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.entity_token, ", merchant_token=", this.merchant_token, ", affiliate_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.affiliate_url, ", entry_url=", this.entry_url, ", error_description=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.error_description, ", error_code=", this.error_code, ")");
    }
}
