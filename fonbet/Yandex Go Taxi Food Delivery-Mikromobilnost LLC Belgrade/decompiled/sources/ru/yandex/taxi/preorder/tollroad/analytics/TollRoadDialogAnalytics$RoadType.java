package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import defpackage.s131;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$RoadType", "Ls131;", "", "Lru/yandex/taxi/preorder/tollroad/analytics/TollRoadDialogAnalytics$RoadType;", "FREE", "TOLL", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogAnalytics$RoadType implements s131 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogAnalytics$RoadType[] $VALUES;
    public static final TollRoadDialogAnalytics$RoadType FREE;
    public static final TollRoadDialogAnalytics$RoadType TOLL;

    static {
        TollRoadDialogAnalytics$RoadType tollRoadDialogAnalytics$RoadType = new TollRoadDialogAnalytics$RoadType("FREE", 0);
        FREE = tollRoadDialogAnalytics$RoadType;
        TollRoadDialogAnalytics$RoadType tollRoadDialogAnalytics$RoadType2 = new TollRoadDialogAnalytics$RoadType("TOLL", 1);
        TOLL = tollRoadDialogAnalytics$RoadType2;
        TollRoadDialogAnalytics$RoadType[] tollRoadDialogAnalytics$RoadTypeArr = {tollRoadDialogAnalytics$RoadType, tollRoadDialogAnalytics$RoadType2};
        $VALUES = tollRoadDialogAnalytics$RoadTypeArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogAnalytics$RoadTypeArr);
    }

    public static TollRoadDialogAnalytics$RoadType valueOf(String str) {
        return (TollRoadDialogAnalytics$RoadType) Enum.valueOf(TollRoadDialogAnalytics$RoadType.class, str);
    }

    public static TollRoadDialogAnalytics$RoadType[] values() {
        return (TollRoadDialogAnalytics$RoadType[]) $VALUES.clone();
    }

    @Override // defpackage.s131
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
