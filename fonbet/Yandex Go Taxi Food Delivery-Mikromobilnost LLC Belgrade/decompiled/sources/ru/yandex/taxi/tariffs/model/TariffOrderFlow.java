package ru.yandex.taxi.tariffs.model;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ijx0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/tariffs/model/TariffOrderFlow;", "", "Companion", "ijx0", "DRIVE_FLOW", "TAXI_FLOW", "SHUTTLE_FLOW", "DELIVERY_FLOW", "COPTER_FLOW", "COPTER_CITY_TOUR_FLOW", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TariffOrderFlow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffOrderFlow[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final TariffOrderFlow COPTER_CITY_TOUR_FLOW;
    public static final TariffOrderFlow COPTER_FLOW;
    public static final ijx0 Companion;
    public static final TariffOrderFlow DELIVERY_FLOW;
    public static final TariffOrderFlow DRIVE_FLOW;
    public static final String ORDER_FLOW_COPTER_CITY_TOUR_KEY = "copter_city_tour";
    public static final String ORDER_FLOW_COPTER_KEY = "copter";
    public static final String ORDER_FLOW_DELIVERY_KEY = "delivery";
    public static final String ORDER_FLOW_DRIVE_KEY = "drive";
    public static final String ORDER_FLOW_SHUTTLE_KEY = "shuttle";
    public static final String ORDER_FLOW_TAXI_KEY = "taxi";
    public static final TariffOrderFlow SHUTTLE_FLOW;
    public static final TariffOrderFlow TAXI_FLOW;

    static {
        TariffOrderFlow tariffOrderFlow = new TariffOrderFlow("DRIVE_FLOW", 0);
        DRIVE_FLOW = tariffOrderFlow;
        TariffOrderFlow tariffOrderFlow2 = new TariffOrderFlow("TAXI_FLOW", 1);
        TAXI_FLOW = tariffOrderFlow2;
        TariffOrderFlow tariffOrderFlow3 = new TariffOrderFlow("SHUTTLE_FLOW", 2);
        SHUTTLE_FLOW = tariffOrderFlow3;
        TariffOrderFlow tariffOrderFlow4 = new TariffOrderFlow("DELIVERY_FLOW", 3);
        DELIVERY_FLOW = tariffOrderFlow4;
        TariffOrderFlow tariffOrderFlow5 = new TariffOrderFlow("COPTER_FLOW", 4);
        COPTER_FLOW = tariffOrderFlow5;
        TariffOrderFlow tariffOrderFlow6 = new TariffOrderFlow("COPTER_CITY_TOUR_FLOW", 5);
        COPTER_CITY_TOUR_FLOW = tariffOrderFlow6;
        TariffOrderFlow[] tariffOrderFlowArr = {tariffOrderFlow, tariffOrderFlow2, tariffOrderFlow3, tariffOrderFlow4, tariffOrderFlow5, tariffOrderFlow6};
        $VALUES = tariffOrderFlowArr;
        $ENTRIES = kotlin.enums.a.a(tariffOrderFlowArr);
        Companion = new ijx0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(0));
    }

    public static TariffOrderFlow valueOf(String str) {
        return (TariffOrderFlow) Enum.valueOf(TariffOrderFlow.class, str);
    }

    public static TariffOrderFlow[] values() {
        return (TariffOrderFlow[]) $VALUES.clone();
    }
}
