package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardOrigin", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardOrigin;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Pull", "ButtonTap", "SelectorTap", "HandlerTap", "BackFromMapFlow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$DetailCardOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$DetailCardOrigin[] $VALUES;
    public static final TransportRouteAnalytics$DetailCardOrigin BackFromMapFlow;
    public static final TransportRouteAnalytics$DetailCardOrigin ButtonTap;
    public static final TransportRouteAnalytics$DetailCardOrigin HandlerTap;
    public static final TransportRouteAnalytics$DetailCardOrigin Pull;
    public static final TransportRouteAnalytics$DetailCardOrigin SelectorTap;
    private final String eventValue;

    static {
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin = new TransportRouteAnalytics$DetailCardOrigin("Pull", 0, "pull");
        Pull = transportRouteAnalytics$DetailCardOrigin;
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin2 = new TransportRouteAnalytics$DetailCardOrigin("ButtonTap", 1, "button_tap");
        ButtonTap = transportRouteAnalytics$DetailCardOrigin2;
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin3 = new TransportRouteAnalytics$DetailCardOrigin("SelectorTap", 2, "selector_tap");
        SelectorTap = transportRouteAnalytics$DetailCardOrigin3;
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin4 = new TransportRouteAnalytics$DetailCardOrigin("HandlerTap", 3, "handler_tap");
        HandlerTap = transportRouteAnalytics$DetailCardOrigin4;
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin5 = new TransportRouteAnalytics$DetailCardOrigin("BackFromMapFlow", 4, "back_from_map_flow");
        BackFromMapFlow = transportRouteAnalytics$DetailCardOrigin5;
        TransportRouteAnalytics$DetailCardOrigin[] transportRouteAnalytics$DetailCardOriginArr = {transportRouteAnalytics$DetailCardOrigin, transportRouteAnalytics$DetailCardOrigin2, transportRouteAnalytics$DetailCardOrigin3, transportRouteAnalytics$DetailCardOrigin4, transportRouteAnalytics$DetailCardOrigin5};
        $VALUES = transportRouteAnalytics$DetailCardOriginArr;
        $ENTRIES = a.a(transportRouteAnalytics$DetailCardOriginArr);
    }

    public TransportRouteAnalytics$DetailCardOrigin(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$DetailCardOrigin valueOf(String str) {
        return (TransportRouteAnalytics$DetailCardOrigin) Enum.valueOf(TransportRouteAnalytics$DetailCardOrigin.class, str);
    }

    public static TransportRouteAnalytics$DetailCardOrigin[] values() {
        return (TransportRouteAnalytics$DetailCardOrigin[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
