package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoInteractPerformanceDetailsInfoItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final PerformanceDetailsInfoItemType f1079type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class PerformanceDetailsInfoItemType {
        public static final /* synthetic */ PerformanceDetailsInfoItemType[] $VALUES;
        public static final PerformanceDetailsInfoItemType ALL_TIME_RETURNS;
        public static final PerformanceDetailsInfoItemType ALL_TIME_RETURNS_PERCENT;
        public static final PerformanceDetailsInfoItemType CURRENT_VALUE;
        public static final PerformanceDetailsInfoItemType DEPOSITS;
        public static final PerformanceDetailsInfoItemType PURCHASES;
        public static final PerformanceDetailsInfoItemType SALES;
        public static final PerformanceDetailsInfoItemType WITHDRAWALS;

        static {
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType = new PerformanceDetailsInfoItemType("CURRENT_VALUE", 0);
            CURRENT_VALUE = performanceDetailsInfoItemType;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType2 = new PerformanceDetailsInfoItemType("ALL_TIME_RETURNS", 1);
            ALL_TIME_RETURNS = performanceDetailsInfoItemType2;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType3 = new PerformanceDetailsInfoItemType("ALL_TIME_RETURNS_PERCENT", 2);
            ALL_TIME_RETURNS_PERCENT = performanceDetailsInfoItemType3;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType4 = new PerformanceDetailsInfoItemType("PURCHASES", 3);
            PURCHASES = performanceDetailsInfoItemType4;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType5 = new PerformanceDetailsInfoItemType("DEPOSITS", 4);
            DEPOSITS = performanceDetailsInfoItemType5;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType6 = new PerformanceDetailsInfoItemType("SALES", 5);
            SALES = performanceDetailsInfoItemType6;
            PerformanceDetailsInfoItemType performanceDetailsInfoItemType7 = new PerformanceDetailsInfoItemType("WITHDRAWALS", 6);
            WITHDRAWALS = performanceDetailsInfoItemType7;
            $VALUES = new PerformanceDetailsInfoItemType[]{performanceDetailsInfoItemType, performanceDetailsInfoItemType2, performanceDetailsInfoItemType3, performanceDetailsInfoItemType4, performanceDetailsInfoItemType5, performanceDetailsInfoItemType6, performanceDetailsInfoItemType7};
        }

        public static PerformanceDetailsInfoItemType valueOf(String str) {
            return (PerformanceDetailsInfoItemType) Enum.valueOf(PerformanceDetailsInfoItemType.class, str);
        }

        public static PerformanceDetailsInfoItemType[] values() {
            return (PerformanceDetailsInfoItemType[]) $VALUES.clone();
        }
    }

    public CryptoInteractPerformanceDetailsInfoItem(PerformanceDetailsInfoItemType performanceDetailsInfoItemType) {
        this.f1079type = performanceDetailsInfoItemType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "InteractPerformance");
        Countries.putSafe(m, "type", performanceDetailsInfoItemType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoInteractPerformanceDetailsInfoItem) && this.f1079type == ((CryptoInteractPerformanceDetailsInfoItem) obj).f1079type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto InteractPerformance DetailsInfoItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        PerformanceDetailsInfoItemType performanceDetailsInfoItemType = this.f1079type;
        if (performanceDetailsInfoItemType == null) {
            return 0;
        }
        return performanceDetailsInfoItemType.hashCode();
    }

    public final String toString() {
        return "CryptoInteractPerformanceDetailsInfoItem(type=" + this.f1079type + ")";
    }
}
