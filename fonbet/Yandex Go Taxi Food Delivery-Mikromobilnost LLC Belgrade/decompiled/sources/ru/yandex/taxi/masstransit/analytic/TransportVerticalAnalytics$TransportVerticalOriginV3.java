package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportVerticalOriginV3", "", "Lru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportVerticalOriginV3;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SuperappDiscoveryMap", "VerticalTap", "RouteInput", "Deeplink", "StopModal", "Hub", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportVerticalAnalytics$TransportVerticalOriginV3 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportVerticalAnalytics$TransportVerticalOriginV3[] $VALUES;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 Deeplink;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 Hub;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 RouteInput;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 StopModal;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 SuperappDiscoveryMap;
    public static final TransportVerticalAnalytics$TransportVerticalOriginV3 VerticalTap;
    private final String eventValue;

    static {
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV3 = new TransportVerticalAnalytics$TransportVerticalOriginV3("SuperappDiscoveryMap", 0, "superapp_discovery_map");
        SuperappDiscoveryMap = transportVerticalAnalytics$TransportVerticalOriginV3;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV32 = new TransportVerticalAnalytics$TransportVerticalOriginV3("VerticalTap", 1, "vertical_tap");
        VerticalTap = transportVerticalAnalytics$TransportVerticalOriginV32;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV33 = new TransportVerticalAnalytics$TransportVerticalOriginV3("RouteInput", 2, "route_input");
        RouteInput = transportVerticalAnalytics$TransportVerticalOriginV33;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV34 = new TransportVerticalAnalytics$TransportVerticalOriginV3("Deeplink", 3, Constants.DEEPLINK);
        Deeplink = transportVerticalAnalytics$TransportVerticalOriginV34;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV35 = new TransportVerticalAnalytics$TransportVerticalOriginV3("StopModal", 4, "stop_modal");
        StopModal = transportVerticalAnalytics$TransportVerticalOriginV35;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV36 = new TransportVerticalAnalytics$TransportVerticalOriginV3("Hub", 5, "hub");
        Hub = transportVerticalAnalytics$TransportVerticalOriginV36;
        TransportVerticalAnalytics$TransportVerticalOriginV3[] transportVerticalAnalytics$TransportVerticalOriginV3Arr = {transportVerticalAnalytics$TransportVerticalOriginV3, transportVerticalAnalytics$TransportVerticalOriginV32, transportVerticalAnalytics$TransportVerticalOriginV33, transportVerticalAnalytics$TransportVerticalOriginV34, transportVerticalAnalytics$TransportVerticalOriginV35, transportVerticalAnalytics$TransportVerticalOriginV36};
        $VALUES = transportVerticalAnalytics$TransportVerticalOriginV3Arr;
        $ENTRIES = a.a(transportVerticalAnalytics$TransportVerticalOriginV3Arr);
    }

    public TransportVerticalAnalytics$TransportVerticalOriginV3(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportVerticalAnalytics$TransportVerticalOriginV3 valueOf(String str) {
        return (TransportVerticalAnalytics$TransportVerticalOriginV3) Enum.valueOf(TransportVerticalAnalytics$TransportVerticalOriginV3.class, str);
    }

    public static TransportVerticalAnalytics$TransportVerticalOriginV3[] values() {
        return (TransportVerticalAnalytics$TransportVerticalOriginV3[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
