package com.squareup.cash.cdf.afterpayapplet;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class AfterpayAppletPaymentScheduleScrollToWeek implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String afterpay_applet_flow_token;
    public final LinkedHashMap parameters;
    public final Long payments_in_week;
    public final AfterpayAppletUXVersion ux_version;
    public final Long week_offset;
    public final String week_start_date;

    public AfterpayAppletPaymentScheduleScrollToWeek(String str, AfterpayAppletUXVersion afterpayAppletUXVersion, String str2, Long l, Long l2) {
        this.afterpay_applet_flow_token = str;
        this.ux_version = afterpayAppletUXVersion;
        this.week_start_date = str2;
        this.week_offset = l;
        this.payments_in_week = l2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "AfterpayApplet", "cdf_action", "PaymentSchedule");
        Countries.putSafe(m, "afterpay_applet_flow_token", str);
        Countries.putSafe(m, "ux_version", afterpayAppletUXVersion);
        Countries.putSafe(m, "week_start_date", str2);
        Countries.putSafe(m, "week_offset", l);
        Countries.putSafe(m, "payments_in_week", l2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletPaymentScheduleScrollToWeek)) {
            return false;
        }
        AfterpayAppletPaymentScheduleScrollToWeek afterpayAppletPaymentScheduleScrollToWeek = (AfterpayAppletPaymentScheduleScrollToWeek) obj;
        return Intrinsics.areEqual(this.afterpay_applet_flow_token, afterpayAppletPaymentScheduleScrollToWeek.afterpay_applet_flow_token) && this.ux_version == afterpayAppletPaymentScheduleScrollToWeek.ux_version && this.week_start_date.equals(afterpayAppletPaymentScheduleScrollToWeek.week_start_date) && this.week_offset.equals(afterpayAppletPaymentScheduleScrollToWeek.week_offset) && this.payments_in_week.equals(afterpayAppletPaymentScheduleScrollToWeek.payments_in_week);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayApplet PaymentSchedule ScrollToWeek";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_applet_flow_token;
        return this.payments_in_week.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.week_offset, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.ux_version.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.week_start_date), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfterpayAppletPaymentScheduleScrollToWeek(afterpay_applet_flow_token=");
        sb.append(this.afterpay_applet_flow_token);
        sb.append(", ux_version=");
        sb.append(this.ux_version);
        sb.append(", week_start_date=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.week_offset, this.week_start_date, ", week_offset=", ", payments_in_week=", sb);
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.payments_in_week, ")");
    }
}
