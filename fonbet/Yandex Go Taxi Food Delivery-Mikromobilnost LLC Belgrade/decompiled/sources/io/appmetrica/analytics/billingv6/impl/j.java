package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import defpackage.ns5;
import defpackage.q7f0;
import defpackage.t7f0;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j extends SafeRunnable {
    public final /* synthetic */ k a;
    public final /* synthetic */ ns5 b;
    public final /* synthetic */ List c;

    public j(k kVar, ns5 ns5Var, List list) {
        this.a = kVar;
        this.b = ns5Var;
        this.c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196 A[SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        LinkedHashMap linkedHashMap;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        String str;
        String str2;
        String str3;
        k kVar = this.a;
        ns5 ns5Var = this.b;
        List<Purchase> list = this.c;
        kVar.getClass();
        if (ns5Var.a != 0) {
            kVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.c().iterator();
                while (it.hasNext()) {
                    linkedHashMap2.put((String) it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = kVar.c;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator it2 = purchaseHistoryRecord.a().iterator();
                while (it2.hasNext()) {
                    linkedHashMap3.put((String) it2.next(), purchaseHistoryRecord);
                }
            }
            List<t7f0> list3 = kVar.d;
            ArrayList arrayList = new ArrayList();
            for (t7f0 t7f0Var : list3) {
                String str4 = t7f0Var.c;
                String str5 = t7f0Var.d;
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap3.get(str4);
                if (purchaseHistoryRecord2 != null) {
                    JSONObject jSONObject = purchaseHistoryRecord2.c;
                    Purchase purchase2 = (Purchase) linkedHashMap2.get(t7f0Var.c);
                    int hashCode = str5.hashCode();
                    linkedHashMap = linkedHashMap2;
                    if (hashCode != 3541555) {
                        if (hashCode == 100343516 && str5.equals("inapp")) {
                            ProductType productType = str5.equals("inapp") ? ProductType.INAPP : str5.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String str6 = t7f0Var.c;
                            int optInt = jSONObject.optInt("quantity", 1);
                            q7f0 a = t7f0Var.a();
                            long j = a != null ? a.a : 0L;
                            q7f0 a2 = t7f0Var.a();
                            if (a2 == null || (str2 = a2.b) == null) {
                                str2 = "";
                            }
                            productInfo = new ProductInfo(productType, str6, optInt, j, str2, 0L, null, 1, null, purchaseHistoryRecord2.b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.g() : false, (purchase2 == null || (str3 = purchase2.a) == null) ? "{}" : str3);
                        }
                    } else if (str5.equals("subs")) {
                        productInfo = new ProductInfo(str5.equals("inapp") ? ProductType.INAPP : str5.equals("subs") ? ProductType.SUBS : ProductType.UNKNOWN, t7f0Var.c, jSONObject.optInt("quantity", 1), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.b, purchaseHistoryRecord2.b(), jSONObject.optLong("purchaseTime"), purchase2 != null ? purchase2.g() : false, (purchase2 == null || (str = purchase2.a) == null) ? "{}" : str);
                    }
                    productInfo2 = productInfo;
                    if (productInfo2 == null) {
                        arrayList.add(productInfo2);
                    }
                    linkedHashMap2 = linkedHashMap;
                } else {
                    linkedHashMap = linkedHashMap2;
                }
                productInfo = null;
                productInfo2 = productInfo;
                if (productInfo2 == null) {
                }
                linkedHashMap2 = linkedHashMap;
            }
            kVar.a.getBillingInfoSender().sendInfo(arrayList);
            kVar.b.invoke();
            kVar.f.onUpdateFinished();
        }
        k kVar2 = this.a;
        kVar2.e.a(kVar2);
    }
}
