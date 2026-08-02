package defpackage;

import android.content.Context;
import com.yandex.go.navigator.gas_stations.pins_layer.a;
import com.yandex.go.navigator.gas_stations.pins_layer.h;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.models.api.objects.AltpinCardInfo;
import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import com.yandex.go.taxi.order.models.api.objects.a0;
import com.yandex.go.taxi.order.models.api.objects.b0;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import java.util.HashMap;
import java.util.Iterator;
import ru.yandex.taxi.altpins.AltpinSourceModalViewEntryPoint;
import ru.yandex.taxi.map.overlay.diagnostic.journal.LocationDiagnosticModalView;
import ru.yandex.taxi.order.OrderNotification$OrderNotificationType;
import ru.yandex.taxi.order.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class r58 implements MapObjectTapListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r58(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        String oid;
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                s58 s58Var = (s58) obj2;
                ft00 ft00Var = s58Var.g;
                o2y0 o2y0Var = s58Var.a;
                ft00Var.a(cta1.d(o2y0Var.c()));
                ((f) s58Var.e).b0(o2y0Var, DetailsOpenReason.MAP_OBJECT_CAR);
                break;
            case 1:
                yhn yhnVar = (yhn) obj2;
                Object userData = mapObject.getUserData();
                vj00 vj00Var = (vj00) (userData != null ? userData : null);
                if (vj00Var != null) {
                    yhnVar.x.Kg(vj00Var);
                    break;
                }
                break;
            case 2:
                a aVar = (a) obj2;
                Object userData2 = mapObject.getUserData();
                uts utsVar = userData2 instanceof uts ? (uts) userData2 : null;
                if (utsVar != null) {
                    GeoObject geoObject = utsVar.b;
                    h hVar = aVar.a;
                    hVar.getClass();
                    BusinessObjectMetadata b = jcb1.b(geoObject);
                    if (b != null && (oid = b.getOid()) != null) {
                        hVar.J.i(oid);
                    }
                    hVar.x.g.l(geoObject);
                    break;
                }
                break;
            case 3:
                f8z f8zVar = (f8z) obj2;
                w030 a = f8zVar.y.a();
                hdu hduVar = f8zVar.w;
                hduVar.getClass();
                a.s(new LocationDiagnosticModalView((Context) hduVar.a, new d8z((k8z) hduVar.b)), false);
                break;
            case 4:
                com.yandex.go.taxi.order.map_objects.f fVar = (com.yandex.go.taxi.order.map_objects.f) obj2;
                Object userData3 = mapObject.getUserData();
                String str = userData3 instanceof String ? (String) userData3 : null;
                if (str != null) {
                    f080 f080Var = fVar.w;
                    o2y0 o2y0Var2 = f080Var.x.b;
                    Iterator it = o2y0Var2.b().V().s.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((com.yandex.go.taxi.order.models.api.objects.MapObject) obj).a, str)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    com.yandex.go.taxi.order.models.api.objects.MapObject mapObject2 = (com.yandex.go.taxi.order.models.api.objects.MapObject) obj;
                    xz70 xz70Var = mapObject2 != null ? new xz70(o2y0Var2.b().a, mapObject2) : null;
                    if (xz70Var != null) {
                        String str2 = xz70Var.a;
                        com.yandex.go.taxi.order.models.api.objects.MapObject mapObject3 = xz70Var.b;
                        b0 b0Var = mapObject3.f;
                        if (b0Var != null) {
                            if (!(b0Var instanceof MapObjectAction$OpenPointAAlternative)) {
                                if (!b0Var.equals(a0.INSTANCE)) {
                                    w511.b();
                                    break;
                                }
                            } else {
                                bv1 bv1Var = f080Var.B.a;
                                bv1Var.getClass();
                                bv1Var.a.a("AltPointA.Bubble.Tap", new HashMap(), 1, new HashMap());
                                f080Var.C.a.a(y180.f(str2, OrderNotification$OrderNotificationType.ORDER_ALTERNATIVE_POINT_A_FOUND));
                                wy1 wy1Var = f080Var.A;
                                AltpinCardInfo altpinCardInfo = ((MapObjectAction$OpenPointAAlternative) b0Var).a;
                                wy1Var.getClass();
                                lz1 a2 = wy1.a(altpinCardInfo);
                                if (a2 != null) {
                                    x980 x980Var = f080Var.y;
                                    f080Var.z.getClass();
                                    f fVar2 = (f) x980Var;
                                    fVar2.E((m950) fVar2.x1.getValue(), new b02(str2, vo00.a(mapObject3), a2, AltpinSourceModalViewEntryPoint.BUBBLE), sy60.Q2, hxx.a);
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                ((oxf0) ((g3c0) obj2).y.c).run();
                break;
            case 6:
                kf00 kf00Var = ((ktk0) obj2).e.y;
                kf00Var.a.a("Map.TrafficLight.Tapped", oyr.A(kf00Var), 1, new HashMap());
                break;
            default:
                vgt0 vgt0Var = (vgt0) obj2;
                ygt0 ygt0Var = vgt0Var.C;
                Point geometry = vgt0Var.Lg().getGeometry();
                dn6 dn6Var = ygt0Var.H;
                dn6.a.getClass();
                if (dn6Var != cn6.b) {
                    ygt0Var.H.g(geometry.getLatitude(), geometry.getLongitude());
                }
                ((wgt0) ygt0Var.Dg()).v2();
                break;
        }
        return true;
    }
}
