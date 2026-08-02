package defpackage;

import com.yandex.go.payments.analytics.PaymentsAnalytics$Button;
import com.yandex.go.payments.analytics.PaymentsAnalytics$PaymentMethodsType;
import com.yandex.go.scooters.analytics.ScootersSurgeCardAnalytics$ButtonName;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class x770 {
    public final pho a;

    public /* synthetic */ x770(pho phoVar) {
        this.a = phoVar;
    }

    public void a(PaymentsAnalytics$PaymentMethodsType paymentsAnalytics$PaymentMethodsType, boolean z, PaymentsAnalytics$Button paymentsAnalytics$Button) {
        HashMap hashMap = new HashMap();
        hashMap.put("payment_method_type", paymentsAnalytics$PaymentMethodsType.getEventValue());
        hashMap.put("has_text", Boolean.valueOf(z));
        hashMap.put("button", paymentsAnalytics$Button.getEventValue());
        this.a.a("Payments.PaymentMethodEditView.Tapped", hashMap, 1, new HashMap());
    }

    public void b(String str, String str2, String str3) {
        HashMap u = g8e.u("user_input", str, "button_type", str2);
        this.a.a("SaveToFavoritesAddress.Button.Tapped", u, 1, tse0.r("source", u, str3));
    }

    public void c(ScootersSurgeCardAnalytics$ButtonName scootersSurgeCardAnalytics$ButtonName) {
        HashMap hashMap = new HashMap();
        if (scootersSurgeCardAnalytics$ButtonName != null) {
            hashMap.put("button_name", scootersSurgeCardAnalytics$ButtonName.getEventValue());
        }
        this.a.a("ScootersSurgeCard.Tapped", hashMap, 1, new HashMap());
    }

    public void d() {
        this.a.a("SuperappMain.Deinit", new HashMap(), 1, new HashMap());
    }

    public void e() {
        this.a.a("SuperappMain.ProductsRequestFailed", new HashMap(), 1, new HashMap());
    }
}
