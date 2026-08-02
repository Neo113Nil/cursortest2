package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/analytics/EditPointOnMapAnalytics$ActionV2", "", "Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$ActionV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MapDragging", "Suggest", "PickupPointTap", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditPointOnMapAnalytics$ActionV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditPointOnMapAnalytics$ActionV2[] $VALUES;
    public static final EditPointOnMapAnalytics$ActionV2 MapDragging;
    public static final EditPointOnMapAnalytics$ActionV2 PickupPointTap;
    public static final EditPointOnMapAnalytics$ActionV2 Suggest;
    private final String eventValue;

    static {
        EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV2 = new EditPointOnMapAnalytics$ActionV2("MapDragging", 0, "map_dragging");
        MapDragging = editPointOnMapAnalytics$ActionV2;
        EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV22 = new EditPointOnMapAnalytics$ActionV2("Suggest", 1, "suggest");
        Suggest = editPointOnMapAnalytics$ActionV22;
        EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV23 = new EditPointOnMapAnalytics$ActionV2("PickupPointTap", 2, "pickup_point_tap");
        PickupPointTap = editPointOnMapAnalytics$ActionV23;
        EditPointOnMapAnalytics$ActionV2[] editPointOnMapAnalytics$ActionV2Arr = {editPointOnMapAnalytics$ActionV2, editPointOnMapAnalytics$ActionV22, editPointOnMapAnalytics$ActionV23};
        $VALUES = editPointOnMapAnalytics$ActionV2Arr;
        $ENTRIES = a.a(editPointOnMapAnalytics$ActionV2Arr);
    }

    public EditPointOnMapAnalytics$ActionV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EditPointOnMapAnalytics$ActionV2 valueOf(String str) {
        return (EditPointOnMapAnalytics$ActionV2) Enum.valueOf(EditPointOnMapAnalytics$ActionV2.class, str);
    }

    public static EditPointOnMapAnalytics$ActionV2[] values() {
        return (EditPointOnMapAnalytics$ActionV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
