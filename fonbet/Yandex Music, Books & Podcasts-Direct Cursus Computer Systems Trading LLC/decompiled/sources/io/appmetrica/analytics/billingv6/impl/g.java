package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.PurchaseHistoryRecord;
import defpackage.awc;
import defpackage.pz2;
import defpackage.uz2;
import defpackage.v75;
import defpackage.y3e;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends SafeRunnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ uz2 b;
    public final /* synthetic */ List c;

    public g(i iVar, uz2 uz2Var, List list) {
        this.a = iVar;
        this.b = uz2Var;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.a;
        uz2 uz2Var = this.b;
        List<PurchaseHistoryRecord> list = this.c;
        iVar.getClass();
        if (uz2Var.a != 0 || list == null) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                Iterator it = purchaseHistoryRecord.a().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.d;
                    BillingInfo billingInfo = new BillingInfo(Intrinsics.d(str2, "inapp") ? ProductType.INAPP : Intrinsics.d(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.b(), purchaseHistoryRecord.c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.c.getUpdatePolicy().getBillingInfoToUpdate(iVar.a, linkedHashMap, iVar.c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.d, iVar.c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List<String> w0 = CollectionsKt.w0(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.d;
                pz2 pz2Var = iVar.b;
                UtilsProvider utilsProvider = iVar.c;
                d dVar = iVar.e;
                f fVar = new f(str3, pz2Var, utilsProvider, hVar, list, dVar, nVar);
                dVar.b.add(fVar);
                if (iVar.b.d()) {
                    pz2 pz2Var2 = iVar.b;
                    awc awcVar = new awc();
                    ArrayList arrayList = new ArrayList(v75.o(w0, 10));
                    for (String str4 : w0) {
                        y3e y3eVar = new y3e();
                        y3eVar.b = str4;
                        y3eVar.c = iVar.d;
                        arrayList.add(y3eVar.a());
                    }
                    awcVar.G(arrayList);
                    pz2Var2.f(awcVar.t(), fVar);
                } else {
                    iVar.e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.a;
        iVar2.e.a(iVar2);
    }
}
