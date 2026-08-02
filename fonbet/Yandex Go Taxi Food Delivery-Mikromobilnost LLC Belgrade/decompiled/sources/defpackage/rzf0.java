package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$Source;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.internal.q;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class rzf0 implements pzf0 {
    public final bfd0 a;
    public final dfd0 b;
    public final PlusPaymentStat$Source c;
    public final sio d;
    public final qad0 e;
    public final qio f;
    public final tls g;
    public final uio h;
    public final oio i;

    public rzf0(bfd0 bfd0Var, dfd0 dfd0Var, PlusPaymentStat$Source plusPaymentStat$Source, sio sioVar, qad0 qad0Var, qio qioVar, tls tlsVar, uio uioVar, oio oioVar) {
        this.a = bfd0Var;
        this.b = dfd0Var;
        this.c = plusPaymentStat$Source;
        this.d = sioVar;
        this.e = qad0Var;
        this.f = qioVar;
        this.g = tlsVar;
        this.h = uioVar;
        this.i = oioVar;
    }

    public static nhd0 d(rzf0 rzf0Var, SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer) {
        PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer;
        SubscriptionConfiguration.Subscription subscription = subscriptionConfiguration.getSubscription();
        rzf0Var.getClass();
        String str = null;
        PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = subscription.getWidgetType() == SubscriptionConfiguration.Subscription.WidgetType.WEB_WIDGET ? PlusPaymentStat$PurchaseType.WEB : subscription.getWidgetType() == SubscriptionConfiguration.Subscription.WidgetType.HOST ? PlusPaymentStat$PurchaseType.HOST : subscription.getPaymentMethod() == SubscriptionConfiguration.Subscription.PaymentMethod.NATIVE ? PlusPaymentStat$PurchaseType.NATIVE : subscription.getPaymentMethod() == SubscriptionConfiguration.Subscription.PaymentMethod.IN_APP ? PlusPaymentStat$PurchaseType.INAPP : null;
        if (plusPaySdkAdapter$CompositeOffer != null && (tariffOffer = plusPaySdkAdapter$CompositeOffer.getTariffOffer()) != null) {
            str = tariffOffer.getId();
        }
        return rzf0Var.c(subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer, plusPaymentStat$PurchaseType, str);
    }

    public final void b(SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType, String str) {
        nhd0 c = c(subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer, plusPaymentStat$PurchaseType, str);
        if (c != null) {
            sio sioVar = this.d;
            r42 r42Var = sioVar.c;
            boolean z = sioVar.b;
            lho lhoVar = sioVar.a;
            List list = c.e;
            String str2 = c.d;
            PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = c.c;
            PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType2 = c.b;
            int i = rio.a[c.a.ordinal()];
            if (i == 1) {
                EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType2);
                EvgenAnalytics$EvgenButtonType a = d15.a(plusPaymentStat$ButtonType);
                String str3 = str2 == null ? "no_value" : str2;
                boolean booleanValue = ((Boolean) r42Var.invoke()).booleanValue();
                LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                nnm.r(b, n, "purchase_type", a, "purchase_button");
                n.put("product_id", str3);
                nnm.x(n, "options_id", list, false, "is_one_click_payment");
                n.put("is_tarifficator", String.valueOf(z));
                n.put("is_authenticated", String.valueOf(booleanValue));
                HashMap hashMap = new HashMap();
                nnm.u("version", 1, hashMap, "Payment");
                n.put("_meta", lho.a(2, hashMap));
                lhoVar.d("PlusHome.BuySubscription.Button.Shown", n);
                return;
            }
            if (i != 2) {
                w511.b();
                return;
            }
            EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType2);
            EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
            String str4 = str2 == null ? "no_value" : str2;
            boolean booleanValue2 = ((Boolean) r42Var.invoke()).booleanValue();
            LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
            nnm.r(b2, n2, "purchase_type", a2, "purchase_button");
            n2.put("product_id", str4);
            nnm.x(n2, "options_id", list, false, "is_one_click_payment");
            n2.put("is_tarifficator", String.valueOf(z));
            n2.put("is_authenticated", String.valueOf(booleanValue2));
            HashMap hashMap2 = new HashMap();
            nnm.u("version", 1, hashMap2, "Payment");
            n2.put("_meta", lho.a(2, hashMap2));
            lhoVar.d("PlusStories.BuySubscription.Button.Shown", n2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public final nhd0 c(SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType, String str) {
        ?? r2;
        PlusPaymentStat$ButtonType plusPaymentStat$ButtonType;
        PlusPaymentStat$ButtonType plusPaymentStat$ButtonType2;
        String str2;
        PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer;
        List<PlusPaySdkAdapter$CompositeOffer.Option> optionOffers;
        if (plusPaySdkAdapter$CompositeOffer == null || (optionOffers = plusPaySdkAdapter$CompositeOffer.getOptionOffers()) == null) {
            r2 = 0;
        } else {
            List<PlusPaySdkAdapter$CompositeOffer.Option> list = optionOffers;
            r2 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r2.add(((PlusPaySdkAdapter$CompositeOffer.Option) it.next()).getId());
            }
        }
        if (r2 == 0) {
            r2 = EmptyList.a;
        }
        List list2 = r2;
        SubscriptionConfiguration.Subscription subscription = subscriptionConfiguration.getSubscription();
        if (subscription.getWidgetType() == SubscriptionConfiguration.Subscription.WidgetType.HOST) {
            plusPaymentStat$ButtonType2 = PlusPaymentStat$ButtonType.HOST;
        } else if (subscription.getButtonType() == SubscriptionConfiguration.Subscription.ButtonType.NATIVE) {
            plusPaymentStat$ButtonType2 = PlusPaymentStat$ButtonType.NATIVE;
        } else {
            if (subscription.getButtonType() != SubscriptionConfiguration.Subscription.ButtonType.WEB) {
                plusPaymentStat$ButtonType = null;
                if (plusPaymentStat$PurchaseType == null && plusPaymentStat$ButtonType != null) {
                    if (str == null) {
                        if (plusPaySdkAdapter$CompositeOffer == null || (tariffOffer = plusPaySdkAdapter$CompositeOffer.getTariffOffer()) == null) {
                            str2 = null;
                            return new nhd0(this.c, plusPaymentStat$PurchaseType, plusPaymentStat$ButtonType, str2, list2);
                        }
                        str = tariffOffer.getId();
                    }
                    str2 = str;
                    return new nhd0(this.c, plusPaymentStat$PurchaseType, plusPaymentStat$ButtonType, str2, list2);
                }
                skd0.b(PlusLogTag.SUBSCRIPTION, "Can't create PlusPaymentStatData subscriptionConfig = " + subscriptionConfiguration + ", purchaseType = " + plusPaymentStat$PurchaseType + ", buttonType = " + plusPaymentStat$ButtonType);
                return null;
            }
            plusPaymentStat$ButtonType2 = PlusPaymentStat$ButtonType.WEB;
        }
        plusPaymentStat$ButtonType = plusPaymentStat$ButtonType2;
        if (plusPaymentStat$PurchaseType == null) {
        }
        skd0.b(PlusLogTag.SUBSCRIPTION, "Can't create PlusPaymentStatData subscriptionConfig = " + subscriptionConfiguration + ", purchaseType = " + plusPaymentStat$PurchaseType + ", buttonType = " + plusPaymentStat$ButtonType);
        return null;
    }

    public final zy11 e(PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer) {
        q qVar = (q) this.a;
        qVar.getClass();
        PlusPayCompositeOffers.Offer a = q.a(plusPaySdkAdapter$CompositeOffer);
        vfd0 vfd0Var = (vfd0) ((i3y) ((b) qVar.e()).b.c.i).getValue();
        dfd0 dfd0Var = this.b;
        String str = dfd0Var.a;
        vfd0Var.a(a, 0, dfd0Var.c, dfd0Var.b, str, kotlin.collections.b.f());
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    public final void f(g27 g27Var) {
        SubscriptionConfiguration a = g27Var.a();
        y250 c = g27Var.c();
        nhd0 d = d(this, a, c != null ? c.a : null);
        if (d != null) {
            sio sioVar = this.d;
            r42 r42Var = sioVar.c;
            boolean z = sioVar.b;
            lho lhoVar = sioVar.a;
            List list = d.e;
            String str = d.d;
            PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = d.c;
            PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = d.b;
            int i = rio.a[d.a.ordinal()];
            if (i == 1) {
                EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
                EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
                String str2 = str == null ? "no_value" : str;
                boolean booleanValue = ((Boolean) r42Var.invoke()).booleanValue();
                LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                nnm.r(b, n, "purchase_type", a2, "purchase_button");
                n.put("product_id", str2);
                nnm.x(n, "options_id", list, false, "is_one_click_payment");
                n.put("is_tarifficator", String.valueOf(z));
                n.put("is_authenticated", String.valueOf(booleanValue));
                HashMap hashMap = new HashMap();
                nnm.u("version", 1, hashMap, "Payment");
                n.put("_meta", lho.a(2, hashMap));
                lhoVar.d("PlusHome.BuySubscription.Button.Clicked", n);
                return;
            }
            if (i != 2) {
                w511.b();
                return;
            }
            EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
            EvgenAnalytics$EvgenButtonType a3 = d15.a(plusPaymentStat$ButtonType);
            String str3 = str == null ? "no_value" : str;
            boolean booleanValue2 = ((Boolean) r42Var.invoke()).booleanValue();
            LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
            nnm.r(b2, n2, "purchase_type", a3, "purchase_button");
            n2.put("product_id", str3);
            nnm.x(n2, "options_id", list, false, "is_one_click_payment");
            n2.put("is_tarifficator", String.valueOf(z));
            n2.put("is_authenticated", String.valueOf(booleanValue2));
            HashMap hashMap2 = new HashMap();
            nnm.u("version", 1, hashMap2, "Payment");
            n2.put("_meta", lho.a(2, hashMap2));
            lhoVar.d("PlusStories.BuySubscription.Button.Clicked", n2);
        }
    }
}
