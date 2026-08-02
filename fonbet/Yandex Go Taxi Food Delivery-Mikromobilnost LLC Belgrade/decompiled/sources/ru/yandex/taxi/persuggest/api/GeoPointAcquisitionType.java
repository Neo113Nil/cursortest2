package ru.yandex.taxi.persuggest.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/persuggest/api/GeoPointAcquisitionType;", "", "USER_LOCATION", "UPDATED_POINT", "DEFAULT", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GeoPointAcquisitionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GeoPointAcquisitionType[] $VALUES;
    public static final GeoPointAcquisitionType DEFAULT;
    public static final GeoPointAcquisitionType UPDATED_POINT;
    public static final GeoPointAcquisitionType USER_LOCATION;

    static {
        GeoPointAcquisitionType geoPointAcquisitionType = new GeoPointAcquisitionType("USER_LOCATION", 0);
        USER_LOCATION = geoPointAcquisitionType;
        GeoPointAcquisitionType geoPointAcquisitionType2 = new GeoPointAcquisitionType("UPDATED_POINT", 1);
        UPDATED_POINT = geoPointAcquisitionType2;
        GeoPointAcquisitionType geoPointAcquisitionType3 = new GeoPointAcquisitionType("DEFAULT", 2);
        DEFAULT = geoPointAcquisitionType3;
        GeoPointAcquisitionType[] geoPointAcquisitionTypeArr = {geoPointAcquisitionType, geoPointAcquisitionType2, geoPointAcquisitionType3};
        $VALUES = geoPointAcquisitionTypeArr;
        $ENTRIES = kotlin.enums.a.a(geoPointAcquisitionTypeArr);
    }

    public static GeoPointAcquisitionType valueOf(String str) {
        return (GeoPointAcquisitionType) Enum.valueOf(GeoPointAcquisitionType.class, str);
    }

    public static GeoPointAcquisitionType[] values() {
        return (GeoPointAcquisitionType[]) $VALUES.clone();
    }
}
