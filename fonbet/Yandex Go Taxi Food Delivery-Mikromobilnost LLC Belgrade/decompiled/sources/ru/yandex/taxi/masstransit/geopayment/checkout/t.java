package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.ad5;
import defpackage.ae30;
import defpackage.at20;
import defpackage.avj0;
import defpackage.be30;
import defpackage.by90;
import defpackage.d411;
import defpackage.f4a0;
import defpackage.g700;
import defpackage.g8e;
import defpackage.gr30;
import defpackage.he30;
import defpackage.hr30;
import defpackage.hxx;
import defpackage.ie30;
import defpackage.ir30;
import defpackage.je30;
import defpackage.jj3;
import defpackage.jr30;
import defpackage.kyh0;
import defpackage.ld30;
import defpackage.lv90;
import defpackage.m020;
import defpackage.m950;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.pj40;
import defpackage.ps20;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q440;
import defpackage.s311;
import defpackage.t411;
import defpackage.tje;
import defpackage.um3;
import defpackage.vfa0;
import defpackage.w511;
import defpackage.wu30;
import defpackage.x830;
import defpackage.zd30;
import defpackage.zsa;
import defpackage.zuj0;
import java.util.HashMap;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutButtonActionType;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class t extends ad5 {
    public final pj40 A;
    public final at20 B;
    public final TransportPaymentAnalytics$CheckoutScreenOpenReason C;
    public final MtCheckoutDeeplinkStatus D;
    public final ru.yandex.taxi.design.utils.b E;
    public final pwy0 F;
    public final k G;
    public final ru.yandex.taxi.am.g H;
    public final jj3 I;
    public final w J;
    public final d411 K;
    public final ru.yandex.taxi.masstransit.domain.h L;
    public final zuj0 M;
    public final s311 N;
    public final wu30 O;
    public final x830 P;
    public final oep0 Q;
    public boolean R;
    public TransportPaymentAnalytics$VehicleType S;
    public pzt0 T;
    public pzt0 U;
    public boolean V;
    public final String x;
    public final String y;
    public final Object z;

    public t(String str, String str2, Object obj, pj40 pj40Var, at20 at20Var, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus, ru.yandex.taxi.design.utils.b bVar, pwy0 pwy0Var, k kVar, ru.yandex.taxi.am.g gVar, jj3 jj3Var, w wVar, d411 d411Var, ru.yandex.taxi.masstransit.domain.h hVar, zuj0 zuj0Var, s311 s311Var, wu30 wu30Var, x830 x830Var, oep0 oep0Var) {
        super(zd30.class);
        this.x = str;
        this.y = str2;
        this.z = obj;
        this.A = pj40Var;
        this.B = at20Var;
        this.C = transportPaymentAnalytics$CheckoutScreenOpenReason;
        this.D = mtCheckoutDeeplinkStatus;
        this.E = bVar;
        this.F = pwy0Var;
        this.G = kVar;
        this.H = gVar;
        this.I = jj3Var;
        this.J = wVar;
        this.K = d411Var;
        this.L = hVar;
        this.M = zuj0Var;
        this.N = s311Var;
        this.O = wu30Var;
        this.P = x830Var;
        this.Q = oep0Var;
        this.S = TransportPaymentAnalytics$VehicleType.Bus;
    }

    public static void Og(t tVar, String str, String str2, String str3, Object obj, int i) {
        String str4 = (i & 1) != 0 ? null : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        pzt0 pzt0Var = tVar.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tVar.T = tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$requestCheckout$1(tVar, str6, str4, str5, false, obj, null), 3);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((by90) ((l) this.G.k).c.getValue()).dispose();
    }

    public final void Kg(TransportPaymentAnalytics$CheckoutButtonActionType transportPaymentAnalytics$CheckoutButtonActionType, ld30 ld30Var) {
        String str;
        lv90 lv90Var;
        Zone zone;
        int a = this.G.a();
        String str2 = ld30Var.f;
        f4a0 f4a0Var = ld30Var.d;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = this.S;
        Double d = ld30Var.a;
        Integer valueOf = Integer.valueOf(a);
        String str3 = ld30Var.b;
        String str4 = ld30Var.c;
        ZoneAddress n = this.O.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        String b = (f4a0Var == null || (lv90Var = f4a0Var.b) == null) ? null : lv90Var.b();
        Boolean valueOf2 = Boolean.valueOf(f4a0Var != null ? !f4a0Var.a() : false);
        d411 d411Var = this.K;
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("request_id", str2);
        }
        hashMap.put("button_name", transportPaymentAnalytics$CheckoutButtonActionType.getEventValue());
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = this.C;
        if (transportPaymentAnalytics$CheckoutScreenOpenReason != null) {
            hashMap.put("source", transportPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
        }
        if (transportPaymentAnalytics$VehicleType != null) {
            hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        }
        if (d != null) {
            hashMap.put("sum_ticket_price", d);
        }
        hashMap.put("ticket_counter", valueOf);
        if (str3 != null) {
            hashMap.put("destination_stop_id", str3);
        }
        if (str4 != null) {
            hashMap.put("transport_id", str4);
        }
        String str5 = this.y;
        if (str5 != null) {
            hashMap.put("qr_url", str5);
        }
        hashMap.put("zone_name", str);
        if (b != null) {
            hashMap.put("payment_method", b);
        }
        d411Var.a.a("TransportPayment.Checkout.Tapped", hashMap, 4, g8e.v(hashMap, "payment_method_available", valueOf2));
    }

    public final void Lg(jr30 jr30Var, String str, String str2, String str3, String str4) {
        Zone zone;
        String str5;
        Zone zone2;
        String str6;
        boolean z = jr30Var instanceof gr30;
        String str7 = "";
        wu30 wu30Var = this.O;
        if (z) {
            gr30 gr30Var = (gr30) jr30Var;
            double d = gr30Var.a;
            String str8 = gr30Var.b;
            int i = gr30Var.c;
            String str9 = gr30Var.d;
            String str10 = gr30Var.e;
            ZoneAddress n = wu30Var.n();
            if (n != null && (zone2 = n.b) != null && (str6 = zone2.a) != null) {
                str7 = str6;
            }
            ru.yandex.taxi.am.g gVar = this.H;
            if (gVar.f() && gVar.g()) {
                ((pep0) this.Q).f(new zsa(22, this.J, new be30(this, str8, str4, d, i, str10, str7), new m020(18, this)), new vfa0(i, str8, str9, d, str10), hxx.a);
                return;
            } else {
                this.I.a(new um3(Events$Zalogin$LoginContext.MASSTRANSIT, null, false, false, 30), false);
                return;
            }
        }
        if (!(jr30Var instanceof hr30)) {
            if (!(jr30Var instanceof ir30)) {
                w511.b();
                return;
            } else {
                ir30 ir30Var = (ir30) jr30Var;
                Ng(ir30Var.a, ir30Var.b);
                return;
            }
        }
        hr30 hr30Var = (hr30) jr30Var;
        f4a0 f4a0Var = hr30Var.f;
        if (f4a0Var.a()) {
            Mg(str, str2, str3, false);
            return;
        }
        String str11 = hr30Var.b;
        int i2 = hr30Var.c;
        String str12 = "";
        String str13 = hr30Var.d;
        String str14 = hr30Var.e;
        boolean z2 = !f4a0Var.a();
        double d2 = hr30Var.a;
        ZoneAddress n2 = wu30Var.n();
        if (n2 != null && (zone = n2.b) != null && (str5 = zone.a) != null) {
            str12 = str5;
        }
        Object obj = hr30Var.g;
        Double valueOf = Double.valueOf(d2);
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.U = tje.N(Jg(), null, null, new MtCheckoutPresenter$proceedPayment$1(this, str11, i2, str13, str14, f4a0Var, z2, valueOf, str12, obj, null), 3);
    }

    public final void Mg(String str, String str2, String str3, boolean z) {
        at20 at20Var = this.B;
        je30 je30Var = (je30) at20Var.b;
        g700 g700Var = new g700(29, je30Var, at20Var);
        com.yandex.go.payments.transport.navigation.e eVar = (com.yandex.go.payments.transport.navigation.e) je30Var.K.get();
        je30Var.V = eVar;
        if (!z && str3 != null) {
            str2 = str3;
        }
        t411 t411Var = new t411(str, str2);
        t411Var.c = g700Var;
        je30Var.A(eVar, t411Var, new he30(je30Var, 0));
    }

    public final void Ng(String str, String str2) {
        MtCheckoutPresenter$openStopSelector$1 mtCheckoutPresenter$openStopSelector$1 = new MtCheckoutPresenter$openStopSelector$1(4, this, t.class, "requestCheckout", "requestCheckout(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V", 0);
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = this.S;
        at20 at20Var = this.B;
        je30 je30Var = (je30) at20Var.b;
        m950 m950Var = (m950) je30Var.I.get();
        ae30 ae30Var = (ae30) at20Var.a;
        je30Var.A(m950Var, new q440(ae30Var.a, ae30Var.b, transportPaymentAnalytics$VehicleType, str, str2), new ie30(mtCheckoutPresenter$openStopSelector$1));
    }

    public final void Pg() {
        int i = kyh0.mt_ticket_is_paid;
        avj0 avj0Var = (avj0) this.M;
        this.L.a(avj0Var.h(i));
        ((zd30) Dg()).X(avj0Var.h(kyh0.mt_ticket_is_paid));
        ((je30) this.B.b).r(new ps20(25));
    }
}
