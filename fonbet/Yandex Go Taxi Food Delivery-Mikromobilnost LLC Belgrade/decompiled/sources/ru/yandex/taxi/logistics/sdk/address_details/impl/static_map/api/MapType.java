package ru.yandex.taxi.logistics.sdk.address_details.impl.static_map.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/address_details/impl/static_map/api/MapType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MAP", "SATELLITE", "HYBRID", "sdk-address-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapType[] $VALUES;
    public static final MapType HYBRID;
    public static final MapType MAP;
    public static final MapType SATELLITE;
    private final String value;

    static {
        MapType mapType = new MapType("MAP", 0, PolicyMappingsExtension.MAP);
        MAP = mapType;
        MapType mapType2 = new MapType("SATELLITE", 1, "sat");
        SATELLITE = mapType2;
        MapType mapType3 = new MapType("HYBRID", 2, "sat,skl");
        HYBRID = mapType3;
        MapType[] mapTypeArr = {mapType, mapType2, mapType3};
        $VALUES = mapTypeArr;
        $ENTRIES = a.a(mapTypeArr);
    }

    public MapType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MapType valueOf(String str) {
        return (MapType) Enum.valueOf(MapType.class, str);
    }

    public static MapType[] values() {
        return (MapType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
