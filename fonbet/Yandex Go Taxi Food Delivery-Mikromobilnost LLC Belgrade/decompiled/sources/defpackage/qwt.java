package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.yandex.bricks.Brick;
import com.yandex.go.address.models.Address;
import com.yandex.go.intercity.flex.dashboard.presentation.h;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.go.navigator.main_screen.i;
import com.yandex.go.navigator.repository.TimeOutMode;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.preorder.address.b;
import com.yandex.go.shortcuts.experiments.superapp_flow.SuperAppFlowExperiment;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.messaging.input.InputState;
import com.ybsdk.core.utils.ext.d;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.main.map.c;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;
import ru.yandex.taxi.preorder.interactor.g;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;
import ru.yandex.taxi.statebar.controller.a;

/* loaded from: classes12.dex */
public final class qwt implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qwt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        b7u abeVar;
        j3b j3bVar;
        Brick jumVar;
        String str;
        t53 t53Var;
        List list;
        Integer num;
        Object value;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.a) {
            case 0:
                if (((xyb0) obj) instanceof vyb0) {
                    ((c) this.b).a();
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                d dVar = (d) this.b;
                if (booleanValue) {
                    boolean z = dVar.b;
                    Context context = dVar.a;
                    abeVar = (!z || Build.VERSION.SDK_INT < 30) ? new abe(context, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0) : new e100(context);
                } else {
                    abeVar = new vnj();
                }
                dVar.c = abeVar;
                i5z0.a.a("Activate haptic feedback to " + abeVar, new Object[0]);
                break;
            case 2:
                int intValue = ((Number) obj).intValue();
                com.yandex.go.tariffcard.ui.adapter.header.d dVar2 = (com.yandex.go.tariffcard.ui.adapter.header.d) this.b;
                xw31.E(dVar2.a, null, Integer.valueOf(intValue), null, null);
                xw31.E(dVar2.d, null, Integer.valueOf(intValue), null, null);
                break;
            case 3:
                ((gqu) this.b).setCostCenterState((n470) obj);
                break;
            case 4:
                ((b) this.b).d = true;
                break;
            case 5:
                oyj0 oyj0Var = (oyj0) obj;
                com.yandex.messaging.input.c cVar = (com.yandex.messaging.input.c) this.b;
                if (oyj0Var instanceof myj0) {
                    j3b j3bVar2 = (j3b) ((myj0) oyj0Var).a;
                    cVar.getClass();
                    String str2 = j3bVar2.e;
                    if (str2 != null && ((j3bVar = cVar.g) == null || !str2.equals(j3bVar.e))) {
                        ayj0 ayj0Var = cVar.j;
                        if (ayj0Var != null) {
                            ayj0Var.close();
                        }
                        eyj0 eyj0Var = cVar.d;
                        String str3 = j3bVar2.e;
                        xen xenVar = new xen(23, cVar);
                        eyj0Var.getClass();
                        tje.e();
                        cVar.j = new ayj0(eyj0Var, str3, xenVar);
                    }
                    cVar.g = j3bVar2;
                    cVar.c();
                } else if (!(oyj0Var instanceof iyj0)) {
                    w511.b();
                    break;
                } else {
                    cVar.g = null;
                    cVar.c();
                }
                break;
            case 6:
                com.yandex.messaging.input.d dVar3 = (com.yandex.messaging.input.d) this.b;
                fk6 fk6Var = dVar3.E;
                h3y h3yVar = dVar3.z;
                switch (oyv.a[((InputState) obj).ordinal()]) {
                    case 1:
                        jumVar = new jum(new zj6(dVar3.a, objArr3 == true ? 1 : 0));
                        break;
                    case 2:
                        Object obj2 = h3yVar.get();
                        com.yandex.messaging.input.bricks.writing.d dVar4 = (com.yandex.messaging.input.bricks.writing.d) obj2;
                        dVar4.N.get().getClass();
                        dVar4.i0 = false;
                        jumVar = (Brick) obj2;
                        break;
                    case 3:
                        Object obj3 = h3yVar.get();
                        com.yandex.messaging.input.bricks.writing.d dVar5 = (com.yandex.messaging.input.bricks.writing.d) obj3;
                        dVar5.N.get().getClass();
                        dVar5.i0 = true;
                        jumVar = (Brick) obj3;
                        break;
                    case 4:
                        jumVar = (Brick) dVar3.B.get();
                        break;
                    case 5:
                        jumVar = (Brick) dVar3.C.get();
                        break;
                    case 6:
                        jumVar = (Brick) dVar3.A.get();
                        break;
                    case 7:
                        jumVar = (Brick) dVar3.y.get();
                        break;
                    case 8:
                        jumVar = (Brick) dVar3.w.get();
                        break;
                    case 9:
                        jumVar = (Brick) dVar3.x.get();
                        break;
                    case 10:
                        jumVar = (Brick) dVar3.c.get();
                        break;
                    default:
                        w511.b();
                        break;
                }
                dVar3.E = fk6Var.insert(jumVar);
                break;
            case 7:
                kew kewVar = (kew) this.b;
                kewVar.z((m950) kewVar.I.get(), new jew(kewVar, ((tew) obj).a));
                break;
            case 8:
                ((h) this.b).A.k((kr) obj);
                break;
            case 9:
                ((IntercityDashboardModalView) this.b).renderButtonsContainerShadow((Drawable) obj);
                break;
            case 10:
                ((e) this.b).R.i(Screen.INTERCITY_DASHBOARD);
                break;
            case 11:
                mnw mnwVar = (mnw) obj;
                lnw lnwVar = (lnw) this.b;
                lnwVar.getClass();
                Route route = mnwVar.a;
                lnwVar.E = route;
                if (route == null || route.getMetadata().getWeight().getWalkingDistance().getValue() > lnwVar.D) {
                    ((inw) lnwVar.Dg()).e0();
                } else {
                    ((inw) lnwVar.Dg()).m0(mnwVar.a);
                    ((inw) lnwVar.Dg()).Dc(route.getMetadata().getWeight().getTime().getValue() >= ((double) lnwVar.C));
                }
                break;
            case 12:
                bl60 bl60Var = (bl60) obj;
                boolean z2 = bl60Var.a;
                a aVar = (a) this.b;
                if (z2) {
                    a.h(aVar, new x060(bl60Var.b, bl60Var.c), bl60Var.d);
                } else if (aVar.e()) {
                    aVar.q = true;
                    if (aVar.e() && !aVar.s) {
                        aVar.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
                    }
                    aVar.f();
                }
                break;
            case 13:
                Object c = ru.yandex.taxi.order.services.d.c((ru.yandex.taxi.order.services.d) this.b, (gxq0) obj, continuation);
                if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                ((ru.yandex.taxi.linked_order.provider.h) this.b).b = (wl40) obj;
                break;
            case 15:
                is60 is60Var = (is60) obj;
                ru.yandex.taxi.preorder.tollroad.analytics.e eVar = (ru.yandex.taxi.preorder.tollroad.analytics.e) this.b;
                ptx ptxVar = eVar.c;
                if (eVar.a.f()) {
                    ptxVar.a = is60Var;
                } else {
                    ptxVar.b = is60Var;
                }
                break;
            case 16:
                ((lly) this.b).b.a((List) obj);
                break;
            case 17:
                ru.yandex.taxi.linked_order.focus.a aVar2 = (ru.yandex.taxi.linked_order.focus.a) this.b;
                n6w0 n6w0Var = aVar2.b;
                SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type = SuperAppRecenterPointRepository$Type.LINKED;
                Collection values = aVar2.c.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ycc.r(kotlin.collections.a.J0((List) it.next()), arrayList);
                }
                n6w0Var.c(superAppRecenterPointRepository$Type, kotlin.collections.a.J0(arrayList));
                break;
            case 18:
                ((mly) this.b).a((List) obj);
                break;
            case 19:
                ((nny) ((ony) this.b).Dg()).Lf();
                break;
            case 20:
                ((nny) this.b).updateBadgeText((String) obj);
                break;
            case 21:
                i8z i8zVar = (i8z) ((ru.yandex.taxi.map.overlay.diagnostic.a) this.b).Dg();
                List<yne> list2 = (List) obj;
                int d = gw00.d(tcc.n(list2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                for (yne yneVar : list2) {
                    Pair pair = new Pair(yneVar.c, yneVar.d);
                    linkedHashMap.put(pair.c(), pair.f());
                }
                w53 w53Var = new w53();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    CoordinateProvider$Source coordinateProvider$Source = (CoordinateProvider$Source) entry.getKey();
                    zzs zzsVar = (zzs) entry.getValue();
                    switch (j8z.a[coordinateProvider$Source.ordinal()]) {
                        case 1:
                            str = "gps";
                            break;
                        case 2:
                            str = "ya_lbs";
                            break;
                        case 3:
                            str = "ya_lbs_gsm";
                            break;
                        case 4:
                            str = "ya_lbs_wifi";
                            break;
                        case 5:
                            str = "ya_lbs_ip";
                            break;
                        case 6:
                            str = "mapkit";
                            break;
                        case 7:
                            str = "sys_lbs";
                            break;
                        case 8:
                            str = GplLibraryWrapper.FUSED_PROVIDER;
                            break;
                        case 9:
                            str = "zero_km";
                            break;
                        case 10:
                            str = "ridetech_location_sdk";
                            break;
                        case 11:
                            str = "ridetech_location_sdk_last_location";
                            break;
                        case 12:
                            str = "unknown";
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    Iterator it2 = ((q53) w53Var.entrySet()).iterator();
                    while (true) {
                        t53Var = (t53) it2;
                        if (t53Var.hasNext()) {
                            t53Var.next();
                            if (((zzs) t53Var.getKey()).a(zzsVar, 1.0E-4d)) {
                            }
                        } else {
                            t53Var = null;
                        }
                    }
                    if (t53Var == null || (list = (List) t53Var.getValue()) == null) {
                        w53Var.put(zzsVar, scc.c(str));
                    } else {
                        list.add(str);
                    }
                }
                Set entrySet = w53Var.entrySet();
                int d2 = gw00.d(tcc.n(entrySet, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                Iterator it3 = ((q53) entrySet).iterator();
                while (true) {
                    t53 t53Var2 = (t53) it3;
                    if (!t53Var2.hasNext()) {
                        i8zVar.ff(linkedHashMap2);
                        break;
                    } else {
                        t53Var2.next();
                        Pair pair2 = new Pair(kotlin.collections.a.X((Iterable) t53Var2.getValue(), null, null, null, null, 63), t53Var2.getKey());
                        linkedHashMap2.put(pair2.c(), pair2.f());
                    }
                }
                break;
            case 22:
                SuperAppFlowExperiment superAppFlowExperiment = (SuperAppFlowExperiment) obj;
                ((com.yandex.go.permission.location_with_agreement.ui.c) this.b).H.f();
                com.yandex.go.permission.location_with_agreement.ui.c cVar2 = (com.yandex.go.permission.location_with_agreement.ui.c) this.b;
                bd bdVar = cVar2.y;
                if (bdVar != null) {
                    ((fd) cVar2.C).d(bdVar, null);
                    ((com.yandex.go.agreement.interactor.a) cVar2.z).a(bdVar);
                }
                ((com.yandex.go.permission.location_with_agreement.ui.c) this.b).F.a = superAppFlowExperiment;
                kk5 kk5Var = ((com.yandex.go.permission.location_with_agreement.ui.c) this.b).x.a;
                if (kk5Var.u()) {
                    kk5Var.r(new xpy(27));
                }
                break;
            case 23:
                com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a aVar3 = (com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a) this.b;
                Rect g = ((gh00) ((ah00) aVar3.b)).g();
                ScreenPoint screenPoint = new ScreenPoint(g.centerX(), g.bottom - ((ny70) obj).a);
                ah00 ah00Var = (ah00) aVar3.b;
                aVar3.Q = ((gh00) ah00Var).e.d(screenPoint);
                ((gh00) ah00Var).F(aVar3.P);
                aVar3.Ig();
                aVar3.F.getClass();
                aVar3.Jg();
                break;
            case 24:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                mnz mnzVar = (mnz) this.b;
                mnzVar.getClass();
                zy11 zy11Var = zy11.a;
                taxiOrder.V();
                DriveState driveState = taxiOrder.h.b;
                mnzVar.b.a.getClass();
                mnzVar.e.getClass();
                a3y0.h(new String[]{"handleOrderUpdates"});
                hst hstVar = jst.e;
                int i = lnz.a[driveState.ordinal()];
                if (i != 1 && i != 2) {
                    mnzVar.e.getClass();
                    a3y0.h(new String[]{"handleOrderUpdates"});
                    mnzVar.a();
                    ((lmz) mnzVar.a.b).a.remove(taxiOrder.a);
                } else if (taxiOrder.V().i != null) {
                    mnzVar.a.a();
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            case 25:
                ((xnz) this.b).render((foz) obj);
                break;
            case 26:
                ((s100) this.b).Lg((lgl0) obj);
                break;
            case 27:
                i iVar = (i) this.b;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue2) {
                    boolean z3 = iVar.Q;
                    o oVar = iVar.L;
                    if (!z3) {
                        iVar.Q = true;
                        iVar.K.a();
                        oVar.a();
                        oVar.b = TimeOutMode.LONG_TIMEOUT;
                        iVar.M.a(FocusMode.FOLLOWING);
                        num = new Integer((int) (ofp0.c * 0.2f));
                        if (num != null) {
                            r0 r0Var = (r0) iVar.N.a;
                            do {
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, new akm(0, 0, 0, 0, 0, num.intValue())));
                            Object c2 = com.yandex.go.navigator.a.c(iVar.J, null, continuation, 7);
                            if (c2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                        break;
                    }
                }
                if (booleanValue2 || !iVar.Q) {
                    num = null;
                } else {
                    iVar.L.b = TimeOutMode.SHORT_TIMEOUT;
                    iVar.Q = false;
                    iVar.M.a(FocusMode.FREE);
                    iVar.K.b();
                    num = new Integer((int) (ofp0.c * 0.5f));
                }
                if (num != null) {
                }
                break;
            case 28:
                Address h = ((g) this.b).g.c().h();
                if (h != null && h.getGeoPointAcquisitionType() != GeoPointAcquisitionType.DEFAULT) {
                    h.G(GeoPointAcquisitionType.USER_LOCATION);
                }
                break;
            default:
                ((vd00) this.b).Lg((wd00) obj);
                break;
        }
        return zy11.a;
    }
}
