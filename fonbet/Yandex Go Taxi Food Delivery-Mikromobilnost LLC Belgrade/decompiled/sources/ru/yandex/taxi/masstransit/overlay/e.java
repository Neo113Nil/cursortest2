package ru.yandex.taxi.masstransit.overlay;

import android.content.Context;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.transport.masstransit.MasstransitVehicleTapListener;
import com.yandex.mapkit.transport.masstransit.VehicleData;
import defpackage.a631;
import defpackage.ah00;
import defpackage.cyx;
import defpackage.czo0;
import defpackage.e331;
import defpackage.e631;
import defpackage.fz00;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.i631;
import defpackage.j631;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uel0;
import defpackage.uhx;
import defpackage.wx11;
import defpackage.xth;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes6.dex */
public final class e {
    public final ah00 a;
    public final fz00 b;
    public final e631 c;
    public final cyx d;
    public uhx e;
    public final hbp0 f;
    public final ru.yandex.taxi.masstransit.overlay.icons.b g;
    public final j631 h;
    public final i631 i;
    public String j;
    public boolean k;
    public Map l;
    public float m;
    public final LinkedHashMap n;

    /* JADX WARN: Type inference failed for: r8v2, types: [i631] */
    public e(Context context, tt2 tt2Var, pdc pdcVar, ah00 ah00Var, fz00 fz00Var, e631 e631Var, cyx cyxVar) {
        this.a = ah00Var;
        this.b = fz00Var;
        this.c = e631Var;
        this.d = cyxVar;
        hbp0 hbp0Var = new hbp0(new czo0(14), "", null);
        this.f = hbp0Var;
        this.g = new ru.yandex.taxi.masstransit.overlay.icons.b(context, hbp0Var, tt2Var, e631Var, pdcVar);
        this.h = new j631(this);
        xth xthVar = new xth(2, this);
        this.i = new MasstransitVehicleTapListener() { // from class: i631
            @Override // com.yandex.mapkit.transport.masstransit.MasstransitVehicleTapListener
            public final boolean onVehicleTap(VehicleData vehicleData) {
                e eVar = e.this;
                String name = eVar.d.b.a().a.name();
                uhx uhxVar = eVar.e;
                if (uhxVar == null) {
                    jst.e.getClass();
                    return true;
                }
                String id = vehicleData.getLine().getId();
                String id2 = vehicleData.getId();
                String lowerCase = name.toLowerCase(Locale.ROOT);
                m010 m010Var = (m010) uhxVar.b;
                m010Var.b.a("Map.TransportVehicle.Tapped", new ib8(3, id, id2, lowerCase));
                l010 l010Var = (l010) a.a0(m010Var.e);
                if (l010Var == null) {
                    return true;
                }
                l010Var.a(id, id2);
                return true;
            }
        };
        this.j = "";
        this.l = kotlin.collections.b.f();
        gh00 gh00Var = (gh00) ah00Var;
        this.m = gh00Var.j();
        this.n = new LinkedHashMap();
        gh00Var.e(xthVar);
    }

