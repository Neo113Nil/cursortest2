package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.Purchase;
import defpackage.aye0;
import defpackage.es5;
import defpackage.ga0;
import defpackage.jl40;
import defpackage.ns5;
import defpackage.tcc;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g extends SafeRunnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ ns5 b;
    public final /* synthetic */ List c;

    public g(i iVar, ns5 ns5Var, List list) {
        this.a = iVar;
        this.b = ns5Var;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.a;
        ns5 ns5Var = this.b;
        List<Purchase> list = this.c;
        iVar.getClass();
        if (ns5Var.a != 0) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator it = purchase.c().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = iVar.d;
                    BillingInfo billingInfo = new BillingInfo(jl40.l(str2, "inapp") ? ProductType.INAPP : jl40.l(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchase.d(), purchase.c.optLong("purchaseTime"), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.c.getUpdatePolicy().getBillingInfoToUpdate(iVar.a, linkedHashMap, iVar.c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.d, iVar.c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List<String> J0 = kotlin.collections.a.J0(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.d;
                es5 es5Var = iVar.b;
                UtilsProvider utilsProvider = iVar.c;
                d dVar = iVar.e;
                f fVar = new f(str3, es5Var, utilsProvider, hVar, list, dVar, nVar);
                dVar.b.add(fVar);
                if (iVar.b.e()) {
                    es5 es5Var2 = iVar.b;
                    aye0 aye0Var = new aye0(7);
                    ArrayList arrayList = new ArrayList(tcc.n(J0, 10));
                    for (String str4 : J0) {
                        ga0 ga0Var = new ga0();
                        ga0Var.a = str4;
                        ga0Var.b = iVar.d;
                        arrayList.add(ga0Var.a());
                    }
                    aye0Var.m(arrayList);
                    es5Var2.g(aye0Var.g(), fVar);
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
