package com.squareup.cash.cdf.cash;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.CurrencyCode;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CashWithdrawSaveAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final CurrencyCode currency;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CashWithdrawSaveAmount(CurrencyCode currencyCode, Integer num, String str) {
        this.flow_token = str;
        this.amount = num;
        this.currency = currencyCode;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "currency", currencyCode);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawSaveAmount)) {
            return false;
        }
        CashWithdrawSaveAmount cashWithdrawSaveAmount = (CashWithdrawSaveAmount) obj;
        return Intrinsics.areEqual(this.flow_token, cashWithdrawSaveAmount.flow_token) && Intrinsics.areEqual(this.amount, cashWithdrawSaveAmount.amount) && this.currency == cashWithdrawSaveAmount.currency;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw SaveAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.amount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        CurrencyCode currencyCode = this.currency;
        return hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.amount, "CashWithdrawSaveAmount(flow_token=", this.flow_token, ", amount=", ", currency=");
        m.append(this.currency);
        m.append(")");
        return m.toString();
    }
}
