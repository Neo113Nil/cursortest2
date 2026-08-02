package ru.yandextaxi.flutter_yandex_mapkit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/ReferenceType;", "", "MAP_OBJECT", "GEO_OBJECT", "DRIVING_ROUTE", "ROUTE_VIEW", "BALLOON_VIEW", "TRANSPORT_ROUTE", "TRANSPORT_ROUTE_VIEW", "TRANSPORT_BALLOON_VIEW", "TOKEN_LISTENER", "MAP_OBJECTS_COLLECTION", "INDOOR_PLAN", "CLUSTERIZED_PLACEMARK_COLLECTION", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReferenceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReferenceType[] $VALUES;
    public static final ReferenceType BALLOON_VIEW;
    public static final ReferenceType CLUSTERIZED_PLACEMARK_COLLECTION;
    public static final ReferenceType DRIVING_ROUTE;
    public static final ReferenceType GEO_OBJECT;
    public static final ReferenceType INDOOR_PLAN;
    public static final ReferenceType MAP_OBJECT;
    public static final ReferenceType MAP_OBJECTS_COLLECTION;
    public static final ReferenceType ROUTE_VIEW;
    public static final ReferenceType TOKEN_LISTENER;
    public static final ReferenceType TRANSPORT_BALLOON_VIEW;
    public static final ReferenceType TRANSPORT_ROUTE;
    public static final ReferenceType TRANSPORT_ROUTE_VIEW;

    static {
        ReferenceType referenceType = new ReferenceType("MAP_OBJECT", 0);
        MAP_OBJECT = referenceType;
        ReferenceType referenceType2 = new ReferenceType("GEO_OBJECT", 1);
        GEO_OBJECT = referenceType2;
        ReferenceType referenceType3 = new ReferenceType("DRIVING_ROUTE", 2);
        DRIVING_ROUTE = referenceType3;
        ReferenceType referenceType4 = new ReferenceType("ROUTE_VIEW", 3);
        ROUTE_VIEW = referenceType4;
        ReferenceType referenceType5 = new ReferenceType("BALLOON_VIEW", 4);
        BALLOON_VIEW = referenceType5;
        ReferenceType referenceType6 = new ReferenceType("TRANSPORT_ROUTE", 5);
        TRANSPORT_ROUTE = referenceType6;
        ReferenceType referenceType7 = new ReferenceType("TRANSPORT_ROUTE_VIEW", 6);
        TRANSPORT_ROUTE_VIEW = referenceType7;
        ReferenceType referenceType8 = new ReferenceType("TRANSPORT_BALLOON_VIEW", 7);
        TRANSPORT_BALLOON_VIEW = referenceType8;
        ReferenceType referenceType9 = new ReferenceType("TOKEN_LISTENER", 8);
        TOKEN_LISTENER = referenceType9;
        ReferenceType referenceType10 = new ReferenceType("MAP_OBJECTS_COLLECTION", 9);
        MAP_OBJECTS_COLLECTION = referenceType10;
        ReferenceType referenceType11 = new ReferenceType("INDOOR_PLAN", 10);
        INDOOR_PLAN = referenceType11;
        ReferenceType referenceType12 = new ReferenceType("CLUSTERIZED_PLACEMARK_COLLECTION", 11);
        CLUSTERIZED_PLACEMARK_COLLECTION = referenceType12;
        ReferenceType[] referenceTypeArr = {referenceType, referenceType2, referenceType3, referenceType4, referenceType5, referenceType6, referenceType7, referenceType8, referenceType9, referenceType10, referenceType11, referenceType12};
        $VALUES = referenceTypeArr;
        $ENTRIES = a.a(referenceTypeArr);
    }

    public static ReferenceType valueOf(String str) {
        return (ReferenceType) Enum.valueOf(ReferenceType.class, str);
    }

    public static ReferenceType[] values() {
        return (ReferenceType[]) $VALUES.clone();
    }
}
