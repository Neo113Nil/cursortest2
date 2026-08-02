package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserCheckoutViewAutofillPill implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final AutofillPillType pill_type;
    public final String referrer_flow_token;

    public BrowserCheckoutViewAutofillPill(InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3, AutofillPillType autofillPillType) {
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.business_token = str2;
        this.business_name = str3;
        this.pill_type = autofillPillType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "business_token", str2);
        Countries.putSafe(m, "business_name", str3);
        Countries.putSafe(m, "pill_type", autofillPillType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutViewAutofillPill)) {
            return false;
        }
        BrowserCheckoutViewAutofillPill browserCheckoutViewAutofillPill = (BrowserCheckoutViewAutofillPill) obj;
        return this.info_context == browserCheckoutViewAutofillPill.info_context && this.origin == browserCheckoutViewAutofillPill.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutViewAutofillPill.referrer_flow_token) && Intrinsics.areEqual(this.business_token, browserCheckoutViewAutofillPill.business_token) && Intrinsics.areEqual(this.business_name, browserCheckoutViewAutofillPill.business_name) && this.pill_type == browserCheckoutViewAutofillPill.pill_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout ViewAutofillPill";
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
        return this.pill_type.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.origin, this.info_context, "BrowserCheckoutViewAutofillPill(info_context=", ", origin=", ", referrer_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.referrer_flow_token, ", business_token=", this.business_token, ", business_name=");
        m.append(this.business_name);
        m.append(", pill_type=");
        m.append(this.pill_type);
        m.append(")");
        return m.toString();
    }
}
