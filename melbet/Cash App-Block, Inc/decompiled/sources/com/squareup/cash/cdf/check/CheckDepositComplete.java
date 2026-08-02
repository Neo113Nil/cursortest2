package com.squareup.cash.cdf.check;

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
public final class CheckDepositComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final CurrencyCode currency_code;
    public final LinkedHashMap parameters;

    public CheckDepositComplete(Integer num, CurrencyCode currencyCode) {
        this.amount = num;
        this.currency_code = currencyCode;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Check", "cdf_action", "Deposit");
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "currency_code", currencyCode);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDepositComplete)) {
            return false;
        }
        CheckDepositComplete checkDepositComplete = (CheckDepositComplete) obj;
        return Intrinsics.areEqual(this.amount, checkDepositComplete.amount) && this.currency_code == checkDepositComplete.currency_code;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Check Deposit Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        CurrencyCode currencyCode = this.currency_code;
        return hashCode + (currencyCode != null ? currencyCode.hashCode() : 0);
    }

    public final String toString() {
        return "CheckDepositComplete(amount=" + this.amount + ", currency_code=" + this.currency_code + ")";
    }
}
