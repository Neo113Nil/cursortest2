package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineUtils;

/* loaded from: classes6.dex */
public final class x4s0 {
    public static PolylinePosition a(Polyline polyline, PolylinePosition polylinePosition, zzs zzsVar) {
        PolylinePosition polylinePosition2 = null;
        int i = 2;
        if (polyline.getPoints().size() < 2) {
            xby.t(jst.e, "DistanceCalculator", null, "invalid route points", 6);
            return null;
        }
        Point b = iwa1.b(polyline, polylinePosition);
        if (b != null) {
            if (srb1.c(b.getLatitude(), b.getLongitude(), zzsVar.a, zzsVar.b) > 3.0d) {
                double d = Double.MAX_VALUE;
                PolylinePosition polylinePosition3 = polylinePosition;
                while (true) {
                    if (polylinePosition.getSegmentIndex() == polyline.getPoints().size() - i && Double.compare(polylinePosition.getSegmentPosition(), 1.0d) == 0) {
                        break;
                    }
                    PolylinePosition advancePolylinePosition = PolylineUtils.advancePolylinePosition(polyline, polylinePosition3, 1.0d);
                    Point b2 = iwa1.b(polyline, advancePolylinePosition);
                    if (b2 == null) {
                        break;
                    }
                    double c = srb1.c(b2.getLatitude(), b2.getLongitude(), zzsVar.a, zzsVar.b);
                    if (c >= d) {
                        return polylinePosition3;
                    }
                    d = c;
                    polylinePosition3 = advancePolylinePosition;
                    polylinePosition2 = null;
                    i = 2;
                }
            }
            return polylinePosition;
        }
        return polylinePosition2;
    }
}
