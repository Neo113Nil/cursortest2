package com.squareup.cash.cdf.paychecks;

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
public final class PaychecksShowPaycheckReceipt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String paycheck_token;

    public PaychecksShowPaycheckReceipt(String str) {
        Boolean bool = Boolean.FALSE;
        this.paycheck_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Paychecks", "cdf_action", "Show");
        Countries.putSafe(m, "paycheck_token", str);
        Countries.putSafe(m, "from_view_all", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksShowPaycheckReceipt) || !Intrinsics.areEqual(this.paycheck_token, ((PaychecksShowPaycheckReceipt) obj).paycheck_token)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks Show PaycheckReceipt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.paycheck_token;
        return Boolean.FALSE.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PaychecksShowPaycheckReceipt(paycheck_token=" + this.paycheck_token + ", from_view_all=" + Boolean.FALSE + ")";
    }
}
