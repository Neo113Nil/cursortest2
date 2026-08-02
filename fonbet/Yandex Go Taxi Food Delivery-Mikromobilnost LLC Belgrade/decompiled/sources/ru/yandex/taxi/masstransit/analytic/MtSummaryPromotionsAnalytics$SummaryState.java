package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MtSummaryPromotionsAnalytics$SummaryState", "", "Lru/yandex/taxi/masstransit/analytic/MtSummaryPromotionsAnalytics$SummaryState;", "COLLAPSED", "EXPANDED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtSummaryPromotionsAnalytics$SummaryState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtSummaryPromotionsAnalytics$SummaryState[] $VALUES;
    public static final MtSummaryPromotionsAnalytics$SummaryState COLLAPSED;
    public static final MtSummaryPromotionsAnalytics$SummaryState EXPANDED;

    static {
        MtSummaryPromotionsAnalytics$SummaryState mtSummaryPromotionsAnalytics$SummaryState = new MtSummaryPromotionsAnalytics$SummaryState("COLLAPSED", 0);
        COLLAPSED = mtSummaryPromotionsAnalytics$SummaryState;
        MtSummaryPromotionsAnalytics$SummaryState mtSummaryPromotionsAnalytics$SummaryState2 = new MtSummaryPromotionsAnalytics$SummaryState("EXPANDED", 1);
        EXPANDED = mtSummaryPromotionsAnalytics$SummaryState2;
        MtSummaryPromotionsAnalytics$SummaryState[] mtSummaryPromotionsAnalytics$SummaryStateArr = {mtSummaryPromotionsAnalytics$SummaryState, mtSummaryPromotionsAnalytics$SummaryState2};
        $VALUES = mtSummaryPromotionsAnalytics$SummaryStateArr;
        $ENTRIES = a.a(mtSummaryPromotionsAnalytics$SummaryStateArr);
    }

    public static MtSummaryPromotionsAnalytics$SummaryState valueOf(String str) {
        return (MtSummaryPromotionsAnalytics$SummaryState) Enum.valueOf(MtSummaryPromotionsAnalytics$SummaryState.class, str);
    }

    public static MtSummaryPromotionsAnalytics$SummaryState[] values() {
        return (MtSummaryPromotionsAnalytics$SummaryState[]) $VALUES.clone();
    }
}
