package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f3726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3728c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f3726a = kVar;
        this.f3727b = billingResult;
        this.f3728c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String str;
        String originalJson2;
        k kVar = this.f3726a;
        BillingResult billingResult = this.f3727b;
        List<Purchase> list = this.f3728c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f3734f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((String) it.next(), purchase);
                }
            }
            List<Purchase> list2 = kVar.f3731c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase2 : list2) {
                Iterator it2 = purchase2.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchase2);
                }
            }
            List<ProductDetails> list3 = kVar.f3732d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                Purchase purchase3 = (Purchase) linkedHashMap2.get(productDetails.getProductId());
                if (purchase3 != null) {
                    Purchase purchase4 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = kotlin.jvm.internal.i.a(productType2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchase3.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson2 = purchase4.getOriginalJson()) == null) ? "{}" : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(kotlin.jvm.internal.i.a(productType4, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchase3.getQuantity(), 0L, "", 0L, null, 1, null, purchase3.getSignature(), purchase3.getPurchaseToken(), purchase3.getPurchaseTime(), purchase4 != null ? purchase4.isAutoRenewing() : false, (purchase4 == null || (originalJson = purchase4.getOriginalJson()) == null) ? "{}" : originalJson);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                }
                productInfo = null;
                if (productInfo == null) {
                }
            }
            kVar.f3729a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f3730b.invoke();
            kVar.f3734f.onUpdateFinished();
        }
        k kVar2 = this.f3726a;
        kVar2.f3733e.a(kVar2);
    }
}
