package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.at20;
import defpackage.avj0;
import defpackage.d411;
import defpackage.de30;
import defpackage.ee30;
import defpackage.f411;
import defpackage.f4a0;
import defpackage.g700;
import defpackage.i26;
import defpackage.je30;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.onb;
import defpackage.pj40;
import defpackage.pnb;
import defpackage.qnb;
import defpackage.s411;
import defpackage.tje;
import defpackage.ulj;
import defpackage.vpr;
import defpackage.vz01;
import defpackage.w511;
import defpackage.zd30;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class q implements vpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ zd30 b;

    public q(t tVar, zd30 zd30Var) {
        this.a = tVar;
        this.b = zd30Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType;
        Zone zone;
        String str;
        qnb qnbVar = (qnb) obj;
        boolean z = qnbVar instanceof CheckoutUIState$PaymentCheckoutUIState;
        zd30 zd30Var = this.b;
        t tVar = this.a;
        if (z) {
            if (!tVar.R) {
                CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState = (CheckoutUIState$PaymentCheckoutUIState) qnbVar;
                vz01 vz01Var = checkoutUIState$PaymentCheckoutUIState.c;
                if (!checkoutUIState$PaymentCheckoutUIState.i && !checkoutUIState$PaymentCheckoutUIState.h) {
                    f4a0 f4a0Var = checkoutUIState$PaymentCheckoutUIState.m;
                    int i = de30.a[vz01Var.b.ordinal()];
                    if (i == 1) {
                        transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Bus;
                    } else if (i == 2) {
                        transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Tram;
                    } else if (i == 3) {
                        transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Trolley;
                    } else if (i == 4) {
                        transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Water;
                    } else {
                        if (i != 5) {
                            w511.b();
                            return null;
                        }
                        transportPaymentAnalytics$VehicleType = TransportPaymentAnalytics$VehicleType.Electrobus;
                    }
                    tVar.S = transportPaymentAnalytics$VehicleType;
                    d411 d411Var = tVar.K;
                    TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = tVar.C;
                    String str2 = vz01Var.a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String b = f4a0Var.b.b();
                    if (b == null) {
                        b = "";
                    }
                    boolean z2 = !f4a0Var.a();
                    String str4 = checkoutUIState$PaymentCheckoutUIState.a;
                    Double d = checkoutUIState$PaymentCheckoutUIState.k;
                    ZoneAddress n = tVar.O.n();
                    if (n != null && (zone = n.b) != null && (str = zone.a) != null) {
                        str3 = str;
                    }
                    pj40 pj40Var = tVar.A;
                    String str5 = pj40Var.a;
                    String str6 = pj40Var.b;
                    d411Var.getClass();
                    HashMap hashMap = new HashMap();
                    if (str4 != null) {
                        hashMap.put("request_id", str4);
                    }
                    hashMap.put("source", transportPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
                    hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
                    if (d != null) {
                        hashMap.put("sum_ticket_price", d);
                    }
                    hashMap.put("transport_id", str2);
                    hashMap.put("zone_name", str3);
                    hashMap.put("payment_method", b);
                    hashMap.put("payment_method_available", Boolean.valueOf(z2));
                    if (str5 != null) {
                        hashMap.put("utm_source", str5);
                    }
                    if (str6 != null) {
                        hashMap.put("utm_medium", str6);
                    }
                    d411Var.a.a("TransportPayment.Checkout.FirstLoaded", hashMap, 1, new HashMap());
                    tVar.R = true;
                }
            }
            CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState2 = (CheckoutUIState$PaymentCheckoutUIState) qnbVar;
            boolean z3 = checkoutUIState$PaymentCheckoutUIState2.i;
            if (!checkoutUIState$PaymentCheckoutUIState2.h && !z3 && !tVar.V && tVar.D == MtCheckoutDeeplinkStatus.SUCCESS) {
                tVar.V = true;
                tje.N(tVar.Jg(), null, null, new MtCheckoutPresenter$attachView$6$1$1(null, tVar), 3);
                tVar.L.a(((avj0) tVar.M).h(kyh0.mt_card_binding_success_notification));
            }
            zd30Var.K9(checkoutUIState$PaymentCheckoutUIState2);
            if (z3) {
                CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState = checkoutUIState$PaymentCheckoutUIState2.j;
                if ((paymentCheckoutErrorState != null ? paymentCheckoutErrorState.a : null) != null) {
                    if (ee30.a[paymentCheckoutErrorState.a.ordinal()] != 1) {
                        w511.b();
                        return null;
                    }
                    if (!((s411) tVar.P).b().equals(f411.c)) {
                        at20 at20Var = tVar.B;
                        g700 g700Var = new g700(28, qnbVar, tVar);
                        je30 je30Var = (je30) at20Var.b;
                        je30Var.z((m950) je30Var.M.get(), new i26(1, g700Var));
                    }
                }
            }
        } else if (qnbVar instanceof onb) {
            onb onbVar = (onb) qnbVar;
            List list = onbVar.c;
            if (list.size() == 1) {
                tVar.Ng(((ulj) kotlin.collections.a.P(list)).a, onbVar.d);
            } else {
                zd30Var.U1(onbVar);
            }
        } else {
            if (!jl40.l(qnbVar, pnb.a)) {
                w511.b();
                return null;
            }
            zd30Var.Wd();
        }
        return zy11.a;
    }
}
