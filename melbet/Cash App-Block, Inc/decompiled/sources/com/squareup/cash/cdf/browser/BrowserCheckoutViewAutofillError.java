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
public final class BrowserCheckoutViewAutofillError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String error_state;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutViewAutofillError(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.business_token = str2;
        this.business_name = str3;
        this.error_state = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "business_token", str2);
        Countries.putSafe(m, "business_name", str3);
        Countries.putSafe(m, "error_state", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutViewAutofillError)) {
            return false;
        }
        BrowserCheckoutViewAutofillError browserCheckoutViewAutofillError = (BrowserCheckoutViewAutofillError) obj;
        return this.info_context == browserCheckoutViewAutofillError.info_context && this.origin == browserCheckoutViewAutofillError.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutViewAutofillError.referrer_flow_token) && Intrinsics.areEqual(this.business_token, browserCheckoutViewAutofillError.business_token) && Intrinsics.areEqual(this.business_name, browserCheckoutViewAutofillError.business_name) && Intrinsics.areEqual(this.error_state, browserCheckoutViewAutofillError.error_state);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout ViewAutofillError";
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
        String str2 = this.business_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.business_name;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error_state;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.origin, this.info_context, "BrowserCheckoutViewAutofillError(info_context=", ", origin=", ", referrer_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.referrer_flow_token, ", business_token=", this.business_token, ", business_name=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.business_name, ", error_state=", this.error_state, ")");
    }
}
