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
public final class ShiftsTakeBreakComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String break_definition_token;
    public final String break_type;
    public final Integer expected_duration_seconds;
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String person_token;
    public final String timecard_token;

    public ShiftsTakeBreakComplete(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.person_token = str;
        this.merchant_token = str2;
        this.timecard_token = str3;
        this.break_definition_token = str4;
        this.break_type = str5;
        this.expected_duration_seconds = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Shifts", "cdf_action", "TakeBreak");
        Countries.putSafe(m, "person_token", str);
        Countries.putSafe(m, "employee_token", "");
        Countries.putSafe(m, "merchant_token", str2);
        Countries.putSafe(m, "timecard_token", str3);
        Countries.putSafe(m, "break_definition_token", str4);
        Countries.putSafe(m, "break_type", str5);
        Countries.putSafe(m, "expected_duration_seconds", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsTakeBreakComplete)) {
            return false;
        }
        ShiftsTakeBreakComplete shiftsTakeBreakComplete = (ShiftsTakeBreakComplete) obj;
        return this.person_token.equals(shiftsTakeBreakComplete.person_token) && Intrinsics.areEqual(this.merchant_token, shiftsTakeBreakComplete.merchant_token) && Intrinsics.areEqual(this.timecard_token, shiftsTakeBreakComplete.timecard_token) && Intrinsics.areEqual(this.break_definition_token, shiftsTakeBreakComplete.break_definition_token) && this.break_type.equals(shiftsTakeBreakComplete.break_type) && this.expected_duration_seconds.equals(shiftsTakeBreakComplete.expected_duration_seconds);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Shifts TakeBreak Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.person_token.hashCode() * 961;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timecard_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.break_definition_token;
        return this.expected_duration_seconds.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.break_type);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftsTakeBreakComplete(person_token=", this.person_token, ", employee_token=, merchant_token=", this.merchant_token, ", timecard_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.timecard_token, ", break_definition_token=", this.break_definition_token, ", break_type=");
        m.append(this.break_type);
        m.append(", expected_duration_seconds=");
        m.append(this.expected_duration_seconds);
        m.append(")");
        return m.toString();
    }
}
