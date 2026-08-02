package com.squareup.cash.cdf.detailspage;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class DetailsPageInteractScroll implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String details_page_token;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String template_token;
    public final String version;

    public DetailsPageInteractScroll(int i, String str, String str2, String str3, String str4, String str5) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str5 = (i & 16) != 0 ? null : str5;
        this.template_token = str;
        this.version = str2;
        this.details_page_token = str3;
        this.flow_token = str4;
        this.referrer_flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "DetailsPage", "cdf_action", "Interact");
        Countries.putSafe(m, "template_token", str);
        Countries.putSafe(m, "version", str2);
        Countries.putSafe(m, "details_page_token", str3);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "referrer_flow_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsPageInteractScroll)) {
            return false;
        }
        DetailsPageInteractScroll detailsPageInteractScroll = (DetailsPageInteractScroll) obj;
        return Intrinsics.areEqual(this.template_token, detailsPageInteractScroll.template_token) && Intrinsics.areEqual(this.version, detailsPageInteractScroll.version) && Intrinsics.areEqual(this.details_page_token, detailsPageInteractScroll.details_page_token) && Intrinsics.areEqual(this.flow_token, detailsPageInteractScroll.flow_token) && Intrinsics.areEqual(this.referrer_flow_token, detailsPageInteractScroll.referrer_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DetailsPage Interact Scroll";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.template_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.details_page_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.referrer_flow_token;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailsPageInteractScroll(template_token=", this.template_token, ", version=", this.version, ", details_page_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.details_page_token, ", flow_token=", this.flow_token, ", referrer_flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.referrer_flow_token, ")");
    }
}
