package com.squareup.cash.cdf.ondemandmessage;

import com.appsflyer.AdRevenueScheme;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.Placement;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OnDemandMessageInteractView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String campaign_token;

    /* renamed from: format, reason: collision with root package name */
    public final AppMessageFormat f1103format;
    public final Long occurred_at;
    public final LinkedHashMap parameters;
    public final Placement placement;
    public final String product_types;
    public final String template_token;
    public final Integer template_version;

    public OnDemandMessageInteractView(String str, Long l, Placement placement, String str2, Integer num, AppMessageFormat appMessageFormat, String str3) {
        this.campaign_token = str;
        this.occurred_at = l;
        this.placement = placement;
        this.template_token = str2;
        this.template_version = num;
        this.f1103format = appMessageFormat;
        this.product_types = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "OnDemandMessage", "cdf_action", "Interact");
        Countries.putSafe(m, "campaign_token", str);
        Countries.putSafe(m, "occurred_at", l);
        Countries.putSafe(m, AdRevenueScheme.PLACEMENT, placement);
        Countries.putSafe(m, "template_token", str2);
        Countries.putSafe(m, "template_version", num);
        Countries.putSafe(m, "format", appMessageFormat);
        Countries.putSafe(m, "product_types", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDemandMessageInteractView)) {
            return false;
        }
        OnDemandMessageInteractView onDemandMessageInteractView = (OnDemandMessageInteractView) obj;
        return Intrinsics.areEqual(this.campaign_token, onDemandMessageInteractView.campaign_token) && this.occurred_at.equals(onDemandMessageInteractView.occurred_at) && this.placement == onDemandMessageInteractView.placement && Intrinsics.areEqual(this.template_token, onDemandMessageInteractView.template_token) && Intrinsics.areEqual(this.template_version, onDemandMessageInteractView.template_version) && this.f1103format == onDemandMessageInteractView.f1103format && Intrinsics.areEqual(this.product_types, onDemandMessageInteractView.product_types);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OnDemandMessage Interact View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.campaign_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.occurred_at, (str == null ? 0 : str.hashCode()) * 31, 31);
        Placement placement = this.placement;
        int hashCode = (m + (placement == null ? 0 : placement.hashCode())) * 961;
        String str2 = this.template_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.template_version;
        int hashCode3 = (this.f1103format.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str3 = this.product_types;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.occurred_at, "OnDemandMessageInteractView(campaign_token=", this.campaign_token, ", occurred_at=", ", placement=");
        m.append(this.placement);
        m.append(", product_type=null, template_token=");
        m.append(this.template_token);
        m.append(", template_version=");
        m.append(this.template_version);
        m.append(", format=");
        m.append(this.f1103format);
        m.append(", product_types=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.product_types, ")");
    }
}
