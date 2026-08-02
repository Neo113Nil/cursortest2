package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardAppearanceState", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardAppearanceState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Expanded", "Collapsed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$DetailCardAppearanceState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$DetailCardAppearanceState[] $VALUES;
    public static final TransportRouteAnalytics$DetailCardAppearanceState Collapsed;
    public static final TransportRouteAnalytics$DetailCardAppearanceState Expanded;
    private final String eventValue;

    static {
        TransportRouteAnalytics$DetailCardAppearanceState transportRouteAnalytics$DetailCardAppearanceState = new TransportRouteAnalytics$DetailCardAppearanceState("Expanded", 0, "expanded");
        Expanded = transportRouteAnalytics$DetailCardAppearanceState;
        TransportRouteAnalytics$DetailCardAppearanceState transportRouteAnalytics$DetailCardAppearanceState2 = new TransportRouteAnalytics$DetailCardAppearanceState("Collapsed", 1, "collapsed");
        Collapsed = transportRouteAnalytics$DetailCardAppearanceState2;
        TransportRouteAnalytics$DetailCardAppearanceState[] transportRouteAnalytics$DetailCardAppearanceStateArr = {transportRouteAnalytics$DetailCardAppearanceState, transportRouteAnalytics$DetailCardAppearanceState2};
        $VALUES = transportRouteAnalytics$DetailCardAppearanceStateArr;
        $ENTRIES = a.a(transportRouteAnalytics$DetailCardAppearanceStateArr);
    }

    public TransportRouteAnalytics$DetailCardAppearanceState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$DetailCardAppearanceState valueOf(String str) {
        return (TransportRouteAnalytics$DetailCardAppearanceState) Enum.valueOf(TransportRouteAnalytics$DetailCardAppearanceState.class, str);
    }

    public static TransportRouteAnalytics$DetailCardAppearanceState[] values() {
        return (TransportRouteAnalytics$DetailCardAppearanceState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
