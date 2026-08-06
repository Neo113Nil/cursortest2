package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import i1.AbstractC0252i;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3716c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f3714a = iVar;
        this.f3715b = billingResult;
        this.f3716c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f3714a;
        BillingResult billingResult = this.f3715b;
        List<Purchase> list = this.f3716c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            iVar.f3725f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                for (String str : purchase.getProducts()) {
                    String str2 = iVar.f3723d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.getPurchaseToken(), purchase.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f3722c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f3720a, linkedHashMap, iVar.f3722c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f3723d, iVar.f3722c.getBillingInfoManager());
                iVar.f3725f.onUpdateFinished();
            } else {
                List R2 = AbstractC0252i.R(billingInfoToUpdate.keySet());
                n nVar = iVar.f3725f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f3723d;
                BillingClient billingClient = iVar.f3721b;
                UtilsProvider utilsProvider = iVar.f3722c;
                d dVar = iVar.f3724e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f3703b.add(fVar);
                if (iVar.f3721b.isReady()) {
                    BillingClient billingClient2 = iVar.f3721b;
                    QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(i1.k.E(R2));
                    Iterator it = R2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f3723d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f3724e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f3714a;
        iVar2.f3724e.a(iVar2);
    }
}
