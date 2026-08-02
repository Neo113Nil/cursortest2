package ru.yandex.taxi.masstransit.analytic;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$FlowOrigin", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$FlowOrigin;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Main", "DetailCard", "Promo", "Deeplink", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$FlowOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$FlowOrigin[] $VALUES;
    public static final TransportRouteAnalytics$FlowOrigin Deeplink;
    public static final TransportRouteAnalytics$FlowOrigin DetailCard;
    public static final TransportRouteAnalytics$FlowOrigin Main;
    public static final TransportRouteAnalytics$FlowOrigin Promo;
    private final String eventValue;

    static {
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = new TransportRouteAnalytics$FlowOrigin("Main", 0, "main");
        Main = transportRouteAnalytics$FlowOrigin;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin2 = new TransportRouteAnalytics$FlowOrigin("DetailCard", 1, "detail_card");
        DetailCard = transportRouteAnalytics$FlowOrigin2;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin3 = new TransportRouteAnalytics$FlowOrigin("Promo", 2, "promo");
        Promo = transportRouteAnalytics$FlowOrigin3;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin4 = new TransportRouteAnalytics$FlowOrigin("Deeplink", 3, Constants.DEEPLINK);
        Deeplink = transportRouteAnalytics$FlowOrigin4;
        TransportRouteAnalytics$FlowOrigin[] transportRouteAnalytics$FlowOriginArr = {transportRouteAnalytics$FlowOrigin, transportRouteAnalytics$FlowOrigin2, transportRouteAnalytics$FlowOrigin3, transportRouteAnalytics$FlowOrigin4};
        $VALUES = transportRouteAnalytics$FlowOriginArr;
        $ENTRIES = a.a(transportRouteAnalytics$FlowOriginArr);
    }

    public TransportRouteAnalytics$FlowOrigin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static TransportRouteAnalytics$FlowOrigin valueOf(String str) {
        return (TransportRouteAnalytics$FlowOrigin) Enum.valueOf(TransportRouteAnalytics$FlowOrigin.class, str);
    }

    public static TransportRouteAnalytics$FlowOrigin[] values() {
        return (TransportRouteAnalytics$FlowOrigin[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
