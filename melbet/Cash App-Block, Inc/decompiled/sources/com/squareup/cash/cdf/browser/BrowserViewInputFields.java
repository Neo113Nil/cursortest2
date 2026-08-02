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
public final class BrowserViewInputFields implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final String entry_url;
    public final String field_types;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserViewInputFields(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3, String str4) {
        this.field_types = str;
        this.referrer_flow_token = str2;
        this.entry_url = str3;
        this.origin = browserOrigin;
        this.info_context = infoContext;
        this.entity_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "field_types", str);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "entry_url", str3);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "entity_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewInputFields)) {
            return false;
        }
        BrowserViewInputFields browserViewInputFields = (BrowserViewInputFields) obj;
        return this.field_types.equals(browserViewInputFields.field_types) && Intrinsics.areEqual(this.referrer_flow_token, browserViewInputFields.referrer_flow_token) && Intrinsics.areEqual(this.entry_url, browserViewInputFields.entry_url) && this.origin == browserViewInputFields.origin && this.info_context == browserViewInputFields.info_context && Intrinsics.areEqual(this.entity_token, browserViewInputFields.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View InputFields";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.field_types.hashCode() * 31;
        String str = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.entry_url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode4 = (hashCode3 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode5 = (hashCode4 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        String str3 = this.entity_token;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserViewInputFields(field_types=", this.field_types, ", referrer_flow_token=", this.referrer_flow_token, ", suggestion_id=null, entry_url=");
        m.append(this.entry_url);
        m.append(", origin=");
        m.append(this.origin);
        m.append(", info_context=");
        m.append(this.info_context);
        m.append(", entity_token=");
        m.append(this.entity_token);
        m.append(")");
        return m.toString();
    }
}
