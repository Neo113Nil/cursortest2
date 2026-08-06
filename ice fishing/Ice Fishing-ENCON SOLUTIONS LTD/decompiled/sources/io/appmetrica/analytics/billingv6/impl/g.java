package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
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
    public final /* synthetic */ i f3661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3663c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f3661a = iVar;
        this.f3662b = billingResult;
        this.f3663c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f3661a;
        BillingResult billingResult = this.f3662b;
        List<PurchaseHistoryRecord> list = this.f3663c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f3672f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f3670d;
                    BillingInfo billingInfo = new BillingInfo(kotlin.jvm.internal.i.a(str2, "inapp") ? ProductType.INAPP : kotlin.jvm.internal.i.a(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f3669c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f3667a, linkedHashMap, iVar.f3669c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f3670d, iVar.f3669c.getBillingInfoManager());
                iVar.f3672f.onUpdateFinished();
            } else {
                List R2 = AbstractC0252i.R(billingInfoToUpdate.keySet());
                n nVar = iVar.f3672f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f3670d;
                BillingClient billingClient = iVar.f3668b;
                UtilsProvider utilsProvider = iVar.f3669c;
                d dVar = iVar.f3671e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f3650b.add(fVar);
                if (iVar.f3668b.isReady()) {
                    BillingClient billingClient2 = iVar.f3668b;
                    QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(i1.k.E(R2));
                    Iterator it = R2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f3670d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f3671e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f3661a;
        iVar2.f3671e.a(iVar2);
    }
}
