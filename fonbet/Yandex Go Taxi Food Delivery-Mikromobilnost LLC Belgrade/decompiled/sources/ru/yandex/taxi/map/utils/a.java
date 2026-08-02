package ru.yandex.taxi.map.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ah00;
import defpackage.ap00;
import defpackage.f4c0;
import defpackage.jst;
import defpackage.mo21;
import defpackage.o400;
import defpackage.qxy;
import defpackage.scc;
import defpackage.sfr;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uc4;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.xm00;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public abstract class a {
    public static final double a = Math.pow(2.0d, 30.0d);
    public static Polyline b;

    public static final ScreenRect A(Rect rect) {
        return new ScreenRect(new ScreenPoint(rect.left, rect.top), new ScreenPoint(rect.right, rect.bottom));
    }

    public static final void B(xm00 xm00Var, ArrayList arrayList) {
        while (!arrayList.isEmpty()) {
            xm00Var.o((ap00) arrayList.remove(0));
        }
    }

    public static final boolean C(ScreenRect screenRect, ScreenRect screenRect2) {
        if (screenRect == null && screenRect2 == null) {
            return true;
        }
        return screenRect != null && screenRect2 != null && m(screenRect.getTopLeft().getX(), screenRect2.getTopLeft().getX()) && m(screenRect.getTopLeft().getY(), screenRect2.getTopLeft().getY()) && m(screenRect.getBottomRight().getX(), screenRect2.getBottomRight().getX()) && m(screenRect.getBottomRight().getY(), screenRect2.getBottomRight().getY());
    }

    public static final uc4 D(VisibleRegion visibleRegion) {
        return new uc4(E(visibleRegion.getBottomLeft(), null), E(visibleRegion.getTopRight(), null));
    }

    public static final zzs E(Point point, Long l) {
        return new zzs(point.getLatitude(), point.getLongitude(), 0, null, l, 12);
    }

    public static final Point F(zzs zzsVar) {
        return new Point(zzsVar.a, zzsVar.b);
    }

    public static final Point G(mo21 mo21Var) {
        return new Point(mo21Var.a, mo21Var.b);
    }

    public static final ArrayList H(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((zzs) it.next()));
        }
        return arrayList;
    }

    public static final void I(xm00 xm00Var, List list, List list2, BiConsumer biConsumer) {
        if (list2.size() != list.size()) {
            int size = list2.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                list.add(xm00Var.r((Point) list2.get(size2)));
            }
            while (list2.size() < list.size()) {
                xm00Var.o((f4c0) list.remove(list.size() - 1));
            }
        }
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            biConsumer.accept(list.get(i), list2.get(i));
        }
    }

    public static final boolean J(String str, Point point) {
        double latitude = point.getLatitude();
        double longitude = point.getLongitude();
        if (latitude > 89.2d) {
            jst.e.k(new IllegalArgumentException(), String.format("Latitude too high: current=%s, minimum=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(89.2d), str}, 3)));
            return false;
        }
        if (latitude < -89.2d) {
            jst.e.k(new IllegalArgumentException(), String.format("Latitude too low: current=%s, minimum=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(latitude), Double.valueOf(-89.2d), str}, 3)));
            return false;
        }
        if (longitude > 180.0d) {
            jst.e.k(new IllegalArgumentException(), String.format("Longitude too high: current=%s, minimum=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(longitude), Double.valueOf(180.0d), str}, 3)));
            return false;
        }
        if (longitude < -180.0d) {
            jst.e.k(new IllegalArgumentException(), String.format("Longitude too low: current=%s, minimum=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(longitude), Double.valueOf(-180.0d), str}, 3)));
            return false;
        }
        if (Double.isNaN(latitude)) {
            jst.e.k(new IllegalArgumentException(), String.format("Latitude not defined: current=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(latitude), str}, 2)));
            return false;
        }
        if (!Double.isNaN(longitude)) {
            return true;
        }
        jst.e.k(new IllegalArgumentException(), String.format("Longitude not defined: current=%s %s", Arrays.copyOf(new Object[]{Double.valueOf(longitude), str}, 2)));
        return false;
    }

    public static Object K(ah00 ah00Var, ContinuationImpl continuationImpl) {
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a.x, new MapUtils$visibleBBox$2(ah00Var, null), continuationImpl);
    }

    public static boolean a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return ((d5 > d && d5 < d3) || (d > d5 && d < d7)) && (((d6 > d2 ? 1 : (d6 == d2 ? 0 : -1)) > 0 && (d6 > d4 ? 1 : (d6 == d4 ? 0 : -1)) < 0) || ((d2 > d6 ? 1 : (d2 == d6 ? 0 : -1)) > 0 && (d2 > d8 ? 1 : (d2 == d8 ? 0 : -1)) < 0));
    }

    public static boolean b(sfr sfrVar, sfr sfrVar2) {
        if (sfrVar == null || sfrVar2 == null) {
            return false;
        }
        return a(sfrVar.b(), sfrVar.d(), sfrVar.c(), sfrVar.a(), sfrVar2.b(), sfrVar2.d(), sfrVar2.c(), sfrVar2.a());
    }

    public static final boolean c(ScreenRect screenRect, ScreenRect screenRect2) {
        if (screenRect2 == null) {
            return false;
        }
        return a(screenRect.getTopLeft().getX(), screenRect.getTopLeft().getY(), screenRect.getBottomRight().getX(), screenRect.getBottomRight().getY(), screenRect2.getTopLeft().getX(), screenRect2.getTopLeft().getY(), screenRect2.getBottomRight().getX(), screenRect2.getBottomRight().getY());
    }

    public static final boolean d(Point point, Point point2) {
        return point.getLatitude() == point2.getLatitude() && point.getLongitude() == point2.getLongitude();
    }

    public static final BoundingBox e(int i, List list) {
        int i2 = i < 0 ? 0 : i;
        Point point = (Point) list.get(i2);
        double latitude = point.getLatitude();
        double longitude = point.getLongitude();
        int size = list.size();
        double d = longitude;
        double d2 = d;
        double d3 = latitude;
        for (int i3 = i2 + 1; i3 < size; i3++) {
            Point point2 = (Point) list.get(i3);
            double latitude2 = point2.getLatitude();
            if (latitude2 - d3 > 0.0d) {
                d3 = latitude2;
            } else if (latitude - latitude2 > 0.0d) {
                latitude = latitude2;
            }
            double longitude2 = point2.getLongitude();
            if (d - longitude2 > 0.0d) {
                d = longitude2;
            } else if (longitude2 - d2 > 0.0d) {
                d2 = longitude2;
            }
        }
        return new BoundingBox(new Point(latitude, d), new Point(d3, d2));
    }

    public static float f(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final sfr g(XYPoint xYPoint, PointF pointF, int i, int i2, float f, int i3, int i4, int i5, int i6) {
        double f2 = f(i);
        double f3 = f(i2);
        double pow = a / (Math.pow(2.0d, f) * 256.0d);
        double d = f2 * pow;
        double d2 = f3 * pow;
        double f4 = f(i3) * pow;
        double f5 = f(i4) * pow;
        double f6 = f(i5) * pow;
        double f7 = f(i6) * pow;
        double d3 = pointF.x * d2;
        double d4 = d * pointF.y;
        return new sfr((xYPoint.getX() - d3) + f4, (xYPoint.getY() - d4) + f6, (xYPoint.getX() + (d2 - d3)) - f5, (xYPoint.getY() + (d - d4)) - f7);
    }

    public static final Point h(BoundingBox boundingBox) {
        Point northEast = boundingBox.getNorthEast();
        Point southWest = boundingBox.getSouthWest();
        return new Point((southWest.getLatitude() + northEast.getLatitude()) / 2.0d, (southWest.getLongitude() + northEast.getLongitude()) / 2.0d);
    }

    public static final float i(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0];
    }

    public static final float j(zzs zzsVar, zzs zzsVar2) {
        return i(zzsVar.a, zzsVar.b, zzsVar2.a, zzsVar2.b);
    }

    public static double k(Point point, Point point2) {
        double radians = Math.toRadians(point2.getLatitude() - point.getLatitude());
        double radians2 = Math.toRadians(point2.getLongitude() - point.getLongitude());
        double radians3 = Math.toRadians(point.getLatitude());
        double radians4 = Math.toRadians(point2.getLatitude());
        return Math.asin(Math.sqrt((Math.cos(radians4) * Math.cos(radians3) * Math.pow(Math.sin(radians2 / 2.0d), 2.0d)) + Math.pow(Math.sin(radians / 2.0d), 2.0d))) * 2.0d * 6372.8d;
    }

    public static final sfr l(f4c0 f4c0Var, XYPoint xYPoint, int i, int i2, int i3, int i4, float f) {
        PointF pointF;
        ImageProvider r = f4c0Var.r();
        if (r == null || (((r instanceof qxy) && !((qxy) r).a()) || r.get$image() == null)) {
            return new sfr(xYPoint.getX(), xYPoint.getY(), xYPoint.getX(), xYPoint.getY());
        }
        Bitmap bitmap = r.get$image();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        IconStyle t = f4c0Var.t();
        if (t == null || (pointF = t.getAnchor()) == null) {
            pointF = new PointF(0.5f, 0.5f);
        }
        return g(xYPoint, pointF, height, width, f, i, i2, i3, i4);
    }

    public static final boolean m(float f, float f2) {
        return Math.abs(f - f2) < 0.1f;
    }

    public static final Point n(Polyline polyline) {
        float f;
        List<Point> points = polyline.getPoints();
        if (points.isEmpty()) {
            return null;
        }
        int i = 0;
        if (points.size() == 1) {
            return points.get(0);
        }
        if (points.size() == 2) {
            Point point = points.get(0);
            Point point2 = points.get(1);
            return new Point((point2.getLatitude() + point.getLatitude()) / 2.0d, (point2.getLongitude() + point.getLongitude()) / 2.0d);
        }
        Iterator<Point> it = points.iterator();
        if (it.hasNext()) {
            Point next = it.next();
            f = 0.0f;
            while (it.hasNext()) {
                Point next2 = it.next();
                f += i(next.getLatitude(), next.getLongitude(), next2.getLatitude(), next2.getLongitude());
                next = next2;
            }
        } else {
            f = 0.0f;
        }
        float f2 = f / 2.0f;
        if (points.isEmpty()) {
            unr0.z(jst.e, "route can't be empty");
            i = -1;
        } else if (points.size() != 1) {
            Point point3 = points.get(0);
            int size = points.size();
            float f3 = 0.0f;
            int i2 = 1;
            while (true) {
                if (i2 >= size) {
                    i = points.size() - 1;
                    break;
                }
                Point point4 = points.get(i2);
                f3 += i(point4.getLatitude(), point4.getLongitude(), point3.getLatitude(), point3.getLongitude());
                if (f3 >= f2) {
                    i = i2;
                    break;
                }
                i2++;
                point3 = point4;
            }
        }
        if (i == -1) {
            return null;
        }
        Point point5 = points.get(i - 1);
        Point point6 = points.get(i);
        return new Point((point6.getLatitude() + point5.getLatitude()) / 2.0d, (point6.getLongitude() + point5.getLongitude()) / 2.0d);
    }

    public static double o(int i, List list, Point point) {
        int f = scc.f(list);
        double d = 0.0d;
        while (i < f) {
            Point point2 = (Point) list.get(i);
            i++;
            Point point3 = (Point) list.get(i);
            if (u(point2, point3, point)) {
                return k(point2, point) + d;
            }
            d += k(point2, point3);
        }
        return d;
    }

    public static final boolean p(BoundingBox boundingBox, BoundingBox boundingBox2) {
        if (boundingBox == null && boundingBox2 == null) {
            return true;
        }
        if (boundingBox != null && boundingBox2 != null) {
            Point northEast = boundingBox.getNorthEast();
            Point southWest = boundingBox.getSouthWest();
            Point northEast2 = boundingBox2.getNorthEast();
            Point southWest2 = boundingBox2.getSouthWest();
            if (z(northEast, northEast2) && z(southWest, southWest2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean q(ScreenPoint screenPoint, ScreenRect screenRect) {
        float y = screenRect.getTopLeft().getY();
        float y2 = screenRect.getBottomRight().getY();
        float x = screenRect.getTopLeft().getX();
        float x2 = screenRect.getBottomRight().getX();
        float y3 = screenPoint.getY();
        if (y > y3 || y3 > y2) {
            return false;
        }
        float x3 = screenPoint.getX();
        return x <= x3 && x3 <= x2;
    }

    public static boolean r(BoundingBox boundingBox, double d, double d2) {
        double latitude = boundingBox.getSouthWest().getLatitude();
        if (d > boundingBox.getNorthEast().getLatitude() || latitude > d) {
            return false;
        }
        return d2 <= boundingBox.getNorthEast().getLongitude() && boundingBox.getSouthWest().getLongitude() <= d2;
    }

    public static final boolean s(BoundingBox boundingBox, BoundingBox boundingBox2) {
        return t(boundingBox2, boundingBox.getNorthEast()) && t(boundingBox2, boundingBox.getSouthWest());
    }

    public static final boolean t(BoundingBox boundingBox, Point point) {
        return r(boundingBox, point.getLatitude(), point.getLongitude());
    }

    public static boolean u(Point point, Point point2, Point point3) {
        if (Math.abs(((point2.getLongitude() - point.getLongitude()) * (point3.getLatitude() - point.getLatitude())) - ((point2.getLatitude() - point.getLatitude()) * (point3.getLongitude() - point.getLongitude()))) > 1.0E-8d) {
            return false;
        }
        double latitude = ((point2.getLatitude() - point.getLatitude()) * (point3.getLatitude() - point.getLatitude())) + ((point2.getLongitude() - point.getLongitude()) * (point3.getLongitude() - point.getLongitude()));
        if (latitude < 0.0d) {
            return false;
        }
        return latitude <= ((point2.getLatitude() - point.getLatitude()) * (point2.getLatitude() - point.getLatitude())) + ((point2.getLongitude() - point.getLongitude()) * (point2.getLongitude() - point.getLongitude()));
    }

    public static final boolean v(double d, double d2, double d3) {
        return d - 1.0E-4d < d2 && d2 < d3 + 1.0E-4d;
    }

    public static Point w(Point point, Point point2) {
        return new Point(point2.getLatitude() - (point.getLatitude() - point2.getLatitude()), point2.getLongitude() - (point.getLongitude() - point2.getLongitude()));
    }

    public static final ScreenPoint x(ScreenPoint screenPoint, int i, int i2) {
        return new ScreenPoint(screenPoint.getX() + i, screenPoint.getY() + i2);
    }

    public static final boolean y(Point point, Point point2) {
        return Math.abs(point.getLatitude() - point2.getLatitude()) < Math.abs(1.0E-8d) && Math.abs(point.getLongitude() - point2.getLongitude()) < Math.abs(1.0E-8d);
    }

    public static final boolean z(Point point, Point point2) {
        if (point == null && point2 == null) {
            return true;
        }
        return point != null && point2 != null && Double.doubleToRawLongBits(point.getLatitude()) == Double.doubleToRawLongBits(point2.getLatitude()) && Double.doubleToRawLongBits(point.getLongitude()) == Double.doubleToRawLongBits(point2.getLongitude());
    }
}
