package com.squareup.cash.cdf.browser;

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
public final class BrowserViewDismissRedemptionSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final SheetDismissMechanism dismiss_mechanism;
    public final String entity_token;
    public final String entry_url;
    public final InfoContext info_context;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public BrowserViewDismissRedemptionSheet(InfoContext infoContext, BrowserOrigin browserOrigin, SheetDismissMechanism sheetDismissMechanism, String str, String str2, String str3) {
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.dismiss_mechanism = sheetDismissMechanism;
        this.referrer_flow_token = str;
        this.entity_token = str2;
        this.entry_url = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "dismiss_mechanism", sheetDismissMechanism);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "entity_token", str2);
        Countries.putSafe(m, "entry_url", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewDismissRedemptionSheet)) {
            return false;
        }
        BrowserViewDismissRedemptionSheet browserViewDismissRedemptionSheet = (BrowserViewDismissRedemptionSheet) obj;
        return this.info_context == browserViewDismissRedemptionSheet.info_context && this.origin == browserViewDismissRedemptionSheet.origin && this.dismiss_mechanism == browserViewDismissRedemptionSheet.dismiss_mechanism && Intrinsics.areEqual(this.referrer_flow_token, browserViewDismissRedemptionSheet.referrer_flow_token) && Intrinsics.areEqual(this.entity_token, browserViewDismissRedemptionSheet.entity_token) && Intrinsics.areEqual(this.entry_url, browserViewDismissRedemptionSheet.entry_url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View DismissRedemptionSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InfoContext infoContext = this.info_context;
        int hashCode = (infoContext == null ? 0 : infoContext.hashCode()) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (this.dismiss_mechanism.hashCode() + ((hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31)) * 31;
        String str = this.referrer_flow_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entity_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entry_url;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.origin, this.info_context, "BrowserViewDismissRedemptionSheet(info_context=", ", origin=", ", dismiss_mechanism=");
        m.append(this.dismiss_mechanism);
        m.append(", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", entity_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.entity_token, ", entry_url=", this.entry_url, ")");
    }
}
