package ru.yandex.taxi.logistics.deliveries.map.android;

import android.graphics.PointF;
import android.view.ViewGroup;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.apf;
import defpackage.bvf0;
import defpackage.bxa0;
import defpackage.cxa0;
import defpackage.f4c0;
import defpackage.gji;
import defpackage.gxa0;
import defpackage.ha91;
import defpackage.hxa0;
import defpackage.i0c0;
import defpackage.ike;
import defpackage.j0c0;
import defpackage.jl40;
import defpackage.lp00;
import defpackage.nji;
import defpackage.nxa0;
import defpackage.o400;
import defpackage.oji;
import defpackage.pji;
import defpackage.pzt0;
import defpackage.qfl0;
import defpackage.rfl0;
import defpackage.rji;
import defpackage.rm91;
import defpackage.sdi;
import defpackage.sf00;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tji;
import defpackage.uf00;
import defpackage.uji;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.vf00;
import defpackage.vji;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.wji;
import defpackage.xji;
import defpackage.xm00;
import defpackage.xw31;
import defpackage.yji;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.widget.TooltipPointerDrawer$Direction;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes5.dex */
public final class a {
    public final qfl0 a;
    public final rji b;
    public final bxa0 c;
    public final apf d;

    public a(qfl0 qfl0Var, rji rjiVar, bxa0 bxa0Var, apf apfVar) {
        this.a = qfl0Var;
        this.b = rjiVar;
        this.c = bxa0Var;
        this.d = apfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0390 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nxa0 nxa0Var) {
        boolean z;
        LinkedHashSet linkedHashSet;
        lp00 lp00Var;
        Participant participant;
        char c;
        Participant participant2;
        f4c0 f4c0Var;
        char c2;
        Set set;
        Iterator it;
        apf apfVar;
        bxa0 bxa0Var;
        sdi sdiVar;
        f4c0 a;
        f4c0 f4c0Var2;
        sdi sdiVar2;
        Double d;
        apf apfVar2 = this.d;
        LinkedHashSet linkedHashSet2 = (LinkedHashSet) apfVar2.x;
        LinkedHashSet linkedHashSet3 = (LinkedHashSet) apfVar2.x;
        lp00 lp00Var2 = (lp00) apfVar2.b;
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var2).j((Participant) it2.next());
        }
        linkedHashSet2.clear();
        boolean z2 = nxa0Var.d;
        bxa0 bxa0Var2 = this.c;
        bxa0Var2.c = z2;
        f4c0 f4c0Var3 = bxa0Var2.d;
        if (f4c0Var3 != null) {
            f4c0Var3.i(z2);
        }
        cxa0 cxa0Var = nxa0Var.b;
        if (cxa0Var != null) {
            double d2 = cxa0Var.a;
            hxa0 hxa0Var = bxa0Var2.a;
            xm00 xm00Var = bxa0Var2.b;
            if (cxa0Var.equals(bxa0Var2.e)) {
                z = z2;
                linkedHashSet = linkedHashSet3;
                lp00Var = lp00Var2;
            } else {
                boolean z3 = bxa0Var2.c;
                f4c0 f4c0Var4 = bxa0Var2.d;
                n0 n0Var = hxa0Var.e;
                sdi sdiVar3 = hxa0Var.b;
                if (f4c0Var4 == null) {
                    z = z2;
                    lp00Var = lp00Var2;
                    sdiVar2 = sdiVar3;
                    f4c0Var4 = new f4c0(new Point(), null, 6);
                    f4c0Var4.k(7.0f);
                } else {
                    z = z2;
                    lp00Var = lp00Var2;
                    sdiVar2 = sdiVar3;
                }
                hxa0Var.d = f4c0Var4;
                f4c0Var4.i(z3);
                Double d3 = cxa0Var.c;
                double d4 = cxa0Var.b;
                linkedHashSet = linkedHashSet3;
                rm91 rm91Var = cxa0Var.d;
                f4c0Var4.o(new Point(d2, d4));
                f4c0Var4.v(d3 != null ? (float) d3.doubleValue() : 0.0f);
                if (rm91Var instanceof i0c0) {
                    pzt0 pzt0Var = hxa0Var.f;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    int i = gxa0.a[((i0c0) rm91Var).b.ordinal()];
                    if (i == 1) {
                        ImageProvider imageProvider = (ImageProvider) ((ru.yandex.taxi.logistics.deliveries.map.data.a) sdiVar2).d.getValue();
                        IconStyle rotationType = new IconStyle().setRotationType(RotationType.NO_ROTATION);
                        f4c0 f4c0Var5 = hxa0Var.d;
                        if (f4c0Var5 != null) {
                            f4c0Var5.y(imageProvider);
                            f4c0Var5.D(rotationType);
                        }
                    } else {
                        if (i != 2) {
                            w511.b();
                            return;
                        }
                        ImageProvider imageProvider2 = (ImageProvider) ((ru.yandex.taxi.logistics.deliveries.map.data.a) sdiVar2).e.getValue();
                        IconStyle rotationType2 = new IconStyle().setRotationType(RotationType.NO_ROTATION);
                        f4c0 f4c0Var6 = hxa0Var.d;
                        if (f4c0Var6 != null) {
                            f4c0Var6.y(imageProvider2);
                            f4c0Var6.D(rotationType2);
                        }
                    }
                    d = d3;
                } else {
                    if (!(rm91Var instanceof j0c0)) {
                        w511.b();
                        return;
                    }
                    pzt0 pzt0Var2 = hxa0Var.f;
                    if (pzt0Var2 == null || !pzt0Var2.isActive()) {
                        d = d3;
                        hxa0Var.f = tje.N(hxa0Var.a, null, null, new PerformerPlacemarkUpdater$enableImageLoading$$inlined$safeCollectIn$1(e.I(e.t(n0Var), new PerformerPlacemarkUpdater$enableImageLoading$1(hxa0Var, null)), null, hxa0Var), 3);
                    } else {
                        d = d3;
                    }
                    n0Var.g(rm91Var);
                }
                bxa0Var2.e = cxa0Var;
                if (bxa0Var2.d == null) {
                    bxa0Var2.d = f4c0Var4;
                    xm00Var.getClass();
                    f4c0Var4.b(xm00Var);
                }
                if (cxa0Var.f) {
                    boolean z4 = bxa0Var2.c;
                    f4c0 f4c0Var7 = bxa0Var2.f;
                    if (f4c0Var7 == null) {
                        f4c0Var7 = new f4c0(new Point(), null, 6);
                        f4c0Var7.k(8.0f);
                    }
                    f4c0Var7.i(z4);
                    f4c0Var7.o(new Point(d2, d4));
                    f4c0Var7.v(d != null ? (float) d.doubleValue() : 0.0f);
                    String str = cxa0Var.e;
                    if (str != null) {
                        ru.yandex.taxi.logistics.deliveries.map.data.a aVar = (ru.yandex.taxi.logistics.deliveries.map.data.a) sdiVar2;
                        aVar.getClass();
                        TooltipView tooltipView = new TooltipView(aVar.a, null, 0, 6, null);
                        tooltipView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        tooltipView.setText(str);
                        tooltipView.setPointerDirection(TooltipPointerDrawer$Direction.DOWN);
                        xw31.r(tooltipView);
                        f4c0Var7.y(ImageProvider.fromBitmap(xw31.t(tooltipView)));
                    }
                    f4c0Var7.D(new IconStyle().setRotationType(RotationType.NO_ROTATION).setAnchor(new PointF(0.5f, 1.0f)));
                    if (bxa0Var2.f == null) {
                        bxa0Var2.f = f4c0Var7;
                        xm00Var.getClass();
                        f4c0Var7.b(xm00Var);
                    }
                } else {
                    f4c0 f4c0Var8 = bxa0Var2.f;
                    if (f4c0Var8 != null) {
                        xm00Var.o(f4c0Var8);
                        bxa0Var2.f = null;
                    }
                }
            }
        } else {
            z = z2;
            linkedHashSet = linkedHashSet3;
            lp00Var = lp00Var2;
            bxa0Var2.a();
        }
        ArrayList arrayList = nxa0Var.c;
        rji rjiVar = this.b;
        rjiVar.getClass();
        oji ojiVar = rjiVar.c;
        LinkedHashMap linkedHashMap = rjiVar.b;
        Set N0 = kotlin.collections.a.N0(arrayList);
        Set keySet = linkedHashMap.keySet();
        Set g = v4r0.g(N0, keySet);
        Set<yji> g2 = v4r0.g(keySet, N0);
        Iterator it3 = g.iterator();
        while (it3.hasNext()) {
            yji yjiVar = (yji) it3.next();
            pji pjiVar = (pji) rjiVar.a.get();
            oji ojiVar2 = pjiVar.c;
            linkedHashMap.put(yjiVar, pjiVar);
            xm00 xm00Var2 = pjiVar.b;
            if (jl40.l(pjiVar.e, yjiVar)) {
                apfVar = apfVar2;
                set = g2;
                bxa0Var = bxa0Var2;
                it = it3;
                c2 = 0;
            } else {
                pjiVar.e = yjiVar;
                pjiVar.a();
                tji tjiVar = pjiVar.a;
                nji njiVar = pjiVar.d;
                c2 = 0;
                sdi sdiVar4 = tjiVar.a;
                set = g2;
                ike ikeVar = tjiVar.d;
                it = it3;
                f4c0 f4c0Var9 = njiVar.a;
                if (f4c0Var9 == null) {
                    sdiVar = sdiVar4;
                    apfVar = apfVar2;
                    bxa0Var = bxa0Var2;
                    f4c0Var9 = new f4c0(new Point(), null, 6);
                    f4c0Var9.k(6.0f);
                } else {
                    apfVar = apfVar2;
                    bxa0Var = bxa0Var2;
                    sdiVar = sdiVar4;
                }
                double d5 = yjiVar.a;
                ha91 ha91Var = yjiVar.c;
                f4c0Var9.o(new Point(d5, yjiVar.b));
                if (ha91Var.equals(xji.b)) {
                    DeliveryPinUpdater$updateDeliveryPin$1 deliveryPinUpdater$updateDeliveryPin$1 = new DeliveryPinUpdater$updateDeliveryPin$1(1, tjiVar.a, sdi.class, "getSourceImageProvider", "getSourceImageProvider(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    pzt0 pzt0Var3 = tjiVar.e;
                    if (pzt0Var3 != null) {
                        pzt0Var3.a(null);
                    }
                    tjiVar.e = tje.N(ikeVar, null, null, new DeliveryPinUpdater$loadIcon$1(deliveryPinUpdater$updateDeliveryPin$1, f4c0Var9, null), 3);
                    a = tjiVar.a(yjiVar, njiVar);
                } else {
                    if (ha91Var.equals(uji.b)) {
                        f4c0Var9.y((ImageProvider) ((ru.yandex.taxi.logistics.deliveries.map.data.a) sdiVar).g.getValue());
                    } else if (ha91Var.equals(wji.b)) {
                        DeliveryPinUpdater$updateDeliveryPin$2 deliveryPinUpdater$updateDeliveryPin$2 = new DeliveryPinUpdater$updateDeliveryPin$2(1, tjiVar.a, sdi.class, "getDestinationImageProvider", "getDestinationImageProvider(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                        pzt0 pzt0Var4 = tjiVar.e;
                        if (pzt0Var4 != null) {
                            pzt0Var4.a(null);
                        }
                        tjiVar.e = tje.N(ikeVar, null, null, new DeliveryPinUpdater$loadIcon$1(deliveryPinUpdater$updateDeliveryPin$2, f4c0Var9, null), 3);
                        a = tjiVar.a(yjiVar, njiVar);
                    } else {
                        if (!(ha91Var instanceof vji)) {
                            w511.b();
                            return;
                        }
                        vji vjiVar = (vji) ha91Var;
                        if (vjiVar.d == null) {
                            ImageProvider a2 = ((ru.yandex.taxi.logistics.deliveries.map.data.a) sdiVar).a(null, vjiVar.b, vjiVar.c);
                            if (a2 != null) {
                                f4c0Var9.y(a2);
                            }
                        } else {
                            pzt0 pzt0Var5 = tjiVar.e;
                            if (pzt0Var5 != null) {
                                pzt0Var5.a(null);
                            }
                            tjiVar.e = tje.N(ikeVar, null, null, new DeliveryPinUpdater$loadBubbleImage$1(tjiVar, vjiVar.d, vjiVar.b, vjiVar.c, f4c0Var9, null), 3);
                        }
                    }
                    f4c0Var2 = null;
                    nji njiVar2 = new nji(f4c0Var9, f4c0Var2);
                    xm00Var2.getClass();
                    f4c0Var9.b(xm00Var2);
                    if (f4c0Var2 != null) {
                        f4c0Var2.b(xm00Var2);
                    }
                    pjiVar.d = njiVar2;
                    boolean booleanValue = ((Boolean) ojiVar2.getValue(pjiVar, pji.f[0])).booleanValue();
                    f4c0Var9.i(booleanValue);
                    if (f4c0Var2 == null) {
                        f4c0Var2.i(booleanValue);
                    }
                }
                f4c0Var2 = a;
                nji njiVar22 = new nji(f4c0Var9, f4c0Var2);
                xm00Var2.getClass();
                f4c0Var9.b(xm00Var2);
                if (f4c0Var2 != null) {
                }
                pjiVar.d = njiVar22;
                boolean booleanValue2 = ((Boolean) ojiVar2.getValue(pjiVar, pji.f[0])).booleanValue();
                f4c0Var9.i(booleanValue2);
                if (f4c0Var2 == null) {
                }
            }
            Boolean bool = (Boolean) ojiVar.getValue(rjiVar, rji.d[c2]);
            bool.booleanValue();
            ojiVar2.setValue(pjiVar, pji.f[c2], bool);
            bxa0Var2 = bxa0Var;
            g2 = set;
            it3 = it;
            apfVar2 = apfVar;
        }
        apf apfVar3 = apfVar2;
        bxa0 bxa0Var3 = bxa0Var2;
        for (yji yjiVar2 : g2) {
            pji pjiVar2 = (pji) linkedHashMap.get(yjiVar2);
            if (pjiVar2 != null) {
                pjiVar2.a();
            }
            linkedHashMap.remove(yjiVar2);
        }
        ojiVar.setValue(rjiVar, rji.d[0], Boolean.valueOf(z));
        rfl0 rfl0Var = nxa0Var.a;
        qfl0 qfl0Var = this.a;
        qfl0Var.getClass();
        DrivingRoute drivingRoute = rfl0Var.a;
        if (drivingRoute == null) {
            qfl0Var.a();
            c = 0;
            participant = null;
        } else {
            if (qfl0Var.i == null) {
                qfl0Var.b.getClass();
                sjh sjhVar = uyj.a;
                ike a3 = bvf0.a(o400.a);
                participant = null;
                tje.N(a3, null, null, new RouteWayOnMap$draw$1$1(qfl0Var, null), 3);
                qfl0Var.i = a3;
            } else {
                participant = null;
            }
            PolylinePosition position = drivingRoute.getPosition();
            qfl0Var.j = position;
            qfl0Var.k = drivingRoute;
            w4e0 w4e0Var = qfl0Var.g;
            if (w4e0Var == null) {
                w4e0Var = qfl0Var.b(drivingRoute);
            } else if (!jl40.l(qfl0Var.h, drivingRoute.getRouteId())) {
                w4e0Var = qfl0Var.b(drivingRoute);
            }
            qfl0Var.h = drivingRoute.getRouteId();
            c = 0;
            w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), position)));
        }
        qfl0Var.f.setValue(qfl0Var, qfl0.l[c], Boolean.valueOf(z));
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            yji yjiVar3 = (yji) entry.getKey();
            pji pjiVar3 = (pji) entry.getValue();
            ha91 ha91Var2 = yjiVar3.c;
            if (ha91Var2 instanceof xji) {
                participant2 = Participant.SOURCE_POINT_PIN;
            } else if (ha91Var2 instanceof wji) {
                participant2 = Participant.DESTINATION_POINT_PIN;
            } else {
                if (!(ha91Var2 instanceof uji) && !(ha91Var2 instanceof vji)) {
                    w511.b();
                    return;
                }
                participant2 = participant;
            }
            if (participant2 != null && (f4c0Var = pjiVar3.d.a) != null) {
                mapBuilder.put(participant2, f4c0Var);
            }
        }
        MapBuilder j = mapBuilder.j();
        f4c0 f4c0Var10 = bxa0Var3.d;
        Object it4 = ((vf00) j.entrySet()).iterator();
        while (((uf00) it4).hasNext()) {
            Map.Entry entry2 = (Map.Entry) ((sf00) it4).next();
            Participant participant3 = (Participant) entry2.getKey();
            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).a(participant3, new gji(apfVar3, (f4c0) entry2.getValue(), participant3));
            linkedHashSet.add(participant3);
        }
        LinkedHashSet linkedHashSet4 = linkedHashSet;
        if (f4c0Var10 != null) {
            Participant participant4 = Participant.CAR_ICON;
            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).a(participant4, new gji(apfVar3, f4c0Var10, participant4));
            linkedHashSet4.add(participant4);
        }
    }
}
