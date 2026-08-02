package ru.yandex.taxi.masstransit;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import com.yandex.go.masstransit.sdk.ble.api.analytics.BleVehiclesScreenOpenReason;
import defpackage.a36;
import defpackage.c0g;
import defpackage.e310;
import defpackage.egb1;
import defpackage.i3g;
import defpackage.m5u;
import defpackage.md30;
import defpackage.n5u;
import defpackage.pj40;
import defpackage.qu;
import defpackage.sy60;
import defpackage.t310;
import defpackage.tje;
import defpackage.vje;
import defpackage.wq30;
import defpackage.xga0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class c implements vje {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        e310 e310Var;
        MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior;
        d dVar = this.a;
        dVar.getClass();
        boolean d = egb1.d(intent);
        n5u n5uVar = n5u.a;
        if (d) {
            dVar.r(new qu(9));
            return n5uVar;
        }
        Uri data = intent.getData();
        if (data != null && (e310Var = dVar.e0) != null) {
            boolean equalsIgnoreCase = "masstransit-checkout".equalsIgnoreCase(data.getAuthority());
            wq30 wq30Var = wq30.a;
            if (equalsIgnoreCase) {
                ((c0g) ((i3g) e310Var).a).z6().a();
                String queryParameter = data.getQueryParameter("vehicle_id");
                String str = (queryParameter == null || queryParameter.length() == 0) ? null : queryParameter;
                String queryParameter2 = data.getQueryParameter("qr_url");
                String str2 = (queryParameter2 == null || queryParameter2.length() == 0) ? null : queryParameter2;
                String queryParameter3 = data.getQueryParameter("utm_source");
                String queryParameter4 = data.getQueryParameter("utm_medium");
                String queryParameter5 = data.getQueryParameter("card_link_status");
                pj40 pj40Var = new pj40(queryParameter3, queryParameter4);
                if (str != null || str2 != null) {
                    String uri = data.toString();
                    TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = TransportPaymentAnalytics$CheckoutScreenOpenReason.Deeplink;
                    MtCheckoutDeeplinkStatus.Companion.getClass();
                    dVar.X(e310Var, str, str2, uri, null, pj40Var, transportPaymentAnalytics$CheckoutScreenOpenReason, wq30Var, md30.a(queryParameter5));
                } else if (queryParameter5 != null) {
                    dVar.T(e310Var, queryParameter5);
                }
                return new m5u(false, false);
            }
            if ("masstransit-payment-qr".equalsIgnoreCase(data.getAuthority())) {
                ((c0g) ((i3g) e310Var).a).z6().a();
                dVar.a0(e310Var, wq30Var);
                return new m5u(false, false);
            }
            if ("masstransit-payment-ble".equalsIgnoreCase(data.getAuthority())) {
                String queryParameter6 = data.getQueryParameter("exit_behavior");
                if (queryParameter6 != null) {
                    MasstransitPaymentBleExitBehavior.Companion.getClass();
                    masstransitPaymentBleExitBehavior = t310.a(queryParameter6);
                } else {
                    masstransitPaymentBleExitBehavior = null;
                }
                if (masstransitPaymentBleExitBehavior == MasstransitPaymentBleExitBehavior.DISMISS) {
                    i3g i3gVar = (i3g) e310Var;
                    ((c0g) i3gVar.a).z6().a();
                    xga0 xga0Var = (xga0) dVar.a0.get();
                    pj40 pj40Var2 = i3gVar.c;
                    a36 a36Var = new a36(BleVehiclesScreenOpenReason.Deeplink, pj40Var2.a, pj40Var2.b);
                    dVar.A(xga0Var, zy11.a, sy60.Q2);
                    tje.N(dVar.o(), null, null, new MassTransitModeRouterImpl$startGeoPaymentInMode$1(dVar, xga0Var, e310Var, a36Var, null), 3);
                    return new m5u(false, false);
                }
            }
        }
        return n5uVar;
    }
}
