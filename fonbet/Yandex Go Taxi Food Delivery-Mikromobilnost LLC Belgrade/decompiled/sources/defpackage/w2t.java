package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.maps.core.geometry.FloatPointKt;
import com.yandex.mapkit.maps.core.geometry.Point;

/* loaded from: classes7.dex */
public abstract class w2t {
    public static final boolean a(j2c0 j2c0Var, Point point) {
        double lat = point.getLat();
        double lon = point.getLon();
        k2c0 k2c0Var = (k2c0) j2c0Var;
        Point point2 = k2c0Var.a;
        Point point3 = k2c0Var.b;
        Point point4 = k2c0Var.d;
        Point point5 = k2c0Var.c;
        double lat2 = point2.getLat();
        double lon2 = point2.getLon();
        double lat3 = point3.getLat();
        double lon3 = point3.getLon();
        double lat4 = point4.getLat();
        double lon4 = point4.getLon();
        double lat5 = point5.getLat();
        double lon5 = point5.getLon();
        double b = b(lat2, lon2, lat3, lon3, lat4, lon4) + b(lat4, lon4, lat5, lon5, lat2, lon2);
        double b2 = b(lat2, lon2, lat3, lon3, lat, lon) + b(lat3, lon3, lat4, lon4, lat, lon) + b(lat4, lon4, lat5, lon5, lat, lon) + b(lat5, lon5, lat2, lon2, lat, lon);
        return Math.abs(b2 - b) <= Math.max(b2, b) * 1.0E-15d;
    }

    public static final double b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.abs(((d6 - d2) * (d3 - d)) - ((d5 - d) * (d4 - d2)));
    }

    public static final double c(PointF pointF, PointF pointF2) {
        return Math.hypot(FloatPointKt.obtainX(pointF) - FloatPointKt.obtainX(pointF2), FloatPointKt.obtainY(pointF) - FloatPointKt.obtainY(pointF2));
    }
}
