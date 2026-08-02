package ru.yandex.taxi.maas.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$TransportTypeV2", "", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseStationCardAnalytics$TransportTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ToStation", "FromStation", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiTransportChooseStationCardAnalytics$TransportTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTransportChooseStationCardAnalytics$TransportTypeV2[] $VALUES;
    public static final MultiTransportChooseStationCardAnalytics$TransportTypeV2 FromStation;
    public static final MultiTransportChooseStationCardAnalytics$TransportTypeV2 ToStation;
    private final String eventValue;

    static {
        MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV2 = new MultiTransportChooseStationCardAnalytics$TransportTypeV2("ToStation", 0, "to_station");
        ToStation = multiTransportChooseStationCardAnalytics$TransportTypeV2;
        MultiTransportChooseStationCardAnalytics$TransportTypeV2 multiTransportChooseStationCardAnalytics$TransportTypeV22 = new MultiTransportChooseStationCardAnalytics$TransportTypeV2("FromStation", 1, "from_station");
        FromStation = multiTransportChooseStationCardAnalytics$TransportTypeV22;
        MultiTransportChooseStationCardAnalytics$TransportTypeV2[] multiTransportChooseStationCardAnalytics$TransportTypeV2Arr = {multiTransportChooseStationCardAnalytics$TransportTypeV2, multiTransportChooseStationCardAnalytics$TransportTypeV22};
        $VALUES = multiTransportChooseStationCardAnalytics$TransportTypeV2Arr;
        $ENTRIES = a.a(multiTransportChooseStationCardAnalytics$TransportTypeV2Arr);
    }

    public MultiTransportChooseStationCardAnalytics$TransportTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultiTransportChooseStationCardAnalytics$TransportTypeV2 valueOf(String str) {
        return (MultiTransportChooseStationCardAnalytics$TransportTypeV2) Enum.valueOf(MultiTransportChooseStationCardAnalytics$TransportTypeV2.class, str);
    }

    public static MultiTransportChooseStationCardAnalytics$TransportTypeV2[] values() {
        return (MultiTransportChooseStationCardAnalytics$TransportTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
