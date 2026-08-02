package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportAnalytics$TransportCardPaymentFlowSourceV2", "", "Lru/yandex/taxi/masstransit/analytic/TransportAnalytics$TransportCardPaymentFlowSourceV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Main", "Vertical", "Hub", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportAnalytics$TransportCardPaymentFlowSourceV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportAnalytics$TransportCardPaymentFlowSourceV2[] $VALUES;
    public static final TransportAnalytics$TransportCardPaymentFlowSourceV2 Hub;
    public static final TransportAnalytics$TransportCardPaymentFlowSourceV2 Main;
    public static final TransportAnalytics$TransportCardPaymentFlowSourceV2 Vertical;
    private final String eventValue;

    static {
        TransportAnalytics$TransportCardPaymentFlowSourceV2 transportAnalytics$TransportCardPaymentFlowSourceV2 = new TransportAnalytics$TransportCardPaymentFlowSourceV2("Main", 0, "main");
        Main = transportAnalytics$TransportCardPaymentFlowSourceV2;
        TransportAnalytics$TransportCardPaymentFlowSourceV2 transportAnalytics$TransportCardPaymentFlowSourceV22 = new TransportAnalytics$TransportCardPaymentFlowSourceV2("Vertical", 1, "vertical");
        Vertical = transportAnalytics$TransportCardPaymentFlowSourceV22;
        TransportAnalytics$TransportCardPaymentFlowSourceV2 transportAnalytics$TransportCardPaymentFlowSourceV23 = new TransportAnalytics$TransportCardPaymentFlowSourceV2("Hub", 2, "hub");
        Hub = transportAnalytics$TransportCardPaymentFlowSourceV23;
        TransportAnalytics$TransportCardPaymentFlowSourceV2[] transportAnalytics$TransportCardPaymentFlowSourceV2Arr = {transportAnalytics$TransportCardPaymentFlowSourceV2, transportAnalytics$TransportCardPaymentFlowSourceV22, transportAnalytics$TransportCardPaymentFlowSourceV23};
        $VALUES = transportAnalytics$TransportCardPaymentFlowSourceV2Arr;
        $ENTRIES = a.a(transportAnalytics$TransportCardPaymentFlowSourceV2Arr);
    }

    public TransportAnalytics$TransportCardPaymentFlowSourceV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportAnalytics$TransportCardPaymentFlowSourceV2 valueOf(String str) {
        return (TransportAnalytics$TransportCardPaymentFlowSourceV2) Enum.valueOf(TransportAnalytics$TransportCardPaymentFlowSourceV2.class, str);
    }

    public static TransportAnalytics$TransportCardPaymentFlowSourceV2[] values() {
        return (TransportAnalytics$TransportCardPaymentFlowSourceV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
