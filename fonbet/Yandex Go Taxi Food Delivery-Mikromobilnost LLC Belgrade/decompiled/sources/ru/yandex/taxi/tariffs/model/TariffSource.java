package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/tariffs/model/TariffSource;", "", "ZONE_INFO", "ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS", "ZONE_INFO_AND_FULL_ROUTE_STATS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TariffSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffSource[] $VALUES;
    public static final TariffSource ZONE_INFO;
    public static final TariffSource ZONE_INFO_AND_FULL_ROUTE_STATS;
    public static final TariffSource ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS;

    static {
        TariffSource tariffSource = new TariffSource("ZONE_INFO", 0);
        ZONE_INFO = tariffSource;
        TariffSource tariffSource2 = new TariffSource("ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS", 1);
        ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS = tariffSource2;
        TariffSource tariffSource3 = new TariffSource("ZONE_INFO_AND_FULL_ROUTE_STATS", 2);
        ZONE_INFO_AND_FULL_ROUTE_STATS = tariffSource3;
        TariffSource[] tariffSourceArr = {tariffSource, tariffSource2, tariffSource3};
        $VALUES = tariffSourceArr;
        $ENTRIES = kotlin.enums.a.a(tariffSourceArr);
    }

    public static TariffSource valueOf(String str) {
        return (TariffSource) Enum.valueOf(TariffSource.class, str);
    }

    public static TariffSource[] values() {
        return (TariffSource[]) $VALUES.clone();
    }
}
