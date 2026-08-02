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
public final class OnDemandMessageInteractDismiss implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.KAFKA, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String campaign_token;

    /* renamed from: format, reason: collision with root package name */
    public final AppMessageFormat f1102format;
    public final Long occurred_at;
    public final LinkedHashMap parameters;
    public final String product_types;
    public final String template_token;
    public final Integer template_version;

    public OnDemandMessageInteractDismiss(String str, Long l, String str2, Integer num, AppMessageFormat appMessageFormat, String str3) {
        Placement placement = Placement.ACTIVITY_TAB;
        this.campaign_token = str;
        this.occurred_at = l;
        this.template_token = str2;
        this.template_version = num;
        this.f1102format = appMessageFormat;
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
        if (!(obj instanceof OnDemandMessageInteractDismiss)) {
            return false;
        }
        OnDemandMessageInteractDismiss onDemandMessageInteractDismiss = (OnDemandMessageInteractDismiss) obj;
        if (!Intrinsics.areEqual(this.campaign_token, onDemandMessageInteractDismiss.campaign_token) || !this.occurred_at.equals(onDemandMessageInteractDismiss.occurred_at)) {
            return false;
        }
        Placement placement = Placement.FAMILY_APPLET;
        return Intrinsics.areEqual(this.template_token, onDemandMessageInteractDismiss.template_token) && Intrinsics.areEqual(this.template_version, onDemandMessageInteractDismiss.template_version) && this.f1102format == onDemandMessageInteractDismiss.f1102format && this.product_types.equals(onDemandMessageInteractDismiss.product_types);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OnDemandMessage Interact Dismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.campaign_token;
        int hashCode = (Placement.ACTIVITY_TAB.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.occurred_at, (str == null ? 0 : str.hashCode()) * 31, 31)) * 961;
        String str2 = this.template_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.template_version;
        return this.product_types.hashCode() + ((this.f1102format.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        Placement placement = Placement.ACTIVITY_TAB;
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.occurred_at, "OnDemandMessageInteractDismiss(campaign_token=", this.campaign_token, ", occurred_at=", ", placement=");
        m.append(placement);
        m.append(", product_type=null, template_token=");
        m.append(this.template_token);
        m.append(", template_version=");
        m.append(this.template_version);
        m.append(", format=");
        m.append(this.f1102format);
        m.append(", product_types=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.product_types, ")");
    }
}
