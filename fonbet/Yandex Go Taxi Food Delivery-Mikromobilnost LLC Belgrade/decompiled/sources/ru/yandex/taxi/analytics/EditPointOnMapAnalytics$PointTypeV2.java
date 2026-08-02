package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/yandex/taxi/analytics/EditPointOnMapAnalytics$PointTypeV2", "", "Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$PointTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Source", "Destination", "Favorite", "External", "Masstransit", "DeliverySource", "DeliveryDestination", "DeliveryTransit", "Unknown", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditPointOnMapAnalytics$PointTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditPointOnMapAnalytics$PointTypeV2[] $VALUES;
    public static final EditPointOnMapAnalytics$PointTypeV2 DeliveryDestination;
    public static final EditPointOnMapAnalytics$PointTypeV2 DeliverySource;
    public static final EditPointOnMapAnalytics$PointTypeV2 DeliveryTransit;
    public static final EditPointOnMapAnalytics$PointTypeV2 Destination;
    public static final EditPointOnMapAnalytics$PointTypeV2 External;
    public static final EditPointOnMapAnalytics$PointTypeV2 Favorite;
    public static final EditPointOnMapAnalytics$PointTypeV2 Masstransit;
    public static final EditPointOnMapAnalytics$PointTypeV2 Source;
    public static final EditPointOnMapAnalytics$PointTypeV2 Unknown;
    private final String eventValue;

    static {
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2 = new EditPointOnMapAnalytics$PointTypeV2("Source", 0, "source");
        Source = editPointOnMapAnalytics$PointTypeV2;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV22 = new EditPointOnMapAnalytics$PointTypeV2("Destination", 1, "destination");
        Destination = editPointOnMapAnalytics$PointTypeV22;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV23 = new EditPointOnMapAnalytics$PointTypeV2("Favorite", 2, "favorite");
        Favorite = editPointOnMapAnalytics$PointTypeV23;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV24 = new EditPointOnMapAnalytics$PointTypeV2("External", 3, "external");
        External = editPointOnMapAnalytics$PointTypeV24;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV25 = new EditPointOnMapAnalytics$PointTypeV2("Masstransit", 4, "masstransit");
        Masstransit = editPointOnMapAnalytics$PointTypeV25;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV26 = new EditPointOnMapAnalytics$PointTypeV2("DeliverySource", 5, "delivery_source");
        DeliverySource = editPointOnMapAnalytics$PointTypeV26;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV27 = new EditPointOnMapAnalytics$PointTypeV2("DeliveryDestination", 6, "delivery_destination");
        DeliveryDestination = editPointOnMapAnalytics$PointTypeV27;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV28 = new EditPointOnMapAnalytics$PointTypeV2("DeliveryTransit", 7, "delivery_transit");
        DeliveryTransit = editPointOnMapAnalytics$PointTypeV28;
        EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV29 = new EditPointOnMapAnalytics$PointTypeV2("Unknown", 8, "unknown");
        Unknown = editPointOnMapAnalytics$PointTypeV29;
        EditPointOnMapAnalytics$PointTypeV2[] editPointOnMapAnalytics$PointTypeV2Arr = {editPointOnMapAnalytics$PointTypeV2, editPointOnMapAnalytics$PointTypeV22, editPointOnMapAnalytics$PointTypeV23, editPointOnMapAnalytics$PointTypeV24, editPointOnMapAnalytics$PointTypeV25, editPointOnMapAnalytics$PointTypeV26, editPointOnMapAnalytics$PointTypeV27, editPointOnMapAnalytics$PointTypeV28, editPointOnMapAnalytics$PointTypeV29};
        $VALUES = editPointOnMapAnalytics$PointTypeV2Arr;
        $ENTRIES = a.a(editPointOnMapAnalytics$PointTypeV2Arr);
    }

    public EditPointOnMapAnalytics$PointTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EditPointOnMapAnalytics$PointTypeV2 valueOf(String str) {
        return (EditPointOnMapAnalytics$PointTypeV2) Enum.valueOf(EditPointOnMapAnalytics$PointTypeV2.class, str);
    }

    public static EditPointOnMapAnalytics$PointTypeV2[] values() {
        return (EditPointOnMapAnalytics$PointTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
