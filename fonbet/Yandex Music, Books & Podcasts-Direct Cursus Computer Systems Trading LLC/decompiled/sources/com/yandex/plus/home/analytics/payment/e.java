package com.yandex.plus.home.analytics.payment;

import com.appsflyer.internal.k;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g;
import defpackage.b6e;
import defpackage.omb;
import defpackage.tkb;
import defpackage.wkb;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class e extends com.yandex.plus.bdui.plus.analytics.b {
    public final omb a;
    public final boolean b;

    public e(omb ombVar, boolean z) {
        ombVar.getClass();
        this.a = ombVar;
        this.b = z;
    }

    public final void R(g gVar, f fVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar, String str, List list) {
        fVar.getClass();
        list.getClass();
        int ordinal = gVar.ordinal();
        boolean z = this.b;
        omb ombVar = this.a;
        if (ordinal == 0) {
            wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
            tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar);
            String str2 = str == null ? "no_value" : str;
            ombVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", "no_value");
            linkedHashMap.put("purchase_type", I.a);
            linkedHashMap.put("purchase_button", G.a);
            linkedHashMap.put("product_id", str2);
            k.z(linkedHashMap, "options_id", list, false, "is_one_click_payment");
            linkedHashMap.put("is_tarifficator", String.valueOf(z));
            HashMap hashMap = new HashMap();
            k.w("version", 1, hashMap, "Payment");
            linkedHashMap.put("_meta", omb.a(1, hashMap));
            ombVar.d("PlusHome.BuySubscription.Success", linkedHashMap);
            return;
        }
        if (ordinal != 1) {
            b6e.s();
            return;
        }
        wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
        tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar);
        String str3 = str == null ? "no_value" : str;
        ombVar.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("purchase_session_id", "no_value");
        linkedHashMap2.put("purchase_type", I2.a);
        linkedHashMap2.put("purchase_button", G2.a);
        linkedHashMap2.put("product_id", str3);
        k.z(linkedHashMap2, "options_id", list, false, "is_one_click_payment");
        linkedHashMap2.put("is_tarifficator", String.valueOf(z));
        HashMap hashMap2 = new HashMap();
        k.w("version", 1, hashMap2, "Payment");
        linkedHashMap2.put("_meta", omb.a(1, hashMap2));
        ombVar.d("PlusStories.BuySubscription.Success", linkedHashMap2);
    }
}
