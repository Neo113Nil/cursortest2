package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class uio extends d15 {
    public final lho a;
    public final boolean b;

    public uio(lho lhoVar, boolean z) {
        this.a = lhoVar;
        this.b = z;
    }

    public final void c(PlusPaymentStat$Source plusPaymentStat$Source, PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType, PlusPaymentStat$ButtonType plusPaymentStat$ButtonType, String str, List list) {
        int i = tio.a[plusPaymentStat$Source.ordinal()];
        boolean z = this.b;
        lho lhoVar = this.a;
        if (i == 1) {
            EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
            EvgenAnalytics$EvgenButtonType a = d15.a(plusPaymentStat$ButtonType);
            String str2 = str == null ? "no_value" : str;
            LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
            nnm.r(b, n, "purchase_type", a, "purchase_button");
            n.put("product_id", str2);
            nnm.x(n, "options_id", list, false, "is_one_click_payment");
            n.put("is_tarifficator", String.valueOf(z));
            HashMap hashMap = new HashMap();
            nnm.u("version", 1, hashMap, "Payment");
            n.put("_meta", lho.a(1, hashMap));
            lhoVar.d("PlusHome.BuySubscription.Failed", n);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
        EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
        String str3 = str == null ? "no_value" : str;
        LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
        nnm.r(b2, n2, "purchase_type", a2, "purchase_button");
        n2.put("product_id", str3);
        nnm.x(n2, "options_id", list, false, "is_one_click_payment");
        n2.put("is_tarifficator", String.valueOf(z));
        HashMap hashMap2 = new HashMap();
        nnm.u("version", 1, hashMap2, "Payment");
        n2.put("_meta", lho.a(1, hashMap2));
        lhoVar.d("PlusStories.BuySubscription.Failed", n2);
    }

    public final void d(PlusPaymentStat$Source plusPaymentStat$Source, PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType, PlusPaymentStat$ButtonType plusPaymentStat$ButtonType, String str, List list) {
        int i = tio.a[plusPaymentStat$Source.ordinal()];
        boolean z = this.b;
        lho lhoVar = this.a;
        if (i == 1) {
            EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
            EvgenAnalytics$EvgenButtonType a = d15.a(plusPaymentStat$ButtonType);
            String str2 = str == null ? "no_value" : str;
            LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
            nnm.r(b, n, "purchase_type", a, "purchase_button");
            n.put("product_id", str2);
            nnm.x(n, "options_id", list, false, "is_one_click_payment");
            n.put("is_tarifficator", String.valueOf(z));
            HashMap hashMap = new HashMap();
            nnm.u("version", 1, hashMap, "Payment");
            n.put("_meta", lho.a(1, hashMap));
            lhoVar.d("PlusHome.BuySubscription.Success", n);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
        EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
        String str3 = str == null ? "no_value" : str;
        LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
        nnm.r(b2, n2, "purchase_type", a2, "purchase_button");
        n2.put("product_id", str3);
        nnm.x(n2, "options_id", list, false, "is_one_click_payment");
        n2.put("is_tarifficator", String.valueOf(z));
        HashMap hashMap2 = new HashMap();
        nnm.u("version", 1, hashMap2, "Payment");
        n2.put("_meta", lho.a(1, hashMap2));
        lhoVar.d("PlusStories.BuySubscription.Success", n2);
    }
}
