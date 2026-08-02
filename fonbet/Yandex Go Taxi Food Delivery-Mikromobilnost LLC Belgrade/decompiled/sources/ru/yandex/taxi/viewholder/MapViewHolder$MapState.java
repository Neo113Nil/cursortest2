package ru.yandex.taxi.viewholder;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/viewholder/MapViewHolder$MapState", "", "Lru/yandex/taxi/viewholder/MapViewHolder$MapState;", "EXPANDED", "COLLAPSED", "map_fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MapViewHolder$MapState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapViewHolder$MapState[] $VALUES;
    public static final MapViewHolder$MapState COLLAPSED;
    public static final MapViewHolder$MapState EXPANDED;

    static {
        MapViewHolder$MapState mapViewHolder$MapState = new MapViewHolder$MapState("EXPANDED", 0);
        EXPANDED = mapViewHolder$MapState;
        MapViewHolder$MapState mapViewHolder$MapState2 = new MapViewHolder$MapState("COLLAPSED", 1);
        COLLAPSED = mapViewHolder$MapState2;
        MapViewHolder$MapState[] mapViewHolder$MapStateArr = {mapViewHolder$MapState, mapViewHolder$MapState2};
        $VALUES = mapViewHolder$MapStateArr;
        $ENTRIES = kotlin.enums.a.a(mapViewHolder$MapStateArr);
    }

    public static MapViewHolder$MapState valueOf(String str) {
        return (MapViewHolder$MapState) Enum.valueOf(MapViewHolder$MapState.class, str);
    }

    public static MapViewHolder$MapState[] values() {
        return (MapViewHolder$MapState[]) $VALUES.clone();
    }
}
