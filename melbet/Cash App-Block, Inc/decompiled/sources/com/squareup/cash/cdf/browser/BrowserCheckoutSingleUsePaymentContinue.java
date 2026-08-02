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
public final class BrowserCheckoutSingleUsePaymentContinue implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final String entry_url;
    public final String flow_token;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserCheckoutSingleUsePaymentContinue(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str2;
        this.entry_url = str3;
        this.entity_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "Checkout");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "entry_url", str3);
        Countries.putSafe(m, "entity_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserCheckoutSingleUsePaymentContinue)) {
            return false;
        }
        BrowserCheckoutSingleUsePaymentContinue browserCheckoutSingleUsePaymentContinue = (BrowserCheckoutSingleUsePaymentContinue) obj;
        return this.flow_token.equals(browserCheckoutSingleUsePaymentContinue.flow_token) && this.info_context == browserCheckoutSingleUsePaymentContinue.info_context && this.origin == browserCheckoutSingleUsePaymentContinue.origin && Intrinsics.areEqual(this.referrer_flow_token, browserCheckoutSingleUsePaymentContinue.referrer_flow_token) && Intrinsics.areEqual(this.entry_url, browserCheckoutSingleUsePaymentContinue.entry_url) && Intrinsics.areEqual(this.entity_token, browserCheckoutSingleUsePaymentContinue.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Checkout SingleUsePaymentContinue";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.flow_token.hashCode() * 31;
        InfoContext infoContext = this.info_context;
        int hashCode2 = (hashCode + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode3 = (hashCode2 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entry_url;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entity_token;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserCheckoutSingleUsePaymentContinue(flow_token=");
        sb.append(this.flow_token);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", entry_url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entry_url, ", entity_token=", this.entity_token, ")");
    }
}
