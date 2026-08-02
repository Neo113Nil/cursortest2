package com.squareup.cash.cdf.limits;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LimitsInteractTapLimitTypeRow implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LimitType limit_type;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LimitType {
        public static final /* synthetic */ LimitType[] $VALUES;
        public static final LimitType BITCOIN;
        public static final LimitType CASH_CARD;
        public static final LimitType DEPOSIT_AND_WITHDRAW;
        public static final LimitType SEND_AND_RECEIVE;
        public static final LimitType STOCKS;

        static {
            LimitType limitType = new LimitType("BITCOIN", 0);
            BITCOIN = limitType;
            LimitType limitType2 = new LimitType("CASH_CARD", 1);
            CASH_CARD = limitType2;
            LimitType limitType3 = new LimitType("DEPOSIT_AND_WITHDRAW", 2);
            DEPOSIT_AND_WITHDRAW = limitType3;
            LimitType limitType4 = new LimitType("SEND_AND_RECEIVE", 3);
            SEND_AND_RECEIVE = limitType4;
            LimitType limitType5 = new LimitType("STOCKS", 4);
            STOCKS = limitType5;
            $VALUES = new LimitType[]{limitType, limitType2, limitType3, limitType4, limitType5};
        }

        public static LimitType valueOf(String str) {
            return (LimitType) Enum.valueOf(LimitType.class, str);
        }

        public static LimitType[] values() {
            return (LimitType[]) $VALUES.clone();
        }
    }

    public LimitsInteractTapLimitTypeRow(LimitType limitType) {
        this.limit_type = limitType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Limits", "cdf_action", "Interact");
        Countries.putSafe(m, "limit_type", limitType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitsInteractTapLimitTypeRow) && this.limit_type == ((LimitsInteractTapLimitTypeRow) obj).limit_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Limits Interact TapLimitTypeRow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        LimitType limitType = this.limit_type;
        return (limitType == null ? 0 : limitType.hashCode()) * 31;
    }

    public final String toString() {
        return "LimitsInteractTapLimitTypeRow(limit_type=" + this.limit_type + ", flow_token=null)";
    }
}
