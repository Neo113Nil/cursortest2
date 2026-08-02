package com.squareup.cash.cdf.asset;

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
public final class AssetSendRemoveSchedulePayment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final ScheduleFrequency previous_frequency;
    public final Integer previous_start_date_offset_days;

    public AssetSendRemoveSchedulePayment(String str, String str2, ScheduleFrequency scheduleFrequency, Integer num) {
        this.external_id = str;
        this.flow_token = str2;
        this.previous_frequency = scheduleFrequency;
        this.previous_start_date_offset_days = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "previous_frequency", scheduleFrequency);
        Countries.putSafe(m, "previous_start_date_offset_days", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendRemoveSchedulePayment)) {
            return false;
        }
        AssetSendRemoveSchedulePayment assetSendRemoveSchedulePayment = (AssetSendRemoveSchedulePayment) obj;
        return Intrinsics.areEqual(this.external_id, assetSendRemoveSchedulePayment.external_id) && Intrinsics.areEqual(this.flow_token, assetSendRemoveSchedulePayment.flow_token) && this.previous_frequency == assetSendRemoveSchedulePayment.previous_frequency && this.previous_start_date_offset_days.equals(assetSendRemoveSchedulePayment.previous_start_date_offset_days);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send RemoveSchedulePayment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.previous_start_date_offset_days.hashCode() + ((this.previous_frequency.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendRemoveSchedulePayment(external_id=", this.external_id, ", flow_token=", this.flow_token, ", previous_frequency=");
        m.append(this.previous_frequency);
        m.append(", previous_start_date_offset_days=");
        m.append(this.previous_start_date_offset_days);
        m.append(")");
        return m.toString();
    }
}
