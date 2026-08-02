package ru.yandex.taxi.masstransit.datasource.routing;

import defpackage.gw00;
import defpackage.ij40;
import defpackage.k4o;
import defpackage.tcc;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lru/yandex/taxi/masstransit/datasource/routing/MtTransportType;", "", "", "mapkitType", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ij40", "METROBUS", "MINIBUS", "DOLMUS", "TROLLEYBUS", "TRAMWAY", "RAPID_TRAM", "DUBAI_TRAM", "UNDERGROUND", "FUNICULAR", "CABLE", "AERO", "HISTORIC_TRAM", "SUBURBAN", "SUBURBAN_EXPRESS", "MCD", "AEROEXPRESS", "AEROEXPRESS_BUS", "FERRY", "WATER", "RAILWAY", "UNKNOWN", "BUS", "SBAHN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtTransportType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTransportType[] $VALUES;
    public static final MtTransportType AERO;
    public static final MtTransportType AEROEXPRESS;
    public static final MtTransportType AEROEXPRESS_BUS;
    public static final MtTransportType BUS;
    public static final MtTransportType CABLE;
    public static final ij40 Companion;
    public static final MtTransportType DOLMUS;
    public static final MtTransportType DUBAI_TRAM;
    public static final MtTransportType FERRY;
    public static final MtTransportType FUNICULAR;
    public static final MtTransportType HISTORIC_TRAM;
    public static final MtTransportType MCD;
    public static final MtTransportType METROBUS;
    public static final MtTransportType MINIBUS;
    public static final MtTransportType RAILWAY;
    public static final MtTransportType RAPID_TRAM;
    public static final MtTransportType SBAHN;
    public static final MtTransportType SUBURBAN;
    public static final MtTransportType SUBURBAN_EXPRESS;
    public static final MtTransportType TRAMWAY;
    public static final MtTransportType TROLLEYBUS;
    public static final MtTransportType UNDERGROUND;
    public static final MtTransportType UNKNOWN;
    public static final MtTransportType WATER;
    private static final Map<String, MtTransportType> map;
    private final String mapkitType;

    static {
        MtTransportType mtTransportType = new MtTransportType("METROBUS", 0, "metrobus");
        METROBUS = mtTransportType;
        MtTransportType mtTransportType2 = new MtTransportType("MINIBUS", 1, "minibus");
        MINIBUS = mtTransportType2;
        MtTransportType mtTransportType3 = new MtTransportType("DOLMUS", 2, "dolmus");
        DOLMUS = mtTransportType3;
        MtTransportType mtTransportType4 = new MtTransportType("TROLLEYBUS", 3, "trolleybus");
        TROLLEYBUS = mtTransportType4;
        MtTransportType mtTransportType5 = new MtTransportType("TRAMWAY", 4, "tramway");
        TRAMWAY = mtTransportType5;
        MtTransportType mtTransportType6 = new MtTransportType("RAPID_TRAM", 5, "rapid_tram");
        RAPID_TRAM = mtTransportType6;
        MtTransportType mtTransportType7 = new MtTransportType("DUBAI_TRAM", 6, "dubai_tram");
        DUBAI_TRAM = mtTransportType7;
        MtTransportType mtTransportType8 = new MtTransportType("UNDERGROUND", 7, "underground");
        UNDERGROUND = mtTransportType8;
        MtTransportType mtTransportType9 = new MtTransportType("FUNICULAR", 8, "funicular");
        FUNICULAR = mtTransportType9;
        MtTransportType mtTransportType10 = new MtTransportType("CABLE", 9, "cable");
        CABLE = mtTransportType10;
        MtTransportType mtTransportType11 = new MtTransportType("AERO", 10, "aero");
        AERO = mtTransportType11;
        MtTransportType mtTransportType12 = new MtTransportType("HISTORIC_TRAM", 11, "historic_tram");
        HISTORIC_TRAM = mtTransportType12;
        MtTransportType mtTransportType13 = new MtTransportType("SUBURBAN", 12, "suburban");
        SUBURBAN = mtTransportType13;
        MtTransportType mtTransportType14 = new MtTransportType("SUBURBAN_EXPRESS", 13, "suburban_express");
        SUBURBAN_EXPRESS = mtTransportType14;
        MtTransportType mtTransportType15 = new MtTransportType("MCD", 14, "mcd");
        MCD = mtTransportType15;
        MtTransportType mtTransportType16 = new MtTransportType("AEROEXPRESS", 15, "aeroexpress");
        AEROEXPRESS = mtTransportType16;
        MtTransportType mtTransportType17 = new MtTransportType("AEROEXPRESS_BUS", 16, "aeroexpress_bus");
        AEROEXPRESS_BUS = mtTransportType17;
        MtTransportType mtTransportType18 = new MtTransportType("FERRY", 17, "ferry");
        FERRY = mtTransportType18;
        MtTransportType mtTransportType19 = new MtTransportType("WATER", 18, "water");
        WATER = mtTransportType19;
        MtTransportType mtTransportType20 = new MtTransportType("RAILWAY", 19, "railway");
        RAILWAY = mtTransportType20;
        MtTransportType mtTransportType21 = new MtTransportType("UNKNOWN", 20, "unknown");
        UNKNOWN = mtTransportType21;
        MtTransportType mtTransportType22 = new MtTransportType("BUS", 21, "bus");
        BUS = mtTransportType22;
        MtTransportType mtTransportType23 = new MtTransportType("SBAHN", 22, "s-bahn");
        SBAHN = mtTransportType23;
        MtTransportType[] mtTransportTypeArr = {mtTransportType, mtTransportType2, mtTransportType3, mtTransportType4, mtTransportType5, mtTransportType6, mtTransportType7, mtTransportType8, mtTransportType9, mtTransportType10, mtTransportType11, mtTransportType12, mtTransportType13, mtTransportType14, mtTransportType15, mtTransportType16, mtTransportType17, mtTransportType18, mtTransportType19, mtTransportType20, mtTransportType21, mtTransportType22, mtTransportType23};
        $VALUES = mtTransportTypeArr;
        k4o a = kotlin.enums.a.a(mtTransportTypeArr);
        $ENTRIES = a;
        Companion = new ij40();
        int d = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : a) {
            linkedHashMap.put(((MtTransportType) obj).mapkitType.toLowerCase(Locale.ROOT), obj);
        }
        map = linkedHashMap;
    }

    public MtTransportType(String str, int i, String str2) {
        this.mapkitType = str2;
    }

    public static MtTransportType valueOf(String str) {
        return (MtTransportType) Enum.valueOf(MtTransportType.class, str);
    }

    public static MtTransportType[] values() {
        return (MtTransportType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getMapkitType() {
        return this.mapkitType;
    }
}
