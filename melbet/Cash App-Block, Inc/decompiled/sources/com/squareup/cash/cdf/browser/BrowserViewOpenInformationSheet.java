package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BrowserViewOpenInformationSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String boost_flow_token;
    public final String entity_token;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String suggestion_id;

    public BrowserViewOpenInformationSheet(InfoContext infoContext, String str, String str2, BrowserOrigin browserOrigin, String str3, int i) {
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        this.info_context = infoContext;
        this.referrer_flow_token = str;
        this.suggestion_id = null;
        this.boost_flow_token = str2;
        this.origin = browserOrigin;
        this.entity_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "boost_flow_token", str2);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "entity_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewOpenInformationSheet)) {
            return false;
        }
        BrowserViewOpenInformationSheet browserViewOpenInformationSheet = (BrowserViewOpenInformationSheet) obj;
        return this.info_context == browserViewOpenInformationSheet.info_context && Intrinsics.areEqual(this.referrer_flow_token, browserViewOpenInformationSheet.referrer_flow_token) && Intrinsics.areEqual(this.suggestion_id, browserViewOpenInformationSheet.suggestion_id) && Intrinsics.areEqual(this.boost_flow_token, browserViewOpenInformationSheet.boost_flow_token) && this.origin == browserViewOpenInformationSheet.origin && Intrinsics.areEqual(this.entity_token, browserViewOpenInformationSheet.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View OpenInformationSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InfoContext infoContext = this.info_context;
        int hashCode = (infoContext == null ? 0 : infoContext.hashCode()) * 31;
        String str = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suggestion_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.boost_flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode5 = (hashCode4 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str4 = this.entity_token;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowserViewOpenInformationSheet(info_context=");
        sb.append(this.info_context);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", suggestion_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.suggestion_id, ", boost_flow_token=", this.boost_flow_token, ", origin=");
        sb.append(this.origin);
        sb.append(", entity_token=");
        sb.append(this.entity_token);
        sb.append(")");
        return sb.toString();
    }
}
