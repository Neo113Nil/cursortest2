package com.squareup.cash.cdf.cash;

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
public final class CashSendStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Double amount;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CashSendStart(Double d, String str) {
        this.amount = d;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Cash", "cdf_action", "Send");
        Countries.putSafe(m, "amount", d);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashSendStart)) {
            return false;
        }
        CashSendStart cashSendStart = (CashSendStart) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) cashSendStart.amount) && Intrinsics.areEqual(this.flow_token, cashSendStart.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Send Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Double d = this.amount;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.flow_token;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CashSendStart(amount=" + this.amount + ", flow_token=" + this.flow_token + ")";
    }
}
