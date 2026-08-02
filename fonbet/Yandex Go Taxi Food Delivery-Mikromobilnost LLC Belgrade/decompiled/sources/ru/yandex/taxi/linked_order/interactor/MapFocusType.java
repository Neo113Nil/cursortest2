package ru.yandex.taxi.linked_order.interactor;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/linked_order/interactor/MapFocusType;", "", JCP.RAW_PREFIX, "DESTINATION", "ALL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class MapFocusType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapFocusType[] $VALUES;
    public static final MapFocusType ALL;
    public static final MapFocusType DESTINATION;
    public static final MapFocusType NONE;

    static {
        MapFocusType mapFocusType = new MapFocusType(JCP.RAW_PREFIX, 0);
        NONE = mapFocusType;
        MapFocusType mapFocusType2 = new MapFocusType("DESTINATION", 1);
        DESTINATION = mapFocusType2;
        MapFocusType mapFocusType3 = new MapFocusType("ALL", 2);
        ALL = mapFocusType3;
        MapFocusType[] mapFocusTypeArr = {mapFocusType, mapFocusType2, mapFocusType3};
        $VALUES = mapFocusTypeArr;
        $ENTRIES = kotlin.enums.a.a(mapFocusTypeArr);
    }

    public static MapFocusType valueOf(String str) {
        return (MapFocusType) Enum.valueOf(MapFocusType.class, str);
    }

    public static MapFocusType[] values() {
        return (MapFocusType[]) $VALUES.clone();
    }
}
