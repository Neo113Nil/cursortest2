package ru.yandex.taxi.map_common.map.process;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/map_common/map/process/MapComputationsProcessor$ExecuteOn", "", "Lru/yandex/taxi/map_common/map/process/MapComputationsProcessor$ExecuteOn;", "MAIN", "WORKER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapComputationsProcessor$ExecuteOn {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapComputationsProcessor$ExecuteOn[] $VALUES;
    public static final MapComputationsProcessor$ExecuteOn MAIN;
    public static final MapComputationsProcessor$ExecuteOn WORKER;

    static {
        MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn = new MapComputationsProcessor$ExecuteOn("MAIN", 0);
        MAIN = mapComputationsProcessor$ExecuteOn;
        MapComputationsProcessor$ExecuteOn mapComputationsProcessor$ExecuteOn2 = new MapComputationsProcessor$ExecuteOn("WORKER", 1);
        WORKER = mapComputationsProcessor$ExecuteOn2;
        MapComputationsProcessor$ExecuteOn[] mapComputationsProcessor$ExecuteOnArr = {mapComputationsProcessor$ExecuteOn, mapComputationsProcessor$ExecuteOn2};
        $VALUES = mapComputationsProcessor$ExecuteOnArr;
        $ENTRIES = kotlin.enums.a.a(mapComputationsProcessor$ExecuteOnArr);
    }

    public static MapComputationsProcessor$ExecuteOn valueOf(String str) {
        return (MapComputationsProcessor$ExecuteOn) Enum.valueOf(MapComputationsProcessor$ExecuteOn.class, str);
    }

    public static MapComputationsProcessor$ExecuteOn[] values() {
        return (MapComputationsProcessor$ExecuteOn[]) $VALUES.clone();
    }
}
