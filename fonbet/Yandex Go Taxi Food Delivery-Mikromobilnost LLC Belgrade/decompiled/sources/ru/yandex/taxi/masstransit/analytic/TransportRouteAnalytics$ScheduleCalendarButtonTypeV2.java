package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleCalendarButtonTypeV2", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleCalendarButtonTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Exit", "Apply", "ChangeDate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$ScheduleCalendarButtonTypeV2[] $VALUES;
    public static final TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 Apply;
    public static final TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 ChangeDate;
    public static final TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 Exit;
    private final String eventValue;

    static {
        TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 transportRouteAnalytics$ScheduleCalendarButtonTypeV2 = new TransportRouteAnalytics$ScheduleCalendarButtonTypeV2("Exit", 0, "exit");
        Exit = transportRouteAnalytics$ScheduleCalendarButtonTypeV2;
        TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 transportRouteAnalytics$ScheduleCalendarButtonTypeV22 = new TransportRouteAnalytics$ScheduleCalendarButtonTypeV2("Apply", 1, "apply");
        Apply = transportRouteAnalytics$ScheduleCalendarButtonTypeV22;
        TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 transportRouteAnalytics$ScheduleCalendarButtonTypeV23 = new TransportRouteAnalytics$ScheduleCalendarButtonTypeV2("ChangeDate", 2, "change_date");
        ChangeDate = transportRouteAnalytics$ScheduleCalendarButtonTypeV23;
        TransportRouteAnalytics$ScheduleCalendarButtonTypeV2[] transportRouteAnalytics$ScheduleCalendarButtonTypeV2Arr = {transportRouteAnalytics$ScheduleCalendarButtonTypeV2, transportRouteAnalytics$ScheduleCalendarButtonTypeV22, transportRouteAnalytics$ScheduleCalendarButtonTypeV23};
        $VALUES = transportRouteAnalytics$ScheduleCalendarButtonTypeV2Arr;
        $ENTRIES = a.a(transportRouteAnalytics$ScheduleCalendarButtonTypeV2Arr);
    }

    public TransportRouteAnalytics$ScheduleCalendarButtonTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$ScheduleCalendarButtonTypeV2 valueOf(String str) {
        return (TransportRouteAnalytics$ScheduleCalendarButtonTypeV2) Enum.valueOf(TransportRouteAnalytics$ScheduleCalendarButtonTypeV2.class, str);
    }

    public static TransportRouteAnalytics$ScheduleCalendarButtonTypeV2[] values() {
        return (TransportRouteAnalytics$ScheduleCalendarButtonTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
