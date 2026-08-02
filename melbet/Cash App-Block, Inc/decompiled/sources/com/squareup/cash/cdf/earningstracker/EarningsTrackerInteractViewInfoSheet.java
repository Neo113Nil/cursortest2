package com.squareup.cash.cdf.earningstracker;

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
public final class EarningsTrackerInteractViewInfoSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InfoContextType {
        public static final /* synthetic */ InfoContextType[] $VALUES;
        public static final InfoContextType NET_EARNINGS;

        static {
            InfoContextType infoContextType = new InfoContextType("NET_EARNINGS", 0);
            NET_EARNINGS = infoContextType;
            $VALUES = new InfoContextType[]{infoContextType};
        }

        public static InfoContextType valueOf(String str) {
            return (InfoContextType) Enum.valueOf(InfoContextType.class, str);
        }

        public static InfoContextType[] values() {
            return (InfoContextType[]) $VALUES.clone();
        }
    }

    public EarningsTrackerInteractViewInfoSheet(Timeframe timeframe, Integer num, Integer num2) {
        InfoContextType infoContextType = InfoContextType.NET_EARNINGS;
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "EarningsTracker", "cdf_action", "Interact");
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        Countries.putSafe(m, "info_context", infoContextType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerInteractViewInfoSheet)) {
            return false;
        }
        EarningsTrackerInteractViewInfoSheet earningsTrackerInteractViewInfoSheet = (EarningsTrackerInteractViewInfoSheet) obj;
        if (this.timeframe != earningsTrackerInteractViewInfoSheet.timeframe || !Intrinsics.areEqual(this.timeframe_month, earningsTrackerInteractViewInfoSheet.timeframe_month) || !Intrinsics.areEqual(this.timeframe_year, earningsTrackerInteractViewInfoSheet.timeframe_year)) {
            return false;
        }
        InfoContextType infoContextType = InfoContextType.NET_EARNINGS;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Interact ViewInfoSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Timeframe timeframe = this.timeframe;
        int hashCode = (timeframe == null ? 0 : timeframe.hashCode()) * 31;
        Integer num = this.timeframe_month;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeframe_year;
        return InfoContextType.NET_EARNINGS.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EarningsTrackerInteractViewInfoSheet(timeframe=" + this.timeframe + ", timeframe_month=" + this.timeframe_month + ", timeframe_year=" + this.timeframe_year + ", info_context=" + InfoContextType.NET_EARNINGS + ")";
    }
}
