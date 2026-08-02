package defpackage;

import android.content.Context;
import android.provider.Settings;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraBounds;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import java.util.function.Function;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes9.dex */
public final class ut7 {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl(PolicyMappingsExtension.MAP, 0, "getMap()Lcom/yandex/mapkit/map/Map;", ut7.class), new MutablePropertyReference1Impl("mapView", 0, "getMapView()Lru/yandex/taxi/map_common/map/TaxiMapView;", ut7.class)};
    public final es00 a;
    public final au50 b = new au50(20);
    public final au50 c = new au50(20);

    public ut7(es00 es00Var) {
        this.a = es00Var;
    }

    public static String a(BoundingBox boundingBox) {
        if (boundingBox == null) {
            return "null";
        }
        Point southWest = boundingBox.getSouthWest();
        Point northEast = boundingBox.getNorthEast();
        double latitude = southWest.getLatitude();
        double longitude = southWest.getLongitude();
        double latitude2 = northEast.getLatitude();
        double longitude2 = northEast.getLongitude();
        StringBuilder u = oyr.u(latitude, "southWest=(", Extension.FIX_SPACE);
        u.append(longitude);
        nzs.o(u, "), northEast(", latitude2, Extension.FIX_SPACE);
        return nzs.c(u, longitude2, Extension.C_BRAKE);
    }

    public final Map b() {
        return (Map) this.b.getValue(this, d[0]);
    }

    public final TaxiMapView c() {
        return (TaxiMapView) this.c.getValue(this, d[1]);
    }

    public final void d(CameraPosition cameraPosition, Animation animation, final Map.CameraCallback cameraCallback) {
        Map.CameraCallback cameraCallback2 = new Map.CameraCallback() { // from class: tt7
            @Override // com.yandex.mapkit.map.Map.CameraCallback
            public final void onMoveFinished(boolean z) {
                if (z) {
                    ut7.this.a.e = Long.valueOf(System.currentTimeMillis());
                }
                Map.CameraCallback cameraCallback3 = cameraCallback;
                if (cameraCallback3 != null) {
                    cameraCallback3.onMoveFinished(z);
                }
            }
        };
        if (animation == null) {
            Map b = b();
            if (b != null) {
                b.move(cameraPosition);
            }
            cameraCallback2.onMoveFinished(true);
        } else {
            Map b2 = b();
            if (b2 != null) {
                b2.move(cameraPosition, animation, cameraCallback2);
            }
        }
        this.a.c = cameraPosition;
        this.a.d = cameraPosition;
    }

    public final void e(float f, float f2) {
        Context context;
        Animation.Type type = Animation.Type.SMOOTH;
        TaxiMapView c = c();
        float f3 = 1.0f;
        if (c != null && (context = c.getContext()) != null) {
            f3 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        f(f, new Animation(type, (f3 * f2) / 1000.0f));
    }

    public final void f(float f, Animation animation) {
        if (n(f, "")) {
            CameraPosition cameraPosition = this.a.c;
            d(new CameraPosition(cameraPosition.getTarget(), f, cameraPosition.getAzimuth(), cameraPosition.getTilt()), animation, null);
        }
    }

    public final void g(BoundingBox boundingBox, Map.CameraCallback cameraCallback, float f, Function function) {
        Context context;
        Animation.Type type = Animation.Type.LINEAR;
        TaxiMapView c = c();
        float f2 = 1.0f;
        if (c != null && (context = c.getContext()) != null) {
            f2 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        h(boundingBox, cameraCallback, new Animation(type, (f2 * f) / 1000.0f), function);
    }

    public final void h(BoundingBox boundingBox, Map.CameraCallback cameraCallback, Animation animation, Function function) {
        CameraPosition cameraPosition = null;
        try {
            Map b = b();
            if (b != null) {
                cameraPosition = b.cameraPosition(Geometry.fromBoundingBox(boundingBox));
            }
        } catch (Exception e) {
            float zoom = this.a.c.getZoom();
            jst.e.r("Failed to get camera position with zoom=" + zoom + " and boundingBox=" + a(boundingBox), e);
        }
        if (cameraPosition == null || !m(cameraPosition, "with boundingBox=".concat(a(boundingBox)))) {
            if (cameraCallback != null) {
                cameraCallback.onMoveFinished(false);
                return;
            }
            return;
        }
        if (function != null) {
            cameraPosition = (CameraPosition) function.apply(cameraPosition);
            if (!m(cameraPosition, "after transform")) {
                if (cameraCallback != null) {
                    cameraCallback.onMoveFinished(false);
                    return;
                }
                return;
            }
        }
        d(cameraPosition, animation, cameraCallback);
    }

    public final void i(Point point, float f, float f2, Map.CameraCallback cameraCallback) {
        CameraPosition cameraPosition = this.a.c;
        k(new CameraPosition(point, f, cameraPosition.getAzimuth(), cameraPosition.getTilt()), f2, Animation.Type.LINEAR, cameraCallback);
    }

    public final void j(Point point, float f, Map.CameraCallback cameraCallback) {
        CameraBounds cameraBounds;
        CameraPosition cameraPosition = this.a.c;
        Map b = b();
        float zoom = (b == null || (cameraBounds = b.getCameraBounds()) == null) ? cameraPosition.getZoom() : cameraBounds.getMinZoom();
        float zoom2 = cameraPosition.getZoom();
        if (zoom2 >= zoom) {
            zoom = zoom2;
        }
        i(point, zoom, f, cameraCallback);
    }

    public final void k(CameraPosition cameraPosition, float f, Animation.Type type, Map.CameraCallback cameraCallback) {
        Context context;
        if (m(cameraPosition, "")) {
            TaxiMapView c = c();
            float f2 = 1.0f;
            if (c != null && (context = c.getContext()) != null) {
                f2 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            }
            d(cameraPosition, new Animation(type, (f2 * f) / 1000.0f), cameraCallback);
        }
    }

    public final void l(Point point) {
        CameraBounds cameraBounds;
        CameraPosition cameraPosition = this.a.c;
        Map b = b();
        float zoom = (b == null || (cameraBounds = b.getCameraBounds()) == null) ? cameraPosition.getZoom() : cameraBounds.getMinZoom();
        float zoom2 = cameraPosition.getZoom();
        if (zoom2 >= zoom) {
            zoom = zoom2;
        }
        i(point, zoom, 0.0f, null);
    }

    public final boolean m(CameraPosition cameraPosition, String str) {
        return n(cameraPosition.getZoom(), str) && a.J(str, cameraPosition.getTarget());
    }

    public final boolean n(float f, String str) {
        CameraBounds cameraBounds;
        CameraBounds cameraBounds2;
        Map b = b();
        if (b != null && (cameraBounds = b.getCameraBounds()) != null) {
            float minZoom = cameraBounds.getMinZoom();
            if (f < minZoom) {
                hst hstVar = jst.e;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                StringBuilder k = oo31.k("Zoom level too low: current=", f, ", minimum=", minZoom, " ");
                k.append(str);
                hstVar.r(k.toString(), illegalArgumentException);
                return false;
            }
            Map b2 = b();
            if (b2 != null && (cameraBounds2 = b2.getCameraBounds()) != null) {
                float maxZoom = cameraBounds2.getMaxZoom();
                if (f > maxZoom) {
                    hst hstVar2 = jst.e;
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                    StringBuilder k2 = oo31.k("Zoom level too high: current=", f, ", maximum=", maxZoom, " ");
                    k2.append(str);
                    hstVar2.r(k2.toString(), illegalArgumentException2);
                    return false;
                }
                if (!Float.isNaN(f)) {
                    return true;
                }
                jst.e.r("Zoom level not defined: current=" + f + " " + str, new IllegalArgumentException());
                return false;
            }
        }
        return false;
    }
}
