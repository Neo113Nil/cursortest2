package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.address.models.Address;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.loyalty.impl.selector.data.LoyaltyApi;
import com.yandex.go.loyalty.impl.selector.domain.d;
import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;
import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;
import com.yandex.go.places.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import com.yandex.go.summary.requirements.list.requirementgroup.experiment.ComposeSpecialRequirementsExperiment;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.sharing.RideCardSharingView;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.delivery.web.b;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.masstransit.geopayment.checkout.w;
import ru.yandex.taxi.masstransit.stop.ui.overlay.a;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class zsa extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;
    public Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsa(l3e l3eVar, yvf0 yvf0Var, ppl0 ppl0Var) {
        super(null);
        this.D = 19;
        this.F = l3eVar;
        this.E = yvf0Var;
        this.G = ppl0Var;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 24:
                a aVar = (a) this.G;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 25:
                ru.yandex.taxi.masstransit.stoproute.ui.overlay.a aVar2 = (ru.yandex.taxi.masstransit.stoproute.ui.overlay.a) this.G;
                if (aVar2 != null) {
                    aVar2.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 24:
                a aVar = (a) this.G;
                if (aVar != null) {
                    aVar.a.Cg();
                    ((c) aVar.b).a();
                    break;
                }
                break;
            case 25:
                ru.yandex.taxi.masstransit.stoproute.ui.overlay.a aVar2 = (ru.yandex.taxi.masstransit.stoproute.ui.overlay.a) this.G;
                if (aVar2 != null) {
                    aVar2.a.Cg();
                    ((fw30) aVar2.d.getValue()).a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 4:
                ((z0j) this.G).c(this);
                break;
            case 24:
                this.G = null;
                break;
            case 25:
                this.G = null;
                break;
            case 26:
                PlacesSearchbarContainerView placesSearchbarContainerView = (PlacesSearchbarContainerView) this.G;
                ViewParent parent = placesSearchbarContainerView != null ? placesSearchbarContainerView.getParent() : null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView((PlacesSearchbarContainerView) this.G);
                }
                this.G = null;
                break;
            case 28:
                ((udc0) ((com.yandex.go.places.impl.navigation.a) ((h3y) this.G).get()).e.getValue()).i();
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        bgq0 bgq0Var;
        bgq0 bgq0Var2;
        dvz dvzVar;
        lxz a;
        Object obj2;
        m950 m950Var;
        int i = this.D;
        int i2 = 12;
        int i3 = 4;
        int i4 = 9;
        int i5 = 25;
        int i6 = 3;
        int i7 = 2;
        final int i8 = 0;
        final int i9 = 1;
        Object obj3 = this.F;
        Object obj4 = this.E;
        switch (i) {
            case 0:
                PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
                fva0.f((fva0) obj3, "Chargers.Story", performanceAnalytics$Type, 0L, 4);
                dm9 dm9Var = (dm9) this.G;
                ((na1) dm9Var.b).getClass();
                dm9Var.b("passed_onboarding", as6.c());
                A((m950) ((yvf0) obj4).get(), new npu0((x3) new mpu0(((zo9) obj).a), "discovery_chargers", (Float) null, true, BuildConfig.API_LEVEL), new dl1(i2, this));
                fva0.b((fva0) obj3, "Chargers.Story", performanceAnalytics$Type, null, 4);
                break;
            case 1:
                A((m950) ((umt0) obj4).get(), (jo11) obj, new pn4(this, i8));
                break;
            case 2:
                tot0 tot0Var = (tot0) obj;
                if (!((ComposeSpecialRequirementsExperiment) ((rz0) this.G).b.b()).b) {
                    A((m950) ((u6o0) obj3).get(), tot0Var, new sy60(this) { // from class: ma5
                        public final /* synthetic */ zsa b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sy60
                        public final void a() {
                            int i10 = i9;
                            zsa zsaVar = this.b;
                            switch (i10) {
                                case 0:
                                    zsaVar.r(new qu(9));
                                    break;
                                default:
                                    zsaVar.r(new qu(9));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    A((m950) ((yvf0) obj4).get(), tot0Var.a, new sy60(this) { // from class: ma5
                        public final /* synthetic */ zsa b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sy60
                        public final void a() {
                            int i10 = i8;
                            zsa zsaVar = this.b;
                            switch (i10) {
                                case 0:
                                    zsaVar.r(new qu(9));
                                    break;
                                default:
                                    zsaVar.r(new qu(9));
                                    break;
                            }
                        }
                    });
                    break;
                }
            case 3:
                nde ndeVar = (nde) obj;
                m950 m950Var2 = (m950) ((yvf0) obj4).get();
                Pair pair = ndeVar.a ? new Pair(DeliveryFormStepType.SOURCE, Integer.valueOf(kyh0.cargo_form_contacts_sender_title)) : new Pair(DeliveryFormStepType.DESTINATION, Integer.valueOf(kyh0.cargo_form_contacts_recepient_title));
                DeliveryFormStepType deliveryFormStepType = (DeliveryFormStepType) pair.getFirst();
                int intValue = ((Number) pair.getSecond()).intValue();
                String str = ndeVar.b;
                if (str == null) {
                    str = ((avj0) ((zuj0) obj3)).h(intValue);
                }
                String str2 = str;
                String str3 = ndeVar.c;
                s9e s9eVar = ndeVar.g;
                bgq0 bgq0Var3 = s9eVar != null ? new bgq0(s9eVar.a, s9eVar.b, (SelectedFrom) null, 12) : bgq0.f;
                String Og = ((h) ((vp21) this.G)).Og();
                if (Og.length() == 0) {
                    Og = null;
                }
                if (Og != null) {
                    String str4 = ndeVar.d;
                    if (str4 == null) {
                        str4 = Og;
                    }
                    bgq0Var = new bgq0(str4, Og, (SelectedFrom) null, 12);
                } else {
                    bgq0Var = null;
                }
                String str5 = ndeVar.e;
                if (str5 != null) {
                    String str6 = ndeVar.f;
                    if (str6 == null) {
                        str6 = "";
                    }
                    bgq0Var2 = new bgq0(str5, str6, (SelectedFrom) null, 12);
                } else {
                    bgq0Var2 = null;
                }
                A(m950Var2, new f1i(new x0i(deliveryFormStepType, str2, j73.A(new bgq0[]{bgq0Var, bgq0Var2}), str3, bgq0Var3, null, false, false, null, 480), new pm5(24, this), new kv8(i8, this), null), sy60.Q2);
                break;
            case 4:
                ((z0j) this.G).a(this);
                v7n v7nVar = (v7n) obj4;
                A(new x7n(v7nVar.a, v7nVar.b, v7nVar.c, v7nVar.d), new u7n(DynamicFeature.CARTECH), new l19(this, (z09) obj));
                break;
            case 5:
                D((m950) ((yvf0) obj4).get(), new noa(ChargersQrOpenReason.RETURN_CHARGER), new cp9(this, ((bp9) obj).a, i8));
                break;
            case 6:
                P(((p4a) obj).a);
                break;
            case 7:
                A((qzi) obj4, (wzi) obj, new j83(i9, this));
                break;
            case 8:
                rxc rxcVar = (rxc) obj;
                ComplaintNotification complaintNotification = new ComplaintNotification((Context) obj4, (pav) this.G, rxcVar.b, rxcVar.a);
                ((tj60) obj3).e(complaintNotification);
                complaintNotification.setExpiresListener(new wz1(i3, this));
                complaintNotification.startExpiresTimer();
                r(new qu(i4));
                break;
            case 9:
                A((y4c0) obj4, (v4c0) obj, new e3h(this, i8));
                break;
            case 10:
                z((zc) obj4, new hvh(this));
                break;
            case 11:
                A((ru.yandex.taxi.delivery.router.primary.a) obj4, (eli) obj, new fgi(this));
                break;
            case 12:
                A((ej1) obj4, (m8o) obj, new xii(this));
                break;
            case 13:
                A((b) obj4, (wvi) obj, new kzh(i9, this));
                break;
            case 14:
                A((com.yandex.go.payments.drive.navigation.a) obj4, (nem) obj, new pem(this));
                break;
            case 15:
                q3p q3pVar = (q3p) obj;
                m950 a2 = ((ru.yandex.taxi.superapp.payment.a) ((h3y) obj3).get()).b(q3pVar.b).b.a.a();
                w6a0 w6a0Var = q3pVar.a;
                zzs zzsVar = new zzs(w6a0Var.a, w6a0Var.b, 0, null, null, 28);
                PaymentsScreen paymentsScreen = PaymentsScreen.SUPERAPP;
                h0a0 h0a0Var = new h0a0(zzsVar, null);
                lv90 a3 = ((xku0) this.G).a.a();
                PaymentMethod$Type paymentMethod$Type = a3.a;
                A(a2, new azz(paymentsScreen, "no_feature", h0a0Var, paymentMethod$Type == null ? null : new m6a0(paymentMethod$Type, a3.b, null), true, false, null, false, false, null, null, null, null, null, null, null, null, null, 524224), new ama(i7, this));
                break;
            case 16:
                A((jtu) obj4, (gtu) obj, new sfp(this));
                break;
            case 17:
                A((com.yandex.go.intercity.flex.dashboard.point_selection.a) obj4, (anw) obj, new hdw(this));
                break;
            case 18:
                A((ru.yandex.taxi.routeselector.a) obj4, (y9l0) obj, new wvw(this, i8));
                break;
            case 19:
                vrz vrzVar = (vrz) obj;
                if (vrzVar == null) {
                    w511.b();
                    break;
                } else {
                    dqk0 dqk0Var = vrzVar.a;
                    ppl0 ppl0Var = (ppl0) this.G;
                    String str7 = dqk0Var.a;
                    ppl0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("order_id", str7);
                    ppl0Var.a.a("SafetyCenter.LostItemsPush.Tapped", hashMap, 1, new HashMap());
                    D((m950) ((l3e) obj3).get(), dqk0Var, new urz(this));
                    break;
                }
            case 20:
                swz swzVar = (swz) obj;
                String str8 = swzVar.b;
                if (str8 == null || str8.length() == 0 || (a = ((nxz) obj4).a()) == null) {
                    dvzVar = null;
                } else {
                    Iterator it = a.a.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (jl40.l(((dvz) obj2).a, str8)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    dvzVar = (dvz) obj2;
                }
                if ((dvzVar != null ? dvzVar.d : null) != LoyaltyProgramState.ENABLED) {
                    i6r i6rVar = (i6r) ((h3y) obj3).get();
                    i6rVar.getClass();
                    xvf0 b = i5m.b(jwz.a);
                    xvf0 b2 = i5m.b(uwz.a);
                    i2g i2gVar = new i2g(i6rVar, 28);
                    int i10 = 27;
                    bsz bszVar = new bsz(new i2g(i6rVar, i5), new i2g(i6rVar, i10), i6);
                    int i11 = 26;
                    h1t h1tVar = new h1t(new i2g(i6rVar, i11), i11);
                    h1t h1tVar2 = new h1t(new d441(new i2g(i6rVar, 29), 5), i10);
                    c0g c0gVar = (c0g) i6rVar;
                    zzf zzfVar = c0gVar.z;
                    Context e2 = c0gVar.e2();
                    q5z.h(e2);
                    w030 C2 = c0gVar.C2();
                    q5z.h(C2);
                    zuj0 N2 = c0gVar.N2();
                    q5z.h(N2);
                    nxz nxzVar = (nxz) zzfVar.v9.get();
                    q5z.h(nxzVar);
                    ru.yandex.taxi.widget.c r2 = c0gVar.r2();
                    q5z.h(r2);
                    yp2 yp2Var = (yp2) zzfVar.kk.get();
                    q5z.h(yp2Var);
                    com.yandex.go.loyalty.impl.selector.ui.b bVar = new com.yandex.go.loyalty.impl.selector.ui.b(N2, nxzVar, r2, new dwz(yp2Var), (iwz) b.get(), new i4u((twz) b2.get()), (twz) b2.get());
                    nxz nxzVar2 = (nxz) zzfVar.v9.get();
                    q5z.h(nxzVar2);
                    pho k2 = c0gVar.k2();
                    q5z.h(k2);
                    u8w u8wVar = new u8w(k2);
                    cda0 cda0Var = (cda0) zzfVar.j1.get();
                    q5z.h(cda0Var);
                    com.yandex.go.loyalty.impl.common.domain.h hVar = (com.yandex.go.loyalty.impl.common.domain.h) c0gVar.R6.get();
                    q5z.h(hVar);
                    qyz qyzVar = new qyz((ryz) zzfVar.Dj.get());
                    com.yandex.go.loyalty.impl.common.domain.a aVar = (com.yandex.go.loyalty.impl.common.domain.a) c0gVar.V6.get();
                    q5z.h(aVar);
                    LoyaltyApi V0 = zzfVar.V0();
                    com.yandex.go.loyalty.impl.common.domain.h hVar2 = (com.yandex.go.loyalty.impl.common.domain.h) c0gVar.R6.get();
                    q5z.h(hVar2);
                    com.yandex.go.loyalty.impl.selector.domain.a aVar2 = new com.yandex.go.loyalty.impl.selector.domain.a(V0, hVar2);
                    lvz lvzVar = new lvz();
                    x1f0 x1f0Var = (x1f0) zzfVar.h1.get();
                    q5z.h(x1f0Var);
                    A(new hwz(e2, C2, bVar, new d(nxzVar2, u8wVar, cda0Var, hVar, qyzVar, aVar, aVar2, new am2(lvzVar, x1f0Var, i2gVar), (iwz) b.get(), (twz) b2.get(), i5m.a(bszVar), h1tVar), h1tVar2), swzVar, new wui(this, 18));
                    break;
                } else {
                    ((rwz) ((h3y) this.G).get()).b(dvzVar.a);
                    r(new qu(i4));
                    break;
                }
            case 21:
                ym10 ym10Var = (ym10) obj;
                int i12 = zm10.a[ym10Var.a.ordinal()];
                if (i12 == 1) {
                    m950Var = (h55) ((vw2) obj3).get();
                } else if (i12 == 2) {
                    m950Var = (h55) ((yvf0) obj4).get();
                } else if (i12 != 3) {
                    w511.b();
                    break;
                } else {
                    m950Var = (h55) ((my0) this.G).get();
                }
                A(m950Var, new mff0(ym10Var.b, ym10Var.c), new wui(this, i5));
                break;
            case 22:
                A((w) obj4, (vfa0) obj, new ce30(this));
                break;
            case 23:
                A((sw30) obj4, (zy11) obj, new uo30(this, i9));
                break;
            case 24:
                zzs zzsVar2 = ((g240) obj).a;
                xv10 xv10Var = ((f240) obj3).a;
                e240 e240Var = new e240(zzsVar2, (ah00) ((f3g) xv10Var.a).get(), (m010) ((xvf0) xv10Var.b).get(), (c440) ((xvf0) xv10Var.c).get(), (ru.yandex.taxi.masstransit.stop.interactor.h) ((hs30) xv10Var.w).get(), (ru.yandex.taxi.masstransit.utils.a) ((c4p) xv10Var.x).get());
                gus gusVar = ((h240) obj4).a;
                this.G = new a(e240Var, (j741) gusVar.a.get(), (uo21) gusVar.b.get());
                break;
            case 25:
                d340 d340Var = (d340) obj;
                zzs zzsVar3 = d340Var.a;
                boolean z = d340Var.b;
                e100 e100Var = ((c340) obj3).a;
                b340 b340Var = new b340(zzsVar3, z, (ah00) ((f3g) e100Var.b).get(), (f340) ((xvf0) e100Var.c).get(), (ru.yandex.taxi.masstransit.utils.a) ((xvf0) e100Var.w).get());
                a2g a2gVar = ((e340) obj4).a;
                this.G = new ru.yandex.taxi.masstransit.stoproute.ui.overlay.a(b340Var, (gw30) a2gVar.a.get(), (xm00) a2gVar.b.a);
                break;
            case 26:
                rec0 rec0Var = (rec0) obj;
                p370 p370Var = rec0Var.c;
                com.yandex.go.places.searchbar.impl.router.a aVar3 = new com.yandex.go.places.searchbar.impl.router.a(this, rec0Var);
                qp0 qp0Var = ((qec0) obj4).a;
                com.yandex.go.places.searchbar.impl.presentation.a aVar4 = new com.yandex.go.places.searchbar.impl.presentation.a((com.yandex.go.places.searchbar.impl.domain.a) qp0Var.a.get(), (k7x0) qp0Var.b.get(), (pwy0) qp0Var.c.get(), p370Var, aVar3);
                v66 v66Var = rec0Var.b;
                boolean z2 = rec0Var.d;
                jec0 jec0Var = ((kec0) obj3).a;
                PlacesSearchbarContainerView placesSearchbarContainerView = new PlacesSearchbarContainerView((Context) jec0Var.a.get(), (ScrollUpButtonView) jec0Var.b.get(), (zec0) jec0Var.c.a, aVar4, v66Var, z2);
                this.G = placesSearchbarContainerView;
                rec0Var.a.addView(placesSearchbarContainerView, new ViewGroup.LayoutParams(-1, -1));
                break;
            case 27:
                cnk0 cnk0Var = (cnk0) obj;
                long j = cnk0Var.a;
                hhs0 hhs0Var = cnk0Var.b;
                iik0 iik0Var = new iik0(i7, this);
                kdd0 kdd0Var = ((zmk0) obj4).a;
                hnk0 hnk0Var = new hnk0((Context) ((r6g) kdd0Var.a).get(), j, hhs0Var, iik0Var, (o8g0) ((n7i0) kdd0Var.b).get(), (tt2) ((xvf0) kdd0Var.c).get(), (o2y0) ((xvf0) kdd0Var.d).get());
                kdd0 kdd0Var2 = ((gnk0) obj3).a;
                new RideCardSharingView((Context) ((r6g) kdd0Var2.a).get(), hnk0Var, (com.yandex.go.taxi.order.details.v2.analytics.perf.a) ((xvf0) kdd0Var2.b).get(), (ydk0) ((xvf0) kdd0Var2.c).get(), (ckk0) ((xvf0) kdd0Var2.d).get());
                break;
            case 28:
                Q(null);
                break;
            default:
                A((ru.yandex.taxi.routeselector.a) obj4, (y9l0) obj, new wvw(this, i9));
                break;
        }
    }

    public void P(ArrayList arrayList) {
        A((m950) ((k4a) this.G).get(), new i4a(arrayList), new t4a(this, arrayList));
    }

    public void Q(Address address) {
        D((m950) ((yvf0) this.E).get(), new qf50(new wf50(address, 1), true), new g4l0(this, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsa(int i, Object obj, Object obj2, Object obj3) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsa(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsa(zuj0 zuj0Var, vp21 vp21Var, yvf0 yvf0Var) {
        super(null);
        this.D = 3;
        this.F = zuj0Var;
        this.G = vp21Var;
        this.E = yvf0Var;
    }
}
