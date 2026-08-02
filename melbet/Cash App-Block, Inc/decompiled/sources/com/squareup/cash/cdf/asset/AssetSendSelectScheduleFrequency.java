package com.squareup.cash.cdf.asset;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AssetSendSelectScheduleFrequency implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean has_existing_schedule;
    public final LinkedHashMap parameters;
    public final ScheduleFrequency previous_frequency;
    public final ScheduleFrequency selected_frequency;

    public AssetSendSelectScheduleFrequency(String str, String str2, ScheduleFrequency scheduleFrequency, ScheduleFrequency scheduleFrequency2, Boolean bool) {
        this.external_id = str;
        this.flow_token = str2;
        this.previous_frequency = scheduleFrequency;
        this.selected_frequency = scheduleFrequency2;
        this.has_existing_schedule = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "previous_frequency", scheduleFrequency);
        Countries.putSafe(m, "selected_frequency", scheduleFrequency2);
        Countries.putSafe(m, "has_existing_schedule", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendSelectScheduleFrequency)) {
            return false;
        }
        AssetSendSelectScheduleFrequency assetSendSelectScheduleFrequency = (AssetSendSelectScheduleFrequency) obj;
        return Intrinsics.areEqual(this.external_id, assetSendSelectScheduleFrequency.external_id) && Intrinsics.areEqual(this.flow_token, assetSendSelectScheduleFrequency.flow_token) && this.previous_frequency == assetSendSelectScheduleFrequency.previous_frequency && this.selected_frequency == assetSendSelectScheduleFrequency.selected_frequency && this.has_existing_schedule.equals(assetSendSelectScheduleFrequency.has_existing_schedule);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send SelectScheduleFrequency";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.has_existing_schedule.hashCode() + ((this.selected_frequency.hashCode() + ((this.previous_frequency.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendSelectScheduleFrequency(external_id=", this.external_id, ", flow_token=", this.flow_token, ", previous_frequency=");
        m.append(this.previous_frequency);
        m.append(", selected_frequency=");
        m.append(this.selected_frequency);
        m.append(", has_existing_schedule=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.has_existing_schedule, ")");
    }
}
