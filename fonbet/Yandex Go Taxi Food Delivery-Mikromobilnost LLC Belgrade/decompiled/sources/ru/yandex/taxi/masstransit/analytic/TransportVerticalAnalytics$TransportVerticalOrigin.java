package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportVerticalOrigin", "", "Lru/yandex/taxi/masstransit/analytic/TransportVerticalAnalytics$TransportVerticalOrigin;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SuperAppDiscoveryMap", "VerticalTap", "RouteInput", "Deeplink", "Hub", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportVerticalAnalytics$TransportVerticalOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportVerticalAnalytics$TransportVerticalOrigin[] $VALUES;
    public static final TransportVerticalAnalytics$TransportVerticalOrigin Deeplink;
    public static final TransportVerticalAnalytics$TransportVerticalOrigin Hub;
    public static final TransportVerticalAnalytics$TransportVerticalOrigin RouteInput;
    public static final TransportVerticalAnalytics$TransportVerticalOrigin SuperAppDiscoveryMap;
    public static final TransportVerticalAnalytics$TransportVerticalOrigin VerticalTap;
    private final String eventValue;

    static {
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin = new TransportVerticalAnalytics$TransportVerticalOrigin("SuperAppDiscoveryMap", 0, "superapp_discovery_map");
        SuperAppDiscoveryMap = transportVerticalAnalytics$TransportVerticalOrigin;
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin2 = new TransportVerticalAnalytics$TransportVerticalOrigin("VerticalTap", 1, "vertical_tap");
        VerticalTap = transportVerticalAnalytics$TransportVerticalOrigin2;
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin3 = new TransportVerticalAnalytics$TransportVerticalOrigin("RouteInput", 2, "route_input");
        RouteInput = transportVerticalAnalytics$TransportVerticalOrigin3;
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin4 = new TransportVerticalAnalytics$TransportVerticalOrigin("Deeplink", 3, Constants.DEEPLINK);
        Deeplink = transportVerticalAnalytics$TransportVerticalOrigin4;
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin5 = new TransportVerticalAnalytics$TransportVerticalOrigin("Hub", 4, "hub");
        Hub = transportVerticalAnalytics$TransportVerticalOrigin5;
        TransportVerticalAnalytics$TransportVerticalOrigin[] transportVerticalAnalytics$TransportVerticalOriginArr = {transportVerticalAnalytics$TransportVerticalOrigin, transportVerticalAnalytics$TransportVerticalOrigin2, transportVerticalAnalytics$TransportVerticalOrigin3, transportVerticalAnalytics$TransportVerticalOrigin4, transportVerticalAnalytics$TransportVerticalOrigin5};
        $VALUES = transportVerticalAnalytics$TransportVerticalOriginArr;
        $ENTRIES = a.a(transportVerticalAnalytics$TransportVerticalOriginArr);
    }

    public TransportVerticalAnalytics$TransportVerticalOrigin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportVerticalAnalytics$TransportVerticalOrigin valueOf(String str) {
        return (TransportVerticalAnalytics$TransportVerticalOrigin) Enum.valueOf(TransportVerticalAnalytics$TransportVerticalOrigin.class, str);
    }

    public static TransportVerticalAnalytics$TransportVerticalOrigin[] values() {
        return (TransportVerticalAnalytics$TransportVerticalOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
