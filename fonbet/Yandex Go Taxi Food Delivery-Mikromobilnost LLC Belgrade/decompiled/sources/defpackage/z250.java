package defpackage;

import com.yandex.plus.home.auth.b;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionProduct;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPaymentStat$PurchaseType;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class z250 {
    public final b a;
    public final rzf0 b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public z250(b bVar, rzf0 rzf0Var) {
        this.a = bVar;
        this.b = rzf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y250 a(CompositeSubscriptionInfo compositeSubscriptionInfo, SubscriptionConfiguration subscriptionConfiguration) {
        y250 y250Var;
        y250 y250Var2;
        String str;
        PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer;
        String uuid = UUID.randomUUID().toString();
        List<CompositeSubscriptionProduct> products = compositeSubscriptionInfo.getProducts();
        ArrayList arrayList = new ArrayList(tcc.n(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(((CompositeSubscriptionProduct) it.next()).getOffer());
        }
        boolean c = this.a.c();
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (!c) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new y250((PlusPaySdkAdapter$CompositeOffer) it2.next(), false, uuid));
            }
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList2);
            return (y250) a.R(arrayList2);
        }
        y250 y250Var3 = (y250) a.R(copyOnWriteArrayList);
        if (y250Var3 != null) {
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer2 = y250Var3.a;
            Iterator it3 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    y250Var = null;
                    i = -1;
                    break;
                }
                Object next = it3.next();
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer3 = (PlusPaySdkAdapter$CompositeOffer) next;
                if (plusPaySdkAdapter$CompositeOffer2 != plusPaySdkAdapter$CompositeOffer3) {
                    List<PlusPaySdkAdapter$CompositeOffer.Option> optionOffers = plusPaySdkAdapter$CompositeOffer3.getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it4 = optionOffers.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((PlusPaySdkAdapter$CompositeOffer.Option) it4.next()).getId());
                    }
                    List<PlusPaySdkAdapter$CompositeOffer.Option> optionOffers2 = plusPaySdkAdapter$CompositeOffer2.getOptionOffers();
                    y250Var = null;
                    ArrayList arrayList4 = new ArrayList(tcc.n(optionOffers2, 10));
                    Iterator<T> it5 = optionOffers2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((PlusPaySdkAdapter$CompositeOffer.Option) it5.next()).getId());
                    }
                    PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer = plusPaySdkAdapter$CompositeOffer3.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer2 = plusPaySdkAdapter$CompositeOffer2.getTariffOffer();
                    boolean l = jl40.l(id, tariffOffer2 != null ? tariffOffer2.getId() : null);
                    boolean z = arrayList3.size() == arrayList4.size() && a.N0(arrayList3).equals(a.N0(arrayList4));
                    if (l && z) {
                        break;
                    }
                    i++;
                } else {
                    y250Var = null;
                    break;
                }
            }
            if (i < 0) {
                y250Var3 = y250Var;
            }
            if (y250Var3 != null) {
                y250Var2 = new y250(y250Var3.a, true, y250Var3.c);
                copyOnWriteArrayList.clear();
                if (y250Var2 == null) {
                    return y250Var2;
                }
                PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer4 = (PlusPaySdkAdapter$CompositeOffer) a.Q(arrayList);
                rzf0 rzf0Var = this.b;
                nhd0 d = rzf0.d(rzf0Var, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer4);
                if (d != null) {
                    sio sioVar = rzf0Var.d;
                    boolean z2 = sioVar.b;
                    lho lhoVar = sioVar.a;
                    List list = d.e;
                    String str2 = d.d;
                    PlusPaymentStat$ButtonType plusPaymentStat$ButtonType = d.c;
                    PlusPaymentStat$PurchaseType plusPaymentStat$PurchaseType = d.b;
                    int i2 = rio.a[d.a.ordinal()];
                    str = uuid;
                    plusPaySdkAdapter$CompositeOffer = plusPaySdkAdapter$CompositeOffer4;
                    if (i2 == 1) {
                        EvgenAnalytics$EvgenPurchaseType b = d15.b(plusPaymentStat$PurchaseType);
                        EvgenAnalytics$EvgenButtonType a = d15.a(plusPaymentStat$ButtonType);
                        String str3 = str2 == null ? "no_value" : str2;
                        LinkedHashMap n = nnm.n(lhoVar, "purchase_session_id", "no_value");
                        nnm.r(b, n, "purchase_type", a, "purchase_button");
                        n.put("product_id", str3);
                        nnm.x(n, "options_id", list, false, "is_one_click_payment");
                        n.put("is_tarifficator", String.valueOf(z2));
                        HashMap hashMap = new HashMap();
                        nnm.u("version", 1, hashMap, "Payment");
                        n.put("_meta", lho.a(1, hashMap));
                        lhoVar.d("PlusHome.BuySubscription.Button.OfferChanged", n);
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return y250Var;
                        }
                        EvgenAnalytics$EvgenPurchaseType b2 = d15.b(plusPaymentStat$PurchaseType);
                        EvgenAnalytics$EvgenButtonType a2 = d15.a(plusPaymentStat$ButtonType);
                        String str4 = str2 == null ? "no_value" : str2;
                        LinkedHashMap n2 = nnm.n(lhoVar, "purchase_session_id", "no_value");
                        nnm.r(b2, n2, "purchase_type", a2, "purchase_button");
                        n2.put("product_id", str4);
                        nnm.x(n2, "options_id", list, false, "is_one_click_payment");
                        n2.put("is_tarifficator", String.valueOf(z2));
                        HashMap hashMap2 = new HashMap();
                        nnm.u("version", 1, hashMap2, "Payment");
                        n2.put("_meta", lho.a(1, hashMap2));
                        lhoVar.d("PlusStories.BuySubscription.Button.OfferChanged", n2);
                    }
                } else {
                    str = uuid;
                    plusPaySdkAdapter$CompositeOffer = plusPaySdkAdapter$CompositeOffer4;
                }
                if (plusPaySdkAdapter$CompositeOffer != null) {
                    return new y250(plusPaySdkAdapter$CompositeOffer, false, str);
                }
                return y250Var;
            }
        } else {
            y250Var = null;
        }
        y250Var2 = y250Var;
        copyOnWriteArrayList.clear();
        if (y250Var2 == null) {
        }
    }
}
