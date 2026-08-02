package com.squareup.cash.cdf.asset;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class AssetSendCancelSchedulePayment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ScheduleDismissalMethod dismissal_method;
    public final String external_id;
    public final String flow_token;
    public final Boolean had_unsaved_changes;
    public final Boolean has_existing_schedule;
    public final LinkedHashMap parameters;
    public final ScheduleFrequency selected_frequency;
    public final Integer start_date_offset_days;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class ScheduleDismissalMethod {
        public static final /* synthetic */ ScheduleDismissalMethod[] $VALUES;
        public static final ScheduleDismissalMethod CANCEL_BUTTON;
        public static final ScheduleDismissalMethod CLOSE_BUTTON;

        static {
            ScheduleDismissalMethod scheduleDismissalMethod = new ScheduleDismissalMethod("CANCEL_BUTTON", 0);
            CANCEL_BUTTON = scheduleDismissalMethod;
            ScheduleDismissalMethod scheduleDismissalMethod2 = new ScheduleDismissalMethod("CLOSE_BUTTON", 1);
            CLOSE_BUTTON = scheduleDismissalMethod2;
            $VALUES = new ScheduleDismissalMethod[]{scheduleDismissalMethod, scheduleDismissalMethod2};
        }

        public static ScheduleDismissalMethod valueOf(String str) {
            return (ScheduleDismissalMethod) Enum.valueOf(ScheduleDismissalMethod.class, str);
        }

        public static ScheduleDismissalMethod[] values() {
            return (ScheduleDismissalMethod[]) $VALUES.clone();
        }
    }

    public AssetSendCancelSchedulePayment(String str, String str2, ScheduleDismissalMethod scheduleDismissalMethod, Boolean bool, Boolean bool2, ScheduleFrequency scheduleFrequency, Integer num) {
        this.external_id = str;
        this.flow_token = str2;
        this.dismissal_method = scheduleDismissalMethod;
        this.has_existing_schedule = bool;
        this.had_unsaved_changes = bool2;
        this.selected_frequency = scheduleFrequency;
        this.start_date_offset_days = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Asset", "cdf_action", "Send");
        Countries.putSafe(m, "external_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "dismissal_method", scheduleDismissalMethod);
        Countries.putSafe(m, "has_existing_schedule", bool);
        Countries.putSafe(m, "had_unsaved_changes", bool2);
        Countries.putSafe(m, "selected_frequency", scheduleFrequency);
        Countries.putSafe(m, "start_date_offset_days", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetSendCancelSchedulePayment)) {
            return false;
        }
        AssetSendCancelSchedulePayment assetSendCancelSchedulePayment = (AssetSendCancelSchedulePayment) obj;
        return Intrinsics.areEqual(this.external_id, assetSendCancelSchedulePayment.external_id) && Intrinsics.areEqual(this.flow_token, assetSendCancelSchedulePayment.flow_token) && this.dismissal_method == assetSendCancelSchedulePayment.dismissal_method && this.has_existing_schedule.equals(assetSendCancelSchedulePayment.has_existing_schedule) && this.had_unsaved_changes.equals(assetSendCancelSchedulePayment.had_unsaved_changes) && this.selected_frequency == assetSendCancelSchedulePayment.selected_frequency && this.start_date_offset_days.equals(assetSendCancelSchedulePayment.start_date_offset_days);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Send CancelSchedulePayment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.external_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.start_date_offset_days.hashCode() + ((this.selected_frequency.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.had_unsaved_changes, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_existing_schedule, (this.dismissal_method.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AssetSendCancelSchedulePayment(external_id=", this.external_id, ", flow_token=", this.flow_token, ", dismissal_method=");
        m.append(this.dismissal_method);
        m.append(", has_existing_schedule=");
        m.append(this.has_existing_schedule);
        m.append(", had_unsaved_changes=");
        m.append(this.had_unsaved_changes);
        m.append(", selected_frequency=");
        m.append(this.selected_frequency);
        m.append(", start_date_offset_days=");
        return NavAction$$ExternalSyntheticOutline0.m(m, this.start_date_offset_days, ")");
    }
}
