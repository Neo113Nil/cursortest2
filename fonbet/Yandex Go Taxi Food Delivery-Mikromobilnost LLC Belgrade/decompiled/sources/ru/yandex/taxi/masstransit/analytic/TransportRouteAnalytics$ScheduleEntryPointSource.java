package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleEntryPointSource", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$ScheduleEntryPointSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "StationSearch", "DetailCard", "Deeplink", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$ScheduleEntryPointSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$ScheduleEntryPointSource[] $VALUES;
    public static final TransportRouteAnalytics$ScheduleEntryPointSource Deeplink;
    public static final TransportRouteAnalytics$ScheduleEntryPointSource DetailCard;
    public static final TransportRouteAnalytics$ScheduleEntryPointSource StationSearch;
    private final String eventValue;

    static {
        TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource = new TransportRouteAnalytics$ScheduleEntryPointSource("StationSearch", 0, "station_search");
        StationSearch = transportRouteAnalytics$ScheduleEntryPointSource;
        TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource2 = new TransportRouteAnalytics$ScheduleEntryPointSource("DetailCard", 1, "detail_card");
        DetailCard = transportRouteAnalytics$ScheduleEntryPointSource2;
        TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource3 = new TransportRouteAnalytics$ScheduleEntryPointSource("Deeplink", 2, Constants.DEEPLINK);
        Deeplink = transportRouteAnalytics$ScheduleEntryPointSource3;
        TransportRouteAnalytics$ScheduleEntryPointSource[] transportRouteAnalytics$ScheduleEntryPointSourceArr = {transportRouteAnalytics$ScheduleEntryPointSource, transportRouteAnalytics$ScheduleEntryPointSource2, transportRouteAnalytics$ScheduleEntryPointSource3};
        $VALUES = transportRouteAnalytics$ScheduleEntryPointSourceArr;
        $ENTRIES = a.a(transportRouteAnalytics$ScheduleEntryPointSourceArr);
    }

    public TransportRouteAnalytics$ScheduleEntryPointSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$ScheduleEntryPointSource valueOf(String str) {
        return (TransportRouteAnalytics$ScheduleEntryPointSource) Enum.valueOf(TransportRouteAnalytics$ScheduleEntryPointSource.class, str);
    }

    public static TransportRouteAnalytics$ScheduleEntryPointSource[] values() {
        return (TransportRouteAnalytics$ScheduleEntryPointSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
