package defpackage;

import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.DirectionSelectorButtonAction;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.StopSelectorButtonAction;
import java.util.HashMap;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$CheckoutButtonActionType;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$DirectionSelectorButtonActionType;
import ru.yandex.taxi.masstransit.analytic.MasstransitPaymentAnalytics$StopSelectorButtonActionType;

/* loaded from: classes6.dex */
public final class w310 {
    public final n310 a;

    public w310(n310 n310Var) {
        this.a = n310Var;
    }

    public final void a(CheckoutButtonAction checkoutButtonAction, String str, String str2, String str3) {
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType;
        switch (v310.c[checkoutButtonAction.ordinal()]) {
            case 1:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.Back;
                break;
            case 2:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.StopSelector;
                break;
            case 3:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.DirectionSelector;
                break;
            case 4:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.NumericInputUp;
                break;
            case 5:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.NumericInputDown;
                break;
            case 6:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.PaymentMethod;
                break;
            case 7:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.PaymentButton;
                break;
            case 8:
                masstransitPaymentAnalytics$CheckoutButtonActionType = MasstransitPaymentAnalytics$CheckoutButtonActionType.ErrorButton;
                break;
            default:
                w511.b();
                return;
        }
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        if (str2 != null) {
            hashMap.put("trip_id", str2);
        }
        hashMap.put("button", masstransitPaymentAnalytics$CheckoutButtonActionType.getEventValue());
        if (str3 != null) {
            hashMap.put("property", str3);
        }
        n310Var.a.a("MasstransitPayment.Checkout.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(String str, DirectionSelectorButtonAction directionSelectorButtonAction, String str2, String str3) {
        MasstransitPaymentAnalytics$DirectionSelectorButtonActionType masstransitPaymentAnalytics$DirectionSelectorButtonActionType;
        int i = v310.e[directionSelectorButtonAction.ordinal()];
        if (i == 1) {
            masstransitPaymentAnalytics$DirectionSelectorButtonActionType = MasstransitPaymentAnalytics$DirectionSelectorButtonActionType.Direction;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            masstransitPaymentAnalytics$DirectionSelectorButtonActionType = MasstransitPaymentAnalytics$DirectionSelectorButtonActionType.Back;
        }
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("property", str);
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (str2 != null) {
            hashMap.put("trip_id", str2);
        }
        hashMap.put("button", masstransitPaymentAnalytics$DirectionSelectorButtonActionType.getEventValue());
        n310Var.a.a("MasstransitPayment.DirectionSelector.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(String str, StopSelectorButtonAction stopSelectorButtonAction, String str2, String str3) {
        MasstransitPaymentAnalytics$StopSelectorButtonActionType masstransitPaymentAnalytics$StopSelectorButtonActionType;
        int i = v310.d[stopSelectorButtonAction.ordinal()];
        if (i == 1) {
            masstransitPaymentAnalytics$StopSelectorButtonActionType = MasstransitPaymentAnalytics$StopSelectorButtonActionType.Stop;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            masstransitPaymentAnalytics$StopSelectorButtonActionType = MasstransitPaymentAnalytics$StopSelectorButtonActionType.Back;
        }
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("property", str);
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (str2 != null) {
            hashMap.put("trip_id", str2);
        }
        hashMap.put("button", masstransitPaymentAnalytics$StopSelectorButtonActionType.getEventValue());
        n310Var.a.a("MasstransitPayment.StopSelector.Tapped", hashMap, 1, new HashMap());
    }
}
