package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.compose.foundation.lazy.b;
import androidx.compose.material3.g;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import com.yandex.go.shortcuts.dto.request.RouteEtaParam;
import com.yandex.go.shortcuts.experiments.superapp_flow.SuperAppFlowExperiment;
import com.yandex.go.shortcuts.models.RouteUserContext;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$startCollectPayload$lambda$0$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.objects.OrderPushNotification;
import com.yandex.go.taxi.summary.mobilityhub.interactor.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Triple;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.logistics.ndd_map.router.e;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.masstransit.utils.a;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.order.NotificationBroadcastReceiver;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.i;

/* loaded from: classes14.dex */
public final class xur implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public xur(sls slsVar, l lVar) {
        this.a = 13;
        this.c = slsVar;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a0, code lost:
    
        if ((-r7) >= 30000) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.util.concurrent.CancellationException, qhw0] */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Object ckvVar;
        int i;
        Object obj3;
        ?? r9;
        String str;
        boolean z = true;
        switch (this.a) {
            case 0:
                if (!((a) this.b).c.get()) {
                    ((sls) this.c).invoke();
                }
                return zy11.a;
            case 1:
                jus jusVar = (jus) this.b;
                List list = (List) ((Map) obj).get(jusVar.x);
                hus husVar = (hus) this.c;
                String str2 = jusVar.x;
                List<wts> list2 = jusVar.y;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (wts wtsVar : list2) {
                    arrayList.add(wts.a(wtsVar, list != null && list.contains(wtsVar.a)));
                }
                husVar.render(new lus(str2, arrayList));
                return zy11.a;
            case 2:
                zzs zzsVar = (zzs) obj;
                com.yandex.go.shortcuts.impl.route.a aVar = (com.yandex.go.shortcuts.impl.route.a) this.b;
                List list3 = (List) this.c;
                aVar.getClass();
                List<yct> list4 = list3;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                for (yct yctVar : list4) {
                    arrayList2.add(new RouteEtaParam.Route(scc.g(zzsVar, yctVar.b), yctVar.a, 4));
                }
                Object a = com.yandex.go.shortcuts.impl.route.a.a(aVar, new RouteEtaParam(RouteUserContext.Shortcuts, arrayList2), continuation);
                return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
            case 3:
                ((Boolean) obj).getClass();
                b bVar = (b) this.b;
                Iterator it = bVar.j().k.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        n6y n6yVar = (n6y) next;
                        if ((((((int) (bVar.j().e() >> 32)) / 2) - (((t6y) n6yVar).p / 2)) - (-bVar.j().l)) - ((t6y) n6yVar).o == 0) {
                            obj2 = next;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                n6y n6yVar2 = (n6y) obj2;
                if (n6yVar2 != null) {
                    ((z69) this.c).b.setIntValue(((t6y) n6yVar2).a);
                }
                return zy11.a;
            case 4:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((tls) this.b).invoke(bitmap);
                } else {
                    sls slsVar = (sls) this.c;
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                }
                return zy11.a;
            case 5:
                com.yandex.go.inapp_calls.ui.loader.a aVar2 = (com.yandex.go.inapp_calls.ui.loader.a) this.b;
                InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) this.c;
                int i2 = zjv.a[((InAppCallsFeatureWrapper$State) obj).ordinal()];
                if (i2 == 1 || i2 == 2) {
                    aVar2.E.d.d("Error", false);
                    njv.h(InAppCallsAnalytics$ErrorType.DYNAMIC_FEATURE_LOAD);
                    InAppCallExperiment.LoaderConfig loaderConfig = inAppCallExperiment.l;
                    InAppCallExperiment.LoaderConfig loaderConfig2 = inAppCallExperiment.l;
                    ckvVar = new ckv(d6z.Y(inAppCallExperiment, loaderConfig.c), d6z.Y(inAppCallExperiment, loaderConfig2.d), d6z.Y(inAppCallExperiment, loaderConfig2.e));
                } else {
                    if (i2 != 3 && i2 != 4) {
                        if (i2 != 5) {
                            w511.b();
                            return null;
                        }
                        aVar2.E.d.d("Succeed", true);
                        ((bkv) aVar2.x.a).r(new yce(!aVar2.F.get(), 8));
                        return zy11.a;
                    }
                    InAppCallExperiment.LoaderConfig loaderConfig3 = inAppCallExperiment.l;
                    InAppCallExperiment.LoaderConfig loaderConfig4 = inAppCallExperiment.l;
                    ckvVar = new dkv(d6z.Y(inAppCallExperiment, loaderConfig3.a), d6z.Y(inAppCallExperiment, loaderConfig4.b), d6z.Y(inAppCallExperiment, loaderConfig4.e));
                }
                ((xjv) aVar2.Dg()).render(ckvVar);
                return zy11.a;
            case 6:
                g8w g8wVar = (g8w) obj;
                ArrayList arrayList3 = (ArrayList) this.b;
                if (g8wVar instanceof ztr) {
                    arrayList3.add(g8wVar);
                } else if (g8wVar instanceof aur) {
                    arrayList3.remove(((aur) g8wVar).a);
                }
                boolean z2 = !arrayList3.isEmpty();
                g gVar = (g) this.c;
                if (z2 != gVar.A) {
                    gVar.A = z2;
                    gVar.I0();
                }
                return zy11.a;
            case 7:
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g gVar2 = (com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.b;
                if (ref$BooleanRef.element) {
                    ref$BooleanRef.element = false;
                    tje.N(gVar2.Jg(), null, null, new IntercityDashboardPresenter$startCollectPayload$lambda$0$$inlined$safeCollectIn$1(gVar2.C.c, null, gVar2), 3);
                }
                return zy11.a;
            case 8:
                g8w g8wVar2 = (g8w) obj;
                ily ilyVar = (ily) this.c;
                xy40 xy40Var = (xy40) this.b;
                if ((g8wVar2 instanceof ltu) || (g8wVar2 instanceof ztr) || (g8wVar2 instanceof jxe0)) {
                    xy40Var.g(g8wVar2);
                } else if (g8wVar2 instanceof mtu) {
                    xy40Var.l(((mtu) g8wVar2).a);
                } else if (g8wVar2 instanceof aur) {
                    xy40Var.l(((aur) g8wVar2).a);
                } else if (g8wVar2 instanceof kxe0) {
                    xy40Var.l(((kxe0) g8wVar2).a);
                } else if (g8wVar2 instanceof ixe0) {
                    xy40Var.l(((ixe0) g8wVar2).a);
                }
                Object[] objArr = xy40Var.a;
                int i3 = xy40Var.b;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    g8w g8wVar3 = (g8w) objArr[i5];
                    if (g8wVar3 instanceof ltu) {
                        ilyVar.getClass();
                        i = i4 | 2;
                    } else if (g8wVar3 instanceof ztr) {
                        ilyVar.getClass();
                        i = i4 | 1;
                    } else if (g8wVar3 instanceof jxe0) {
                        ilyVar.getClass();
                        i = i4 | 4;
                    }
                    i4 = i;
                }
                ilyVar.b.setIntValue(i4);
                return zy11.a;
            case 9:
                ru.yandex.taxi.linked_order.focus.a aVar3 = (ru.yandex.taxi.linked_order.focus.a) this.b;
                aVar3.c.put((String) this.c, (List) obj);
                n0 n0Var = aVar3.d;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                return zy11Var;
            case 10:
                ((com.yandex.go.permission.location_with_agreement.ui.a) this.b).c.a = (SuperAppFlowExperiment) obj;
                ((vaz) ((oaz) this.c)).a();
                return zy11.a;
            case 11:
                List list5 = ((cq60) obj).g;
                if (list5 == null || list5.isEmpty()) {
                    ((mq00) this.b).hideFirstUsageHint();
                } else {
                    c cVar = (c) this.c;
                    Mode mode = cVar.E;
                    if (mode != null && !c.Mg((Set) cVar.G.getValue(cVar, c.M[0]), mode)) {
                        ((mq00) cVar.Dg()).showFirstUsageHint();
                    }
                }
                return zy11.a;
            case 12:
                tv20 tv20Var = (tv20) obj;
                ((rv20) this.b).K0(tv20Var);
                q6l0 q6l0Var = tv20Var.b;
                sv20 sv20Var = (sv20) this.c;
                if (q6l0Var != null) {
                    sv20Var.z.d();
                } else {
                    sv20Var.z.e();
                }
                return zy11.a;
            case 13:
                List list6 = (List) obj;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((za31) it2.next()).a.a, ((l) this.b).a)) {
                            return zy11.a;
                        }
                    }
                }
                ((sls) this.c).invoke();
                return zy11.a;
            case 14:
                List list7 = (List) obj;
                d dVar = (d) this.b;
                Iterator it3 = list7.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((ob31) next2).c) {
                            obj3 = next2;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                dVar.W = (ob31) obj3;
                ((me30) this.c).D2(list7);
                return zy11.a;
            case 15:
                if (((lo30) this.b).Eg()) {
                    ((ko30) this.c).I4();
                }
                return zy11.a;
            case 16:
                ((ay30) this.b).x.Lc((tse) this.c, (Rect) obj);
                return zy11.a;
            case 17:
                Triple triple = (Triple) obj;
                String str3 = (String) triple.getFirst();
                List list8 = (List) triple.getSecond();
                Map map = (Map) triple.getThird();
                m010 m010Var = ((p) this.b).d;
                List list9 = list8;
                ArrayList arrayList4 = new ArrayList(tcc.n(list9, 10));
                Iterator it4 = list9.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new a631((String) it4.next(), str3, (String) this.c, 16));
                }
                m010Var.c.c(map, arrayList4, false);
                return zy11.a;
            case 18:
                ((Number) obj).intValue();
                ((oz40) this.c).setValue(Boolean.TRUE);
                ((tls) this.b).invoke(c940.a);
                return zy11.a;
            case 19:
                ru.yandex.taxi.masstransit.paymentcards.c cVar2 = (ru.yandex.taxi.masstransit.paymentcards.c) this.b;
                String str4 = ((h0p) obj).a;
                LinkedHashMap linkedHashMap = ru.yandex.taxi.masstransit.paymentcards.c.d;
                cVar2.getClass();
                MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType = (MtTransportCardSubscriber$TransportCardEventType) ru.yandex.taxi.masstransit.paymentcards.c.d.get(str4);
                if (mtTransportCardSubscriber$TransportCardEventType != null) {
                    sy00 sy00Var = cVar2.c;
                    int i6 = bj40.a[mtTransportCardSubscriber$TransportCardEventType.ordinal()];
                    if (i6 == 1) {
                        lx4 lx4Var = sy00Var.a;
                        ((na1) sy00Var.b).getClass();
                        j jVar = (j) lx4Var;
                        jVar.v(as6.M());
                        jVar.v(as6.N());
                    } else if (i6 == 2) {
                        lx4 lx4Var2 = sy00Var.a;
                        ((na1) sy00Var.b).getClass();
                        j jVar2 = (j) lx4Var2;
                        jVar2.v(as6.P());
                        jVar2.v(as6.O());
                    } else if (i6 != 3) {
                        w511.b();
                        return null;
                    }
                    ((tls) this.c).invoke(mtTransportCardSubscriber$TransportCardEventType);
                }
                return zy11.a;
            case 20:
                e eVar = (e) this.b;
                n0 n0Var2 = eVar.g.e;
                zy11 zy11Var2 = zy11.a;
                n0Var2.g(zy11Var2);
                eVar.g.a((nm00) this.c);
                return zy11Var2;
            case 21:
                xys0 xys0Var = (xys0) obj;
                c9x0 c9x0Var = (c9x0) this.c;
                ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j jVar3 = (ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j) this.b;
                qhw0 qhw0Var = jVar3.j;
                u1n u1nVar = jVar3.g;
                if (qhw0Var != null) {
                    qhw0Var.a(null);
                }
                jVar3.j = jl40.a();
                if (xys0Var instanceof vys0) {
                    vys0 vys0Var = (vys0) xys0Var;
                    ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j.b(jVar3, vys0Var, c9x0Var);
                    u1n.k(u1nVar, vys0Var.e);
                } else if (xys0Var instanceof uys0) {
                    uys0 uys0Var = (uys0) xys0Var;
                    ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j.a(jVar3, uys0Var, c9x0Var);
                    u1n.k(u1nVar, uys0Var.g);
                } else {
                    if (!(xys0Var instanceof wys0)) {
                        w511.b();
                        return null;
                    }
                    String str5 = jVar3.l;
                    if (str5 != null) {
                        jVar3.h.c.b.a(str5);
                        r9 = 0;
                        jVar3.l = null;
                    } else {
                        r9 = 0;
                    }
                    qhw0 qhw0Var2 = jVar3.j;
                    if (qhw0Var2 != 0) {
                        qhw0Var2.a(r9);
                    }
                    jVar3.j = r9;
                    qhw0 qhw0Var3 = jVar3.k;
                    if (qhw0Var3 != 0) {
                        qhw0Var3.a(r9);
                    }
                    jVar3.k = r9;
                    jVar3.e.b();
                }
                return zy11.a;
            case 22:
                String str6 = (String) obj;
                TaxiOrder b = ((com.yandex.go.taxi.order.controller.a) this.b).c.b();
                b.getClass();
                synchronized (b) {
                    TaxiOrderLocalData taxiOrderLocalData = b.l;
                    taxiOrderLocalData.getClass();
                    b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, str6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, Integer.MAX_VALUE, 16777215);
                }
                ((com.yandex.go.taxi.order.controller.a) this.b).b((epq0) this.c);
                return zy11.a;
            case 23:
                x980 x980Var = ((i) this.b).J;
                o2y0 o2y0Var = (o2y0) this.c;
                Dialog dialog = ((TaxiOrder) obj).V().W.a;
                at20 at20Var = new at20((i) this.b, (o2y0) this.c);
                f fVar = (f) x980Var;
                OrderFragment orderFragment = fVar.p1;
                if (orderFragment != null && orderFragment.isChatHidden()) {
                    rp70 rp70Var = fVar.C1;
                    rp70Var.getClass();
                    String str7 = dialog.b;
                    if (str7 != null && !evu0.J(str7)) {
                        TaxiOrder b2 = o2y0Var.b();
                        if (!b2.l.p) {
                            ci70 ci70Var = rp70Var.d;
                            String str8 = b2.a;
                            ci70Var.q.a(str8, ci70Var.b(str8), "show", null);
                            tdj tdjVar = new tdj(o2y0Var);
                            tdjVar.b = dialog.a;
                            tdjVar.c = dialog.b;
                            tdjVar.a(new f83(rp70Var, b2, dialog, at20Var, 8));
                            rp70Var.c.n(tdjVar, new pp70(o2y0Var, "FORCE_DESTINATION_DIALOG_TAG"));
                        }
                    }
                }
                return zy11.a;
            case 24:
                List<xh60> list10 = (List) obj;
                u480 u480Var = (u480) this.b;
                o2y0 o2y0Var2 = (o2y0) this.c;
                AlarmManager alarmManager = u480Var.h;
                Context context = u480Var.a;
                u480Var.l.getClass();
                a3y0.h(new String[]{"cancelAlarms"});
                hst hstVar = jst.e;
                v280.Companion.getClass();
                for (String str9 : v280.c) {
                    yg60 yg60Var = NotificationBroadcastReceiver.Companion;
                    String str10 = o2y0Var2.b().a;
                    yg60Var.getClass();
                    alarmManager.cancel(PendingIntent.getBroadcast(context, 0, yg60.a(context, str10, str9), DivSeparatorView.DEFAULT_DIVIDER_COLOR));
                }
                for (xh60 xh60Var : list10) {
                    crg crgVar = u480Var.j;
                    v480 v480Var = u480Var.f;
                    String str11 = o2y0Var2.b().a;
                    String str12 = xh60Var.a;
                    wh60 wh60Var = xh60Var.b;
                    HashSet hashSet = v480Var.a;
                    HashSet hashSet2 = v480Var.a;
                    if (!hashSet.contains(str11 + str12)) {
                        boolean contains = hashSet2.contains(o2y0Var2.b().a + "prepaid_time_ends_now");
                        if (jl40.l(str12, "prepaid_time_ends_soon")) {
                            if (!contains) {
                                long b3 = u480Var.b(xh60Var);
                                if (b3 < 0) {
                                    break;
                                }
                            }
                        }
                        OrderPushNotification orderPushNotification = (OrderPushNotification) wh60Var;
                        String str13 = (String) orderPushNotification.b.get("title_template");
                        String str14 = (String) orderPushNotification.b.get("subtitle_template");
                        if ((str13 != null && str13.length() != 0) || (str14 != null && str14.length() != 0)) {
                            if (str13 == null || str13.length() == 0) {
                                str = str14;
                                str14 = null;
                            } else {
                                str = str13;
                            }
                            String str15 = o2y0Var2.b().V().g.d;
                            Date c = crgVar.c(o2y0Var2.b().V().Z.e);
                            Date c2 = crgVar.c(orderPushNotification.a);
                            if (c2 == null) {
                                c2 = new Date();
                            }
                            String h = t7s.h(u480Var.i, str, str15, c2.getTime(), c);
                            if (h == null) {
                                ny61.r("Required value was null.");
                                return null;
                            }
                            String h2 = (str14 == null || str14.length() == 0) ? null : t7s.h(u480Var.i, str14, str15, c2.getTime(), c);
                            long b4 = u480Var.b(xh60Var);
                            if (b4 <= 0) {
                                a3y0.h(new String[]{"processNotification"});
                                hst hstVar2 = jst.e;
                                u480Var.g.m(o2y0Var2.b().a, o2y0Var2.b().p(), xh60Var.a, h, h2);
                                hashSet2.add(o2y0Var2.b().a + str12);
                            } else {
                                u480Var.d.getClass();
                                long currentTimeMillis = System.currentTimeMillis() + b4;
                                yg60 yg60Var2 = NotificationBroadcastReceiver.Companion;
                                Context context2 = u480Var.a;
                                String str16 = o2y0Var2.b().a;
                                String p = o2y0Var2.b().p();
                                String str17 = xh60Var.a;
                                yg60Var2.getClass();
                                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, PendingIntent.getBroadcast(context, 0, yg60.b(context2, str16, p, str17, h, h2), DivSeparatorView.DEFAULT_DIVIDER_COLOR));
                                a3y0.h(new String[]{"processNotification"});
                                hst hstVar3 = jst.e;
                            }
                        }
                    }
                }
                return zy11.a;
            case 25:
                i980 i980Var = (i980) obj;
                ((com.yandex.go.taxi.order.titles.f) this.b).e(i980Var.b, i980Var.a, (o2y0) this.c);
                return zy11.a;
            case 26:
                ((ye80) this.b).scrollToTop();
                com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c cVar3 = (com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c) this.c;
                ((c9c0) cVar3.p0.getValue()).V((o8c0) cVar3.h0.getValue(), cVar3.i0);
                return zy11.a;
            case 27:
                com.yandex.go.overdraft.domain.l lVar = (com.yandex.go.overdraft.domain.l) this.b;
                ListBuilder h3 = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) lVar.d.a)).h();
                ArrayList arrayList5 = new ArrayList();
                ListIterator listIterator = h3.listIterator(0);
                while (true) {
                    qqy qqyVar = (qqy) listIterator;
                    if (!qqyVar.hasNext()) {
                        if (((ivt) kotlin.collections.a.R(arrayList5)) != null) {
                            m6a0 m6a0Var = new m6a0(PaymentMethod$Type.GOOGLE_PAY, null, null);
                            ((sz80) lVar.e.a).a.l(m6a0Var);
                            Object e = lVar.e(m6a0Var, (zls) this.c, continuation);
                            if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return e;
                            }
                        } else {
                            jst.e.c("Google pay not found in current PaymentMethods!");
                        }
                        return zy11.a;
                    }
                    Object next3 = qqyVar.next();
                    if (next3 instanceof ivt) {
                        arrayList5.add(next3);
                    }
                }
            case 28:
                String str18 = (String) obj;
                ((dl90) this.b).C = str18;
                ((bl90) this.c).preSetText(str18);
                return zy11.a;
            default:
                PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = (PlacesMapConfig$PlacesMapScreenName) obj;
                oac0 oac0Var = (oac0) this.b;
                if (placesMapConfig$PlacesMapScreenName != PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN && !((uac0) this.c).K) {
                    z = false;
                }
                oac0Var.q9(z);
                return zy11.a;
        }
    }

    public /* synthetic */ xur(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
