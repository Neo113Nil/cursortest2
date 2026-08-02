package ru.yandextaxi.flutter_yandex_mapkit.helper;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.ToponymObjectMetadata;
import defpackage.h73;
import kotlin.sequences.b;

/* loaded from: classes15.dex */
public abstract class a {
    public static final Point a(GeoObject geoObject) {
        Point balloonPoint;
        ToponymObjectMetadata toponymObjectMetadata = (ToponymObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(ToponymObjectMetadata.class));
        return (toponymObjectMetadata == null || (balloonPoint = toponymObjectMetadata.getBalloonPoint()) == null) ? (Point) b.j(b.o(new h73(1, geoObject.getGeometry()), GeoObjectExtensionKt$pointFromGeometry$1.b)) : balloonPoint;
    }
}
