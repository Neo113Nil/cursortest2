package ru.yandex.taxi.map_common.map.intersection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/map_common/map/intersection/MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType", "", "Lru/yandex/taxi/map_common/map/intersection/MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType;", "WHO", "WITH_WHOM", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType[] $VALUES;
    public static final MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType WHO;
    public static final MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType WITH_WHOM;

    static {
        MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType = new MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType("WHO", 0);
        WHO = mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType;
        MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2 = new MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType("WITH_WHOM", 1);
        WITH_WHOM = mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2;
        MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType[] mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionTypeArr = {mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType, mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType2};
        $VALUES = mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionTypeArr;
        $ENTRIES = kotlin.enums.a.a(mapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionTypeArr);
    }

    public static MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType valueOf(String str) {
        return (MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType) Enum.valueOf(MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType.class, str);
    }

    public static MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType[] values() {
        return (MapObjectsIntersectionCheckerImpl$PendingIntersection$ParticipantIntersectionType[]) $VALUES.clone();
    }
}
