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
public final class BrowserNavigateRefreshButtonClicked implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String url;

    public BrowserNavigateRefreshButtonClicked(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.url = str;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.referrer_flow_token = str2;
        this.entity_token = str3;
        this.entry_url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "Navigate");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "entity_token", str3);
        Countries.putSafe(m, "entry_url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserNavigateRefreshButtonClicked)) {
            return false;
        }
        BrowserNavigateRefreshButtonClicked browserNavigateRefreshButtonClicked = (BrowserNavigateRefreshButtonClicked) obj;
        return Intrinsics.areEqual(this.url, browserNavigateRefreshButtonClicked.url) && this.info_context == browserNavigateRefreshButtonClicked.info_context && this.origin == browserNavigateRefreshButtonClicked.origin && Intrinsics.areEqual(this.referrer_flow_token, browserNavigateRefreshButtonClicked.referrer_flow_token) && Intrinsics.areEqual(this.entity_token, browserNavigateRefreshButtonClicked.entity_token) && Intrinsics.areEqual(this.entry_url, browserNavigateRefreshButtonClicked.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Navigate RefreshButtonClicked";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode2 = (hashCode + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode3 = (hashCode2 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str2 = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entity_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entry_url;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserNavigateRefreshButtonClicked(url=");
        sb.append(this.url);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entity_token, ", entry_url=", this.entry_url, ")");
    }
}
