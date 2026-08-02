package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/preorder/tollroad/analytics/RoadSelectionCardAnalytics$RouteTypeV2", "", "Lru/yandex/taxi/preorder/tollroad/analytics/RoadSelectionCardAnalytics$RouteTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Free", "Toll", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoadSelectionCardAnalytics$RouteTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoadSelectionCardAnalytics$RouteTypeV2[] $VALUES;
    public static final RoadSelectionCardAnalytics$RouteTypeV2 Free;
    public static final RoadSelectionCardAnalytics$RouteTypeV2 Toll;
    private final String eventValue;

    static {
        RoadSelectionCardAnalytics$RouteTypeV2 roadSelectionCardAnalytics$RouteTypeV2 = new RoadSelectionCardAnalytics$RouteTypeV2("Free", 0, "free");
        Free = roadSelectionCardAnalytics$RouteTypeV2;
        RoadSelectionCardAnalytics$RouteTypeV2 roadSelectionCardAnalytics$RouteTypeV22 = new RoadSelectionCardAnalytics$RouteTypeV2("Toll", 1, "toll");
        Toll = roadSelectionCardAnalytics$RouteTypeV22;
        RoadSelectionCardAnalytics$RouteTypeV2[] roadSelectionCardAnalytics$RouteTypeV2Arr = {roadSelectionCardAnalytics$RouteTypeV2, roadSelectionCardAnalytics$RouteTypeV22};
        $VALUES = roadSelectionCardAnalytics$RouteTypeV2Arr;
        $ENTRIES = kotlin.enums.a.a(roadSelectionCardAnalytics$RouteTypeV2Arr);
    }

    public RoadSelectionCardAnalytics$RouteTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RoadSelectionCardAnalytics$RouteTypeV2 valueOf(String str) {
        return (RoadSelectionCardAnalytics$RouteTypeV2) Enum.valueOf(RoadSelectionCardAnalytics$RouteTypeV2.class, str);
    }

    public static RoadSelectionCardAnalytics$RouteTypeV2[] values() {
        return (RoadSelectionCardAnalytics$RouteTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
