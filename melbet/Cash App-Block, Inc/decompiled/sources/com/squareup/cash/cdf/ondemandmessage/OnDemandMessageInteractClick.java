package com.squareup.cash.cdf.ondemandmessage;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.appsflyer.AdRevenueScheme;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.Placement;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OnDemandMessageInteractClick implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String campaign_token;
    public final String click_action;

    /* renamed from: format, reason: collision with root package name */
    public final AppMessageFormat f1101format;
    public final Long occurred_at;
    public final LinkedHashMap parameters;
    public final Placement placement;
    public final String product_types;
    public final String template_token;
    public final Integer template_version;

    public OnDemandMessageInteractClick(String str, Long l, String str2, Placement placement, String str3, Integer num, AppMessageFormat appMessageFormat, String str4, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        this.campaign_token = str;
        this.occurred_at = l;
        this.click_action = str2;
        this.placement = placement;
        this.template_token = str3;
        this.template_version = num;
        this.f1101format = appMessageFormat;
        this.product_types = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "OnDemandMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "campaign_token", str);
        Countries.putSafe(m, "occurred_at", l);
        Countries.putSafe(m, "click_action", str2);
        Countries.putSafe(m, AdRevenueScheme.PLACEMENT, placement);
        Countries.putSafe(m, "template_token", str3);
        Countries.putSafe(m, "template_version", num);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "product_types", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDemandMessageInteractClick)) {
            return false;
        }
        OnDemandMessageInteractClick onDemandMessageInteractClick = (OnDemandMessageInteractClick) obj;
        return Intrinsics.areEqual(this.campaign_token, onDemandMessageInteractClick.campaign_token) && this.occurred_at.equals(onDemandMessageInteractClick.occurred_at) && Intrinsics.areEqual(this.click_action, onDemandMessageInteractClick.click_action) && this.placement == onDemandMessageInteractClick.placement && Intrinsics.areEqual(this.template_token, onDemandMessageInteractClick.template_token) && Intrinsics.areEqual(this.template_version, onDemandMessageInteractClick.template_version) && this.f1101format == onDemandMessageInteractClick.f1101format && Intrinsics.areEqual(this.product_types, onDemandMessageInteractClick.product_types);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OnDemandMessage Interact Click";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.campaign_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.occurred_at, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.click_action;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement == null ? 0 : placement.hashCode())) * 961;
        String str3 = this.template_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.template_version;
        int hashCode4 = (this.f1101format.hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str4 = this.product_types;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.occurred_at, "OnDemandMessageInteractClick(campaign_token=", this.campaign_token, ", occurred_at=", ", click_action=");
        m.append(this.click_action);
        m.append(", placement=");
        m.append(this.placement);
        m.append(", product_type=null, template_token=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.template_token, ", template_version=", this.template_version, ", format=");
        m.append(this.f1101format);
        m.append(", product_types=");
        m.append(this.product_types);
        m.append(")");
        return m.toString();
    }
}
