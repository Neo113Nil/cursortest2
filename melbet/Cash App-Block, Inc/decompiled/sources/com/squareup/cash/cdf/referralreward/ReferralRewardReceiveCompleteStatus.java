package com.squareup.cash.cdf.referralreward;

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
public final class ReferralRewardReceiveCompleteStatus implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long duration;
    public final LinkedHashMap parameters;
    public final Long reward_payment_amount;
    public final CurrencyCode reward_payment_currency_code;
    public final Long total_payments;

    public ReferralRewardReceiveCompleteStatus(Long l, Long l2, CurrencyCode currencyCode, Long l3) {
        this.duration = l;
        this.reward_payment_amount = l2;
        this.reward_payment_currency_code = currencyCode;
        this.total_payments = l3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "ReferralReward", "cdf_action", "Receive");
        Countries.putSafe(m, "duration", l);
        Countries.putSafe(m, "reward_payment_amount", l2);
        Countries.putSafe(m, "reward_payment_currency_code", currencyCode);
        Countries.putSafe(m, "total_payments", l3);
        this.parameters = m;
    }

    public static ReferralRewardReceiveCompleteStatus copy$default(ReferralRewardReceiveCompleteStatus referralRewardReceiveCompleteStatus, Long l, Long l2, CurrencyCode currencyCode, Long l3, int i) {
        if ((i & 1) != 0) {
            l = referralRewardReceiveCompleteStatus.duration;
        }
        if ((i & 2) != 0) {
            l2 = referralRewardReceiveCompleteStatus.reward_payment_amount;
        }
        if ((i & 4) != 0) {
            currencyCode = referralRewardReceiveCompleteStatus.reward_payment_currency_code;
        }
        if ((i & 8) != 0) {
            l3 = referralRewardReceiveCompleteStatus.total_payments;
        }
        referralRewardReceiveCompleteStatus.getClass();
        return new ReferralRewardReceiveCompleteStatus(l, l2, currencyCode, l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralRewardReceiveCompleteStatus)) {
            return false;
        }
        ReferralRewardReceiveCompleteStatus referralRewardReceiveCompleteStatus = (ReferralRewardReceiveCompleteStatus) obj;
        return Intrinsics.areEqual(this.duration, referralRewardReceiveCompleteStatus.duration) && Intrinsics.areEqual(this.reward_payment_amount, referralRewardReceiveCompleteStatus.reward_payment_amount) && this.reward_payment_currency_code == referralRewardReceiveCompleteStatus.reward_payment_currency_code && Intrinsics.areEqual(this.total_payments, referralRewardReceiveCompleteStatus.total_payments);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ReferralReward Receive CompleteStatus";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.duration;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.reward_payment_amount;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        CurrencyCode currencyCode = this.reward_payment_currency_code;
        int hashCode3 = (hashCode2 + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31;
        Long l3 = this.total_payments;
        return hashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        return "ReferralRewardReceiveCompleteStatus(duration=" + this.duration + ", reward_payment_amount=" + this.reward_payment_amount + ", reward_payment_currency_code=" + this.reward_payment_currency_code + ", total_payments=" + this.total_payments + ")";
    }
}
