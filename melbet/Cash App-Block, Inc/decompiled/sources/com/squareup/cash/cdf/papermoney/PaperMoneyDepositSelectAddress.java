package com.squareup.cash.cdf.papermoney;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositSelectAddress implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Boolean recent_address;

    public PaperMoneyDepositSelectAddress(Boolean bool) {
        this.recent_address = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PaperMoney", "cdf_action", "Deposit");
        Countries.putSafe(m, "recent_address", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaperMoneyDepositSelectAddress) && this.recent_address.equals(((PaperMoneyDepositSelectAddress) obj).recent_address);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney Deposit SelectAddress";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.recent_address.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.recent_address, "PaperMoneyDepositSelectAddress(recent_address=", ")");
    }
}
