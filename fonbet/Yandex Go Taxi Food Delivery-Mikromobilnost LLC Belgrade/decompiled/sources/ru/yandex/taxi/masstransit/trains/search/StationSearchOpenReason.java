package ru.yandex.taxi.masstransit.trains.search;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/trains/search/StationSearchOpenReason;", "", "SOURCE", "DEST", "OTHER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StationSearchOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StationSearchOpenReason[] $VALUES;
    public static final StationSearchOpenReason DEST;
    public static final StationSearchOpenReason OTHER;
    public static final StationSearchOpenReason SOURCE;

    static {
        StationSearchOpenReason stationSearchOpenReason = new StationSearchOpenReason("SOURCE", 0);
        SOURCE = stationSearchOpenReason;
        StationSearchOpenReason stationSearchOpenReason2 = new StationSearchOpenReason("DEST", 1);
        DEST = stationSearchOpenReason2;
        StationSearchOpenReason stationSearchOpenReason3 = new StationSearchOpenReason("OTHER", 2);
        OTHER = stationSearchOpenReason3;
        StationSearchOpenReason[] stationSearchOpenReasonArr = {stationSearchOpenReason, stationSearchOpenReason2, stationSearchOpenReason3};
        $VALUES = stationSearchOpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(stationSearchOpenReasonArr);
    }

    public static StationSearchOpenReason valueOf(String str) {
        return (StationSearchOpenReason) Enum.valueOf(StationSearchOpenReason.class, str);
    }

    public static StationSearchOpenReason[] values() {
        return (StationSearchOpenReason[]) $VALUES.clone();
    }
}
