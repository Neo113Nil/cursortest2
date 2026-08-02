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
public final class BrowserViewCloseScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String affiliate_url;
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserViewCloseScreen(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.origin = browserOrigin;
        this.referrer_flow_token = str;
        this.affiliate_url = str2;
        this.info_context = infoContext;
        this.entity_token = str3;
        this.entry_url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "affiliate_url", str2);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "entity_token", str3);
        Countries.putSafe(m, "entry_url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewCloseScreen)) {
            return false;
        }
        BrowserViewCloseScreen browserViewCloseScreen = (BrowserViewCloseScreen) obj;
        return this.origin == browserViewCloseScreen.origin && Intrinsics.areEqual(this.referrer_flow_token, browserViewCloseScreen.referrer_flow_token) && Intrinsics.areEqual(this.affiliate_url, browserViewCloseScreen.affiliate_url) && this.info_context == browserViewCloseScreen.info_context && Intrinsics.areEqual(this.entity_token, browserViewCloseScreen.entity_token) && Intrinsics.areEqual(this.entry_url, browserViewCloseScreen.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View CloseScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        BrowserOrigin browserOrigin = this.origin;
        int hashCode = (browserOrigin == null ? 0 : browserOrigin.hashCode()) * 31;
        String str = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 29791;
        String str2 = this.affiliate_url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode4 = (hashCode3 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        String str3 = this.entity_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entry_url;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserViewCloseScreen(origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", suggestion_id=null, boost_flow_token=null, affiliate_url=");
        sb.append(this.affiliate_url);
        sb.append(", info_context=");
        sb.append(this.info_context);
        sb.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entity_token, ", entry_url=", this.entry_url, ")");
    }
}
