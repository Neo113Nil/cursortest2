package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.s;
import com.yandex.go.navigator.events.NavigatorTag;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings;
import com.yandex.go.pickuppoints.impl.l;
import com.yandex.go.pickuppoints.impl.o;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$PaymentScreenSource;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.impl.ui.payments.checkout.flex.custom_view.checkout_buttons.PlacesPaymentsCheckoutButtonsView;
import com.yandex.go.places.map.ui.pinwar.b;
import com.yandex.go.places.models.domain.entities.PaymentProcessingState;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.Event;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.RotationType;
import com.yandex.messaging.ui.settings.e;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.feature.paymentsdk.internal.screens.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.logistics.payment_method_selector.c;
import ru.yandex.taxi.map.overlay.pickup.d;

/* loaded from: classes13.dex */
public final class wh80 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wh80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Event event;
        Float speedLimit;
        List<Event> events;
        Object obj2;
        boolean contains;
        Object value;
        r5b0 r5b0Var;
        ArrayList arrayList;
        Object obj3;
        Object obj4;
        ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto mapConfigurationDto;
        ClarifyPointsScreenStrategyConfigurationExperiment.MapConfigurationDto mapConfigurationDto2;
        uc4 uc4Var;
        lcc0 lcc0Var;
        int i = 14;
        switch (this.a) {
            case 0:
                ((nh80) ((g) this.b).Dg()).Xc(((Boolean) obj).booleanValue());
                return zy11.a;
            case 1:
                ((pm80) this.b).render((tm80) obj);
                return zy11.a;
            case 2:
                ((rn80) this.b).y9();
                return zy11.a;
            case 3:
                ((wp80) this.b).He((bq80) obj);
                return zy11.a;
            case 4:
                ((com.yandex.go.overdraft.domain.g) ((com.yandex.go.overdraft.g) this.b).M.get()).f();
                return zy11.a;
            case 5:
                t2v0 t2v0Var = (t2v0) obj;
                w290 w290Var = (w290) this.b;
                vff vffVar = w290Var.G;
                zuj0 zuj0Var = w290Var.z;
                y290 y290Var = w290Var.y;
                DrivingRoute a = vffVar.a();
                if (a == null) {
                    a = (DrivingRoute) w290Var.H.a.getValue();
                }
                if (a == null || (events = a.getEvents()) == null) {
                    event = null;
                } else {
                    Iterator<T> it = events.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (jl40.l(((Event) obj2).getEventId(), y290Var.a)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    event = (Event) obj2;
                }
                Integer num = (event == null || (speedLimit = event.getSpeedLimit()) == null) ? null : new Integer(m810.a((speedLimit.floatValue() * 3.6d) * 100.0d) / 100);
                kg50 kg50Var = y290Var.d;
                Object[] objArr = (kg50Var != null ? kg50Var.a : null) == NavigatorTag.SPEED_CONTROL;
                String h = (!objArr == true || num == null) ? ((avj0) zuj0Var).h(y290Var.c.getTitleRes()) : ((avj0) zuj0Var).i(kyh0.navigator_incidents_overview_camera_title, num);
                IncidentType incidentType = y290Var.c;
                boolean z = (incidentType == IncidentType.Camera || incidentType == IncidentType.Police) && !objArr == true;
                t290 t290Var = (t290) w290Var.Dg();
                kg50 kg50Var2 = y290Var.d;
                t290Var.render(new z290(kg50Var2 != null ? kg50Var2.f : null, h, t2v0Var, ((avj0) zuj0Var).h(kyh0.navigator_incidents_overview_approve_button), ((avj0) zuj0Var).h(kyh0.navigator_incidents_overview_decline_button), z));
                return zy11.a;
            case 6:
                ((nl90) this.b).updatePassengerRating((String) obj);
                return zy11.a;
            case 7:
                String str = (String) obj;
                c cVar = (c) this.b;
                if (str == null) {
                    cVar.getClass();
                    contains = false;
                } else {
                    contains = cVar.e.b().i.contains(str);
                }
                if (contains) {
                    cVar.c.a(false);
                }
                return zy11.a;
            case 8:
                ((n2a0) this.b).a();
                return zy11.a;
            case 9:
                m1a0 m1a0Var = (m1a0) obj;
                com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c cVar2 = (com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.c) this.b;
                ListItemComponent listItemComponent = cVar2.R;
                listItemComponent.setTitle(m1a0Var.a);
                CompositePaymentIconsView.update$default(cVar2.a0, m1a0Var, cVar2.T, true, null, 8, null);
                listItemComponent.setTitle(m1a0Var.a);
                return zy11.a;
            case 10:
                yia0 yia0Var = (yia0) obj;
                if (jl40.l(yia0Var.a, "rtpSbpPayment")) {
                    Object obj5 = yia0Var.b.get("paymentLink");
                    String str2 = obj5 instanceof String ? (String) obj5 : null;
                    if (str2 != null) {
                        h791.e(((h9g) ((a) this.b).B).h(), str2, false, null, 14);
                    }
                }
                return zy11.a;
            case 11:
                return ((s) this.b).d.emit((g4a0) obj, continuation);
            case 12:
                pma0 pma0Var = (pma0) this.b;
                z650 z650Var = (z650) obj;
                if (z650Var instanceof y650) {
                    aq80 aq80Var = pma0Var.z;
                    y650 y650Var = (y650) z650Var;
                    zzs zzsVar = y650Var.a;
                    m6a0 m6a0Var = y650Var.b;
                    gv40 gv40Var = y650Var.c;
                    lma0 lma0Var = (lma0) aq80Var.a;
                    lma0Var.A(((by90) lma0Var.J.b.getValue()).a(), new azz(PaymentsScreen.PLACES, "no_feature", new h0a0(zzsVar, null), m6a0Var, false, false, null, false, false, null, null, null, null, null, null, null, null, null, 523264), new ama(7, gv40Var));
                } else {
                    if (!(z650Var instanceof x650)) {
                        w511.b();
                        return null;
                    }
                    aq80 aq80Var2 = pma0Var.z;
                    x650 x650Var = (x650) z650Var;
                    String str3 = x650Var.a;
                    String str4 = x650Var.b;
                    PaymentMethod$Type paymentMethod$Type = x650Var.c;
                    zzs zzsVar2 = x650Var.d;
                    lma0 lma0Var2 = (lma0) aq80Var2.a;
                    lma0Var2.A((m950) lma0Var2.L.get(), new una0(str3, str4, paymentMethod$Type, zzsVar2), new kma0(lma0Var2, str3, aq80Var2));
                    jio jioVar = pma0Var.F;
                    hsj hsjVar = jioVar.b;
                    DiscoveryAnalytics$PaymentScreenSource j = jioVar.j();
                    hsjVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("order_id", str3);
                    hashMap.put("source", j.getEventValue());
                    hsjVar.a.a("Discovery.PaymentScreen.Pay", hashMap, 1, new HashMap());
                }
                return zy11.a;
            case 13:
                ((wna0) this.b).render(new nw70(i, (PaymentProcessingState) obj));
                return zy11.a;
            case 14:
                hxa0 hxa0Var = (hxa0) this.b;
                fxa0 fxa0Var = (fxa0) obj;
                if (fxa0Var instanceof exa0) {
                    exa0 exa0Var = (exa0) fxa0Var;
                    Bitmap bitmap = exa0Var.b;
                    j0c0 j0c0Var = exa0Var.a;
                    boolean z2 = j0c0Var.c;
                    k0c0 k0c0Var = j0c0Var.d;
                    hxa0Var.getClass();
                    ImageProvider fromBitmap = ImageProvider.fromBitmap(bitmap);
                    IconStyle anchor = z2 ? new IconStyle().setRotationType(RotationType.ROTATE).setAnchor(new PointF((float) k0c0Var.a, (float) k0c0Var.b)) : new IconStyle().setRotationType(RotationType.NO_ROTATION);
                    f4c0 f4c0Var = hxa0Var.d;
                    if (f4c0Var != null) {
                        f4c0Var.y(fromBitmap);
                        f4c0Var.D(anchor);
                    }
                } else {
                    if (!(fxa0Var instanceof dxa0)) {
                        w511.b();
                        return null;
                    }
                    hst hstVar = jst.e;
                    dxa0 dxa0Var = (dxa0) fxa0Var;
                    j0c0 j0c0Var2 = dxa0Var.a;
                    hstVar.k(dxa0Var.b, String.format("Failed to load image with tag %s", Arrays.copyOf(new Object[]{j0c0Var2.b}, 1)));
                    if (jl40.l(j0c0Var2.b, "delivery_market_performer_icon")) {
                        ImageProvider imageProvider = (ImageProvider) ((ru.yandex.taxi.logistics.deliveries.map.data.a) hxa0Var.b).f.getValue();
                        IconStyle anchor2 = new IconStyle().setRotationType(RotationType.ROTATE).setAnchor(new PointF(0.5f, 0.5f));
                        f4c0 f4c0Var2 = hxa0Var.d;
                        if (f4c0Var2 != null) {
                            f4c0Var2.y(imageProvider);
                            f4c0Var2.D(anchor2);
                        }
                    } else {
                        ImageProvider imageProvider2 = (ImageProvider) ((ru.yandex.taxi.logistics.deliveries.map.data.a) hxa0Var.b).d.getValue();
                        IconStyle rotationType = new IconStyle().setRotationType(RotationType.NO_ROTATION);
                        f4c0 f4c0Var3 = hxa0Var.d;
                        if (f4c0Var3 != null) {
                            f4c0Var3.y(imageProvider2);
                            f4c0Var3.D(rotationType);
                        }
                    }
                }
                return zy11.a;
            case 15:
                Pair pair = (Pair) obj;
                long longValue = ((Number) pair.getFirst()).longValue();
                int intValue = ((Number) pair.getSecond()).intValue();
                r0 r0Var = ((e) this.b).C;
                do {
                    value = r0Var.getValue();
                    r5b0Var = (r5b0) value;
                    List<rk80> list = r5b0Var.a;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    for (rk80 rk80Var : list) {
                        long j2 = rk80Var.a;
                        if (j2 == longValue) {
                            rk80Var = new rk80(j2, rk80Var.b, rk80Var.c, rk80Var.d, intValue);
                        }
                        arrayList.add(rk80Var);
                    }
                } while (!r0Var.k(value, new r5b0(arrayList, r5b0Var.b)));
                return zy11.a;
            case 16:
                d dVar = (d) this.b;
                hbm hbmVar = dVar.C;
                Drawable a2 = hbmVar.a((String) obj, vng.t(a0h0.route_selected_src_point, hbmVar.a));
                if (a2 != null) {
                    dVar.Og(a2);
                }
                return zy11.a;
            case 17:
                Pair pair2 = (Pair) obj;
                o oVar = (o) this.b;
                List list2 = ((ClarifyPointsScreenStrategyConfigurationExperiment) pair2.c()).b;
                String str5 = (String) pair2.f();
                oVar.getClass();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (!(obj3 instanceof ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings) || !((ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings) obj3).b.contains(str5)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings = (ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings) obj3;
                o oVar2 = (o) this.b;
                List list3 = ((ClarifyPointsScreenStrategyConfigurationExperiment) pair2.c()).b;
                String str6 = (String) pair2.f();
                oVar2.getClass();
                Iterator it3 = list3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (!(obj4 instanceof ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings) || !((ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings) obj4).b.contains(str6)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings = (ClarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings) obj4;
                l lVar = ((o) this.b).c;
                lVar.getClass();
                lVar.a = (clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings == null || (mapConfigurationDto2 = clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings.a) == null) ? null : mapConfigurationDto2.a;
                lVar.b = (clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings == null || (mapConfigurationDto = clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$MapSettings.a) == null) ? null : mapConfigurationDto.b;
                l lVar2 = ((o) this.b).c;
                lVar2.getClass();
                lVar2.c = clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings != null ? clarifyPointsScreenStrategyConfigurationExperiment$SettingsDto$SummarySettings.a : null;
                return zy11.a;
            case 18:
                ru.yandex.yandexmaps.multiplatform.pin.war.c cVar3 = ((e2c0) this.b).a;
                if (cVar3 != null) {
                    cVar3.m();
                }
                return zy11.a;
            case 19:
                b bVar = (b) this.b;
                wac0 a3 = bVar.L.a(((sr00) obj).b);
                if (a3 == null) {
                    bVar.getClass();
                } else {
                    bVar.M.a = a3.c;
                    ((z2c0) bVar.Dg()).m(a3.h, a3.b);
                }
                return zy11.a;
            case 20:
                Pair pair3 = (Pair) obj;
                ((com.yandex.go.places.impl.domain.interactors.discovery.map.a) this.b).b.c(((Number) pair3.getSecond()).floatValue(), (uc4) pair3.getFirst());
                return zy11.a;
            case 21:
                x6c0 x6c0Var = (x6c0) obj;
                com.yandex.go.places.impl.navigation.discovery.map.a aVar = (com.yandex.go.places.impl.navigation.discovery.map.a) this.b;
                PlacesNavigationEntry$Source placesNavigationEntry$Source = aVar.t() ? PlacesNavigationEntry$Source.INTERNAL : PlacesNavigationEntry$Source.STARTER;
                if (x6c0Var instanceof w6c0) {
                    w6c0 w6c0Var = (w6c0) x6c0Var;
                    com.yandex.go.places.impl.navigation.discovery.map.a.l0(aVar, new yl80(aVar.Z(), aVar.Y(), w6c0Var.c, w6c0Var.a, w6c0Var.b, (u370) vvb1.H, (String) null, false), placesNavigationEntry$Source);
                } else if (x6c0Var instanceof v6c0) {
                    v6c0 v6c0Var = (v6c0) x6c0Var;
                    svj Z = aVar.Z();
                    ti80 ti80Var = v6c0Var.a;
                    lg80 Y = aVar.Y();
                    je80 je80Var = v6c0Var.b;
                    if (je80Var == null) {
                        he80 he80Var = new he80();
                        he80Var.a = false;
                        he80Var.f = true;
                        he80Var.g = false;
                        he80Var.r = true;
                        je80Var = he80Var.a();
                    }
                    com.yandex.go.places.impl.navigation.discovery.map.a.k0(aVar, new xl80(Z, ti80Var, Y, null, null, false, null, null, new je80(je80Var.a, je80Var.b, je80Var.c, je80Var.d, je80Var.e, je80Var.f, je80Var.g, je80Var.h, je80Var.i, je80Var.j, je80Var.k, je80Var.l, je80Var.m, je80Var.n, je80Var.o, je80Var.p, OrganizationCardSliderPinDisplayStrategy.SELECTED_PIN_ONLY, je80Var.r, je80Var.s, je80Var.t), null, null, null, null, 7896), false, placesNavigationEntry$Source);
                } else {
                    if (!jl40.l(x6c0Var, t6c0.a) && !jl40.l(x6c0Var, u6c0.a)) {
                        w511.b();
                        return null;
                    }
                    com.yandex.go.places.impl.navigation.discovery.map.a.o0(aVar, false);
                }
                return zy11.a;
            case 22:
                ((hfc0) this.b).a = (Point) obj;
                return zy11.a;
            case 23:
                Triple triple = (Triple) obj;
                BoundingBox boundingBox = (BoundingBox) triple.getFirst();
                uc4 uc4Var2 = (uc4) triple.getSecond();
                boolean booleanValue = ((Boolean) triple.getThird()).booleanValue();
                com.yandex.go.places.impl.ui.discovery.map.d dVar2 = (com.yandex.go.places.impl.ui.discovery.map.d) this.b;
                boolean z3 = dVar2.h0;
                if (z3 || booleanValue) {
                    if (z3) {
                        dVar2.h0 = false;
                        if (boundingBox != null) {
                            uc4Var = new uc4(new zzs(boundingBox.getSouthWest().getLatitude(), boundingBox.getSouthWest().getLongitude(), 0, null, null, 28), new zzs(boundingBox.getNorthEast().getLatitude(), boundingBox.getNorthEast().getLongitude(), 0, null, null, 28));
                        } else if (uc4Var2 != null) {
                            uc4Var = uc4Var2;
                        }
                        dVar2.T.a.k(null, uc4Var);
                    }
                    if (boundingBox != null && !boundingBox.equals(uc4Var2)) {
                        dVar2.i0 = true;
                        ((gh00) dVar2.N.a).A(boundingBox, null);
                    }
                }
                return zy11.a;
            case 24:
                ((flex.engine.a) this.b).k((kr) obj);
                return zy11.a;
            case 25:
                float floatValue = ((Number) obj).floatValue();
                ((xg00) ((i65) ((com.yandex.go.places.base.ui.common.map.c) this.b).Dg())).b(floatValue, !(floatValue == 0.0f));
                return zy11.a;
            case 26:
                PlacesPaymentsCheckoutButtonsView placesPaymentsCheckoutButtonsView = (PlacesPaymentsCheckoutButtonsView) this.b;
                lcc0Var = placesPaymentsCheckoutButtonsView.paymentsCheckoutInteractor;
                placesPaymentsCheckoutButtonsView.setPaymentMethod(lcc0Var.c.g);
                return zy11.a;
            case 27:
                ((pec0) this.b).render((yec0) obj);
                return zy11.a;
            case 28:
                ((jgc0) this.b).getClass();
                jl40.l(((pv0) obj).a.B(), zzs.f);
                return zy11.a;
            default:
                otc0 otc0Var = (otc0) obj;
                stc0 stc0Var = (stc0) this.b;
                if (otc0Var != null) {
                    stc0Var.A.a(otc0Var.a, otc0Var.b);
                    return zy11.a;
                }
                stc0Var.getClass();
                w511.b();
                return null;
        }
    }
}