    public static final void a(e eVar, PlacemarkMapObject placemarkMapObject, VehicleData vehicleData) {
        Object obj;
        VariantStyle.a aVar;
        if (placemarkMapObject.isValid() && vehicleData.isValid()) {
            uel0 uel0Var = RouteType.Companion;
            String str = (String) kotlin.collections.a.P(vehicleData.getLine().getVehicleTypes());
            uel0Var.getClass();
            RouteType a = uel0.a(str);
            VariantStyle variantStyle = (VariantStyle) eVar.l.get(a.getType());
            if (variantStyle == null) {
                return;
            }
            float currentAzimuth = ((vehicleData.getCurrentAzimuth() - ((gh00) eVar.a).e.c.getAzimuth()) + 360.0f) % 360.0f;
            if (placemarkMapObject.getUserData() == null) {
                placemarkMapObject.setVisible(false);
            }
            boolean l = jl40.l(eVar.j, vehicleData.getId());
            Object obj2 = null;
            if (eVar.k && l) {
                Iterator it = variantStyle.b.iterator();
                if (!it.hasNext()) {
                    ny61.p();
                    return;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    float a2 = ((VariantStyle.a) next).a.a();
                    do {
                        Object next2 = it.next();
                        float a3 = ((VariantStyle.a) next2).a.a();
                        if (Float.compare(a2, a3) < 0) {
                            next = next2;
                            a2 = a3;
                        }
                    } while (it.hasNext());
                }
                aVar = (VariantStyle.a) next;
            } else {
                float zoom = ((gh00) eVar.a).e.c.getZoom();
                List list = variantStyle.b;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    VariantStyle.b bVar = ((VariantStyle.a) obj).a;
                    float b = bVar.b();
                    if (zoom <= bVar.a() && b <= zoom) {
                        break;
                    }
                }
                VariantStyle.a aVar2 = (VariantStyle.a) obj;
                if (aVar2 == null) {
                    Iterator it3 = list.iterator();
                    if (!it3.hasNext()) {
                        ny61.p();
                        return;
                    }
                    Object next3 = it3.next();
                    if (it3.hasNext()) {
                        float b2 = ((VariantStyle.a) next3).a.b();
                        do {
                            Object next4 = it3.next();
                            float b3 = ((VariantStyle.a) next4).a.b();
                            if (Float.compare(b2, b3) > 0) {
                                next3 = next4;
                                b2 = b3;
                            }
                        } while (it3.hasNext());
                    }
                    aVar2 = (VariantStyle.a) next3;
                    Iterator it4 = list.iterator();
                    if (!it4.hasNext()) {
                        ny61.p();
                        return;
                    }
                    Object next5 = it4.next();
                    if (it4.hasNext()) {
                        float a4 = ((VariantStyle.a) next5).a.a();
                        do {
                            Object next6 = it4.next();
                            float a5 = ((VariantStyle.a) next6).a.a();
                            if (Float.compare(a4, a5) < 0) {
                                next5 = next6;
                                a4 = a5;
                            }
                        } while (it4.hasNext());
                    }
                    VariantStyle.a aVar3 = (VariantStyle.a) next5;
                    if (zoom >= aVar2.a.b()) {
                        aVar = aVar3;
                    }
                }
                aVar = aVar2;
            }
            VariantStyle.a aVar4 = aVar;
            ru.yandex.taxi.masstransit.overlay.icons.b bVar2 = eVar.g;
            String name = vehicleData.getLine().getName();
            Iterator it5 = variantStyle.b.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next7 = it5.next();
                if (((VariantStyle.a) next7).b == VariantStyle.VariantType.MARK) {
                    obj2 = next7;
                    break;
                }
            }
            bVar2.c(a, variantStyle, placemarkMapObject, name, aVar4, (VariantStyle.a) obj2, currentAzimuth, l);
        }
    }

    public final void b() {
        this.f.b();
        this.j = "";
        this.k = false;
        this.l = kotlin.collections.b.f();
        this.b.b(new wx11(22, this), false);
    }

    public final void c(Map map, List list, boolean z) {
        String str;
        boolean z2;
        pzt0 pzt0Var;
        Object obj;
        Object obj2;
        this.f.f();
        this.l = map;
        List list2 = list;
        if (list2.isEmpty()) {
            str = "";
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (!jl40.l(((a631) obj2).b, "")) {
                        break;
                    }
                }
            }
            a631 a631Var = (a631) obj2;
            if (a631Var == null) {
                a631Var = (a631) kotlin.collections.a.P(list);
            }
            str = a631Var.b;
        }
        if (!list2.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (!jl40.l(((a631) obj).c, "")) {
                        break;
                    }
                }
            }
            a631 a631Var2 = (a631) obj;
            if (a631Var2 == null) {
                a631Var2 = (a631) kotlin.collections.a.P(list);
            }
            if (a631Var2.c.length() > 0) {
                z2 = true;
                this.j = str;
                this.k = !z || z2;
                d dVar = (d) this.c;
                pzt0Var = dVar.f;
                int i = 3;
                if (pzt0Var != null || !pzt0Var.isActive()) {
                    dVar.f = tje.N(dVar.c, null, null, new VehicleVariantImageRepositoryImpl$cacheFromVariants$1(dVar, map, null), 3);
                }
                this.b.b(new e331(i, this, list), true);
            }
        }
        z2 = false;
        this.j = str;
        this.k = !z || z2;
        d dVar2 = (d) this.c;
        pzt0Var = dVar2.f;
        int i2 = 3;
        if (pzt0Var != null) {
        }
        dVar2.f = tje.N(dVar2.c, null, null, new VehicleVariantImageRepositoryImpl$cacheFromVariants$1(dVar2, map, null), 3);
        this.b.b(new e331(i2, this, list), true);
    }
}
