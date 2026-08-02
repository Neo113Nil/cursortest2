package com.squareup.cash.cdf.singleusepayment;

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
public final class SingleUsePaymentCancelDismissConfirmSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String payment_token;

    public SingleUsePaymentCancelDismissConfirmSheet(String str) {
        this.payment_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SingleUsePayment", "cdf_action", "Cancel");
        Countries.putSafe(m, "payment_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleUsePaymentCancelDismissConfirmSheet) && Intrinsics.areEqual(this.payment_token, ((SingleUsePaymentCancelDismissConfirmSheet) obj).payment_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SingleUsePayment Cancel DismissConfirmSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.payment_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SingleUsePaymentCancelDismissConfirmSheet(payment_token=", this.payment_token, ")");
    }
}
