package com.squareup.cash.cdf.stock;

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
public final class StockFollowFollowStock implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EquityType equity_type;
    public final LinkedHashMap parameters;
    public final FollowStatus status;
    public final String ticker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FollowStatus {
        public static final /* synthetic */ FollowStatus[] $VALUES;
        public static final FollowStatus FOLLOW;
        public static final FollowStatus UNFOLLOW;

        static {
            FollowStatus followStatus = new FollowStatus("FOLLOW", 0);
            FOLLOW = followStatus;
            FollowStatus followStatus2 = new FollowStatus("UNFOLLOW", 1);
            UNFOLLOW = followStatus2;
            $VALUES = new FollowStatus[]{followStatus, followStatus2};
        }

        public static FollowStatus valueOf(String str) {
            return (FollowStatus) Enum.valueOf(FollowStatus.class, str);
        }

        public static FollowStatus[] values() {
            return (FollowStatus[]) $VALUES.clone();
        }
    }

    public StockFollowFollowStock(FollowStatus followStatus, String str, EquityType equityType) {
        this.status = followStatus;
        this.ticker = str;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Follow");
        Countries.putSafe(m, "status", followStatus);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockFollowFollowStock)) {
            return false;
        }
        StockFollowFollowStock stockFollowFollowStock = (StockFollowFollowStock) obj;
        return this.status == stockFollowFollowStock.status && Intrinsics.areEqual(this.ticker, stockFollowFollowStock.ticker) && this.equity_type == stockFollowFollowStock.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Follow FollowStock";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.ticker;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EquityType equityType = this.equity_type;
        return hashCode2 + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        return "StockFollowFollowStock(status=" + this.status + ", ticker=" + this.ticker + ", equity_type=" + this.equity_type + ")";
    }
}
