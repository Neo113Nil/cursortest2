package com.squareup.cash.cdf.paychecks;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaychecksShowMonthlyAggregatePaycheckReceipt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_current_month;
    public final Integer month_in_year;
    public final LinkedHashMap parameters;
    public final Integer year;

    public PaychecksShowMonthlyAggregatePaycheckReceipt(Integer num, Integer num2, Boolean bool) {
        this.month_in_year = num;
        this.year = num2;
        this.is_current_month = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Paychecks", "cdf_action", "Show");
        Countries.putSafe(m, "month_in_year", num);
        Countries.putSafe(m, "year", num2);
        Countries.putSafe(m, "is_current_month", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksShowMonthlyAggregatePaycheckReceipt)) {
            return false;
        }
        PaychecksShowMonthlyAggregatePaycheckReceipt paychecksShowMonthlyAggregatePaycheckReceipt = (PaychecksShowMonthlyAggregatePaycheckReceipt) obj;
        return this.month_in_year.equals(paychecksShowMonthlyAggregatePaycheckReceipt.month_in_year) && this.year.equals(paychecksShowMonthlyAggregatePaycheckReceipt.year) && this.is_current_month.equals(paychecksShowMonthlyAggregatePaycheckReceipt.is_current_month);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks Show MonthlyAggregatePaycheckReceipt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_current_month.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.month_in_year.hashCode() * 31, 31, this.year);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaychecksShowMonthlyAggregatePaycheckReceipt(month_in_year=");
        sb.append(this.month_in_year);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", is_current_month=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_current_month, ")");
    }
}
