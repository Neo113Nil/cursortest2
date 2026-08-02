package com.squareup.cash.cdf.asset;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class AssetSendSelectScheduleStartDate implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer day_of_month;
    public final DayOfWeek day_of_week;
    public final String external_id;
    public final String flow_token;
    public final ScheduleFrequency frequency;
    public final Boolean has_existing_schedule;
    public final LinkedHashMap parameters;
    public final Integer start_date_offset_days;

    public AssetSendSelectScheduleStartDate(String str, String str2, ScheduleFrequency scheduleFrequency, Integer num, DayOfWeek dayOfWeek, Integer num2, Boolean bool) {
        this.external_id = str;
        this.flow_token = str2;
        this.frequency = scheduleFrequency;
        this.start_date_offset_days = num;
        this.day_of_week = dayOfWeek;
        this.day_of_month = num2;
        this.has_existing_schedule = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "frequency", scheduleFrequency);
        Countries.putSafe(m, "start_date_offset_days", num);
        Countries.putSafe(m, "day_of_week", dayOfWeek);
        Countries.putSafe(m, "day_of_month", num2);
        Countries.putSafe(m, "has_existing_schedule", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendSelectScheduleStartDate)) {
            return false;
        }
        AssetSendSelectScheduleStartDate assetSendSelectScheduleStartDate = (AssetSendSelectScheduleStartDate) obj;
        return Intrinsics.areEqual(this.external_id, assetSendSelectScheduleStartDate.external_id) && Intrinsics.areEqual(this.flow_token, assetSendSelectScheduleStartDate.flow_token) && this.frequency == assetSendSelectScheduleStartDate.frequency && this.start_date_offset_days.equals(assetSendSelectScheduleStartDate.start_date_offset_days) && this.day_of_week == assetSendSelectScheduleStartDate.day_of_week && this.day_of_month.equals(assetSendSelectScheduleStartDate.day_of_month) && this.has_existing_schedule.equals(assetSendSelectScheduleStartDate.has_existing_schedule);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send SelectScheduleStartDate";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.has_existing_schedule.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.day_of_week.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.frequency.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.start_date_offset_days)) * 31, 31, this.day_of_month);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendSelectScheduleStartDate(external_id=", this.external_id, ", flow_token=", this.flow_token, ", frequency=");
        m.append(this.frequency);
        m.append(", start_date_offset_days=");
        m.append(this.start_date_offset_days);
        m.append(", day_of_week=");
        m.append(this.day_of_week);
        m.append(", day_of_month=");
        m.append(this.day_of_month);
        m.append(", has_existing_schedule=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.has_existing_schedule, ")");
    }
}
