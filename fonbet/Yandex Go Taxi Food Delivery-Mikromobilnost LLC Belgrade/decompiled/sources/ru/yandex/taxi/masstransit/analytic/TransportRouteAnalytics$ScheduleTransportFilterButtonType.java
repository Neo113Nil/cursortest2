package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleTransportFilterButtonType", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleTransportFilterButtonType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SelectItem", "Apply", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$ScheduleTransportFilterButtonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$ScheduleTransportFilterButtonType[] $VALUES;
    public static final TransportRouteAnalytics$ScheduleTransportFilterButtonType Apply;
    public static final TransportRouteAnalytics$ScheduleTransportFilterButtonType Back;
    public static final TransportRouteAnalytics$ScheduleTransportFilterButtonType SelectItem;
    private final String eventValue;

    static {
        TransportRouteAnalytics$ScheduleTransportFilterButtonType transportRouteAnalytics$ScheduleTransportFilterButtonType = new TransportRouteAnalytics$ScheduleTransportFilterButtonType("SelectItem", 0, "select_item");
        SelectItem = transportRouteAnalytics$ScheduleTransportFilterButtonType;
        TransportRouteAnalytics$ScheduleTransportFilterButtonType transportRouteAnalytics$ScheduleTransportFilterButtonType2 = new TransportRouteAnalytics$ScheduleTransportFilterButtonType("Apply", 1, "apply");
        Apply = transportRouteAnalytics$ScheduleTransportFilterButtonType2;
        TransportRouteAnalytics$ScheduleTransportFilterButtonType transportRouteAnalytics$ScheduleTransportFilterButtonType3 = new TransportRouteAnalytics$ScheduleTransportFilterButtonType("Back", 2, "back");
        Back = transportRouteAnalytics$ScheduleTransportFilterButtonType3;
        TransportRouteAnalytics$ScheduleTransportFilterButtonType[] transportRouteAnalytics$ScheduleTransportFilterButtonTypeArr = {transportRouteAnalytics$ScheduleTransportFilterButtonType, transportRouteAnalytics$ScheduleTransportFilterButtonType2, transportRouteAnalytics$ScheduleTransportFilterButtonType3};
        $VALUES = transportRouteAnalytics$ScheduleTransportFilterButtonTypeArr;
        $ENTRIES = a.a(transportRouteAnalytics$ScheduleTransportFilterButtonTypeArr);
    }

    public TransportRouteAnalytics$ScheduleTransportFilterButtonType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$ScheduleTransportFilterButtonType valueOf(String str) {
        return (TransportRouteAnalytics$ScheduleTransportFilterButtonType) Enum.valueOf(TransportRouteAnalytics$ScheduleTransportFilterButtonType.class, str);
    }

    public static TransportRouteAnalytics$ScheduleTransportFilterButtonType[] values() {
        return (TransportRouteAnalytics$ScheduleTransportFilterButtonType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
