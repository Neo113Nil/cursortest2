package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/preorder/tollroad/analytics/TollRoadSetReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INIT", "UNKNOWN", "ROUTE_TAPPED", "OPTION_SELECTED", "GOT_NEW_TOLL_ROADS", "NEW_ROUTE_FROM_MAPKIT", "SOURCE_ADDRESS_CHANGED", "SELECTED_TARIFF_CHANGED", "DESTINATION_ADDRESS_CHANGED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TollRoadSetReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadSetReason[] $VALUES;
    public static final TollRoadSetReason DESTINATION_ADDRESS_CHANGED;
    public static final TollRoadSetReason GOT_NEW_TOLL_ROADS;
    public static final TollRoadSetReason INIT;
    public static final TollRoadSetReason NEW_ROUTE_FROM_MAPKIT;
    public static final TollRoadSetReason OPTION_SELECTED;
    public static final TollRoadSetReason ROUTE_TAPPED;
    public static final TollRoadSetReason SELECTED_TARIFF_CHANGED;
    public static final TollRoadSetReason SOURCE_ADDRESS_CHANGED;
    public static final TollRoadSetReason UNKNOWN;
    private final String analyticsName;

    static {
        TollRoadSetReason tollRoadSetReason = new TollRoadSetReason("INIT", 0, "INIT");
        INIT = tollRoadSetReason;
        TollRoadSetReason tollRoadSetReason2 = new TollRoadSetReason("UNKNOWN", 1, "UNKNOWN");
        UNKNOWN = tollRoadSetReason2;
        TollRoadSetReason tollRoadSetReason3 = new TollRoadSetReason("ROUTE_TAPPED", 2, "ROUTE_TAPPED");
        ROUTE_TAPPED = tollRoadSetReason3;
        TollRoadSetReason tollRoadSetReason4 = new TollRoadSetReason("OPTION_SELECTED", 3, "OPTION_SELECTED");
        OPTION_SELECTED = tollRoadSetReason4;
        TollRoadSetReason tollRoadSetReason5 = new TollRoadSetReason("GOT_NEW_TOLL_ROADS", 4, "GOT_NEW_TOLL_ROADS");
        GOT_NEW_TOLL_ROADS = tollRoadSetReason5;
        TollRoadSetReason tollRoadSetReason6 = new TollRoadSetReason("NEW_ROUTE_FROM_MAPKIT", 5, "NEW_ROUTE_FROM_MAPKIT");
        NEW_ROUTE_FROM_MAPKIT = tollRoadSetReason6;
        TollRoadSetReason tollRoadSetReason7 = new TollRoadSetReason("SOURCE_ADDRESS_CHANGED", 6, "SOURCE_ADDRESS_CHANGED");
        SOURCE_ADDRESS_CHANGED = tollRoadSetReason7;
        TollRoadSetReason tollRoadSetReason8 = new TollRoadSetReason("SELECTED_TARIFF_CHANGED", 7, "SELECTED_TARIFF_CHANGED");
        SELECTED_TARIFF_CHANGED = tollRoadSetReason8;
        TollRoadSetReason tollRoadSetReason9 = new TollRoadSetReason("DESTINATION_ADDRESS_CHANGED", 8, "DESTINATION_ADDRESS_CHANGED");
        DESTINATION_ADDRESS_CHANGED = tollRoadSetReason9;
        TollRoadSetReason[] tollRoadSetReasonArr = {tollRoadSetReason, tollRoadSetReason2, tollRoadSetReason3, tollRoadSetReason4, tollRoadSetReason5, tollRoadSetReason6, tollRoadSetReason7, tollRoadSetReason8, tollRoadSetReason9};
        $VALUES = tollRoadSetReasonArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadSetReasonArr);
    }

    public TollRoadSetReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static TollRoadSetReason valueOf(String str) {
        return (TollRoadSetReason) Enum.valueOf(TollRoadSetReason.class, str);
    }

    public static TollRoadSetReason[] values() {
        return (TollRoadSetReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
