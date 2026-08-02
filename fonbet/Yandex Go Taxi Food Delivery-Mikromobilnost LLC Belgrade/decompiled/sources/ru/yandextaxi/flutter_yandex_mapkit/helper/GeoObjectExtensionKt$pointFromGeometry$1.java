package ru.yandextaxi.flutter_yandex_mapkit.helper;

import com.yandex.mapkit.geometry.Geometry;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class GeoObjectExtensionKt$pointFromGeometry$1 extends FunctionReferenceImpl implements tls {
    public static final GeoObjectExtensionKt$pointFromGeometry$1 b = new GeoObjectExtensionKt$pointFromGeometry$1(1, 0, Geometry.class, "getPoint", "getPoint()Lcom/yandex/mapkit/geometry/Point;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Geometry) obj).getPoint();
    }
}
