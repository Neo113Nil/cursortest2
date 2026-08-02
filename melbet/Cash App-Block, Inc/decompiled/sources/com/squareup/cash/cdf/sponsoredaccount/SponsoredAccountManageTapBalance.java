package com.squareup.cash.cdf.sponsoredaccount;

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
public final class SponsoredAccountManageTapBalance implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BalanceType balanceType;
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BalanceType {
        public static final /* synthetic */ BalanceType[] $VALUES;
        public static final BalanceType Bitcoin;
        public static final BalanceType Savings;
        public static final BalanceType Stocks;

        static {
            BalanceType balanceType = new BalanceType("Savings", 0);
            Savings = balanceType;
            BalanceType balanceType2 = new BalanceType("Stocks", 1);
            Stocks = balanceType2;
            BalanceType balanceType3 = new BalanceType("Bitcoin", 2);
            Bitcoin = balanceType3;
            $VALUES = new BalanceType[]{balanceType, balanceType2, balanceType3};
        }

        public static BalanceType valueOf(String str) {
            return (BalanceType) Enum.valueOf(BalanceType.class, str);
        }

        public static BalanceType[] values() {
            return (BalanceType[]) $VALUES.clone();
        }
    }

    public SponsoredAccountManageTapBalance(String str, BalanceType balanceType) {
        this.dependent_customer_token = str;
        this.balanceType = balanceType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "Manage");
        Countries.putSafe(m, "dependent_customer_token", str);
        Countries.putSafe(m, "balanceType", balanceType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManageTapBalance)) {
            return false;
        }
        SponsoredAccountManageTapBalance sponsoredAccountManageTapBalance = (SponsoredAccountManageTapBalance) obj;
        return Intrinsics.areEqual(this.dependent_customer_token, sponsoredAccountManageTapBalance.dependent_customer_token) && this.balanceType == sponsoredAccountManageTapBalance.balanceType;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount Manage TapBalance";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.dependent_customer_token;
        return this.balanceType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SponsoredAccountManageTapBalance(dependent_customer_token=" + this.dependent_customer_token + ", balanceType=" + this.balanceType + ")";
    }
}
