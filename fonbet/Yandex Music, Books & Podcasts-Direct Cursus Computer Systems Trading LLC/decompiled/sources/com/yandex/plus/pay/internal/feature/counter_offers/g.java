package com.yandex.plus.pay.internal.feature.counter_offers;

import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.c2;
import com.yandex.plus.pay.data.mb.dto.j3;
import com.yandex.plus.pay.data.mb.dto.q1;
import com.yandex.plus.pay.data.mb.dto.r1;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.internal.model.mappers.j;
import defpackage.cg6;
import defpackage.inr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class g {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.core.locale.a b;
    public final kotlinx.coroutines.a c;
    public final com.yandex.plus.pay.log.impl.b d;

    public g(ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.core.locale.a aVar, kotlinx.coroutines.a aVar2, com.yandex.plus.pay.log.impl.b bVar) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.a = externalMediaBillingApi;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, String str2, String str3, ArrayList arrayList) {
        e eVar;
        int i;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.j;
                nm6 nm6Var = nm6.a;
                i = eVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    inr inrVar = new inr(this, arrayList, str, str2, str3, null, 28);
                    eVar2.l = 1;
                    obj = x97.V(this.c, inrVar, eVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r1 r1Var = (r1) ((com.yandex.plus.pay.common.api.utils.b) obj).a;
                r1Var.getClass();
                j3 j3Var = r1Var.d;
                PlusPayRichText a = j3Var == null ? j.a(j3Var) : null;
                j3 j3Var2 = r1Var.e;
                PlusPayRichText a2 = j3Var2 == null ? j.a(j3Var2) : null;
                List<q1> list = r1Var.f;
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                for (q1 q1Var : list) {
                    PlusPayCompositeOffers.Offer a3 = com.yandex.plus.pay.internal.model.mappers.b.a(q1Var.a, r1Var.a, r1Var.c, r1Var.b);
                    PlusPayRichText a4 = j.a(q1Var.b);
                    List list2 = q1Var.c;
                    ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(j.a((j3) it.next()));
                    }
                    String str4 = q1Var.d;
                    String str5 = q1Var.e;
                    c2 c2Var = q1Var.f;
                    arrayList2.add(new PlusPayCounterOffers.CounterOffer(a3, a4, arrayList3, str4, str5, new y(c2Var.a, c2Var.b)));
                }
                j3 j3Var3 = r1Var.g;
                PlusPayRichText a5 = j3Var3 == null ? j.a(j3Var3) : null;
                j3 j3Var4 = r1Var.h;
                return new PlusPayCounterOffers(a, a2, arrayList2, a5, j3Var4 != null ? j.a(j3Var4) : null);
            }
        }
        eVar = new e(this, cg6Var);
        e eVar22 = eVar;
        Object obj2 = eVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar22.l;
        if (i != 0) {
        }
        r1 r1Var2 = (r1) ((com.yandex.plus.pay.common.api.utils.b) obj2).a;
        r1Var2.getClass();
        j3 j3Var5 = r1Var2.d;
        if (j3Var5 == null) {
        }
        j3 j3Var22 = r1Var2.e;
        if (j3Var22 == null) {
        }
        List<q1> list3 = r1Var2.f;
        ArrayList arrayList22 = new ArrayList(v75.o(list3, 10));
        while (r2.hasNext()) {
        }
        j3 j3Var32 = r1Var2.g;
        if (j3Var32 == null) {
        }
        j3 j3Var42 = r1Var2.h;
        return new PlusPayCounterOffers(a, a2, arrayList22, a5, j3Var42 != null ? j.a(j3Var42) : null);
    }
}
