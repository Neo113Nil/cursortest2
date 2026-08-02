package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t5z;
import defpackage.yo00;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/MapObjectType;", "", "Companion", "yo00", "PICKUP_POINT", "STOP", "USER_PLACE", "EDA", "DRIVE", "RESTAURANTS", "PROMO", "SCOOTER", "SCOOTERS_PARKING", "SCOOTERS_AREA_LABEL", "CHARGER", "CONTACT", "SHUTTLE_ROUTE", "INTERCITY_DESTINATION", "GROUP", "CITY", "CITY_GROUP", "ADVERT", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapObjectType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapObjectType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final MapObjectType ADVERT;
    public static final MapObjectType CHARGER;
    public static final MapObjectType CITY;
    public static final MapObjectType CITY_GROUP;
    public static final MapObjectType CONTACT;
    public static final yo00 Companion;
    public static final MapObjectType DRIVE;
    public static final MapObjectType EDA;
    public static final MapObjectType GROUP;
    public static final MapObjectType INTERCITY_DESTINATION;
    public static final MapObjectType PICKUP_POINT;
    public static final MapObjectType PROMO;
    public static final MapObjectType RESTAURANTS;
    public static final MapObjectType SCOOTER;
    public static final MapObjectType SCOOTERS_AREA_LABEL;
    public static final MapObjectType SCOOTERS_PARKING;
    public static final MapObjectType SHUTTLE_ROUTE;
    public static final MapObjectType STOP;
    public static final MapObjectType UNKNOWN;
    public static final MapObjectType USER_PLACE;

    static {
        MapObjectType mapObjectType = new MapObjectType("PICKUP_POINT", 0);
        PICKUP_POINT = mapObjectType;
        MapObjectType mapObjectType2 = new MapObjectType("STOP", 1);
        STOP = mapObjectType2;
        MapObjectType mapObjectType3 = new MapObjectType("USER_PLACE", 2);
        USER_PLACE = mapObjectType3;
        MapObjectType mapObjectType4 = new MapObjectType("EDA", 3);
        EDA = mapObjectType4;
        MapObjectType mapObjectType5 = new MapObjectType("DRIVE", 4);
        DRIVE = mapObjectType5;
        MapObjectType mapObjectType6 = new MapObjectType("RESTAURANTS", 5);
        RESTAURANTS = mapObjectType6;
        MapObjectType mapObjectType7 = new MapObjectType("PROMO", 6);
        PROMO = mapObjectType7;
        MapObjectType mapObjectType8 = new MapObjectType("SCOOTER", 7);
        SCOOTER = mapObjectType8;
        MapObjectType mapObjectType9 = new MapObjectType("SCOOTERS_PARKING", 8);
        SCOOTERS_PARKING = mapObjectType9;
        MapObjectType mapObjectType10 = new MapObjectType("SCOOTERS_AREA_LABEL", 9);
        SCOOTERS_AREA_LABEL = mapObjectType10;
        MapObjectType mapObjectType11 = new MapObjectType("CHARGER", 10);
        CHARGER = mapObjectType11;
        MapObjectType mapObjectType12 = new MapObjectType("CONTACT", 11);
        CONTACT = mapObjectType12;
        MapObjectType mapObjectType13 = new MapObjectType("SHUTTLE_ROUTE", 12);
        SHUTTLE_ROUTE = mapObjectType13;
        MapObjectType mapObjectType14 = new MapObjectType("INTERCITY_DESTINATION", 13);
        INTERCITY_DESTINATION = mapObjectType14;
        MapObjectType mapObjectType15 = new MapObjectType("GROUP", 14);
        GROUP = mapObjectType15;
        MapObjectType mapObjectType16 = new MapObjectType("CITY", 15);
        CITY = mapObjectType16;
        MapObjectType mapObjectType17 = new MapObjectType("CITY_GROUP", 16);
        CITY_GROUP = mapObjectType17;
        MapObjectType mapObjectType18 = new MapObjectType("ADVERT", 17);
        ADVERT = mapObjectType18;
        MapObjectType mapObjectType19 = new MapObjectType("UNKNOWN", 18);
        UNKNOWN = mapObjectType19;
        MapObjectType[] mapObjectTypeArr = {mapObjectType, mapObjectType2, mapObjectType3, mapObjectType4, mapObjectType5, mapObjectType6, mapObjectType7, mapObjectType8, mapObjectType9, mapObjectType10, mapObjectType11, mapObjectType12, mapObjectType13, mapObjectType14, mapObjectType15, mapObjectType16, mapObjectType17, mapObjectType18, mapObjectType19};
        $VALUES = mapObjectTypeArr;
        $ENTRIES = kotlin.enums.a.a(mapObjectTypeArr);
        Companion = new yo00();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(17));
    }

    public static MapObjectType valueOf(String str) {
        return (MapObjectType) Enum.valueOf(MapObjectType.class, str);
    }

    public static MapObjectType[] values() {
        return (MapObjectType[]) $VALUES.clone();
    }
}
