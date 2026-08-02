package com.squareup.cash.cdf.balancebasedaddcash;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BalanceBasedAddCashEditAmountViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final EditAmountMethod method;
    public final EditAmountOption option;
    public final LinkedHashMap parameters;

    public BalanceBasedAddCashEditAmountViewed(EditAmountOption editAmountOption, EditAmountMethod editAmountMethod, String str) {
        this.option = editAmountOption;
        this.method = editAmountMethod;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "BalanceBasedAddCash", "cdf_action", "EditAmount");
        Countries.putSafe(m, "option", editAmountOption);
        Countries.putSafe(m, "method", editAmountMethod);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashEditAmountViewed)) {
            return false;
        }
        BalanceBasedAddCashEditAmountViewed balanceBasedAddCashEditAmountViewed = (BalanceBasedAddCashEditAmountViewed) obj;
        return this.option == balanceBasedAddCashEditAmountViewed.option && this.method == balanceBasedAddCashEditAmountViewed.method && this.flow_token.equals(balanceBasedAddCashEditAmountViewed.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BalanceBasedAddCash EditAmount Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + ((this.method.hashCode() + (this.option.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceBasedAddCashEditAmountViewed(option=");
        sb.append(this.option);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
