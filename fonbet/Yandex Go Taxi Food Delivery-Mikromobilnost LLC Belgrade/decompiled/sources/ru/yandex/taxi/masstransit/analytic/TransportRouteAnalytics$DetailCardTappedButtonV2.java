package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardTappedButtonV2", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardTappedButtonV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ScheduleTickets", "MyTickets", "Variants", "TransportStopsExpand", "TransportStopsCollapse", "ShareRoute", "ViewOnMap", "TransportBubble", "FooterBuyTicket", "FooterMyTickets", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$DetailCardTappedButtonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$DetailCardTappedButtonV2[] $VALUES;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 FooterBuyTicket;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 FooterMyTickets;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 MyTickets;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 ScheduleTickets;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 ShareRoute;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 TransportBubble;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 TransportStopsCollapse;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 TransportStopsExpand;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 Variants;
    public static final TransportRouteAnalytics$DetailCardTappedButtonV2 ViewOnMap;
    private final String eventValue;

    static {
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = new TransportRouteAnalytics$DetailCardTappedButtonV2("ScheduleTickets", 0, "schedule_tickets");
        ScheduleTickets = transportRouteAnalytics$DetailCardTappedButtonV2;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV22 = new TransportRouteAnalytics$DetailCardTappedButtonV2("MyTickets", 1, "my_tickets");
        MyTickets = transportRouteAnalytics$DetailCardTappedButtonV22;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV23 = new TransportRouteAnalytics$DetailCardTappedButtonV2("Variants", 2, "variants");
        Variants = transportRouteAnalytics$DetailCardTappedButtonV23;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV24 = new TransportRouteAnalytics$DetailCardTappedButtonV2("TransportStopsExpand", 3, "transport_stops_expand");
        TransportStopsExpand = transportRouteAnalytics$DetailCardTappedButtonV24;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV25 = new TransportRouteAnalytics$DetailCardTappedButtonV2("TransportStopsCollapse", 4, "transport_stops_collapse");
        TransportStopsCollapse = transportRouteAnalytics$DetailCardTappedButtonV25;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV26 = new TransportRouteAnalytics$DetailCardTappedButtonV2("ShareRoute", 5, "share_route");
        ShareRoute = transportRouteAnalytics$DetailCardTappedButtonV26;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV27 = new TransportRouteAnalytics$DetailCardTappedButtonV2("ViewOnMap", 6, "view_on_map");
        ViewOnMap = transportRouteAnalytics$DetailCardTappedButtonV27;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV28 = new TransportRouteAnalytics$DetailCardTappedButtonV2("TransportBubble", 7, "transport_bubble");
        TransportBubble = transportRouteAnalytics$DetailCardTappedButtonV28;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV29 = new TransportRouteAnalytics$DetailCardTappedButtonV2("FooterBuyTicket", 8, "footer_buy_ticket");
        FooterBuyTicket = transportRouteAnalytics$DetailCardTappedButtonV29;
        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV210 = new TransportRouteAnalytics$DetailCardTappedButtonV2("FooterMyTickets", 9, "footer_my_tickets");
        FooterMyTickets = transportRouteAnalytics$DetailCardTappedButtonV210;
        TransportRouteAnalytics$DetailCardTappedButtonV2[] transportRouteAnalytics$DetailCardTappedButtonV2Arr = {transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardTappedButtonV22, transportRouteAnalytics$DetailCardTappedButtonV23, transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$DetailCardTappedButtonV25, transportRouteAnalytics$DetailCardTappedButtonV26, transportRouteAnalytics$DetailCardTappedButtonV27, transportRouteAnalytics$DetailCardTappedButtonV28, transportRouteAnalytics$DetailCardTappedButtonV29, transportRouteAnalytics$DetailCardTappedButtonV210};
        $VALUES = transportRouteAnalytics$DetailCardTappedButtonV2Arr;
        $ENTRIES = a.a(transportRouteAnalytics$DetailCardTappedButtonV2Arr);
    }

    public TransportRouteAnalytics$DetailCardTappedButtonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$DetailCardTappedButtonV2 valueOf(String str) {
        return (TransportRouteAnalytics$DetailCardTappedButtonV2) Enum.valueOf(TransportRouteAnalytics$DetailCardTappedButtonV2.class, str);
    }

    public static TransportRouteAnalytics$DetailCardTappedButtonV2[] values() {
        return (TransportRouteAnalytics$DetailCardTappedButtonV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
