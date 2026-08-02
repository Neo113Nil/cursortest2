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
public final class BrowserViewOpenRestrictedItemWarning implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final String item_name;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserViewOpenRestrictedItemWarning(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.item_name = str;
        this.referrer_flow_token = str2;
        this.origin = browserOrigin;
        this.info_context = infoContext;
        this.entity_token = str3;
        this.entry_url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "item_name", str);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "entity_token", str3);
        Countries.putSafe(m, "entry_url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewOpenRestrictedItemWarning)) {
            return false;
        }
        BrowserViewOpenRestrictedItemWarning browserViewOpenRestrictedItemWarning = (BrowserViewOpenRestrictedItemWarning) obj;
        return Intrinsics.areEqual(this.item_name, browserViewOpenRestrictedItemWarning.item_name) && Intrinsics.areEqual(this.referrer_flow_token, browserViewOpenRestrictedItemWarning.referrer_flow_token) && this.origin == browserViewOpenRestrictedItemWarning.origin && this.info_context == browserViewOpenRestrictedItemWarning.info_context && Intrinsics.areEqual(this.entity_token, browserViewOpenRestrictedItemWarning.entity_token) && Intrinsics.areEqual(this.entry_url, browserViewOpenRestrictedItemWarning.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View OpenRestrictedItemWarning";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.item_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode3 = (hashCode2 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode4 = (hashCode3 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        String str3 = this.entity_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entry_url;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserViewOpenRestrictedItemWarning(item_name=", this.item_name, ", referrer_flow_token=", this.referrer_flow_token, ", boost_flow_token=null, origin=");
        m.append(this.origin);
        m.append(", info_context=");
        m.append(this.info_context);
        m.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.entity_token, ", entry_url=", this.entry_url, ")");
    }
}
