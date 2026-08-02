package ru.yandex.taxi.preorder.blockedzones;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"ru/yandex/taxi/preorder/blockedzones/RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2", "", "Lru/yandex/taxi/preorder/blockedzones/RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Starting", "Destination", "Favorite", "Mid", "Eats", "Chargers", "Scooters", "CitySuggest", "Discovery", "SuperappDiscoveryMap", "NavigatorA", "NavigatorB", "TransportA", "TransportB", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2[] $VALUES;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Chargers;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 CitySuggest;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Destination;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Discovery;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Eats;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Favorite;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Mid;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 NavigatorA;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 NavigatorB;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Scooters;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 Starting;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 SuperappDiscoveryMap;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 TransportA;
    public static final RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 TransportB;
    private final String eventValue;

    static {
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Starting", 0, "starting");
        Starting = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV22 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Destination", 1, "destination");
        Destination = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV22;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV23 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Favorite", 2, "favorite");
        Favorite = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV23;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV24 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Mid", 3, "mid");
        Mid = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV24;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV25 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Eats", 4, "eats");
        Eats = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV25;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV26 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Chargers", 5, "chargers");
        Chargers = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV26;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV27 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Scooters", 6, "scooters");
        Scooters = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV27;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV28 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("CitySuggest", 7, "city_suggest");
        CitySuggest = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV28;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV29 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("Discovery", 8, "discovery");
        Discovery = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV29;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV210 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("SuperappDiscoveryMap", 9, "superapp_discovery_map");
        SuperappDiscoveryMap = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV210;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV211 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("NavigatorA", 10, "navigator_a");
        NavigatorA = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV211;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV212 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("NavigatorB", 11, "navigator_b");
        NavigatorB = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV212;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV213 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("TransportA", 12, "transport_a");
        TransportA = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV213;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 restrictedAreasShownAnalytics$RestrictedAreaPointTypeV214 = new RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2("TransportB", 13, "transport_b");
        TransportB = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV214;
        RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2[] restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2Arr = {restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV22, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV23, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV24, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV25, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV26, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV27, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV28, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV29, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV210, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV211, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV212, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV213, restrictedAreasShownAnalytics$RestrictedAreaPointTypeV214};
        $VALUES = restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2Arr;
        $ENTRIES = a.a(restrictedAreasShownAnalytics$RestrictedAreaPointTypeV2Arr);
    }

    public RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2 valueOf(String str) {
        return (RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2) Enum.valueOf(RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2.class, str);
    }

    public static RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2[] values() {
        return (RestrictedAreasShownAnalytics$RestrictedAreaPointTypeV2[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
