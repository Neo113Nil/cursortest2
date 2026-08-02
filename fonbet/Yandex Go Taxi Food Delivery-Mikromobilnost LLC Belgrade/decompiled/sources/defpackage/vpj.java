package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.domain.analytics.PromoState;
import com.yandex.go.promocodes.base.impl.discounts.domain.entities.analytics.DiscountsAnalyticsScreen;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class vpj {
    public final pj a;
    public final b1 b;
    public final b1 c;
    public final o61 d;
    public final xku0 e;

    public vpj(pj pjVar, b1 b1Var, b1 b1Var2, o61 o61Var, xku0 xku0Var) {
        this.a = pjVar;
        this.b = b1Var;
        this.c = b1Var2;
        this.d = o61Var;
        this.e = xku0Var;
    }

    public static String a(wlf0 wlf0Var) {
        return (wlf0Var.j ? PromoState.ACTIVE : PromoState.NO_ACTIVE).getValue();
    }

    public final void b(DiscountsAnalyticsScreen discountsAnalyticsScreen, wlf0 wlf0Var) {
        String value = discountsAnalyticsScreen.getValue();
        String str = wlf0Var.e;
        String a = a(wlf0Var);
        String str2 = wlf0Var.f;
        b1 b1Var = this.c;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("position", value);
        }
        if (str != null) {
            hashMap.put(Constants.KEY_SERVICE, str);
        }
        if (a != null) {
            hashMap.put(ClidProvider.STATE, a);
        }
        if (str2 != null) {
            hashMap.put("promocode", str2);
        }
        b1Var.a.a("CouponRequiresAddCardClicked", hashMap, 1, new HashMap());
    }

    public final void c(DiscountsAnalyticsScreen discountsAnalyticsScreen, wlf0 wlf0Var) {
        String value = discountsAnalyticsScreen.getValue();
        String paymentMethod$Type = PaymentMethod$Type.CARD.toString();
        String obj = this.e.a.c().toString();
        String str = wlf0Var.e;
        String a = a(wlf0Var);
        String str2 = wlf0Var.f;
        o61 o61Var = this.d;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("position", value);
        }
        hashMap.put("required_payment_type", paymentMethod$Type);
        if (obj != null) {
            hashMap.put("current_payment_type", obj);
        }
        if (str != null) {
            hashMap.put(Constants.KEY_SERVICE, str);
        }
        if (a != null) {
            hashMap.put(ClidProvider.STATE, a);
        }
        if (str2 != null) {
            hashMap.put("promocode", str2);
        }
        o61Var.a.a("CouponRequiresChangePaymentTypeClicked", hashMap, 1, new HashMap());
    }
}
