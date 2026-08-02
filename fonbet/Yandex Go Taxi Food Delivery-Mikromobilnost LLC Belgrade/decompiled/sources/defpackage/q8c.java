package defpackage;

import android.animation.ValueAnimator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Lifecycle;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.mapview.MapTexture;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.NavigationFactory;
import com.yandex.mapkit.navigation.automotive.NavigationSerialization;
import com.yandex.mapkit.navigation.automotive.RouteOptions;
import com.yandex.mapkit.navigation.transport.TransportOptions;
import com.yandex.mapkit.navigation.transport.Type;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import com.yandex.runtime.image.ImageProvider;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.embedding.engine.renderer.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;
import ru.yandextaxi.flutter_yandex_mapkit.helper.PlatformExceptionWrapper;

/* loaded from: classes7.dex */
public final class q8c extends k45 {
    public final /* synthetic */ int b = 2;
    public final Object c;
    public Object w;
    public Object x;

    public q8c(ssr ssrVar, e40 e40Var, eu00 eu00Var) {
        super(ssrVar, "map_texture");
        this.c = ssrVar;
        this.w = e40Var;
        this.x = eu00Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void c(x920 x920Var, da20 da20Var) {
        ValueAnimator ofFloat;
        Object obj = x920Var.b;
        eu00 eu00Var = (eu00) this.c;
        final MapWindow mapWindow = ((au00) eu00Var.a).getMapWindow();
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1850436093:
                    if (str.equals("getScaleFactor")) {
                        ((ba20) da20Var).success(Double.valueOf(((au00) eu00Var.a).getMapWindow().getScaleFactor()));
                        return;
                    }
                    break;
                case -1353314418:
                    if (str.equals("getFocusPoint")) {
                        ScreenPoint focusPoint = mapWindow.getFocusPoint();
                        ((ba20) da20Var).success(focusPoint != null ? b.i(new Pair(RemoteBioParameters.X, Float.valueOf(focusPoint.getX())), new Pair(RemoteBioParameters.Y, Float.valueOf(focusPoint.getY()))) : null);
                        return;
                    }
                    break;
                case -1127012198:
                    if (str.equals("setFocusRect")) {
                        Map map = (Map) obj;
                        try {
                            mapWindow.setFocusRect(lyi.k(map));
                            ((ba20) da20Var).success(null);
                            return;
                        } catch (Throwable th) {
                            throw new PlatformExceptionWrapper(b.i(new Pair("focusRect", map), new Pair("mapWindow", b.i(new Pair("height", Integer.valueOf(mapWindow.height())), new Pair("width", Integer.valueOf(mapWindow.width()))))), th);
                        }
                    }
                    break;
                case -579183206:
                    if (str.equals("setFocusPoint")) {
                        Map map2 = (Map) obj;
                        Map map3 = (Map) map2.get(IssuingDistributionPointExtension.POINT);
                        Integer num = (Integer) map2.get("durationMS");
                        ScreenPoint screenPoint = new ScreenPoint((float) ((Double) map3.get(RemoteBioParameters.X)).doubleValue(), (float) ((Double) map3.get(RemoteBioParameters.Y)).doubleValue());
                        ValueAnimator valueAnimator = (ValueAnimator) this.w;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                        }
                        Long valueOf = num != null ? Long.valueOf(num.intValue()) : null;
                        LinearInterpolator linearInterpolator = xt00.a;
                        ScreenPoint focusPoint2 = mapWindow.getFocusPoint();
                        if (focusPoint2 == null) {
                            focusPoint2 = new ScreenPoint(mapWindow.width() / 2.0f, mapWindow.height() / 2.0f);
                        }
                        if (valueOf == null) {
                            mapWindow.setFocusPoint(screenPoint);
                            ofFloat = null;
                        } else {
                            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final float x = focusPoint2.getX();
                            final float y = focusPoint2.getY();
                            final float x2 = screenPoint.getX() - x;
                            final float y2 = screenPoint.getY() - y;
                            ofFloat.setDuration(valueOf.longValue());
                            ofFloat.setInterpolator(linearInterpolator);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yt00
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    MapWindow mapWindow2 = MapWindow.this;
                                    float f = x;
                                    float f2 = x2;
                                    float f3 = y;
                                    float f4 = y2;
                                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    try {
                                        mapWindow2.setFocusPoint(new ScreenPoint((f2 * floatValue) + f, (floatValue * f4) + f3));
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                            ofFloat.start();
                        }
                        this.w = ofFloat;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 190678745:
                    if (str.equals("getFieldOfViewY")) {
                        ((ba20) da20Var).success(Double.valueOf(((au00) eu00Var.a).getMapWindow().getFieldOfViewY()));
                        return;
                    }
                    break;
                case 219461579:
                    if (str.equals("screenToWorld")) {
                        Map map4 = (Map) obj;
                        Point screenToWorld = mapWindow.screenToWorld(new ScreenPoint((float) ((Double) map4.get(RemoteBioParameters.X)).doubleValue(), (float) ((Double) map4.get(RemoteBioParameters.Y)).doubleValue()));
                        ((ba20) da20Var).success(screenToWorld != null ? b.i(new Pair("lat", Double.valueOf(screenToWorld.getLatitude())), new Pair("lon", Double.valueOf(screenToWorld.getLongitude()))) : null);
                        return;
                    }
                    break;
                case 360611961:
                    if (str.equals("worldToScreen")) {
                        Map map5 = (Map) obj;
                        Object obj2 = map5.get("lat");
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        Object obj3 = map5.get("lon");
                        Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                        if (d == null) {
                            ny61.g("Required value was null.");
                            return;
                        } else if (d2 == null) {
                            ny61.g("Required value was null.");
                            return;
                        } else {
                            ScreenPoint worldToScreen = mapWindow.worldToScreen(new Point(d.doubleValue(), d2.doubleValue()));
                            ((ba20) da20Var).success(worldToScreen != null ? b.i(new Pair(RemoteBioParameters.X, Float.valueOf(worldToScreen.getX())), new Pair(RemoteBioParameters.Y, Float.valueOf(worldToScreen.getY()))) : null);
                            return;
                        }
                    }
                    break;
                case 400235495:
                    if (str.equals("setMaxFps")) {
                        ((au00) eu00Var.a).getMapWindow().setMaxFps(((Integer) obj).intValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 474985501:
                    if (str.equals("getHeight")) {
                        ((ba20) da20Var).success(Integer.valueOf(mapWindow.height()));
                        return;
                    }
                    break;
                case 672794999:
                    if (str.equals("setScaleFactor")) {
                        ((au00) eu00Var.a).getMapWindow().setScaleFactor((float) ((Double) obj).doubleValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1101431269:
                    if (str.equals("setFieldOfViewY")) {
                        ((au00) eu00Var.a).getMapWindow().setFieldOfViewY(((Double) obj).doubleValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1618962470:
                    if (str.equals("getFocusRect")) {
                        ScreenRect focusRect = mapWindow.getFocusRect();
                        if (focusRect != null) {
                            ScreenPoint topLeft = focusRect.getTopLeft();
                            Map i = b.i(new Pair(RemoteBioParameters.X, Float.valueOf(topLeft.getX())), new Pair(RemoteBioParameters.Y, Float.valueOf(topLeft.getY())));
                            ScreenPoint bottomRight = focusRect.getBottomRight();
                            r9 = b.i(new Pair("topLeft", i), new Pair("bottomRight", b.i(new Pair(RemoteBioParameters.X, Float.valueOf(bottomRight.getX())), new Pair(RemoteBioParameters.Y, Float.valueOf(bottomRight.getY())))));
                        }
                        ((ba20) da20Var).success(r9);
                        return;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        ((au00) eu00Var.a).release();
                        eu00Var.a = null;
                        Iterator it = ((List) this.x).iterator();
                        while (it.hasNext()) {
                            ((z801) it.next()).b.a = null;
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1968952336:
                    if (str.equals("getWidth")) {
                        ((ba20) da20Var).success(Integer.valueOf(mapWindow.width()));
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    public r8c b(String str) {
        return (r8c) ((ini0) this.c).d(str, ReferenceType.CLUSTERIZED_PLACEMARK_COLLECTION);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        MotionEvent motionEvent;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                hdu hduVar = (hdu) this.w;
                ini0 ini0Var = (ini0) obj;
                Object obj2 = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -854558288:
                            if (str.equals("setVisible")) {
                                Map map = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj3 = map != null ? map.get("clusterCollectionId") : null;
                                String str2 = obj3 instanceof String ? (String) obj3 : null;
                                r8c b = str2 != null ? b(str2) : null;
                                Object obj4 = map != null ? map.get(Constants.KEY_DATA) : null;
                                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                                if (b == null || bool == null) {
                                    ((ba20) da20Var).error("error", "setVisible: invalid args", null);
                                    return;
                                } else {
                                    b.a.setVisible(bool.booleanValue());
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                            }
                            break;
                        case -508151876:
                            if (str.equals("removeMapObjects")) {
                                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj5 = map2 != null ? map2.get("clusterCollectionId") : null;
                                String str3 = obj5 instanceof String ? (String) obj5 : null;
                                r8c b2 = str3 != null ? b(str3) : null;
                                Object obj6 = map2 != null ? map2.get(Constants.KEY_DATA) : null;
                                List list = obj6 instanceof List ? (List) obj6 : null;
                                if (b2 == null || list == null) {
                                    ((ba20) da20Var).error("error", "removeMapObjects: invalid args", null);
                                    return;
                                }
                                Iterator it = ((List) this.x).iterator();
                                while (it.hasNext()) {
                                    ((j070) it.next()).getClass();
                                }
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    MapObject mapObject = (MapObject) ini0Var.e((String) it2.next(), ReferenceType.MAP_OBJECT);
                                    if (mapObject != null && mapObject.isValid()) {
                                        try {
                                            b2.a.remove(mapObject);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -330739766:
                            if (str.equals("setClusterGeometry")) {
                                Map map3 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj7 = map3 != null ? map3.get("clusterCollectionId") : null;
                                String str4 = obj7 instanceof String ? (String) obj7 : null;
                                r8c b3 = str4 != null ? b(str4) : null;
                                Object obj8 = map3 != null ? map3.get(Constants.KEY_DATA) : null;
                                Map map4 = obj8 instanceof Map ? (Map) obj8 : null;
                                Object obj9 = map4 != null ? map4.get("clusterId") : null;
                                String str5 = obj9 instanceof String ? (String) obj9 : null;
                                Object obj10 = map4 != null ? map4.get("geometry") : null;
                                Map map5 = obj10 instanceof Map ? (Map) obj10 : null;
                                if (b3 != null) {
                                    LinkedHashMap linkedHashMap = b3.b;
                                    if (str5 != null && map5 != null) {
                                        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) linkedHashMap.get(str5);
                                        if (placemarkMapObject == null || !placemarkMapObject.isValid()) {
                                            linkedHashMap.remove(str5);
                                            ((ba20) da20Var).success(null);
                                            return;
                                        }
                                        Object obj11 = map5.get("lat");
                                        Double d = obj11 instanceof Double ? (Double) obj11 : null;
                                        if (d == null) {
                                            ((ba20) da20Var).error("error", "setClusterGeometry: missing lat", null);
                                            return;
                                        }
                                        double doubleValue = d.doubleValue();
                                        Object obj12 = map5.get("lon");
                                        Double d2 = obj12 instanceof Double ? (Double) obj12 : null;
                                        if (d2 == null) {
                                            ((ba20) da20Var).error("error", "setClusterGeometry: missing lon", null);
                                            return;
                                        } else {
                                            try {
                                                placemarkMapObject.setGeometry(new Point(doubleValue, d2.doubleValue()));
                                            } catch (Throwable unused2) {
                                            }
                                            ((ba20) da20Var).success(null);
                                            return;
                                        }
                                    }
                                }
                                ((ba20) da20Var).error("error", "setClusterGeometry: invalid args", null);
                                return;
                            }
                            break;
                        case -233552352:
                            if (str.equals("addPlacemarks")) {
                                Map map6 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj13 = map6 != null ? map6.get("clusterCollectionId") : null;
                                String str6 = obj13 instanceof String ? (String) obj13 : null;
                                r8c b4 = str6 != null ? b(str6) : null;
                                Object obj14 = map6 != null ? map6.get(Constants.KEY_DATA) : null;
                                Map map7 = obj14 instanceof Map ? (Map) obj14 : null;
                                if (b4 == null || map7 == null) {
                                    ((ba20) da20Var).error("error", "addPlacemarks: invalid args", null);
                                    return;
                                }
                                ClusterizedPlacemarkCollection clusterizedPlacemarkCollection = b4.a;
                                for (Map.Entry entry : map7.entrySet()) {
                                    String str7 = (String) entry.getKey();
                                    b4c0 d3 = lyi.d((Map) entry.getValue(), hduVar);
                                    PlacemarkMapObject addPlacemark = clusterizedPlacemarkCollection.addPlacemark();
                                    addPlacemark.setGeometry(d3.a);
                                    ImageProvider imageProvider = d3.b;
                                    IconStyle iconStyle = d3.c;
                                    if (iconStyle == null) {
                                        iconStyle = new IconStyle();
                                    }
                                    addPlacemark.setIcon(imageProvider, iconStyle);
                                    ini0Var.b(str7, ReferenceType.MAP_OBJECT, addPlacemark);
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 94746189:
                            if (str.equals("clear")) {
                                Map map8 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj15 = map8 != null ? map8.get("clusterCollectionId") : null;
                                String str8 = obj15 instanceof String ? (String) obj15 : null;
                                r8c b5 = str8 != null ? b(str8) : null;
                                if (b5 == null) {
                                    ((ba20) da20Var).error("error", "clear: invalid args", null);
                                    return;
                                } else {
                                    b5.a.clear();
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                            }
                            break;
                        case 466433259:
                            if (str.equals("addEmptyPlacemarks")) {
                                Map map9 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj16 = map9 != null ? map9.get("clusterCollectionId") : null;
                                String str9 = obj16 instanceof String ? (String) obj16 : null;
                                r8c b6 = str9 != null ? b(str9) : null;
                                Object obj17 = map9 != null ? map9.get(Constants.KEY_DATA) : null;
                                Map map10 = obj17 instanceof Map ? (Map) obj17 : null;
                                if (b6 == null || map10 == null) {
                                    ((ba20) da20Var).error("error", "addEmptyPlacemarks: invalid args", null);
                                    return;
                                }
                                ClusterizedPlacemarkCollection clusterizedPlacemarkCollection2 = b6.a;
                                for (Map.Entry entry2 : map10.entrySet()) {
                                    String str10 = (String) entry2.getKey();
                                    Map map11 = (Map) entry2.getValue();
                                    Object obj18 = map11.get("lat");
                                    Double d4 = obj18 instanceof Double ? (Double) obj18 : null;
                                    Object obj19 = map11.get("lon");
                                    Double d5 = obj19 instanceof Double ? (Double) obj19 : null;
                                    if (d4 == null) {
                                        ny61.g("Required value was null.");
                                        return;
                                    } else {
                                        if (d5 == null) {
                                            ny61.g("Required value was null.");
                                            return;
                                        }
                                        Point point = new Point(d4.doubleValue(), d5.doubleValue());
                                        PlacemarkMapObject addPlacemark2 = clusterizedPlacemarkCollection2.addPlacemark();
                                        addPlacemark2.setGeometry(point);
                                        ini0Var.b(str10, ReferenceType.MAP_OBJECT, addPlacemark2);
                                    }
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 883753562:
                            if (str.equals("addPlacemarksByPoints")) {
                                Map map12 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj20 = map12 != null ? map12.get("clusterCollectionId") : null;
                                String str11 = obj20 instanceof String ? (String) obj20 : null;
                                r8c b7 = str11 != null ? b(str11) : null;
                                Object obj21 = map12 != null ? map12.get(Constants.KEY_DATA) : null;
                                Map map13 = obj21 instanceof Map ? (Map) obj21 : null;
                                if (b7 == null || map13 == null) {
                                    ((ba20) da20Var).error("error", "addPlacemarksByPoints: invalid args", null);
                                    return;
                                }
                                j4c0 f = lyi.f(map13, hduVar);
                                LinkedHashMap linkedHashMap2 = f.a;
                                List<Point> J0 = a.J0(linkedHashMap2.values());
                                List J02 = a.J0(linkedHashMap2.keySet());
                                ClusterizedPlacemarkCollection clusterizedPlacemarkCollection3 = b7.a;
                                ImageProvider imageProvider2 = f.b;
                                IconStyle iconStyle2 = f.c;
                                if (iconStyle2 == null) {
                                    iconStyle2 = new IconStyle();
                                }
                                int i2 = 0;
                                for (Object obj22 : clusterizedPlacemarkCollection3.addPlacemarks(J0, imageProvider2, iconStyle2)) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    PlacemarkMapObject placemarkMapObject2 = (PlacemarkMapObject) obj22;
                                    if (i2 < J02.size()) {
                                        ini0Var.b((String) J02.get(i2), ReferenceType.MAP_OBJECT, placemarkMapObject2);
                                    }
                                    i2 = i3;
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1579453884:
                            if (str.equals("setClusterAppearance")) {
                                Map map14 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj23 = map14 != null ? map14.get("clusterCollectionId") : null;
                                String str12 = obj23 instanceof String ? (String) obj23 : null;
                                r8c b8 = str12 != null ? b(str12) : null;
                                Object obj24 = map14 != null ? map14.get(Constants.KEY_DATA) : null;
                                Map map15 = obj24 instanceof Map ? (Map) obj24 : null;
                                Object obj25 = map15 != null ? map15.get("clusterId") : null;
                                String str13 = obj25 instanceof String ? (String) obj25 : null;
                                Object obj26 = map15 != null ? map15.get("icon") : null;
                                Map map16 = obj26 instanceof Map ? (Map) obj26 : null;
                                if (b8 != null) {
                                    LinkedHashMap linkedHashMap3 = b8.b;
                                    if (str13 != null && map16 != null) {
                                        PlacemarkMapObject placemarkMapObject3 = (PlacemarkMapObject) linkedHashMap3.get(str13);
                                        if (placemarkMapObject3 == null || !placemarkMapObject3.isValid()) {
                                            linkedHashMap3.remove(str13);
                                            ((ba20) da20Var).success(null);
                                            return;
                                        }
                                        ImageProvider e = lyi.e(map16, hduVar);
                                        Object obj27 = map15.get("iconStyle");
                                        Map map17 = obj27 instanceof Map ? (Map) obj27 : null;
                                        try {
                                            placemarkMapObject3.setIcon(e, map17 != null ? lyi.c(map17) : new IconStyle());
                                        } catch (Throwable unused3) {
                                        }
                                        ((ba20) da20Var).success(null);
                                        return;
                                    }
                                }
                                ((ba20) da20Var).error("error", "setClusterAppearance: invalid args", null);
                                return;
                            }
                            break;
                        case 1671767583:
                            if (str.equals("dispose")) {
                                Map map18 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj28 = map18 != null ? map18.get("clusterCollectionId") : null;
                                String str14 = obj28 instanceof String ? (String) obj28 : null;
                                if (str14 == null) {
                                    ((ba20) da20Var).error("error", "dispose: clusterCollectionId required", null);
                                    return;
                                } else {
                                    ini0Var.e(str14, ReferenceType.CLUSTERIZED_PLACEMARK_COLLECTION);
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                            }
                            break;
                        case 1749382578:
                            if (str.equals("clusterMapObjects")) {
                                Map map19 = obj2 instanceof Map ? (Map) obj2 : null;
                                Object obj29 = map19 != null ? map19.get("clusterCollectionId") : null;
                                String str15 = obj29 instanceof String ? (String) obj29 : null;
                                r8c b9 = str15 != null ? b(str15) : null;
                                Object obj30 = map19 != null ? map19.get(Constants.KEY_DATA) : null;
                                Map map20 = obj30 instanceof Map ? (Map) obj30 : null;
                                Object obj31 = map20 != null ? map20.get("clusterRadius") : null;
                                Double d6 = obj31 instanceof Double ? (Double) obj31 : null;
                                Object obj32 = map20 != null ? map20.get("minZoom") : null;
                                Integer num = obj32 instanceof Integer ? (Integer) obj32 : null;
                                if (b9 == null || d6 == null || num == null) {
                                    ((ba20) da20Var).error("error", "clusterMapObjects: invalid args", null);
                                    return;
                                }
                                b9.b.clear();
                                b9.a.clusterPlacemarks(d6.doubleValue(), num.intValue());
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                return;
            case 1:
                ini0 ini0Var2 = (ini0) obj;
                fmj fmjVar = (fmj) this.w;
                Object obj33 = x920Var.b;
                String str16 = x920Var.a;
                if (str16 != null) {
                    switch (str16.hashCode()) {
                        case -1876099403:
                            if (str16.equals("cancelRequest")) {
                                ((Navigation) fmjVar.a).cancelRequest();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1852006340:
                            if (str16.equals("suspend")) {
                                ((Navigation) fmjVar.a).suspend();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1599573024:
                            if (str16.equals("resolveUri")) {
                                ((Navigation) fmjVar.a).resolveUri((String) obj33);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1513183843:
                            if (str16.equals("getAnnotationLanguage")) {
                                ((ba20) da20Var).success(((Navigation) fmjVar.a).getAnnotationLanguage().name().toLowerCase(Locale.ROOT));
                                return;
                            }
                            break;
                        case -1186885158:
                            if (str16.equals("startGuidance")) {
                                String str17 = (String) obj33;
                                ((Navigation) fmjVar.a).startGuidance(str17 != null ? (DrivingRoute) ini0Var2.c(str17, ReferenceType.DRIVING_ROUTE) : null);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -934426579:
                            if (str16.equals("resume")) {
                                ((Navigation) fmjVar.a).resume();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -805754503:
                            if (str16.equals("resetRoutes")) {
                                ((Navigation) fmjVar.a).resetRoutes();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -743897532:
                            if (str16.equals("clearState")) {
                                this.x = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -715967763:
                            if (str16.equals("isAvoidTolls")) {
                                ((ba20) da20Var).success(Boolean.valueOf(((Navigation) fmjVar.a).getAvoidanceFlags().getAvoidTolls()));
                                return;
                            }
                            break;
                        case 3237136:
                            if (str16.equals("init")) {
                                if (!fmjVar.a()) {
                                    fmjVar.a = NavigationFactory.createNavigation(DrivingRouterType.COMBINED);
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 167459605:
                            if (str16.equals("requestHdRoutes")) {
                                Map map21 = (Map) obj33;
                                ((Navigation) fmjVar.a).requestHdRoutes(lyi.j((Map) map21.get("requestRoute")), new RouteOptions((Double) map21.get("initialAzimuth"), (Integer) map21.get("routesCount")));
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 173046036:
                            if (str16.equals("saveState")) {
                                this.x = NavigationSerialization.serialize((Navigation) fmjVar.a);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 770882112:
                            if (str16.equals("getRoutes")) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<DrivingRoute> it3 = ((Navigation) fmjVar.a).getRoutes().iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(ini0Var2.a(ReferenceType.DRIVING_ROUTE, it3.next()));
                                }
                                ((ba20) da20Var).success(arrayList);
                                return;
                            }
                            break;
                        case 944675540:
                            if (str16.equals("setVehicleOptions")) {
                                ((Navigation) fmjVar.a).setVehicleOptions(lyi.m((Map) obj33));
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1023027113:
                            if (str16.equals("setAnnotationLanguage")) {
                                ((Navigation) fmjVar.a).setAnnotationLanguage(AnnotationLanguage.valueOf(((String) obj33).toUpperCase(Locale.ROOT)));
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1370295993:
                            if (str16.equals("requestRoutes")) {
                                Map map22 = (Map) obj33;
                                ((Navigation) fmjVar.a).requestRoutes(lyi.j((Map) map22.get("requestRoute")), new RouteOptions((Double) map22.get("initialAzimuth"), (Integer) map22.get("routesCount")));
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1637903011:
                            if (str16.equals("restoreState")) {
                                byte[] bArr = (byte[]) this.x;
                                if (bArr == null) {
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                                Navigation deserialize = NavigationSerialization.deserialize(bArr);
                                if (deserialize == null) {
                                    ny61.r("Navigation deserialization failed");
                                    return;
                                }
                                fmjVar.a = deserialize;
                                this.x = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1671767583:
                            if (str16.equals("dispose")) {
                                fmjVar.a = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1807693178:
                            if (str16.equals("stopGuidance")) {
                                ((Navigation) fmjVar.a).stopGuidance();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1884109861:
                            if (str16.equals("setAvoidTolls")) {
                                ((Navigation) fmjVar.a).getAvoidanceFlags().setAvoidTolls(((Boolean) obj33).booleanValue());
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1884828360:
                            if (str16.equals("getVehicleOptions")) {
                                VehicleOptions vehicleOptions = ((Navigation) fmjVar.a).getVehicleOptions();
                                ((ba20) da20Var).success(b.i(new Pair("vehicleType", vehicleOptions.getVehicleType().name().toLowerCase(Locale.ROOT)), new Pair("weight", vehicleOptions.getWeight()), new Pair("axleWeight", vehicleOptions.getAxleWeight()), new Pair("maxWeight", vehicleOptions.getMaxWeight()), new Pair("height", vehicleOptions.getHeight()), new Pair("width", vehicleOptions.getWidth()), new Pair("length", vehicleOptions.getLength()), new Pair("payload", vehicleOptions.getPayload()), new Pair("ecoClass", vehicleOptions.getEcoClass()), new Pair("hasTrailer", vehicleOptions.getHasTrailer()), new Pair("buswayPermitted", vehicleOptions.getBuswayPermitted())));
                                return;
                            }
                            break;
                        case 1909438101:
                            if (str16.equals("requestAlternatives")) {
                                DrivingRoute currentRoute = ((Navigation) fmjVar.a).getGuidance().getCurrentRoute();
                                if (currentRoute == null || currentRoute.getMetadata().getFlags().getPredicted()) {
                                    ny61.r("No active route");
                                    return;
                                } else {
                                    ((Navigation) fmjVar.a).requestAlternatives();
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                return;
            case 2:
                ssr ssrVar = (ssr) obj;
                eu00 eu00Var = (eu00) this.x;
                String str18 = x920Var.a;
                if (str18 != null) {
                    int hashCode = str18.hashCode();
                    if (hashCode != -1336101728) {
                        if (hashCode != 125099463) {
                            if (hashCode == 828700799 && str18.equals("createTexture")) {
                                int intValue = ((Number) x920Var.a("width")).intValue();
                                int intValue2 = ((Number) x920Var.a("height")).intValue();
                                e40 e40Var = (e40) this.w;
                                ht00 ht00Var = new ht00(ssrVar, e40Var);
                                if (ht00Var.b != null) {
                                    ny61.r("already initialized");
                                    return;
                                }
                                ht00Var.b = ((f) ssrVar.d).c();
                                MapTexture mapTexture = new MapTexture(ssrVar.a, intValue, intValue2);
                                ht00Var.c = mapTexture;
                                wsr wsrVar = ht00Var.b;
                                if (wsrVar == null) {
                                    wsrVar = null;
                                }
                                mapTexture.setTexture(wsrVar.b.surfaceTexture(), intValue, intValue2);
                                e40Var.a.add(ht00Var);
                                Lifecycle lifecycle = e40Var.b;
                                if ((lifecycle != null ? lifecycle.b() : null) == Lifecycle.State.RESUMED) {
                                    ht00Var.onStart();
                                }
                                wsr wsrVar2 = ht00Var.b;
                                long j = (wsrVar2 == null ? null : wsrVar2).a;
                                eu00Var.a = ht00Var;
                                ((ba20) da20Var).success(Long.valueOf(j));
                                return;
                            }
                        } else if (str18.equals("resizeTexture")) {
                            int intValue3 = ((Number) x920Var.a("width")).intValue();
                            int intValue4 = ((Number) x920Var.a("height")).intValue();
                            ht00 ht00Var2 = (ht00) eu00Var.a;
                            wsr wsrVar3 = ht00Var2.b;
                            if (wsrVar3 == null) {
                                wsrVar3 = null;
                            }
                            wsrVar3.b.surfaceTexture().setDefaultBufferSize(intValue3, intValue4);
                            MapTexture mapTexture2 = ht00Var2.c;
                            if (mapTexture2 == null) {
                                mapTexture2 = null;
                            }
                            mapTexture2.onTextureSizeChanged(intValue3, intValue4);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                    } else if (str18.equals("onTouch")) {
                        Map map23 = (Map) x920Var.b;
                        int intValue5 = ((Integer) map23.get("type")).intValue();
                        long longValue = ((Number) map23.get(RemoteBioParameters.TIME)).longValue();
                        List<Map> list2 = (List) map23.get("events");
                        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                        for (Map map24 : list2) {
                            arrayList2.add(new zyz0(((Double) map24.get(RemoteBioParameters.X)).doubleValue(), ((Double) map24.get(RemoteBioParameters.Y)).doubleValue(), ((Integer) map24.get("index")).intValue()));
                        }
                        DisplayMetrics displayMetrics = ssrVar.a.getResources().getDisplayMetrics();
                        Integer num2 = intValue5 != 0 ? intValue5 != 1 ? intValue5 != 2 ? intValue5 != 3 ? null : 3 : 1 : 2 : 0;
                        if (num2 != null) {
                            int intValue6 = num2.intValue();
                            int size = arrayList2.size();
                            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[size];
                            for (int i4 = 0; i4 < size; i4++) {
                                zyz0 zyz0Var = (zyz0) arrayList2.get(i4);
                                MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                                float f2 = (float) zyz0Var.a;
                                float f3 = displayMetrics.density;
                                pointerCoords.x = f2 * f3;
                                pointerCoords.y = ((float) zyz0Var.b) * f3;
                                pointerCoordsArr[i4] = pointerCoords;
                            }
                            int size2 = arrayList2.size();
                            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[size2];
                            for (int i5 = 0; i5 < size2; i5++) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((zyz0) arrayList2.get(i5)).c;
                                pointerPropertiesArr[i5] = pointerProperties;
                            }
                            motionEvent = MotionEvent.obtain(longValue, longValue, intValue6, arrayList2.size(), pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                        } else {
                            motionEvent = null;
                        }
                        ht00 ht00Var3 = (ht00) eu00Var.a;
                        if (motionEvent != null) {
                            MapTexture mapTexture3 = ht00Var3.c;
                            if (mapTexture3 == null) {
                                mapTexture3 = null;
                            }
                            mapTexture3.onTouchEvent(motionEvent);
                            motionEvent.recycle();
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                }
                ((ba20) da20Var).notImplemented();
                return;
            case 3:
                c(x920Var, da20Var);
                return;
            default:
                ini0 ini0Var3 = (ini0) obj;
                f311 f311Var = (f311) this.w;
                Object obj34 = x920Var.b;
                String str19 = x920Var.a;
                if (str19 != null) {
                    switch (str19.hashCode()) {
                        case -1876099403:
                            if (str19.equals("cancelRequest")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).cancelRequest();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1852006340:
                            if (str19.equals("suspend")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).suspend();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1599573024:
                            if (str19.equals("resolveUri")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).resolveUri((String) obj34);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -1186885158:
                            if (str19.equals("startGuidance")) {
                                String str20 = (String) obj34;
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).startGuidance(str20 != null ? (Route) ini0Var3.c(str20, ReferenceType.TRANSPORT_ROUTE) : null);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -934426579:
                            if (str19.equals("resume")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).resume();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -805754503:
                            if (str19.equals("resetRoutes")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).resetRoutes();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -743897532:
                            if (str19.equals("clearState")) {
                                this.x = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case -75106384:
                            if (str19.equals("getType")) {
                                ((ba20) da20Var).success(((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getType().name().toLowerCase(Locale.ROOT));
                                return;
                            }
                            break;
                        case 3237136:
                            if (str19.equals("init")) {
                                Type valueOf = Type.valueOf(((String) obj34).toUpperCase(Locale.ROOT));
                                if (!f311Var.a()) {
                                    f311Var.a = com.yandex.mapkit.navigation.transport.NavigationFactory.createNavigation(valueOf);
                                }
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 173046036:
                            if (str19.equals("saveState")) {
                                this.x = com.yandex.mapkit.navigation.transport.NavigationSerialization.serialize((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a);
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 770882112:
                            if (str19.equals("getRoutes")) {
                                List<Route> routes = ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).getRoutes();
                                ArrayList arrayList3 = new ArrayList(tcc.n(routes, 10));
                                Iterator<T> it4 = routes.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(ini0Var3.a(ReferenceType.TRANSPORT_ROUTE, (Route) it4.next()));
                                }
                                ((ba20) da20Var).success(arrayList3);
                                return;
                            }
                            break;
                        case 1370295993:
                            if (str19.equals("requestRoutes")) {
                                Map map25 = (Map) obj34;
                                ArrayList j2 = lyi.j((Map) map25.get("requestRoute"));
                                Map map26 = (Map) map25.get("transportOptions");
                                Map map27 = (Map) map26.get("transitOptions");
                                int intValue7 = ((Integer) map27.get("avoid")).intValue();
                                Map map28 = (Map) map27.get("timeOptions");
                                Number number = (Number) map28.get("departureTime");
                                Long valueOf2 = number != null ? Long.valueOf(number.longValue()) : null;
                                Number number2 = (Number) map28.get("arrivalTime");
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).requestRoutes(j2, new TransportOptions(new TransitOptions(intValue7, new TimeOptions(valueOf2, number2 != null ? Long.valueOf(number2.longValue()) : null)), (Integer) map26.get("routesCount")));
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1637903011:
                            if (str19.equals("restoreState")) {
                                byte[] bArr2 = (byte[]) this.x;
                                if (bArr2 == null) {
                                    ((ba20) da20Var).success(null);
                                    return;
                                }
                                com.yandex.mapkit.navigation.transport.Navigation deserialize2 = com.yandex.mapkit.navigation.transport.NavigationSerialization.deserialize(bArr2);
                                if (deserialize2 == null) {
                                    ny61.r("Navigation deserialization failed");
                                    return;
                                }
                                f311Var.a = deserialize2;
                                this.x = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1671767583:
                            if (str19.equals("dispose")) {
                                f311Var.a = null;
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                        case 1807693178:
                            if (str19.equals("stopGuidance")) {
                                ((com.yandex.mapkit.navigation.transport.Navigation) f311Var.a).stopGuidance();
                                ((ba20) da20Var).success(null);
                                return;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                return;
        }
    }

    public q8c(ssr ssrVar, ini0 ini0Var, f311 f311Var) {
        super(ssrVar, "transport_navigation");
        this.c = ini0Var;
        this.w = f311Var;
    }

    public q8c(ssr ssrVar, ini0 ini0Var, fmj fmjVar) {
        super(ssrVar, "directions_navigation");
        this.c = ini0Var;
        this.w = fmjVar;
    }

    public q8c(ssr ssrVar, eu00 eu00Var, List list) {
        super(ssrVar, "map_view");
        this.c = eu00Var;
        this.x = list;
    }

    public q8c(ssr ssrVar, ini0 ini0Var, hdu hduVar, List list) {
        super(ssrVar, "clusterized_map_objects_collection");
        this.c = ini0Var;
        this.w = hduVar;
        this.x = list;
    }
}
