package com.squareup.cash.cdf.earningstracker;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsTrackerFetchError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String error_code;
    public final String error_message;
    public final Boolean fetch_cancelled;
    public final Integer fetch_duration;
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;

    public EarningsTrackerFetchError(Timeframe timeframe, Integer num, Integer num2, Integer num3, String str, String str2, Boolean bool) {
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        this.fetch_duration = num3;
        this.error_message = str;
        this.error_code = str2;
        this.fetch_cancelled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "EarningsTracker", "cdf_action", "Fetch");
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        Countries.putSafe(m, "fetch_duration", num3);
        Countries.putSafe(m, "error_message", str);
        Countries.putSafe(m, "error_code", str2);
        Countries.putSafe(m, "fetch_cancelled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerFetchError)) {
            return false;
        }
        EarningsTrackerFetchError earningsTrackerFetchError = (EarningsTrackerFetchError) obj;
        return this.timeframe == earningsTrackerFetchError.timeframe && Intrinsics.areEqual(this.timeframe_month, earningsTrackerFetchError.timeframe_month) && Intrinsics.areEqual(this.timeframe_year, earningsTrackerFetchError.timeframe_year) && this.fetch_duration.equals(earningsTrackerFetchError.fetch_duration) && Intrinsics.areEqual(this.error_message, earningsTrackerFetchError.error_message) && Intrinsics.areEqual(this.error_code, earningsTrackerFetchError.error_code) && this.fetch_cancelled.equals(earningsTrackerFetchError.fetch_cancelled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Fetch Error";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Timeframe timeframe = this.timeframe;
        int hashCode = (timeframe == null ? 0 : timeframe.hashCode()) * 31;
        Integer num = this.timeframe_month;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeframe_year;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.fetch_duration);
        String str = this.error_message;
        int hashCode3 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_code;
        return this.fetch_cancelled.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsTrackerFetchError(timeframe=");
        sb.append(this.timeframe);
        sb.append(", timeframe_month=");
        sb.append(this.timeframe_month);
        sb.append(", timeframe_year=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.timeframe_year, ", fetch_duration=", this.fetch_duration, ", error_message=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.error_message, ", error_code=", this.error_code, ", fetch_cancelled=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.fetch_cancelled, ")");
    }
}
