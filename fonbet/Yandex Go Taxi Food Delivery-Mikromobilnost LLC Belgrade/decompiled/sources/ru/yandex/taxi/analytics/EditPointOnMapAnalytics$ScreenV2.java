package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/analytics/EditPointOnMapAnalytics$ScreenV2", "", "Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$ScreenV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "RouteSelector", "Summary", "Order", "Main", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditPointOnMapAnalytics$ScreenV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditPointOnMapAnalytics$ScreenV2[] $VALUES;
    public static final EditPointOnMapAnalytics$ScreenV2 Main;
    public static final EditPointOnMapAnalytics$ScreenV2 Order;
    public static final EditPointOnMapAnalytics$ScreenV2 RouteSelector;
    public static final EditPointOnMapAnalytics$ScreenV2 Summary;
    private final String eventValue;

    static {
        EditPointOnMapAnalytics$ScreenV2 editPointOnMapAnalytics$ScreenV2 = new EditPointOnMapAnalytics$ScreenV2("RouteSelector", 0, "route_selector");
        RouteSelector = editPointOnMapAnalytics$ScreenV2;
        EditPointOnMapAnalytics$ScreenV2 editPointOnMapAnalytics$ScreenV22 = new EditPointOnMapAnalytics$ScreenV2("Summary", 1, "summary");
        Summary = editPointOnMapAnalytics$ScreenV22;
        EditPointOnMapAnalytics$ScreenV2 editPointOnMapAnalytics$ScreenV23 = new EditPointOnMapAnalytics$ScreenV2("Order", 2, "order");
        Order = editPointOnMapAnalytics$ScreenV23;
        EditPointOnMapAnalytics$ScreenV2 editPointOnMapAnalytics$ScreenV24 = new EditPointOnMapAnalytics$ScreenV2("Main", 3, "main");
        Main = editPointOnMapAnalytics$ScreenV24;
        EditPointOnMapAnalytics$ScreenV2[] editPointOnMapAnalytics$ScreenV2Arr = {editPointOnMapAnalytics$ScreenV2, editPointOnMapAnalytics$ScreenV22, editPointOnMapAnalytics$ScreenV23, editPointOnMapAnalytics$ScreenV24};
        $VALUES = editPointOnMapAnalytics$ScreenV2Arr;
        $ENTRIES = a.a(editPointOnMapAnalytics$ScreenV2Arr);
    }

    public EditPointOnMapAnalytics$ScreenV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EditPointOnMapAnalytics$ScreenV2 valueOf(String str) {
        return (EditPointOnMapAnalytics$ScreenV2) Enum.valueOf(EditPointOnMapAnalytics$ScreenV2.class, str);
    }

    public static EditPointOnMapAnalytics$ScreenV2[] values() {
        return (EditPointOnMapAnalytics$ScreenV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
