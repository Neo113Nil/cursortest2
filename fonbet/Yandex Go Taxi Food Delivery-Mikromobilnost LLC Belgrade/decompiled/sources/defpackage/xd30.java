package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.zone.model.Zone;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutErrorReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.geopayment.checkout.t;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

/* loaded from: classes6.dex */
public final class xd30 implements zd30 {
    public final /* synthetic */ MtCheckoutModalView a;

    public xd30(MtCheckoutModalView mtCheckoutModalView) {
        this.a = mtCheckoutModalView;
    }

    @Override // defpackage.zd30
    public final void K9(CheckoutUIState$PaymentCheckoutUIState checkoutUIState$PaymentCheckoutUIState) {
        t tVar;
        String str;
        lv90 lv90Var;
        Zone zone;
        miu0 miu0Var;
        boolean z = checkoutUIState$PaymentCheckoutUIState.i;
        String str2 = checkoutUIState$PaymentCheckoutUIState.a;
        f4a0 f4a0Var = checkoutUIState$PaymentCheckoutUIState.m;
        CheckoutUIState$PaymentCheckoutUIState.PaymentCheckoutErrorState paymentCheckoutErrorState = checkoutUIState$PaymentCheckoutUIState.j;
        MtCheckoutModalView mtCheckoutModalView = this.a;
        if (!z) {
            if (checkoutUIState$PaymentCheckoutUIState.h && str2 == null && !checkoutUIState$PaymentCheckoutUIState.t) {
                mtCheckoutModalView.renderLoadingState(f4a0Var, checkoutUIState$PaymentCheckoutUIState.q, false);
                return;
            } else {
                mtCheckoutModalView.renderSuccessCheckoutPaymentState(checkoutUIState$PaymentCheckoutUIState);
                return;
            }
        }
        String str3 = null;
        mtCheckoutModalView.renderErrorState(paymentCheckoutErrorState != null ? paymentCheckoutErrorState.b : null, paymentCheckoutErrorState != null ? paymentCheckoutErrorState.c : null, checkoutUIState$PaymentCheckoutUIState.l);
        tVar = mtCheckoutModalView.presenter;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason = paymentCheckoutErrorState != null ? paymentCheckoutErrorState.d : null;
        Double d = checkoutUIState$PaymentCheckoutUIState.k;
        int i = checkoutUIState$PaymentCheckoutUIState.d.b;
        ciu0 ciu0Var = checkoutUIState$PaymentCheckoutUIState.g;
        String valueOf = String.valueOf((ciu0Var == null || (miu0Var = ciu0Var.b) == null) ? null : miu0Var.c);
        String str4 = checkoutUIState$PaymentCheckoutUIState.c.a;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason2 = paymentCheckoutErrorState != null ? paymentCheckoutErrorState.d : null;
        TransportPaymentAnalytics$CheckoutErrorReason transportPaymentAnalytics$CheckoutErrorReason3 = TransportPaymentAnalytics$CheckoutErrorReason.f78HeckoutLoadingError;
        if (transportPaymentAnalytics$CheckoutErrorReason2 != transportPaymentAnalytics$CheckoutErrorReason3) {
            str2 = checkoutUIState$PaymentCheckoutUIState.b;
        }
        d411 d411Var = tVar.K;
        if (transportPaymentAnalytics$CheckoutErrorReason == null) {
            transportPaymentAnalytics$CheckoutErrorReason = transportPaymentAnalytics$CheckoutErrorReason3;
        }
        TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = tVar.C;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = tVar.S;
        Integer valueOf2 = Integer.valueOf(i);
        String str5 = tVar.y;
        ZoneAddress n = tVar.O.n();
        if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
            str = "";
        }
        if (f4a0Var != null && (lv90Var = f4a0Var.b) != null) {
            str3 = lv90Var.b();
        }
        Boolean valueOf3 = Boolean.valueOf(f4a0Var != null ? !f4a0Var.a() : false);
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("request_id", str2);
        }
        if (transportPaymentAnalytics$CheckoutScreenOpenReason != null) {
            hashMap.put("source", transportPaymentAnalytics$CheckoutScreenOpenReason.getEventValue());
        }
        if (transportPaymentAnalytics$VehicleType != null) {
            hashMap.put("vehicle_type", transportPaymentAnalytics$VehicleType.getEventValue());
        }
        if (d != null) {
            hashMap.put("sum_ticket_price", d);
        }
        hashMap.put("ticket_counter", valueOf2);
        hashMap.put("destination_stop_id", valueOf);
        if (str4 != null) {
            hashMap.put("transport_id", str4);
        }
        if (str5 != null) {
            hashMap.put("qr_url", str5);
        }
        hashMap.put("zone_name", str);
        if (str3 != null) {
            hashMap.put("payment_method", str3);
        }
        hashMap.put("payment_method_available", valueOf3);
        hashMap.put(CRLReasonCodeExtension.REASON, transportPaymentAnalytics$CheckoutErrorReason.getEventValue());
        d411Var.a.a("TransportPayment.CheckoutError.Shown", hashMap, 2, new HashMap());
    }

    @Override // defpackage.zd30
    public final void U1(onb onbVar) {
        wkb wkbVar;
        vkb vkbVar;
        ukb ukbVar;
        tkb tkbVar;
        tkb tkbVar2;
        tkb tkbVar3;
        tkb tkbVar4;
        tkb tkbVar5;
        tkb tkbVar6;
        final MtCheckoutModalView mtCheckoutModalView = this.a;
        wkbVar = mtCheckoutModalView.paymentCheckoutStateBinding;
        wkbVar.o.setVisibility(8);
        vkbVar = mtCheckoutModalView.loadingStateBinding;
        vkbVar.d.setVisibility(8);
        ukbVar = mtCheckoutModalView.errorStateBinding;
        ukbVar.b.setVisibility(8);
        tkbVar = mtCheckoutModalView.directionSelectionStateBinding;
        final int i = 0;
        tkbVar.c.setVisibility(0);
        mtCheckoutModalView.renderDirectionSelectorTransport(onbVar.a);
        tkbVar2 = mtCheckoutModalView.directionSelectionStateBinding;
        tkbVar2.f.setText(onbVar.b);
        List list = onbVar.c;
        final ulj uljVar = (ulj) a.R(list);
        final int i2 = 1;
        final ulj uljVar2 = (ulj) a.S(1, list);
        tkbVar3 = mtCheckoutModalView.directionSelectionStateBinding;
        tkbVar3.d.setTitle(uljVar != null ? uljVar.b : null);
        tkbVar4 = mtCheckoutModalView.directionSelectionStateBinding;
        tkbVar4.e.setTitle(uljVar2 != null ? uljVar2.b : null);
        tkbVar5 = mtCheckoutModalView.directionSelectionStateBinding;
        tkbVar5.d.setDebounceClickListener(new Runnable() { // from class: wd30
            @Override // java.lang.Runnable
            public final void run() {
                t tVar;
                t tVar2;
                int i3 = i;
                MtCheckoutModalView mtCheckoutModalView2 = mtCheckoutModalView;
                ulj uljVar3 = uljVar;
                switch (i3) {
                    case 0:
                        if (uljVar3 != null) {
                            tVar = mtCheckoutModalView2.presenter;
                            tVar.Ng(uljVar3.a, null);
                            break;
                        }
                        break;
                    default:
                        if (uljVar3 != null) {
                            tVar2 = mtCheckoutModalView2.presenter;
                            tVar2.Ng(uljVar3.a, null);
                            break;
                        }
                        break;
                }
            }
        });
        tkbVar6 = mtCheckoutModalView.directionSelectionStateBinding;
        tkbVar6.e.setDebounceClickListener(new Runnable() { // from class: wd30
            @Override // java.lang.Runnable
            public final void run() {
                t tVar;
                t tVar2;
                int i3 = i2;
                MtCheckoutModalView mtCheckoutModalView2 = mtCheckoutModalView;
                ulj uljVar3 = uljVar2;
                switch (i3) {
                    case 0:
                        if (uljVar3 != null) {
                            tVar = mtCheckoutModalView2.presenter;
                            tVar.Ng(uljVar3.a, null);
                            break;
                        }
                        break;
                    default:
                        if (uljVar3 != null) {
                            tVar2 = mtCheckoutModalView2.presenter;
                            tVar2.Ng(uljVar3.a, null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.zd30
    public final void Wd() {
        this.a.renderLoadingState(f4a0.c, false, true);
    }

    @Override // defpackage.zd30
    public final void X(String str) {
        this.a.announceForAccessibility(str);
    }

    @Override // defpackage.zd30
    public final void zb(Drawable drawable) {
        wkb wkbVar;
        t1w currentInsets;
        MtCheckoutModalView mtCheckoutModalView = this.a;
        wkbVar = mtCheckoutModalView.paymentCheckoutStateBinding;
        GoLinearLayout goLinearLayout = wkbVar.i;
        goLinearLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, mtCheckoutModalView.getContext())));
        goLinearLayout.setClipToOutline(true);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, vng.t(f1h0.footer_bg, mtCheckoutModalView.getContext())});
        GoLinearLayout goLinearLayout2 = wkbVar.i;
        currentInsets = mtCheckoutModalView.getCurrentInsets();
        cvw.f0(goLinearLayout2, layerDrawable, currentInsets.d);
    }
}
