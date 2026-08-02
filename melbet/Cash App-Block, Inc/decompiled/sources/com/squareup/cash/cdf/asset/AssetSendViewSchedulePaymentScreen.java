package com.squareup.cash.cdf.asset;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class AssetSendViewSchedulePaymentScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final String flow_token;
    public final Boolean has_existing_schedule;
    public final ScheduleFrequency initial_frequency;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final InstrumentType selected_instrument_type;
    public final Integer start_date_offset_days;

    public AssetSendViewSchedulePaymentScreen(String str, String str2, Origin origin, Boolean bool, ScheduleFrequency scheduleFrequency, Integer num, InstrumentType instrumentType) {
        this.external_id = str;
        this.flow_token = str2;
        this.origin = origin;
        this.has_existing_schedule = bool;
        this.initial_frequency = scheduleFrequency;
        this.start_date_offset_days = num;
        this.selected_instrument_type = instrumentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "has_existing_schedule", bool);
        Countries.putSafe(m, "initial_frequency", scheduleFrequency);
        Countries.putSafe(m, "start_date_offset_days", num);
        Countries.putSafe(m, "selected_instrument_type", instrumentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendViewSchedulePaymentScreen)) {
            return false;
        }
        AssetSendViewSchedulePaymentScreen assetSendViewSchedulePaymentScreen = (AssetSendViewSchedulePaymentScreen) obj;
        return Intrinsics.areEqual(this.external_id, assetSendViewSchedulePaymentScreen.external_id) && Intrinsics.areEqual(this.flow_token, assetSendViewSchedulePaymentScreen.flow_token) && this.origin == assetSendViewSchedulePaymentScreen.origin && this.has_existing_schedule.equals(assetSendViewSchedulePaymentScreen.has_existing_schedule) && this.initial_frequency == assetSendViewSchedulePaymentScreen.initial_frequency && this.start_date_offset_days.equals(assetSendViewSchedulePaymentScreen.start_date_offset_days) && this.selected_instrument_type == assetSendViewSchedulePaymentScreen.selected_instrument_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send ViewSchedulePaymentScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Origin origin = this.origin;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((this.initial_frequency.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_existing_schedule, (hashCode2 + (origin == null ? 0 : origin.hashCode())) * 31, 31)) * 31, 31, this.start_date_offset_days);
        InstrumentType instrumentType = this.selected_instrument_type;
        return m + (instrumentType != null ? instrumentType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendViewSchedulePaymentScreen(external_id=", this.external_id, ", flow_token=", this.flow_token, ", origin=");
        m.append(this.origin);
        m.append(", has_existing_schedule=");
        m.append(this.has_existing_schedule);
        m.append(", initial_frequency=");
        m.append(this.initial_frequency);
        m.append(", start_date_offset_days=");
        m.append(this.start_date_offset_days);
        m.append(", selected_instrument_type=");
        m.append(this.selected_instrument_type);
        m.append(")");
        return m.toString();
    }
}
