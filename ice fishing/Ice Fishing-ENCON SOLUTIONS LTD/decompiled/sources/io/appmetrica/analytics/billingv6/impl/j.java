package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
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
    public final /* synthetic */ k f3673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3675c;

    public j(k kVar, BillingResult billingResult, List list) {
        this.f3673a = kVar;
        this.f3674b = billingResult;
        this.f3675c = list;
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
        k kVar = this.f3673a;
        BillingResult billingResult = this.f3674b;
        List<Purchase> list = this.f3675c;
        kVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            kVar.f3681f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put((String) it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.f3678c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put((String) it2.next(), purchaseHistoryRecord);
                }
            }
            List<ProductDetails> list3 = kVar.f3679d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int hashCode = productType.hashCode();
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = kotlin.jvm.internal.i.a(productType2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (str = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                str = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, str, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? "{}" : originalJson2);
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(kotlin.jvm.internal.i.a(productType4, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? "{}" : originalJson);
                    }
                    if (productInfo == null) {
                        arrayList.add(productInfo);
                    }
                }
                productInfo = null;
                if (productInfo == null) {
                }
            }
            kVar.f3676a.getBillingInfoSender().sendInfo(arrayList);
            kVar.f3677b.invoke();
            kVar.f3681f.onUpdateFinished();
        }
        k kVar2 = this.f3673a;
        kVar2.f3680e.a(kVar2);
    }
}
