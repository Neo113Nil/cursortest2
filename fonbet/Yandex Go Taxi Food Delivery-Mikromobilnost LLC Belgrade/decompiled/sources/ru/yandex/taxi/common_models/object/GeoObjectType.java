package ru.yandex.taxi.common_models.object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import defpackage.k4o;
import defpackage.rzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/object/GeoObjectType;", "", "Companion", "rzs", "ORGANIZATION", "ADDRESS", "DELIVERY_PICKUP_POINT", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GeoObjectType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GeoObjectType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final GeoObjectType ADDRESS;
    public static final rzs Companion;
    public static final GeoObjectType DELIVERY_PICKUP_POINT;
    public static final GeoObjectType ORGANIZATION;

    static {
        GeoObjectType geoObjectType = new GeoObjectType("ORGANIZATION", 0);
        ORGANIZATION = geoObjectType;
        GeoObjectType geoObjectType2 = new GeoObjectType("ADDRESS", 1);
        ADDRESS = geoObjectType2;
        GeoObjectType geoObjectType3 = new GeoObjectType("DELIVERY_PICKUP_POINT", 2);
        DELIVERY_PICKUP_POINT = geoObjectType3;
        GeoObjectType[] geoObjectTypeArr = {geoObjectType, geoObjectType2, geoObjectType3};
        $VALUES = geoObjectTypeArr;
        $ENTRIES = a.a(geoObjectTypeArr);
        Companion = new rzs();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(27));
    }

    public static GeoObjectType valueOf(String str) {
        return (GeoObjectType) Enum.valueOf(GeoObjectType.class, str);
    }

    public static GeoObjectType[] values() {
        return (GeoObjectType[]) $VALUES.clone();
    }
}
