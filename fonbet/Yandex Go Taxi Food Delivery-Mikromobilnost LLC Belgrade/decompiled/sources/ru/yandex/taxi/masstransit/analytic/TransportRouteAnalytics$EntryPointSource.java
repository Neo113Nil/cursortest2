package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$EntryPointSource", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$EntryPointSource;", "", "eventValue", "Ljava/lang/String;", "getEventValue", "()Ljava/lang/String;", "Deeplink", "DetailCard", "RouteOptions", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransportRouteAnalytics$EntryPointSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$EntryPointSource[] $VALUES;
    public static final TransportRouteAnalytics$EntryPointSource Deeplink;
    public static final TransportRouteAnalytics$EntryPointSource DetailCard;
    public static final TransportRouteAnalytics$EntryPointSource RouteOptions;
    private final String eventValue;

    static {
        TransportRouteAnalytics$EntryPointSource transportRouteAnalytics$EntryPointSource = new TransportRouteAnalytics$EntryPointSource("Deeplink", 0, Constants.DEEPLINK);
        Deeplink = transportRouteAnalytics$EntryPointSource;
        TransportRouteAnalytics$EntryPointSource transportRouteAnalytics$EntryPointSource2 = new TransportRouteAnalytics$EntryPointSource("DetailCard", 1, "detail_card");
        DetailCard = transportRouteAnalytics$EntryPointSource2;
        TransportRouteAnalytics$EntryPointSource transportRouteAnalytics$EntryPointSource3 = new TransportRouteAnalytics$EntryPointSource("RouteOptions", 2, "route_options");
        RouteOptions = transportRouteAnalytics$EntryPointSource3;
        TransportRouteAnalytics$EntryPointSource[] transportRouteAnalytics$EntryPointSourceArr = {transportRouteAnalytics$EntryPointSource, transportRouteAnalytics$EntryPointSource2, transportRouteAnalytics$EntryPointSource3};
        $VALUES = transportRouteAnalytics$EntryPointSourceArr;
        $ENTRIES = a.a(transportRouteAnalytics$EntryPointSourceArr);
    }

    public TransportRouteAnalytics$EntryPointSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$EntryPointSource valueOf(String str) {
        return (TransportRouteAnalytics$EntryPointSource) Enum.valueOf(TransportRouteAnalytics$EntryPointSource.class, str);
    }

    public static TransportRouteAnalytics$EntryPointSource[] values() {
        return (TransportRouteAnalytics$EntryPointSource[]) $VALUES.clone();
    }
}
