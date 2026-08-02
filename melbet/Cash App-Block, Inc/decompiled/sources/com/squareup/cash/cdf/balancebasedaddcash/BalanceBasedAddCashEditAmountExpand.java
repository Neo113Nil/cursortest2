package com.squareup.cash.cdf.balancebasedaddcash;

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
public final class BalanceBasedAddCashEditAmountExpand implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final EditAmountOption option;
    public final LinkedHashMap parameters;

    public BalanceBasedAddCashEditAmountExpand(EditAmountOption editAmountOption, String str) {
        this.option = editAmountOption;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "BalanceBasedAddCash", "cdf_action", "EditAmount");
        Countries.putSafe(m, "option", editAmountOption);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashEditAmountExpand)) {
            return false;
        }
        BalanceBasedAddCashEditAmountExpand balanceBasedAddCashEditAmountExpand = (BalanceBasedAddCashEditAmountExpand) obj;
        return this.option == balanceBasedAddCashEditAmountExpand.option && Intrinsics.areEqual(this.flow_token, balanceBasedAddCashEditAmountExpand.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BalanceBasedAddCash EditAmount Expand";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.option.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BalanceBasedAddCashEditAmountExpand(option=" + this.option + ", flow_token=" + this.flow_token + ")";
    }
}
