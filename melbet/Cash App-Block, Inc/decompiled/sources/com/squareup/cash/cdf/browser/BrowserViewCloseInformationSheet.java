package com.squareup.cash.cdf.browser;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserViewCloseInformationSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserViewCloseInformationSheet(InfoContext infoContext, String str, BrowserOrigin browserOrigin) {
        this.info_context = infoContext;
        this.referrer_flow_token = str;
        this.origin = browserOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "origin", browserOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewCloseInformationSheet)) {
            return false;
        }
        BrowserViewCloseInformationSheet browserViewCloseInformationSheet = (BrowserViewCloseInformationSheet) obj;
        return this.info_context == browserViewCloseInformationSheet.info_context && Intrinsics.areEqual(this.referrer_flow_token, browserViewCloseInformationSheet.referrer_flow_token) && this.origin == browserViewCloseInformationSheet.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View CloseInformationSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.info_context.hashCode() * 31;
        String str = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 29791;
        BrowserOrigin browserOrigin = this.origin;
        return (hashCode2 + (browserOrigin != null ? browserOrigin.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "BrowserViewCloseInformationSheet(info_context=" + this.info_context + ", referrer_flow_token=" + this.referrer_flow_token + ", suggestion_id=null, boost_flow_token=null, origin=" + this.origin + ", entity_token=null)";
    }
}
