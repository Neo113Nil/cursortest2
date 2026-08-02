package com.squareup.cash.cdf.shifts;

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
public final class ShiftsClockInComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_scheduled;
    public final String job_token;
    public final String location_token;
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String person_token;
    public final String shift_token;

    public ShiftsClockInComplete(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.person_token = str;
        this.merchant_token = str2;
        this.job_token = str3;
        this.location_token = str4;
        this.shift_token = str5;
        this.is_scheduled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Shifts", "cdf_action", "ClockIn");
        Countries.putSafe(m, "person_token", str);
        Countries.putSafe(m, "employee_token", "");
        Countries.putSafe(m, "merchant_token", str2);
        Countries.putSafe(m, "job_token", str3);
        Countries.putSafe(m, "location_token", str4);
        Countries.putSafe(m, "shift_token", str5);
        Countries.putSafe(m, "is_scheduled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsClockInComplete)) {
            return false;
        }
        ShiftsClockInComplete shiftsClockInComplete = (ShiftsClockInComplete) obj;
        return this.person_token.equals(shiftsClockInComplete.person_token) && Intrinsics.areEqual(this.merchant_token, shiftsClockInComplete.merchant_token) && Intrinsics.areEqual(this.job_token, shiftsClockInComplete.job_token) && Intrinsics.areEqual(this.location_token, shiftsClockInComplete.location_token) && this.shift_token.equals(shiftsClockInComplete.shift_token) && this.is_scheduled.equals(shiftsClockInComplete.is_scheduled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Shifts ClockIn Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.person_token.hashCode() * 961;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.job_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location_token;
        return this.is_scheduled.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.shift_token);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftsClockInComplete(person_token=", this.person_token, ", employee_token=, merchant_token=", this.merchant_token, ", job_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.job_token, ", location_token=", this.location_token, ", shift_token=");
        m.append(this.shift_token);
        m.append(", is_scheduled=");
        m.append(this.is_scheduled);
        m.append(")");
        return m.toString();
    }
}
