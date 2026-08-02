package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleButtonTypeV2", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleButtonTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Buy", "Calendar", "Update", "DateTab", "Back", "Reverse", "Filter", "TravelCard", "StopA", "StopB", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$ScheduleButtonTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$ScheduleButtonTypeV2[] $VALUES;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Back;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Buy;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Calendar;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 DateTab;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Filter;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Reverse;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 StopA;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 StopB;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 TravelCard;
    public static final TransportRouteAnalytics$ScheduleButtonTypeV2 Update;
    private final String eventValue;

    static {
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV2 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Buy", 0, "buy");
        Buy = transportRouteAnalytics$ScheduleButtonTypeV2;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV22 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Calendar", 1, "calendar");
        Calendar = transportRouteAnalytics$ScheduleButtonTypeV22;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV23 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Update", 2, "update");
        Update = transportRouteAnalytics$ScheduleButtonTypeV23;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV24 = new TransportRouteAnalytics$ScheduleButtonTypeV2("DateTab", 3, "date_tab");
        DateTab = transportRouteAnalytics$ScheduleButtonTypeV24;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV25 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Back", 4, "back");
        Back = transportRouteAnalytics$ScheduleButtonTypeV25;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV26 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Reverse", 5, "reverse");
        Reverse = transportRouteAnalytics$ScheduleButtonTypeV26;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV27 = new TransportRouteAnalytics$ScheduleButtonTypeV2("Filter", 6, "filter");
        Filter = transportRouteAnalytics$ScheduleButtonTypeV27;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV28 = new TransportRouteAnalytics$ScheduleButtonTypeV2("TravelCard", 7, "travel_card");
        TravelCard = transportRouteAnalytics$ScheduleButtonTypeV28;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV29 = new TransportRouteAnalytics$ScheduleButtonTypeV2("StopA", 8, "stop_a");
        StopA = transportRouteAnalytics$ScheduleButtonTypeV29;
        TransportRouteAnalytics$ScheduleButtonTypeV2 transportRouteAnalytics$ScheduleButtonTypeV210 = new TransportRouteAnalytics$ScheduleButtonTypeV2("StopB", 9, "stop_b");
        StopB = transportRouteAnalytics$ScheduleButtonTypeV210;
        TransportRouteAnalytics$ScheduleButtonTypeV2[] transportRouteAnalytics$ScheduleButtonTypeV2Arr = {transportRouteAnalytics$ScheduleButtonTypeV2, transportRouteAnalytics$ScheduleButtonTypeV22, transportRouteAnalytics$ScheduleButtonTypeV23, transportRouteAnalytics$ScheduleButtonTypeV24, transportRouteAnalytics$ScheduleButtonTypeV25, transportRouteAnalytics$ScheduleButtonTypeV26, transportRouteAnalytics$ScheduleButtonTypeV27, transportRouteAnalytics$ScheduleButtonTypeV28, transportRouteAnalytics$ScheduleButtonTypeV29, transportRouteAnalytics$ScheduleButtonTypeV210};
        $VALUES = transportRouteAnalytics$ScheduleButtonTypeV2Arr;
        $ENTRIES = a.a(transportRouteAnalytics$ScheduleButtonTypeV2Arr);
    }

    public TransportRouteAnalytics$ScheduleButtonTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$ScheduleButtonTypeV2 valueOf(String str) {
        return (TransportRouteAnalytics$ScheduleButtonTypeV2) Enum.valueOf(TransportRouteAnalytics$ScheduleButtonTypeV2.class, str);
    }

    public static TransportRouteAnalytics$ScheduleButtonTypeV2[] values() {
        return (TransportRouteAnalytics$ScheduleButtonTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
