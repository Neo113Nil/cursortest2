package ru.yandex.taxi.layers.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/layers/analytics/LayersService;", "", "", "analyticsName", "Ljava/lang/String;", "MAP_OBJECTS", "POLYLINES", "POLYGONS", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LayersService {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LayersService[] $VALUES;
    public static final LayersService MAP_OBJECTS;
    public static final LayersService POLYGONS;
    public static final LayersService POLYLINES;
    private final String analyticsName;

    static {
        LayersService layersService = new LayersService("MAP_OBJECTS", 0, "map_objects");
        MAP_OBJECTS = layersService;
        LayersService layersService2 = new LayersService("POLYLINES", 1, "polylines");
        POLYLINES = layersService2;
        LayersService layersService3 = new LayersService("POLYGONS", 2, "polygons");
        POLYGONS = layersService3;
        LayersService[] layersServiceArr = {layersService, layersService2, layersService3};
        $VALUES = layersServiceArr;
        $ENTRIES = kotlin.enums.a.a(layersServiceArr);
    }

    public LayersService(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static LayersService valueOf(String str) {
        return (LayersService) Enum.valueOf(LayersService.class, str);
    }

    public static LayersService[] values() {
        return (LayersService[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.analyticsName;
    }
}
