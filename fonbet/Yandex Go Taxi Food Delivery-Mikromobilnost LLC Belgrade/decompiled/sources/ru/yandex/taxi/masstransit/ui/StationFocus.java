package ru.yandex.taxi.masstransit.ui;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/ui/StationFocus;", "", "SOURCE", "DESTINATION", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StationFocus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StationFocus[] $VALUES;
    public static final StationFocus DESTINATION;
    public static final StationFocus NONE;
    public static final StationFocus SOURCE;

    static {
        StationFocus stationFocus = new StationFocus("SOURCE", 0);
        SOURCE = stationFocus;
        StationFocus stationFocus2 = new StationFocus("DESTINATION", 1);
        DESTINATION = stationFocus2;
        StationFocus stationFocus3 = new StationFocus(JCP.RAW_PREFIX, 2);
        NONE = stationFocus3;
        StationFocus[] stationFocusArr = {stationFocus, stationFocus2, stationFocus3};
        $VALUES = stationFocusArr;
        $ENTRIES = kotlin.enums.a.a(stationFocusArr);
    }

    public static StationFocus valueOf(String str) {
        return (StationFocus) Enum.valueOf(StationFocus.class, str);
    }

    public static StationFocus[] values() {
        return (StationFocus[]) $VALUES.clone();
    }
}
