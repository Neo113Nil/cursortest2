package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.semantics.f;
import androidx.room.RoomDatabase;
import com.yandex.go.address.models.Address;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.gas_stations.overview.i;
import com.yandex.go.navigator.main_screen.h;
import com.yandex.go.navigator.main_screen.k;
import com.yandex.go.navigator.main_screen.l;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.j;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.messaging.core.net.entities.ContactsUploadData;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import defpackage.tje;
import defpackage.w700;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.logistics.cargo_form.async.impl.interactor.b;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.gopayments.business.SharedAccountMenuViewModel;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.impl.ride.metropick.d;

/* loaded from: classes12.dex */
public final /* synthetic */ class ynn implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ynn(Ref$IntRef ref$IntRef, p1z p1zVar, ContactsUploadData.Record[] recordArr, int i) {
        this.a = 20;
        this.b = ref$IntRef;
        this.c = p1zVar;
        this.w = recordArr;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onPeriodSelected$lambda$6;
        Object obj2;
        Set set;
        jsg jsgVar;
        int i = 3;
        int i2 = 11;
        int i3 = 10;
        int i4 = 12;
        int i5 = 9;
        int i6 = 2;
        Drawable t = null;
        Object obj3 = null;
        int i7 = 1;
        switch (this.a) {
            case 0:
                dfl0 dfl0Var = (dfl0) this.b;
                z9m z9mVar = (z9m) this.c;
                tls tlsVar = (tls) this.w;
                u6y u6yVar = (u6y) obj;
                int size = dfl0Var.a.a.size();
                int size2 = dfl0Var.b.a.size();
                int i8 = size + size2;
                boolean z = size2 > 1;
                bpl0 bpl0Var = dfl0Var.a;
                List list = bpl0Var.a;
                wls wlsVar = bpl0Var.b;
                m6y m6yVar = (m6y) u6yVar;
                m6yVar.f(list.size(), wlsVar != null ? new qq5(3, wlsVar, list) : null, new qc0(list, i2), new a(-930734472, new aon(list, i8, dfl0Var, tlsVar), true));
                bpl0 bpl0Var2 = (bpl0) z9mVar.a.getValue();
                List list2 = bpl0Var2.a;
                wls wlsVar2 = bpl0Var2.b;
                m6yVar.f(list2.size(), wlsVar2 != null ? new qq5(4, wlsVar2, list2) : null, new qc0(list2, i4), new a(-930734472, new bon(list2, size, size2, dfl0Var, z9mVar, tlsVar, i8, z), true));
                u6y.b(m6yVar, "AddButton", new a(166373069, new nfj(6, dfl0Var, tlsVar), true), 2);
                break;
            case 1:
                g4r g4rVar = (g4r) this.b;
                String str = (String) this.c;
                List list3 = (List) this.w;
                RoomDatabase roomDatabase = g4rVar.a;
                androidx.room.util.a.b(roomDatabase, false, true, new vsq(str, i));
                List list4 = list3;
                ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b4r((String) it.next(), str));
                }
                androidx.room.util.a.b(roomDatabase, false, true, new f4r(g4rVar, arrayList, i7));
                break;
            case 2:
                List list5 = (List) this.b;
                List list6 = (List) this.c;
                u6y u6yVar2 = (u6y) obj;
                m6y m6yVar2 = (m6y) u6yVar2;
                m6yVar2.f(list5.size(), new qc0(list5, 13, new xvq(i3)), new rc0(list5, 4, rwr.a), new a(802480018, new xs4(i6, list5, (pa90) this.w), true));
                if (!list5.isEmpty() && !list6.isEmpty()) {
                    m7d.a.getClass();
                    u6y.b(u6yVar2, "divider", m7d.b, 2);
                }
                m6yVar2.f(list6.size(), new qc0(list6, 14, new xvq(i2)), new rc0(list6, 5, swr.a), new a(802480018, new h9j(list6, i7), true));
                break;
            case 3:
                bpl0 bpl0Var3 = (bpl0) this.b;
                tls tlsVar2 = (tls) this.w;
                tls tlsVar3 = (tls) this.c;
                u6y u6yVar3 = (u6y) obj;
                List list7 = bpl0Var3.a;
                wls wlsVar3 = bpl0Var3.b;
                ((m6y) u6yVar3).f(list7.size(), wlsVar3 != null ? new qq5(5, wlsVar3, list7) : null, new qc0(list7, 15), new a(-930734472, new yzr(list7, tlsVar2, tlsVar3, r11), true));
                break;
            case 4:
                phx0 phx0Var = (phx0) this.b;
                tls tlsVar4 = (tls) this.w;
                t0s t0sVar = (t0s) this.c;
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, phx0Var.d);
                f.p(mnq0Var, 0);
                f.f(mnq0Var, phx0Var.e, new c0s(tlsVar4, t0sVar, 1));
                break;
            case 5:
                ((b) this.b).h.remove((String) this.c, (pzt0) this.w);
                break;
            case 6:
                onPeriodSelected$lambda$6 = FundIncomeWidgetView.onPeriodSelected$lambda$6((ArrayList) this.b, (FundIncomeWidgetView) this.c, (v8m0) this.w, (Integer) obj);
                break;
            case 7:
                wgu0 wgu0Var = wgu0.a;
                OpenNavigatorActionSubtype openNavigatorActionSubtype = (OpenNavigatorActionSubtype) this.b;
                i iVar = (i) this.c;
                Address address = (Address) this.w;
                hws hwsVar = (hws) obj;
                int i9 = nvs.a[openNavigatorActionSubtype.ordinal()];
                if (i9 == 1) {
                    String str2 = iVar.b;
                    jws jwsVar = hwsVar.a;
                    com.yandex.go.navigator.gas_stations.analytics.a aVar = jwsVar.J;
                    (aVar != null ? aVar : null).c(str2, "go_via");
                    jws.P(jwsVar, new o8g0(new b8l0(new uhu0(wgu0Var)), address));
                } else if (i9 != 2) {
                    w511.b();
                    break;
                } else {
                    String str3 = iVar.b;
                    jws jwsVar2 = hwsVar.a;
                    com.yandex.go.navigator.gas_stations.analytics.a aVar2 = jwsVar2.J;
                    (aVar2 != null ? aVar2 : null).c(str3, "go_to");
                    jws.P(jwsVar2, new o8g0(new b8l0(new vhu0(wgu0Var)), address));
                }
                break;
            case 8:
                ((g) this.b).f.remove((String) this.c, (l8x) this.w);
                break;
            case 9:
                String str4 = (String) this.b;
                String str5 = (String) this.c;
                Boolean bool = (Boolean) this.w;
                mnq0 mnq0Var2 = (mnq0) obj;
                if (str4 == null) {
                    str4 = str5;
                }
                f.l(mnq0Var2, str4);
                if (bool != null) {
                    f.q(mnq0Var2, bool.booleanValue());
                }
                break;
            case 10:
                com.yandex.go.inapp_calls.navigation.f fVar = (com.yandex.go.inapp_calls.navigation.f) this.b;
                hkv hkvVar = (hkv) this.c;
                InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason = (InAppCallsAnalytics$PhoneCallFallbackReason) this.w;
                ((skv) obj).u0();
                njv njvVar = fVar.K;
                String str6 = hkvVar.d.b;
                fkv fkvVar = hkvVar.a;
                njvVar.j(str6, inAppCallsAnalytics$PhoneCallFallbackReason, fkvVar != null ? fkvVar.a : null);
                break;
            case 11:
                dpv dpvVar = (dpv) this.b;
                EventTag eventTag = (EventTag) this.c;
                Point point = (Point) this.w;
                RoadEventsManager roadEventsManager = (RoadEventsManager) obj;
                RoadEventSession roadEventSession = dpvVar.f;
                if (roadEventSession != null) {
                    roadEventSession.cancel();
                }
                dpvVar.f = roadEventsManager.addEvent(eventTag, "", point, null, dpvVar.g);
                break;
            case 12:
                l9w l9wVar = (l9w) this.b;
                RawOrderdraftInfo rawOrderdraftInfo = (RawOrderdraftInfo) this.c;
                sls slsVar = (sls) this.w;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    l9wVar.g.b();
                    Preorder preorder = l9wVar.e.a;
                    preorder.I = rawOrderdraftInfo;
                    l9wVar.b.b((m950) l9wVar.c.get(), new b5y0("create order from intercity dashboard", preorder));
                }
                if (Result.a(value) != null) {
                    slsVar.invoke();
                }
                break;
            case 13:
                j jVar = (j) this.b;
                glw glwVar = (glw) this.c;
                glw glwVar2 = (glw) ((jlw) this.w);
                jVar.getClass();
                xy40 xy40Var = new xy40(glwVar2.c.b);
                mp60 mp60Var = glwVar2.c;
                Object[] objArr = mp60Var.a;
                int i10 = mp60Var.b;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object obj4 = (hjw) objArr[i11];
                    if (obj4 instanceof bjw) {
                        obj2 = (bjw) kotlin.sequences.b.j(kotlin.sequences.b.g(new h73(1, ((xy40) glwVar.c).i()), mjw.a));
                        if (obj2 == null) {
                            obj4 = (bjw) obj4;
                        }
                        obj4 = obj2;
                    } else if (obj4 instanceof gjw) {
                        obj2 = (gjw) kotlin.sequences.b.j(kotlin.sequences.b.g(new h73(1, ((xy40) glwVar.c).i()), njw.a));
                        if (obj2 == null) {
                            obj4 = (gjw) obj4;
                        }
                        obj4 = obj2;
                    }
                    xy40Var.g(obj4);
                }
                break;
            case 14:
                gpw gpwVar = (gpw) this.b;
                RawOrderdraftInfo rawOrderdraftInfo2 = (RawOrderdraftInfo) this.c;
                sls slsVar2 = (sls) this.w;
                l9w l9wVar2 = gpwVar.E.a;
                l9wVar2.a.c(new um3(Events$Zalogin$LoginContext.SUMMARY, new qzj0(null, new ynn(i4, l9wVar2, rawOrderdraftInfo2, slsVar2)), false, false, 28));
                ((sy60) obj).a();
                break;
            case 15:
                break;
            case 16:
                com.yandex.go.navigator.settings.language_settings.a aVar3 = (com.yandex.go.navigator.settings.language_settings.a) this.b;
                String str7 = (String) this.c;
                NavigatorLanguageSettingAvailabilityExperiment.Language language = (NavigatorLanguageSettingAvailabilityExperiment.Language) this.w;
                aVar3.getClass();
                String str8 = language.c;
                if (!jl40.l(str7, str8)) {
                    i650 i650Var = aVar3.G.a;
                    HashMap u = n.u(i650Var);
                    if (str8 != null) {
                        u.put("language", str8);
                    }
                    i650Var.a.a("navigation.settings.language.select", u, 1, new HashMap());
                    bf50 bf50Var = aVar3.B;
                    bf50Var.c.r("navigator.language_assistance_key", str8);
                    bf50Var.h.l(str8);
                    Iterator it2 = language.d.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (jl40.l(((NavigatorLanguageSettingAvailabilityExperiment.Voice) next).a, language.b)) {
                                obj3 = next;
                            }
                        }
                    }
                    NavigatorLanguageSettingAvailabilityExperiment.Voice voice = (NavigatorLanguageSettingAvailabilityExperiment.Voice) obj3;
                    if (voice == null) {
                        xby.l(jst.e, "NAVIGATOR", null, null, "failed to find voice to language: " + language, 6);
                    } else {
                        aVar3.E.d(str8, voice.a);
                    }
                }
                break;
            case 17:
                sls slsVar3 = (sls) this.b;
                sls slsVar4 = (sls) this.c;
                sls slsVar5 = (sls) this.w;
                slsVar3.invoke();
                break;
            case 18:
                pey peyVar = (pey) this.b;
                xey xeyVar = (xey) this.c;
                tls tlsVar5 = (tls) this.w;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                wdy wdyVar = new wdy(r11, ref$ObjectRef, xeyVar, tlsVar5);
                peyVar.getLifecycle().a(wdyVar);
                break;
            case 19:
                pey peyVar2 = (pey) this.b;
                bfy bfyVar = (bfy) this.c;
                tls tlsVar6 = (tls) this.w;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                wdy wdyVar2 = new wdy(i7, ref$ObjectRef2, bfyVar, tlsVar6);
                peyVar2.getLifecycle().a(wdyVar2);
                break;
            case 20:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.b;
                p1z p1zVar = (p1z) this.c;
                ContactsUploadData.Record[] recordArr = (ContactsUploadData.Record[]) this.w;
                i2z i2zVar = p1zVar.d;
                ref$IntRef.element = ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new xpy(i5))).intValue();
                p1z.c();
                for (ContactsUploadData.Record record : recordArr) {
                    if (!TextUtils.isEmpty(record.localId)) {
                        ref$IntRef.element = ((Number) androidx.room.util.a.b(i2zVar.b, false, true, new r(record.phoneId, record.localId, 16))).intValue() + ref$IntRef.element;
                    }
                }
                p1z.c();
                com.yandex.messaging.internal.storage.contacts.a aVar4 = p1zVar.b;
                if (recordArr.length == 0) {
                    set = EmptySet.a;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int length = recordArr.length;
                    while (r11 < length) {
                        String str9 = recordArr[r11].phoneId;
                        if (str9 != null) {
                            linkedHashSet.add(str9);
                        }
                        r11++;
                    }
                    set = linkedHashSet;
                }
                aVar4.c(set);
                break;
            case 21:
                String str10 = (String) this.b;
                p4l0 p4l0Var = (p4l0) this.c;
                com.yandex.go.preorder.navigation.a aVar5 = (com.yandex.go.preorder.navigation.a) this.w;
                u1l0 u1l0Var = ((n4l0) p4l0Var).a;
                pv0 pv0Var = u1l0Var.b;
                qq80 qq80Var = u1l0Var.q;
                c cVar = ((sqe0) obj).a;
                mhm mhmVar = new mhm(str10, null);
                k9s0 k9s0Var = k9s0.f;
                cVar.D((m950) cVar.L.get(), mhmVar, new vqe0(cVar, egz.F(bov0.e)));
                c.R(cVar, pv0Var, qq80Var);
                ((qcm) aVar5.N).b("drive_vertical_opened_via_deeplink", kotlin.collections.b.f());
                break;
            case 22:
                ga0 ga0Var = (ga0) this.b;
                j7u0 j7u0Var = (j7u0) this.c;
                l200 l200Var = (l200) obj;
                MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = ((m000) this.w).d;
                d dVar = l200Var.a;
                m000 m000Var = l200Var.b;
                dVar.getClass();
                dVar.E((m950) dVar.F.get(), new g100(ga0Var.a, ga0Var.b, j7u0Var, multiTransportChooseStationCardAnalytics$OpenReasonV2), new ru.yandex.taxi.maas.impl.ride.metropick.c(dVar, m000Var), hxx.a);
                break;
            case 23:
                ImageView imageView = (ImageView) this.b;
                View view = (View) this.c;
                SharedAccountMenuViewModel.BadgeType badgeType = (SharedAccountMenuViewModel.BadgeType) this.w;
                imageView.setVisibility(0);
                view.setVisibility(badgeType == SharedAccountMenuViewModel.BadgeType.NONE ? 8 : 0);
                break;
            case 24:
                final com.yandex.go.navigator.main_screen.i iVar2 = (com.yandex.go.navigator.main_screen.i) this.b;
                l lVar = (l) this.c;
                final k kVar = (k) this.w;
                yfd yfdVar = (yfd) obj;
                final k700 k700Var = new k700(iVar2);
                ((agd) yfdVar).c = lVar.a;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.navigator.main_screen.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        tje.N(i.this.o(), null, null, new MainModalRouter$content$1$1$1(kVar, (w700) obj5, k700Var, null), 3);
                        return zy11.a;
                    }
                };
                agdVar.g = new a(1200984134, new l0(17, iVar2, new h(iVar2)), true);
                break;
            case 25:
                tls tlsVar7 = (tls) this.w;
                ArrayList arrayList2 = (ArrayList) this.b;
                tls tlsVar8 = (tls) this.c;
                int intValue = ((Integer) obj).intValue();
                tlsVar7.invoke(ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.g(intValue, arrayList2));
                ox00 ox00Var = (ox00) kotlin.collections.a.S(intValue, arrayList2);
                if ((ox00Var != null ? ox00Var.d : null) != null) {
                    tlsVar8.invoke(ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.g(intValue, arrayList2));
                }
                break;
            case 26:
                fx3 fx3Var = (fx3) this.b;
                n70 n70Var = (n70) this.c;
                tls tlsVar9 = (tls) this.w;
                jsgVar = fx3Var.b.selectedDay;
                TextView textView = ((d161) n70Var.N).b;
                Text text = ((jsg) n70Var.Z()).b;
                Context context = n70Var.P;
                textView.setText(com.ybsdk.core.utils.text.d.a(context, text));
                d161 d161Var = (d161) n70Var.N;
                TextView textView2 = d161Var.b;
                textView2.setEnabled(((jsg) n70Var.Z()).c);
                xty0.f(textView2, (jsgVar == null || ((jsg) n70Var.Z()).a != jsgVar.a) ? ung0.ybColor_textIcon_primary : ung0.ybColor_textIcon_primaryInverted);
                if (jsgVar != null && ((jsg) n70Var.Z()).a == jsgVar.a) {
                    t = vng.t(nyg0.ybsdk_day_chooser_item_selected, context);
                } else if (!((jsg) n70Var.Z()).c) {
                    t = vng.t(nyg0.ybsdk_day_chooser_item_disabled, context);
                }
                textView2.setBackground(t);
                d161Var.a.setOnClickListener(new os3(n70Var, tlsVar9));
                break;
            case 27:
                List list8 = (List) this.b;
                ((m6y) ((u6y) obj)).f(list8.size(), null, av0.C, new a(-1134430243, new dhj0(list8, (ll30) this.c, (tls) this.w, 7), true));
                break;
            case 28:
                ku30 ku30Var = (ku30) this.b;
                tls tlsVar10 = (tls) this.w;
                sls slsVar6 = (sls) this.c;
                ArrayList arrayList3 = ku30Var.b;
                ((m6y) ((u6y) obj)).f(arrayList3.size(), null, new ly7(arrayList3, i6), new a(2039820996, new sc0(arrayList3, tlsVar10, slsVar6, ku30Var, 1), true));
                break;
            default:
                ((tls) this.w).invoke(new e940(((u510) this.b).b, (String) this.c, (String) obj));
                break;
        }
        return zy11.a;
    }

    public /* synthetic */ ynn(tls tlsVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.w = tlsVar;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ynn(Object obj, tls tlsVar, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.w = tlsVar;
        this.c = obj2;
    }

    public /* synthetic */ ynn(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
