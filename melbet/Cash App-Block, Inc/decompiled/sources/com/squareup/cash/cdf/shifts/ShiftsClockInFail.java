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
public final class ShiftsClockInFail implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String error_message;
    public final String job_token;
    public final String location_token;
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String person_token;

    public ShiftsClockInFail(String str, String str2, String str3, String str4, String str5) {
        this.person_token = str;
        this.merchant_token = str2;
        this.job_token = str3;
        this.location_token = str4;
        this.error_message = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Shifts", "cdf_action", "ClockIn");
        Countries.putSafe(m, "person_token", str);
        Countries.putSafe(m, "employee_token", "");
        Countries.putSafe(m, "merchant_token", str2);
        Countries.putSafe(m, "job_token", str3);
        Countries.putSafe(m, "location_token", str4);
        Countries.putSafe(m, "error_message", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsClockInFail)) {
            return false;
        }
        ShiftsClockInFail shiftsClockInFail = (ShiftsClockInFail) obj;
        return this.person_token.equals(shiftsClockInFail.person_token) && Intrinsics.areEqual(this.merchant_token, shiftsClockInFail.merchant_token) && Intrinsics.areEqual(this.job_token, shiftsClockInFail.job_token) && Intrinsics.areEqual(this.location_token, shiftsClockInFail.location_token) && this.error_message.equals(shiftsClockInFail.error_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Shifts ClockIn Fail";
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
        return this.error_message.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftsClockInFail(person_token=", this.person_token, ", employee_token=, merchant_token=", this.merchant_token, ", job_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.job_token, ", location_token=", this.location_token, ", error_message=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.error_message, ")");
    }
}
