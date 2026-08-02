package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleErrorReason", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleErrorReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NoAvailableTickets", "LoadError", "Mapping", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$ScheduleErrorReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$ScheduleErrorReason[] $VALUES;
    public static final TransportRouteAnalytics$ScheduleErrorReason LoadError;
    public static final TransportRouteAnalytics$ScheduleErrorReason Mapping;
    public static final TransportRouteAnalytics$ScheduleErrorReason NoAvailableTickets;
    private final String eventValue;

    static {
        TransportRouteAnalytics$ScheduleErrorReason transportRouteAnalytics$ScheduleErrorReason = new TransportRouteAnalytics$ScheduleErrorReason("NoAvailableTickets", 0, "no_available_tickets");
        NoAvailableTickets = transportRouteAnalytics$ScheduleErrorReason;
        TransportRouteAnalytics$ScheduleErrorReason transportRouteAnalytics$ScheduleErrorReason2 = new TransportRouteAnalytics$ScheduleErrorReason("LoadError", 1, "load_error");
        LoadError = transportRouteAnalytics$ScheduleErrorReason2;
        TransportRouteAnalytics$ScheduleErrorReason transportRouteAnalytics$ScheduleErrorReason3 = new TransportRouteAnalytics$ScheduleErrorReason("Mapping", 2, "mapping");
        Mapping = transportRouteAnalytics$ScheduleErrorReason3;
        TransportRouteAnalytics$ScheduleErrorReason[] transportRouteAnalytics$ScheduleErrorReasonArr = {transportRouteAnalytics$ScheduleErrorReason, transportRouteAnalytics$ScheduleErrorReason2, transportRouteAnalytics$ScheduleErrorReason3};
        $VALUES = transportRouteAnalytics$ScheduleErrorReasonArr;
        $ENTRIES = a.a(transportRouteAnalytics$ScheduleErrorReasonArr);
    }

    public TransportRouteAnalytics$ScheduleErrorReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$ScheduleErrorReason valueOf(String str) {
        return (TransportRouteAnalytics$ScheduleErrorReason) Enum.valueOf(TransportRouteAnalytics$ScheduleErrorReason.class, str);
    }

    public static TransportRouteAnalytics$ScheduleErrorReason[] values() {
        return (TransportRouteAnalytics$ScheduleErrorReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
