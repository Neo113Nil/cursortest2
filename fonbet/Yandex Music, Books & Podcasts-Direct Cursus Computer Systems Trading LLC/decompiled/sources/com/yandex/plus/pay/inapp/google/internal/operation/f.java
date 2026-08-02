package com.yandex.plus.pay.inapp.google.internal.operation;

import com.android.billingclient.api.Purchase;
import defpackage.etn;
import defpackage.hrg;
import defpackage.ltm;
import defpackage.n4n;
import defpackage.uz2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class f implements n4n {
    public final String a;
    public final com.yandex.plus.log.api.b b;
    public final ltm c;

    public f(String str, com.yandex.plus.log.api.b bVar, ltm ltmVar) {
        str.getClass();
        bVar.getClass();
        ltmVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = ltmVar;
    }

    @Override // defpackage.n4n
    public final void onPurchasesUpdated(uz2 uz2Var, List list) {
        String str;
        Object obj;
        uz2Var.getClass();
        int i = uz2Var.a;
        ltm ltmVar = this.c;
        if (i != 0) {
            etn.k0(ltmVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.c(null, com.yandex.plus.bdui.flex.ui.a.G(uz2Var)));
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.a;
                if (!hasNext) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Purchase) obj).a().contains(str)) {
                        break;
                    }
                }
            }
            Purchase purchase = (Purchase) obj;
            if (purchase != null) {
                int optInt = purchase.c.optInt("purchaseState", 1);
                com.yandex.plus.log.api.b bVar = this.b;
                if (optInt != 4) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PurchaseOperation", hrg.q("purchase(", str, ") is in purchased state"));
                    }
                    etn.k0(ltmVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.c(purchase, com.yandex.plus.bdui.flex.ui.a.G(uz2Var)));
                    return;
                }
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "PurchaseOperation", hrg.q("purchase(", str, ") is in pending state"));
                    return;
                }
                return;
            }
        }
        etn.k0(ltmVar, new com.yandex.plus.pay.inapp.google.common.internal.operation.c(null, com.yandex.plus.bdui.flex.ui.a.G(uz2Var)));
    }
}
